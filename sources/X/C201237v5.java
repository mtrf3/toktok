package X;

import Y.AObserverS71S0100000_3;
import Y.ARunnableS39S0100000_3;
import Y.AUListenerS92S0100000_3;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImage;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.ui.feed.photos.PostModeFullPageViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7v5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C201237v5 implements KPL {
    public final C200847uS LJLIL;
    public int LJLILLLLZI;

    @Override // X.KPL, X.C8YZ
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C8YZ getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.KPL, X.InterfaceC212848Wy
    public final C3C8 getActualReceiver() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final InterfaceC212848Wy<C3C8> getActualReceiverHolder() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C3C8 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C8YM
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    public final OSZ<Float, Integer> LIZIZ() {
        PhotoModeImage photoModeImage;
        Integer num;
        int LJJIIZ;
        int LJIIIZ = KL2.LJIIIZ(this.LJLIL.LIZIZ);
        C200847uS c200847uS = this.LJLIL;
        PostModeDetailParams postModeDetailParams = c200847uS.LJI;
        if (postModeDetailParams != null) {
            LJIIIZ = postModeDetailParams.imageHeight;
        }
        Aweme aweme = c200847uS.LIZJ;
        Integer num2 = null;
        if (aweme != null) {
            photoModeImage = C62819Ol5.LJJIII(this.LJLILLLLZI, aweme);
        } else {
            photoModeImage = null;
        }
        if (photoModeImage != null) {
            num = Integer.valueOf(photoModeImage.width);
            num2 = Integer.valueOf(photoModeImage.height);
        } else {
            num = null;
        }
        float LIZ = C2049182l.LIZ(num, num2);
        C200847uS c200847uS2 = this.LJLIL;
        EnumC2053484c LIZ2 = C2053384b.LIZ(c200847uS2.LIZIZ, c200847uS2.LIZJ);
        float LIZJ = C2049182l.LIZJ(C2049182l.LIZIZ(LIZ, LIZ2), LIZ2, LJIIIZ, this.LJLIL.LIZJ, this.LJLILLLLZI);
        if (Float.isNaN(LIZJ)) {
            LJJIIZ = 0;
        } else {
            LJJIIZ = O6R.LJJIIZ(LJIIIZ * LIZJ);
        }
        return new OSZ<>(Float.valueOf(((Number) C2049182l.LIZIZ.getValue()).floatValue()), Integer.valueOf(LJJIIZ));
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        Lifecycle lifecycle = this.LJLIL.LIZIZ.getLifecycle();
        o.LJIIIIZZ(lifecycle, "postModeModel.activityContext.lifecycle");
        return lifecycle;
    }

    public C201237v5(C200847uS postModeModel) {
        View findViewById;
        o.LJIIIZ(postModeModel, "postModeModel");
        this.LJLIL = postModeModel;
        int intValue = LIZIZ().getSecond().intValue();
        ViewGroup viewGroup = postModeModel.LJ;
        if (viewGroup != null && (findViewById = viewGroup.findViewById(R.id.hp0)) != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
            if (marginLayoutParams != null) {
                marginLayoutParams.height = intValue;
            }
            findViewById.setLayoutParams(marginLayoutParams);
        }
        ActivityC45651qj activityC45651qj = postModeModel.LIZIZ;
        postModeModel.LJII.LJLILLLLZI.observe(activityC45651qj, new AObserverS71S0100000_3(this, 41));
        postModeModel.LJII.LLIIIZ.observe(activityC45651qj, new AObserverS71S0100000_3(this, 36));
        PostModeFullPageViewModel postModeFullPageViewModel = postModeModel.LJIIIIZZ;
        if (postModeFullPageViewModel != null) {
            C8YN.LJII(this, postModeFullPageViewModel, new TBT() { // from class: X.7bA
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return Integer.valueOf(((C203127y8) obj).LJLIL);
                }
            }, null, new AqS185S0100000_3(this, 153), 6);
        }
    }

    public static final ValueAnimator LIZ(View view, float f, float f2, long j) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.setDuration(j);
        ofFloat.addUpdateListener(new AUListenerS92S0100000_3(view, 25));
        return ofFloat;
    }

    @Override // X.C8YM
    public final <S extends C33Q> InterfaceC222288nw subscribe(AssemViewModel<S> assemViewModel, C56412MCa<S> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJIIIIZZ(this, assemViewModel, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    public static void LIZJ(final C201237v5 c201237v5, boolean z, boolean z2, long j, int i) {
        float f;
        float f2;
        float f3;
        float f4;
        View findViewById;
        View findViewById2;
        View findViewById3;
        View findViewById4;
        View findViewById5;
        ViewGroup viewGroup;
        View findViewById6;
        View findViewById7;
        View findViewById8;
        final boolean z3 = z2;
        final boolean z4 = z;
        long j2 = j;
        if ((i & 1) != 0) {
            z4 = false;
        }
        if ((i & 2) != 0) {
            z3 = false;
        }
        if ((i & 4) != 0) {
            j2 = 300;
        }
        final ActivityC45651qj activityC45651qj = c201237v5.LJLIL.LIZIZ;
        OSZ<Float, Integer> LIZIZ = c201237v5.LIZIZ();
        float floatValue = LIZIZ.getFirst().floatValue();
        int intValue = LIZIZ.getSecond().intValue();
        float f5 = C61447O9r.LJIILIIL;
        int i2 = C61447O9r.LJIILJJIL;
        C57092Lx.LIZ.getClass();
        float max = Math.max(i2, C61447O9r.LIZ());
        float f6 = intValue;
        if (z3) {
            f = C61447O9r.LJIILIIL;
            f5 = 0.0f;
            max = 0.0f;
            f2 = 1.0f;
            f3 = 0.0f;
            f4 = floatValue;
        } else {
            f = 0.0f;
            f2 = 0.0f;
            f3 = 1.0f;
            f4 = f6;
            f6 = floatValue;
        }
        c201237v5.LJLIL.LJII.LLIILZL.setValue(Boolean.TRUE);
        ViewGroup viewGroup2 = c201237v5.LJLIL.LJ;
        AnimatorSet.Builder builder = null;
        if (viewGroup2 != null && (findViewById8 = viewGroup2.findViewById(R.id.hzg)) != null) {
            findViewById8.setVisibility(8);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ViewGroup viewGroup3 = c201237v5.LJLIL.LJ;
        if (viewGroup3 != null && (findViewById7 = viewGroup3.findViewById(R.id.hp0)) != null) {
            builder = animatorSet.play(LIZ(findViewById7, f4, f6, j2));
        }
        if (C61447O9r.LJIILIIL > 0 && (viewGroup = c201237v5.LJLIL.LIZLLL) != null && (findViewById6 = viewGroup.findViewById(R.id.lgd)) != null) {
            ValueAnimator LIZ = LIZ(findViewById6, f5, f, j2);
            if (builder != null) {
                builder.with(LIZ);
            }
        }
        ViewGroup viewGroup4 = c201237v5.LJLIL.LIZLLL;
        if (viewGroup4 != null && (findViewById5 = viewGroup4.findViewById(R.id.bju)) != null) {
            LIZ(findViewById5, findViewById5.getMeasuredHeight(), max, j2).start();
        }
        ViewGroup viewGroup5 = c201237v5.LJLIL.LJ;
        if (viewGroup5 != null && (findViewById4 = viewGroup5.findViewById(R.id.e3v)) != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(findViewById4, (Property<View, Float>) View.ALPHA, f2, f3);
            ofFloat.setDuration(j2);
            if (builder != null) {
                builder.with(ofFloat);
            }
        }
        if (z3) {
            ViewGroup viewGroup6 = c201237v5.LJLIL.LJFF;
            if (viewGroup6 != null) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(viewGroup6, (Property<ViewGroup, Float>) View.ALPHA, f2, f3);
                ofFloat2.setDuration(j2);
                if (builder != null) {
                    builder.with(ofFloat2);
                }
            }
            ViewGroup viewGroup7 = c201237v5.LJLIL.LIZLLL;
            if (viewGroup7 != null && (findViewById3 = viewGroup7.findViewById(R.id.ap_)) != null) {
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(findViewById3, (Property<View, Float>) View.ALPHA, f2, f3);
                ofFloat3.setDuration(j2);
                if (builder != null) {
                    builder.with(ofFloat3);
                }
            }
        }
        ViewGroup viewGroup8 = c201237v5.LJLIL.LJ;
        if (viewGroup8 != null && (findViewById2 = viewGroup8.findViewById(R.id.hzj)) != null) {
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(findViewById2, (Property<View, Float>) View.ALPHA, f2, f3);
            ofFloat4.setDuration(j2);
            if (builder != null) {
                builder.with(ofFloat4);
            }
        }
        ViewGroup viewGroup9 = c201237v5.LJLIL.LJ;
        if (viewGroup9 != null && (findViewById = viewGroup9.findViewById(R.id.hzr)) != null) {
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(findViewById, (Property<View, Float>) View.ALPHA, f2, f3);
            ofFloat5.setDuration(j2);
            if (builder != null) {
                builder.with(ofFloat5);
            }
        }
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: X.7vE
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animation) {
                o.LJIIIZ(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animation) {
                o.LJIIIZ(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animation) {
                o.LJIIIZ(animation, "animation");
                if (z3) {
                    activityC45651qj.finish();
                    activityC45651qj.overridePendingTransition(0, 0);
                }
                if (z4) {
                    new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS39S0100000_3(c201237v5, 138), 100L);
                }
                c201237v5.LJLIL.LJII.LLIILZL.setValue(Boolean.FALSE);
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animation) {
                o.LJIIIZ(animation, "animation");
                if (z3) {
                    activityC45651qj.finish();
                    activityC45651qj.overridePendingTransition(0, 0);
                }
                if (z4) {
                    new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS39S0100000_3(c201237v5, 139), 100L);
                }
                c201237v5.LJLIL.LJII.LLIILZL.setValue(Boolean.FALSE);
            }
        });
        animatorSet.setInterpolator(C18950ol.LIZIZ(0.34f, 0.69f, 0.1f, 1.0f));
        animatorSet.start();
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LIZJ(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJII(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C212418Vh.LIZIZ(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C56412MCa<OSK<A, B, C>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88474Ynu<? super C3C8, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C212418Vh.LIZLLL(this, assemViewModel, tbw, tbw2, tbw3, c56412MCa, interfaceC88472Yns, interfaceC88474Ynu);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C56412MCa<OSL<A, B, C, D>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88475Ynv<? super C3C8, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C212418Vh.LJ(this, assemViewModel, tbw, tbw2, tbw3, tbw4, c56412MCa, interfaceC88472Yns, interfaceC88475Ynv);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D, E> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C56412MCa<OSM<A, B, C, D, E>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88476Ynw<? super C3C8, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C212418Vh.LJFF(this, assemViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c56412MCa, interfaceC88472Yns, interfaceC88476Ynw);
    }
}
