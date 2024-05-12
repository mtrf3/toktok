package X;

import android.content.Context;
import android.os.BaseBundle;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OZT implements OZ5 {
    public final /* synthetic */ OZS LIZ;
    public final /* synthetic */ InterfaceC62225ObV LIZIZ;

    public OZT(OZS ozs, InterfaceC62225ObV interfaceC62225ObV) {
        this.LIZ = ozs;
        this.LIZIZ = interfaceC62225ObV;
    }

    @Override // X.OZ5
    public final void LIZ(android.net.Uri uri, String str, boolean z) {
        C62313Ocv c62313Ocv;
        if (z) {
            if (str != null) {
                c62313Ocv = new C62313Ocv(OYF.LJFF(str), str, null, null, null, null, false, 252);
            } else {
                return;
            }
        } else {
            if (uri == null) {
                return;
            }
            String LIZIZ = C00S.LIZIZ(this.LIZ.getContext(), uri);
            o.LJIIIIZZ(LIZIZ, "convertUriToPath(context, it)");
            c62313Ocv = new C62313Ocv(uri, LIZIZ, null, null, null, null, false, 252);
        }
        OZS ozs = this.LIZ;
        InterfaceC62225ObV interfaceC62225ObV = this.LIZIZ;
        String key = interfaceC62225ObV.key();
        ozs.getClass();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", ozs.LJLJI);
        c188727au.LJIIIZ("qr_code_type", ozs.LJLILLLLZI);
        c188727au.LJIIIZ("platform", key);
        FMX.LJIIL("share_personal_qr_code", c188727au.LIZ);
        String str2 = c62313Ocv.LJFF;
        if (str2 == null) {
            str2 = "";
        }
        ((BaseBundle) c62313Ocv.LIZ).putString("content_url", str2);
        ((BaseBundle) c62313Ocv.LIZ).putString("media_type", "image/png");
        Context context = ozs.getContext();
        o.LJIIIIZZ(context, "context");
        interfaceC62225ObV.LJII(c62313Ocv, context, null);
    }
}
