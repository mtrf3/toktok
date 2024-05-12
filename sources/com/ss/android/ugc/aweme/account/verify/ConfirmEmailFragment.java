package com.ss.android.ugc.aweme.account.verify;

import X.AnonymousClass636;
import X.C16880lQ;
import X.C221108m2;
import X.C41565GSz;
import X.C62822Ol8;
import X.C69134RBi;
import X.C69135RBj;
import X.C69144RBs;
import X.C7GR;
import X.C85727Xkh;
import X.EnumC69113RAn;
import X.RBV;
import Y.ACListenerS35S0100000_15;
import Y.AfS28S1100000_15;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.ui.CountDownTimer;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class ConfirmEmailFragment extends CommonInputEmailFragment {
    public static final C69144RBs LLFZ = C69144RBs.LJLIL;
    public final Map<Integer, View> LLFII = new LinkedHashMap();
    public final C62822Ol8 LLFFF = C221108m2.LIZIZ(new C85727Xkh(this));

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment, com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLFII).clear();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment, com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLFII;
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

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment, com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C85712XkS Jl() {
        /*
            r14 = this;
            X.XkS r3 = new X.XkS
            r4 = 0
            r6 = 0
            r13 = 131071(0x1ffff, float:1.8367E-40)
            r5 = r4
            r7 = r4
            r8 = r4
            r9 = r6
            r10 = r4
            r11 = r6
            r12 = r6
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r0 = r14.em()
            if (r0 == 0) goto L86
            r0 = 2131844824(0x7f115ed8, float:1.9323052E38)
        L1a:
            java.lang.String r0 = r14.getString(r0)
            r3.LJIIIIZZ = r0
            android.os.Bundle r1 = r14.getArguments()
            if (r1 == 0) goto L84
            java.lang.String r0 = "purpose"
            java.lang.String r1 = r1.getString(r0)
        L2c:
            java.lang.String r0 = "security"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            r1 = 1
            if (r0 != 0) goto L49
            android.os.Bundle r2 = r14.getArguments()
            if (r2 == 0) goto L41
            java.lang.String r0 = "page"
            java.lang.String r4 = r2.getString(r0)
        L41:
            java.lang.String r0 = "twosv_setup"
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r4)
            if (r0 == 0) goto L71
        L49:
            r0 = 2131847970(0x7f116b22, float:1.9329432E38)
            java.lang.String r0 = r14.getString(r0)
        L50:
            r3.LJIIIZ = r0
            boolean r0 = r14.fm()
            if (r0 == 0) goto L6e
            r0 = 2131847985(0x7f116b31, float:1.9329463E38)
            java.lang.String r0 = r14.getString(r0)
        L5f:
            r3.LIZ = r0
            r3.LJIILIIL = r6
            r3.LJIIJJI = r1
            boolean r0 = r14.fm()
            if (r0 == 0) goto L6d
            r3.LJI = r1
        L6d:
            return r3
        L6e:
            java.lang.String r0 = " "
            goto L5f
        L71:
            boolean r0 = r14.em()
            if (r0 == 0) goto L7f
            r0 = 2131844823(0x7f115ed7, float:1.932305E38)
            java.lang.String r0 = r14.getString(r0)
            goto L50
        L7f:
            java.lang.String r0 = r14.Xl()
            goto L50
        L84:
            r1 = r4
            goto L2c
        L86:
            r0 = 2131844790(0x7f115eb6, float:1.9322983E38)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.verify.ConfirmEmailFragment.Jl():X.XkS");
    }

    public final boolean em() {
        return ((Boolean) this.LLFFF.getValue()).booleanValue();
    }

    public final boolean fm() {
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getInt("progress", -1) >= 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final boolean onBackPressed() {
        if (!fm() || !C41565GSz.LIZJ(mo49getActivity())) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment
    public final void dm(String data) {
        CountDownTimer countDownTimer;
        o.LJIIIZ(data, "data");
        C69135RBj LIZ = C69134RBi.LIZ(mo49getActivity(), data, xl());
        if (LIZ != null && (countDownTimer = LIZ.LIZ) != null && countDownTimer.isRunning()) {
            hm(data, false);
        } else {
            LLFZ.invoke(this, this, data, "user_click").LJIIIZ(new AfS28S1100000_15(this, data, 2)).LJIILL();
        }
    }

    public final void hm(String data, boolean z) {
        o.LJIIIZ(data, "data");
        RBV.LJIIJJI(this, data);
        RBV.LJIIIZ(this, z);
        Bundle arguments = getArguments();
        o.LJI(arguments);
        arguments.putInt("next_page", EnumC69113RAn.EMAIL_SMS_VERIFY.getValue());
        rh(arguments);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        cm().setEnabled(false);
        EditText cm = cm();
        Context context = cm().getContext();
        o.LJIIIIZZ(context, "emailInput.context");
        cm.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gp, context));
        TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.b9_);
        tuxTextView.setVisibility(0);
        C16880lQ.LJJJJI(tuxTextView, new ACListenerS35S0100000_15(this, 87));
        if (em()) {
            i = R.string.qwh;
        } else {
            i = R.string.qvi;
        }
        tuxTextView.setText(getString(i));
        Bundle arguments = getArguments();
        o.LJI(arguments);
        if (arguments.getBoolean("use_phone") || em()) {
            _$_findCachedViewById(R.id.b9a).setVisibility(0);
            TuxTextView change_step2 = (TuxTextView) _$_findCachedViewById(R.id.b9a);
            o.LJIIIIZZ(change_step2, "change_step2");
            C7GR.LIZ(change_step2, new ACListenerS35S0100000_15(this, 177), R.string.qvj, R.string.qvk);
        }
    }
}
