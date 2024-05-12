package com.ss.android.ugc.aweme.crossplatform.activity;

import X.InterfaceC27436Apk;
import X.InterfaceC59561NZd;
import android.content.Intent;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* loaded from: classes7.dex */
public abstract class AbsActivityContainer implements GenericLifecycleObserver, InterfaceC27436Apk, InterfaceC59561NZd {
    public abstract void LJFF(InterfaceC27436Apk interfaceC27436Apk);

    public abstract void LJIIL();

    public abstract boolean LJIILIIL(int i, String str);

    public abstract void LJIILJJIL(InterfaceC27436Apk interfaceC27436Apk);

    public abstract void LJIJ(int i, Intent intent);

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }
}
