package com.ss.android.ugc.aweme.profile.ui;

import X.AbstractC234519Ih;
import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C221108m2;
import X.C233989Gg;
import X.C234509Ig;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C29S;
import X.C3C5;
import X.C62822Ol8;
import X.C73318Sq2;
import X.C73849Syb;
import X.C73969T1h;
import X.C76800UCe;
import X.C78999UzT;
import X.C90903hW;
import X.C9KF;
import X.C9UK;
import X.InterfaceC235629Mo;
import X.InterfaceC252739vx;
import X.InterfaceC64592gB;
import X.JF3;
import X.T16;
import Y.AfS56S0100000_4;
import Y.IDObjectS177S0100000_4;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.profile.ui.ProfileEditBioFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProfileEditBioFragment extends ProfileEditInputFragment {
    public static final /* synthetic */ int LJZL = 0;
    public InterfaceC235629Mo LJLZ;
    public EditText LJZ;
    public final Map<Integer, View> LJZI = new LinkedHashMap();
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(C9UK.LJLIL);
    public String LJLLI = "";
    public String LJLLILLLL = "";
    public final C73849Syb<Object> LJLLJ = new C73849Syb<>();
    public final C73318Sq2 LJLLL = new C73318Sq2();
    public String LJLLLL = "";
    public String LJLLLLLL = "";

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileEditInputFragment, com.ss.android.ugc.aweme.profile.ui.ProfileDetailEditFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJZI).clear();
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileEditInputFragment, com.ss.android.ugc.aweme.profile.ui.ProfileDetailEditFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJZI;
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

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileEditInputFragment, com.ss.android.ugc.aweme.profile.ui.ProfileDetailEditFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileEditInputFragment
    public final void Ml() {
        int i;
        boolean z;
        InterfaceC235629Mo interfaceC235629Mo = this.LJLZ;
        if (interfaceC235629Mo != null) {
            String obj = Ol().getText().toString();
            int length = obj.length() - 1;
            int i2 = 0;
            boolean z2 = false;
            while (i2 <= length) {
                if (!z2) {
                    i = i2;
                } else {
                    i = length;
                }
                if (o.LJIIJJI(obj.charAt(i), 32) <= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z2) {
                    if (!z) {
                        z2 = true;
                    } else {
                        i2++;
                    }
                } else if (!z) {
                    break;
                } else {
                    length--;
                }
            }
            interfaceC235629Mo.LIZ(obj.subSequence(i2, length + 1).toString());
        }
        vl();
    }

    public final EditText Ol() {
        EditText editText = this.LJZ;
        if (editText != null) {
            return editText;
        }
        o.LJIJI("mEditContentInput");
        throw null;
    }

    public final boolean Pl() {
        return ((Boolean) this.LJLL.getValue()).booleanValue();
    }

    public final AbstractC234519Ih Ql() {
        C234509Ig c234509Ig = new C234509Ig();
        c234509Ig.LIZIZ = "save";
        String string = getString(R.string.a60);
        o.LJIIIIZZ(string, "getString(R.string.a11y_vo_bio_save)");
        c234509Ig.LIZJ = string;
        c234509Ig.LIZ = new InterfaceC252739vx() { // from class: X.9UQ
            @Override // X.InterfaceC252739vx
            public final void LIZ() {
                if (ProfileEditBioFragment.this.Jl()) {
                    KeyboardUtils.LIZIZ(ProfileEditBioFragment.this.Ol());
                    String str = ProfileEditBioFragment.this.LJLLLL;
                    boolean z = false;
                    if (str == null || str.length() <= 0) {
                        str = "click_save";
                    }
                    if (((RBX) HG3.LJIILL()).getCurUser().getSignatureModifyTime() == 0) {
                        z = true;
                    }
                    C244329iO c244329iO = new C244329iO(str, C9WB.BIO);
                    c244329iO.LIZLLL = ProfileEditBioFragment.this.LJLLLLLL;
                    c244329iO.LJFF = Boolean.valueOf(z);
                    C244309iM.LJ(new C244319iN(c244329iO));
                    KeyboardUtils.LIZIZ(ProfileEditBioFragment.this.Ol());
                    ProfileEditBioFragment.this.Ml();
                    ProfileEditBioFragment.this.dismiss();
                }
            }
        };
        return c234509Ig;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileEditInputFragment
    public final boolean onBackPressed() {
        Dialog dialog;
        KeyboardUtils.LIZIZ(Ol());
        if (getDialog() != null && (dialog = getDialog()) != null && dialog.isShowing() && isResumed()) {
            try {
                dismiss();
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.LJLLL.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileEditInputFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            o.LJI(arguments);
            String string = arguments.getString("content_name");
            o.LJI(string);
            this.LJLLI = string;
            Bundle arguments2 = getArguments();
            o.LJI(arguments2);
            String string2 = arguments2.getString("content_value");
            o.LJI(string2);
            this.LJLLILLLL = string2;
            Bundle arguments3 = getArguments();
            String str2 = null;
            if (arguments3 != null) {
                str = arguments3.getString("enter_method");
            } else {
                str = null;
            }
            this.LJLLLL = str;
            Bundle arguments4 = getArguments();
            if (arguments4 != null) {
                str2 = arguments4.getString("btn_name");
            }
            this.LJLLLLLL = str2;
        }
    }

    public final void Rl(int i, int i2) {
        View findViewById;
        View view = getView();
        if (view == null || (findViewById = view.findViewById(R.id.cpy)) == null) {
            return;
        }
        findViewById.setBackgroundResource(i);
        TextView Il = Il();
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        Il.setTextColor(AnonymousClass636.LJIIIIZZ(i2, requireContext));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        Window window;
        o.LJIIIZ(inflater, "inflater");
        if (Pl()) {
            i = R.layout.c4m;
        } else {
            i = R.layout.c4l;
        }
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, i, viewGroup, false);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        Dialog dialog = getDialog();
        C29S c29s = null;
        if (dialog != null) {
            window = dialog.getWindow();
        } else {
            window = null;
        }
        JF3.LIZIZ(mo49getActivity, window, true);
        View findViewById = LLLLIILL.findViewById(R.id.czq);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.et_input)");
        this.LJZ = (EditText) findViewById;
        View findViewById2 = LLLLIILL.findViewById(R.id.m61);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.tv_edit_length_hint)");
        Nl((TextView) findViewById2);
        o.LJIIIIZZ(LLLLIILL.findViewById(R.id.m60), "view.findViewById(R.id.tv_edit_hint)");
        Il().setVisibility(0);
        C78999UzT.LJFF(this.LJLLJ.LJJLIIIJILLIZJL(3000L, TimeUnit.MILLISECONDS).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS56S0100000_4(LLLLIILL, 54), new InterfaceC64592gB() { // from class: X.9G3
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }), this.LJLLL);
        Ol().addTextChangedListener(new IDObjectS177S0100000_4(this, 8));
        Ol().setText(this.LJLLILLLL);
        Ol().setSelection(Ol().getText().length());
        Ol().setFocusable(true);
        Ol().setFocusableInTouchMode(true);
        Ol().requestFocus();
        this.LJLJJI = (C252709vu) LLLLIILL.findViewById(R.id.gwg);
        if (Pl()) {
            C233989Gg c233989Gg = ProfileEditInputFragment.LJLJLLL;
            AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(this, 698);
            c233989Gg.getClass();
            C234529Ii LIZ = C233989Gg.LIZ(aqS154S0100000_4);
            AbstractC234519Ih Ql = Ql();
            C252709vu c252709vu = this.LJLJJI;
            if (c252709vu != null) {
                C235119Kp c235119Kp = new C235119Kp();
                c235119Kp.LIZLLL(LIZ);
                c235119Kp.LIZIZ(Ql);
                c235119Kp.LIZLLL = false;
                c252709vu.setNavActions(c235119Kp);
            }
        } else {
            AbstractC234519Ih Ll = Ll();
            C9KF Kl = Kl(this.LJLLI);
            AbstractC234519Ih Ql2 = Ql();
            C252709vu c252709vu2 = this.LJLJJI;
            if (c252709vu2 != null) {
                C235119Kp c235119Kp2 = new C235119Kp();
                c235119Kp2.LIZLLL(Ll);
                c235119Kp2.LIZ(Kl);
                c235119Kp2.LIZIZ(Ql2);
                c235119Kp2.LIZLLL = true;
                c252709vu2.setNavActions(c235119Kp2);
            }
        }
        LJJJI();
        try {
            ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
            C10A.LIZIZ(LLLLIILL, this);
            ActivityC45651qj mo49getActivity2 = mo49getActivity();
            if (mo49getActivity2 instanceof C29S) {
                c29s = (C29S) mo49getActivity2;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LLLLIILL;
    }
}
