package X;

import com.bytedance.ies.nle.editor_jni.LogLevel;
import kotlin.jvm.internal.o;

/* renamed from: X.5Oo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C134225Oo {
    public static /* synthetic */ void LIZIZ(String str) {
        LIZ(LogLevel.LEVEL_INFO, str);
    }

    public static final void LIZ(LogLevel logLevel, String str) {
        o.LJIIIZ(logLevel, "logLevel");
        int i = C5O2.LIZ[logLevel.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("TemplateDownloadProcess ");
                    LIZ.append(str);
                    H78.LJII(X1D.LIZIZ(LIZ));
                    return;
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("TemplateDownloadProcess ");
                LIZ2.append(str);
                H78.LIZJ(X1D.LIZIZ(LIZ2));
                return;
            }
            FP1.LJ("TemplateDownloadProcess ", str);
            return;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("TemplateDownloadProcess ");
        LIZ3.append(str);
        H78.LJI(X1D.LIZIZ(LIZ3));
    }
}
