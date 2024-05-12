package com.ss.android.ugc.aweme.account.login.v2.ui.fragments;

import X.C207998Eh;
import X.C252949wI;
import X.C26045AKb;
import X.C35831E4l;
import X.C35936E8m;
import X.C53072KsG;
import X.C73318Sq2;
import X.C73849Syb;
import X.C74088T5w;
import X.C85712XkS;
import X.C9W6;
import X.C9WD;
import X.EnumC69113RAn;
import X.FFL;
import X.FMX;
import X.HandlerC85722Xkc;
import X.InterfaceC85741Xkv;
import X.RAN;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Editable;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.widget.EditText;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class SetNicknameFragment extends BaseI18nLoginFragment implements InterfaceC85741Xkv {
    public EditText LJZL;
    public boolean LLFFF;
    public long LLI;
    public boolean LLIFFJFJJ;
    public boolean LLIIII;
    public boolean LLIIIILZ;
    public final Map<Integer, View> LLIIIJ = new LinkedHashMap();
    public boolean LL = true;
    public final C73849Syb<Object> LLD = new C73849Syb<>();
    public final C73318Sq2 LLF = new C73318Sq2();
    public final HandlerC85722Xkc LLFF = new HandlerC85722Xkc(this);
    public String LLFII = "";
    public long LLFZ = SystemClock.elapsedRealtime();
    public final String LLII = "";

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final String Gl() {
        return "NicknameFragment";
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void Nl() {
        this.LL = false;
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_from", getEnterFrom());
        c35936E8m.LIZLLL("enter_method", getEnterMethod());
        c35936E8m.LIZLLL("platform", this.LLFII);
        c35936E8m.LIZLLL("login_panel_type", "signup");
        c35936E8m.LIZ(this.LLIFFJFJJ ? 1 : 0, "has_pre_fill");
        c35936E8m.LIZ(this.LLIIIILZ ? 1 : 0, "has_keyboard_suggest");
        FMX.LJIIL("set_nickname_skip", c35936E8m.LIZ);
        if (C35831E4l.LIZ() != 2) {
            C26045AKb c26045AKb = new C26045AKb(this);
            c26045AKb.LJIIIIZZ(R.string.dyo);
            c26045AKb.LJIIJ();
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.putInt("next_page", EnumC69113RAn.OPTIONAL_SIGNUP_PAGES.getValue());
            arguments.putInt("previous_page", EnumC69113RAn.CREATE_NICKNAME.getValue());
            rh(arguments);
        }
    }

    public final void Sl() {
        boolean LIZJ = C207998Eh.LIZJ(Ql());
        if (LIZJ) {
            this.LLD.onNext("");
        }
        C207998Eh.LIZ(getContext(), (TuxTextView) _$_findCachedViewById(R.id.cnb), LIZJ, Ql().length());
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLIIIJ).clear();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLIIIJ;
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
        return R.layout.os;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C85712XkS Jl() {
        String string;
        C85712XkS c85712XkS = new C85712XkS(null, null, false, null, null, false, null, false, false, 131071);
        c85712XkS.LIZ = getString(R.string.dr1);
        c85712XkS.LJIIIIZZ = getString(R.string.rcx);
        c85712XkS.LJIIIZ = getString(R.string.rcv);
        C53072KsG.LIZ.getClass();
        FFL.LJIIIZ().getClass();
        boolean z = false;
        if (FFL.LJIIL(0, true, "nickname_skip_button_test_android", 1) != 0) {
            string = "";
        } else {
            string = getString(R.string.qt3);
        }
        c85712XkS.LIZIZ = string;
        FFL.LJIIIZ().getClass();
        if (FFL.LJIIL(0, true, "nickname_skip_button_test_android", 1) != 0) {
            z = true;
        }
        c85712XkS.LJFF = !z;
        c85712XkS.LJIIJJI = true;
        c85712XkS.LJIIL = "set_nickname";
        c85712XkS.LJIILJJIL = true;
        return c85712XkS;
    }

    public final EditText Ql() {
        EditText editText = this.LJZL;
        if (editText != null) {
            return editText;
        }
        o.LJIJI("setNickname");
        throw null;
    }

    public final void Rl() {
        if (Build.VERSION.SDK_INT >= 26) {
            Ql().setInputType(65537);
            Ql().setAutofillHints(new String[]{"name"});
            Ql().setImportantForAutofill(1);
            ((AutofillManager) requireContext().getSystemService(AutofillManager.class)).notifyViewEntered(Ql());
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, X.InterfaceC18010nF
    public String getBtmPageCode() {
        return RAN.LIZ(EnumC69113RAn.CREATE_NICKNAME);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.LLF.LIZLLL();
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        this.LLI = (SystemClock.elapsedRealtime() - this.LLFZ) + this.LLI;
        super.onStop();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void Hl() {
        C74088T5w c74088T5w;
        Editable text = Ql().getText();
        o.LJIIIIZZ(text, "setNickname.text");
        if (text.length() > 0 && (c74088T5w = (C74088T5w) _$_findCachedViewById(R.id.jqd)) != null) {
            c74088T5w.LIZ(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void Pl() {
        C74088T5w c74088T5w;
        Editable text = Ql().getText();
        o.LJIIIIZZ(text, "setNickname.text");
        if (text.length() > 0 && (c74088T5w = (C74088T5w) _$_findCachedViewById(R.id.jqd)) != null) {
            c74088T5w.LIZIZ(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (C9W6.LIZ()) {
            C9WD.LIZIZ(Ql());
        } else {
            Ql().requestFocus();
        }
        this.LLFZ = SystemClock.elapsedRealtime();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final boolean onBackPressed() {
        return this.LL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0080, code lost:
    
        if (r5.length() != 0) goto L21;
     */
    @Override // X.InterfaceC85741Xkv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleMsg(android.os.Message r14) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.SetNicknameFragment.handleMsg(android.os.Message):void");
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String str = "";
        if (arguments != null && (string = arguments.getString("platform_profile", "")) != null) {
            str = string;
        }
        this.LLFII = str;
    }

    @Override // X.InterfaceC69056R8i
    public final void Sg(int i, String message) {
        C252949wI c252949wI;
        o.LJIIIZ(message, "message");
        View _$_findCachedViewById = _$_findCachedViewById(R.id.jqc);
        if (_$_findCachedViewById != null && (c252949wI = (C252949wI) _$_findCachedViewById.findViewById(R.id.eoi)) != null) {
            c252949wI.LIZIZ(message);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x014f, code lost:
    
        if (r1.equals("google") == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x01bd, code lost:
    
        r2 = X.R41.LIZIZ().getBoundSocialPlatforms().values().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x01cd, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x01d2, code lost:
    
        if (r2.hasNext() == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x01d4, code lost:
    
        r4 = r2.next();
        r1 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x01dd, code lost:
    
        if (r1.LIZIZ == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01e5, code lost:
    
        if (X.C78685UuP.LJJJZ(r1.LIZJ) == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01e7, code lost:
    
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x01e9, code lost:
    
        if (r4 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01eb, code lost:
    
        r10.LLIFFJFJJ = true;
        r2 = (X.C74090T5y) _$_findCachedViewById(com.zhiliaoapp.musically.R.id.jqc).findViewById(com.zhiliaoapp.musically.R.id.eoh);
        r1 = r4.LIZJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01f9, code lost:
    
        if (r1 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01fb, code lost:
    
        r0 = X.C40689Fy1.LLIIII(30, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0201, code lost:
    
        r2.setText(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0206, code lost:
    
        if (X.C76800UCe.LIZ != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x020d, code lost:
    
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0208, code lost:
    
        Rl();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0158, code lost:
    
        if (r1.equals("mobile") == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01ae, code lost:
    
        Rl();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0161, code lost:
    
        if (r1.equals("twitter") == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x016a, code lost:
    
        if (r1.equals("vk") == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0173, code lost:
    
        if (r1.equals("line") == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x017c, code lost:
    
        if (r1.equals("instagram") == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0185, code lost:
    
        if (r1.equals("google_onetap") == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x018e, code lost:
    
        if (r1.equals("kakaotalk") == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0198, code lost:
    
        if (r1.equals("facebook") == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01a2, code lost:
    
        if (r1.equals("sms_verification") == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01ac, code lost:
    
        if (r1.equals("email") != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01b9, code lost:
    
        if (r1.equals("m_twitter") == false) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean] */
    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r11, android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.SetNicknameFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
