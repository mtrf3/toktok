package com.ss.android.ugc.aweme.player.sdk.util;

import X.InterfaceC46937IbV;
import X.InterfaceC47692Ing;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.lang.ref.WeakReference;

/* loaded from: classes9.dex */
public final class SurfaceWrapper extends Surface implements InterfaceC46937IbV {
    public WeakReference<InterfaceC47692Ing> mListener;
    public WeakReference<InterfaceC46937IbV> surfaceListenerRef;

    public SurfaceWrapper() {
        throw null;
    }

    @Override // X.InterfaceC46937IbV
    public final void LIZ() {
    }

    @Override // X.InterfaceC46937IbV
    public final void LJ() {
        InterfaceC46937IbV interfaceC46937IbV;
        WeakReference<InterfaceC46937IbV> weakReference = this.surfaceListenerRef;
        if (weakReference != null && (interfaceC46937IbV = weakReference.get()) != null) {
            interfaceC46937IbV.LJ();
        }
    }

    public SurfaceWrapper(SurfaceTexture surfaceTexture, InterfaceC46937IbV interfaceC46937IbV) {
        super(surfaceTexture);
        if (interfaceC46937IbV == null) {
            this.surfaceListenerRef = null;
        } else {
            this.surfaceListenerRef = new WeakReference<>(interfaceC46937IbV);
        }
    }

    @Override // X.InterfaceC46937IbV
    public final void LIZLLL(String str, boolean z) {
        InterfaceC46937IbV interfaceC46937IbV;
        WeakReference<InterfaceC46937IbV> weakReference = this.surfaceListenerRef;
        if (weakReference != null && (interfaceC46937IbV = weakReference.get()) != null) {
            interfaceC46937IbV.LIZLLL(str, z);
        }
    }
}
