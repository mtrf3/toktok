package com.ss.android.ugc.aweme.favorites.business.music;

import X.ActivityC45651qj;
import X.ActivityC86117Xqz;
import X.C10A;
import X.C141335gf;
import X.C221108m2;
import X.C27740Aue;
import X.C29S;
import X.C3C5;
import X.C40342FsQ;
import X.C40343FsR;
import X.C60890Nv4;
import X.C61168NzY;
import X.C62822Ol8;
import X.C76800UCe;
import X.C90903hW;
import X.InterfaceC60761Nsz;
import X.InterfaceC61213O0r;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;
import ql1.IDbS498S0100000_10;

@InterfaceC61213O0r
/* loaded from: classes11.dex */
public final class LynxRecommendedSoundsFragment extends AmeBaseFragment {
    public InterfaceC60761Nsz LJLIL;
    public final C62822Ol8 LJLILLLLZI;

    public LynxRecommendedSoundsFragment() {
        new LinkedHashMap();
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 189));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        InterfaceC60761Nsz interfaceC60761Nsz = this.LJLIL;
        if (interfaceC60761Nsz != null) {
            interfaceC60761Nsz.LJI(true);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        InterfaceC60761Nsz interfaceC60761Nsz = this.LJLIL;
        if (interfaceC60761Nsz != null) {
            interfaceC60761Nsz.LJIIIZ("viewDisappeared", null);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C27740Aue.LJIIIIZZ(mo49getActivity());
        C27740Aue.LJII(mo49getActivity());
        ActivityC86117Xqz activityC86117Xqz = (ActivityC86117Xqz) this.LJLILLLLZI.getValue();
        if (activityC86117Xqz != null) {
            activityC86117Xqz.activityConfiguration(C61168NzY.LJLIL);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJIJLIJ(C60890Nv4.LIZ());
        sparkContext.LJJI(new IDbS498S0100000_10(this, 0));
        C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        c40342FsQ.getClass();
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZ = C40343FsR.LIZ(C40342FsQ.LIZ(requireContext, sparkContext));
        LIZ.LJIIJJI(sparkContext);
        LIZ.LIZIZ();
        try {
            ViewTreeLifecycleOwner.set(LIZ, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LIZ, this);
            C10A.LIZIZ(LIZ, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            } else {
                c29s = null;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LIZ;
    }
}
