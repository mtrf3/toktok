package com.ss.android.ugc.aweme.profile.editprofile.pronouns.ui;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C221108m2;
import X.C26227ARb;
import X.C29S;
import X.C3C5;
import X.C5H3;
import X.C60996Nwm;
import X.C73305Spp;
import X.C76800UCe;
import X.C8VV;
import X.C90903hW;
import X.C9BP;
import X.C9UF;
import X.C9UG;
import X.C9UH;
import X.C9UI;
import X.InterfaceC198557ql;
import X.JF3;
import X.KMP;
import X.UC0;
import Y.IDLListenerS58S0200000_4;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.profile.ui.ProfileEditInputFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProfileEditPronounsFragment extends ProfileEditInputFragment implements C9BP, ViewTreeObserver.OnGlobalLayoutListener {
    public static final C9UF LJLLLL = new C9UF();
    public C9UH LJLLILLLL;
    public Map<Integer, View> LJLLL = new LinkedHashMap();
    public String LJLL = "";
    public String LJLLI = "";
    public final C5H3 LJLLJ = C221108m2.LIZIZ(C9UG.LJLIL);

    public static final ProfileEditPronounsFragment Xl(String str, String str2) {
        LJLLLL.getClass();
        return C9UF.LIZ(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileEditInputFragment
    public void Ml() {
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileEditInputFragment, com.ss.android.ugc.aweme.profile.ui.ProfileDetailEditFragment
    public void _$_clearFindViewByIdCache() {
        this.LJLLL.clear();
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileEditInputFragment, com.ss.android.ugc.aweme.profile.ui.ProfileDetailEditFragment
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLLL;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return Rl(this, layoutInflater, viewGroup, bundle);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileEditInputFragment, com.ss.android.ugc.aweme.profile.ui.ProfileDetailEditFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
    }

    @Override // X.C9BP, X.C8VB, X.C8V9
    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.9UI] */
    @Override // X.C8VB
    /* renamed from: Sl, reason: merged with bridge method [inline-methods] */
    public C9UI defaultObservableData() {
        return new InterfaceC198557ql() { // from class: X.9UI
        };
    }

    public final boolean Wl() {
        return ((Boolean) this.LJLLJ.getValue()).booleanValue();
    }

    private final void LJIJI() {
        Context context = getContext();
        if (context != null) {
            Object LLILL = C16880lQ.LLILL(context, "input_method");
            o.LJII(LLILL, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) LLILL).hideSoftInputFromWindow(_$_findCachedViewById(R.id.ief).getWindowToken(), 2);
        }
    }

    public final void Vl() {
        LJIJI();
        Tl();
    }

    @Override // X.C9BP
    public void kc() {
        C73305Spp c73305Spp = (C73305Spp) _$_findCachedViewById(R.id.ieo);
        c73305Spp.setVisibility(0);
        c73305Spp.LJFF();
    }

    @Override // X.C9BP
    public void r3() {
        ((C73305Spp) _$_findCachedViewById(R.id.ieo)).setVisibility(8);
    }

    private final void Tl() {
        onBackPressed();
    }

    private final void Ol(View view) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS58S0200000_4(this, view, 2));
    }

    @Override // X.C9BP
    public void D(boolean z) {
        if (z) {
            Context context = getContext();
            if (context != null) {
                C26227ARb LIZLLL = KMP.LIZLLL(context, R.string.pi2, R.string.pi1);
                UC0.LIZJ(LIZLLL, new AqS170S0100000_4(this, 549));
                LIZLLL.LJI().LIZLLL();
                return;
            }
            return;
        }
        Vl();
    }

    @Override // X.C9BP
    public void K4(String content) {
        o.LJIIIZ(content, "content");
        Vl();
        C9UH c9uh = this.LJLLILLLL;
        if (c9uh != null) {
            c9uh.LIZ(content);
        }
    }

    public final int Pl(View view) {
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        return (C60996Nwm.LJ(mo49getActivity()) - C60996Nwm.LIZLLL(mo49getActivity())) - rect.bottom;
    }

    public final void Yl(C9UH listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLLILLLL = listener;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileEditInputFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LJLL = String.valueOf(arguments.getString("content_name"));
            this.LJLLI = String.valueOf(arguments.getString("content_value"));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C8VV.LIZ(this, false, new AqS170S0100000_4(this, 550));
        Ol(view);
    }

    public View Ql(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        int i;
        o.LJIIIZ(inflater, "inflater");
        ActivityC45651qj mo49getActivity = mo49getActivity();
        Dialog dialog = getDialog();
        if (dialog != null) {
            window = dialog.getWindow();
        } else {
            window = null;
        }
        JF3.LIZIZ(mo49getActivity, window, true);
        if (Wl()) {
            i = R.layout.c4r;
        } else {
            i = R.layout.c4q;
        }
        return C16880lQ.LLLLIILL(inflater, i, viewGroup, false);
    }

    public static View Rl(ProfileEditPronounsFragment profileEditPronounsFragment, LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View Ql = profileEditPronounsFragment.Ql(inflater, viewGroup, bundle);
        C29S c29s = null;
        if (!(Ql instanceof View)) {
            Ql = null;
        }
        if (Ql != null) {
            try {
                ViewTreeLifecycleOwner.set(Ql, profileEditPronounsFragment.getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(Ql, profileEditPronounsFragment);
                C10A.LIZIZ(Ql, profileEditPronounsFragment);
                ActivityC45651qj mo49getActivity = profileEditPronounsFragment.mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return Ql;
    }
}
