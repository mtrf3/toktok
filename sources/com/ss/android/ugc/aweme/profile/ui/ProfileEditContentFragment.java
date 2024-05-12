package com.ss.android.ugc.aweme.profile.ui;

import X.AbstractC234519Ih;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C234509Ig;
import X.C235119Kp;
import X.C252709vu;
import X.C29S;
import X.C3C5;
import X.C73318Sq2;
import X.C73849Syb;
import X.C73969T1h;
import X.C76800UCe;
import X.C78999UzT;
import X.C90903hW;
import X.C9KF;
import X.C9VA;
import X.InterfaceC252739vx;
import X.InterfaceC64592gB;
import X.InterfaceC88472Yns;
import X.JF3;
import X.T16;
import Y.ACListenerS24S0100000_4;
import Y.AfS56S0100000_4;
import Y.IDObjectS177S0100000_4;
import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.profile.ui.ProfileEditContentFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProfileEditContentFragment extends ProfileEditInputFragment {
    public static final /* synthetic */ int LLI = 0;
    public boolean LJLLILLLL;
    public int LJLLL;
    public boolean LJLLLL;
    public InterfaceC88472Yns<? super Editable, Boolean> LJLZ;
    public C9VA LLD;
    public TextView LLF;
    public EditText LLFF;
    public TuxIconView LLFFF;
    public TextView LLFII;
    public final Map<Integer, View> LLFZ = new LinkedHashMap();
    public String LJLL = "";
    public String LJLLI = "";
    public String LJLLJ = "";
    public boolean LJLLLLLL = true;
    public final C73849Syb<Object> LJZ = new C73849Syb<>();
    public final C73318Sq2 LJZI = new C73318Sq2();
    public String LJZL = "";
    public String LL = "";

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileEditInputFragment, com.ss.android.ugc.aweme.profile.ui.ProfileDetailEditFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLFZ).clear();
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileEditInputFragment, com.ss.android.ugc.aweme.profile.ui.ProfileDetailEditFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLFZ;
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
        C9VA c9va = this.LLD;
        if (c9va != null) {
            c9va.LIZ(Ol().getText().toString());
        }
        vl();
    }

    public final EditText Ol() {
        EditText editText = this.LLFF;
        if (editText != null) {
            return editText;
        }
        o.LJIJI("mEditContentInput");
        throw null;
    }

    public final TextView Pl() {
        TextView textView = this.LLFII;
        if (textView != null) {
            return textView;
        }
        o.LJIJI("mIdEditHintText");
        throw null;
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
        this.LJZI.LIZLLL();
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
            this.LJLL = string;
            Bundle arguments2 = getArguments();
            o.LJI(arguments2);
            String string2 = arguments2.getString("content_value");
            o.LJI(string2);
            this.LJLLI = string2;
            Bundle arguments3 = getArguments();
            o.LJI(arguments3);
            this.LJLLILLLL = arguments3.getBoolean("is_edit_enabled");
            Bundle arguments4 = getArguments();
            o.LJI(arguments4);
            String string3 = arguments4.getString("edit_hint");
            o.LJI(string3);
            this.LJLLJ = string3;
            Bundle arguments5 = getArguments();
            o.LJI(arguments5);
            this.LJLLL = arguments5.getInt("content_max_length");
            Bundle arguments6 = getArguments();
            o.LJI(arguments6);
            this.LJLLLL = arguments6.getBoolean("is_enable_null");
            Bundle arguments7 = getArguments();
            String str2 = null;
            if (arguments7 != null) {
                str = arguments7.getString("enter_method");
            } else {
                str = null;
            }
            this.LJZL = str;
            Bundle arguments8 = getArguments();
            if (arguments8 != null) {
                str2 = arguments8.getString("btn_name");
            }
            this.LL = str2;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.c4n, viewGroup, false);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        Dialog dialog = getDialog();
        C29S c29s = null;
        if (dialog != null) {
            window = dialog.getWindow();
        } else {
            window = null;
        }
        JF3.LIZIZ(mo49getActivity, window, true);
        View findViewById = LLLLIILL.findViewById(R.id.m2w);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.tv_content_name)");
        this.LLF = (TextView) findViewById;
        View findViewById2 = LLLLIILL.findViewById(R.id.czq);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.et_input)");
        this.LLFF = (EditText) findViewById2;
        View findViewById3 = LLLLIILL.findViewById(R.id.f0e);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.iv_clear_all)");
        this.LLFFF = (TuxIconView) findViewById3;
        View findViewById4 = LLLLIILL.findViewById(R.id.m61);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.tv_edit_length_hint)");
        Nl((TextView) findViewById4);
        View findViewById5 = LLLLIILL.findViewById(R.id.m60);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.tv_edit_hint)");
        this.LLFII = (TextView) findViewById5;
        View findViewById6 = LLLLIILL.findViewById(R.id.f0e);
        if (findViewById6 != null) {
            C16880lQ.LJIIJ(new ACListenerS24S0100000_4(this, 123), findViewById6);
        }
        TextView textView = this.LLF;
        if (textView != null) {
            textView.setText(this.LJLL);
            TuxIconView tuxIconView = this.LLFFF;
            if (tuxIconView != null) {
                tuxIconView.setIconRes(R.raw.icon_x_mark_circle_fill);
                C78999UzT.LJFF(this.LJZ.LJJLIIIJILLIZJL(3000L, TimeUnit.MILLISECONDS).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS56S0100000_4(LLLLIILL, 55), new InterfaceC64592gB() { // from class: X.9V7
                    @Override // X.InterfaceC64592gB
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    }
                }), this.LJZI);
                Ol().addTextChangedListener(new IDObjectS177S0100000_4(this, 10));
                Ol().setText(this.LJLLI);
                Ol().setSelection(Ol().getText().length());
                Ol().setFocusable(true);
                Ol().setFocusableInTouchMode(true);
                Ol().requestFocus();
                this.LJLJJI = (C252709vu) LLLLIILL.findViewById(R.id.gwg);
                AbstractC234519Ih Ll = Ll();
                C9KF Kl = Kl(this.LJLL);
                C234509Ig c234509Ig = new C234509Ig();
                c234509Ig.LIZIZ = "save";
                String string = getString(R.string.fkl);
                o.LJIIIIZZ(string, "getString(R.string.edit_profile_save)");
                c234509Ig.LIZJ = string;
                c234509Ig.LIZ = new InterfaceC252739vx() { // from class: X.9V6
                    @Override // X.InterfaceC252739vx
                    public final void LIZ() {
                        if (ProfileEditContentFragment.this.Jl()) {
                            KeyboardUtils.LIZIZ(ProfileEditContentFragment.this.Ol());
                            String str = ProfileEditContentFragment.this.LJZL;
                            if (str == null || str.length() <= 0) {
                                str = "click_save";
                            }
                            C244329iO c244329iO = new C244329iO(str, C9WB.NICKNAME);
                            c244329iO.LIZLLL = ProfileEditContentFragment.this.LL;
                            C244309iM.LJ(new C244319iN(c244329iO));
                            ProfileEditContentFragment.this.Ml();
                            ProfileEditContentFragment.this.dismiss();
                        }
                    }
                };
                C252709vu c252709vu = this.LJLJJI;
                if (c252709vu != null) {
                    C235119Kp c235119Kp = new C235119Kp();
                    c235119Kp.LIZLLL(Ll);
                    c235119Kp.LIZ(Kl);
                    c235119Kp.LIZIZ(c234509Ig);
                    c235119Kp.LIZLLL = true;
                    c252709vu.setNavActions(c235119Kp);
                }
                if (!this.LJLLILLLL) {
                    Ol().setEnabled(false);
                    Ol().setFocusable(false);
                    Ol().setFocusableInTouchMode(false);
                    TuxIconView tuxIconView2 = this.LLFFF;
                    if (tuxIconView2 != null) {
                        tuxIconView2.setVisibility(8);
                    } else {
                        o.LJIJI("mClearAllBtn");
                        throw null;
                    }
                }
                LJJJI();
                if (this.LJLLLLLL && !TextUtils.isEmpty(this.LJLLJ)) {
                    Pl().setVisibility(0);
                    Pl().setText(this.LJLLJ);
                } else {
                    Pl().setVisibility(8);
                }
                if (this.LJLLL > 0) {
                    Il().setVisibility(0);
                }
                Ol().setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: X.9V8
                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView2, int i, KeyEvent keyEvent) {
                        if (keyEvent != null && keyEvent.getKeyCode() == 66) {
                            return true;
                        }
                        return false;
                    }
                });
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
            o.LJIJI("mClearAllBtn");
            throw null;
        }
        o.LJIJI("mTvContentName");
        throw null;
    }
}
