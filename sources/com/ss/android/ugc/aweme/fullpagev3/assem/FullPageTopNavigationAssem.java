package com.ss.android.ugc.aweme.fullpagev3.assem;

import X.ActivityC45651qj;
import X.C018905p;
import X.C04270Et;
import X.C16880lQ;
import X.C184387Lm;
import X.C212428Vi;
import X.C32151Nz;
import X.C38619FDr;
import X.C57434MgQ;
import X.O6R;
import X.Z9N;
import Y.ACListenerS23S0100000_3;
import Y.AObserverS67S0200000_3;
import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.viewmodel.PostModeContainerViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FullPageTopNavigationAssem extends BaseFullPageAssem {
    public View LJLJJI;
    public View LJLJJL;
    public AnimatorSet LJLJJLL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();

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

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ViewGroup viewGroup;
        Context context;
        View _$_findCachedViewById;
        LifecycleOwner LIZIZ;
        PostModeContainerViewModel v3;
        MutableLiveData<Boolean> mutableLiveData;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup viewGroup2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        View containerView = getContainerView();
        if (containerView instanceof ViewGroup) {
            viewGroup = (ViewGroup) containerView;
        } else {
            viewGroup = null;
        }
        Context context2 = view.getContext();
        o.LJIIIIZZ(context2, "view.context");
        C38619FDr.LIZIZ(R.layout.c20, context2, viewGroup, true);
        if (Z9N.LIZIZ.LLJLIL()) {
            if (Build.VERSION.SDK_INT >= 24) {
                View view2 = new View(C212428Vi.LIZ(this));
                view2.setRotation(180.0f);
                view2.setBackground(C04270Et.LIZIZ(view2.getContext(), R.drawable.bw0));
                View containerView2 = getContainerView();
                if ((containerView2 instanceof ViewGroup) && (viewGroup2 = (ViewGroup) containerView2) != null) {
                    viewGroup2.addView(view2, -1, O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(UserLevelGeckoUpdateSetting.DEFAULT))));
                }
                this.LJLJJI = view2;
            }
        } else if (Build.VERSION.SDK_INT >= 24 && (context = getContext()) != null && (_$_findCachedViewById = _$_findCachedViewById(R.id.hzq)) != null) {
            _$_findCachedViewById.setBackground(C04270Et.LIZIZ(context, R.drawable.bw0));
        }
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ == null) {
            return;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(R.id.e4d);
        View findViewById = constraintLayout.findViewById(R.id.kf_);
        if (findViewById != null && (layoutParams = findViewById.getLayoutParams()) != null) {
            layoutParams.height = C184387Lm.LJ(LIZ);
        }
        View findViewById2 = constraintLayout.findViewById(R.id.kf_);
        if (findViewById2 != null) {
            findViewById2.invalidate();
        }
        TuxIconView tuxIconView = (TuxIconView) constraintLayout.findViewById(R.id.aeu);
        if (tuxIconView != null) {
            C16880lQ.LJJJ(tuxIconView, new ACListenerS23S0100000_3(this, 254));
        }
        if (!E3(constraintLayout, true)) {
            TuxIconView tuxIconView2 = (TuxIconView) constraintLayout.findViewById(R.id.aeu);
            if (tuxIconView2 != null) {
                tuxIconView2.setIconHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(18)));
            }
            TuxIconView tuxIconView3 = (TuxIconView) constraintLayout.findViewById(R.id.aeu);
            if (tuxIconView3 != null) {
                tuxIconView3.setIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(18)));
            }
            C3(constraintLayout, true);
        }
        F3(true, constraintLayout);
        ActivityC45651qj LIZ2 = C212428Vi.LIZ(this);
        if (LIZ2 == null || (LIZIZ = C57434MgQ.LIZIZ(LIZ2)) == null || (v3 = v3()) == null || (mutableLiveData = v3.LLILIL) == null) {
            return;
        }
        mutableLiveData.observe(LIZIZ, new AObserverS67S0200000_3(this, constraintLayout, 9));
    }

    public static void C3(ConstraintLayout constraintLayout, boolean z) {
        int i;
        AppCompatImageView appCompatImageView = (AppCompatImageView) constraintLayout.findViewById(R.id.aeu);
        if (appCompatImageView != null) {
            if (z) {
                i = R.drawable.bvy;
            } else {
                i = 0;
            }
            appCompatImageView.setBackgroundResource(i);
        }
    }

    public static boolean E3(ConstraintLayout constraintLayout, boolean z) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Z9N z9n = Z9N.LIZIZ;
        boolean z2 = false;
        if (!z9n.LLILZIL()) {
            return false;
        }
        if (z9n.LLJJJIL() && z) {
            z2 = true;
        }
        TuxIconView tuxIconView = (TuxIconView) constraintLayout.findViewById(R.id.aeu);
        if (tuxIconView != null) {
            ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
            if (layoutParams instanceof C018905p) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            } else {
                marginLayoutParams = null;
            }
            if (marginLayoutParams != null) {
                if (z2) {
                    i4 = 30;
                } else {
                    i4 = 24;
                }
                marginLayoutParams.width = O6R.LJJIIZ(C32151Nz.LJIIZILJ(i4));
                if (z2) {
                    i5 = 30;
                } else {
                    i5 = 24;
                }
                marginLayoutParams.height = O6R.LJJIIZ(C32151Nz.LJIIZILJ(i5));
                if (z) {
                    i6 = 8;
                } else {
                    i6 = 4;
                }
                marginLayoutParams.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(i6))));
            }
            if (z2) {
                i = 18;
            } else {
                i = 24;
            }
            tuxIconView.setIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(i)));
            if (z2) {
                i2 = 18;
            } else {
                i2 = 24;
            }
            tuxIconView.setIconHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(i2)));
            if (z) {
                i3 = R.attr.dj;
            } else {
                i3 = R.attr.go;
            }
            tuxIconView.setTintColorRes(i3);
        }
        C3(constraintLayout, z2);
        return true;
    }

    public final void F3(boolean z, ConstraintLayout constraintLayout) {
        ActivityC45651qj LIZ;
        Fragment LJJJIL;
        Aweme aweme;
        int i;
        String str;
        String str2;
        Z9N z9n = Z9N.LIZIZ;
        if (!z9n.LLILZIL() || (LIZ = C212428Vi.LIZ(this)) == null || (LJJJIL = LIZ.getSupportFragmentManager().LJJJIL("PostModeDetailFragment")) == null || (aweme = A3().getAweme()) == null) {
            return;
        }
        View view = this.LJLJJI;
        if (view != null) {
            if (z && z9n.LLJLIL()) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
        boolean z2 = !z;
        View containerView = getContainerView();
        PostModeDetailParams postModeDetailParams = A3().getPostModeDetailParams();
        if (postModeDetailParams != null) {
            str = postModeDetailParams.eventType;
        } else {
            str = null;
        }
        PostModeDetailParams postModeDetailParams2 = A3().getPostModeDetailParams();
        if (postModeDetailParams2 != null) {
            str2 = postModeDetailParams2.tabName;
        } else {
            str2 = null;
        }
        z9n.LLLLLJIL(z2, LJJJIL, containerView, aweme, str, str2);
        if (z) {
            if (z9n.LLJJJIL()) {
                TuxIconView tuxIconView = (TuxIconView) constraintLayout.findViewById(R.id.f_e);
                tuxIconView.setBackground(C04270Et.LIZIZ(tuxIconView.getContext(), R.drawable.a3s));
                tuxIconView.setTintColorRes(R.attr.dj);
                tuxIconView.setIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(18)));
                tuxIconView.setIconHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(18)));
                return;
            }
            return;
        }
        if (!z9n.LLILZIL()) {
            return;
        }
        TuxIconView tuxIconView2 = (TuxIconView) constraintLayout.findViewById(R.id.f_e);
        tuxIconView2.setBackground(null);
        tuxIconView2.setTintColorRes(R.attr.go);
        tuxIconView2.setIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(24)));
        tuxIconView2.setIconHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(24)));
    }
}
