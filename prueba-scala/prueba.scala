
import org.opencv.core._

object prueba extends App{

    println( System.getProperties.get( "java.library.path" ) )

    System.loadLibrary(Core.NATIVE_LIBRARY_NAME)

    var m = new Mat(5, 10, CvType.CV_8UC1, new Scalar(0));

    println("OpenCV Mat: " + m);
    val mr1 = m.row(1);
    mr1.setTo(new Scalar(1));
    val mc5 = m.col(5);
    mc5.setTo(new Scalar(5));
    println("OpenCV Mat data:\n" + m.dump());
}
