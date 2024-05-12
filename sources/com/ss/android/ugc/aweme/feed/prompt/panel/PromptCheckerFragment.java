package com.ss.android.ugc.aweme.feed.prompt.panel;

import X.AbstractC73946T0k;
import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C221108m2;
import X.C234529Ii;
import X.C235119Kp;
import X.C237639Uh;
import X.C238299Wv;
import X.C26244ARs;
import X.C29S;
import X.C3C5;
import X.C48203Ivv;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C73305Spp;
import X.C73306Spq;
import X.C73320Sq4;
import X.C73470SsU;
import X.C73495Sst;
import X.C73500Ssy;
import X.C73969T1h;
import X.C76800UCe;
import X.C78685UuP;
import X.C90903hW;
import X.C9KF;
import X.C9UZ;
import X.EF7;
import X.InterfaceC219588ja;
import X.SY4;
import X.T16;
import X.V1B;
import X.X1D;
import Y.ACListenerS24S0100000_4;
import Y.AfS56S0100000_4;
import Y.IDCListenerS280S0100000_4;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.feed.prompt.FeedPromptViewModel;
import com.ss.android.ugc.aweme.feed.prompt.api.FeedPromptApi;
import com.ss.android.ugc.aweme.feed.prompt.api.PromptTransformResp;
import com.ss.android.ugc.aweme.feed.prompt.data.PromptStruct;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS47S0110000_4;
import kotlin.jvm.internal.AqS6S0111000_4;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes5.dex */
public final class PromptCheckerFragment extends Fragment implements InterfaceC219588ja {
    public PromptStruct LJLILLLLZI;
    public Long LJLJI;
    public String LJLJJI;
    public String LJLJJL;
    public String LJLJJLL;
    public Boolean LJLJL;
    public boolean LJLJLLL;
    public FeedPromptViewModel LJLLI;
    public C73495Sst LJLLILLLL;
    public final Map<Integer, View> LJLLJ = new LinkedHashMap();
    public String LJLIL = "homepage_hot";
    public String LJLJLJ = "";
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(C9UZ.LJLIL);

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLJ;
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

