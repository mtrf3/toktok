package com.ss.android.ugc.aweme.account.login.v2.ui.fragments;

import X.C252949wI;
import X.C42440GlA;
import X.C54081LKj;
import X.C54082LKk;
import X.C6X6;
import X.C74088T5w;
import X.C74090T5y;
import X.C85672Xjo;
import X.C9W6;
import X.C9WD;
import X.EnumC69113RAn;
import X.InterfaceC56322M8o;
import X.RBV;
import Y.ACListenerS35S0100000_15;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.poplayer.core.PopupManager;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class InputEmailFragment extends BaseI18nLoginFragment implements InterfaceC56322M8o {
    public EditText LJZL;
    public final Map<Integer, View> LLD = new LinkedHashMap();
    public final String LL = "input_email";

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLD).clear();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLD;
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
        return R.layout.oj;
    }

    @Override // X.InterfaceC56322M8o
    public final boolean needConflictWithParent() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void Hl() {
        ((C74088T5w) _$_findCachedViewById(R.id.eo0)).LIZ(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C85712XkS Jl() {
        /*
            r12 = this;
            android.os.Bundle r0 = r12.getArguments()
            kotlin.jvm.internal.o.LJI(r0)
            java.lang.String r1 = "show_skip"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L54
            android.os.Bundle r0 = r12.getArguments()
            kotlin.jvm.internal.o.LJI(r0)
            boolean r0 = r0.getBoolean(r1)
            if (r0 == 0) goto L54
            r3 = 1
        L1d:
            r2 = 2131826608(0x7f1117b0, float:1.9286105E38)
            r1 = 2131826598(0x7f1117a6, float:1.9286085E38)
            r0 = 2131832969(0x7f113089, float:1.9299007E38)
            if (r3 == 0) goto L56
            java.lang.String r5 = r12.getString(r0)
            java.lang.String r6 = r12.getString(r1)
            java.lang.String r2 = r12.getString(r2)
            X.RAq r1 = r12.xl()
            X.RAq r0 = X.EnumC69116RAq.RECOVER_ACCOUNT
            if (r1 == r0) goto L52
            r9 = 1
        L3d:
            r0 = 2131844696(0x7f115e58, float:1.9322792E38)
            java.lang.String r3 = r12.getString(r0)
            X.XkS r1 = new X.XkS
            r4 = 0
            r7 = 1
            java.lang.String r8 = "reset_email_input"
            r11 = 99580(0x184fc, float:1.39541E-40)
            r10 = r7
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r1
        L52:
            r9 = 0
            goto L3d
        L54:
            r3 = 0
            goto L1d
        L56:
            java.lang.String r5 = r12.getString(r0)
            java.lang.String r6 = r12.getString(r1)
            java.lang.String r2 = r12.getString(r2)
            X.RAq r1 = r12.xl()
            X.RAq r0 = X.EnumC69116RAq.RECOVER_ACCOUNT
            if (r1 == r0) goto L7a
            r9 = 1
        L6b:
            X.XkS r1 = new X.XkS
            r3 = 0
            r4 = 0
            r7 = 1
            java.lang.String r8 = "reset_email_input"
            r11 = 99582(0x184fe, float:1.39544E-40)
            r10 = r7
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r1
        L7a:
            r9 = 0
            goto L6b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputEmailFragment.Jl():X.XkS");
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, X.C9WN
    public final void LLFII() {
        View _$_findCachedViewById = _$_findCachedViewById(R.id.eny);
        if (_$_findCachedViewById == null) {
            return;
        }
        _$_findCachedViewById.setVisibility(8);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void Pl() {
        ((C74088T5w) _$_findCachedViewById(R.id.eo0)).LIZIZ(true);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, X.C9WN
    public final void Rg() {
        View _$_findCachedViewById = _$_findCachedViewById(R.id.eny);
        if (_$_findCachedViewById == null) {
            return;
        }
        _$_findCachedViewById.setVisibility(0);
    }

    @Override // X.InterfaceC55643Lsd
    public final C54082LKk getPopupContext() {
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        return C54081LKj.LIZ(requireContext, this);
    }

    @Override // X.InterfaceC55643Lsd
    public final boolean isSceneActive() {
        return getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (C9W6.LIZ()) {
            EditText editText = this.LJZL;
            if (editText != null) {
                C9WD.LIZIZ(editText);
                return;
            } else {
                o.LJIJI("emailInput");
                throw null;
            }
        }
        EditText editText2 = this.LJZL;
        if (editText2 != null) {
            editText2.requestFocus();
        } else {
            o.LJIJI("emailInput");
            throw null;
        }
    }

    @Override // X.InterfaceC55643Lsd
    public final String getSceneId() {
        return this.LL;
    }

    public final void Ql(String str, boolean z) {
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        RBV.LJIIJJI(this, str);
        arguments.putBoolean("code_sent", z);
        arguments.putInt("next_page", EnumC69113RAn.EMAIL_SMS_FIND_PASSWORD.getValue());
        rh(arguments);
    }

    @Override // X.InterfaceC69056R8i
    public final void Sg(int i, String message) {
        C252949wI c252949wI;
        o.LJIIIZ(message, "message");
        View _$_findCachedViewById = _$_findCachedViewById(R.id.enz);
        if (_$_findCachedViewById != null && (c252949wI = (C252949wI) _$_findCachedViewById.findViewById(R.id.eoi)) != null) {
            c252949wI.LIZIZ(message);
        }
        if (i == 1356) {
            PopupManager.LJIIL(new C42440GlA(this, mo49getActivity()));
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        EditText editText = ((C74090T5y) _$_findCachedViewById(R.id.eoh)).getEditText();
        this.LJZL = editText;
        if (editText != null) {
            editText.setInputType(32);
            editText.addTextChangedListener(new C85672Xjo(this));
            editText.setNextFocusDownId(editText.getId());
            editText.setHint(getString(R.string.doz));
            String LIZIZ = RBV.LIZIZ(this);
            if (!TextUtils.isEmpty(LIZIZ)) {
                editText.setText(LIZIZ);
                editText.setSelection(LIZIZ.length());
            }
            Ol(new ACListenerS35S0100000_15(this, 67), _$_findCachedViewById(R.id.eo0));
            RecyclerView inputEmailDomainHint = (RecyclerView) _$_findCachedViewById(R.id.eny);
            o.LJIIIIZZ(inputEmailDomainHint, "inputEmailDomainHint");
            EditText editText2 = this.LJZL;
            if (editText2 != null) {
                String enterFrom = getEnterFrom();
                o.LJIIIIZZ(enterFrom, "enterFrom");
                String enterMethod = getEnterMethod();
                o.LJIIIIZZ(enterMethod, "enterMethod");
                C6X6.LIZ(inputEmailDomainHint, editText2, enterFrom, enterMethod, "");
                return;
            }
            o.LJIJI("emailInput");
            throw null;
        }
        o.LJIJI("emailInput");
        throw null;
    }
}
