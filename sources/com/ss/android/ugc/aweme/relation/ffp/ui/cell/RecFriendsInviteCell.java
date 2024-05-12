package com.ss.android.ugc.aweme.relation.ffp.ui.cell;

import X.C04330Ez;
import X.C110614Vt;
import X.C2068389v;
import X.C32151Nz;
import X.C61328O5c;
import X.C7MY;
import X.O6R;
import X.P2K;
import X.SY4;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class RecFriendsInviteCell extends RecFriendsTopBaseCell<P2K> {
    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.cell.RecFriendsTopBaseCell
    public final void N(P2K p2k) {
        P2K item = p2k;
        o.LJIIIZ(item, "item");
        SmartRoute buildRoute = SmartRouter.buildRoute(this.itemView.getContext(), "//friends/invite");
        buildRoute.withParam("enter_from", item.LJLIL.LJLIL);
        buildRoute.open();
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.cell.RecFriendsTopBaseCell, com.bytedance.ies.powerlist.PowerCell
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(P2K item) {
        View view;
        o.LJIIIZ(item, "item");
        super.onBindItemView(item);
        Context context = this.itemView.getContext();
        TuxIconView tuxIconView = this.LJLIL;
        if (tuxIconView != null) {
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_arrow_turn_up_right_fill;
            c2068389v.LJ = Integer.valueOf(R.attr.dj);
            c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(21));
            c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(21));
            tuxIconView.setTuxIcon(c2068389v);
            ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = C7MY.LIZIZ(36);
                layoutParams.width = C7MY.LIZIZ(36);
                tuxIconView.setLayoutParams(layoutParams);
                C110614Vt c110614Vt = new C110614Vt();
                c110614Vt.LIZ = Integer.valueOf(C04330Ez.LIZIZ(context, R.color.l6));
                c110614Vt.LIZJ = C61328O5c.LIZJ(36);
                o.LJIIIIZZ(context, "context");
                tuxIconView.setBackground(c110614Vt.LIZ(context));
                TuxTextView tuxTextView = this.LJLILLLLZI;
                if (tuxTextView != null) {
                    tuxTextView.setText(context.getText(R.string.gh5));
                    SY4 sy4 = this.LJLJI;
                    if (sy4 != null) {
                        sy4.setVisibility(8);
                        L().setVisibility(8);
                        Object parent = L().getParent();
                        if (!(parent instanceof View) || (view = (View) parent) == null) {
                            return;
                        }
                        view.setVisibility(0);
                        return;
                    }
                    o.LJIJI("connectBtn");
                    throw null;
                }
                o.LJIJI("titleTextView");
                throw null;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        o.LJIJI("iconView");
        throw null;
    }
}
