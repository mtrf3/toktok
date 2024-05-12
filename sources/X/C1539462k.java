package X;

import com.ss.android.ugc.effectmanager.DownloadableModelSupportResourceFinder;
import com.ss.android.ugc.effectmanager.knadapt.UseKNPlatform;
import kotlin.jvm.internal.o;

/* renamed from: X.62k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1539462k {
    public static String LIZIZ() {
        String findResourceUri;
        String str = "";
        try {
            if (UseKNPlatform.enableKNPlatform) {
                findResourceUri = C84399XAl.LIZ().LIZLLL().realFindResourceUri(0, null, "lens_hdr");
                if (findResourceUri == null) {
                    findResourceUri = "";
                }
            } else {
                findResourceUri = DownloadableModelSupportResourceFinder.findResourceUri(null, "lens_hdr");
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("hdr model raw path: ");
            LIZ.append(findResourceUri);
            H78.LIZIZ("hdr_lens", X1D.LIZIZ(LIZ));
            o.LJIIIIZZ(findResourceUri, "{\n            val path =…           path\n        }");
            str = findResourceUri;
            return str;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return str;
        }
    }

    public static boolean LIZ() {
        boolean z;
        String LIZIZ = LIZIZ();
        boolean z2 = true;
        if (LIZIZ.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            H78.LIZIZ("hdr_lens", "hdr model path empty");
            return false;
        }
        if (ujb.o.LJJJLIIL(LIZIZ, "asset://", false)) {
            H78.LIZIZ("hdr_lens", "hdr model not found");
            return false;
        }
        if (C00F.LIZ(31744, 0, "tool_hdr_strategy", true) == 0) {
            z2 = false;
        }
        return z2;
    }
}
