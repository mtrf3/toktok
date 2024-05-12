package X;

import Y.IDcS136S0200000_10;
import com.bytedance.im.core.proto.NewMessageNotify;

/* renamed from: X.OrD, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63199OrD implements InterfaceC63353Oth<C63196OrA> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ NewMessageNotify LJLILLLLZI;
    public final /* synthetic */ C63192Or6 LJLJI;

    @Override // X.InterfaceC63353Oth
    public final void LIZLLL(C63196OrA c63196OrA) {
        C63196OrA c63196OrA2 = c63196OrA;
        C63322OtC.LJFF("NewMsgNotifyHandler notifyNormalByRecentLink onCallback");
        if (c63196OrA2.LIZIZ) {
            C63356Otk LJIIIZ = C63356Otk.LJIIIZ();
            int i = this.LJLIL;
            LJIIIZ.getClass();
            if (!C63308Osy.LJI().LIZLLL().LJZI && C63356Otk.LIZIZ(1, i, 2, "pullRecentMessage")) {
                new C63301Osr(i, null).LJIILLIIL(2);
            }
        } else if (c63196OrA2.LIZJ && c63196OrA2.LJFF != null) {
            C63120Opw c63120Opw = c63196OrA2.LJI;
            if (c63120Opw != null && c63120Opw.isReadBadgeCountUpdated()) {
                this.LJLJI.getClass();
                C63192Or6.LJIILLIIL(c63196OrA2);
            } else if (!C63308Osy.LJI().LIZLLL().LJJJZ) {
                new C63217OrV().LJIILJJIL(this.LJLIL, this.LJLILLLLZI.badge_count.intValue(), c63196OrA2.LJFF);
            } else {
                new C63217OrV(new IDcS136S0200000_10(c63196OrA2, this, 0)).LJIILJJIL(this.LJLIL, this.LJLILLLLZI.badge_count.intValue(), c63196OrA2.LJFF);
            }
        }
        C63269OsL.LIZLLL(false);
    }

    public C63199OrD(int i, C63192Or6 c63192Or6, NewMessageNotify newMessageNotify) {
        this.LJLJI = c63192Or6;
        this.LJLIL = i;
        this.LJLILLLLZI = newMessageNotify;
    }
}
