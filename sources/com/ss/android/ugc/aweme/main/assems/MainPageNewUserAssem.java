package com.ss.android.ugc.aweme.main.assems;

import X.C36152EGu;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tiktok.homepage.mainfragment.BaseMainPageFragmentAssem;
import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public final class MainPageNewUserAssem extends BaseMainPageFragmentAssem {
    @Override // com.bytedance.tiktok.homepage.mainfragment.BaseMainPageFragmentAssem, X.InterfaceC54059LJn
    public final void M1(ViewGroup viewGroup) {
        if (!(viewGroup instanceof View)) {
            viewGroup = null;
        }
        if (viewGroup == null) {
            return;
        }
        C36152EGu.LIZ = new WeakReference<>(viewGroup);
    }
}
