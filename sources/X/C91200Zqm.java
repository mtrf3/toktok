package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.IXTabPanelAbility;
import java.util.HashMap;
import kotlin.jvm.internal.IDqS421S0100000_29;

/* renamed from: X.Zqm, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91200Zqm {
    public static final HashMap<Fragment, C91199Zql> LIZ = new HashMap<>();

    public static void LIZIZ(View view, Fragment fragment, IXTabPanelAbility iXTabPanelAbility) {
        if (iXTabPanelAbility != null && view != null) {
            IDqS421S0100000_29 iDqS421S0100000_29 = new IDqS421S0100000_29(iXTabPanelAbility, 65);
            C91199Zql c91199Zql = LIZ.get(fragment);
            if (c91199Zql != null) {
                HashMap<View, Animator> hashMap = c91199Zql.LIZ;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
                ofFloat.setInterpolator(new LinearInterpolator());
                ofFloat.setDuration(250L);
                hashMap.put(view, ofFloat);
                HashMap<View, Animator> hashMap2 = c91199Zql.LIZIZ;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
                ofFloat2.setInterpolator(new LinearInterpolator());
                ofFloat2.setDuration(250L);
                hashMap2.put(view, ofFloat2);
            }
            if (((Boolean) iDqS421S0100000_29.invoke()).booleanValue()) {
                view.setAlpha(0.0f);
            }
        }
    }

    public static void LIZLLL(View view, Fragment fragment, IXTabPanelAbility iXTabPanelAbility) {
        if (iXTabPanelAbility != null && view != null) {
            Float valueOf = Float.valueOf(iXTabPanelAbility.F7());
            IDqS421S0100000_29 iDqS421S0100000_29 = new IDqS421S0100000_29(iXTabPanelAbility, 67);
            if (valueOf == null) {
                return;
            }
            C91199Zql c91199Zql = LIZ.get(fragment);
            if (c91199Zql != null) {
                HashMap<View, Animator> hashMap = c91199Zql.LIZ;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", 0.0f, -C32151Nz.LJIIZILJ(86));
                ofFloat.setInterpolator(new SJJ());
                ofFloat.setDuration(250L);
                hashMap.put(view, ofFloat);
                HashMap<View, Animator> hashMap2 = c91199Zql.LIZIZ;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "translationY", -C32151Nz.LJIIZILJ(86), 0.0f);
                ofFloat2.setInterpolator(new SJJ());
                ofFloat2.setDuration(250L);
                ofFloat2.addListener(new C91201Zqn());
                hashMap2.put(view, ofFloat2);
            }
            if (!((Boolean) iDqS421S0100000_29.invoke()).booleanValue()) {
                return;
            }
            view.setTranslationY(-C32151Nz.LJIIZILJ(86));
        }
    }

    public static void LIZ(Fragment fragment, View view, Float f, InterfaceC65784Pro interfaceC65784Pro) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("addTranslationAnimatorWithAbsoluteDistance distance is ");
        LIZ2.append(f);
        X1D.LIZIZ(LIZ2);
        if (f == null) {
            return;
        }
        C91199Zql c91199Zql = LIZ.get(fragment);
        if (c91199Zql != null) {
            HashMap<View, Animator> hashMap = c91199Zql.LIZ;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", 0.0f, -f.floatValue());
            ofFloat.setInterpolator(new SJJ());
            ofFloat.setDuration(250L);
            hashMap.put(view, ofFloat);
            HashMap<View, Animator> hashMap2 = c91199Zql.LIZIZ;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "translationY", -f.floatValue(), 0.0f);
            ofFloat2.setInterpolator(new SJJ());
            ofFloat2.setDuration(250L);
            hashMap2.put(view, ofFloat2);
        }
        if (((Boolean) interfaceC65784Pro.invoke()).booleanValue()) {
            view.setTranslationY(-f.floatValue());
        }
    }

    public static void LIZJ(View view, Fragment fragment, IXTabPanelAbility iXTabPanelAbility, float f) {
        if (view != null) {
            LIZ(fragment, view, Float.valueOf(f), new IDqS421S0100000_29(iXTabPanelAbility, 66));
        }
    }
}
