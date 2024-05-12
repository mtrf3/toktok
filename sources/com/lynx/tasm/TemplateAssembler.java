package com.lynx.tasm;

import X.AbstractC61008Nwy;
import X.C06460Ne;
import X.C08200Tw;
import X.C0H1;
import X.C16880lQ;
import X.C39942Fly;
import X.C40053Fnl;
import X.C47523Ikx;
import X.C48263Iwt;
import X.C60682Nri;
import X.C61322O4w;
import X.C79411VEp;
import X.C79600VLw;
import X.EnumC59959Ng3;
import X.F54;
import X.PPT;
import X.VEO;
import X.VEZ;
import X.VMD;
import X.VME;
import X.VND;
import X.VNE;
import X.VNF;
import X.VNG;
import X.VNH;
import X.VNQ;
import X.VNT;
import X.VNU;
import X.VNV;
import X.VOL;
import X.X1D;
import Y.ARunnableS42S0100000_6;
import Y.ARunnableS50S0100000_14;
import Y.ARunnableS7S1100000_6;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import com.lynx.jsbridge.LynxModuleManager;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.air.AirModuleHandler;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.LayoutContext;
import com.lynx.tasm.behavior.PaintingContext;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.utils.LynxUIMethodsExecutor;
import com.lynx.tasm.component.DynamicComponentLoader;
import com.lynx.tasm.core.ExternalSourceLoader;
import com.lynx.tasm.core.JSProxy;
import com.lynx.tasm.core.ResourceLoader;
import com.lynx.tasm.lepus.LepusApiActor;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes15.dex */
public class TemplateAssembler {
    public long LIZ;
    public VND LIZIZ;
    public VNV LIZJ;
    public String LIZLLL;
    public final String LJ;
    public JSProxy LJFF;
    public int LJI;
    public volatile boolean LJII;
    public volatile boolean LJIIIIZZ;
    public final C60682Nri LJIIIZ;
    public LepusApiActor LJIIJ;
    public WeakReference<VNU> LJIIJJI;
    public final PaintingContext LJIIL;
    public final LayoutContext LJIILIIL;
    public Set<String> LJIILJJIL;
    public final boolean LJIILL;
    public final boolean LJIILLIIL;
    public VNQ LJIIZILJ;
    public VMD LJIJ;
    public final EnumC59959Ng3 LJIJI;
    public final WeakReference<C79600VLw> LJIJJ;
    public final long LJIJJLI;
    public final boolean LJIL;
    public LynxModuleManager LJJ;
    public final boolean LJJI;
    public final AtomicInteger LJJIFFI;
    public final SparseArray<VNH> LJJII;

    private native long nativeCreate(Object obj, Object obj2, Object obj3, int i, boolean z, boolean z2, int i2, int i3, String str, boolean z3, boolean z4, boolean z5, boolean z6);

    private native long nativeCreateWithRenderkit(long j, Object obj, Object obj2, int i, boolean z, int i2, int i3, boolean z2);

    private native void nativeFlush(long j);

    private native JavaOnlyMap nativeGetAllJsSource(long j);

    private native void nativeGetDataAsync(long j, int i);

    private native JavaOnlyMap nativeGetListPlatformInfo(long j, int i);

    private native Object nativeGetPageDataByKey(long j, String[] strArr);

    private native void nativeInitAirEnv(long j, AirModuleHandler airModuleHandler);

    private native void nativeInitRuntime(long j, ResourceLoader resourceLoader, ExternalSourceLoader externalSourceLoader, LynxModuleManager lynxModuleManager, String str, String[] strArr, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str2, boolean z6);

    private native void nativeInitRuntimeWithRenderkit(long j, long j2, ResourceLoader resourceLoader, ExternalSourceLoader externalSourceLoader, LynxModuleManager lynxModuleManager, String str, String[] strArr, boolean z, boolean z2, boolean z3, boolean z4, String str2);

    private native void nativeLoadComponent(long j, String str, byte[] bArr, int i);

    private native void nativeLoadSSRData(long j, byte[] bArr, ByteBuffer byteBuffer, int i);

    private native void nativeLoadTemplate(long j, String str, byte[] bArr, ByteBuffer byteBuffer, int i);

    private native void nativeLoadTemplateBundleByPreParsedData(long j, String str, long j2, long j3, boolean z, String str2);

    private native void nativeLoadTemplateByJson(long j, String str, byte[] bArr, String str2);

    private native void nativeLoadTemplateByPreParsedData(long j, String str, byte[] bArr, long j2, boolean z, String str2);

    private native void nativeMarkDirty(long j);

    private native int nativeObtainChild(long j, int i, int i2, long j2, boolean z);

    private native int nativeObtainChildAsync(long j, int i, int i2, long j2);

    private native void nativeOnEnterBackground(long j);

    private native void nativeOnEnterForeground(long j);

    private native void nativeOnPseudoStatusChanged(long j, int i, int i2, int i3);

    private native void nativePreloadDynamicComponents(long j, String[] strArr);

    private native void nativeRecycleChild(long j, int i, int i2);

