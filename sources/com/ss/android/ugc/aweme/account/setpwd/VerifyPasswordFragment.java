package com.ss.android.ugc.aweme.account.setpwd;

import X.ActivityC45651qj;
import X.C16360ka;
import X.C16880lQ;
import X.C2068389v;
import X.C221108m2;
import X.C252949wI;
import X.C26338AVi;
import X.C35936E8m;
import X.C52927Kpv;
import X.C62822Ol8;
import X.C71897SJp;
import X.C74088T5w;
import X.C74090T5y;
import X.C85144XbI;
import X.C85568Xi8;
import X.C85622Xj0;
import X.C85623Xj1;
import X.C85624Xj2;
import X.C85627Xj5;
import X.C85628Xj6;
import X.C85631Xj9;
import X.C85712XkS;
import X.C9WD;
import X.EnumC69116RAq;
import X.FMX;
import X.R41;
import X.RBV;
import X.X1D;
import Y.ACListenerS31S0100000_11;
import Y.ACListenerS35S0100000_15;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountBindingsService;
import com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment;
import com.ss.android.ugc.aweme.account.experiment.AccountBindingsService;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyWays;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class VerifyPasswordFragment extends BaseAccountBindingsFlowFragment {
    public static final /* synthetic */ int LLIIIILZ = 0;
    public EditText LLF;
    public final C62822Ol8 LLFII;
    public final C62822Ol8 LLFZ;
    public final C62822Ol8 LLI;
    public boolean LLIFFJFJJ;
    public final C62822Ol8 LLII;
    public final Map<Integer, View> LLIIII = new LinkedHashMap();
    public final IAccountBindingsService LLD = AccountBindingsService.LIZJ();
    public final C62822Ol8 LLFF = C221108m2.LIZIZ(new AqS165S0100000_15(this, 193));
    public final C62822Ol8 LLFFF = C221108m2.LIZIZ(new AqS165S0100000_15(this, 192));

    @Override // com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLIIII).clear();
    }

    @Override // com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLIIII;
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

    @Override // com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public VerifyPasswordFragment() {
        C221108m2.LIZIZ(new AqS165S0100000_15(this, 190));
        this.LLFII = C221108m2.LIZIZ(new AqS165S0100000_15(this, 194));
        this.LLFZ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 195));
        this.LLI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 191));
        this.LLIFFJFJJ = true;
        this.LLII = C221108m2.LIZIZ(new C85628Xj6(this));
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C85712XkS Jl() {
        boolean z;
        boolean LJIIIIZZ = RBV.LJIIIIZZ(this);
        boolean LIZ = C52927Kpv.LIZ();
        if ((this.LLD.LIZIZ() || this.LLD.LIZ()) && (xl() == EnumC69116RAq.MODIFY_PHONE || xl() == EnumC69116RAq.CHANGE_EMAIL || xl() == EnumC69116RAq.UNBIND_EMAIL || xl() == EnumC69116RAq.UNBIND_PHONE)) {
            z = true;
        } else {
            z = false;
        }
        if (!LJIIIIZZ && LIZ && !z) {
            TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.ah9);
            tuxTextView.setTuxFont(13);
            tuxTextView.setGravity(17);
            TuxTextView tuxTextView2 = (TuxTextView) _$_findCachedViewById(R.id.ah8);
            tuxTextView2.setTuxFont(41);
            tuxTextView2.setGravity(17);
            int dimensionPixelSize = tuxTextView2.getResources().getDimensionPixelSize(R.dimen.g0);
            C26338AVi.LJI(tuxTextView2, Integer.valueOf(dimensionPixelSize), Integer.valueOf(tuxTextView2.getResources().getDimensionPixelSize(R.dimen.fq)), Integer.valueOf(dimensionPixelSize), 0, false, 16);
        }
        C85712XkS c85712XkS = new C85712XkS(null, null, false, null, null, false, null, false, false, 131071);
        c85712XkS.LJIIIIZZ = getString(R.string.doq);
        c85712XkS.LJIIIZ = " ";
        c85712XkS.LJIIL = "verify_enter_password_page";
        c85712XkS.LJIILIIL = false;
        c85712XkS.LIZ = getString(R.string.t9i);
        c85712XkS.LJIILL = null;
        if (!z) {
            if (LJIIIIZZ) {
                if (LIZ) {
                    c85712XkS.LIZ = getString(R.string.t7o);
                    c85712XkS.LJIIIIZZ = getString(R.string.t7q);
                    c85712XkS.LJIILIIL = true;
                    c85712XkS.LJI = true;
                } else {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(getString(R.string.qfj));
                    LIZ2.append('\n');
                    LIZ2.append(getString(R.string.doq));
                    c85712XkS.LJIIIIZZ = X1D.LIZIZ(LIZ2);
                }
            } else if (LIZ) {
                c85712XkS.LJIIIIZZ = getString(R.string.t9n);
                c85712XkS.LJIIIZ = getString(R.string.t9l);
                c85712XkS.LJIILLIIL = true;
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = R.raw.icon_exclamation_mark_triangle_fill;
                c2068389v.LJ = Integer.valueOf(R.attr.e7);
                c85712XkS.LJIILL = c2068389v;
                c85712XkS.LJI = true;
            }
        }
        return c85712XkS;
    }

    public final String Xl() {
        return (String) this.LLFII.getValue();
    }

    public final List<TwoStepVerifyWays> Yl() {
        return (List) this.LLFZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void Hl() {
        ((C74088T5w) _$_findCachedViewById(R.id.eo4)).LIZ(true);
        ((C74088T5w) _$_findCachedViewById(R.id.h0u)).LIZ(true);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void Pl() {
        ((C74088T5w) _$_findCachedViewById(R.id.eo4)).LIZIZ(true);
        ((C74088T5w) _$_findCachedViewById(R.id.h0u)).LIZIZ(true);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final int getLayout() {
        if (C52927Kpv.LIZ()) {
            return R.layout.oy;
        }
        return R.layout.ot;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final boolean onBackPressed() {
        if (!RBV.LJIIIIZZ(this)) {
            R41.LJIIL(17, 2, new Bundle());
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        EditText editText = this.LLF;
        if (editText != null) {
            C9WD.LIZIZ(editText);
        } else {
            o.LJIJI("passwordInput");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        EditText editText = this.LLF;
        if (editText != null) {
            editText.setText("");
        } else {
            o.LJIJI("passwordInput");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Window window;
        super.onCreate(bundle);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (window = mo49getActivity.getWindow()) != null) {
            window.setSoftInputMode(48);
        }
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_from", getEnterFrom());
        FMX.LJIIL("verify_enter_password", c35936E8m.LIZ);
        Tl();
    }

    @Override // X.InterfaceC69056R8i
    public final void Sg(int i, String message) {
        o.LJIIIZ(message, "message");
        C252949wI c252949wI = (C252949wI) _$_findCachedViewById(R.id.eoi);
        if (c252949wI != null) {
            c252949wI.LIZIZ(message);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) {
        int i;
        TuxTextView tuxTextView;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (((Boolean) this.LLII.getValue()).booleanValue()) {
            String enterFrom = getEnterFrom();
            o.LJIIIIZZ(enterFrom, "enterFrom");
            String enterMethod = getEnterMethod();
            o.LJIIIIZZ(enterMethod, "enterMethod");
            C85144XbI.LJIIJ(enterFrom, enterMethod, "password");
        }
        C16880lQ.LJIIJ(new ACListenerS35S0100000_15(view, 81), view);
        EditText editText = ((C74090T5y) _$_findCachedViewById(R.id.eoh)).getEditText();
        this.LLF = editText;
        if (editText != null) {
            editText.setHint(getString(R.string.ie5));
            editText.addTextChangedListener(new C85627Xj5(this));
            View inputPasswordForgot = _$_findCachedViewById(R.id.eo2);
            o.LJIIIIZZ(inputPasswordForgot, "inputPasswordForgot");
            C85712XkS c85712XkS = this.LJLZ;
            o.LJI(c85712XkS);
            String str = c85712XkS.LJIIL;
            o.LJI(str);
            int i2 = 0;
            C85568Xi8.LIZ(inputPasswordForgot, this, str, false);
            if (RBV.LJIIIIZZ(this)) {
                C71897SJp c71897SJp = (C71897SJp) _$_findCachedViewById(R.id.b_d);
                TwoStepAuthApi.LIZ.getClass();
                c71897SJp.setChecked(TwoStepAuthApi.LJ());
                ((CompoundButton) _$_findCachedViewById(R.id.b_d)).setOnCheckedChangeListener(C85623Xj1.LJLIL);
                _$_findCachedViewById(R.id.eo4).setVisibility(8);
                _$_findCachedViewById(R.id.b9_).setVisibility(0);
                _$_findCachedViewById(R.id.b_d).setVisibility(0);
                _$_findCachedViewById(R.id.b_g).setVisibility(0);
                _$_findCachedViewById(R.id.h0u).setVisibility(0);
                if (C52927Kpv.LIZ()) {
                    C16880lQ.LJIL((ConstraintLayout) _$_findCachedViewById(R.id.b__), new ACListenerS35S0100000_15(this, 82));
                    if (Build.VERSION.SDK_INT < 30) {
                        getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.account.setpwd.VerifyPasswordFragment$onViewCreated$5
                            @Override // androidx.lifecycle.LifecycleEventObserver
                            public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                                o.LJIIIZ(source, "source");
                                o.LJIIIZ(event, "event");
                                if (event == Lifecycle.Event.ON_RESUME) {
                                    KeyboardUtils.LIZ(VerifyPasswordFragment.this.getViewLifecycleOwner(), view, new C85624Xj2(VerifyPasswordFragment.this));
                                }
                            }
                        });
                    } else {
                        C16360ka.LJIJJ(view, new C85622Xj0(this));
                    }
                } else {
                    C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.b_g), new ACListenerS35S0100000_15(this, 83));
                }
                if (!Yl().isEmpty()) {
                    _$_findCachedViewById(R.id.eo2).setVisibility(8);
                    _$_findCachedViewById(R.id.b9_).setVisibility(0);
                    C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.b9_), new ACListenerS35S0100000_15(this, 84));
                } else {
                    _$_findCachedViewById(R.id.eo2).setVisibility(0);
                    _$_findCachedViewById(R.id.b9_).setVisibility(8);
                }
                String enterFrom2 = getEnterFrom();
                o.LJIIIIZZ(enterFrom2, "enterFrom");
                String enterMethod2 = getEnterMethod();
                o.LJIIIIZZ(enterMethod2, "enterMethod");
                String platform = Xl();
                o.LJIIIIZZ(platform, "platform");
                C85144XbI.LJJIZ(enterFrom2, enterMethod2, platform, "password");
                Ol(new ACListenerS31S0100000_11(this, 13), _$_findCachedViewById(R.id.h0u));
                return;
            }
            _$_findCachedViewById(R.id.eo4).setVisibility(0);
            C74088T5w c74088T5w = (C74088T5w) _$_findCachedViewById(R.id.eo4);
            String string = getString(R.string.ipo);
            o.LJIIIIZZ(string, "getString(R.string.next)");
            c74088T5w.setText(string);
            if (Ql() && (this.LLD.LIZIZ() || this.LLD.LIZ())) {
                View view2 = getView();
                if (view2 != null && (tuxTextView = (TuxTextView) view2.findViewById(R.id.eo2)) != null) {
                    tuxTextView.setTuxFont(43);
                }
                TuxTextView tuxTextView2 = (TuxTextView) _$_findCachedViewById(R.id.b9_);
                if (!((ArrayList) C85631Xj9.LIZLLL(this)).isEmpty()) {
                    i = 0;
                } else {
                    i = 8;
                }
                tuxTextView2.setVisibility(i);
                tuxTextView2.setText(getString(R.string.hy5));
                C16880lQ.LJJJJI(tuxTextView2, new ACListenerS35S0100000_15(this, 80));
            } else {
                _$_findCachedViewById(R.id.b9_).setVisibility(8);
            }
            _$_findCachedViewById(R.id.b_d).setVisibility(8);
            _$_findCachedViewById(R.id.b_g).setVisibility(8);
            _$_findCachedViewById(R.id.h0u).setVisibility(8);
            View _$_findCachedViewById = _$_findCachedViewById(R.id.eo2);
            Bundle arguments = getArguments();
            if ((arguments != null && arguments.getInt("current_scene") == EnumC69116RAq.VERIFY_ACCOUNT_FROM_2SV.getValue()) || C52927Kpv.LIZ()) {
                i2 = 8;
            }
            _$_findCachedViewById.setVisibility(i2);
            Ol(new ACListenerS31S0100000_11(this, 12), _$_findCachedViewById(R.id.eo4));
            return;
        }
        o.LJIJI("passwordInput");
        throw null;
    }
}
