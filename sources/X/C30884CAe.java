package X;

import android.webkit.WebView;

/* renamed from: X.CAe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30884CAe implements COJ {
    public WebView LJLIL;
    public InterfaceC30889CAj LJLILLLLZI;
    public InterfaceC30895CAp LJLJI;

    @Override // X.COJ
    public final void S2(Object obj, String str) {
        InterfaceC30889CAj interfaceC30889CAj = this.LJLILLLLZI;
        if (interfaceC30889CAj != null && interfaceC30889CAj.LIZIZ() != null) {
            C38113ExZ LIZIZ = this.LJLILLLLZI.LIZIZ();
            if (LIZIZ.LJFF) {
                IllegalStateException illegalStateException = new IllegalStateException("JsBridge2 is already released!!!");
                if (C1A7.LJLIL) {
                    throw illegalStateException;
                }
            }
            LIZIZ.LIZ.LJIILL(obj, str);
        }
    }

    public C30884CAe(O5Z o5z, C31886CfK c31886CfK, COO coo) {
        this.LJLIL = o5z;
        this.LJLILLLLZI = c31886CfK;
        this.LJLJI = coo;
    }
}
