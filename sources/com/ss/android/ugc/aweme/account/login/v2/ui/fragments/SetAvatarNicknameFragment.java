package com.ss.android.ugc.aweme.account.login.v2.ui.fragments;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C207998Eh;
import X.C221108m2;
import X.C29S;
import X.C35936E8m;
import X.C3C5;
import X.C47261Igj;
import X.C62822Ol8;
import X.C73318Sq2;
import X.C73849Syb;
import X.C73969T1h;
import X.C74090T5y;
import X.C76800UCe;
import X.C85712XkS;
import X.C85729Xkj;
import X.C90903hW;
import X.EnumC252729vw;
import X.EnumC69113RAn;
import X.FFL;
import X.FMX;
import X.InterfaceC64592gB;
import X.InterfaceC85741Xkv;
import X.SFB;
import X.SY4;
import X.T16;
import X.T5T;
import Y.ACListenerS35S0100000_15;
import Y.AfS53S0100000_1;
import Y.IDObjectS186S0100000_15;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.abmock.ClientExpManager;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.account.login.KeyBoardListenerWindow;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes16.dex */
public final class SetAvatarNicknameFragment extends CommonSetAvatarFragment implements InterfaceC85741Xkv, SFB {
    public EditText LLIIIZ;
    public TuxTextView LLIIJI;
    public FrameLayout LLIIJLIL;
    public View LLIIL;
    public boolean LLILIL;
    public int LLILL;
    public final Map<Integer, View> LLILLIZIL = new LinkedHashMap();
    public final C62822Ol8 LLIILII = C221108m2.LIZIZ(new AqS165S0100000_15(this, 189));
    public final C73849Syb<Object> LLIILZL = new C73849Syb<>();
    public final C73318Sq2 LLIIZ = new C73318Sq2();
    public int LLIL = 48;
    public boolean LLILII = true;

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final String Gl() {
        return "SetAvatarNicknameFragment";
    }

