package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.MPn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56763MPn extends C56906MVa implements MO7 {
    public final MO1 LJLIL;
    public final InterfaceC56771MPv LJLILLLLZI;
    public InterfaceC56810MRi LJLJI;

    @Override // X.MO7
    public final void LLIILII(MO5 type) {
        o.LJIIIZ(type, "type");
    }

    @Override // X.MO7
    public final void LLLZIIL(MO5 type) {
        o.LJIIIZ(type, "type");
    }

    @Override // X.MVV, X.ViewOnClickListenerC56908MVc
    public final boolean needLongClick() {
        return false;
    }

    @Override // X.MVV, X.ViewOnClickListenerC56908MVc
    public final void onAttached() {
        super.onAttached();
        if (!this.LJLILLLLZI.eo0()) {
            this.LJLILLLLZI.vl();
            C56760MPk.LIZJ("authorize_card_show", this.LJLILLLLZI.Aw());
        }
    }

    @Override // X.MO7
    public final void LLLLLLZZ(MO5 type) {
        o.LJIIIZ(type, "type");
        EnumC57165Mc5.CONTACTS.markAction();
        if (this.LJLILLLLZI.Aw() == EnumC56648MLc.BOTTOM) {
            C79081V1x.LJJJJ(MQX.LJLIL);
        }
        C56760MPk.LIZJ("find_friends", this.LJLILLLLZI.Aw());
    }

    @Override // X.ViewOnClickListenerC56908MVc, android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        InterfaceC56810MRi interfaceC56810MRi = this.LJLJI;
        if (interfaceC56810MRi != null) {
            interfaceC56810MRi.onItemLongClick(getLayoutPosition());
            return true;
        }
        return true;
    }

    @Override // X.ViewOnClickListenerC56908MVc
    public final void setItemClickListener(InterfaceC56810MRi interfaceC56810MRi) {
        this.LJLJI = interfaceC56810MRi;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56763MPn(MO1 delegateItemView, InterfaceC56771MPv viewModel) {
        super(delegateItemView.getContainer());
        o.LJIIIZ(delegateItemView, "delegateItemView");
        o.LJIIIZ(viewModel, "viewModel");
        this.LJLIL = delegateItemView;
        this.LJLILLLLZI = viewModel;
        delegateItemView.setActionListener(this);
        delegateItemView.LJIIJ();
        delegateItemView.setUFRSubscription(viewModel.qz());
        delegateItemView.setEnterFrom("notification_page");
        this.itemView.setOnLongClickListener(this);
        if (C53341Kwb.LIZ()) {
            MVR.LIZ(this.itemView, MVP.CELL, 0.0f);
        }
    }
}
