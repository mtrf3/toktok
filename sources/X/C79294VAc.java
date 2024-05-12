package X;

import ccb.t;
import java.lang.ref.WeakReference;

/* renamed from: X.VAc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C79294VAc implements VB8 {
    public final WeakReference<t> LIZ;

    public C79294VAc(t tVar) {
        this.LIZ = new WeakReference<>(tVar);
    }

    @Override // X.VB8
    public final void LIZ(String str, String str2, String str3, String str4, C79300VAi c79300VAi) {
        t tVar = this.LIZ.get();
        if (tVar == null || (str3 != null && str3.isEmpty())) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("videoLiveManager: ");
            LIZ.append(tVar);
            LIZ.append(C63832P3k.LIZ);
            LIZ.append(str3);
            X1D.LIZIZ(LIZ);
            C46496IMq.LIZIZ();
            return;
        }
        tVar.a = c79300VAi.LIZJ;
        tVar.c = c79300VAi.LJII;
        tVar.LLLF = c79300VAi.LJIIIIZZ;
        tVar.LLZZLLIL = c79300VAi.LJIIIZ;
        tVar.LLZZZIL = c79300VAi.LJIIJ;
        tVar.D6 = c79300VAi.LJIILJJIL;
        tVar.d1(str, str2, str3, str4);
    }
}
