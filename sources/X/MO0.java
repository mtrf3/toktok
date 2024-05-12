package X;

import Y.IDCListenerS300S0100000_9;
import android.view.KeyEvent;
import com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MO0 extends MMX<C56689MMr> implements MO7 {
    public final MO1 LJLJLLL;
    public C73318Sq2 LJLL;

    @Override // X.MO7
    public final void LLLZIIL(MO5 type) {
        o.LJIIIZ(type, "type");
    }

    @Override // X.MMX
    public final void reportShowEvent() {
        MultiViewModel P = P();
        if (P.LLI) {
            return;
        }
        P.LLI = true;
        C56760MPk.LIZJ("authorize_card_show", EnumC56648MLc.TOP);
    }

    public MO0(MMY mmy) {
        super(mmy);
        KeyEvent.Callback contentView = mmy.getContentView();
        o.LJII(contentView, "null cannot be cast to non-null type com.ss.android.ugc.aweme.recommend.IPermissionItemView");
        MO1 mo1 = (MO1) contentView;
        this.LJLJLLL = mo1;
        mo1.LJIIJ();
        mo1.setActionListener(this);
        mo1.setEnterFrom("notification_page");
        MO2 callback = MO2.LJLIL;
        o.LJIIIZ(callback, "callback");
        this.LJLILLLLZI = callback;
        this.itemView.setOnLongClickListener(new IDCListenerS300S0100000_9(this, 3));
        if (C53341Kwb.LIZ()) {
            MVR.LIZ(mmy.getContentView(), MVP.CELL, 0.0f);
        }
    }

    @Override // X.MO7
    public final void LLIILII(MO5 type) {
        o.LJIIIZ(type, "type");
        P().pv0(N());
    }

    @Override // X.MO7
    public final void LLLLLLZZ(MO5 type) {
        o.LJIIIZ(type, "type");
        EnumC57165Mc5.CONTACTS.markAction();
        P();
        C56760MPk.LIZJ("find_friends", EnumC56648MLc.TOP);
    }

    @Override // X.MMX
    public final void T(C96533qb c96533qb) {
        this.LJLJLLL.LJJLIIIJ(c96533qb);
    }

    @Override // X.MMX
    public final void U(boolean z) {
        super.U(z);
        C73318Sq2 c73318Sq2 = new C73318Sq2();
        this.LJLL = c73318Sq2;
        this.LJLJLLL.setUFRSubscription(c73318Sq2);
    }

    @Override // X.MMX
    public final void V(C56689MMr c56689MMr) {
        super.V(c56689MMr);
        this.LJLJLLL.LJJIFFI(MO5.CONTACT, MO6.INBOX_NORMAL);
        this.LJLJLLL.setUFRExternalParams(C51029K0z.LJJIIZI(new OSZ("position", "top")));
    }

    @Override // X.MMX
    public final void Y(boolean z) {
        super.Y(z);
        C73318Sq2 c73318Sq2 = this.LJLL;
        if (c73318Sq2 != null) {
            c73318Sq2.dispose();
        } else {
            o.LJIJI("subscription");
            throw null;
        }
    }
}
