package X;

import android.text.TextUtils;
import okhttp3.Request;

/* renamed from: X.PXw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64624PXw implements InterfaceC48121Iub {
    @Override // X.InterfaceC48121Iub
    public final C64598PWw intercept(PXZ pxz) {
        PW8 pw8 = (PW8) pxz;
        Request request = pw8.LJFF;
        C64626PXy url = request.url();
        if (url != null) {
            C40515FvD.LIZJ().getClass();
            if (!C40515FvD.LJ()) {
                try {
                    C40515FvD.LJII(url.LJFF(), false);
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
            C64627PXz LJIIJ = url.LJIIJ();
            for (String str : C40515FvD.LIZJ) {
                String LJIILL = url.LJIILL(str);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("sec_");
                LIZ.append(str);
                if (TextUtils.isEmpty(url.LJIILL(X1D.LIZIZ(LIZ)))) {
                    String LIZLLL = C40515FvD.LIZJ().LIZLLL(LJIILL);
                    if (!TextUtils.isEmpty(LIZLLL)) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("sec_");
                        LIZ2.append(str);
                        LJIIJ.LJIIIIZZ(X1D.LIZIZ(LIZ2), LIZLLL);
                    }
                }
            }
            C64618PXq newBuilder = request.newBuilder();
            newBuilder.LJII(LJIIJ.LIZJ().LJIIIIZZ);
            request = newBuilder.LIZIZ();
        }
        return pw8.LIZ(request);
    }
}
