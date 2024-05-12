package com.ss.android.ugc.aweme.profile.ui;

import X.AbstractC234519Ih;
import X.ActivityC45651qj;
import X.C04330Ez;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C234509Ig;
import X.C235119Kp;
import X.C244379iT;
import X.C252709vu;
import X.C26045AKb;
import X.C279017q;
import X.C29S;
import X.C2U8;
import X.C38333F2r;
import X.C3C5;
import X.C5S1;
import X.C62905OmT;
import X.C73305Spp;
import X.C76800UCe;
import X.C90903hW;
import X.C9KF;
import X.C9VE;
import X.C9VF;
import X.EF7;
import X.InterfaceC252739vx;
import X.InterfaceC26189APp;
import X.JF3;
import Y.ACListenerS24S0100000_4;
import Y.IDObjectS177S0100000_4;
import android.app.Dialog;
import android.os.Bundle;
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
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.UserPresenter;
import com.ss.android.ugc.aweme.profile.ui.ProfileEditBioUrlFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes5.dex */
public final class ProfileEditBioUrlFragment extends ProfileEditInputFragment implements InterfaceC26189APp {
    public static final /* synthetic */ int LLFII = 0;
    public boolean LJLLI;
    public int LJLLJ;
    public boolean LJLLL;
    public C9VF LJLLLL;
    public UserPresenter LJLLLLLL;
    public C244379iT LJLZ;
    public C73305Spp LJZ;
    public TextView LJZI;
    public EditText LJZL;
    public TuxIconView LL;
    public TextView LLD;
    public View LLF;
    public int LLFF;
    public final Map<Integer, View> LLFFF = new LinkedHashMap();
    public String LJLL = "";
    public String LJLLILLLL = "";

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileEditInputFragment, com.ss.android.ugc.aweme.profile.ui.ProfileDetailEditFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLFFF).clear();
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileEditInputFragment, com.ss.android.ugc.aweme.profile.ui.ProfileDetailEditFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLFFF;
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

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileEditInputFragment
    public final void Ml() {
        C9VF c9vf = this.LJLLLL;
        if (c9vf != null) {
            c9vf.LIZ(Ol().getText().toString());
        }
        vl();
    }

    public final EditText Ol() {
        EditText editText = this.LJZL;
        if (editText != null) {
            return editText;
        }
        o.LJIJI("mEditContentInput");
        throw null;
    }

    public final TextView Pl() {
        TextView textView = this.LLD;
        if (textView != null) {
            return textView;
        }
        o.LJIJI("mIdEditHintText");
        throw null;
    }

    public final C73305Spp Ql() {
        C73305Spp c73305Spp = this.LJZ;
        if (c73305Spp != null) {
            return c73305Spp;
        }
        o.LJIJI("statusView");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileEditInputFragment
    public final boolean onBackPressed() {
        Dialog dialog;
        KeyboardUtils.LIZIZ(Ol());
        if (mo49getActivity() instanceof ProfileEditBioUrlActivity) {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            o.LJI(mo49getActivity);
            mo49getActivity.finish();
        } else if (getDialog() != null && (dialog = getDialog()) != null && dialog.isShowing() && isResumed()) {
            try {
                dismiss();
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileEditInputFragment, com.ss.android.ugc.aweme.profile.ui.ProfileDetailEditFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        UserPresenter userPresenter = this.LJLLLLLL;
        if (userPresenter != null) {
            userPresenter.bindView(null);
        }
        Ql().setVisibility(8);
        _$_clearFindViewByIdCache();
    }

    @Override // X.InterfaceC26189APp
    public final void FI(boolean z) {
        if (z) {
            C5S1 c5s1 = new C5S1(EF7.LIZIZ());
            c5s1.LIZJ(R.string.b5e);
            c5s1.LJ();
            C2U8.LIZ(new C9VE());
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileEditInputFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            o.LJI(arguments);
            String string = arguments.getString("content_value");
            o.LJI(string);
            this.LJLL = string;
            Bundle arguments2 = getArguments();
            o.LJI(arguments2);
            this.LJLLI = arguments2.getBoolean("is_edit_enabled");
            Bundle arguments3 = getArguments();
            o.LJI(arguments3);
            String string2 = arguments3.getString("edit_hint");
            o.LJI(string2);
            this.LJLLILLLL = string2;
            Bundle arguments4 = getArguments();
            o.LJI(arguments4);
            this.LJLLJ = arguments4.getInt("content_max_length");
            Bundle arguments5 = getArguments();
            o.LJI(arguments5);
            this.LJLLL = arguments5.getBoolean("is_enable_null");
        }
    }

    @Override // X.InterfaceC26189APp
    public final void Pp0(User user, int i) {
        Ql().setVisibility(8);
        if (mo49getActivity() instanceof ProfileEditBioUrlActivity) {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            o.LJI(mo49getActivity);
            mo49getActivity.finish();
        } else {
            Ml();
            dismiss();
        }
    }

    public final void Rl(int i, String msg) {
        o.LJIIIZ(msg, "msg");
        if (this.LLFF == i) {
            return;
        }
        if (i == 0) {
            TextView Pl = Pl();
            Pl.setTextColor(C04330Ez.LIZIZ(Pl.getContext(), R.color.cu));
            Pl.setVisibility(8);
            View view = this.LLF;
            if (view != null) {
                view.setBackgroundColor(C04330Ez.LIZIZ(Pl.getContext(), R.color.bx));
            } else {
                o.LJIJI("divider");
                throw null;
            }
        } else {
            TextView Pl2 = Pl();
            Pl2.setText(msg);
            Pl2.setTextColor(C04330Ez.LIZIZ(Pl2.getContext(), R.color.kp));
            Pl2.setVisibility(0);
            View view2 = this.LLF;
            if (view2 != null) {
                view2.setBackgroundColor(C04330Ez.LIZIZ(Pl2.getContext(), R.color.kp));
            } else {
                o.LJIJI("divider");
                throw null;
            }
        }
        this.LLFF = i;
    }

    @Override // X.InterfaceC26189APp
    public final void Xa(Exception exc, int i) {
        Ql().setVisibility(8);
        if (exc instanceof C38333F2r) {
            C38333F2r c38333F2r = (C38333F2r) exc;
            int errorCode = c38333F2r.getErrorCode();
            if (errorCode != 2097) {
                if (errorCode != 2123) {
                    if (TextUtils.isEmpty(c38333F2r.getErrorMsg())) {
                        String string = getString(R.string.rf3);
                        o.LJIIIIZZ(string, "getString(R.string.something_wrong)");
                        C26045AKb c26045AKb = new C26045AKb(this);
                        c26045AKb.LJIIIZ(string);
                        c26045AKb.LJIIJ();
                        return;
                    }
                    String errorMsg = c38333F2r.getErrorMsg();
                    o.LJIIIIZZ(errorMsg, "e.errorMsg");
                    C26045AKb c26045AKb2 = new C26045AKb(this);
                    c26045AKb2.LJIIIZ(errorMsg);
                    c26045AKb2.LJIIJ();
                    return;
                }
                if (TextUtils.isEmpty(c38333F2r.getErrorMsg())) {
                    String string2 = getString(R.string.rf3);
                    o.LJIIIIZZ(string2, "getString(R.string.something_wrong)");
                    C26045AKb c26045AKb3 = new C26045AKb(this);
                    c26045AKb3.LJIIIZ(string2);
                    c26045AKb3.LJIIJ();
                }
                String errorMsg2 = c38333F2r.getErrorMsg();
                o.LJIIIIZZ(errorMsg2, "e.errorMsg");
                Rl(1, errorMsg2);
                return;
            }
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity == null) {
                return;
            }
            C62905OmT c62905OmT = new C62905OmT(mo49getActivity);
            c62905OmT.LJ(R.string.hsq);
            c62905OmT.LIZ(R.string.hso);
            c62905OmT.LJIIJ(R.string.hsp, null);
            C279017q.LIZLLL(c62905OmT);
            return;
        }
        String string3 = getString(R.string.rf3);
        o.LJIIIIZZ(string3, "getString(R.string.something_wrong)");
        C26045AKb c26045AKb4 = new C26045AKb(this);
        c26045AKb4.LJIIIZ(string3);
        c26045AKb4.LJIIJ();
    }

    @Override // X.InterfaceC26189APp
    public final void vb0(String str, boolean z) {
        Ql().setVisibility(8);
        if (str == null || TextUtils.isEmpty(str)) {
            return;
        }
        C5S1 c5s1 = new C5S1(EF7.LIZIZ());
        c5s1.LIZLLL(str);
        c5s1.LJ();
        if (!z || mo49getActivity() == null) {
            return;
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        o.LJI(mo49getActivity);
        mo49getActivity.finish();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        Integer num;
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.c4n, viewGroup, false);
        View findViewById = LLLLIILL.findViewById(R.id.kf_);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.status_view)");
        this.LJZ = (C73305Spp) findViewById;
        View findViewById2 = LLLLIILL.findViewById(R.id.m2w);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.tv_content_name)");
        this.LJZI = (TextView) findViewById2;
        View findViewById3 = LLLLIILL.findViewById(R.id.czq);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.et_input)");
        this.LJZL = (EditText) findViewById3;
        View findViewById4 = LLLLIILL.findViewById(R.id.f0e);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.iv_clear_all)");
        this.LL = (TuxIconView) findViewById4;
        View findViewById5 = LLLLIILL.findViewById(R.id.m61);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.tv_edit_length_hint)");
        Nl((TextView) findViewById5);
        View findViewById6 = LLLLIILL.findViewById(R.id.m60);
        o.LJIIIIZZ(findViewById6, "view.findViewById(R.id.tv_edit_hint)");
        this.LLD = (TextView) findViewById6;
        View findViewById7 = LLLLIILL.findViewById(R.id.n9w);
        o.LJIIIIZZ(findViewById7, "view.findViewById(R.id.view2)");
        this.LLF = findViewById7;
        View findViewById8 = LLLLIILL.findViewById(R.id.f0e);
        if (findViewById8 != null) {
            C16880lQ.LJIIJ(new ACListenerS24S0100000_4(this, 122), findViewById8);
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        Dialog dialog = getDialog();
        C29S c29s = null;
        if (dialog != null) {
            window = dialog.getWindow();
        } else {
            window = null;
        }
        JF3.LIZIZ(mo49getActivity, window, true);
        UserPresenter userPresenter = new UserPresenter();
        this.LJLLLLLL = userPresenter;
        userPresenter.bindView(this);
        this.LJLZ = new C244379iT();
        TextView textView = this.LJZI;
        if (textView != null) {
            textView.setText(getString(R.string.fkt));
            Ol().addTextChangedListener(new IDObjectS177S0100000_4(this, 9));
            Ol().setText(this.LJLL);
            Ol().setSelection(Ol().getText().length());
            Ol().setFocusable(true);
            Ol().setFocusableInTouchMode(true);
            Ol().requestFocus();
            this.LJLJJI = (C252709vu) LLLLIILL.findViewById(R.id.gwg);
            AbstractC234519Ih Ll = Ll();
            String string = getString(R.string.fkt);
            o.LJIIIIZZ(string, "getString(R.string.edit_profile_web_title)");
            C9KF Kl = Kl(string);
            C234509Ig c234509Ig = new C234509Ig();
            c234509Ig.LIZIZ = "save";
            String string2 = getString(R.string.fkl);
            o.LJIIIIZZ(string2, "getString(R.string.edit_profile_save)");
            c234509Ig.LIZJ = string2;
            c234509Ig.LIZ = new InterfaceC252739vx() { // from class: X.9VB
                @Override // X.InterfaceC252739vx
                public final void LIZ() {
                    java.util.Map<String, String> map;
                    if (ProfileEditBioUrlFragment.this.Jl()) {
                        C244309iM.LJ(new C244319iN(new C244329iO("click_save", C9WB.BIO)));
                        String obj = ProfileEditBioUrlFragment.this.Ol().getText().toString();
                        while (s.LJJJLZIJ(obj, "\n\n", false)) {
                            obj = QZP.LIZIZ("\n\n", obj, "\n");
                        }
                        int length = obj.length() - 1;
                        if (length >= 0 && obj.charAt(length) == '\n') {
                            obj = obj.substring(0, length);
                            o.LJIIIIZZ(obj, "this as java.lang.String…ing(startIndex, endIndex)");
                        }
                        if (!TextUtils.equals(obj, ProfileEditBioUrlFragment.this.LJLL)) {
                            KeyboardUtils.LIZIZ(ProfileEditBioUrlFragment.this.Ol());
                            ProfileEditBioUrlFragment.this.Ol().setText(obj);
                            ProfileEditBioUrlFragment profileEditBioUrlFragment = ProfileEditBioUrlFragment.this;
                            C244379iT c244379iT = profileEditBioUrlFragment.LJLZ;
                            if (c244379iT != null) {
                                c244379iT.LJI = obj;
                            }
                            UserPresenter userPresenter2 = profileEditBioUrlFragment.LJLLLLLL;
                            if (userPresenter2 != null) {
                                if (c244379iT != null) {
                                    map = c244379iT.LIZ();
                                } else {
                                    map = null;
                                }
                                userPresenter2.updateUserInfo(map);
                            }
                            ProfileEditBioUrlFragment.this.Ql().setVisibility(0);
                            ProfileEditBioUrlFragment.this.Ql().LJFF();
                            return;
                        }
                        ProfileEditBioUrlFragment.this.onBackPressed();
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
            if (!this.LJLLI) {
                Ol().setEnabled(false);
                Ol().setFocusable(false);
                Ol().setFocusableInTouchMode(false);
                TuxIconView tuxIconView = this.LL;
                if (tuxIconView != null) {
                    tuxIconView.setVisibility(8);
                } else {
                    o.LJIJI("mClearAllBtn");
                    throw null;
                }
            }
            LJJJI();
            if (TextUtils.isEmpty(this.LJLLILLLL)) {
                Pl().setVisibility(8);
            } else {
                Pl().setVisibility(0);
                Pl().setText(this.LJLLILLLL);
            }
            if (this.LJLLJ > 0) {
                Il().setVisibility(0);
                TextView Il = Il();
                Object[] objArr = new Object[2];
                if (TextUtils.isEmpty(this.LJLL)) {
                    num = 0;
                } else {
                    String str = this.LJLL;
                    if (str != null) {
                        num = Integer.valueOf(str.length());
                    } else {
                        num = null;
                    }
                }
                objArr[0] = num;
                objArr[1] = Integer.valueOf(this.LJLLJ);
                Il.setText(getString(R.string.cm9, objArr));
            }
            Ol().setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: X.9VD
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
        o.LJIJI("mTvContentName");
        throw null;
    }
}
