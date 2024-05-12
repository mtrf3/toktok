package com.ss.android.ugc.aweme.crossplatform.activity;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C29S;
import X.C3C5;
import X.C59307NPj;
import X.C59314NPq;
import X.C76800UCe;
import X.C90903hW;
import X.FFL;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.ss.android.ugc.aweme.crossplatform.business.IMixActivityContainerProvider;
import com.ss.android.ugc.aweme.crossplatform.business.MixActivityContainerProvider;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class CrossPlatformFragment extends AbsFragment {
    public MixActivityContainer LJLIL;
    public C59314NPq LJLILLLLZI;
    public Runnable LJLJI;

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        boolean z = false;
        if (arguments != null) {
            FFL.LJIIIZ().getClass();
            z = arguments.getBoolean("webview_progress_bar", FFL.LJ(31744, "webview_progress_bar", true, false));
        }
        arguments.putBoolean("webview_progress_bar", z);
        C59314NPq LIZ = C59307NPj.LIZ(arguments);
        this.LJLILLLLZI = LIZ;
        IMixActivityContainerProvider LIZIZ = MixActivityContainerProvider.LIZIZ();
        if (LIZIZ != null) {
            this.LJLIL = LIZIZ.LIZ(mo49getActivity(), LIZ);
        }
        if (this.LJLIL == null) {
            this.LJLIL = new MixActivityContainer(mo49getActivity(), LIZ);
        }
        this.LJLIL.LJLJI = getArguments();
        this.LJLIL.LJLJLLL = this.LJLJI;
        getLifecycle().addObserver(this.LJLIL);
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        this.LJLIL.LJJII();
        super.onViewCreated(view, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        this.LJLIL.getClass();
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.aje, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }
}