    private native void nativeRecycleChildAsync(long j, int i, int i2);

    private native long nativeRegisterCanvasManager(long j, long j2);

    private native void nativeReloadTemplate(long j, long j2, long j3, String str, boolean z, Object obj);

    private native void nativeRemoveChild(long j, int i, int i2);

    private native void nativeRenderChild(long j, int i, int i2, long j2);

    private native void nativeResetDataByPreParsedData(long j, long j2, String str, boolean z);

    private native void nativeRunOnTasmThread(long j, Runnable runnable);

    private native void nativeSendCustomEvent(long j, String str, int i, ByteBuffer byteBuffer, int i2, String str2);

    private native void nativeSendGlobalEventToLepus(long j, String str, ByteBuffer byteBuffer, int i);

    private native void nativeSendInternalEvent(long j, int i, int i2, ByteBuffer byteBuffer, int i3);

    private native void nativeSendSsrGlobalEvent(long j, String str, ByteBuffer byteBuffer, int i);

    private native void nativeSendTouchEvent(long j, String str, int i, float f, float f2, float f3, float f4, float f5, float f6);

    private native void nativeSetEnableKrypton(long j, boolean z);

    private native void nativeSetFontScale(long j, float f);

    private native void nativeSetInitTiming(long j, long j2, long j3);

    private native void nativeStartRuntime(long j);

    private native void nativeSyncFetchLayoutResult(long j);

    private native void nativeTriggerEventBus(long j, String str, ByteBuffer byteBuffer, int i);

    private native void nativeUnRegisterCanvasManager(long j, long j2);

    private native void nativeUpdateChild(long j, int i, int i2, int i3, long j2);

    private native void nativeUpdateConfig(long j, ByteBuffer byteBuffer, int i);

    private native void nativeUpdateDataByPreParsedData(long j, long j2, String str, boolean z);

    private native void nativeUpdateFontScale(long j, float f);

    private native void nativeUpdateGlobalProps(long j, long j2);

    private native void nativeUpdateScreenMetrics(long j, int i, int i2, float f);

    private native void nativeUpdateViewport(long j, int i, int i2, int i3, int i4);

    public final void LJJIIZ() {
        nativeSetEnableKrypton(this.LIZ, true);
    }

    public native void nativeDestroy(long j);

    public native void nativeUpdateI18nResource(long j, String str, String str2, int i);

    private void OnSSRHydrateFinished() {
        VND vnd = this.LIZIZ;
        if (vnd != null) {
            vnd.LJFF();
        }
    }

    private void dispatchOnLoaded() {
        VND vnd = this.LIZIZ;
        if (vnd != null) {
            vnd.LIZ();
        }
    }

