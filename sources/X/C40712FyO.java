package X;

import android.webkit.WebResourceRequest;

/* renamed from: X.FyO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40712FyO extends AbstractC40713FyP {
    public InterfaceC37276Ek4<?> LJ;

    @Override // X.AbstractC40713FyP
    public final void LIZ() {
        C76800UCe c76800UCe;
        try {
            InterfaceC37276Ek4<?> interfaceC37276Ek4 = this.LJ;
            if (interfaceC37276Ek4 != null) {
                interfaceC37276Ek4.cancel();
                c76800UCe = C76800UCe.LIZ;
            } else {
                c76800UCe = null;
            }
            C3C5.m7constructorimpl(c76800UCe);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    public C40712FyO(String str, java.util.Map map) {
        super(str, map, null);
    }

    public C40712FyO(String str, java.util.Map<String, String> map, WebResourceRequest webResourceRequest) {
        super(str, map, webResourceRequest);
    }
}
