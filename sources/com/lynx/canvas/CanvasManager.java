package com.lynx.canvas;

import X.C16880lQ;
import X.C58556MyW;
import X.C58667N0t;
import X.C60682Nri;
import X.J0Q;
import X.O5Y;
import X.P5J;
import X.P5K;
import X.P6H;
import X.PPP;
import X.PPQ;
import X.PPR;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.LynxTemplateRender;
import com.lynx.tasm.TemplateAssembler;
import com.lynx.tasm.utils.EnvUtils;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import lh3.IDaS86S0000000_10;

/* loaded from: classes12.dex */
public class CanvasManager extends PPQ {
    public final P6H mAppContainer;
    public Context mContext;
    public long mNativeCanvasMgrWeakPtr;
    public long mNativeRawPtr;
    public LinkedHashMap<Class, Object> mServiceMap = new LinkedHashMap<>();
    public String mTemporaryDirectory;

    private native long nativeCreateCanvasManager(CanvasManager canvasManager);

    private KryptonApp createKryptonApp() {
        KryptonApp kryptonApp = new KryptonApp(this.mContext);
        new WeakReference(this);
        kryptonApp.LJFF(PPR.class, new PPP(this));
        kryptonApp.LJFF(P5J.class, new P5K(this));
        registerReflectLoadServices(kryptonApp);
        synchronized (this.mServiceMap) {
            for (Class cls : this.mServiceMap.keySet()) {
                kryptonApp.LJFF(cls, (J0Q) this.mServiceMap.get(cls));
            }
        }
        return kryptonApp;
    }

    public String getTemporaryDirectory() {
        String str = this.mTemporaryDirectory;
        if (str != null && str.length() > 0) {
            return this.mTemporaryDirectory;
        }
        return EnvUtils.getCacheDir();
    }

