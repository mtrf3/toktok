package com.ss.ugc.effectplatform.algorithm;

import X.C06540Nm;
import X.C12310e3;
import X.C126924yW;
import X.C141335gf;
import X.C16880lQ;
import X.C37692Eqm;
import X.C3C5;
import X.C63081OpJ;
import X.C84376X9o;
import X.C84389XAb;
import X.C84404XAq;
import X.C84419XBf;
import X.C84436XBw;
import X.InterfaceC58749N3x;
import X.InterfaceC84406XAs;
import X.X1D;
import X.X97;
import X.XAN;
import X.XBE;
import X.XC2;
import X.XCG;
import android.content.Context;
import com.bef.effectsdk.AssetResourceFinder;
import com.bef.effectsdk.ResourceFinder;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes16.dex */
public final class AlgorithmModelResourceFinder extends C84404XAq implements ResourceFinder {
    public static final C84436XBw Companion = new C84436XBw();
    public static final ConcurrentHashMap<String, Boolean> modelsNotFoundRecord = new ConcurrentHashMap<>();
    public final C84389XAb algorithmModelCache;
    public final AssetResourceFinder assetResourceFinder;
    public final C84376X9o buildInAssetsManager;
    public final XCG effectConfig;
    public long effectHandle;
    public final InterfaceC84406XAs eventListener;

    private final native long nativeCreateResourceFinder(long j);

    @Override // X.C84404XAq
    public long getEffectHandle() {
        return this.effectHandle;
    }

    private final void mobModelFound(String str) {
        XCG xcg = this.effectConfig;
        InterfaceC58749N3x interfaceC58749N3x = (InterfaceC58749N3x) xcg.LJIJJ.LIZ;
        if (interfaceC58749N3x != null) {
            C63081OpJ.LLILLJJLI(interfaceC58749N3x, true, xcg, str, "");
        }
    }

    public static final void modelNotFound(String nameStr) {
        Companion.getClass();
        o.LJIIJ(nameStr, "nameStr");
        C12310e3 c12310e3 = C12310e3.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("modelNotFound:nameStr=");
        LIZ.append(nameStr);
        String LIZIZ = X1D.LIZIZ(LIZ);
        c12310e3.getClass();
        C12310e3.LIZIZ("ResourceFinder", LIZIZ, null);
        XBE.LJIIIIZZ.getClass();
        C84419XBf.LIZ().LIZLLL().onModelNotFound(nameStr, "asset://not_found");
    }

    @Override // com.bef.effectsdk.ResourceFinder
    public long createNativeResourceFinder(long j) {
        X97.LIZJ.LIZ();
        this.effectHandle = j;
        this.assetResourceFinder.createNativeResourceFinder(j);
        return nativeCreateResourceFinder(j);
    }

    @Override // X.C84404XAq
    public String getBuiltInResourceUrl(String nameStr) {
        Object LIZ;
        o.LJIIJ(nameStr, "nameStr");
        boolean z = false;
        try {
            LIZ = nameStr.substring(0, s.LJJLIIJ(nameStr, "/", 6));
            o.LJFF(LIZ, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        String str = "";
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = "";
        }
        String str2 = (String) LIZ;
        StringBuilder sb = new StringBuilder("model");
        if (str2.length() > 0) {
            z = true;
        }
        if (z) {
            str = "/".concat(str2);
        }
        sb.append(str);
        String sb2 = sb.toString();
        List<String> LIZIZ = this.buildInAssetsManager.LIZIZ(sb2);
        String LIZJ = XAN.LIZJ(nameStr);
        if (LIZIZ != null) {
            for (String str3 : LIZIZ) {
                if (o.LJ(XAN.LIZJ(str3), LIZJ)) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("asset://");
                    LIZ2.append(sb2);
                    LIZ2.append('/');
                    LIZ2.append(str3);
                    return X1D.LIZIZ(LIZ2);
                }
            }
        }
        return super.getBuiltInResourceUrl(nameStr);
    }

