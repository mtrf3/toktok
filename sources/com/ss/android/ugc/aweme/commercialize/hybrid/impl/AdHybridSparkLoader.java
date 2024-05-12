package com.ss.android.ugc.aweme.commercialize.hybrid.impl;

import X.AbstractC60088Ni8;
import X.AbstractC60800Ntc;
import X.C109464Ri;
import X.C117144ik;
import X.C40172Fpg;
import X.C40177Fpl;
import X.C40179Fpn;
import X.C58310MuY;
import X.C58582Rq;
import X.C58978NCs;
import X.C59054NFq;
import X.C59066NGc;
import X.C59421NTt;
import X.C59453NUz;
import X.C59886Nes;
import X.C60087Ni7;
import X.C60704Ns4;
import X.C60827Nu3;
import X.CN8;
import X.EnumC46475ILv;
import X.EnumC59053NFp;
import X.F23;
import X.InterfaceC40159FpT;
import X.InterfaceC59067NGd;
import X.InterfaceC59499NWt;
import X.InterfaceC60761Nsz;
import X.InterfaceC60819Ntv;
import X.InterfaceC60844NuK;
import X.InterfaceC60850NuQ;
import X.InterfaceC88471Ynr;
import X.NIA;
import X.NMS;
import X.NV0;
import X.NV1;
import X.NV2;
import X.NV3;
import X.NV4;
import X.NV5;
import X.NZ1;
import X.NZ2;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import X.WM7;
import X.X1D;
import X.Z8B;
import X.Z8C;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class AdHybridSparkLoader extends IAdHybridCustomLoader {
    public static final NV5 Companion = new NV5();
    public static final HashMap<String, Boolean> isBizRegister = new HashMap<>();
    public static String tag = "AdSparkHybridLoader";
    public Context context;
    public NV4 iAdHybridLoadStatus;
    public boolean isFromPre;
    public boolean isLoadFailed;
    public boolean isPreRenderLoadFailed;
    public boolean isPreloadSuccess;
    public C60704Ns4 preRenderLoadFailedReason;
    public String scene;
    public InterfaceC60850NuQ sparkActivityCallback;
    public C40177Fpl sparkMixture;
    public NZ2 sparkRootContainer;
    public InterfaceC60844NuK sparkTitleBarProvider;
    public NZ1 sparkViewProvider;
    public final AbstractC60800Ntc renderLoadCallback = new C59453NUz(this);
    public final AbstractC60800Ntc preRenderLoadCallback = new NV0(this);

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void onShowFailed(String code, String msg) {
        o.LJIIIZ(code, "code");
        o.LJIIIZ(msg, "msg");
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void onShowSuccess() {
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void registAdWebFragmentViewProvider(InterfaceC59499NWt adWebFragmentViewProvider) {
        o.LJIIIZ(adWebFragmentViewProvider, "adWebFragmentViewProvider");
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void close() {
        SparkContext sparkContext;
        InterfaceC40159FpT LJIILL;
        C40177Fpl c40177Fpl = this.sparkMixture;
        if (c40177Fpl != null && (sparkContext = c40177Fpl.LIZ) != null && (LJIILL = sparkContext.LJIILL()) != null) {
            LJIILL.close();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void destroy() {
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        C40177Fpl c40177Fpl = this.sparkMixture;
        if (c40177Fpl != null && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = c40177Fpl.LIZIZ) != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void onHide() {
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        InterfaceC60761Nsz kitView;
        C40177Fpl c40177Fpl = this.sparkMixture;
        if (c40177Fpl != null && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = c40177Fpl.LIZIZ) != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) != null) {
            kitView.onHide();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void refresh() {
        SparkContext sparkContext;
        InterfaceC40159FpT LJIILL;
        C40177Fpl c40177Fpl = this.sparkMixture;
        if (c40177Fpl != null && (sparkContext = c40177Fpl.LIZ) != null && (LJIILL = sparkContext.LJIILL()) != null) {
            LJIILL.refresh();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void releaseCache() {
        C60827Nu3 c60827Nu3 = C58310MuY.LIZIZ;
        String str = this.scene;
        if (str != null) {
            c60827Nu3.getClass();
            C60827Nu3.LJIIL(str);
            HashMap<String, Boolean> hashMap = isBizRegister;
            String str2 = this.scene;
            if (str2 != null) {
                hashMap.remove(str2);
                return;
            } else {
                o.LJIJI(WM7.SCENE_SERVICE);
                throw null;
            }
        }
        o.LJIJI(WM7.SCENE_SERVICE);
        throw null;
    }

    public final boolean isPreloadSuccess() {
        return this.isPreloadSuccess;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public boolean isRendering() {
        return this.isPreloadSuccess;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void registerActivityCallback(Z8C hybridActivityCallback) {
        o.LJIIIZ(hybridActivityCallback, "hybridActivityCallback");
        this.sparkActivityCallback = new Z8B(hybridActivityCallback);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void registerActivityRootViewProvider(NV3 hybridActivityRootViewProvider) {
        o.LJIIIZ(hybridActivityRootViewProvider, "hybridActivityRootViewProvider");
        this.sparkViewProvider = new NV2(hybridActivityRootViewProvider);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void registerHybridRootContainer(NZ2 hybridRootContainer) {
        o.LJIIIZ(hybridRootContainer, "hybridRootContainer");
        this.sparkRootContainer = hybridRootContainer;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void registerTitleBarProvider(AbstractC60088Ni8 hybridTitleBarProvider) {
        o.LJIIIZ(hybridTitleBarProvider, "hybridTitleBarProvider");
        this.sparkTitleBarProvider = new C60087Ni7(hybridTitleBarProvider);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void releaseCacheWithKey(String cacheKey) {
        o.LJIIIZ(cacheKey, "cacheKey");
        C60827Nu3 c60827Nu3 = C58310MuY.LIZIZ;
        String str = this.scene;
        if (str != null) {
            c60827Nu3.getClass();
            C60827Nu3.LIZ(cacheKey, str);
            C58582Rq.LIZ("releaseCacheWithKey", tag);
            return;
        }
        o.LJIJI(WM7.SCENE_SERVICE);
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void renderFullScreen(C59421NTt adHybridRenderOption) {
        String str;
        o.LJIIIZ(adHybridRenderOption, "adHybridRenderOption");
        NIA nia = adHybridRenderOption.LJFF;
        if (nia == null || (str = nia.LIZIZ) == null) {
            return;
        }
        String str2 = nia.LIZLLL;
        Context context = this.context;
        if (context != null) {
            this.sparkMixture = new C40177Fpl(C40172Fpg.LJ(context, str, str2, nia.LIZJ, nia.LJ, this.sparkActivityCallback, this.sparkTitleBarProvider, this.sparkViewProvider, null, adHybridRenderOption.LJII, 256), 2);
        } else {
            o.LJIJI("context");
            throw null;
        }
    }

    public final void setPreloadSuccess(boolean z) {
        this.isPreloadSuccess = z;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public NMS createHybridFragment(C59421NTt adHybridRenderOption, boolean z) {
        String str;
        InterfaceC60819Ntv LIZIZ;
        o.LJIIIZ(adHybridRenderOption, "adHybridRenderOption");
        NIA nia = adHybridRenderOption.LJFF;
        if (nia == null || (str = nia.LIZIZ) == null) {
            return null;
        }
        String str2 = nia.LIZLLL;
        C40172Fpg c40172Fpg = C40172Fpg.LIZ;
        Context context = this.context;
        if (context != null) {
            Bundle bundle = nia.LIZJ;
            F23 f23 = nia.LJ;
            InterfaceC60850NuQ interfaceC60850NuQ = this.sparkActivityCallback;
            InterfaceC60844NuK interfaceC60844NuK = this.sparkTitleBarProvider;
            NZ1 nz1 = this.sparkViewProvider;
            NZ2 nz2 = this.sparkRootContainer;
            AdSparkHybridContext LIZIZ2 = C40172Fpg.LIZIZ(c40172Fpg, context, str, str2, bundle, f23, interfaceC60850NuQ, interfaceC60844NuK, nz1, 256);
            Bundle bundle2 = new Bundle();
            bundle2.putString("container_bg_color", "FFFFFFFF");
            LIZIZ2.LJJIJLIJ(C40179Fpn.LIZ(bundle2, str));
            LIZIZ2.LJJIIJ("container_bg_color", "FFFFFFFF");
            if (f23 != null && (LIZIZ = f23.LIZIZ(LIZIZ2, context, str, bundle)) != null) {
                LIZIZ2.LJII(InterfaceC60819Ntv.class, LIZIZ);
            }
            if (nz2 != null) {
                LIZIZ2.LJII(NZ2.class, nz2);
            }
            AdSparkHybridFragment adSparkHybridFragment = new AdSparkHybridFragment(z);
            if (bundle != null) {
                C109464Ri.LIZ.getClass();
                C117144ik.LIZIZ.getClass();
                C117144ik.LIZIZ(LIZIZ2);
                bundle.putString("SparkContextContainerId", LIZIZ2.containerId);
            } else {
                bundle = null;
            }
            adSparkHybridFragment.setArguments(bundle);
            return adSparkHybridFragment;
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
    public void notifyFE(String eventName, JSONObject jSONObject) {
        boolean z;
        boolean z2;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        InterfaceC60761Nsz kitView;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2;
        o.LJIIIZ(eventName, "eventName");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sparkMixture is empty = ");
        boolean z3 = true;
        if (this.sparkMixture == null) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(z);
        C58582Rq.LIZ(X1D.LIZIZ(LIZ), tag);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("sparkView is empty = ");
        C40177Fpl c40177Fpl = this.sparkMixture;
        if (c40177Fpl == null || c40177Fpl.LIZIZ == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        LIZ2.append(z2);
        C58582Rq.LIZ(X1D.LIZIZ(LIZ2), tag);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("KitView is empty = ");
        C40177Fpl c40177Fpl2 = this.sparkMixture;
        if (c40177Fpl2 != null && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = c40177Fpl2.LIZIZ) != null && sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2.getKitView() != null) {
            z3 = false;
        }
        LIZ3.append(z3);
        C58582Rq.LIZ(X1D.LIZIZ(LIZ3), tag);
        C40177Fpl c40177Fpl3 = this.sparkMixture;
        if (c40177Fpl3 != null && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = c40177Fpl3.LIZIZ) != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) != null) {
            kitView.LJIIIZ(eventName, jSONObject);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void onPreRender(C59066NGc adHybridContainerOption, C59421NTt adHybridRenderOption) {
        String str;
        F23 f23;
        boolean z;
        Boolean bool;
        InterfaceC88471Ynr<String, String, Boolean> interfaceC88471Ynr;
        o.LJIIIZ(adHybridContainerOption, "adHybridContainerOption");
        o.LJIIIZ(adHybridRenderOption, "adHybridRenderOption");
        NIA nia = adHybridRenderOption.LJFF;
        if (nia == null || (str = nia.LIZIZ) == null) {
            return;
        }
        String str2 = nia.LIZLLL;
        HashMap<String, Boolean> hashMap = isBizRegister;
        String str3 = this.scene;
        Bundle bundle = null;
        if (str3 != null) {
            Boolean bool2 = hashMap.get(str3);
            Boolean bool3 = Boolean.TRUE;
            if (!o.LJ(bool2, bool3)) {
                String str4 = this.scene;
                if (str4 != null) {
                    hashMap.put(str4, bool3);
                    C60827Nu3 c60827Nu3 = C58310MuY.LIZIZ;
                    C59886Nes c59886Nes = new C59886Nes();
                    String str5 = this.scene;
                    if (str5 != null) {
                        c59886Nes.LIZ = str5;
                        NIA nia2 = adHybridRenderOption.LJFF;
                        if (nia2 != null && (interfaceC88471Ynr = nia2.LJI) != null) {
                            c59886Nes.LJFF = interfaceC88471Ynr;
                        }
                        c59886Nes.LIZIZ = adHybridRenderOption.LIZJ;
                        c59886Nes.LIZJ = adHybridRenderOption.LIZLLL;
                        c59886Nes.LIZLLL = adHybridRenderOption.LJ;
                        if (nia2 != null && (bool = nia2.LJFF) != null) {
                            z = bool.booleanValue();
                        } else {
                            z = false;
                        }
                        c59886Nes.LJ = z;
                        Boolean bool4 = Boolean.FALSE;
                        c60827Nu3.getClass();
                        C60827Nu3.LJIIJJI(c59886Nes, bool4);
                    } else {
                        o.LJIJI(WM7.SCENE_SERVICE);
                        throw null;
                    }
                } else {
                    o.LJIJI(WM7.SCENE_SERVICE);
                    throw null;
                }
            }
            C60827Nu3 c60827Nu32 = C58310MuY.LIZIZ;
            String str6 = adHybridRenderOption.LIZIZ;
            String str7 = this.scene;
            if (str7 != null) {
                C40172Fpg c40172Fpg = C40172Fpg.LIZ;
                Context context = this.context;
                if (context != null) {
                    NIA nia3 = adHybridRenderOption.LJFF;
                    if (nia3 != null) {
                        bundle = nia3.LIZJ;
                        f23 = nia3.LJ;
                    } else {
                        f23 = null;
                    }
                    AdSparkHybridContext LIZIZ = C40172Fpg.LIZIZ(c40172Fpg, context, str, str2, bundle, f23, null, null, null, 480);
                    LIZIZ.LJJIL(this.preRenderLoadCallback);
                    C60827Nu3.LJIIJ(c60827Nu32, str6, str7, LIZIZ, new NV1(), true, 32);
                    return;
                }
                o.LJIJI("context");
                throw null;
            }
            o.LJIJI(WM7.SCENE_SERVICE);
            throw null;
        }
        o.LJIJI(WM7.SCENE_SERVICE);
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void onRender(C59421NTt renderOption, NV4 loadStatus) {
        String str;
        String str2;
        Bundle bundle;
        o.LJIIIZ(renderOption, "renderOption");
        o.LJIIIZ(loadStatus, "loadStatus");
        this.iAdHybridLoadStatus = loadStatus;
        NIA nia = renderOption.LJFF;
        Bundle bundle2 = null;
        F23 f23 = null;
        if (nia == null || (str = nia.LIZIZ) == null || ujb.o.LJJJJJL(str)) {
            loadStatus.Zi("-2", "schema_illegal");
            return;
        }
        NIA nia2 = renderOption.LJFF;
        if (nia2 == null || (str2 = nia2.LIZLLL) == null || ujb.o.LJJJJJL(str2)) {
            loadStatus.Zi("-3", "access_key_empty");
            return;
        }
        int i = C59054NFq.LIZ[renderOption.LIZ.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            this.isFromPre = false;
            InterfaceC59067NGd adRenderLifecycle = getAdRenderLifecycle();
            if (adRenderLifecycle != null) {
                adRenderLifecycle.LIZIZ();
            }
            C40172Fpg c40172Fpg = C40172Fpg.LIZ;
            Context context = this.context;
            if (context != null) {
                NIA nia3 = renderOption.LJFF;
                if (nia3 != null) {
                    bundle = nia3.LIZJ;
                } else {
                    bundle = null;
                }
                AbstractC60800Ntc abstractC60800Ntc = this.renderLoadCallback;
                if (nia3 != null) {
                    f23 = nia3.LJ;
                }
                C40177Fpl LIZJ = c40172Fpg.LIZJ(context, str, bundle, str2, abstractC60800Ntc, f23);
                this.sparkMixture = LIZJ;
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = LIZJ.LIZIZ;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS == null) {
                    return;
                }
                C40172Fpg.LIZLLL(LIZJ.LIZ, sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
                return;
            }
            o.LJIJI("context");
            throw null;
        }
        Context context2 = this.context;
        if (context2 != null) {
            String str3 = renderOption.LIZIZ;
            String str4 = this.scene;
            if (str4 != null) {
                NIA nia4 = renderOption.LJFF;
                if (nia4 != null) {
                    bundle2 = nia4.LIZJ;
                }
                fetchViewInPool(context2, str3, str, str4, str2, renderOption, bundle2);
                return;
            }
            o.LJIJI(WM7.SCENE_SERVICE);
            throw null;
        }
        o.LJIJI("context");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void renderPopup(C59421NTt adHybridRenderOption, CN8 cn8) {
        String str;
        o.LJIIIZ(adHybridRenderOption, "adHybridRenderOption");
        NIA nia = adHybridRenderOption.LJFF;
        if (nia == null || (str = nia.LIZIZ) == null) {
            return;
        }
        String str2 = nia.LIZLLL;
        Context context = this.context;
        if (context != null) {
            this.sparkMixture = new C40177Fpl(C40172Fpg.LJ(context, str, str2, nia.LIZJ, nia.LJ, this.sparkActivityCallback, this.sparkTitleBarProvider, this.sparkViewProvider, cn8, false, 512), 2);
        } else {
            o.LJIJI("context");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void router(Context context, String url) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(url, "url");
        SmartRouter.buildRoute(context, url).open();
    }

    public final void renderRetry(Context context, String lynxSchema, String accessKey, C59421NTt adHybridRenderOption, Bundle bundle) {
        F23 f23;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(lynxSchema, "lynxSchema");
        o.LJIIIZ(accessKey, "accessKey");
        o.LJIIIZ(adHybridRenderOption, "adHybridRenderOption");
        C58582Rq.LIZ("renderRetry", tag);
        EnumC59053NFp enumC59053NFp = adHybridRenderOption.LIZ;
        if (enumC59053NFp == EnumC59053NFp.ONLY_CACHE) {
            C58582Rq.LIZ("renderRetry ONLY_CACHE Needn't retry", tag);
            NV4 nv4 = this.iAdHybridLoadStatus;
            if (nv4 != null) {
                nv4.Zi("-5", "preload_failed");
                return;
            }
            return;
        }
        if (enumC59053NFp != EnumC59053NFp.CACHE_WITH_RETRY) {
            return;
        }
        this.isFromPre = true;
        InterfaceC59067NGd adRenderLifecycle = getAdRenderLifecycle();
        if (adRenderLifecycle != null) {
            adRenderLifecycle.LIZIZ();
        }
        C40172Fpg c40172Fpg = C40172Fpg.LIZ;
        AbstractC60800Ntc abstractC60800Ntc = this.renderLoadCallback;
        NIA nia = adHybridRenderOption.LJFF;
        if (nia != null) {
            f23 = nia.LJ;
        } else {
            f23 = null;
        }
        C40177Fpl LIZJ = c40172Fpg.LIZJ(context, lynxSchema, bundle, accessKey, abstractC60800Ntc, f23);
        this.sparkMixture = LIZJ;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = LIZJ.LIZIZ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS == null) {
            return;
        }
        C40172Fpg.LIZLLL(LIZJ.LIZ, sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
    }

    private final void fetchViewInPool(Context context, String str, String str2, String str3, String str4, C59421NTt c59421NTt, Bundle bundle) {
        SparkContext sparkContext;
        Object LIZLLL = C60827Nu3.LIZLLL(C58310MuY.LIZIZ, context, str, str3, 24);
        if (LIZLLL instanceof SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = (SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) LIZLLL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LIZLLL()) {
                C58582Rq.LIZ("fetchViewInPool success", tag);
                C40177Fpl c40177Fpl = this.sparkMixture;
                String str5 = null;
                if (c40177Fpl != null) {
                    sparkContext = c40177Fpl.LIZ;
                } else {
                    sparkContext = null;
                }
                this.sparkMixture = new C40177Fpl(sparkContext, sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
                NV4 nv4 = this.iAdHybridLoadStatus;
                if (nv4 != null) {
                    View view = (View) LIZLLL;
                    EnumC46475ILv enumC46475ILv = EnumC46475ILv.STATUS_LOAD_SUCCESS;
                    SparkContext sparkContext2 = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getSparkContext();
                    if (sparkContext2 != null) {
                        str5 = sparkContext2.containerId;
                    }
                    nv4.ze(new C58978NCs(view, enumC46475ILv, str5));
                    return;
                }
                return;
            }
        }
        C58582Rq.LIZ("fetchViewInPool failed", tag);
        renderRetry(context, str2, str4, c59421NTt, bundle);
    }

    public static /* synthetic */ void renderRetry$default(AdHybridSparkLoader adHybridSparkLoader, Context context, String str, String str2, C59421NTt c59421NTt, Bundle bundle, int i, Object obj) {
        if ((i & 16) != 0) {
            bundle = null;
        }
        adHybridSparkLoader.renderRetry(context, str, str2, c59421NTt, bundle);
    }

    public static /* synthetic */ void fetchViewInPool$default(AdHybridSparkLoader adHybridSparkLoader, Context context, String str, String str2, String str3, String str4, C59421NTt c59421NTt, Bundle bundle, int i, Object obj) {
        if ((i & 64) != 0) {
            bundle = null;
        }
        adHybridSparkLoader.fetchViewInPool(context, str, str2, str3, str4, c59421NTt, bundle);
    }
}
