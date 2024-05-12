package X;

import Y.ACListenerS29S0100000_9;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.inbox.widget.multi.ActivityIcon;
import com.ss.android.ugc.aweme.inbox.widget.multi.ActivityPod;
import com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Calendar;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MNU extends MMX<ActivityPod> {
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C62822Ol8 LJLLL;
    public final C62822Ol8 LJLLLL;
    public final C62822Ol8 LJLLLLLL;
    public final C62822Ol8 LJLZ;
    public final int LJZ;

    public final TuxTextView c0() {
        return (TuxTextView) this.LJLLJ.getValue();
    }

    public final C119624mk f0() {
        return (C119624mk) this.LJLLILLLL.getValue();
    }

    public final AVS g0() {
        return (AVS) this.LJLLL.getValue();
    }

    public final TuxTextView h0() {
        return (TuxTextView) this.LJLL.getValue();
    }

    @Override // X.MMX
    public final void reportShowEvent() {
        if (N().dataType == EnumC56696MMy.ACTIVITY || N().dataType == EnumC56696MMy.FOLLOWER) {
            P();
            MultiViewModel.uv0("show", N());
        }
    }

    @Override // X.MMX
    public final void T(C96533qb c96533qb) {
        boolean z;
        C96533qb c96533qb2;
        if (c96533qb.LIZIZ != -1) {
            z = true;
        } else {
            z = false;
        }
        C96533qb c96533qb3 = null;
        if (z) {
            View view = (View) this.LJLJLLL.getValue();
            ViewGroup.LayoutParams layoutParams = ((View) this.LJLJLLL.getValue()).getLayoutParams();
            int i = c96533qb.LIZIZ;
            layoutParams.width = i;
            layoutParams.height = i;
            view.setLayoutParams(layoutParams);
        }
        if (c96533qb.LJ != -1) {
            h0().setTuxFont(c96533qb.LJ);
        }
        if (c96533qb.LJFF != -1) {
            h0().LJJJ(c96533qb.LJFF);
        }
        if (c96533qb.LJI != -1) {
            c0().setTuxFont(c96533qb.LJI);
        }
        if (c96533qb.LJIIIIZZ != -1) {
            c0().setTextColor(c96533qb.LJIIIIZZ);
        }
        if (c96533qb.LJIIJ != -1) {
            c96533qb2 = c96533qb;
        } else {
            c96533qb2 = null;
        }
        if (c96533qb2 != null && (((View) this.LJLLI.getValue()).getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            View view2 = (View) this.LJLLI.getValue();
            ViewGroup.LayoutParams layoutParams2 = ((View) this.LJLLI.getValue()).getLayoutParams();
            o.LJII(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams.topMargin = c96533qb2.LJIIJ;
            view2.setLayoutParams(marginLayoutParams);
        }
        if (c96533qb.LJIILIIL != -1) {
            c96533qb3 = c96533qb;
        }
        if ((g0().getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && c96533qb3 != null) {
            AVS g0 = g0();
            ViewGroup.LayoutParams layoutParams3 = g0().getLayoutParams();
            o.LJII(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
            marginLayoutParams2.setMarginStart(c96533qb3.LJIILIIL);
            g0.setLayoutParams(marginLayoutParams2);
        }
        if (c96533qb.LJIIJJI != -1) {
            ((TuxTextView) this.LJLLLL.getValue()).setTuxFont(c96533qb.LJIIJJI);
        }
    }

    @Override // X.MMX
    public final void U(boolean z) {
        super.U(z);
        if (!z && C54316LTk.LIZJ && !P().LLIFFJFJJ && N().dataType == EnumC56696MMy.SHOP) {
            C56760MPk.LJIILJJIL("show", getLayoutPosition() - this.LJZ, N().extra, N().createTime, N().readPoint);
            P().LLIFFJFJJ = true;
        }
    }

    @Override // X.MMX
    public final void V(ActivityPod activityPod) {
        String str;
        ActivityPod activityPod2 = activityPod;
        super.V(activityPod2);
        String str2 = activityPod2.newNoticeContent;
        boolean z = true;
        if (str2.length() == 0) {
            str2 = C88913eJ.LIZ(this.itemView, R.string.hdz, "itemView.context.getStri…ctivity_desc_no_messages)");
        }
        String str3 = (String) ORZ.LJLLLL(activityPod2.title);
        if (str3 != null) {
            h0().setText(str3);
        }
        if (activityPod2.LJLIL != null) {
            ((TuxIconView) this.LJLJLLL.getValue()).setImageDrawable(activityPod2.LJLIL);
        }
        ActivityIcon activityIcon = activityPod2.smallAvatarUrl;
        if (activityIcon == null) {
            f0().setVisibility(8);
        } else if (activityIcon.urlModel != null) {
            f0().setVisibility(0);
            C78765Uvh.LJFF(f0(), activityIcon.urlModel);
            i0(false);
        } else if (activityIcon.resId != -1) {
            f0().setVisibility(0);
            f0().setImageURI(C78964Uyu.LIZJ(activityIcon.resId));
            i0(true);
        } else if (C78685UuP.LJJJZ(activityIcon.url)) {
            f0().setVisibility(0);
            C78765Uvh.LJIIIZ(f0(), activityIcon.url, -1, -1);
            i0(true);
        } else {
            f0().setVisibility(8);
        }
        c0().setText(str2);
        String str4 = activityPod2.newNoticeTime;
        if (str4 == null || str4.length() == 0) {
            ((View) this.LJLLLL.getValue()).setVisibility(8);
        } else {
            ((View) this.LJLLLL.getValue()).setVisibility(0);
            TextView textView = (TextView) this.LJLLLL.getValue();
            if (C3TE.LIZIZ()) {
                Context context = this.itemView.getContext();
                long j = activityPod2.createTime * 1000;
                long timeInMillis = Calendar.getInstance().getTimeInMillis() - j;
                if (timeInMillis < 604800000) {
                    str = C57105Mb7.LIZ(timeInMillis, context);
                } else {
                    str = C57105Mb7.LIZIZ(j);
                }
            } else {
                str = activityPod2.newNoticeTime;
            }
            textView.setText(str);
        }
        int i = MNB.LIZ[activityPod2.readPoint.type.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    g0().setVisibility(8);
                }
            } else {
                AVS g0 = g0();
                g0.setVariant(0);
                g0.setVisibility(0);
            }
        } else {
            AVS g02 = g0();
            g02.setVariant(1);
            g02.setCount(activityPod2.readPoint.unreadCount);
            g02.setVisibility(0);
        }
        if (N().readPoint.type != MN2.COUNT && N().readPoint.type != MN2.DOT) {
            z = false;
        }
        if (C3TE.LIZIZ()) {
            if (z) {
                TuxTextView h0 = h0();
                if (h0 != null) {
                    h0.setTuxFont(42);
                }
                TuxTextView c0 = c0();
                if (c0 != null) {
                    c0.setTuxFont(52);
                }
            } else {
                TuxTextView h02 = h0();
                if (h02 != null) {
                    h02.setTuxFont(41);
                }
                TuxTextView c02 = c0();
                if (c02 != null) {
                    c02.setTuxFont(51);
                }
            }
        }
        if (activityPod2.showArrow) {
            ((ImageView) this.LJLLLLLL.getValue()).setVisibility(0);
        } else {
            ((ImageView) this.LJLLLLLL.getValue()).setVisibility(8);
        }
    }

    public final void i0(boolean z) {
        Integer num;
        if (z) {
            V8L v8l = f0().getHierarchy().LIZJ;
            if (v8l != null && (num = (Integer) this.LJLZ.getValue()) != null) {
                v8l.LIZJ(C32151Nz.LJIIZILJ(1), num.intValue());
                return;
            }
            return;
        }
        V8L v8l2 = f0().getHierarchy().LIZJ;
        if (v8l2 == null) {
            return;
        }
        v8l2.LIZLLL(0.0f);
    }

    public MNU(MMY mmy, int i) {
        super(mmy);
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS159S0100000_9(mmy, 893));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS159S0100000_9(mmy, 889));
        this.LJLL = C221108m2.LIZIZ(new AqS159S0100000_9(mmy, 897));
        this.LJLLI = C221108m2.LIZIZ(new AqS159S0100000_9(mmy, 886));
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS159S0100000_9(mmy, 891));
        this.LJLLJ = C221108m2.LIZIZ(new AqS159S0100000_9(mmy, 887));
        this.LJLLL = C221108m2.LIZIZ(new AqS159S0100000_9(mmy, 892));
        this.LJLLLL = C221108m2.LIZIZ(new AqS159S0100000_9(mmy, 896));
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS159S0100000_9(mmy, 888));
        this.LJLZ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 885));
        this.LJZ = i;
        C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 129), (View) LIZIZ.getValue());
        if (C53341Kwb.LIZ()) {
            MVR.LIZ((View) LIZIZ.getValue(), MVP.CELL, 0.0f);
        }
        if (C3TE.LIZIZ()) {
            AnonymousClass064 anonymousClass064 = new AnonymousClass064();
            View view = (View) LIZIZ.getValue();
            o.LJII(view, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            anonymousClass064.LJII((ConstraintLayout) view);
            anonymousClass064.LJIIIIZZ(R.id.fu3, 3, ((View) LIZIZ.getValue()).getId(), 3);
            anonymousClass064.LJIIIIZZ(R.id.adu, 7, R.id.fu3, 6);
            View view2 = (View) LIZIZ.getValue();
            o.LJII(view2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            anonymousClass064.LIZIZ((ConstraintLayout) view2);
        }
    }
}
