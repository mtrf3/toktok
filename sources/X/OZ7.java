package X;

import android.content.Context;
import android.os.BaseBundle;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OZ7 implements OZ5 {
    public final /* synthetic */ Context LIZ;
    public final /* synthetic */ InterfaceC62225ObV LIZIZ;

    public OZ7(Context context, InterfaceC62225ObV interfaceC62225ObV) {
        this.LIZ = context;
        this.LIZIZ = interfaceC62225ObV;
    }

    @Override // X.OZ5
    public final void LIZ(android.net.Uri uri, String str, boolean z) {
        C62313Ocv c62313Ocv;
        C62313Ocv c62313Ocv2;
        InterfaceC62573Oh7 interfaceC62573Oh7 = null;
        if (z) {
            if (str != null) {
                c62313Ocv = c62313Ocv2;
                c62313Ocv2 = new C62313Ocv(OYF.LJFF(str), str, null, null, null, null, false, 252);
            } else {
                return;
            }
        } else {
            if (uri == null) {
                return;
            }
            String LIZIZ = C00S.LIZIZ(this.LIZ, uri);
            o.LJIIIIZZ(LIZIZ, "convertUriToPath(context, it)");
            interfaceC62573Oh7 = null;
            c62313Ocv = new C62313Ocv(uri, LIZIZ, null, null, null, null, false, 252);
            c62313Ocv2 = c62313Ocv;
        }
        InterfaceC62225ObV interfaceC62225ObV = this.LIZIZ;
        Context context = this.LIZ;
        String str2 = c62313Ocv.LJFF;
        if (str2 == null) {
            str2 = "";
        }
        ((BaseBundle) c62313Ocv2.LIZ).putString("content_url", str2);
        ((BaseBundle) c62313Ocv2.LIZ).putString("media_type", "image/png");
        interfaceC62225ObV.LJII(c62313Ocv2, context, interfaceC62573Oh7);
    }
}
