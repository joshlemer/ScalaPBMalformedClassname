package scalapberror

import com.google.openrtb.BidRequest
import org.apache.flink.api.common.typeinfo.TypeInformation
import org.apache.flink.api.scala._


object Main {

  def main(args: Array[String]): Unit = {
    println(classOf[BidRequest.Imp.Native])
    println(classOf[BidRequest.Imp.Native].getCanonicalName)
    println(implicitly[TypeInformation[BidRequest]])
  }

}
