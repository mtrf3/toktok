package com.ss.android.ugc.aweme.commercialize.hybrid.impl.web;

import X.AbstractC60088Ni8;
import X.C109464Ri;
import X.C117144ik;
import X.C40177Fpl;
import X.C59066NGc;
import X.C59421NTt;
import X.C59452NUy;
import X.CN8;
import X.InterfaceC59499NWt;
import X.NMS;
import X.NV3;
import X.NV4;
import X.NV6;
import X.NWS;
import X.NZ2;
import X.Z8C;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader;
import com.ss.android.ugc.aweme.commercialize.hybrid.impl.AdSparkHybridContext;
import com.ss.android.ugc.aweme.commercialize.hybrid.impl.web.service.impl.AdWebJumpInterceptor;
import com.ss.android.ugc.aweme.commercialize.hybrid.impl.web.service.impl.AdWebSparkFragment;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class AdWebLoader extends IAdHybridCustomLoader {
    public static final NV6 Companion = new NV6();
    public static String tag = "AdSparkHybridLoader";
    public NZ2 adWebContainer;
    public InterfaceC59499NWt adWebFragmentViewProvider;
    public Context context;
    public String scene;
    public C40177Fpl sparkMixture;

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void close() {
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void destroy() {
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public boolean isRendering() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void notifyFE(String eventName, JSONObject jSONObject) {
        o.LJIIIZ(eventName, "eventName");
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void onHide() {
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void onPreRender(C59066NGc adHybridContainerOption, C59421NTt adHybridRenderOption) {
        o.LJIIIZ(adHybridContainerOption, "adHybridContainerOption");
        o.LJIIIZ(adHybridRenderOption, "adHybridRenderOption");
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void onRender(C59421NTt adHybridRenderOption, NV4 adHybridLoadStatus) {
        o.LJIIIZ(adHybridRenderOption, "adHybridRenderOption");
        o.LJIIIZ(adHybridLoadStatus, "adHybridLoadStatus");
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void onShowFailed(String code, String msg) {
        o.LJIIIZ(code, "code");
        o.LJIIIZ(msg, "msg");
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void onShowSuccess() {
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void refresh() {
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void registerActivityCallback(Z8C hybridActivityCallback) {
        o.LJIIIZ(hybridActivityCallback, "hybridActivityCallback");
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void registerActivityRootViewProvider(NV3 hybridActivityRootViewProvider) {
        o.LJIIIZ(hybridActivityRootViewProvider, "hybridActivityRootViewProvider");
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void registerTitleBarProvider(AbstractC60088Ni8 hybridTitleBarProvider) {
        o.LJIIIZ(hybridTitleBarProvider, "hybridTitleBarProvider");
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void releaseCache() {
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void releaseCacheWithKey(String cacheKey) {
        o.LJIIIZ(cacheKey, "cacheKey");
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void renderPopup(C59421NTt adHybridRenderOption, CN8 cn8) {
        o.LJIIIZ(adHybridRenderOption, "adHybridRenderOption");
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void registAdWebFragmentViewProvider(InterfaceC59499NWt adWebFragmentViewProvider) {
        o.LJIIIZ(adWebFragmentViewProvider, "adWebFragmentViewProvider");
        this.adWebFragmentViewProvider = adWebFragmentViewProvider;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void registerHybridRootContainer(NZ2 hybridRootContainer) {
        o.LJIIIZ(hybridRootContainer, "hybridRootContainer");
        this.adWebContainer = hybridRootContainer;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void renderFullScreen(C59421NTt adHybridRenderOption) {
        String str;
        o.LJIIIZ(adHybridRenderOption, "adHybridRenderOption");
        C59452NUy c59452NUy = adHybridRenderOption.LJI;
        if (c59452NUy == null || (str = c59452NUy.LIZ) == null) {
            return;
        }
        Context context = this.context;
        if (context != null) {
            AdWebJumpInterceptor.LIZJ().LIZIZ(context, NWS.LIZ(str, c59452NUy.LIZIZ, c59452NUy.LIZJ, c59452NUy.LIZLLL, this.adWebFragmentViewProvider, this.adWebContainer));
        } else {
            o.LJIJI("context");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public NMS createHybridFragment(C59421NTt adHybridRenderOption, boolean z) {
        String str;
        o.LJIIIZ(adHybridRenderOption, "adHybridRenderOption");
        C59452NUy c59452NUy = adHybridRenderOption.LJI;
        if (c59452NUy == null || (str = c59452NUy.LIZ) == null) {
            return null;
        }
        if (this.context != null) {
            Bundle bundle = c59452NUy.LIZIZ;
            AdSparkHybridContext LIZ = NWS.LIZ(str, bundle, c59452NUy.LIZJ, c59452NUy.LIZLLL, this.adWebFragmentViewProvider, this.adWebContainer);
            AdWebSparkFragment adWebSparkFragment = new AdWebSparkFragment();
            adWebSparkFragment.LLD = z;
            if (bundle == null) {
                bundle = new Bundle();
            }
            C109464Ri.LIZ.getClass();
            C117144ik.LIZIZ.getClass();
            C117144ik.LIZIZ(LIZ);
            bundle.putString("SparkContextContainerId", LIZ.containerId);
            adWebSparkFragment.setArguments(bundle);
            return adWebSparkFragment;
        }
        o.LJIJI("context");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void initialize(String scene, Context context) {
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(context, "context");
        this.context = context;
        this.scene = scene;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void router(Context context, String url) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(url, "url");
        SmartRouter.buildRoute(context, url).open();
    }
}
