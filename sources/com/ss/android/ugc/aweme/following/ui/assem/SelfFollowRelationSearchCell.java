package com.ss.android.ugc.aweme.following.ui.assem;

import X.C16880lQ;
import X.C57807MmR;
import X.C9AC;
import X.C9AE;
import Y.ACListenerS44S0200000_9;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS191S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class SelfFollowRelationSearchCell extends RelationSearchCell<C57807MmR> {
    public TuxIconView LJLJLJ;

    @Override // com.ss.android.ugc.aweme.following.ui.assem.RelationSearchCell
    /* renamed from: M */
    public final void onBindItemView(C57807MmR t) {
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        User user = t.LJLIL;
        N(user.getLivePushNotificationStatus());
        C9AE.LIZ(this.LJLJLJ, C9AC.ALPHA, 0.0f);
        TuxIconView tuxIconView = this.LJLJLJ;
        if (tuxIconView != null) {
            C16880lQ.LJJJ(tuxIconView, new ACListenerS44S0200000_9(this, user, 12));
        }
    }

    public final void N(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                TuxIconView tuxIconView = this.LJLJLJ;
                if (tuxIconView != null) {
                    tuxIconView.setIconRes(R.raw.icon_bell_slash);
                }
                TuxIconView tuxIconView2 = this.LJLJLJ;
                if (tuxIconView2 == null) {
                    return;
                }
                tuxIconView2.setTintColorRes(R.attr.gv);
                return;
            }
            TuxIconView tuxIconView3 = this.LJLJLJ;
            if (tuxIconView3 != null) {
                tuxIconView3.setIconRes(R.raw.icon_bell);
            }
            TuxIconView tuxIconView4 = this.LJLJLJ;
            if (tuxIconView4 == null) {
                return;
            }
            tuxIconView4.setTintColorRes(R.attr.gv);
            return;
        }
        TuxIconView tuxIconView5 = this.LJLJLJ;
        if (tuxIconView5 != null) {
            tuxIconView5.setIconRes(R.raw.icon_bell_activation);
        }
        TuxIconView tuxIconView6 = this.LJLJLJ;
        if (tuxIconView6 == null) {
            return;
        }
        tuxIconView6.setTintColorRes(R.attr.gv);
    }

    @Override // com.ss.android.ugc.aweme.following.ui.assem.RelationSearchCell, com.bytedance.ies.powerlist.PowerCell
    public final /* bridge */ /* synthetic */ void onBindItemView(C57807MmR c57807MmR) {
        onBindItemView(c57807MmR);
    }

    @Override // com.ss.android.ugc.aweme.following.ui.assem.RelationSearchCell, com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View onCreateItemView = super.onCreateItemView(parent);
        TuxIconView tuxIconView = (TuxIconView) onCreateItemView.findViewById(R.id.ai8);
        this.LJLJLJ = tuxIconView;
        if (tuxIconView != null) {
            tuxIconView.setVisibility(0);
        }
        RelationButton relationButton = this.LJLJJL;
        if (relationButton != null) {
            relationButton.setRequestListener(new AqS191S0100000_9(this, 20));
        }
        return onCreateItemView;
    }
}
