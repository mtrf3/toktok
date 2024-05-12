package com.bytedance.tiktok.homepage.mainfragment;

import X.C55096Ljo;
import X.C8W0;
import X.InterfaceC54059LJn;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class BaseMainPageFragmentAssem extends C8W0 implements InterfaceC54059LJn {
    @Override // X.InterfaceC54059LJn
    public void LJLJJLL(String str, String str2, boolean z, boolean z2, Bundle bundle, String str3) {
    }

    @Override // X.InterfaceC54059LJn
    public final void LLLLZLLIL(String str, Fragment fragment, Fragment fragment2) {
    }

    @Override // X.InterfaceC54059LJn
    public void M1(ViewGroup viewGroup) {
    }

    @Override // X.InterfaceC54059LJn
    public final void onNewIntent(Intent intent) {
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // X.InterfaceC54059LJn
    public void LLZILL(View container) {
        o.LJIIIZ(container, "container");
    }

    @Override // X.InterfaceC54059LJn
    public final void W2(Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
    }
}