    public final void Zl() {
        boolean LIZJ = C207998Eh.LIZJ(Xl());
        if (LIZJ) {
            this.LLIILZL.onNext("");
        }
        Context context = getContext();
        TuxTextView tuxTextView = this.LLIIJI;
        if (tuxTextView != null) {
            C207998Eh.LIZ(context, tuxTextView, LIZJ, Xl().length());
        } else {
            o.LJIJI("nicknameLenHint");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonSetAvatarFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLILLIZIL).clear();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonSetAvatarFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLILLIZIL;
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

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final int getLayout() {
        return R.layout.or;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonSetAvatarFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C85712XkS Jl() {
        C85712XkS c85712XkS = new C85712XkS(null, null, false, null, null, false, null, false, false, 131071);
        c85712XkS.LIZ = getString(R.string.dr1);
        c85712XkS.LIZIZ = getString(R.string.qt3);
        EnumC252729vw enumC252729vw = EnumC252729vw.PRIMARY;
        o.LJIIIZ(enumC252729vw, "<set-?>");
        c85712XkS.LIZJ = enumC252729vw;
        c85712XkS.LJIIJJI = true;
        c85712XkS.LJIIL = "set_avatar_and_nickname";
        c85712XkS.LJIILJJIL = true;
        return c85712XkS;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, X.C9WN
    public final void LLFII() {
        View view = this.LLIIL;
        if (view != null) {
            view.scrollBy(0, -this.LLILL);
            this.LLILL = 0;
        } else {
            o.LJIJI("rootView");
            throw null;
        }
    }

    public final EditText Xl() {
        EditText editText = this.LLIIIZ;
        if (editText != null) {
            return editText;
        }
        o.LJIJI("nicknameEditTextView");
        throw null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        Window window;
        this.LLIIZ.LIZLLL();
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (window = mo49getActivity.getWindow()) != null) {
            window.setSoftInputMode(this.LLIL);
        }
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void Hl() {
        Sl().setLoading(false);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonSetAvatarFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void Nl() {
        super.Nl();
        this.LLILII = false;
        FMX.LJIIL("set_nickname_skip", Rl().LIZ);
        Wl();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void Pl() {
        Editable text = Xl().getText();
        o.LJIIIIZZ(text, "nicknameEditTextView.text");
        if (text.length() > 0) {
            Sl().setLoading(true);
        }
    }

    public final void Wl() {
        C207998Eh.LIZIZ();
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.putInt("next_page", EnumC69113RAn.OPTIONAL_SIGNUP_PAGES.getValue());
            arguments.putInt("previous_page", EnumC69113RAn.CREATE_AVATAR_AND_NICKNAME.getValue());
            rh(arguments);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final boolean onBackPressed() {
        return this.LLILII;
    }

    public static String Yl(int i) {
        if (i == 2550) {
            return "sensitive_case";
        }
        if (C47261Igj.LJJIJIIJI(2079, 3002265).contains(Integer.valueOf(i))) {
            return "rule_break";
        }
        return "server_error";
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008a, code lost:
    
        if (r4.length() != 0) goto L34;
     */
    @Override // X.InterfaceC85741Xkv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleMsg(android.os.Message r11) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.SetAvatarNicknameFragment.handleMsg(android.os.Message):void");
    }

    @Override // X.SFB
    public final void zi(int i) {
        SY4 Sl = Sl();
        try {
            C62822Ol8 c62822Ol8 = C207998Eh.LIZIZ;
            ((Rect) c62822Ol8.getValue()).setEmpty();
            Sl.getGlobalVisibleRect((Rect) c62822Ol8.getValue());
            int i2 = ((Rect) c62822Ol8.getValue()).bottom - (i - C207998Eh.LIZ);
            if (i2 > 0) {
                this.LLILL += i2;
                View view = this.LLIIL;
                if (view != null) {
                    view.scrollBy(0, i2);
                } else {
                    o.LJIJI("rootView");
                    throw null;
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v4, types: [boolean] */
    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonSetAvatarFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        T5T t5t;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.j71);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.root)");
        this.LLIIL = findViewById;
        View findViewById2 = view.findViewById(R.id.h1h);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.nickname_len_hint)");
        this.LLIIJI = (TuxTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.jqc);
        Context context = getContext();
        Drawable drawable = null;
        if (context != null) {
            drawable = context.getDrawable(R.drawable.wi);
        }
        findViewById3.setBackground(drawable);
        o.LJIIIIZZ(findViewById3, "view.findViewById<FrameL…nickname_input)\n        }");
        this.LLIIJLIL = (FrameLayout) findViewById3;
        EditText editText = ((C74090T5y) view.findViewById(R.id.eoh)).getEditText();
        if ((editText instanceof T5T) && (t5t = (T5T) editText) != null) {
            t5t.setTuxFont(41);
        }
        o.LJIIIZ(editText, "<set-?>");
        this.LLIIIZ = editText;
        EditText Xl = Xl();
        Xl.setNextFocusDownId(getId());
        Xl.setHint(getString(R.string.rcw));
        Xl.addTextChangedListener(new IDObjectS186S0100000_15(this, 0));
        Zl();
        this.LLIIZ.LIZ(this.LLIILZL.LJJLIIIJILLIZJL(3000L, TimeUnit.MILLISECONDS).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS53S0100000_1(view, 12), new InterfaceC64592gB() { // from class: X.9Dv
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }));
        int i = 0;
        Sl().setEnabled(false);
        Ol(new ACListenerS35S0100000_15(this, 76), Sl());
        if (!AccountService.LJIJ().LJFF().isChildrenMode() && C85729Xkj.LIZ) {
            a.LJIILIIL().LJI("email_consent");
        }
        C35936E8m Rl = Rl();
        Rl.LIZ(FFL.LJIIIZ().LJIIJJI(ClientExpManager.signup_login_bind_phone_email(), "signup_login_bind_phone_email"), "binding");
        try {
            SettingsManager.LIZLLL().getClass();
            i = SettingsManager.LIZ("enable_signup_login_bind_phone_email", false);
        } catch (Throwable unused) {
        }
        Rl.LIZ(i, "is_binding_enabled");
        FMX.LJIIL("set_nickname_show", Rl.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        Window window;
        o.LJIIIZ(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (window = mo49getActivity.getWindow()) != null) {
            this.LLIL = window.getAttributes().softInputMode;
            window.setSoftInputMode(48);
        }
        ActivityC45651qj mo49getActivity2 = mo49getActivity();
        if (mo49getActivity2 != null) {
            new KeyBoardListenerWindow(this, mo49getActivity2, this);
        }
        try {
            ViewTreeLifecycleOwner.set(onCreateView, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(onCreateView, this);
            C10A.LIZIZ(onCreateView, this);
            ActivityC45651qj mo49getActivity3 = mo49getActivity();
            if (mo49getActivity3 instanceof C29S) {
                c29s = (C29S) mo49getActivity3;
            } else {
                c29s = null;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return onCreateView;
    }
}
