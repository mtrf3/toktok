package X;

import android.graphics.drawable.Animatable;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;

/* renamed from: X.SFu, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71798SFu implements InterfaceC70769Rq1 {
    public final /* synthetic */ InterfaceC70769Rq1 LJLIL;
    public final /* synthetic */ C71799SFv LJLILLLLZI;

    @Override // X.InterfaceC70769Rq1
    public final void LJLLLLLL(android.net.Uri uri) {
        InterfaceC70769Rq1 interfaceC70769Rq1 = this.LJLIL;
        if (interfaceC70769Rq1 != null) {
            interfaceC70769Rq1.LJLLLLLL(uri);
        }
    }

    public C71798SFu(InterfaceC70769Rq1 interfaceC70769Rq1, C71799SFv c71799SFv) {
        this.LJLIL = interfaceC70769Rq1;
        this.LJLILLLLZI = c71799SFv;
    }

    @Override // X.InterfaceC70769Rq1
    public final void D1(android.net.Uri uri, C2047581v c2047581v) {
        InterfaceC70769Rq1 interfaceC70769Rq1 = this.LJLIL;
        if (interfaceC70769Rq1 != null) {
            interfaceC70769Rq1.D1(uri, c2047581v);
        }
    }

    @Override // X.InterfaceC70769Rq1
    public final void LLZZJLIL(android.net.Uri uri, Throwable th) {
        InterfaceC70769Rq1 interfaceC70769Rq1 = this.LJLIL;
        if (interfaceC70769Rq1 != null) {
            interfaceC70769Rq1.LLZZJLIL(uri, th);
        }
    }

    @Override // X.InterfaceC70769Rq1
    public final void T1(android.net.Uri uri, SmartImageView smartImageView) {
        InterfaceC70769Rq1 interfaceC70769Rq1 = this.LJLIL;
        if (interfaceC70769Rq1 != null) {
            interfaceC70769Rq1.T1(uri, smartImageView);
        }
        C71799SFv c71799SFv = this.LJLILLLLZI;
        c71799SFv.LJZL = 0;
        c71799SFv.LJIIJJI();
    }

    @Override // X.InterfaceC70769Rq1
    public final void s2(android.net.Uri uri, View view, Throwable th) {
        InterfaceC70769Rq1 interfaceC70769Rq1 = this.LJLIL;
        if (interfaceC70769Rq1 != null) {
            interfaceC70769Rq1.s2(uri, view, th);
        }
        C71799SFv c71799SFv = this.LJLILLLLZI;
        c71799SFv.LJZL = 1;
        c71799SFv.LJIIJJI();
    }

    @Override // X.InterfaceC70769Rq1
    public final void U0(android.net.Uri uri, View view, C2047581v c2047581v, Animatable animatable) {
        InterfaceC70769Rq1 interfaceC70769Rq1 = this.LJLIL;
        if (interfaceC70769Rq1 != null) {
            interfaceC70769Rq1.U0(uri, view, c2047581v, animatable);
        }
        C71799SFv c71799SFv = this.LJLILLLLZI;
        c71799SFv.LJZL = 2;
        c71799SFv.LJIIJJI();
    }
}