    @Override // X.PPQ
    public boolean isNativeCanvasAppReady() {
        KryptonApp LIZ = this.mAppContainer.LIZ(this.mNativeRawPtr);
        boolean z = false;
        if (LIZ != null) {
            synchronized (LIZ) {
                if (LIZ.LIZIZ != 0) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // X.PPQ
    public long newNativeCanvasAppWeakPtr() {
        KryptonApp LIZ = this.mAppContainer.LIZ(this.mNativeRawPtr);
        if (LIZ != null) {
            return LIZ.LIZJ();
        }
        return 0L;
    }

    public CanvasManager() {
        if (!C58556MyW.LIZ().LIZ) {
            C58556MyW LIZ = C58556MyW.LIZ();
            Application application = LynxEnv.LJIIIZ().LIZ;
            synchronized (LIZ) {
                try {
                    if (((ActivityManager) C16880lQ.LLILL(application, "activity")).getDeviceConfigurationInfo().reqGlEsVersion >= 196608) {
                        if (LIZ.LIZ) {
                            O5Y.LJJLIIIJJI("LynxKrypton", "LynxKrypton has already been initialized");
                        } else {
                            LIZ.LIZIZ = null;
                            LIZ.LIZJ = application;
                            if (LIZ.LIZIZ("krypton", true)) {
                                LIZ.LIZIZ("kryptoneffect", false);
                                O5Y.LJJJ("LynxKrypton", "Native LynxKrypton Library load success ");
                                LIZ.LIZ = true;
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
                O5Y.LJIILIIL("LynxKrypton", "LynxKrypton not support with device do not support ES3");
            }
        }
        this.mAppContainer = new P6H();
    }

    public Context getContext() {
        return this.mContext;
    }

    private void onAppEnterBackground(long j) {
        KryptonApp LIZ = this.mAppContainer.LIZ(j);
        if (LIZ != null) {
            LIZ.LIZLLL();
        }
    }

    private void onAppEnterForeground(long j) {
        KryptonApp LIZ = this.mAppContainer.LIZ(j);
        if (LIZ != null) {
            LIZ.LJ();
        }
    }

    private void onRuntimeDetach(long j) {
        KryptonApp LIZ = this.mAppContainer.LIZ(j);
        if (LIZ != null) {
            LIZ.LIZIZ();
            P6H p6h = this.mAppContainer;
            synchronized (p6h) {
                if (j != 0) {
                    p6h.LIZ.remove(new Long(j));
                }
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:11:0x0034
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    private void registerReflectLoadServices(com.lynx.canvas.KryptonApp r6) {
        /*
            r5 = this;
            java.lang.String r2 = "CanvasManager"
            java.lang.String r0 = "aa2.a"
            java.lang.Class r4 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L34
            r0 = 2
            java.lang.Class[] r3 = new java.lang.Class[r0]     // Catch: java.lang.Exception -> L34
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0 = 0
            r3[r0] = r1     // Catch: java.lang.Exception -> L34
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            r0 = 1
            r3[r0] = r1     // Catch: java.lang.Exception -> L34
            java.lang.reflect.Constructor r3 = r4.getConstructor(r3)     // Catch: java.lang.Exception -> L34
            java.lang.Class<X.J0O> r0 = X.J0O.class
            boolean r0 = r0.isAssignableFrom(r4)     // Catch: java.lang.Exception -> L34
            if (r0 == 0) goto L2e
            if (r3 == 0) goto L2e
            java.lang.Class<X.J0P> r1 = X.J0P.class
            X.J0R r0 = new X.J0R     // Catch: java.lang.Exception -> L34
            r0.<init>(r5, r3)     // Catch: java.lang.Exception -> L34
            r6.LJFF(r1, r0)     // Catch: java.lang.Exception -> L34
            goto L39
        L2e:
            java.lang.String r0 = "reflect find service for LynxCanvasTTPlayer instance type error"
            X.O5Y.LJIILIIL(r2, r0)     // Catch: java.lang.Exception -> L34
            goto L39
        L34:
            java.lang.String r0 = "reflect find service for LynxCanvasTTPlayer error"
            X.O5Y.LJJLIIIJJI(r2, r0)
        L39:
            java.lang.String r0 = "com.bytedance.lynx.hybrid.hybrid_canvas.LynxCanvasEffectHandler"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L59
            java.lang.Object r1 = r0.newInstance()     // Catch: java.lang.Exception -> L59
            java.lang.Class<X.J0U> r0 = X.J0U.class
            boolean r0 = r0.isInstance(r1)     // Catch: java.lang.Exception -> L59
            if (r0 == 0) goto L53
            java.lang.Class<X.J0U> r0 = X.J0U.class
            X.J0Q r1 = (X.J0Q) r1     // Catch: java.lang.Exception -> L59
            r6.LJFF(r0, r1)     // Catch: java.lang.Exception -> L59
            goto L5e
        L53:
            java.lang.String r0 = "reflect find service for LynxCanvasEffectHandler instance type error"
            X.O5Y.LJIILIIL(r2, r0)     // Catch: java.lang.Exception -> L59
            goto L5e
        L59:
            java.lang.String r0 = "reflect find service for LynxCanvasEffectHandler error"
            X.O5Y.LJJLIIIJJI(r2, r0)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.canvas.CanvasManager.registerReflectLoadServices(com.lynx.canvas.KryptonApp):void");
    }

    @Override // X.PPQ
    public void deInit(LynxTemplateRender lynxTemplateRender) {
        TemplateAssembler templateAssembler;
        long j = this.mNativeCanvasMgrWeakPtr;
        if (j != 0 && (templateAssembler = lynxTemplateRender.LIZ) != null) {
            templateAssembler.LJJIL(j);
        }
    }

    @Override // X.PPQ
    public void setTemporaryDirectory(String str) {
        this.mTemporaryDirectory = str;
    }

    private void onRuntimeAttach(long j, long j2) {
        KryptonApp LIZ = this.mAppContainer.LIZ(j);
        if (LIZ != null) {
            LIZ.LIZ(j2);
        }
    }

    private void onRuntimeInit(long j, long j2) {
        KryptonApp LIZ = this.mAppContainer.LIZ(j);
        if (LIZ != null) {
            LIZ.LJIIIIZZ(j2);
        }
    }

    @Override // X.PPQ
    public void registerService(Class cls, Object obj) {
        if (!J0Q.class.isInstance(obj)) {
            O5Y.LJIILIIL("CanvasManager", "register service class error");
            return;
        }
        synchronized (this.mServiceMap) {
            this.mServiceMap.put(cls, obj);
        }
        KryptonApp LIZ = this.mAppContainer.LIZ(this.mNativeRawPtr);
        if (LIZ != null) {
            LIZ.LJFF(cls, (J0Q) obj);
        }
    }

    @Override // X.PPQ
    public void init(LynxTemplateRender lynxTemplateRender, C60682Nri c60682Nri, C58667N0t c58667N0t) {
        if (!C58556MyW.LIZ().LIZ) {
            O5Y.LJIILIIL("CanvasManager", "LynxKrypton not initialized");
            return;
        }
        this.mContext = C16880lQ.LLLLLLJ(lynxTemplateRender.mLynxContext);
        long nativeCreateCanvasManager = nativeCreateCanvasManager(this);
        this.mNativeRawPtr = nativeCreateCanvasManager;
        long j = 0;
        if (nativeCreateCanvasManager != 0) {
            if (this.mAppContainer.LIZ(nativeCreateCanvasManager) == null) {
                KryptonApp createKryptonApp = createKryptonApp();
                P6H p6h = this.mAppContainer;
                long j2 = this.mNativeRawPtr;
                synchronized (p6h) {
                    if (j2 != 0 && createKryptonApp != null) {
                        p6h.LIZ.put(new Long(j2), createKryptonApp);
                    }
                }
            }
            long j3 = this.mNativeRawPtr;
            TemplateAssembler templateAssembler = lynxTemplateRender.LIZ;
            if (templateAssembler != null) {
                j = templateAssembler.LJIJJLI(j3);
            }
            this.mNativeCanvasMgrWeakPtr = j;
        } else {
            this.mNativeCanvasMgrWeakPtr = 0L;
            O5Y.LJIILIIL("CanvasManager", "LynxKrypton is not initialized! The libkrypton.so is not loaded!!");
            lynxTemplateRender.LJIILIIL(501, "LynxKrypton is not initialized! The libkrypton.so is not loaded!!");
        }
        if (c58667N0t != null) {
            if (C60682Nri.LIZIZ(c60682Nri)) {
                O5Y.LJJJ("CanvasManager", "LynxKrypton register UICanvas to canvas with enable_canvas_optimize");
                c58667N0t.LIZ(new IDaS86S0000000_10(50));
            }
            c58667N0t.LIZ(new IDaS86S0000000_10(51));
        }
    }

    private void onInit(long j, long j2, long j3, long j4) {
        KryptonApp LIZ = this.mAppContainer.LIZ(j);
        if (LIZ != null) {
            LIZ.LJII(j2);
            LIZ.LJIIIZ(j3);
            LIZ.LJI(j4);
        }
    }
}
