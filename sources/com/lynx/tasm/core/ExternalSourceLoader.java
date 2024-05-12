package com.lynx.tasm.core;

import X.AbstractC61008Nwy;
import X.C08200Tw;
import X.C79411VEp;
import X.InterfaceC61096NyO;
import X.VEJ;
import X.VEK;
import X.VEL;
import X.VEM;
import X.VEN;
import X.X1D;
import X.YE1;
import Y.ARunnableS5S1101000_14;
import Y.ARunnableS5S1201000_14;
import com.lynx.tasm.LynxTemplateRender;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes15.dex */
public class ExternalSourceLoader {
    public final AbstractC61008Nwy LIZ;
    public final AbstractC61008Nwy LIZIZ;
    public final InterfaceC61096NyO LIZJ;
    public final WeakReference<LynxTemplateRender> LIZLLL;
    public WeakReference<JSProxy> LJ;

    private byte[] loadExternalSource(String str) {
        byte[] bArr;
        if (this.LIZ == null) {
            return null;
        }
        C08200Tw c08200Tw = new C08200Tw(str);
        VEM vem = new VEM();
        FutureTask futureTask = new FutureTask(vem);
        this.LIZ.LIZ(c08200Tw, new VEL(this, vem, futureTask, str));
        try {
            bArr = (byte[]) futureTask.get(5L, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ExternalSourceLoader loadExternalSource request failed, url: ");
            LIZ.append(str);
            LIZ.append(" error:");
            LIZ.append(e);
            LIZIZ(1701, X1D.LIZIZ(LIZ));
            bArr = null;
        }
        if (bArr == null || bArr.length == 0) {
            LIZIZ(1701, "ExternalSourceLoader loadExternalSource failed, url: " + str + "error: get null data for provider");
            return null;
        }
        return bArr;
    }

    private void loadDynamicComponentAsync(String str, int i) {
        AbstractC61008Nwy abstractC61008Nwy = this.LIZIZ;
        if (abstractC61008Nwy != null) {
            abstractC61008Nwy.LIZ(new C08200Tw(str), new VEK(i, this, str));
            return;
        }
        InterfaceC61096NyO interfaceC61096NyO = this.LIZJ;
        if (interfaceC61096NyO != null) {
            interfaceC61096NyO.LIZ(str, new VEN(i, this, str));
        } else {
            LIZ(i, str, "ExternalSourceLoader Load dynamic component failed, since there is no provider or fetcher.", null);
        }
    }

    private void loadExternalSourceAsync(String str, int i) {
        AbstractC61008Nwy abstractC61008Nwy = this.LIZ;
        if (abstractC61008Nwy == null) {
            return;
        }
        abstractC61008Nwy.LIZ(new C08200Tw(str), new VEJ(i, this, str));
    }

    public final void LIZIZ(int i, String str) {
        C79411VEp.LIZJ(new ARunnableS5S1101000_14(i, this, str, 1));
    }

    public ExternalSourceLoader(AbstractC61008Nwy abstractC61008Nwy, AbstractC61008Nwy abstractC61008Nwy2, InterfaceC61096NyO interfaceC61096NyO, LynxTemplateRender lynxTemplateRender) {
        this.LIZ = abstractC61008Nwy;
        this.LIZIZ = abstractC61008Nwy2;
        this.LIZJ = interfaceC61096NyO;
        this.LIZLLL = new WeakReference<>(lynxTemplateRender);
    }

    public final void LIZ(int i, String str, String str2, byte[] bArr) {
        int i2;
        if (str2 != null || bArr == null || bArr.length == 0) {
            StringBuilder LIZ = X1D.LIZ();
            if (str2 != null) {
                YE1.LIZLLL(LIZ, "ExternalSourceLoader Load dynamic component failed, the url is ", str, ", and the error message is ", str2);
            } else {
                LIZ.append("ExternalSourceLoader The dynamic component's binary template is empty, the url is ");
                LIZ.append(str);
            }
            String LIZIZ = X1D.LIZIZ(LIZ);
            if (str2 != null) {
                i2 = 1601;
            } else {
                i2 = 1602;
            }
            LIZIZ(i2, LIZIZ);
            JSProxy jSProxy = this.LJ.get();
            if (jSProxy != null) {
                jSProxy.LJI(i, i2, str, LIZIZ);
                return;
            }
            return;
        }
        C79411VEp.LIZJ(new ARunnableS5S1201000_14(i, bArr, this, str, 0));
    }
}
