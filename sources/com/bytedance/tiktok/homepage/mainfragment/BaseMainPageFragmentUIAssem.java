package com.bytedance.tiktok.homepage.mainfragment;

import X.C55096Ljo;
import X.InterfaceC54059LJn;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class BaseMainPageFragmentUIAssem extends UIContentAssem implements InterfaceC54059LJn {
    @Override // X.InterfaceC54059LJn
    public void LJLJJLL(String str, String str2, boolean z, boolean z2, Bundle bundle, String str3) {
    }

    @Override // X.InterfaceC54059LJn
    public void LLLLZLLIL(String str, Fragment fragment, Fragment fragment2) {
    }

    @Override // X.InterfaceC54059LJn
    public final void M1(ViewGroup viewGroup) {
    }

    @Override // X.InterfaceC54059LJn
    public void onNewIntent(Intent intent) {
    }

    public BaseMainPageFragmentUIAssem() {
        new LinkedHashMap();
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
    public void W2(Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
    }
}
