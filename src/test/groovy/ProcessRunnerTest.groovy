import spock.lang.Specification

class ProcessRunnerTest extends Specification {

  //it's ugly, I know

  def "invokes process"() {
    expect:
    new ProcessRunner(new File("."), ["gradle", "-i"], true).run()
  }

  def "invokes process silently"() {
    expect:
    new ProcessRunner(new File("."), ["gradle"], false).run()
  }
}
