package com.ss.android.ugc.aweme.account.login.v2.ui.fragments;

import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C2068389v;
import X.C234529Ii;
import X.C235119Kp;
import X.C235929Ns;
import X.C252709vu;
import X.C26338AVi;
import X.C29S;
import X.C32151Nz;
import X.C34K;
import X.C3C5;
import X.C51029K0z;
import X.C63063Op1;
import X.C69093R9t;
import X.C6X6;
import X.C71897SJp;
import X.C74088T5w;
import X.C76800UCe;
import X.C78685UuP;
import X.C7MY;
import X.C85711XkR;
import X.C85712XkS;
import X.C85717XkX;
import X.C85729Xkj;
import X.C85739Xkt;
import X.C85837XmT;
import X.C90903hW;
import X.C9KF;
import X.EnumC69113RAn;
import X.EnumC69116RAq;
import X.FMX;
import X.InterfaceC65784Pro;
import X.O6R;
import X.OSZ;
import X.T5T;
import X.V86;
import Y.ACListenerS35S0100000_15;
import Y.ACListenerS49S0200000_15;
import Y.ARunnableS34S0200000_15;
import Y.ARunnableS51S0100000_15;
import Y.AfS30S0110000_15;
import Y.AfS67S0100000_15;
import Y.IDObjectS186S0100000_15;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.keva.Keva;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0200000_15;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class BindEmailWithoutVerifyFragment extends CommonInputEmailFragment {
    public int LLIFFJFJJ;
    public boolean LLII;
    public final Map<Integer, View> LLIIII = new LinkedHashMap();
    public final String LLFFF = "start_text";
    public final String LLFII = "click_add_email_page";
    public int LLFZ = 48;
    public String LLI = "";

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final int Kl() {
        return 2;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment, com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLIIII).clear();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment, com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
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

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final int getLayout() {
        return R.layout.oe;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, X.InterfaceC68974R5e
    public final String LJJLIIIJJI() {
        String str = this.LLI;
        if (o.LJ(str, "login")) {
            return "bind_pii_login";
        }
        if (o.LJ(str, "signup")) {
            return "bind_pii_signup";
        }
        return super.LJJLIIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, X.InterfaceC68974R5e
    public final String LJJLIIIJLLLLLLLZ() {
        String str = this.LLI;
        if (o.LJ(str, "signup") || o.LJ(str, "login")) {
            return "use_phone";
        }
        return super.LJJLIIIJLLLLLLLZ();
    }

    public final boolean fm() {
        String str = this.LLI;
        if (o.LJ(str, "login")) {
            em(new AqS165S0100000_15(this, 177));
            return true;
        }
        if (o.LJ(str, "signup")) {
            em(new C85717XkX(this));
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void Il() {
        if (_$_findCachedViewById(R.id.aha).getVisibility() == 8) {
            return;
        }
        C85712XkS Jl = Jl();
        C235119Kp c235119Kp = new C235119Kp();
        String str = Jl.LIZIZ;
        c235119Kp.LIZLLL = false;
        String str2 = Jl.LIZ;
        if (str2 != null && C78685UuP.LJJJZ(str2)) {
            C9KF c9kf = new C9KF();
            c9kf.LIZJ = str2;
            c235119Kp.LIZJ = c9kf;
        }
        if (C78685UuP.LJJJZ(str)) {
            Context context = getContext();
            if (context != null) {
                TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
                tuxTextView.setText(str);
                C16880lQ.LJJJJI(tuxTextView, new ACListenerS35S0100000_15(this, 53));
                tuxTextView.setTuxFont(41);
                tuxTextView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gv, context));
                tuxTextView.setGravity(17);
                C26338AVi.LJIIIZ(tuxTextView, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8))), null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8))), null, 26);
                C235929Ns c235929Ns = new C235929Ns();
                c235929Ns.LIZJ = tuxTextView;
                String tag = this.LLFFF;
                o.LJIIIZ(tag, "tag");
                c235929Ns.LIZIZ = tag;
                c235119Kp.LIZLLL(c235929Ns);
            }
        } else {
            View _$_findCachedViewById = _$_findCachedViewById(R.id.eo1);
            if (_$_findCachedViewById != null) {
                _$_findCachedViewById.setVisibility(0);
            }
            Ol(new ACListenerS35S0100000_15(this, 54), _$_findCachedViewById(R.id.eo1));
        }
        if (Jl.LJIILIIL) {
            C234529Ii c234529Ii = new C234529Ii();
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_question_mark_circle_ltr;
            c2068389v.LJ = Integer.valueOf(R.attr.gv);
            c234529Ii.LIZ(c2068389v);
            c234529Ii.LIZIZ(new AqS162S0200000_15(Jl, this, 10));
            c235119Kp.LIZIZ(c234529Ii);
        }
        ((C252709vu) _$_findCachedViewById(R.id.aha)).setNavActions(c235119Kp);
        View LJI = ((C252709vu) _$_findCachedViewById(R.id.aha)).LJI(this.LLFFF);
        if (LJI != null) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, C7MY.LIZIZ(40));
            layoutParams.gravity = 16;
            LJI.setLayoutParams(layoutParams);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C85712XkS Jl() {
        String str;
        Bundle arguments;
        Bundle arguments2 = getArguments();
        boolean z = false;
        if (arguments2 != null && arguments2.containsKey("show_skip") && (arguments = getArguments()) != null && arguments.getBoolean("show_skip")) {
            z = true;
        }
        C85712XkS c85712XkS = new C85712XkS(null, null, false, null, null, false, null, false, false, 131071);
        c85712XkS.LJIIIZ = getString(R.string.hxo);
        c85712XkS.LJIIIIZZ = getString(R.string.hxs);
        if (z) {
            c85712XkS.LIZIZ = getString(R.string.hxr);
        }
        c85712XkS.LJIIJJI = true;
        c85712XkS.LJIILIIL = true;
        c85712XkS.LJIIL = "bind_email_without_verify";
        String str2 = this.LLI;
        if (o.LJ(str2, "signup")) {
            str = getString(R.string.doj);
        } else if (o.LJ(str2, "login")) {
            str = getString(R.string.dq8);
        } else {
            str = " ";
        }
        c85712XkS.LIZ = str;
        return c85712XkS;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, X.C9WN
    public final void LLFII() {
        super.LLFII();
        View _$_findCachedViewById = _$_findCachedViewById(R.id.g_7);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.setTranslationY(0.0f);
        }
        _$_findCachedViewById(R.id.eny).setVisibility(8);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, X.C9WN
    public final void Rg() {
        View _$_findCachedViewById;
        super.Rg();
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (_$_findCachedViewById = _$_findCachedViewById(R.id.g_7)) != null) {
            _$_findCachedViewById.post(new ARunnableS34S0200000_15(this, mo49getActivity, 17));
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final boolean onBackPressed() {
        C85711XkR.LIZ(LJJLIIIJJI(), "phone", LJJLIIIJLLLLLLLZ(), "email");
        return fm();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment, com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Window window;
        super.onDestroyView();
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (window = mo49getActivity.getWindow()) != null) {
            window.setSoftInputMode(this.LLFZ);
        }
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.LLII = false;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment
    public final void dm(String data) {
        V86 v86;
        o.LJIIIZ(data, "data");
        String str = this.LLI;
        if (o.LJ(str, "login")) {
            v86 = V86.DYA_BIND_EMAIL_SOURCE_TYPE_LOGIN;
        } else if (o.LJ(str, "signup")) {
            v86 = V86.DYA_BIND_EMAIL_SOURCE_TYPE_SIGN_UP;
        } else {
            v86 = V86.DYABindEmailSourceTypeUnknown;
        }
        boolean isChecked = ((CompoundButton) _$_findCachedViewById(R.id.cti)).isChecked();
        String str2 = "phone";
        C85711XkR.LIZIZ(LJJLIIIJJI(), "email", "phone");
        if (xl() == EnumC69116RAq.BIND_PHONE_OR_EMAIL_3P_LOGIN || xl() == EnumC69116RAq.BIND_PHONE_OR_EMAIL_3P_SIGN_UP) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                str2 = arguments.getString("platform");
            } else {
                str2 = null;
            }
        }
        C69093R9t.LIZ(this, this, data, v86, str2).LJIIIZ(new AfS30S0110000_15(this, isChecked, 1)).LJIIIIZZ(new AfS67S0100000_15(this, 24)).LJIILL();
    }

    public final void em(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.putBoolean("should_bind_email", false);
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null && arguments2.getBoolean("should_bind_phone")) {
            Bundle arguments3 = getArguments();
            if (arguments3 != null) {
                arguments3.putInt("previous_page", Al().getValue());
                arguments3.putInt("next_page", EnumC69113RAn.BIND_PHONE_ON_SIGN_UP_OR_LOGIN.getValue());
                rh(arguments3);
                return;
            }
            return;
        }
        interfaceC65784Pro.invoke();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("auth_type");
        } else {
            str = null;
        }
        this.LLI = String.valueOf(str);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        T5T t5t;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C85837XmT.LIZJ(getContext(), (TuxTextView) _$_findCachedViewById(R.id.ah8), 2, 2, new ACListenerS35S0100000_15(this, 55));
        C74088T5w c74088T5w = (C74088T5w) _$_findCachedViewById(R.id.eo0);
        String string = getString(R.string.hxp);
        o.LJIIIIZZ(string, "getString(R.string.login…p_add_email_address_next)");
        c74088T5w.setButtonText(string);
        cm().setHint(getString(R.string.hxq));
        EditText cm = cm();
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        cm.setHintTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gp, context));
        cm().addTextChangedListener(new IDObjectS186S0100000_15(this, 2));
        Bundle arguments = getArguments();
        if ((arguments != null && arguments.getBoolean("is_check_box_legal")) || C63063Op1.LIZ()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            _$_findCachedViewById(R.id.b_q).setVisibility(0);
            ((TextView) _$_findCachedViewById(R.id.cts)).setText(getString(R.string.m5));
            FMX.LJIIL("show_button_consent_check_box", C51029K0z.LJJIIZI(new OSZ("enter_from", LJJLIIIJJI())));
            ((C71897SJp) _$_findCachedViewById(R.id.cti)).setChecked(C85729Xkj.LIZ());
            Ol(new ACListenerS49S0200000_15(new C34K(), this, 1), _$_findCachedViewById(R.id.cti));
        } else {
            _$_findCachedViewById(R.id.b_q).setVisibility(8);
        }
        C85739Xkt c85739Xkt = new C85739Xkt();
        ((Keva) c85739Xkt.LIZIZ.getValue()).storeInt("show_pii_index", ((Keva) c85739Xkt.LIZIZ.getValue()).getInt("show_pii_index", 0) + 1);
        C85711XkR.LJ(LJJLIIIJJI(), "email", "phone", LJJLIIIJLLLLLLLZ(), String.valueOf(((Keva) new C85739Xkt().LIZIZ.getValue()).getInt("show_pii_index", 0)));
        EditText cm2 = cm();
        if ((cm2 instanceof T5T) && (t5t = (T5T) cm2) != null) {
            t5t.setTuxFont(41);
        }
        view.post(new ARunnableS51S0100000_15(this, 23));
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        Window window;
        o.LJIIIZ(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (window = mo49getActivity.getWindow()) != null) {
            this.LLFZ = window.getAttributes().softInputMode;
            window.setSoftInputMode(32);
        }
        try {
            ViewTreeLifecycleOwner.set(onCreateView, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(onCreateView, this);
            C10A.LIZIZ(onCreateView, this);
            ActivityC45651qj mo49getActivity2 = mo49getActivity();
            if (mo49getActivity2 instanceof C29S) {
                c29s = (C29S) mo49getActivity2;
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

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment
    public final void Yl(RecyclerView recyclerView, EditText editText, String enterFrom, String enterMethod) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        C6X6.LIZ(recyclerView, editText, LJJLIIIJJI(), this.LLFII, "email");
    }
}