    @Override // X.C84404XAq
    public boolean isExactBuiltInResource(String nameStr) {
        Object LIZ;
        o.LJIIJ(nameStr, "nameStr");
        try {
            LIZ = nameStr.substring(0, s.LJJLIIJ(nameStr, "/", 6));
            o.LJFF(LIZ, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        String str = "";
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = "";
        }
        String str2 = (String) LIZ;
        StringBuilder sb = new StringBuilder("model");
        if (str2.length() > 0) {
            str = "/".concat(str2);
        }
        sb.append(str);
        List<String> LIZIZ = this.buildInAssetsManager.LIZIZ(sb.toString());
        String LIZJ = XAN.LIZJ(nameStr);
        if (LIZIZ != null) {
            Iterator<String> it = LIZIZ.iterator();
            while (it.hasNext()) {
                if (o.LJ(XAN.LIZJ(it.next()), LIZJ)) {
                    return true;
                }
            }
        }
        return super.isExactBuiltInResource(nameStr);
    }

    @Override // X.C84404XAq
    public void onModelFound(String modelName) {
        o.LJIIJ(modelName, "modelName");
        mobModelFound(modelName);
    }

    @Override // com.bef.effectsdk.ResourceFinder
    public void release(long j) {
        this.effectHandle = 0L;
        this.assetResourceFinder.release(j);
    }

    public static final String findResourceUri(String str, String nameStr) {
        XC2 xc2;
        Companion.getClass();
        o.LJIIJ(nameStr, "nameStr");
        XBE.LJIIIIZZ.getClass();
        if (!C84419XBf.LIZJ()) {
            return "asset://not_initialized";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String realFindResourceUri = C84419XBf.LIZ().LIZLLL().realFindResourceUri(0, str, nameStr);
        if (C126924yW.LIZ && o.LJ(realFindResourceUri, "asset://not_found") && (xc2 = C84419XBf.LIZ().LJFF) != null) {
            realFindResourceUri = xc2.LIZLLL(nameStr);
        }
        C12310e3 c12310e3 = C12310e3.LIZIZ;
        StringBuilder LIZLLL = C06540Nm.LIZLLL("findResourceUri name: ", nameStr, ", result: ", realFindResourceUri, ", time cost: ");
        LIZLLL.append(System.currentTimeMillis() - currentTimeMillis);
        LIZLLL.append(" ms");
        String LIZIZ = X1D.LIZIZ(LIZLLL);
        c12310e3.getClass();
        C12310e3.LIZ("checkEffect", LIZIZ);
        return realFindResourceUri;
    }

    private final void mobModelNotFound(String str, String str2) {
        ConcurrentHashMap<String, Boolean> concurrentHashMap = modelsNotFoundRecord;
        if (concurrentHashMap.contains(str)) {
            return;
        }
        concurrentHashMap.put(str, Boolean.TRUE);
        XCG xcg = this.effectConfig;
        InterfaceC58749N3x interfaceC58749N3x = (InterfaceC58749N3x) xcg.LJIJJ.LIZ;
        if (interfaceC58749N3x != null) {
            C63081OpJ.LLILLJJLI(interfaceC58749N3x, false, xcg, str, str2);
        }
    }

    @Override // X.C84404XAq
    public void onModelNotFound(String modelName, String errorMessage) {
        o.LJIIJ(modelName, "modelName");
        o.LJIIJ(errorMessage, "errorMessage");
        super.onModelNotFound(modelName, errorMessage);
        mobModelNotFound(modelName, errorMessage);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlgorithmModelResourceFinder(C84389XAb algorithmModelCache, C84376X9o buildInAssetsManager, InterfaceC84406XAs interfaceC84406XAs, XCG effectConfig) {
        super(algorithmModelCache, buildInAssetsManager, interfaceC84406XAs);
        o.LJIIJ(algorithmModelCache, "algorithmModelCache");
        o.LJIIJ(buildInAssetsManager, "buildInAssetsManager");
        o.LJIIJ(effectConfig, "effectConfig");
        this.algorithmModelCache = algorithmModelCache;
        this.buildInAssetsManager = buildInAssetsManager;
        this.eventListener = interfaceC84406XAs;
        this.effectConfig = effectConfig;
        Object obj = buildInAssetsManager.LIZIZ;
        if (obj != null) {
            Context LLLLL = C16880lQ.LLLLL((Context) obj);
            o.LJFF(LLLLL, "(buildInAssetsManager.ap…ntext).applicationContext");
            this.assetResourceFinder = new AssetResourceFinder(LLLLL.getAssets(), algorithmModelCache.LIZJ);
            return;
        }
        throw new C37692Eqm("null cannot be cast to non-null type android.content.Context");
    }
}
