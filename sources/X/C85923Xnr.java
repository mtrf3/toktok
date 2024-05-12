package X;

import Y.ACListenerS35S0100000_15;
import android.view.LayoutInflater;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushItem;
import kotlin.jvm.internal.o;

/* renamed from: X.Xnr, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85923Xnr extends AbstractC85929Xnx implements InterfaceC85903XnX, InterfaceC85953XoL {
    public final PushItem LJLJJLL;
    public final LayoutInflater LJLJL;
    public C85897XnR LJLJLJ;

    @Override // X.InterfaceC85903XnX
    public final void LLJJ() {
    }

    @Override // X.InterfaceC85903XnX
    public final void vx() {
    }

    @Override // X.C25860ACy
    /* renamed from: LJIIJJI */
    public final C25859ACx LJIIIIZZ() {
        C85897XnR c85897XnR = new C85897XnR();
        this.LJLJLJ = c85897XnR;
        c85897XnR.LJLILLLLZI = this;
        c85897XnR.LJLJI = false;
        ACListenerS35S0100000_15 aCListenerS35S0100000_15 = new ACListenerS35S0100000_15(this, 194);
        return new C25859ACx(this.LJLJJLL.display.title, LJIILJJIL(), aCListenerS35S0100000_15, null, C85919Xnn.LIZ(this.LJLJJL), null, null, null, false, false, null, this.LJLJJLL.display.description, LJIILL(), false, aCListenerS35S0100000_15, null, null, 8343528);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85923Xnr(PushItem pushItem, LayoutInflater layoutInflater) {
        super(pushItem);
        o.LJIIIZ(pushItem, "pushItem");
        this.LJLJJLL = pushItem;
        this.LJLJL = layoutInflater;
    }

    @Override // X.InterfaceC85953XoL
    public final void LIZ(int i, String itemId) {
        o.LJIIIZ(itemId, "itemId");
        C85940Xo8.LIZIZ.LIZ(i, itemId);
        C85897XnR c85897XnR = this.LJLJLJ;
        if (c85897XnR != null) {
            c85897XnR.LJIILL(itemId, Integer.valueOf(i));
        }
        C85934Xo2.LIZIZ(i, itemId);
    }
}
