package X;

import com.ss.ttffmpeg.FFmpegLibLoaderWrapper;
import java.util.ArrayList;

/* loaded from: classes19.dex */
public final class ZUE extends C12360e8 {
    public static volatile boolean LIZIZ;

    static {
        new ArrayList();
    }

    public static void LIZ() {
        if (LIZIZ) {
            return;
        }
        C32771Qj.LIZ();
        ArrayList arrayList = new ArrayList();
        arrayList.add("bytevc0");
        arrayList.addAll(FFmpegLibLoaderWrapper.LIZIZ());
        arrayList.add("bvcparser");
        arrayList.add("ByteVC1_dec");
        arrayList.add("bytenn");
        arrayList.add("btch_collection");
        if (!C12350e7.LIZ(arrayList)) {
            LIZIZ = false;
        } else {
            LIZIZ = true;
        }
    }
}
