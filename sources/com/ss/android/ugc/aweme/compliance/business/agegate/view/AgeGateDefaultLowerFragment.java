package com.ss.android.ugc.aweme.compliance.business.agegate.view;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C221108m2;
import X.C29S;
import X.C3C5;
import X.C43286Gyo;
import X.C62822Ol8;
import X.C63761P0r;
import X.C76800UCe;
import X.C81107VsN;
import X.C81114VsU;
import X.C81115VsV;
import X.C85990Xow;
import X.C87093YGb;
import X.C90903hW;
import X.OPZ;
import X.ORZ;
import X.SY4;
import Y.ACListenerS34S0100000_14;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class AgeGateDefaultLowerFragment extends AgeGateBaseLowerFragment {
    public int LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public boolean LJLJJI;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 56));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(C81115VsV.LJLIL);

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
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

    @Override // com.ss.android.ugc.aweme.compliance.business.agegate.view.AgeGateBaseLowerFragment
    public final MutableLiveData<C76800UCe> vl() {
        return ((AgeGateDefaultLowerViewModel) this.LJLJJL.getValue()).LJLJI;
    }

    @Override // com.ss.android.ugc.aweme.compliance.business.agegate.view.AgeGateBaseLowerFragment
    public final MutableLiveData wl() {
        return ((AgeGateDefaultLowerViewModel) this.LJLJJL.getValue()).LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.compliance.business.agegate.view.AgeGateBaseLowerFragment
    public final LiveData xl() {
        return ((AgeGateDefaultLowerViewModel) this.LJLJJL.getValue()).LJLILLLLZI;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        String str;
        String str2;
        super.onDestroy();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C43286Gyo.LIZ.getClass();
        Locale locale = new Locale(C87093YGb.LIZ(), C85990Xow.LIZ());
        DateFormat dateInstance = DateFormat.getDateInstance(3, locale);
        o.LJII(dateInstance, "null cannot be cast to non-null type java.text.SimpleDateFormat");
        String pattern = ((SimpleDateFormat) dateInstance).toLocalizedPattern();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        o.LJIIIIZZ(pattern, "pattern");
        String lowerCase = pattern.toLowerCase(locale);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        int length = lowerCase.length();
        for (int i = 0; i < length; i++) {
            char charAt = lowerCase.charAt(i);
            if (!hashSet.contains(Character.valueOf(charAt))) {
                if (charAt == 'y') {
                    arrayList.add("yyyy");
                } else if (charAt == 'm') {
                    arrayList.add("mm");
                } else if (charAt == 'd') {
                    arrayList.add("dd");
                }
                hashSet.add(Character.valueOf(charAt));
            }
        }
        linkedHashMap.put("default_format", ORZ.LLD(arrayList, "", null, null, null, 62));
        linkedHashMap.put("day", String.valueOf(this.LJLIL));
        linkedHashMap.put("month", String.valueOf(this.LJLILLLLZI));
        linkedHashMap.put("year", String.valueOf(this.LJLJI));
        linkedHashMap.put("selected_cnt", String.valueOf(Math.max(this.LJLIL, Math.max(this.LJLILLLLZI, this.LJLJI))));
        if (this.LJLJJI) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_submit", str);
        if (o.LJ(((Map) this.LJLJJLL.getValue()).get("user_type"), "edit")) {
            str2 = "age_edit_scroll_results";
        } else {
            str2 = "age_scroll_result";
        }
        OPZ.LJ(str2, linkedHashMap, (Map) this.LJLJJLL.getValue());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ((AgeGateDefaultLowerViewModel) this.LJLJJL.getValue()).LJLILLLLZI.postValue(Boolean.FALSE);
    }

    @Override // com.ss.android.ugc.aweme.compliance.business.agegate.view.AgeGateBaseLowerFragment
    public final void Al(boolean z) {
        int i;
        View _$_findCachedViewById = _$_findCachedViewById(R.id.yq);
        if (_$_findCachedViewById == null) {
            return;
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        _$_findCachedViewById.setVisibility(i);
    }

    @Override // com.ss.android.ugc.aweme.compliance.business.agegate.view.AgeGateBaseLowerFragment
    public final void Dl(String str) {
        ((TextView) _$_findCachedViewById(R.id.yq)).setText(str);
    }

    @Override // com.ss.android.ugc.aweme.compliance.business.agegate.view.AgeGateBaseLowerFragment
    public final void Gl(Date date) {
        C81107VsN c81107VsN = (C81107VsN) _$_findCachedViewById(R.id.ym);
        c81107VsN.getClass();
        Calendar calendar = Calendar.getInstance();
        calendar.set(6, calendar.getActualMaximum(6));
        calendar.add(1, -1);
        if (calendar.getTime().before(date)) {
            calendar = Calendar.getInstance();
            calendar.set(date.getYear() + 1900, 11, 31);
        }
        c81107VsN.setNonRecurrentForYear(true);
        c81107VsN.LIZIZ(date);
        c81107VsN.setUpperBoundDate(calendar);
    }

    @Override // com.ss.android.ugc.aweme.compliance.business.agegate.view.AgeGateBaseLowerFragment
    public final void Hl(String str) {
        TextView textView = (TextView) _$_findCachedViewById(R.id.yn);
        if (textView != null) {
            textView.setText(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.business.agegate.view.AgeGateBaseLowerFragment
    public final void Il(String str) {
        TextView textView = (TextView) _$_findCachedViewById(R.id.yn);
        if (textView != null) {
            textView.setHint(str);
            textView.setInputType(0);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setEnabled(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.business.agegate.view.AgeGateBaseLowerFragment
    public final void Jl(boolean z) {
        ((SY4) _$_findCachedViewById(R.id.yr)).setEnabled(z);
        if (z) {
            _$_findCachedViewById(R.id.yu).setVisibility(8);
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.business.agegate.view.AgeGateBaseLowerFragment
    public final void Kl(boolean z) {
        ((SY4) _$_findCachedViewById(R.id.yr)).setLoading(z);
    }

    @Override // com.ss.android.ugc.aweme.compliance.business.agegate.view.AgeGateBaseLowerFragment
    public final void Ll(String str) {
        TextView textView = (TextView) _$_findCachedViewById(R.id.yr);
        if (textView == null) {
            return;
        }
        textView.setText(str);
    }

    @Override // com.ss.android.ugc.aweme.compliance.business.agegate.view.AgeGateBaseLowerFragment
    public final void Ml(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        ((C81107VsN) _$_findCachedViewById(R.id.ym)).setUpperBoundDate(calendar);
    }

    @Override // com.ss.android.ugc.aweme.compliance.business.agegate.view.AgeGateBaseLowerFragment
    public final void Nl(String str, boolean z) {
        ((ImageView) _$_findCachedViewById(R.id.yt)).setColorFilter(-65536, PorterDuff.Mode.SRC_IN);
        _$_findCachedViewById(R.id.yu).setVisibility(0);
        ((TextView) _$_findCachedViewById(R.id.yp)).setText(str);
        if (z) {
            View ageGateWarningLayout = _$_findCachedViewById(R.id.yu);
            o.LJIIIIZZ(ageGateWarningLayout, "ageGateWarningLayout");
            Context context = getContext();
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setInterpolator(new LinearInterpolator());
            animatorSet.playSequentially(ObjectAnimator.ofFloat(ageGateWarningLayout, "translationX", 0.0f, -C63761P0r.LIZIZ(6.0d, context)).setDuration(80L), ObjectAnimator.ofFloat(ageGateWarningLayout, "translationX", -C63761P0r.LIZIZ(6.0d, context), 0.0f).setDuration(80L), ObjectAnimator.ofFloat(ageGateWarningLayout, "translationX", 0.0f, -C63761P0r.LIZIZ(4.0d, context)).setDuration(60L), ObjectAnimator.ofFloat(ageGateWarningLayout, "translationX", -C63761P0r.LIZIZ(4.0d, context), 0.0f).setDuration(60L), ObjectAnimator.ofFloat(ageGateWarningLayout, "translationX", 0.0f, -C63761P0r.LIZIZ(2.0d, context)).setDuration(40L), ObjectAnimator.ofFloat(ageGateWarningLayout, "translationX", -C63761P0r.LIZIZ(2.0d, context), 0.0f).setDuration(40L), ObjectAnimator.ofFloat(ageGateWarningLayout, "translationX", 0.0f, -C63761P0r.LIZIZ(1.0d, context)).setDuration(20L), ObjectAnimator.ofFloat(ageGateWarningLayout, "translationX", -C63761P0r.LIZIZ(1.0d, context), 0.0f).setDuration(20L));
            animatorSet.start();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        SY4 sy4 = (SY4) _$_findCachedViewById(R.id.yr);
        if (sy4 != null) {
            C16880lQ.LJJIZ(sy4, new ACListenerS34S0100000_14(this, 11));
        }
        C81107VsN c81107VsN = (C81107VsN) _$_findCachedViewById(R.id.ym);
        if (c81107VsN != null) {
            c81107VsN.LJLJL = new C81114VsU(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.gq, viewGroup, false);
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
