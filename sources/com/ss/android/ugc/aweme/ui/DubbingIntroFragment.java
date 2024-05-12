package com.ss.android.ugc.aweme.ui;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16530kr;
import X.C16880lQ;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C26338AVi;
import X.C29S;
import X.C3C5;
import X.C76800UCe;
import X.C7MY;
import X.C90193gN;
import X.C90903hW;
import X.EnumC72807Shn;
import X.SY4;
import X.T5U;
import X.W5F;
import X.W5U;
import Y.ACListenerS21S0100000_1;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.setting.ImagesData;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes2.dex */
public final class DubbingIntroFragment extends Fragment {
    public final Map<Integer, View> LJLIL = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLIL).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object LIZ;
        int i;
        int i2;
        String str;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.lv0);
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark_small;
        LIZJ.LIZIZ(new AqS151S0100000_1(this, 728));
        c235119Kp.LIZIZ(LIZJ);
        c252709vu.setNavActions(c235119Kp);
        ((SY4) _$_findCachedViewById(R.id.br1)).setEnabled(true);
        _$_findCachedViewById(R.id.br1).setClickable(true);
        C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.br1), new ACListenerS21S0100000_1(this, 121));
        Object obj = null;
        try {
            LIZ = (ImagesData) SettingsManager.LIZLLL().LJIIIIZZ("cla_auto_dubbing_education_images", ImagesData.class, null);
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (!C3C5.m12isFailureimpl(LIZ)) {
            obj = LIZ;
        }
        ImagesData imagesData = (ImagesData) obj;
        if (imagesData != null) {
            if (C90193gN.LIZ()) {
                str = imagesData.rtlLight;
            } else {
                str = imagesData.ltrLight;
            }
            if (str != null) {
                W5F LJIIIIZZ = W5U.LJIIIIZZ(str);
                LJIIIIZZ.LJJIIJ = (SmartImageView) _$_findCachedViewById(R.id.eih);
                LJIIIIZZ.LJIJJ = EnumC72807Shn.CENTER_INSIDE;
                C16880lQ.LLJJJ(LJIIIIZZ);
            }
        }
        _$_findCachedViewById(R.id.b21).measure(0, 0);
        int measuredWidth = _$_findCachedViewById(R.id.b21).getMeasuredWidth();
        int LIZIZ = C7MY.LIZIZ(200);
        View button_container = _$_findCachedViewById(R.id.b21);
        o.LJIIIIZZ(button_container, "button_container");
        ViewGroup.LayoutParams layoutParams = button_container.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            i = C16530kr.LIZJ((ViewGroup.MarginLayoutParams) layoutParams);
        } else {
            i = 0;
        }
        int i3 = LIZIZ - i;
        View button_container2 = _$_findCachedViewById(R.id.b21);
        o.LJIIIIZZ(button_container2, "button_container");
        ViewGroup.LayoutParams layoutParams2 = button_container2.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            i2 = C16530kr.LIZIZ((ViewGroup.MarginLayoutParams) layoutParams2);
        } else {
            i2 = 0;
        }
        if ((i3 - i2) - measuredWidth < 0) {
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -2);
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
            int measuredWidth2 = _$_findCachedViewById(R.id.lk_).getMeasuredWidth();
            int measuredWidth3 = _$_findCachedViewById(R.id.cia).getMeasuredWidth();
            float f = measuredWidth3;
            float f2 = measuredWidth3 + measuredWidth2;
            layoutParams3.weight = f / f2;
            layoutParams4.weight = measuredWidth2 / f2;
            _$_findCachedViewById(R.id.cib).setLayoutParams(layoutParams3);
            _$_findCachedViewById(R.id.lk_).setLayoutParams(layoutParams4);
        } else {
            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
            _$_findCachedViewById(R.id.cib).setLayoutParams(layoutParams5);
            _$_findCachedViewById(R.id.lk_).setLayoutParams(layoutParams6);
        }
        Context context = getContext();
        if (context != null) {
            float f3 = (r2.widthPixels / context.getResources().getDisplayMetrics().density) / 375;
            View _$_findCachedViewById = _$_findCachedViewById(R.id.egy);
            _$_findCachedViewById.setScaleX(f3);
            _$_findCachedViewById.setScaleY(f3);
            float f4 = 160;
            int LIZIZ2 = C7MY.LIZIZ((int) (((f3 * f4) - f4) / 2));
            C26338AVi.LJI(_$_findCachedViewById, null, Integer.valueOf(LIZIZ2), null, Integer.valueOf(LIZIZ2), false, 21);
        }
        String string = getString(R.string.db3);
        o.LJIIIIZZ(string, "getString(R.string.cla_autoddubing_popup_desc)");
        String string2 = getString(R.string.db6);
        o.LJIIIIZZ(string2, "getString(R.string.cla_autodubbing_bold_turnoff)");
        int LJJLIIIJL = s.LJJLIIIJL(string, string2, 0, false, 6);
        if (LJJLIIIJL >= 0) {
            int length = string2.length() + LJJLIIIJL;
            int length2 = string.length();
            if (length > length2) {
                length = length2;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            spannableStringBuilder.setSpan(new T5U(42, true), LJJLIIIJL, length, 33);
            ((TextView) _$_findCachedViewById(R.id.eqy)).setText(spannableStringBuilder);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.anl, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }
}
