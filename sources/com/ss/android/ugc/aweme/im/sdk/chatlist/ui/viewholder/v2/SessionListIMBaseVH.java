package com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2;

import X.AVS;
import X.AbstractC82843My;
import X.AnonymousClass064;
import X.C17N;
import X.C221108m2;
import X.C3TU;
import X.C62822Ol8;
import X.C82483Lo;
import X.C82493Lp;
import X.C96503qY;
import X.C96533qb;
import X.C96643qm;
import X.C96653qn;
import X.C97343ru;
import X.EnumC96553qd;
import X.InterfaceC1040946r;
import X.SY9;
import Y.IDObjectS1S0101000_1;
import Y.IDObjectS326S0100000_1;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public abstract class SessionListIMBaseVH extends SessionListBaseVH {
    public final C62822Ol8 LJLLLL;
    public final C62822Ol8 LJLLLLLL;
    public final C62822Ol8 LJLZ;
    public final C62822Ol8 LJZ;
    public final C62822Ol8 LJZI;
    public final C62822Ol8 LJZL;
    public final C62822Ol8 LL;
    public final C62822Ol8 LLD;
    public final C62822Ol8 LLF;
    public final C62822Ol8 LLFF;
    public final C62822Ol8 LLFFF;
    public final C62822Ol8 LLFII;

    public abstract void f0(C3TU c3tu);

    public void h0(C3TU c3tu) {
    }

    public abstract SY9 o0(EnumC96553qd enumC96553qd);

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListBaseVH, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public boolean s0() {
        return false;
    }

    public abstract boolean t0(C3TU c3tu);

    public void w0(C3TU c3tu) {
    }

    public final boolean i0() {
        return ((Boolean) this.LLFFF.getValue()).booleanValue();
    }

    public final InterfaceC1040946r l0() {
        return (InterfaceC1040946r) this.LLD.getValue();
    }

    public final C96503qY m0() {
        return (C96503qY) this.LLF.getValue();
    }

    public final boolean n0() {
        return ((Boolean) this.LLFF.getValue()).booleanValue();
    }

    public final AppCompatTextView p0() {
        return (AppCompatTextView) this.LJLLLLLL.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionListIMBaseVH(View view) {
        super(view);
        o.LJIIIZ(view, "view");
        this.LJLLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 608));
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 609));
        this.LJLZ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 611));
        this.LJZ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 604));
        this.LJZI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 605));
        this.LJZL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 607));
        this.LL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 602));
        this.LLD = C221108m2.LIZIZ(new AqS151S0100000_1(this, 601));
        this.LLF = C221108m2.LIZIZ(new AqS151S0100000_1(this, 603));
        this.LLFF = C221108m2.LIZIZ(new AqS151S0100000_1(this, 606));
        this.LLFFF = C221108m2.LIZIZ(new AqS151S0100000_1(this, 600));
        this.LLFII = C221108m2.LIZIZ(new AqS151S0100000_1(this, 610));
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListBaseVH, X.C3X3
    public void LLL(C96533qb c96533qb) {
        super.LLL(c96533qb);
        if (c96533qb.LJIIJJI != -1 && (p0() instanceof TuxTextView) && !n0()) {
            AppCompatTextView p0 = p0();
            o.LJII(p0, "null cannot be cast to non-null type com.bytedance.tux.input.TuxTextView");
            ((TuxTextView) p0).setTuxFont(c96533qb.LJIIJJI);
        }
    }

    public void c0(C3TU c3tu) {
        h0(c3tu);
        if (!i0()) {
            return;
        }
        if (!c3tu.isMute() && c3tu.getSessionUnreadViewState() != null && !s0() && !c3tu.isBlock()) {
            TuxTextView V = V();
            if (V != null) {
                V.setTuxFont(42);
            }
            TuxTextView U = U();
            if (U != null) {
                U.setTuxFont(52);
                U.setTextColorRes(R.attr.go);
                return;
            }
            return;
        }
        TuxTextView V2 = V();
        if (V2 != null) {
            V2.setTuxFont(41);
        }
        TuxTextView U2 = U();
        if (U2 == null) {
            return;
        }
        U2.setTuxFont(51);
        U2.setTextColorRes(R.attr.dt);
    }

    public final void g0(boolean z) {
        View view;
        ConstraintLayout constraintLayout;
        View view2 = this.itemView;
        if ((view2 instanceof ConstraintLayout) && (constraintLayout = (ConstraintLayout) view2) != null) {
            AnonymousClass064 anonymousClass064 = new AnonymousClass064();
            anonymousClass064.LJII(constraintLayout);
            anonymousClass064.LJI(R.id.fgj, 6);
            anonymousClass064.LJIIIIZZ(R.id.fgj, 3, R.id.jqa, 3);
            anonymousClass064.LJIIIIZZ(R.id.fgj, 4, R.id.jqa, 4);
            if (z) {
                anonymousClass064.LJIIIIZZ(R.id.la4, 7, R.id.n3m, 6);
                anonymousClass064.LJIIIIZZ(R.id.btt, 7, R.id.n3m, 6);
            } else {
                anonymousClass064.LJI(R.id.la4, 7);
                anonymousClass064.LJIIIIZZ(R.id.la4, 7, R.id.fgj, 6);
            }
            anonymousClass064.LIZIZ(constraintLayout);
        }
        View view3 = this.itemView;
        if ((view3 instanceof LinearLayout) && view3 != null && (view = (View) this.LLFII.getValue()) != null) {
            C97343ru.LIZJ(view, Integer.valueOf(((Number) C96503qY.LJFF.getValue()).intValue()), null, 13);
        }
    }

    public final void x0(AbstractC82843My abstractC82843My) {
        AVS avs;
        if (abstractC82843My == null) {
            return;
        }
        if (abstractC82843My instanceof C82493Lp) {
            C82493Lp c82493Lp = (C82493Lp) abstractC82843My;
            AVS avs2 = (AVS) this.LJLZ.getValue();
            if (avs2 != null) {
                avs2.setVariant(1);
                avs2.setCount(c82493Lp.getNum());
                C97343ru.LIZIZ(avs2, C96653qn.LJLIL);
                C96503qY m0 = m0();
                int background = c82493Lp.getBackground();
                m0.getClass();
                Integer LIZ = C96503qY.LIZ(background);
                if (LIZ != null) {
                    avs2.setBadgeBackgroundColor(LIZ.intValue());
                }
                C17N.LJJLIIIJJI(avs2);
                return;
            }
            return;
        }
        if (!(abstractC82843My instanceof C82483Lo) || (avs = (AVS) this.LJLZ.getValue()) == null) {
            return;
        }
        avs.setVariant(0);
        C97343ru.LIZIZ(avs, C96643qm.LJLIL);
        C96503qY m02 = m0();
        int background2 = abstractC82843My.getBackground();
        m02.getClass();
        Integer LIZ2 = C96503qY.LIZ(background2);
        if (LIZ2 != null) {
            avs.setBadgeBackgroundColor(LIZ2.intValue());
        }
        C17N.LJJLIIIJJI(avs);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListBaseVH
    public void v0(C3TU c3tu, int i) {
        int i2;
        IDObjectS1S0101000_1 iDObjectS1S0101000_1;
        super.v0(c3tu, i);
        f0(c3tu);
        int i3 = 8;
        if (t0(c3tu)) {
            ImageView imageView = (ImageView) this.LJLLLL.getValue();
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            SY9 o0 = o0(c3tu.getReadStatus());
            if (o0 == null) {
                ImageView imageView2 = (ImageView) this.LJLLLL.getValue();
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                }
            } else {
                TuxIconView tuxIconView = (TuxIconView) this.LJLLLL.getValue();
                if (tuxIconView != null) {
                    tuxIconView.setImageDrawable(o0);
                }
            }
        } else {
            ImageView imageView3 = (ImageView) this.LJLLLL.getValue();
            if (imageView3 != null) {
                imageView3.setVisibility(8);
            }
        }
        View view = (View) this.LJLZ.getValue();
        if (view != null) {
            view.setVisibility(8);
        }
        ImageView imageView4 = (ImageView) this.LJZL.getValue();
        if (imageView4 != null) {
            imageView4.setVisibility(8);
        }
        ImageView imageView5 = (ImageView) this.LL.getValue();
        if (imageView5 != null) {
            imageView5.setVisibility(8);
        }
        View view2 = (View) this.LJZ.getValue();
        if (view2 != null) {
            view2.setVisibility(8);
        }
        View view3 = (View) this.LJZI.getValue();
        if (view3 != null) {
            view3.setVisibility(8);
        }
        w0(c3tu);
        View view4 = (View) this.LJZ.getValue();
        if (view4 != null) {
            ViewGroup viewGroup = (ViewGroup) this.LJZ.getValue();
            if (viewGroup != null) {
                Iterable iDObjectS326S0100000_1 = new IDObjectS326S0100000_1(viewGroup, 8);
                if (!(iDObjectS326S0100000_1 instanceof Collection) || !((Collection) iDObjectS326S0100000_1).isEmpty()) {
                    Iterator it = iDObjectS326S0100000_1.iterator();
                    do {
                        iDObjectS1S0101000_1 = (IDObjectS1S0101000_1) it;
                        if (iDObjectS1S0101000_1.hasNext()) {
                        }
                    } while (((View) iDObjectS1S0101000_1.next()).getVisibility() != 0);
                    i2 = 0;
                    view4.setVisibility(i2);
                }
            }
            i2 = 8;
            view4.setVisibility(i2);
        }
        View view5 = (View) this.LJZI.getValue();
        if (view5 != null) {
            ViewGroup viewGroup2 = (ViewGroup) this.LJZI.getValue();
            if (viewGroup2 != null) {
                Iterable iDObjectS326S0100000_12 = new IDObjectS326S0100000_1(viewGroup2, 9);
                if (!(iDObjectS326S0100000_12 instanceof Collection) || !((Collection) iDObjectS326S0100000_12).isEmpty()) {
                    Iterator it2 = iDObjectS326S0100000_12.iterator();
                    while (true) {
                        IDObjectS1S0101000_1 iDObjectS1S0101000_12 = (IDObjectS1S0101000_1) it2;
                        if (!iDObjectS1S0101000_12.hasNext()) {
                            break;
                        } else if (((View) iDObjectS1S0101000_12.next()).getVisibility() == 0) {
                            i3 = 0;
                            break;
                        }
                    }
                }
            }
            view5.setVisibility(i3);
        }
        c0(c3tu);
    }
}
