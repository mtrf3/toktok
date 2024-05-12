package com.gyf.barlibrary;

import X.C03880Dg;
import X.C65300Pk0;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* loaded from: classes15.dex */
public abstract class SimpleImmersionFragment extends Fragment implements SimpleImmersionOwner {
    public SimpleImmersionProxy mSimpleImmersionProxy = new SimpleImmersionProxy(this);

    @Override // com.gyf.barlibrary.SimpleImmersionOwner
    public boolean immersionBarEnabled() {
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.mSimpleImmersionProxy.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.mSimpleImmersionProxy.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.mSimpleImmersionProxy.onConfigurationChanged(configuration);
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "1055057716863909995");
        if (c03880Dg.LIZJ(10501, "com/gyf/barlibrary/SimpleImmersionFragment", "onHiddenChanged", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10501, "com/gyf/barlibrary/SimpleImmersionFragment", "onHiddenChanged", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.onHiddenChanged(z);
        this.mSimpleImmersionProxy.onHiddenChanged(z);
        c03880Dg.LIZIZ(10501, "com/gyf/barlibrary/SimpleImmersionFragment", "onHiddenChanged", null, objArr, this, c65300Pk0, true);
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "1055057716863909995");
        if (c03880Dg.LIZJ(10502, "com/gyf/barlibrary/SimpleImmersionFragment", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/gyf/barlibrary/SimpleImmersionFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.setUserVisibleHint(z);
        this.mSimpleImmersionProxy.setUserVisibleHint(z);
        c03880Dg.LIZIZ(10502, "com/gyf/barlibrary/SimpleImmersionFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }
}
