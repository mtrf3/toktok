package com.bytedance.android.livesdk.browser.fragment;

import X.ActivityC45651qj;
import X.C0NB;
import X.C10A;
import X.C141335gf;
import X.C15380j0;
import X.C16880lQ;
import X.C1B3;
import X.C29S;
import X.C30937CCf;
import X.C3C5;
import X.C76800UCe;
import X.C90903hW;
import X.COE;
import X.COJ;
import X.InterfaceC30889CAj;
import X.InterfaceC30900CAu;
import Y.ACListenerS21S0101000_2;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class FullWebDialogFragment extends BaseDialogFragment implements COE, InterfaceC30900CAu, COJ {
    public static final /* synthetic */ int LJLLL = 0;
    public TextView LJLJJI;
    public TextView LJLJJL;
    public View LJLJJLL;
    public String LJLJL;
    public String LJLJLJ;
    public String LJLJLLL;
    public String LJLL;
    public TTLiveBrowserFragment LJLLI;
    public long LJLLILLLL;
    public long LJLLJ;

    @Override // X.COE
    public final void H3() {
    }

    @Override // X.COE
    public final void LLLZIL() {
    }

    @Override // X.COE
    public final void ib() {
        long currentTimeMillis = System.currentTimeMillis();
        this.LJLLJ = currentTimeMillis;
        C0NB.LIZIZ("onPageStarted", String.valueOf(currentTimeMillis - this.LJLLILLLL));
    }

    @Override // X.COE
    public final void mi() {
        C0NB.LIZIZ("onPageStarted", String.valueOf(System.currentTimeMillis() - this.LJLLJ));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x009d, code lost:
    
        if (X.C21090sD.LIZ != false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00af, code lost:
    
        if (X.C21090sD.LIZ != false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0115  */
    @Override // com.bytedance.android.live.BaseDialogFragmentV2, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStart() {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.fragment.FullWebDialogFragment.onStart():void");
    }

    @Override // X.InterfaceC30900CAu
    public final void Vb(InterfaceC30889CAj interfaceC30889CAj) {
        interfaceC30889CAj.LIZIZ().LIZLLL("close", new C30937CCf(this));
    }

    @Override // com.bytedance.android.live.core.widget.BaseDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.abi);
        this.LJLJL = getArguments().getString("key_url");
        this.LJLJLJ = getArguments().getString("original_scheme", "");
        this.LJLJLLL = getArguments().getString("key_from_type", "");
        String string = getArguments().getString("key_title", "");
        this.LJLL = string;
        if (TextUtils.isEmpty(string)) {
            this.LJLL = C15380j0.LJIILJJIL(R.string.t1c);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        getDialog().getWindow().setWindowAnimations(R.style.abi);
        long currentTimeMillis = System.currentTimeMillis();
        this.LJLLILLLL = currentTimeMillis;
        C0NB.LIZIZ("onCreateView", String.valueOf(currentTimeMillis));
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.cv8, viewGroup, false);
        this.LJLJJI = (TextView) LLLLIILL.findViewById(R.id.aeg);
        this.LJLJJL = (TextView) LLLLIILL.findViewById(R.id.title);
        this.LJLJJLL = LLLLIILL.findViewById(R.id.l_2);
        TTLiveBrowserFragment tTLiveBrowserFragment = new TTLiveBrowserFragment();
        tTLiveBrowserFragment.LJLJLLL = this.LJLJLLL;
        tTLiveBrowserFragment.LJLIL = this;
        tTLiveBrowserFragment.LJLLI = this;
        this.LJLLI = tTLiveBrowserFragment;
        Bundle bundle2 = new Bundle();
        bundle2.putString("url", this.LJLJL);
        bundle2.putString("original_scheme", this.LJLJLJ);
        bundle2.putBoolean("bundle_user_webview_title", true);
        bundle2.putBoolean("hide_nav_bar", true);
        tTLiveBrowserFragment.setArguments(bundle2);
        FragmentManager childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        C1B3 c1b3 = new C1B3(childFragmentManager);
        C29S c29s = null;
        c1b3.LJIIJ(this.LJLLI, null, R.id.at6);
        c1b3.LJI();
        this.LJLLI.LJLILLLLZI = this;
        C16880lQ.LJIJI(this.LJLJJI, new ACListenerS21S0101000_2(0, this, 8));
        this.LJLJJL.setText(this.LJLL);
        if (!getArguments().getBoolean("key_with_title_bar", true)) {
            this.LJLJJLL.setVisibility(8);
        }
        try {
            ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
            C10A.LIZIZ(LLLLIILL, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LLLLIILL;
    }
}
