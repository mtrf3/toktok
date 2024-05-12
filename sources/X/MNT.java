package X;

import Y.ACListenerS29S0100000_9;
import Y.IDCListenerS300S0100000_9;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.inbox.widget.multi.InboxEntrancePod;
import com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MNT extends MMX<InboxEntrancePod> {
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C62822Ol8 LJLLL;
    public final C62822Ol8 LJLLLL;
    public final C62822Ol8 LJLLLLLL;
    public TBS LJLZ;
    public final C62822Ol8 LJZ;
    public final C62822Ol8 LJZI;

    public final TuxTextView f0() {
        return (TuxTextView) this.LJLLJ.getValue();
    }

    public final SmartAvatarImageView g0() {
        return (SmartAvatarImageView) this.LJLL.getValue();
    }

    public final AVU h0() {
        return (AVU) this.LJLLL.getValue();
    }

    public final View i0() {
        return (View) this.LJLJLLL.getValue();
    }

    public final TuxTextView l0() {
        return (TuxTextView) this.LJLLLL.getValue();
    }

    public final TuxTextView m0() {
        return (TuxTextView) this.LJLLI.getValue();
    }

    @Override // X.MMX
    public final void reportShowEvent() {
        int layoutPosition;
        MultiViewModel P = P();
        InboxEntrancePod N = N();
        C53330KwQ.LIZ.getClass();
        if (C53330KwQ.LIZ() > 0) {
            layoutPosition = getLayoutPosition() - 1;
        } else {
            layoutPosition = getLayoutPosition();
        }
        if (N.entranceCell.isActivity() || N.entranceCell.isFollower()) {
            P.vv0("show", N);
        } else {
            P.yv0("show", "show", N, Integer.valueOf(layoutPosition));
        }
    }

    public MNT(MMY mmy) {
        super(mmy);
        this.LJLJLLL = C221108m2.LIZIZ(new AqS159S0100000_9(mmy, 918));
        this.LJLL = C221108m2.LIZIZ(new AqS159S0100000_9(mmy, 915));
        this.LJLLI = C221108m2.LIZIZ(new AqS159S0100000_9(mmy, 878));
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS159S0100000_9(mmy, 912));
        this.LJLLJ = C221108m2.LIZIZ(new AqS159S0100000_9(mmy, 913));
        this.LJLLL = C221108m2.LIZIZ(new AqS159S0100000_9(mmy, 917));
        this.LJLLLL = C221108m2.LIZIZ(new AqS159S0100000_9(mmy, 877));
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS159S0100000_9(mmy, 914));
        this.LJZ = C221108m2.LIZIZ(MNZ.LJLIL);
        this.LJZI = C221108m2.LIZIZ(MNY.LJLIL);
        C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 131), i0());
        if (C3TE.LIZIZ()) {
            AnonymousClass064 anonymousClass064 = new AnonymousClass064();
            View i0 = i0();
            o.LJII(i0, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            anonymousClass064.LJII((ConstraintLayout) i0);
            anonymousClass064.LJIIIIZZ(R.id.fu3, 3, i0().getId(), 3);
            anonymousClass064.LJIIIIZZ(R.id.ads, 7, R.id.n3m, 6);
            anonymousClass064.LJIIIIZZ(R.id.fu2, 7, R.id.n3m, 6);
            View i02 = i0();
            o.LJII(i02, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            anonymousClass064.LIZIZ((ConstraintLayout) i02);
        }
        i0().setOnLongClickListener(new IDCListenerS300S0100000_9(this, 4));
        if (C53341Kwb.LIZ()) {
            MVR.LIZ(i0(), MVP.CELL, 0.0f);
        }
    }

    @Override // X.MMX
    public final void T(C96533qb c96533qb) {
        boolean z;
        C96533qb c96533qb2;
        ActivityC45651qj M;
        Integer LJI;
        if (c96533qb.LIZIZ != -1) {
            z = true;
        } else {
            z = false;
        }
        C96533qb c96533qb3 = null;
        if (z) {
            SmartAvatarImageView g0 = g0();
            ViewGroup.LayoutParams layoutParams = g0().getLayoutParams();
            int i = c96533qb.LIZIZ;
            layoutParams.width = i;
            layoutParams.height = i;
            g0.setLayoutParams(layoutParams);
        }
        if (c96533qb.LJ != -1) {
            m0().setTuxFont(c96533qb.LJ);
        }
        if (c96533qb.LJFF != -1) {
            m0().LJJJ(c96533qb.LJFF);
        }
        if (c96533qb.LJI != -1) {
            f0().setTuxFont(c96533qb.LJI);
        }
        if (c96533qb.LJIIIZ != -1 && (M = M()) != null && (LJI = C79045V0n.LJI(c96533qb.LJIIIZ, M)) != null) {
            f0().setTextColor(LJI.intValue());
        }
        if (c96533qb.LJIIJ != -1) {
            c96533qb2 = c96533qb;
        } else {
            c96533qb2 = null;
        }
        if (c96533qb2 != null && (((View) this.LJLLILLLL.getValue()).getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            View view = (View) this.LJLLILLLL.getValue();
            ViewGroup.LayoutParams layoutParams2 = ((View) this.LJLLILLLL.getValue()).getLayoutParams();
            o.LJII(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams.topMargin = c96533qb2.LJIIJ;
            view.setLayoutParams(marginLayoutParams);
        }
        if (c96533qb.LJIILIIL != -1) {
            c96533qb3 = c96533qb;
        }
        if ((h0().getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && c96533qb3 != null) {
            AVU h0 = h0();
            ViewGroup.LayoutParams layoutParams3 = h0().getLayoutParams();
            o.LJII(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
            marginLayoutParams2.setMarginStart(c96533qb3.LJIILIIL);
            h0.setLayoutParams(marginLayoutParams2);
        }
        if (c96533qb.LJIIJJI != -1 && !C96573qf.LIZLLL()) {
            l0().setTuxFont(c96533qb.LJIIJJI);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014b A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0204  */
    @Override // X.MMX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V(com.ss.android.ugc.aweme.inbox.widget.multi.InboxEntrancePod r11) {
        /*
            Method dump skipped, instructions count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MNT.V(X.MMe):void");
    }

    public final void c0(boolean z) {
        ConstraintLayout constraintLayout;
        View i0 = i0();
        if ((i0 instanceof ConstraintLayout) && (constraintLayout = (ConstraintLayout) i0) != null) {
            AnonymousClass064 LIZ = C57396Mfo.LIZ(constraintLayout);
            LIZ.LJIIIIZZ(R.id.fu3, 3, i0().getId(), 3);
            LIZ.LJIIIIZZ(R.id.fu3, 4, i0().getId(), 4);
            if (z) {
                LIZ.LJI(R.id.fu3, 6);
            } else {
                LIZ.LJIIIIZZ(R.id.fu3, 6, R.id.fu2, 7);
            }
            LIZ.LIZIZ(constraintLayout);
        }
    }
}
