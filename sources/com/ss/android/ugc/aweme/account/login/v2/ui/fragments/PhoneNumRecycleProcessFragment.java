package com.ss.android.ugc.aweme.account.login.v2.ui.fragments;

import X.C03880Dg;
import X.C16880lQ;
import X.C221108m2;
import X.C26045AKb;
import X.C62354Oda;
import X.C62822Ol8;
import X.C65300Pk0;
import X.C85712XkS;
import X.DialogC25756A8y;
import Y.ACListenerS31S0100000_11;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS161S0100000_11;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PhoneNumRecycleProcessFragment extends BaseI18nLoginFragment {
    public ViewGroup LLFF;
    public ViewGroup LLFFF;
    public TextView LLFII;
    public C62354Oda LLFZ;
    public final Map<Integer, View> LLII = new LinkedHashMap();
    public final C62822Ol8 LJZL = C221108m2.LIZIZ(new AqS161S0100000_11(this, 31));
    public final C62822Ol8 LL = C221108m2.LIZIZ(new AqS161S0100000_11(this, 32));
    public final C62822Ol8 LLD = C221108m2.LIZIZ(new AqS161S0100000_11(this, 28));
    public final C62822Ol8 LLF = C221108m2.LIZIZ(new AqS161S0100000_11(this, 30));
    public final C62822Ol8 LLI = C221108m2.LIZIZ(new AqS161S0100000_11(this, 29));
    public final String LLIFFJFJJ = "monitor_login_phone_number_recycle_need_extra_op";

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void Pl() {
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLII).clear();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLII;
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
        return R.layout.mt;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void Hl() {
        Dialog dialog = (Dialog) this.LLI.getValue();
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C85712XkS Jl() {
        return new C85712XkS(" ", null, false, "", " ", false, null, false, false, 122110);
    }

    public final void LJII() {
        DialogC25756A8y dialogC25756A8y = (DialogC25756A8y) this.LLI.getValue();
        if (dialogC25756A8y == null || new C03880Dg(2).LIZJ(300000, "com/bytedance/tux/status/loading/TuxLoadingDialogHUD", "show", dialogC25756A8y, new Object[0], "void", new C65300Pk0(false, "()V", "-1986933816284863257")).LIZ) {
            return;
        }
        dialogC25756A8y.show();
    }

    public final String Ql() {
        return (String) this.LJZL.getValue();
    }

    @Override // X.InterfaceC69056R8i
    public final void Sg(int i, String message) {
        o.LJIIIZ(message, "message");
        Dialog dialog = (Dialog) this.LLI.getValue();
        if (dialog != null) {
            dialog.dismiss();
        }
        C26045AKb c26045AKb = new C26045AKb(this);
        c26045AKb.LJIIIZ(message);
        c26045AKb.LJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LLFF = (ViewGroup) view.findViewById(R.id.j51);
        this.LLFFF = (ViewGroup) view.findViewById(R.id.j5j);
        this.LLFII = (TextView) view.findViewById(R.id.mby);
        this.LLFZ = (C62354Oda) view.findViewById(R.id.eiw);
        TextView textView = this.LLFII;
        if (textView != null) {
            textView.setText((String) this.LL.getValue());
        }
        C62354Oda c62354Oda = this.LLFZ;
        if (c62354Oda != null) {
            c62354Oda.setImageURI((String) this.LLD.getValue());
        }
        ViewGroup viewGroup = this.LLFF;
        if (viewGroup != null) {
            C16880lQ.LJIIL(viewGroup, new ACListenerS31S0100000_11(this, 9));
        }
        ViewGroup viewGroup2 = this.LLFFF;
        if (viewGroup2 != null) {
            C16880lQ.LJIIL(viewGroup2, new ACListenerS31S0100000_11(this, 10));
        }
    }
}
