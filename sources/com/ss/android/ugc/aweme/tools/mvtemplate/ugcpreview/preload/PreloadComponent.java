package com.ss.android.ugc.aweme.tools.mvtemplate.ugcpreview.preload;

import X.ActivityC86117Xqz;
import X.C35516Dwm;
import X.HQU;
import X.InterfaceC44039HQd;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* loaded from: classes8.dex */
public final class PreloadComponent implements GenericLifecycleObserver, InterfaceC44039HQd {
    public final HQU LJLIL;
    public ActivityC86117Xqz LJLILLLLZI;
    public String LJLJI = "";
    public String LJLJJI = "";
    public String LJLJJL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // X.InterfaceC44039HQd
    public final C35516Dwm vJ() {
        return new C35516Dwm(this.LJLJI, this.LJLJJI);
    }

    @Override // X.InterfaceC44039HQd
    public final String getMusicPath() {
        return this.LJLJJL;
    }

    public PreloadComponent(HQU hqu) {
        this.LJLIL = hqu;
    }
}
