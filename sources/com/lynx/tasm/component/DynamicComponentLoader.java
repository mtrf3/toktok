package com.lynx.tasm.component;

import X.C64493PSv;
import X.C79411VEp;
import X.InterfaceC61096NyO;
import X.VEQ;
import X.VET;
import X.VEV;
import X.VEY;
import X.X1D;
import Y.ARunnableS5S1101000_14;
import com.lynx.tasm.LynxTemplateRender;
import com.lynx.tasm.base.LLog;
import java.lang.ref.WeakReference;

/* loaded from: classes15.dex */
public final class DynamicComponentLoader {
    public final VEQ LIZ;
    public final WeakReference<LynxTemplateRender> LIZIZ;
    public final VEY LIZJ = new VEY();

    private native void nativeDeleteLoaderPtr(long j);

    public native void nativeDidLoadComponent(String str, int i, long j, long j2, byte[] bArr, String str2);

    public native void nativeDidPreloadTemplate(long j, String str, byte[] bArr);

    private void SetEnableLynxResourceServiceProvider(boolean z) {
        this.LIZ.LIZ.set(z);
    }

    public DynamicComponentLoader(InterfaceC61096NyO interfaceC61096NyO, LynxTemplateRender lynxTemplateRender) {
        this.LIZ = new VEQ(interfaceC61096NyO);
        this.LIZIZ = new WeakReference<>(lynxTemplateRender);
    }

    private void preloadTemplate(long j, String str) {
        try {
            C64493PSv.LIZJ().submit(new VEV(this, str, j));
        } catch (Throwable th) {
            LIZ(j, str, th);
        }
    }

    private void reportError(int i, String str) {
        C79411VEp.LIZJ(new ARunnableS5S1101000_14(i, this, str, 0));
    }

    public final void LIZ(long j, String str, Throwable th) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Preload dynamic component failed. The url is ");
        LIZ.append(str);
        LIZ.append(", and the error is ");
        LIZ.append(th);
        LLog.LIZLLL(4, "DynamicComponentLoader", X1D.LIZIZ(LIZ));
        nativeDeleteLoaderPtr(j);
    }

    private void requireTemplate(String str, int i, long j, long j2) {
        this.LIZ.LIZIZ(str, new VET(this, str, i, j, j2));
    }
}
