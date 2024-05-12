package com.ss.android.ugc.aweme.relation.usercard.impl.cell;

import X.C06460Ne;
import X.C110614Vt;
import X.C16880lQ;
import X.C26338AVi;
import X.C27484AqW;
import X.C32151Nz;
import X.C53341Kwb;
import X.C57820Mme;
import X.C57826Mmk;
import X.C57846Mn4;
import X.C58049MqL;
import X.C58050MqM;
import X.C78897Uxp;
import X.C9AC;
import X.C9AE;
import X.EnumC57435MgR;
import X.O6R;
import Y.ACListenerS44S0200000_9;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
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
public final class MultiColSquareRecUserCell<ITEM extends C57826Mmk> extends AbsRecUserCell<C57826Mmk> {
    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final int V() {
        return R.layout.caa;
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.cell.BasePowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C9AE.LIZ(this.itemView.findViewById(R.id.c66), C9AC.ALPHA, 0.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final void a0(EnumC57435MgR followStatus) {
        o.LJIIIZ(followStatus, "followStatus");
        super.a0(followStatus);
        C57826Mmk c57826Mmk = (C57826Mmk) getItem();
        if (c57826Mmk == null) {
            return;
        }
        RecUser recUser = c57826Mmk.LJLJI;
        C57846Mn4 c57846Mn4 = c57826Mmk.LJLILLLLZI;
        if (recUser.getFollowStatus() != 0 && c57846Mn4.LIZJ) {
            View findViewById = this.itemView.findViewById(R.id.aop);
            o.LJII(findViewById, "null cannot be cast to non-null type com.ss.android.ugc.aweme.relation.follow.ui.RelationButton");
            TuxTextView tuxTextView = (TuxTextView) findViewById;
            tuxTextView.setTextColorRes(R.attr.dj);
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.d1);
            c110614Vt.LIZJ = Float.valueOf(BasePowerCell.N());
            Context context = this.itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            tuxTextView.setBackground(c110614Vt.LIZ(context));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final void g0(RecUser user, C57846Mn4 uiConfig) {
        C57826Mmk c57826Mmk;
        o.LJIIIZ(uiConfig, "uiConfig");
        o.LJIIIZ(user, "user");
        View findViewById = this.itemView.findViewById(R.id.le3);
        o.LJII(findViewById, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView");
        U((SmartAvatarImageView) findViewById, new AqS156S0200000_9(user, uiConfig, 100));
        View findViewById2 = this.itemView.findViewById(R.id.le3);
        o.LJIIIIZZ(findViewById2, "itemView.top_area_layout");
        C26338AVi.LJI(findViewById2, null, Integer.valueOf(uiConfig.LJJIIZI), null, null, false, 29);
        if (C53341Kwb.LIZ() && (c57826Mmk = (C57826Mmk) getItem()) != null) {
            View findViewById3 = this.itemView.findViewById(R.id.le3);
            o.LJII(findViewById3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView");
            C16880lQ.LJJJJL((SmartAvatarImageView) findViewById3, new ACListenerS44S0200000_9(c57826Mmk, this, 38));
            View findViewById4 = this.itemView.findViewById(R.id.le3);
            o.LJII(findViewById4, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView");
            C78897Uxp.LJJJJL(findViewById4, C32151Nz.LJIIZILJ(48));
        }
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final void h0(RecUser user, C57846Mn4 uiConfig) {
        o.LJIIIZ(uiConfig, "uiConfig");
        o.LJIIIZ(user, "user");
        View findViewById = this.itemView.findViewById(R.id.aop);
        o.LJII(findViewById, "null cannot be cast to non-null type com.ss.android.ugc.aweme.relation.follow.ui.RelationButton");
        RelationButton relationButton = (RelationButton) findViewById;
        m0(relationButton, user, uiConfig, false);
        C26338AVi.LJI(relationButton, null, null, null, Integer.valueOf(uiConfig.LJJIJ), false, 23);
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.c66);
        imageView.setVisibility(0);
        C16880lQ.LJIIJ(new IDaS487S0100000_9(this, 6), imageView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final void i0(C57846Mn4 uiConfig, C57826Mmk item) {
        Drawable LIZ;
        o.LJIIIZ(uiConfig, "uiConfig");
        o.LJIIIZ(item, "item");
        super.i0(uiConfig, item);
        if (this.itemView.getBackground() != null) {
            return;
        }
        View view = this.itemView;
        if (uiConfig.LIZJ) {
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.d2);
            c110614Vt.LIZJ = Float.valueOf(BasePowerCell.N());
            LIZ = C06460Ne.LIZ(this.itemView, "itemView.context", c110614Vt);
        } else {
            C110614Vt c110614Vt2 = new C110614Vt();
            c110614Vt2.LIZIZ = Integer.valueOf(R.attr.cv);
            c110614Vt2.LIZJ = Float.valueOf(BasePowerCell.N());
            LIZ = C06460Ne.LIZ(this.itemView, "itemView.context", c110614Vt2);
        }
        view.setBackground(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final void l0(RecUser user, C57846Mn4 uiConfig) {
        C57826Mmk c57826Mmk;
        o.LJIIIZ(uiConfig, "uiConfig");
        o.LJIIIZ(user, "user");
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.h19);
        o.LJIIIIZZ(tuxTextView, "itemView.nickNameView");
        C57820Mme.LIZIZ(user, tuxTextView);
        if (C53341Kwb.LIZ() && (c57826Mmk = (C57826Mmk) getItem()) != null) {
            C16880lQ.LJJJJI((TuxTextView) this.itemView.findViewById(R.id.h19), new ACListenerS44S0200000_9(c57826Mmk, this, 39));
            View findViewById = this.itemView.findViewById(R.id.h19);
            o.LJIIIIZZ(findViewById, "itemView.nickNameView");
            C78897Uxp.LJJJJLI(findViewById, null);
        }
        MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
        if (matchedFriendStruct != null) {
            this.itemView.findViewById(R.id.iuj).setVisibility(0);
            ((C58049MqL) this.itemView.findViewById(R.id.iuj)).LJJJJ(matchedFriendStruct, C58050MqM.LIZLLL);
        }
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final void n0(RecUser user, C57846Mn4 uiConfig) {
        o.LJIIIZ(uiConfig, "uiConfig");
        o.LJIIIZ(user, "user");
        View findViewById = this.itemView.findViewById(R.id.aop);
        o.LJII(findViewById, "null cannot be cast to non-null type com.ss.android.ugc.aweme.relation.follow.ui.RelationButton");
        View findViewById2 = this.itemView.findViewById(R.id.le3);
        o.LJII(findViewById2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView");
        AbsRecUserCell.f0((SmartAvatarImageView) findViewById2, O6R.LJJIIZ(C32151Nz.LJIIZILJ(96)));
        C27484AqW.LJI(findViewById, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(90))), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(28))));
        C9AE.LIZ(this.itemView, C9AC.SCALE, 0.0f);
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final void o0(RecUser user, C57846Mn4 uiConfig) {
        o.LJIIIZ(uiConfig, "uiConfig");
        o.LJIIIZ(user, "user");
        C27484AqW.LIZLLL((TuxIconView) this.itemView.findViewById(R.id.c66), O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)));
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell
    public final void p0(RecUser user, C57846Mn4 uiConfig) {
        o.LJIIIZ(uiConfig, "uiConfig");
        o.LJIIIZ(user, "user");
        if (uiConfig.LIZJ) {
            ((TuxTextView) this.itemView.findViewById(R.id.h19)).setTextColorRes(R.attr.dj);
            ((TuxTextView) this.itemView.findViewById(R.id.iuj)).setTextColorRes(R.attr.dm);
            ((TuxIconView) this.itemView.findViewById(R.id.c66)).setTintColorRes(R.attr.dm);
        } else {
            ((TuxTextView) this.itemView.findViewById(R.id.h19)).setTextColorRes(R.attr.go);
            ((TuxTextView) this.itemView.findViewById(R.id.iuj)).setTextColorRes(R.attr.gx);
        }
        C9AE.LIZ(this.itemView.findViewById(R.id.c66), C9AC.ALPHA, 0.0f);
    }
}
