package com.ss.android.ugc.aweme.account.bind;

import X.AbstractC73635Sv9;
import X.C221108m2;
import X.C62822Ol8;
import X.C69139RBn;
import X.C69150RBy;
import X.C73636SvA;
import X.C85621Xiz;
import X.FMX;
import X.R9P;
import X.RBV;
import Y.AfS63S0100000_11;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS161S0100000_11;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class BindEmailCodeVerifyFragment extends InputCodeFragmentV2 {
    public final Map<Integer, View> LLIIJLIL = new LinkedHashMap();
    public final C62822Ol8 LLIIIZ = C221108m2.LIZIZ(new AqS161S0100000_11(this, 7));
    public final C62822Ol8 LLIIJI = C221108m2.LIZIZ(new C69150RBy(this));

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLIIJLIL).clear();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
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

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2, com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C85712XkS Jl() {
        /*
            r18 = this;
            r3 = r18
            android.os.Bundle r2 = r3.getArguments()
            r10 = 0
            r1 = 1
            if (r2 == 0) goto Lad
            java.lang.String r0 = "show_skip"
            boolean r0 = r2.getBoolean(r0)
            if (r0 != r1) goto Lad
            r6 = 1
        L13:
            X.XkS r7 = new X.XkS
            r8 = 0
            r17 = 131071(0x1ffff, float:1.8367E-40)
            r9 = r8
            r11 = r8
            r12 = r8
            r13 = r10
            r14 = r8
            r15 = r10
            r16 = r10
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.String r5 = "twosv_setup"
            java.lang.String r4 = "page"
            java.lang.String r2 = ""
            if (r6 != 0) goto La9
            boolean r0 = X.C52927Kpv.LIZ()
            if (r0 == 0) goto La9
            android.os.Bundle r0 = r3.getArguments()
            if (r0 == 0) goto L3e
            java.lang.String r0 = r0.getString(r4)
            if (r0 != 0) goto L3f
        L3e:
            r0 = r2
        L3f:
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r5)
            if (r0 == 0) goto La9
            r0 = 2131847965(0x7f116b1d, float:1.9329422E38)
        L48:
            java.lang.String r0 = r3.getString(r0)
            r7.LJIIIIZZ = r0
            if (r6 != 0) goto L99
            boolean r0 = X.C52927Kpv.LIZ()
            if (r0 == 0) goto L99
            android.os.Bundle r0 = r3.getArguments()
            if (r0 == 0) goto L62
            java.lang.String r0 = r0.getString(r4)
            if (r0 != 0) goto L97
        L62:
            boolean r0 = kotlin.jvm.internal.o.LJ(r2, r5)
            if (r0 == 0) goto L99
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = r3.getEmail()
            r1[r10] = r0
            r0 = 2131847964(0x7f116b1c, float:1.932942E38)
            java.lang.String r0 = r3.getString(r0, r1)
        L77:
            r7.LJIIIZ = r0
            android.os.Bundle r2 = r3.getArguments()
            r1 = -1
            if (r2 == 0) goto L94
            java.lang.String r0 = "progress"
            int r0 = r2.getInt(r0, r1)
            if (r0 < 0) goto L94
            r0 = 2131847985(0x7f116b31, float:1.9329463E38)
            java.lang.String r0 = r3.getString(r0)
        L8f:
            r7.LIZ = r0
            r7.LJIILIIL = r10
            return r7
        L94:
            java.lang.String r0 = " "
            goto L8f
        L97:
            r2 = r0
            goto L62
        L99:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = r3.getEmail()
            r1[r10] = r0
            r0 = 2131826688(0x7f111800, float:1.9286267E38)
            java.lang.String r0 = r3.getString(r0, r1)
            goto L77
        La9:
            r0 = 2131826687(0x7f1117ff, float:1.9286265E38)
            goto L48
        Lad:
            r6 = 0
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.bind.BindEmailCodeVerifyFragment.Jl():X.XkS");
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final C85621Xiz Xl() {
        C85621Xiz c85621Xiz = new C85621Xiz();
        c85621Xiz.LIZIZ(getEmail());
        c85621Xiz.LIZIZ = false;
        c85621Xiz.LJ = RBV.LIZ(this);
        return c85621Xiz;
    }

    public final String getEmail() {
        return (String) this.LLIIIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void hm() {
        if (((Boolean) this.LLIIJI.getValue()).booleanValue()) {
            FMX.onEventV3("resend_code_email");
        }
        BindEmailFragment.LLFZ.invoke(this, getEmail(), "resend").LJIIIZ(new AfS63S0100000_11(this, 3)).LJIILL();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2
    public final void fm(String str) {
        boolean z;
        String str2;
        String email = getEmail();
        Bundle arguments = getArguments();
        if (arguments != null) {
            z = arguments.getBoolean("from_changePwd", false);
        } else {
            z = false;
        }
        String enterFrom = getEnterFrom();
        o.LJIIIIZZ(enterFrom, "enterFrom");
        String enterMethod = getEnterMethod();
        o.LJIIIIZZ(enterMethod, "enterMethod");
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (str2 = arguments2.getString("page")) == null) {
            str2 = "";
        }
        o.LJIIIZ(email, "email");
        C73636SvA.LIZ(this, this, AbstractC73635Sv9.LJ(new R9P(this, this, email, str, enterFrom, str2, enterMethod, z)).LJIIIZ(new AfS63S0100000_11(this, 21)).LJIIIIZZ(new AfS63S0100000_11(this, 22))).LJIIIZ(new C69139RBn(this)).LJIILL();
    }
}
