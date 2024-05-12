package com.ss.android.ugc.aweme.account.login.v2.ui.fragments;

import X.C207998Eh;
import X.C85712XkS;
import X.EnumC252729vw;
import X.EnumC69113RAn;
import android.os.Bundle;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class SetAvatarFragment extends CommonSetAvatarFragment {
    public TuxTextView LLIIIZ;
    public final Map<Integer, View> LLIIJLIL = new LinkedHashMap();
    public boolean LLIIJI = true;

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final String Gl() {
        return "AvatarFragment";
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void Hl() {
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void Pl() {
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonSetAvatarFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLIIJLIL).clear();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonSetAvatarFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLIIJLIL;
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
        return R.layout.oq;
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
        EnumC252729vw enumC252729vw = EnumC252729vw.PRIMARY;
        o.LJIIIZ(enumC252729vw, "<set-?>");
        c85712XkS.LIZJ = enumC252729vw;
        c85712XkS.LJIIIIZZ = getString(R.string.bbc);
        c85712XkS.LJIIIZ = getString(R.string.bbb);
        c85712XkS.LIZIZ = getString(R.string.qt3);
        c85712XkS.LJIIL = "set_avatar";
        return c85712XkS;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonSetAvatarFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void Nl() {
        super.Nl();
        this.LLIIJI = false;
        Wl();
    }

    public final void Wl() {
        C207998Eh.LIZIZ();
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.putInt("next_page", EnumC69113RAn.OPTIONAL_SIGNUP_PAGES.getValue());
            arguments.putInt("previous_page", EnumC69113RAn.CREATE_AVATAR.getValue());
            rh(arguments);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final boolean onBackPressed() {
        return this.LLIIJI;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0071, code lost:
    
        if (r1.getBoolean("has_set_nickname", false) == true) goto L12;
     */
    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonSetAvatarFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r13, android.os.Bundle r14) {
        /*
            r12 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.o.LJIIIZ(r13, r0)
            super.onViewCreated(r13, r14)
            r0 = 2131372046(0x7f0a280e, float:1.8364144E38)
            android.view.View r1 = r13.findViewById(r0)
            java.lang.String r0 = "view.findViewById(R.id.nickname)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            com.bytedance.tux.input.TuxTextView r1 = (com.bytedance.tux.input.TuxTextView) r1
            r12.LLIIIZ = r1
            r0 = 2131363076(0x7f0a0504, float:1.834595E38)
            android.view.View r5 = r12._$_findCachedViewById(r0)
            com.bytedance.tux.input.TuxTextView r5 = (com.bytedance.tux.input.TuxTextView) r5
            r0 = 23
            r5.setTuxFont(r0)
            android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            r10 = 0
            if (r0 == 0) goto Lb2
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r4 = X.C16530kr.LIZJ(r1)
        L35:
            android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto Lb0
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r3 = X.C16530kr.LIZIZ(r1)
        L43:
            r0 = 24
            int r1 = X.C7MY.LIZIZ(r0)
            r2 = 8
            int r0 = X.C7MY.LIZIZ(r2)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            r11 = 16
            X.C26338AVi.LJI(r5, r6, r7, r8, r9, r10, r11)
            android.os.Bundle r1 = r12.getArguments()
            if (r1 == 0) goto Lae
            java.lang.String r0 = "has_set_nickname"
            boolean r1 = r1.getBoolean(r0, r10)
            r0 = 1
            if (r1 != r0) goto Lae
        L73:
            r4 = 0
            java.lang.String r3 = "nickname"
            if (r0 == 0) goto La6
            com.bytedance.tux.input.TuxTextView r2 = r12.LLIIIZ
            if (r2 == 0) goto Lb8
            X.Ol8 r0 = r12.LLFFF
            java.lang.Object r1 = r0.getValue()
            java.lang.String r0 = "<get-curUser>(...)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            com.ss.android.ugc.aweme.profile.model.User r1 = (com.ss.android.ugc.aweme.profile.model.User) r1
            java.lang.String r0 = r1.getNickname()
            r2.setText(r0)
            com.bytedance.tux.input.TuxTextView r0 = r12.LLIIIZ
            if (r0 == 0) goto Lb4
            r0.setVisibility(r10)
        L97:
            X.SY4 r2 = r12.Sl()
            Y.ACListenerS35S0100000_15 r1 = new Y.ACListenerS35S0100000_15
            r0 = 75
            r1.<init>(r12, r0)
            r12.Ol(r1, r2)
            return
        La6:
            com.bytedance.tux.input.TuxTextView r0 = r12.LLIIIZ
            if (r0 == 0) goto Lbc
            r0.setVisibility(r2)
            goto L97
        Lae:
            r0 = 0
            goto L73
        Lb0:
            r3 = 0
            goto L43
        Lb2:
            r4 = 0
            goto L35
        Lb4:
            kotlin.jvm.internal.o.LJIJI(r3)
            throw r4
        Lb8:
            kotlin.jvm.internal.o.LJIJI(r3)
            throw r4
        Lbc:
            kotlin.jvm.internal.o.LJIJI(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.SetAvatarFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
