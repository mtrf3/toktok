package X;

import android.webkit.WebResourceRequest;

/* renamed from: X.FyQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40714FyQ extends AbstractC40713FyP {
    public final C61296O3w LJ;
    public InterfaceC37276Ek4<? extends Object> LJFF;

    @Override // X.AbstractC40713FyP
    public final void LIZ() {
        InterfaceC37276Ek4<? extends Object> interfaceC37276Ek4 = this.LJFF;
        if (interfaceC37276Ek4 != null) {
            interfaceC37276Ek4.cancel();
        }
    }

    public C40714FyQ(String str, java.util.Map<String, String> map, WebResourceRequest webResourceRequest, C61296O3w c61296O3w) {
        super(str, map, webResourceRequest);
        this.LJ = c61296O3w;
    }
}
