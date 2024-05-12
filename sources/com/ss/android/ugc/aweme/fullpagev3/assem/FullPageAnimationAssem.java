package com.ss.android.ugc.aweme.fullpagev3.assem;

import X.ActivityC45651qj;
import X.C184077Kh;
import X.C18950ol;
import X.C201307vC;
import X.C201377vJ;
import X.C2049182l;
import X.C2053384b;
import X.C212428Vi;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C221108m2;
import X.C45804HyK;
import X.C57092Lx;
import X.C61447O9r;
import X.C62819Ol5;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8W0;
import X.C8YN;
import X.EnumC2053484c;
import X.InterfaceC65784Pro;
import X.KL2;
import X.O6R;
import X.OSZ;
import X.TBT;
import Y.AObserverS71S0100000_3;
import Y.ARunnableS39S0100000_3;
import Y.AUListenerS92S0100000_3;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImage;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.ui.common.PhotoSharedViewModel;
import com.ss.android.ugc.aweme.viewmodel.PostModeContainerViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FullPageAnimationAssem extends BaseFullPageAssem {
    public int LJLJJI;
    public final C214378bB LJLJJLL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 418));

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public FullPageAnimationAssem() {
        InterfaceC65784Pro LJIILJJIL;
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(this, 417);
        C65776Prg LIZ = C65352Pkq.LIZ(PhotoSharedViewModel.class);
        C201307vC c201307vC = C201307vC.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJIILJJIL = new AqS153S0100000_3((C8W0) this, 419);
        } else {
            LJIILJJIL = C78926UyI.LJIILJJIL(this, true);
        }
        this.LJLJJLL = new C214378bB(LIZ, aqS153S0100000_3, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, c201307vC, LJIILJJIL, C78926UyI.LJIIZILJ(this, true));
    }

    public final OSZ<Float, Integer> E3() {
        PhotoModeImage photoModeImage;
        Integer num;
        int LJJIIZ;
        int LJIIIZ = KL2.LJIIIZ(getContext());
        PostModeDetailParams postModeDetailParams = A3().getPostModeDetailParams();
        if (postModeDetailParams != null) {
            LJIIIZ = postModeDetailParams.imageHeight;
        }
        Aweme aweme = A3().getAweme();
        Integer num2 = null;
        if (aweme != null) {
            photoModeImage = C62819Ol5.LJJIII(this.LJLJJI, aweme);
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
        EnumC2053484c LIZ2 = C2053384b.LIZ(getContext(), A3().getAweme());
        float LIZJ = C2049182l.LIZJ(C2049182l.LIZIZ(LIZ, LIZ2), LIZ2, LJIIIZ, A3().getAweme(), this.LJLJJI);
        if (Float.isNaN(LIZJ)) {
            LJJIIZ = 0;
        } else {
            LJJIIZ = O6R.LJJIIZ(LJIIIZ * LIZJ);
        }
        return new OSZ<>(Float.valueOf(((Number) C2049182l.LIZIZ.getValue()).floatValue()), Integer.valueOf(LJJIIZ));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        MutableLiveData mutableLiveData;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        int intValue = E3().getSecond().intValue();
        View _$_findCachedViewById = _$_findCachedViewById(R.id.hp0);
        if (_$_findCachedViewById != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) _$_findCachedViewById.getLayoutParams();
            if (marginLayoutParams != null) {
                marginLayoutParams.height = intValue;
            }
            _$_findCachedViewById.setLayoutParams(marginLayoutParams);
        }
        PostModeContainerViewModel v3 = v3();
        if (v3 != null && (mutableLiveData = v3.LJLILLLLZI) != null) {
            getActualLifecycleOwner();
            mutableLiveData.observe(this, new AObserverS71S0100000_3(this, 54));
        }
        C8YN.LJII(this, x3(), new TBT() { // from class: X.7vD
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C203127y8) obj).LJLLLLLL);
            }
        }, null, new AqS185S0100000_3(this, 197), 6);
        C8YN.LJII(this, x3(), new TBT() { // from class: X.7b8
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((C203127y8) obj).LJLIL);
            }
        }, null, new AqS185S0100000_3(this, 198), 6);
    }

    public final ValueAnimator C3(View view, float f, float f2, long j) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.setDuration(j);
        ofFloat.addUpdateListener(new AUListenerS92S0100000_3(view, 9));
        ofFloat.setInterpolator(C18950ol.LIZIZ(0.34f, 0.69f, 0.1f, 1.0f));
        return ofFloat;
    }

    public static void F3(final FullPageAnimationAssem fullPageAnimationAssem, boolean z, boolean z2, long j, int i) {
        final Activity LJIJJ;
        ActivityC45651qj LIZ;
        FragmentManager supportFragmentManager;
        Fragment LJJJIL;
        View view;
        float f;
        float f2;
        float max;
        float f3;
        float f4;
        int i2;
        View findViewById;
        MutableLiveData<Boolean> mutableLiveData;
        PostModeContainerViewModel v3;
        MutableLiveData<Boolean> mutableLiveData2;
        ViewGroup viewGroup;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View findViewById2;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        MutableLiveData<Boolean> mutableLiveData3;
        long j2 = j;
        final boolean z3 = z;
        final boolean z4 = z2;
        if ((i & 1) != 0) {
            z3 = false;
        }
        if ((i & 2) != 0) {
            z4 = false;
        }
        if ((i & 4) != 0) {
            j2 = 300;
        }
        Context context = fullPageAnimationAssem.getContext();
        if (context == null || (LJIJJ = C45804HyK.LJIJJ(context)) == null || (LIZ = C212428Vi.LIZ(fullPageAnimationAssem)) == null || (supportFragmentManager = LIZ.getSupportFragmentManager()) == null || (LJJJIL = supportFragmentManager.LJJJIL("PostModeDetailFragment")) == null || (view = LJJJIL.getView()) == null) {
            return;
        }
        OSZ<Float, Integer> E3 = fullPageAnimationAssem.E3();
        float floatValue = E3.getFirst().floatValue();
        int intValue = E3.getSecond().intValue();
        float f5 = 0.0f;
        if (z4) {
            f = 0.0f;
            f2 = C61447O9r.LJIILIIL;
            max = 0.0f;
            f3 = floatValue;
            floatValue = intValue;
            f4 = 1.0f;
        } else {
            f = C61447O9r.LJIILIIL;
            f2 = 0.0f;
            int i3 = C61447O9r.LJIILJJIL;
            C57092Lx.LIZ.getClass();
            max = Math.max(i3, C61447O9r.LIZ());
            f3 = intValue;
            f4 = 0.0f;
            f5 = 1.0f;
        }
        PostModeContainerViewModel v32 = fullPageAnimationAssem.v3();
        AnimatorSet.Builder builder = null;
        if (v32 != null && (mutableLiveData3 = v32.LLIILZL) != null) {
            mutableLiveData3.setValue(Boolean.TRUE);
        }
        View _$_findCachedViewById = fullPageAnimationAssem._$_findCachedViewById(R.id.hzg);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.setVisibility(8);
        }
        if (((Boolean) C201377vJ.LIZ.getValue()).booleanValue()) {
            View _$_findCachedViewById2 = fullPageAnimationAssem._$_findCachedViewById(R.id.hp0);
            if (_$_findCachedViewById2 != null) {
                ViewGroup.LayoutParams layoutParams = _$_findCachedViewById2.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams;
                    if (marginLayoutParams3 != null) {
                        marginLayoutParams3.height = (int) floatValue;
                    }
                } else {
                    marginLayoutParams3 = null;
                }
                _$_findCachedViewById2.setLayoutParams(marginLayoutParams3);
            }
            if (C61447O9r.LJIILIIL > 0 && (findViewById2 = view.findViewById(R.id.lgd)) != null) {
                ViewGroup.LayoutParams layoutParams2 = findViewById2.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    if (marginLayoutParams2 != null) {
                        marginLayoutParams2.height = (int) f2;
                    }
                } else {
                    marginLayoutParams2 = null;
                }
                findViewById2.setLayoutParams(marginLayoutParams2);
            }
            View findViewById3 = view.findViewById(R.id.bju);
            if (findViewById3 != null) {
                ViewGroup.LayoutParams layoutParams3 = findViewById3.getLayoutParams();
                if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
                    if (marginLayoutParams != null) {
                        marginLayoutParams.height = (int) max;
                    }
                } else {
                    marginLayoutParams = null;
                }
                findViewById3.setLayoutParams(marginLayoutParams);
            }
            View _$_findCachedViewById3 = fullPageAnimationAssem._$_findCachedViewById(R.id.hzj);
            if (_$_findCachedViewById3 != null) {
                _$_findCachedViewById3.setAlpha(f5);
            }
            View _$_findCachedViewById4 = fullPageAnimationAssem._$_findCachedViewById(R.id.hzr);
            if (_$_findCachedViewById4 != null) {
                _$_findCachedViewById4.setAlpha(f5);
            }
            fullPageAnimationAssem._$_findCachedViewById(R.id.e3v).setAlpha(f5);
            if (z4) {
                View findViewById4 = view.findViewById(R.id.e4d);
                if (findViewById4 != null) {
                    findViewById4.setAlpha(f5);
                }
                View findViewById5 = view.findViewById(R.id.ap_);
                if (findViewById5 != null) {
                    findViewById5.setAlpha(f5);
                }
                View containerView = fullPageAnimationAssem.getContainerView();
                if ((containerView instanceof ViewGroup) && (viewGroup = (ViewGroup) containerView) != null) {
                    int childCount = viewGroup.getChildCount();
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt = viewGroup.getChildAt(i4);
                        if (!o.LJ(childAt, fullPageAnimationAssem._$_findCachedViewById(R.id.hp0))) {
                            childAt.setAlpha(f5);
                        }
                    }
                }
            }
            if (z3 && (v3 = fullPageAnimationAssem.v3()) != null && (mutableLiveData2 = v3.LLIIJI) != null) {
                mutableLiveData2.setValue(Boolean.TRUE);
            }
            if (z4) {
                LJIJJ.finish();
                LJIJJ.overridePendingTransition(0, 0);
            }
            PostModeContainerViewModel v33 = fullPageAnimationAssem.v3();
            if (v33 == null || (mutableLiveData = v33.LLIILZL) == null) {
                return;
            }
            mutableLiveData.setValue(Boolean.FALSE);
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        View _$_findCachedViewById5 = fullPageAnimationAssem._$_findCachedViewById(R.id.hp0);
        if (_$_findCachedViewById5 != null) {
            i2 = R.id.bju;
            builder = animatorSet.play(fullPageAnimationAssem.C3(_$_findCachedViewById5, f3, floatValue, j2));
        } else {
            i2 = R.id.bju;
        }
        if (C61447O9r.LJIILIIL > 0 && (findViewById = view.findViewById(R.id.lgd)) != null) {
            ValueAnimator C3 = fullPageAnimationAssem.C3(findViewById, f, f2, j2);
            if (builder != null) {
                builder.with(C3);
            }
        }
        View findViewById6 = view.findViewById(i2);
        if (findViewById6 != null) {
            fullPageAnimationAssem.C3(findViewById6, findViewById6.getMeasuredHeight(), max, j2).start();
        }
        View _$_findCachedViewById6 = fullPageAnimationAssem._$_findCachedViewById(R.id.e3v);
        if (_$_findCachedViewById6 != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(_$_findCachedViewById6, (Property<View, Float>) View.ALPHA, f4, f5);
            ofFloat.setDuration(j2);
            if (builder != null) {
                builder.with(ofFloat);
            }
        }
        if (z4) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view.findViewById(R.id.e4d), (Property<View, Float>) View.ALPHA, f4, f5);
            ofFloat2.setDuration(j2);
            if (builder != null) {
                builder.with(ofFloat2);
            }
            View findViewById7 = view.findViewById(R.id.ap_);
            if (findViewById7 != null) {
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(findViewById7, (Property<View, Float>) View.ALPHA, f4, f5);
                ofFloat3.setDuration(j2);
                if (builder != null) {
                    builder.with(ofFloat3);
                }
            }
        }
        View _$_findCachedViewById7 = fullPageAnimationAssem._$_findCachedViewById(R.id.hzj);
        if (_$_findCachedViewById7 != null) {
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(_$_findCachedViewById7, (Property<View, Float>) View.ALPHA, f4, f5);
            ofFloat4.setDuration(j2);
            if (builder != null) {
                builder.with(ofFloat4);
            }
        }
        View _$_findCachedViewById8 = fullPageAnimationAssem._$_findCachedViewById(R.id.hzr);
        if (_$_findCachedViewById8 != null) {
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(_$_findCachedViewById8, (Property<View, Float>) View.ALPHA, f4, f5);
            ofFloat5.setDuration(j2);
            if (builder != null) {
                builder.with(ofFloat5);
            }
        }
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: X.7vF
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
                MutableLiveData<Boolean> mutableLiveData4;
                o.LJIIIZ(animation, "animation");
                if (z4) {
                    LJIJJ.finish();
                    LJIJJ.overridePendingTransition(0, 0);
                }
                if (z3) {
                    new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS39S0100000_3(fullPageAnimationAssem, 178), 100L);
                }
                PostModeContainerViewModel v34 = fullPageAnimationAssem.v3();
                if (v34 == null || (mutableLiveData4 = v34.LLIILZL) == null) {
                    return;
                }
                mutableLiveData4.setValue(Boolean.FALSE);
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animation) {
                MutableLiveData<Boolean> mutableLiveData4;
                o.LJIIIZ(animation, "animation");
                if (z4) {
                    LJIJJ.finish();
                    LJIJJ.overridePendingTransition(0, 0);
                }
                if (z3) {
                    new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS39S0100000_3(fullPageAnimationAssem, 179), 100L);
                }
                PostModeContainerViewModel v34 = fullPageAnimationAssem.v3();
                if (v34 == null || (mutableLiveData4 = v34.LLIILZL) == null) {
                    return;
                }
                mutableLiveData4.setValue(Boolean.FALSE);
            }
        });
        animatorSet.setInterpolator(C18950ol.LIZIZ(0.34f, 0.69f, 0.1f, 1.0f));
        animatorSet.start();
    }
}
