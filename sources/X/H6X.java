package X;

import com.ss.android.vesdk.VEFileDownloader;
import java.util.Collections;
import java.util.HashMap;
import ujb.o;

/* loaded from: classes8.dex */
public final class H6X {
    public static final java.util.Map<String, VEFileDownloader> LIZ = Collections.synchronizedMap(new HashMap());
    public static String LIZIZ;

    static {
        C2VQ.LIZ(H6Y.LJLIL);
    }

    public static String LIZ(String str) {
        if (str == null || o.LJJJJJL(str)) {
            return null;
        }
        String LIZ2 = XPS.LIZLLL().LIZ();
        kotlin.jvm.internal.o.LJIIIIZZ(LIZ2, "getInstance().downloadDir");
        String filePathWithUrl = VEFileDownloader.getFilePathWithUrl(LIZ2, str);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("getFilePathWithUrl url=");
        LIZ3.append(str);
        LIZ3.append(" path=");
        LIZ3.append(filePathWithUrl);
        H78.LIZIZ("EditMusicStream", X1D.LIZIZ(LIZ3));
        return filePathWithUrl;
    }
}