    @Override // X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        C235119Kp c235119Kp = new C235119Kp();
        C9KF c9kf = new C9KF();
        String string = getString(R.string.jhq);
        o.LJIIIIZZ(string, "getString(R.string.pfFee…_inputBottomSheet_header)");
        c9kf.LIZJ = string;
        c235119Kp.LIZJ = c9kf;
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_chevron_left_offset_ltr;
        LIZJ.LIZLLL = true;
        LIZJ.LIZIZ(new AqS154S0100000_4(this, 342));
        c235119Kp.LIZLLL(LIZJ);
        C234529Ii LIZJ2 = s1.LIZJ();
        LIZJ2.LIZJ = R.raw.icon_x_mark;
        LIZJ2.LIZLLL = true;
        LIZJ2.LIZIZ(new AqS154S0100000_4(this, 343));
        c235119Kp.LIZIZ(LIZJ2);
        return c235119Kp;
    }

    public final String vl() {
        if (C78685UuP.LJJJZ(this.LJLJJL)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LJLJJL);
            LIZ.append(',');
            LIZ.append((Object) ((AppCompatTextView) _$_findCachedViewById(R.id.br3)).getText());
            return X1D.LIZIZ(LIZ);
        }
        return ((AppCompatTextView) _$_findCachedViewById(R.id.br3)).getText().toString();
    }

    public final String wl() {
        if (C78685UuP.LJJJZ(this.LJLJJI)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LJLJJI);
            LIZ.append(',');
            LIZ.append(this.LJLJI);
            return X1D.LIZIZ(LIZ);
        }
        return String.valueOf(this.LJLJI);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        Dialog dialog;
        super.onDestroy();
        DialogFragment dialogFragment = (DialogFragment) getParentFragment();
        if (dialogFragment != null && dialogFragment.isAdded() && 1 != 0 && dialogFragment != null && (dialog = dialogFragment.getDialog()) != null) {
            dialog.setOnCancelListener(null);
        }
        C73495Sst c73495Sst = this.LJLLILLLL;
        if (c73495Sst != null && !c73495Sst.isDisposed()) {
            c73495Sst.dispose();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLLJ).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
    }

    public final void Al(PromptStruct promptStruct) {
        if (promptStruct == null) {
            return;
        }
        if (!C48203Ivv.LJ(EF7.LIZIZ())) {
            Dl(999999, null);
            return;
        }
        _$_findCachedViewById(R.id.b_w).setVisibility(0);
        _$_findCachedViewById(R.id.br5).setVisibility(8);
        ((C73305Spp) _$_findCachedViewById(R.id.kf_)).setVisibility(8);
        FeedPromptApi.LIZ.getClass();
        C73470SsU LJIJJ = C237639Uh.LIZ().promptTransform(promptStruct.getPrompt(), null, null, null).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ());
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        AbstractC73946T0k abstractC73946T0k = T16.LIZIZ;
        C73320Sq4.LIZ(timeUnit, "unit is null");
        C73320Sq4.LIZ(abstractC73946T0k, "scheduler is null");
        this.LJLLILLLL = (C73495Sst) new C73500Ssy(LJIJJ, 10000L, timeUnit, abstractC73946T0k, null).LJJII(new AfS56S0100000_4(this, 25), new AfS56S0100000_4(this, 26));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        Dialog dialog;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("source_page")) == null) {
            if (bundle != null) {
                str = bundle.getString("source_page");
            } else {
                str = null;
            }
        }
        this.LJLJJLL = str;
        DialogFragment dialogFragment = (DialogFragment) getParentFragment();
        if (dialogFragment != null && dialogFragment.isAdded() && dialogFragment != null && (dialog = dialogFragment.getDialog()) != null) {
            dialog.setOnCancelListener(new IDCListenerS280S0100000_4(this, 2));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        o.LJIIIZ(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putString("source_page", this.LJLJJLL);
    }

    public final void Dl(int i, PromptTransformResp promptTransformResp) {
        Long l;
        Context context;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (!getUserVisibleHint() || mo49getActivity == null || mo49getActivity.isDestroyed() || !V1B.LJJZZI(mo49getActivity, false)) {
            return;
        }
        if (i != 0) {
            if (i != 200006) {
                if (i != 200010) {
                    if (i != 999999) {
                        this.LJLJLJ = "others";
                        xl(R.string.jha, R.string.jhc, R.string.jhb, false);
                    } else {
                        this.LJLJLJ = "network";
                        xl(R.string.jh2, R.string.jh4, R.string.jh3, false);
                    }
                } else {
                    this.LJLJLJ = "not_understand";
                    xl(R.string.jh5, R.string.jh7, R.string.jh6, true);
                }
            } else {
                this.LJLJLJ = "safety";
                xl(R.string.jh8, R.string.jh_, R.string.jh9, true);
            }
        } else {
            Boolean bool = null;
            if (promptTransformResp != null) {
                String str = promptTransformResp.highlightWords;
                String str2 = promptTransformResp.returnQuery;
                if (str2 != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
                    if (str != null && s.LJJJLZIJ(str2, str, false)) {
                        int length = str2.length();
                        int LJJLIIIJL = s.LJJLIIIJL(str2, str, 0, false, 6);
                        int length2 = str.length() + LJJLIIIJL;
                        if (LJJLIIIJL >= 0 && length2 < length && (context = getContext()) != null) {
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(AnonymousClass636.LJIIIIZZ(R.attr.eh, context)), LJJLIIIJL, length2, 33);
                        }
                    }
                    ((TextView) _$_findCachedViewById(R.id.br3)).setText(spannableStringBuilder);
                    if (promptTransformResp != null) {
                        l = promptTransformResp.instructionId;
                    } else {
                        l = null;
                    }
                    this.LJLJI = l;
                    if (promptTransformResp != null) {
                        bool = promptTransformResp.isReset;
                    }
                    this.LJLJL = bool;
                    _$_findCachedViewById(R.id.b_w).setVisibility(8);
                    _$_findCachedViewById(R.id.br5).setVisibility(0);
                    ((C73305Spp) _$_findCachedViewById(R.id.kf_)).setVisibility(8);
                    this.LJLJLJ = "";
                    this.LJLJLLL = true;
                }
            }
            Dl(999998, promptTransformResp);
            return;
        }
        if (this.LJLJLJ.length() <= 0) {
            return;
        }
        String str3 = this.LJLJJLL;
        if (str3 == null) {
            str3 = "panel";
        }
        C26244ARs.LJFF(str3, this.LJLJLJ);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        Serializable serializable;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            this.LJLLI = C238299Wv.LIZ(mo49getActivity);
        }
        Bundle arguments = getArguments();
        String str3 = null;
        if (arguments == null || (str = arguments.getString("event_type")) == null) {
            str = "homepage_hot";
        }
        this.LJLIL = str;
        ((C73305Spp) _$_findCachedViewById(R.id.kf_)).setStatus((C73306Spq) this.LJLL.getValue());
        C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.axb), new ACListenerS24S0100000_4(this, 300));
        C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.axy), new ACListenerS24S0100000_4(this, 301));
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (serializable = arguments2.getSerializable("chosen_prompt")) != null && (serializable instanceof PromptStruct)) {
            PromptStruct promptStruct = (PromptStruct) serializable;
            Al(promptStruct);
            TextView textView = (TextView) _$_findCachedViewById(R.id.b_v);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append('\"');
            LIZ.append(promptStruct.getPrompt());
            LIZ.append('\"');
            textView.setText(X1D.LIZIZ(LIZ));
            this.LJLILLLLZI = promptStruct;
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            str2 = arguments3.getString("instructionIds");
        } else {
            str2 = null;
        }
        this.LJLJJI = str2;
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            str3 = arguments4.getString("contents");
        }
        this.LJLJJL = str3;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup.LayoutParams layoutParams;
        o.LJIIIZ(inflater, "inflater");
        Context context = getContext();
        if (context != null) {
            int LJJJJJL = C63081OpJ.LJJJJJL(context);
            if (viewGroup != null && (layoutParams = viewGroup.getLayoutParams()) != null) {
                layoutParams.height = (int) (LJJJJJL * 0.68d);
            }
        }
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.ae3, viewGroup, false);
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

    public final void xl(int i, int i2, int i3, boolean z) {
        _$_findCachedViewById(R.id.b_w).setVisibility(8);
        _$_findCachedViewById(R.id.br5).setVisibility(8);
        ((C73305Spp) _$_findCachedViewById(R.id.kf_)).setVisibility(0);
        C73306Spq c73306Spq = new C73306Spq();
        c73306Spq.LJII = new AqS6S0111000_4(this, i, z, 0);
        String string = getString(i2);
        o.LJIIIIZZ(string, "getString(title)");
        c73306Spq.LJFF = string;
        String string2 = getString(i3);
        o.LJIIIIZZ(string2, "getString(message)");
        c73306Spq.LJI = string2;
        c73306Spq.LJIIIIZZ = new AqS47S0110000_4(z, this, 5);
        ((C73305Spp) _$_findCachedViewById(R.id.kf_)).setStatus(c73306Spq);
    }
}
