package com.ss.android.ugc.aweme.compliance.business.filtervideo.ui.fragment;

import X.AEY;
import X.AbstractC234519Ih;
import X.ActivityC45651qj;
import X.C03880Dg;
import X.C109824Ss;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C221108m2;
import X.C234509Ig;
import X.C235119Kp;
import X.C238539Xt;
import X.C252709vu;
import X.C29S;
import X.C3C5;
import X.C62822Ol8;
import X.C65300Pk0;
import X.C76800UCe;
import X.C90903hW;
import X.C9KF;
import X.C9UC;
import X.C9UD;
import X.DialogC254019y1;
import X.EnumC252729vw;
import Y.ACListenerS39S0200000_4;
import Y.IDCListenerS205S0100000_4;
import Y.IDCListenerS373S0100000_4;
import Y.IDObjectS177S0100000_4;
import Y.IDTListenerS114S0100000_4;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.business.filtervideo.model.Keyword;
import com.ss.android.ugc.aweme.compliance.business.filtervideo.viewmodel.FilterVideoKeywordsViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.t1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AddOrModifyKeywordFragment extends BaseFragment {
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 78));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 76));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 75));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 77));

    public static void wl(DialogC254019y1 dialogC254019y1) {
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/ies/dmt/ui/dialog/DmtStatusViewDialog", "show", dialogC254019y1, new Object[0], "void", new C65300Pk0(false, "()V", "6189166358522512173")).LIZ) {
            return;
        }
        dialogC254019y1.show();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJL;
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

    public final FilterVideoKeywordsViewModel Al() {
        return (FilterVideoKeywordsViewModel) this.LJLIL.getValue();
    }

    public final void vl() {
        if ((((AEY) this.LJLILLLLZI.getValue()).LJIIL() || ((AEY) this.LJLJI.getValue()).LJIIL()) && ((TextView) _$_findCachedViewById(R.id.eno)).length() > 0) {
            ((C252709vu) _$_findCachedViewById(R.id.title)).LJIJ("save", C9UC.LJLIL);
        } else {
            ((C252709vu) _$_findCachedViewById(R.id.title)).LJIJ("save", C9UD.LJLIL);
        }
    }

    public final DialogC254019y1 xl() {
        return (DialogC254019y1) this.LJLJJI.getValue();
    }

    public final void R7() {
        Object obj;
        Context context = getContext();
        IBinder iBinder = null;
        if (context != null) {
            obj = C16880lQ.LLILL(context, "input_method");
        } else {
            obj = null;
        }
        o.LJII(obj, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) obj;
        View _$_findCachedViewById = _$_findCachedViewById(R.id.bs8);
        if (_$_findCachedViewById != null) {
            iBinder = _$_findCachedViewById.getWindowToken();
        }
        inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        Al().LJLJJI = null;
        super.onDestroy();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        fragmentConfiguration(C238539Xt.LJLIL);
        super.onCreate(bundle);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.title);
        C235119Kp c235119Kp = new C235119Kp();
        C234509Ig c234509Ig = new C234509Ig();
        String string = getString(R.string.cg_);
        o.LJIIIIZZ(string, "getString(R.string.cancel)");
        c234509Ig.LIZJ = string;
        c234509Ig.LJ = true;
        c234509Ig.LIZ = new C109824Ss(new AqS154S0100000_4(this, 79));
        c234509Ig.LIZ(EnumC252729vw.SECONDARY);
        C9KF LIZLLL = t1.LIZLLL(c235119Kp, new AbstractC234519Ih[]{c234509Ig});
        String string2 = getString(R.string.hmj);
        o.LJIIIIZZ(string2, "getString(R.string.keyword_filtering_settings_add)");
        LIZLLL.LIZJ = string2;
        c235119Kp.LIZJ = LIZLLL;
        C234509Ig c234509Ig2 = new C234509Ig();
        String string3 = getString(R.string.q8h);
        o.LJIIIIZZ(string3, "getString(R.string.save)");
        c234509Ig2.LIZJ = string3;
        c234509Ig2.LIZIZ = "save";
        c234509Ig2.LJ = false;
        c234509Ig2.LIZ = new C109824Ss(new AqS154S0100000_4(this, 80));
        c235119Kp.LIZIZ(c234509Ig2);
        c252709vu.setNavActions(c235119Kp);
        ((C252709vu) _$_findCachedViewById(R.id.title)).LJIILJJIL(true);
        ((AEY) this.LJLILLLLZI.getValue()).LJIILL(new IDCListenerS205S0100000_4(this, 1));
        ((AEY) this.LJLJI.getValue()).LJIILL(new IDCListenerS205S0100000_4(this, 2));
        ((TextView) _$_findCachedViewById(R.id.b9q)).setText("0/70");
        ((TextView) _$_findCachedViewById(R.id.eno)).setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(70)});
        ((TextView) _$_findCachedViewById(R.id.eno)).addTextChangedListener(new IDObjectS177S0100000_4(this, 1));
        ((TextView) _$_findCachedViewById(R.id.eno)).setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: X.9QY
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 62) {
                    return true;
                }
                return false;
            }
        });
        _$_findCachedViewById(R.id.eno).setOnFocusChangeListener(new IDCListenerS373S0100000_4(this, 1));
        _$_findCachedViewById(R.id.bs8).setOnTouchListener(new IDTListenerS114S0100000_4(this, 3));
        Keyword keyword = Al().LJLJJI;
        if (keyword != null) {
            _$_findCachedViewById(R.id.c65).setVisibility(0);
            C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.c65), new ACListenerS39S0200000_4(this, keyword, 80));
            ((TextView) _$_findCachedViewById(R.id.eno)).setText(keyword.text);
            Iterator<Integer> it = keyword.scenes.iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                if (intValue != 0) {
                    if (intValue == 1) {
                        ((AEY) this.LJLJI.getValue()).LJIILIIL(true);
                    }
                } else {
                    ((AEY) this.LJLILLLLZI.getValue()).LJIILIIL(true);
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.agg, viewGroup, false);
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
