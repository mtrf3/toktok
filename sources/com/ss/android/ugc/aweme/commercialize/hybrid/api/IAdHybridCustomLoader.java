package com.ss.android.ugc.aweme.commercialize.hybrid.api;

import X.AbstractC60088Ni8;
import X.C59066NGc;
import X.C59421NTt;
import X.CN8;
import X.InterfaceC59067NGd;
import X.InterfaceC59068NGe;
import X.InterfaceC59499NWt;
import X.NMS;
import X.NV3;
import X.NV4;
import X.NZ2;
import X.Z8C;
import android.content.Context;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public abstract class IAdHybridCustomLoader {
    public InterfaceC59067NGd adRenderLifecycle;
    public InterfaceC59068NGe iAdHybridPreRenderStatus;

    public abstract void close();

    public abstract NMS createHybridFragment(C59421NTt c59421NTt, boolean z);

    public abstract void destroy();

    public abstract void initialize(String str, Context context);

    public abstract boolean isRendering();

    public abstract void notifyFE(String str, JSONObject jSONObject);

    public abstract void onHide();

    public abstract void onPreRender(C59066NGc c59066NGc, C59421NTt c59421NTt);

    public abstract void onRender(C59421NTt c59421NTt, NV4 nv4);

    public abstract void onShowFailed(String str, String str2);

    public abstract void onShowSuccess();

    public abstract void refresh();

    public abstract void registAdWebFragmentViewProvider(InterfaceC59499NWt interfaceC59499NWt);

    public abstract void registerActivityCallback(Z8C z8c);

    public abstract void registerActivityRootViewProvider(NV3 nv3);

    public abstract void registerHybridRootContainer(NZ2 nz2);

    public abstract void registerTitleBarProvider(AbstractC60088Ni8 abstractC60088Ni8);

    public abstract void releaseCache();

    public abstract void releaseCacheWithKey(String str);

    public abstract void renderFullScreen(C59421NTt c59421NTt);

    public abstract void renderPopup(C59421NTt c59421NTt, CN8 cn8);

    public abstract void router(Context context, String str);

    public final InterfaceC59067NGd getAdRenderLifecycle() {
        return this.adRenderLifecycle;
    }

    public final InterfaceC59068NGe getIAdHybridPreRenderStatus() {
        return this.iAdHybridPreRenderStatus;
    }

    public final void setAdRenderLifecycle(InterfaceC59067NGd interfaceC59067NGd) {
        this.adRenderLifecycle = interfaceC59067NGd;
    }

    public final void setIAdHybridPreRenderStatus(InterfaceC59068NGe interfaceC59068NGe) {
        this.iAdHybridPreRenderStatus = interfaceC59068NGe;
    }

    public final void preRender(C59066NGc adHybridContainerOption, C59421NTt adHybridRenderOption, InterfaceC59068NGe interfaceC59068NGe) {
        o.LJIIIZ(adHybridContainerOption, "adHybridContainerOption");
        o.LJIIIZ(adHybridRenderOption, "adHybridRenderOption");
        this.iAdHybridPreRenderStatus = interfaceC59068NGe;
        onPreRender(adHybridContainerOption, adHybridRenderOption);
    }

    public final void render(C59421NTt adHybridRenderOption, NV4 adHybridLoadStatus, InterfaceC59067NGd interfaceC59067NGd) {
        o.LJIIIZ(adHybridRenderOption, "adHybridRenderOption");
        o.LJIIIZ(adHybridLoadStatus, "adHybridLoadStatus");
        this.adRenderLifecycle = interfaceC59067NGd;
        onRender(adHybridRenderOption, adHybridLoadStatus);
    }

    public static /* synthetic */ void renderPopup$default(IAdHybridCustomLoader iAdHybridCustomLoader, C59421NTt c59421NTt, CN8 cn8, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                cn8 = null;
            }
            iAdHybridCustomLoader.renderPopup(c59421NTt, cn8);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renderPopup");
    }

    public static /* synthetic */ void render$default(IAdHybridCustomLoader iAdHybridCustomLoader, C59421NTt c59421NTt, NV4 nv4, InterfaceC59067NGd interfaceC59067NGd, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                interfaceC59067NGd = null;
            }
            iAdHybridCustomLoader.render(c59421NTt, nv4, interfaceC59067NGd);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: render");
    }
}
