package com.bytedance.android.livesdk.ui;

import X.C03880Dg;
import X.C28329B9x;
import X.C65300Pk0;
import X.C73318Sq2;
import X.InterfaceC92693kP;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment;
import com.bytedance.android.livesdk.livesetting.performance.DataChannelGlobalOptSetting;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* loaded from: classes6.dex */
public class BaseFragment extends LiveThemeAwareFragment {
    public final C73318Sq2 compositeDisposable = new C73318Sq2();
    public boolean mStatusActive;
    public boolean mStatusDestroyed;
    public boolean mStatusViewValid;

    public void onVisible() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.mStatusViewValid = false;
        this.mStatusDestroyed = true;
        this.compositeDisposable.LIZLLL();
        if (DataChannelGlobalOptSetting.enableUnregisterOnBaseClass()) {
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
            dataChannelGlobal.getClass();
            dataChannelGlobal.jv0(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.mStatusViewValid = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.mStatusActive = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (getUserVisibleHint()) {
            onVisible();
        }
        this.mStatusActive = true;
    }

    public boolean isViewValid() {
        return this.mStatusViewValid;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mStatusActive = false;
        this.mStatusViewValid = false;
        this.mStatusDestroyed = false;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        if (C28329B9x.LIZJ(getContext())) {
            LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
            getContext();
            return onGetLayoutInflater;
        }
        return super.onGetLayoutInflater(bundle);
    }

    public void register(InterfaceC92693kP interfaceC92693kP) {
        this.compositeDisposable.LIZ(interfaceC92693kP);
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        boolean z2 = true;
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "-4634722157923905879");
        if (c03880Dg.LIZJ(10502, "com/bytedance/android/livesdk/ui/BaseFragment", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/bytedance/android/livesdk/ui/BaseFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        if (z == getUserVisibleHint()) {
            z2 = false;
        }
        super.setUserVisibleHint(z);
        if (isResumed() && z2 && getUserVisibleHint()) {
            onVisible();
        }
        c03880Dg.LIZIZ(10502, "com/bytedance/android/livesdk/ui/BaseFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mStatusViewValid = true;
    }
}
