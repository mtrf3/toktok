package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureHandler;
import defpackage.a1;
import java.io.File;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H90 {
    public static String LIZ(String fileName) {
        o.LJIIIZ(fileName, "fileName");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(AIGCPictureHandler.pathService$delegate.getValue().LJ);
        String str = File.separator;
        LIZ.append(str);
        LIZ.append("AIGC");
        String LIZIZ = X1D.LIZIZ(LIZ);
        C44687HgJ.LJFF(LIZIZ, false);
        return a1.LJ(LIZIZ, str, fileName);
    }
}
