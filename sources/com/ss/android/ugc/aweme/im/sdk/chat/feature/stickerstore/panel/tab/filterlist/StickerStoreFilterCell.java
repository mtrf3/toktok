package com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.tab.filterlist;

import X.C16880lQ;
import X.C1DI;
import X.C214298b3;
import X.C221108m2;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72350SaQ;
import X.C72351SaR;
import X.C72352SaS;
import X.C72353SaT;
import X.C72354SaU;
import X.C91243i4;
import X.C94313n1;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.EnumC87143bS;
import X.InterfaceC65350Pko;
import X.InterfaceC65784Pro;
import X.InterfaceC93923mO;
import X.YE1;
import Y.ACListenerS21S0100000_1;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.tab.viewmodel.StickerStoreTabViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class StickerStoreFilterCell extends PowerCell<C91243i4> {
    public final C214298b3 LJLIL;
    public final C62822Ol8 LJLILLLLZI;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        C16880lQ.LJIIJ(new ACListenerS21S0100000_1(this, 60), this.itemView);
    }

    public StickerStoreFilterCell() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(StickerStoreTabViewModel.class);
        AqS151S0100000_1 aqS151S0100000_1 = new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 272);
        C94313n1 c94313n1 = C94313n1.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS151S0100000_1, C72353SaT.INSTANCE, new AqS151S0100000_1((InterfaceC93923mO) this, 273), new AqS162S0100000_12(this, 601), C72351SaR.INSTANCE, c94313n1, new AqS162S0100000_12(this, 602), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS151S0100000_1, C72354SaU.INSTANCE, new AqS151S0100000_1((InterfaceC93923mO) this, 274), new AqS151S0100000_1((InterfaceC93923mO) this, 268), C72350SaQ.INSTANCE, c94313n1, new AqS162S0100000_12(this, 600), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS151S0100000_1, C72352SaS.INSTANCE, new AqS151S0100000_1((InterfaceC93923mO) this, 269), new AqS151S0100000_1((InterfaceC93923mO) this, 270), new AqS151S0100000_1((InterfaceC93923mO) this, 271), c94313n1, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLIL = c214298b3;
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 267));
    }

    public final String L(int i) {
        if (i == EnumC87143bS.TOP.getType()) {
            return this.itemView.getContext().getString(R.string.roe);
        }
        if (i == EnumC87143bS.TRENDING_VIDEOS.getType()) {
            return this.itemView.getContext().getString(R.string.rof);
        }
        if (i == EnumC87143bS.NEW.getType()) {
            return this.itemView.getContext().getString(R.string.rob);
        }
        if (i == EnumC87143bS.ALL.getType()) {
            return this.itemView.getContext().getString(R.string.ro9);
        }
        if (i == EnumC87143bS.ADDED.getType()) {
            return this.itemView.getContext().getString(R.string.ro7);
        }
        return null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C91243i4 c91243i4) {
        C91243i4 t = c91243i4;
        o.LJIIIZ(t, "t");
        View view = this.itemView;
        if (t.LJLILLLLZI) {
            view.setBackgroundResource(R.drawable.bhp);
        } else {
            view.setBackgroundResource(R.drawable.bhq);
        }
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-filterName>(...)");
        TuxTextView tuxTextView = (TuxTextView) value;
        if (t.LJLILLLLZI) {
            tuxTextView.setText(L(t.LJLIL));
            tuxTextView.setTextColorRes(R.attr.go);
            tuxTextView.setTuxFont(63);
        } else {
            tuxTextView.setText(L(t.LJLIL));
            tuxTextView.setTextColorRes(R.attr.gx);
            tuxTextView.setTuxFont(62);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.b6_, viewGroup, false, "from(parent.context)\n   …re_filter, parent, false)");
    }
}