    public final void LIZ() {
        if (!this.LJII) {
            if (this.LJIL) {
                this.LJJ.LIZLLL();
            } else {
                this.LJJ.destroy();
            }
        }
        LayoutContext layoutContext = this.LJIILIIL;
        if (layoutContext != null) {
            layoutContext.LIZIZ = true;
        }
        PaintingContext paintingContext = this.LJIIL;
        if (paintingContext != null) {
            paintingContext.LIZIZ = true;
        }
        this.LJII = true;
        long j = this.LIZ;
        if (C79411VEp.LIZ() && !this.LJIIIIZZ) {
            nativeDestroy(j);
        } else {
            C79411VEp.LIZJ(new VNF(this, j));
        }
        new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS50S0100000_14(this, 37));
        JSProxy jSProxy = this.LJFF;
        if (jSProxy != null) {
            jSProxy.LIZLLL();
        }
        LepusApiActor lepusApiActor = this.LJIIJ;
        if (lepusApiActor != null) {
            lepusApiActor.LIZIZ(new ARunnableS50S0100000_14(lepusApiActor, 168));
        }
        this.LIZ = 0L;
        this.LJJ = null;
    }

    public final void LIZIZ() {
        nativeFlush(this.LIZ);
    }

    public final VMD LJ() {
        VNQ vnq = this.LJIIZILJ;
        if (vnq == null) {
            return new VMD(new VME());
        }
        if (this.LJIJ == null) {
            VME vme = new VME();
            vme.LIZ = vnq.LIZLLL;
            vme.LIZIZ = vnq.LJIIIIZZ;
            vme.LIZJ = vnq.LJIIIZ;
            vme.LIZLLL = vnq.LJIIJ;
            vme.LJ = this.LIZLLL;
            vme.LJFF = vnq.LJIILIIL;
            vme.LJI = vnq.LJIILJJIL;
            vme.LJII = this.LJIJI;
            vme.LJIIIIZZ = vnq.LJIILL;
            vme.LJIIIZ = false;
            vme.LJIIJ = vnq.LJIILLIIL;
            vme.LJIIJJI = vnq.LJJII;
            vme.LJIIL = this.LJIILJJIL;
            vme.LJIILIIL = vnq.LJIJJ;
            vme.LJIILJJIL = vnq.LJJIIZI;
            this.LJIJ = new VMD(vme);
        }
        return this.LJIJ;
    }

    public final void LJIILIIL() {
        nativeMarkDirty(this.LIZ);
    }

    public final void LJJIJIL() {
        nativeStartRuntime(this.LIZ);
    }

    public final void LJJIJL() {
        nativeSyncFetchLayoutResult(this.LIZ);
    }

    public void markDrawEndTimingIfNeeded() {
        C79600VLw c79600VLw;
        if (C39942Fly.LIZJ.booleanValue() && (c79600VLw = this.LJIJJ.get()) != null) {
            C79411VEp.LJ(new ARunnableS42S0100000_6(c79600VLw, 25));
        }
    }

    public void onDataUpdated() {
        VND vnd = this.LIZIZ;
        if (vnd != null) {
            vnd.LJIIIZ();
        }
    }

    public void onRuntimeReady() {
        VND vnd = this.LIZIZ;
        if (vnd != null) {
            vnd.LJIIIIZZ();
        }
    }

    private Object decodeByteBuffer(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            C40053Fnl.LIZ.getClass();
            return C40053Fnl.LIZ(byteBuffer);
        }
        return null;
    }

    public final void LIZJ(VNH vnh) {
        int incrementAndGet = this.LJJIFFI.incrementAndGet();
        this.LJJII.put(incrementAndGet, vnh);
        nativeGetDataAsync(this.LIZ, incrementAndGet);
    }

    public final JavaOnlyMap LIZLLL(int i) {
        if (this.LJII) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getListPlatformInfo while tasm is destoryed: listSign ");
            LIZ.append(i);
            LLog.LIZLLL(4, "TemplateAssembler", X1D.LIZIZ(LIZ));
            return null;
        }
        return nativeGetListPlatformInfo(this.LIZ, i);
    }

    public final Map<String, Object> LJFF(String[] strArr) {
        Object nativeGetPageDataByKey = nativeGetPageDataByKey(this.LIZ, strArr);
        HashMap hashMap = new HashMap();
        if (nativeGetPageDataByKey instanceof Map) {
            hashMap.putAll((Map) nativeGetPageDataByKey);
        }
        return hashMap;
    }

    public final void LJIILLIIL(boolean z) {
        if (!z) {
            if (this.LJIILL) {
                VNQ vnq = this.LJIIZILJ;
                if (vnq == null) {
                    LLog.LIZLLL(4, "TemplateAssembler", "PageConfig is null.GetAutoExpose get default true!");
                } else if (!vnq.LIZ) {
                    return;
                }
            } else {
                return;
            }
        }
        nativeOnEnterBackground(this.LIZ);
    }

    public final void LJIIZILJ(boolean z) {
        if (!z) {
            if (this.LJIILL) {
                VNQ vnq = this.LJIIZILJ;
                if (vnq == null) {
                    LLog.LIZLLL(4, "TemplateAssembler", "PageConfig is null.GetAutoExpose get default true!");
                } else if (!vnq.LIZ) {
                    return;
                }
            } else {
                return;
            }
        }
        nativeOnEnterForeground(this.LIZ);
    }

    public final void LJIJ(String[] strArr) {
        nativePreloadDynamicComponents(this.LIZ, strArr);
    }

    public final long LJIJJLI(long j) {
        return nativeRegisterCanvasManager(this.LIZ, j);
    }

    public final void LJJIFFI(TemplateData templateData) {
        nativeResetDataByPreParsedData(this.LIZ, templateData.LIZ, templateData.LIZLLL, templateData.LJFF);
    }

    public final void LJJII(Runnable runnable) {
        nativeRunOnTasmThread(this.LIZ, runnable);
    }

    public final void LJJIIJ(C61322O4w c61322O4w) {
        if (this.LJII) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SendInternalEvent: id ");
            LIZ.append(c61322O4w.LIZIZ);
            LIZ.append(" tag: ");
            LIZ.append(c61322O4w.LIZ);
            LLog.LIZLLL(4, "TemplateAssembler", X1D.LIZIZ(LIZ));
            return;
        }
        nativeSendInternalEvent(this.LIZ, c61322O4w.LIZ, c61322O4w.LIZIZ, null, 0);
    }

    public final void LJJIIZI(float f) {
        nativeSetFontScale(this.LIZ, f);
    }

    public final void LJJIJIIJI(ByteBuffer byteBuffer) {
        nativeUpdateConfig(this.LIZ, byteBuffer, byteBuffer.position());
    }

    public final void LJJIJIIJIL(VNG vng) {
        if (vng == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("theme", vng.LIZ);
        C40053Fnl.LIZ.getClass();
        ByteBuffer LIZIZ = C40053Fnl.LIZIZ(hashMap);
        if (LIZIZ != null) {
            nativeUpdateConfig(this.LIZ, LIZIZ, LIZIZ.position());
        }
    }

    public final void LJJIL(long j) {
        nativeUnRegisterCanvasManager(this.LIZ, j);
    }

    public final void LJJJ(TemplateData templateData) {
        nativeUpdateDataByPreParsedData(this.LIZ, templateData.LIZ, templateData.LIZLLL, templateData.LJFF);
    }

    public final void LJJJI(float f) {
        nativeUpdateFontScale(this.LIZ, f);
    }

    public final void LJJJIL(TemplateData templateData) {
        if (templateData == null) {
            return;
        }
        templateData.LIZLLL();
        long j = templateData.LIZ;
        if (j == 0) {
            LLog.LIZLLL(4, "TemplateAssembler", "updateGlobalProps with zero templateData");
            return;
        }
        long j2 = this.LIZ;
        if (j2 != 0) {
            nativeUpdateGlobalProps(j2, j);
        }
    }

    public void addAttributeTimingFlag(String str) {
        C79600VLw c79600VLw;
        if (C39942Fly.LIZJ.booleanValue() && (c79600VLw = this.LJIJJ.get()) != null) {
            c79600VLw.LIZ(str);
        }
    }

    public void executeRunnable(Runnable runnable) {
        runnable.run();
    }

    public void flushJSBTiming(ReadableMap readableMap) {
        VND vnd;
        if (C39942Fly.LIZIZ.booleanValue() || (vnd = this.LIZIZ) == null || readableMap == null) {
            return;
        }
        vnd.LIZLLL(JavaOnlyMap.from(readableMap.getMap("info").asHashMap()));
        if (readableMap.getMap("info").getInt("jsb_status_code", 0) != 1) {
            return;
        }
        this.LIZIZ.LJIIL(readableMap.asHashMap());
    }

    public void onDynamicComponentPerfReady(ReadableMap readableMap) {
        VND vnd = this.LIZIZ;
        if (vnd != null) {
            vnd.LJ(readableMap.asHashMap());
        }
    }

    public void onPageChanged(boolean z) {
        VND vnd = this.LIZIZ;
        if (vnd != null) {
            vnd.LJIILIIL(z);
        }
    }

    public void onPageConfigDecoded(ReadableMap readableMap) {
        VNQ vnq = new VNQ(readableMap);
        this.LJIIZILJ = vnq;
        VND vnd = this.LIZIZ;
        if (vnd != null) {
            vnd.LJIILL(vnq);
        }
    }

    public final void LJIJI(int i, int i2) {
        if (this.LJII) {
            LLog.LIZLLL(4, "TemplateAssembler", C48263Iwt.LIZLLL("recycleChild while tasm is destroyed: listSign ", i, ", childSign ", i2));
        } else {
            nativeRecycleChild(this.LIZ, i, i2);
        }
    }

    public final void LJIJJ(int i, int i2) {
        if (this.LJII) {
            LLog.LIZLLL(4, "TemplateAssembler", C48263Iwt.LIZLLL("recycleChildAsync while tasm is destroyed: listSign ", i, ", childSign ", i2));
        } else {
            nativeRecycleChildAsync(this.LIZ, i, i2);
        }
    }

    public final void LJIL(TemplateData templateData, TemplateData templateData2) {
        long j;
        if (templateData2 != null) {
            templateData2.LIZLLL();
            j = templateData2.LIZ;
        } else {
            j = 0;
        }
        nativeReloadTemplate(this.LIZ, templateData.LIZ, j, templateData.LIZLLL, templateData.LJFF, templateData2);
    }

    public final void LJJ(int i, int i2) {
        if (this.LJII) {
            LLog.LIZLLL(4, "TemplateAssembler", C48263Iwt.LIZLLL("removeChild while tasm is destroyed: listSign ", i, ", childSign ", i2));
        } else {
            nativeRemoveChild(this.LIZ, i, i2);
        }
    }

    public final void LJJIII(String str, List<Object> list) {
        int position;
        C40053Fnl.LIZ.getClass();
        ByteBuffer LIZIZ = C40053Fnl.LIZIZ(list);
        long j = this.LIZ;
        if (LIZIZ == null) {
            position = 0;
        } else {
            position = LIZIZ.position();
        }
        nativeSendGlobalEventToLepus(j, str, LIZIZ, position);
    }

    public final void LJJIIJZLJL(String str, List<Object> list) {
        int position;
        C40053Fnl.LIZ.getClass();
        ByteBuffer LIZIZ = C40053Fnl.LIZIZ(list);
        long j = this.LIZ;
        if (LIZIZ == null) {
            position = 0;
        } else {
            position = LIZIZ.position();
        }
        nativeSendSsrGlobalEvent(j, str, LIZIZ, position);
    }

    public final void LJJIJ(long j, long j2) {
        nativeSetInitTiming(this.LIZ, j, j2);
    }

    public final void LJJIJLIJ(String str, List<Object> list) {
        int position;
        C40053Fnl.LIZ.getClass();
        ByteBuffer LIZIZ = C40053Fnl.LIZIZ(list);
        long j = this.LIZ;
        if (LIZIZ == null) {
            position = 0;
        } else {
            position = LIZIZ.position();
        }
        nativeTriggerEventBus(j, str, LIZIZ, position);
    }

    public final void LJJJJ(int i, int i2) {
        nativeUpdateScreenMetrics(this.LIZ, i, i2, 1.0f);
    }

    public void getDataBack(ByteBuffer byteBuffer, int i) {
        VNH vnh = this.LJJII.get(i);
        C40053Fnl.LIZ.getClass();
        Object LIZ = C40053Fnl.LIZ(byteBuffer);
        if (LIZ instanceof Map) {
            vnh.LIZ(JavaOnlyMap.from((Map) LIZ));
        } else {
            vnh.onFail();
        }
    }

    public void getI18nResourceByNative(String str, String str2) {
        AbstractC61008Nwy abstractC61008Nwy;
        VNU vnu = this.LJIIJJI.get();
        if (vnu != null) {
            C47523Ikx c47523Ikx = vnu.LL;
            c47523Ikx.getClass();
            if (TextUtils.isEmpty("I18N_TEXT") || (abstractC61008Nwy = (AbstractC61008Nwy) ((Map) c47523Ikx.LIZ).get("I18N_TEXT")) == null) {
                vnu.LJIIJ(str, "I18nResource", "no i18n provider found");
            } else {
                abstractC61008Nwy.LIZ(new C08200Tw(str.toLowerCase(), C0H1.LIZ("fallbackUrl", str2)), new VEO(this, str));
            }
        }
    }

    public void markUIOperationQueueFlushTiming(String str, String str2) {
        if (C39942Fly.LIZJ.booleanValue()) {
            C79600VLw c79600VLw = this.LJIJJ.get();
            if (c79600VLw != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(str);
                LIZ.append(".");
                LIZ.append(str2);
                TraceEvent.LJII(X1D.LIZIZ(LIZ), "#4caf50");
                c79600VLw.LJIIIIZZ(str, System.currentTimeMillis(), str2);
                return;
            }
            return;
        }
        PaintingContext paintingContext = this.LJIIL;
        if (paintingContext == null) {
            return;
        }
        paintingContext.MarkUIOperationQueueFlushTiming(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onConfigUpdatedByJS(String str, Object obj) {
        if (str == null || obj == null || !(obj instanceof HashMap)) {
            return;
        }
        HashMap hashMap = (HashMap) obj;
        if (!"theme".equals(str)) {
            return;
        }
        VNG vng = new VNG();
        for (Map.Entry entry : hashMap.entrySet()) {
            String str2 = (String) entry.getKey();
            Object value = entry.getValue();
            if (str2 != null && !str2.isEmpty() && !str2.startsWith("__")) {
                if (value == null) {
                    vng.LIZ.remove(str2);
                } else {
                    vng.LIZ.put(str2, value);
                }
            }
        }
        VND vnd = this.LIZIZ;
        if (vnd == null) {
            return;
        }
        vnd.LJIIJ(vng);
    }

    public void onFirstLoadPerfReady(ReadableMap readableMap, ReadableMap readableMap2) {
        LynxPerfMetric lynxPerfMetric = new LynxPerfMetric(readableMap, readableMap2, this.LIZLLL, LJ());
        VND vnd = this.LIZIZ;
        if (vnd != null) {
            vnd.LIZJ(lynxPerfMetric);
        }
    }

    public void onUpdatePerfReady(ReadableMap readableMap, ReadableMap readableMap2) {
        LynxPerfMetric lynxPerfMetric = new LynxPerfMetric(readableMap, readableMap2, this.LIZLLL, LJ());
        VND vnd = this.LIZIZ;
        if (vnd != null) {
            vnd.LJIILJJIL(lynxPerfMetric);
        }
    }

    public void report(String str, ReadableMap readableMap) {
        VND vnd = this.LIZIZ;
        if (vnd != null) {
            vnd.LJIIJJI(str, readableMap.asHashMap());
        }
    }

    public void reportError(int i, String str) {
        VND vnd = this.LIZIZ;
        if (vnd != null) {
            vnd.LJII(i, str);
        }
    }

    public String translateResourceForTheme(String str, String str2) {
        VND vnd = this.LIZIZ;
        if (vnd != null) {
            vnd.LIZIZ();
        }
        return null;
    }

    public ByteBuffer triggerLepusBridge(String str, Object obj) {
        C40053Fnl c40053Fnl = C40053Fnl.LIZ;
        Object LIZIZ = F54.LIZIZ(str, obj, this.LJJ);
        c40053Fnl.getClass();
        return C40053Fnl.LIZIZ(LIZIZ);
    }

    public void triggerLepusBridgeAsync(String str, Object obj) {
        F54.LIZJ(str, obj, this.LJIIJ, this.LJJ);
    }

    public void updateDrawEndTimingState(boolean z, String str) {
        if (C39942Fly.LIZJ.booleanValue()) {
            C79600VLw c79600VLw = this.LJIJJ.get();
            if (c79600VLw == null || !z || str == null) {
                return;
            }
            C79411VEp.LJ(new ARunnableS7S1100000_6(c79600VLw, str, 2));
            return;
        }
        PaintingContext paintingContext = this.LJIIL;
        if (paintingContext == null) {
            return;
        }
        paintingContext.updateDrawEndTimingState(z, str);
    }

    public final void LJI(LynxModuleManager lynxModuleManager, ExternalSourceLoader externalSourceLoader, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4 = false;
        this.LJJ = lynxModuleManager;
        C60682Nri c60682Nri = this.LJIIIZ;
        if (c60682Nri == null || !c60682Nri.LJFF) {
            z2 = true;
        } else {
            z2 = false;
        }
        String[] strArr = null;
        String str = "-1";
        if (C39942Fly.LIZJ.booleanValue()) {
            long j = this.LIZ;
            long j2 = this.LJIJJLI;
            ResourceLoader resourceLoader = new ResourceLoader();
            C60682Nri c60682Nri2 = this.LJIIIZ;
            if (c60682Nri2 != null) {
                str = c60682Nri2.LIZ;
            }
            if (c60682Nri2 != null) {
                strArr = c60682Nri2.LIZJ;
            }
            if (c60682Nri2 != null && c60682Nri2.LIZIZ) {
                z3 = true;
            } else {
                z3 = false;
            }
            nativeInitRuntimeWithRenderkit(j, j2, resourceLoader, externalSourceLoader, lynxModuleManager, str, strArr, z3, false, z2, this.LJIILLIIL, this.LJ);
        } else {
            long j3 = this.LIZ;
            ResourceLoader resourceLoader2 = new ResourceLoader();
            C60682Nri c60682Nri3 = this.LJIIIZ;
            if (c60682Nri3 != null) {
                str = c60682Nri3.LIZ;
            }
            if (c60682Nri3 != null) {
                strArr = c60682Nri3.LIZJ;
            }
            if (c60682Nri3 != null && c60682Nri3.LIZIZ) {
                z4 = true;
            }
            nativeInitRuntime(j3, resourceLoader2, externalSourceLoader, lynxModuleManager, str, strArr, z4, false, z2, z, this.LJIILLIIL, this.LJ, C60682Nri.LIZIZ(c60682Nri3));
        }
        if (this.LJIL) {
            this.LJFF = new JSProxy(this.LIZ, this.LJIIJJI, C60682Nri.LIZIZ(this.LJIIIZ));
        }
        this.LJIIJ = new LepusApiActor(this.LIZ);
        if (this.LJJI) {
            nativeInitAirEnv(this.LIZ, new AirModuleHandler(this.LJJ));
        }
    }

    public final void LJII(int i, String str, byte[] bArr) {
        nativeLoadComponent(this.LIZ, str, bArr, i);
    }

    public final void LJIIIIZZ(byte[] bArr, Map map, VNT vnt) {
        int position;
        if (bArr == null) {
            LLog.LIZLLL(4, "TemplateAssembler", "Load ssr data  with null template");
            return;
        }
        this.LIZIZ = vnt;
        C40053Fnl.LIZ.getClass();
        ByteBuffer LIZIZ = C40053Fnl.LIZIZ(map);
        long j = this.LIZ;
        if (LIZIZ == null) {
            position = 0;
        } else {
            position = LIZIZ.position();
        }
        nativeLoadSSRData(j, bArr, LIZIZ, position);
    }

    public final void LJIILL(int i, int i2, long j) {
        if (this.LJII) {
            LLog.LIZLLL(4, "TemplateAssembler", C48263Iwt.LIZLLL("obtainChildAsync while tasm is destroyed: listSign ", i, ", index ", i2));
        } else {
            nativeObtainChildAsync(this.LIZ, i, i2, j);
        }
    }

    public final void LJJI(int i, int i2, long j) {
        if (this.LJII) {
            LLog.LIZLLL(4, "TemplateAssembler", C48263Iwt.LIZLLL("renderChild while tasm is destroyed: listSign ", i, ", index ", i2));
        } else {
            nativeRenderChild(this.LIZ, i, i2, j);
        }
    }

    public void onModuleFunctionInvoked(String str, String str2, int i) {
        VND vnd = this.LIZIZ;
        if (vnd != null) {
            try {
                vnd.LJI(str, str2, i);
            } catch (Exception e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onModuleFunctionInvoked threw an exception: ");
                LIZ.append(e.getMessage());
                reportError(904, X1D.LIZIZ(LIZ));
            }
        }
    }

    public void setTiming(String str, long j, String str2) {
        if (C39942Fly.LIZJ.booleanValue()) {
            C79600VLw c79600VLw = this.LJIJJ.get();
            if (c79600VLw != null) {
                c79600VLw.LJIIIIZZ(str, j, str2);
                return;
            }
            return;
        }
        PaintingContext paintingContext = this.LJIIL;
        if (paintingContext == null) {
            return;
        }
        paintingContext.LIZ.LJIIIIZZ.LJIIIIZZ(str, j, str2);
    }

    public void InvokeUIMethod(LynxGetUIResult lynxGetUIResult, String str, JavaOnlyMap javaOnlyMap, int i) {
        VNU vnu;
        WeakReference<VNU> weakReference = this.LJIIJJI;
        if (weakReference != null && (vnu = weakReference.get()) != null && vnu.LJFF() != null) {
            VNE vne = new VNE(this, i);
            LynxBaseUI LJIIJ = vnu.LJFF().LJIIJ(lynxGetUIResult.LIZ.getInt(0));
            if (LJIIJ != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(LJIIJ.getTagName());
                LIZ.append(".invokeUIMethodForSelectorQuery.");
                LIZ.append(str);
                String LIZIZ = X1D.LIZIZ(LIZ);
                TraceEvent.LIZIZ(LIZIZ);
                LynxUIMethodsExecutor.LIZ(LJIIJ, str, javaOnlyMap, vne);
                TraceEvent.LJ(LIZIZ);
                return;
            }
            vne.invoke(6, "node does not have a LynxUI");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if (r7 == 0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(byte[] r12, com.lynx.tasm.TemplateData r13, java.lang.String r14, X.VNT r15) {
        /*
            r11 = this;
            r5 = 4
            java.lang.String r4 = "TemplateAssembler"
            r6 = r12
            if (r6 != 0) goto Lc
            java.lang.String r0 = "Load Template with null template"
            com.lynx.tasm.base.LLog.LIZLLL(r5, r4, r0)
            return
        Lc:
            r1 = 0
            r2 = 0
            r0 = r13
            if (r0 == 0) goto L33
            r0.LIZLLL()
            long r7 = r0.LIZ
            java.lang.String r10 = r0.LIZLLL
            boolean r9 = r0.LJFF
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 != 0) goto L24
        L1f:
            java.lang.String r0 = "Load Template with zero templatedata"
            com.lynx.tasm.base.LLog.LIZLLL(r5, r4, r0)
        L24:
            r2 = r11
            r0 = r14
            r2.LIZLLL = r0
            r0 = r15
            r2.LIZIZ = r0
            int r0 = r6.length
            r2.LJI = r0
            boolean r0 = r2.LJII
            if (r0 == 0) goto L38
            return
        L33:
            r10 = 0
            r7 = 0
            r9 = 0
            goto L1f
        L38:
            r0 = 1
            r2.LJIIIIZZ = r0
            long r3 = r2.LIZ
            java.lang.String r5 = r2.LIZLLL
            r2.nativeLoadTemplateByPreParsedData(r3, r5, r6, r7, r9, r10)
            r2.LJIIIIZZ = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.TemplateAssembler.LJIIIZ(byte[], com.lynx.tasm.TemplateData, java.lang.String, X.VNT):void");
    }

    public final void LJIIJ(byte[] bArr, String str, String str2, VNT vnt) {
        if (bArr == null) {
            LLog.LIZLLL(4, "TemplateAssembler", "Load Template with null template");
            return;
        }
        this.LIZLLL = str2;
        this.LIZIZ = vnt;
        this.LJI = bArr.length;
        if (this.LJII) {
            return;
        }
        this.LJIIIIZZ = true;
        nativeLoadTemplateByJson(this.LIZ, this.LIZLLL, bArr, str);
        this.LJIIIIZZ = false;
    }

    public final void LJIIJJI(byte[] bArr, Map map, String str, VNT vnt) {
        int position;
        if (bArr == null) {
            LLog.LIZLLL(4, "TemplateAssembler", "Load Template with null template");
            return;
        }
        C40053Fnl.LIZ.getClass();
        ByteBuffer LIZIZ = C40053Fnl.LIZIZ(map);
        this.LIZLLL = str;
        this.LIZIZ = vnt;
        this.LJI = bArr.length;
        if (this.LJII) {
            return;
        }
        this.LJIIIIZZ = true;
        long j = this.LIZ;
        String str2 = this.LIZLLL;
        if (LIZIZ == null) {
            position = 0;
        } else {
            position = LIZIZ.position();
        }
        nativeLoadTemplate(j, str2, bArr, LIZIZ, position);
        this.LJIIIIZZ = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (r14 == 0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(com.lynx.tasm.TemplateBundle r19, java.lang.String r20, com.lynx.tasm.TemplateData r21, X.VNT r22) {
        /*
            r18 = this;
            r6 = 4
            java.lang.String r5 = "TemplateAssembler"
            r7 = r19
            if (r7 == 0) goto L4e
            long r0 = r7.LIZ
            r4 = 1
            r8 = 0
            r3 = 0
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 == 0) goto L4b
            r0 = r21
            if (r0 == 0) goto L36
            r0.LIZLLL()
            long r14 = r0.LIZ
            java.lang.String r2 = r0.LIZLLL
            boolean r1 = r0.LJFF
            int r0 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r0 != 0) goto L27
        L22:
            java.lang.String r0 = "LoadTemplateBundle with zero templateData"
            com.lynx.tasm.base.LLog.LIZLLL(r6, r5, r0)
        L27:
            r8 = r18
            r11 = r20
            r8.LIZLLL = r11
            r0 = r22
            r8.LIZIZ = r0
            boolean r0 = r8.LJII
            if (r0 == 0) goto L3b
            return
        L36:
            r2 = 0
            r14 = 0
            r1 = 0
            goto L22
        L3b:
            r8.LJIIIIZZ = r4
            long r9 = r8.LIZ
            long r12 = r7.LIZ
            r16 = r1
            r17 = r2
            r8.nativeLoadTemplateBundleByPreParsedData(r9, r11, r12, r14, r16, r17)
            r8.LJIIIIZZ = r3
            return
        L4b:
            java.lang.String r2 = r7.LIZJ
            goto L50
        L4e:
            java.lang.String r2 = "bundle is null"
        L50:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "LoadTemplateBundle with null bundle or InValid bundle, the error message is "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            com.lynx.tasm.base.LLog.LIZLLL(r6, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.TemplateAssembler.LJIIL(com.lynx.tasm.TemplateBundle, java.lang.String, com.lynx.tasm.TemplateData, X.VNT):void");
    }

    public final int LJIILJJIL(int i, int i2, long j, boolean z) {
        if (this.LJII) {
            LLog.LIZLLL(4, "TemplateAssembler", C48263Iwt.LIZLLL("obtainChild while tasm is destroyed: listSign ", i, ", index ", i2));
            return -1;
        }
        return nativeObtainChild(this.LIZ, i, i2, j, z);
    }

    public final void LJJIZ(int i, int i2, int i3, long j) {
        if (this.LJII) {
            StringBuilder LIZJ = C06460Ne.LIZJ("updateChild while tasm is destroyed: listSign ", i, ", oldSign ", i2, ", newIndex ");
            LIZJ.append(i3);
            LLog.LIZLLL(4, "TemplateAssembler", X1D.LIZIZ(LIZJ));
            return;
        }
        nativeUpdateChild(this.LIZ, i, i2, i3, j);
    }

    public final void LJJJJI(int i, int i2, int i3, int i4) {
        nativeUpdateViewport(this.LIZ, i, i2, i3, i4);
    }

    public TemplateAssembler(long j, VNU vnu, LayoutContext layoutContext, DynamicComponentLoader dynamicComponentLoader, C60682Nri c60682Nri, EnumC59959Ng3 enumC59959Ng3, boolean z, boolean z2, String str, C79600VLw c79600VLw) {
        int id;
        this.LJIILJJIL = new HashSet();
        this.LJIJJ = new WeakReference<>(null);
        this.LJIJJLI = 0L;
        this.LJIL = true;
        this.LJJ = null;
        this.LJJIFFI = new AtomicInteger(0);
        this.LJJII = new SparseArray<>();
        this.LJIJJ = new WeakReference<>(c79600VLw);
        this.LJIILIIL = layoutContext;
        this.LJIIIZ = c60682Nri;
        this.LJIJJLI = j;
        this.LJIJI = enumC59959Ng3;
        DisplayMetrics displayMetrics = vnu.LJLZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TemplateAssembler renderkit renderkitContext: ");
        LIZ.append(j);
        LLog.LIZLLL(4, "TemplateAssembler", X1D.LIZIZ(LIZ));
        if (enumC59959Ng3 == null) {
            id = EnumC59959Ng3.ALL_ON_UI.id();
        } else {
            id = enumC59959Ng3.id();
        }
        this.LIZ = nativeCreateWithRenderkit(j, layoutContext, dynamicComponentLoader, id, z, displayMetrics.widthPixels, displayMetrics.heightPixels, false);
        this.LJII = false;
        this.LJIILLIIL = z2;
        this.LJ = str;
    }

    public TemplateAssembler(PaintingContext paintingContext, VOL vol, DynamicComponentLoader dynamicComponentLoader, C60682Nri c60682Nri, EnumC59959Ng3 enumC59959Ng3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, boolean z6, boolean z7) {
        int id;
        this.LJIILJJIL = new HashSet();
        this.LJIJJ = new WeakReference<>(null);
        this.LJIJJLI = 0L;
        this.LJIL = true;
        this.LJJ = null;
        this.LJJIFFI = new AtomicInteger(0);
        this.LJJII = new SparseArray<>();
        this.LJIIL = paintingContext;
        this.LJIILIIL = vol;
        this.LJIIIZ = c60682Nri;
        DisplayMetrics displayMetrics = vol.LIZJ.LJLZ;
        this.LJIJI = enumC59959Ng3;
        this.LJIL = z4;
        if (enumC59959Ng3 == null) {
            id = EnumC59959Ng3.ALL_ON_UI.id();
        } else {
            id = enumC59959Ng3.id();
        }
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        LynxEnv LJIIIZ = LynxEnv.LJIIIZ();
        if (LJIIIZ.LJJIFFI == null) {
            PPT ppt = (PPT) VEZ.LIZIZ().LIZ(PPT.class);
            if (ppt != null) {
                LJIIIZ.LJJIFFI = ppt.getLocale();
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(Locale.getDefault().getLanguage());
                LIZ.append("-");
                LIZ.append(Locale.getDefault().getCountry());
                LJIIIZ.LJJIFFI = X1D.LIZIZ(LIZ);
            }
        }
        this.LIZ = nativeCreate(paintingContext, vol, dynamicComponentLoader, id, z, z3, i, i2, LJIIIZ.LJJIFFI, z4, z6, false, z7);
        this.LJII = false;
        this.LJIILL = z2;
        this.LJIILLIIL = z5;
        this.LJ = str;
        this.LJJI = false;
    }
}
