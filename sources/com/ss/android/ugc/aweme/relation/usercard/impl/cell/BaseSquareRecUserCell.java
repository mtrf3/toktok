package com.ss.android.ugc.aweme.relation.usercard.impl.cell;

import X.AbstractC029409q;
import X.C110614Vt;
import X.C16880lQ;
import X.C26338AVi;
import X.C27484AqW;
import X.C32151Nz;
import X.C57820Mme;
import X.C57826Mmk;
import X.C57846Mn4;
import X.C58049MqL;
import X.C58050MqM;
import X.C71313Ryn;
import X.C7MY;
import X.C9AC;
import X.C9AE;
import X.O6R;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import com.ss.android.ugc.aweme.relation.usercard.cell.BasePowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.o;
import q03.IDaS487S0100000_9;

/* loaded from: classes10.dex */
public abstract class BaseSquareRecUserCell<ITEM extends C57826Mmk> extends AbsRecUserCell<ITEM> {
    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final int V() {
        return R.layout.cak;
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.cell.BasePowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C9AE.LIZ(this.itemView.findViewById(R.id.c66), C9AC.ALPHA, 0.0f);
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final void g0(RecUser user, C57846Mn4 uiConfig) {
        o.LJIIIZ(uiConfig, "uiConfig");
        o.LJIIIZ(user, "user");
        View findViewById = this.itemView.findViewById(R.id.le3);
        o.LJII(findViewById, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView");
        U((SmartAvatarImageView) findViewById, new AqS156S0200000_9(user, uiConfig, 97));
        View findViewById2 = this.itemView.findViewById(R.id.le3);
        o.LJIIIIZZ(findViewById2, "itemView.top_area_layout");
        C26338AVi.LJI(findViewById2, null, Integer.valueOf(uiConfig.LJJIIZI), null, null, false, 29);
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final void h0(RecUser user, C57846Mn4 uiConfig) {
        int i;
        o.LJIIIZ(uiConfig, "uiConfig");
        o.LJIIIZ(user, "user");
        View findViewById = this.itemView.findViewById(R.id.aop);
        o.LJII(findViewById, "null cannot be cast to non-null type com.ss.android.ugc.aweme.relation.follow.ui.RelationButton");
        RelationButton relationButton = (RelationButton) findViewById;
        m0(relationButton, user, uiConfig, false);
        C26338AVi.LJI(relationButton, null, null, null, Integer.valueOf(uiConfig.LJJIJ), false, 23);
        ImageView deleteIconView = (ImageView) this.itemView.findViewById(R.id.c66);
        o.LJIIIIZZ(deleteIconView, "deleteIconView");
        int i2 = uiConfig.LIZLLL;
        if (i2 != 203 && i2 != 200) {
            i = 0;
        } else {
            i = 8;
        }
        deleteIconView.setVisibility(i);
        if (deleteIconView.getVisibility() == 0) {
            C16880lQ.LJIIJ(new IDaS487S0100000_9(this, 4), deleteIconView);
        }
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final void i0(C57846Mn4 uiConfig, ITEM item) {
        o.LJIIIZ(uiConfig, "uiConfig");
        o.LJIIIZ(item, "item");
        super.i0(uiConfig, item);
        if (this.itemView.getBackground() != null) {
            return;
        }
        View view = this.itemView;
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.cv);
        c110614Vt.LIZJ = Float.valueOf(BasePowerCell.N());
        C71313Ryn.LIZIZ(this.itemView, "itemView.context", c110614Vt, view);
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final void l0(RecUser user, C57846Mn4 uiConfig) {
        o.LJIIIZ(uiConfig, "uiConfig");
        o.LJIIIZ(user, "user");
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.h19);
        o.LJIIIIZZ(tuxTextView, "itemView.nickNameView");
        C57820Mme.LIZIZ(user, tuxTextView);
        MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
        if (matchedFriendStruct != null) {
            this.itemView.findViewById(R.id.iuj).setVisibility(0);
            ((C58049MqL) this.itemView.findViewById(R.id.iuj)).LJJJJ(matchedFriendStruct, C58050MqM.LIZLLL);
        }
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final void o0(RecUser user, C57846Mn4 uiConfig) {
        int i;
        o.LJIIIZ(uiConfig, "uiConfig");
        o.LJIIIZ(user, "user");
        int bindingAdapterPosition = getBindingAdapterPosition();
        AbstractC029409q<? extends RecyclerView.ViewHolder> bindingAdapter = getBindingAdapter();
        if (bindingAdapter != null) {
            i = bindingAdapter.getItemCount();
        } else {
            i = 0;
        }
        if (bindingAdapterPosition < i - 1) {
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C26338AVi.LJI(itemView, null, null, Integer.valueOf(uiConfig.LJIIJJI), null, false, 27);
        } else {
            View itemView2 = this.itemView;
            o.LJIIIIZZ(itemView2, "itemView");
            C26338AVi.LJI(itemView2, null, null, 0, null, false, 27);
        }
        if (uiConfig.LJJIJIL) {
            C27484AqW.LIZLLL((TuxIconView) this.itemView.findViewById(R.id.c66), C7MY.LIZIZ(8), C7MY.LIZIZ(8), C7MY.LIZIZ(8), O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)));
        }
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final void p0(RecUser user, C57846Mn4 uiConfig) {
        o.LJIIIZ(uiConfig, "uiConfig");
        o.LJIIIZ(user, "user");
        ((TuxTextView) this.itemView.findViewById(R.id.h19)).setTextColorRes(R.attr.go);
        ((TuxIconView) this.itemView.findViewById(R.id.c66)).setTintColorRes(R.attr.gx);
    }
}
