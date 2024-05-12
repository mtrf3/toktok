package X;

import Y.ARunnableS15S0000000_8;
import Y.ARunnableS25S0300000_14;
import Y.ARunnableS33S0200000_14;
import Y.ARunnableS50S0100000_14;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.tasm.LynxPerfMetric;
import com.lynx.tasm.LynxTemplateRender;
import com.lynx.tasm.LynxViewClient;
import com.lynx.tasm.TemplateAssembler;
import com.lynx.tasm.TemplateBundle;
import com.lynx.tasm.TemplateData;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIBody;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.tasm.core.JSProxy;
import com.lynx.tasm.core.VSyncMonitor;
import com.lynx.tasm.utils.DisplayMetricsHolder;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class VNS extends VOT {
    public boolean mAttached;
    public boolean mCanDispatchTouchEvent;
    public boolean mDispatchTouchEventToDev;
    public VPF mKeyboardEvent;
    public LynxTemplateRender mLynxTemplateRender;
    public InterfaceC79633VNd mRenderkitView;
    public String mUrl;

    public LynxPerfMetric forceGetPerf() {
        return null;
    }

    @Override // android.view.View
    public Object getTag() {
        return "lynxview";
    }

    public void renderTemplateUrl(String str, String str2) {
        com_lynx_tasm_LynxView_com_ss_android_ugc_tiktok_security_lancet_lynx_LynxSecLancet_renderTemplateUrl(this, str, str2);
    }

    public void renderTemplateUrl(String str, java.util.Map map) {
        com_lynx_tasm_LynxView_com_ss_android_ugc_tiktok_security_lancet_lynx_LynxSecLancet_renderTemplateUrl(this, str, map);
    }

    public void renderTemplateWithBaseUrl(byte[] bArr, TemplateData templateData, String str) {
        com_lynx_tasm_LynxView_com_ss_android_ugc_tiktok_security_lancet_lynx_LynxSecLancet_renderTemplateWithBaseUrl(this, bArr, templateData, str);
    }

    public void renderTemplateWithBaseUrl(byte[] bArr, String str, String str2) {
        com_lynx_tasm_LynxView_com_ss_android_ugc_tiktok_security_lancet_lynx_LynxSecLancet_renderTemplateWithBaseUrl(this, bArr, str, str2);
    }

    public void renderTemplateWithBaseUrl(byte[] bArr, java.util.Map map, String str) {
        com_lynx_tasm_LynxView_com_ss_android_ugc_tiktok_security_lancet_lynx_LynxSecLancet_renderTemplateWithBaseUrl(this, bArr, map, str);
    }

    public static C60540NpQ builder() {
        return new C60540NpQ();
    }

    public boolean enableAirStrictMode() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.LJIIZILJ.getClass();
        }
        return false;
    }

    public boolean enableJSRuntime() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            return Boolean.valueOf(lynxTemplateRender.LJIIZILJ.LJIILIIL).booleanValue();
        }
        return true;
    }

    public HashMap<String, Object> getAllTimingInfo() {
        return this.mLynxTemplateRender.LIZIZ.LJIIIIZZ.LIZLLL();
    }

    public VNZ getBaseInspectorOwner() {
        VNX vnx;
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null && (vnx = lynxTemplateRender.LJJIIJZLJL) != null) {
            return vnx.LIZ;
        }
        return null;
    }

    public long getFirstMeasureTime() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return -1L;
        }
        return lynxTemplateRender.LJJIIJ;
    }

    public VMD getLynxConfigInfo() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return new VMD(new VME());
        }
        TemplateAssembler templateAssembler = lynxTemplateRender.LIZ;
        if (templateAssembler == null) {
            return new VMD(new VME());
        }
        return templateAssembler.LJ();
    }

    public VNU getLynxContext() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            return lynxTemplateRender.mLynxContext;
        }
        return null;
    }

    public C79403VEh getLynxGenericInfo() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            return lynxTemplateRender.LJIILIIL;
        }
        return null;
    }

    public C60740Nse getLynxKryptonHelper() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return null;
        }
        return lynxTemplateRender.LJJIJIIJIL;
    }

    public UIGroup<VOT> getLynxUIRoot() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return null;
        }
        return lynxTemplateRender.LIZIZ.LIZIZ;
    }

    public long getNativePaintingContextPtr() {
        InterfaceC79633VNd interfaceC79633VNd = this.mRenderkitView;
        if (interfaceC79633VNd != null) {
            return interfaceC79633VNd.LLJILJILJ();
        }
        return 0L;
    }

    public String getPageVersion() {
        TemplateAssembler templateAssembler;
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null || (templateAssembler = lynxTemplateRender.LIZ) == null) {
            return "";
        }
        VNQ vnq = templateAssembler.LJIIZILJ;
        if (vnq == null) {
            LLog.LIZLLL(4, "TemplateAssembler", "PageConfig is null.GetPageVersion get default error;");
            return "error";
        }
        return vnq.LIZLLL;
    }

    public String getTemplateUrl() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return null;
        }
        return lynxTemplateRender.LJIIIIZZ();
    }

    public VNG getTheme() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return null;
        }
        return lynxTemplateRender.LJJIFFI;
    }

    public EnumC59959Ng3 getThreadStrategyForRendering() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return null;
        }
        return lynxTemplateRender.LJIIL;
    }

    public void pauseRootLayoutAnimation() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return;
        }
        lynxTemplateRender.LIZIZ.LJIIL = false;
    }

    public void reloadAndInit() {
        if (C39942Fly.LIZJ.booleanValue()) {
            requestLayout();
            invalidate();
        } else {
            removeAllViews();
        }
    }

    public void resumeRootLayoutAnimation() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return;
        }
        lynxTemplateRender.LIZIZ.LJIIL = true;
    }

    public void startLynxRuntime() {
        TemplateAssembler templateAssembler;
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null && (templateAssembler = lynxTemplateRender.LIZ) != null) {
            lynxTemplateRender.LJIIZILJ.LJIIL = false;
            templateAssembler.LJJIJIL();
        }
    }

    public void syncFlush() {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            if (C79411VEp.LIZ()) {
                if (lynxTemplateRender.LJJ && lynxTemplateRender.LJJI != null) {
                    LLog.LIZLLL(2, "LynxTemplateRender", "syncFlush wait layout finish");
                    TemplateAssembler templateAssembler = lynxTemplateRender.LIZ;
                    if (templateAssembler != null) {
                        templateAssembler.LIZIZ();
                        return;
                    }
                    return;
                }
                return;
            }
            throw new AssertionError("Expected to run on UI thread!");
        }
    }

    public boolean takeScreenshot() {
        InterfaceC79633VNd interfaceC79633VNd = this.mRenderkitView;
        if (interfaceC79633VNd == null || interfaceC79633VNd.LIZ() == EnumC63958P8g.SYNC) {
            return false;
        }
        this.mRenderkitView.LLJILLL();
        return true;
    }

    public void triggerTrailReport() {
        Object obj;
        Object obj2;
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return;
        }
        lynxTemplateRender.getClass();
        try {
            JSONObject jSONObject = new JSONObject();
            VNQ vnq = lynxTemplateRender.LIZ.LJIIZILJ;
            String str = "true";
            if (vnq.LJJJJ) {
                obj = "true";
            } else {
                obj = "false";
            }
            jSONObject.putOpt("page_flatten", obj);
            jSONObject.putOpt("target_sdk_version", vnq.LJIILIIL);
            jSONObject.putOpt("radon_mode", vnq.LJIILLIIL);
            if (vnq.LJIILL) {
                obj2 = "true";
            } else {
                obj2 = "false";
            }
            jSONObject.putOpt("enable_lepus_ng", obj2);
            jSONObject.putOpt("react_version", vnq.LJJII);
            if (!vnq.LJJIIZI) {
                str = "false";
            }
            jSONObject.putOpt("enable_css_parser", str);
            jSONObject.putOpt("user", vnq.LJJJJI);
            jSONObject.putOpt("git", vnq.LJJJJIZL);
            jSONObject.putOpt("file_path", vnq.LJJJJJ);
            JSONObject jSONObject2 = new JSONObject(lynxTemplateRender.LIZIZ.LJIIIIZZ.LIZLLL());
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("page_config", jSONObject);
            jSONObject3.put("metric", jSONObject2);
            ((InterfaceC79401VEf) VEZ.LIZIZ().LIZ(InterfaceC79401VEf.class)).reportTrailEvent("lynx_inspector", jSONObject3);
        } catch (JSONException e) {
            LLog.LIZLLL(3, "LynxTemplateRender", "triggerTrailReport report monitor failed");
            C16880lQ.LLLLIIL(e);
        }
    }

    public void destroy() {
        AccessibilityManager accessibilityManager;
        PPQ ppq;
        WeakReference<C79646VNq> weakReference;
        C79646VNq c79646VNq;
        LynxBaseUI value;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("lynxview destroy ");
        LIZ.append(toString());
        LLog.LIZLLL(2, "LynxView", X1D.LIZIZ(LIZ));
        TraceEvent.LIZIZ("DestroyLynxView");
        VPF vpf = this.mKeyboardEvent;
        if (vpf.LIZLLL) {
            vpf.LIZJ();
        }
        if (this.mLynxTemplateRender != null) {
            OCV ocv = C60502Noo.LIZ;
            OCV.LIZ(ocv.LJFF, this);
            OCV.LIZ(ocv.LIZJ, this);
            OCV.LIZ(ocv.LIZIZ, this);
            OCV.LIZ(ocv.LJ, this);
            OCV.LIZ(ocv.LIZLLL, this);
            this.mAttached = false;
            this.mLynxTemplateRender.LJIIIZ();
            LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
            lynxTemplateRender.LJ();
            TraceEvent.LIZIZ("Client.onReportComponentInfo");
            VNV vnv = lynxTemplateRender.LJIILJJIL;
            lynxTemplateRender.LIZIZ.getClass();
            vnv.LJJ(new HashSet());
            TraceEvent.LJ("Client.onReportComponentInfo");
            TemplateData templateData = lynxTemplateRender.LJJII;
            if (templateData != null) {
                templateData.LJII();
                lynxTemplateRender.LJJII = null;
            }
            VOR vor = lynxTemplateRender.LIZIZ;
            for (Map.Entry<Integer, LynxBaseUI> entry : vor.LJI.entrySet()) {
                if ((entry.getValue() instanceof LynxBaseUI) && (value = entry.getValue()) != null) {
                    value.destroy();
                }
            }
            VNU vnu = vor.LIZJ;
            if (vnu != null) {
                VOE voe = vnu.LLFZ;
                if (voe != null) {
                    C79411VEp.LJ(new ARunnableS50S0100000_14(voe, 40));
                }
                if (vnu.LLIIJI && (weakReference = vnu.LJLLILLLL) != null && (c79646VNq = weakReference.get()) != null) {
                    C79411VEp.LJ(new ARunnableS50S0100000_14(c79646VNq, 197));
                }
            }
            lynxTemplateRender.LIZJ = null;
            C47523Ikx c47523Ikx = lynxTemplateRender.mLynxContext.LL;
            if (c47523Ikx != null) {
                ((java.util.Map) c47523Ikx.LIZ).clear();
            }
            lynxTemplateRender.mLynxContext = null;
            C60740Nse c60740Nse = lynxTemplateRender.LJJIJIIJIL;
            if (c60740Nse != null && (ppq = c60740Nse.LIZ) != null) {
                ppq.deInit(lynxTemplateRender);
            }
            LLog.LIZLLL(2, "LynxTemplateRender", lynxTemplateRender.LJII("destroy"));
            this.mLynxTemplateRender = null;
        }
        InterfaceC79633VNd interfaceC79633VNd = this.mRenderkitView;
        if (interfaceC79633VNd != null) {
            interfaceC79633VNd.onDestroy();
            this.mRenderkitView = null;
        }
        VPJ vpj = this.mAccessibilityDelegate;
        if (vpj != null && (accessibilityManager = vpj.LIZ) != null) {
            VFM vfm = vpj.LJIILIIL;
            if (vfm != null) {
                accessibilityManager.removeAccessibilityStateChangeListener(vfm);
            }
            VFN vfn = vpj.LJIILJJIL;
            if (vfn != null) {
                vpj.LIZ.removeTouchExplorationStateChangeListener(vfn);
            }
        }
        TraceEvent.LJ("DestroyLynxView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        VOE voe;
        UIBody uIBody;
        super.onAttachedToWindow();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onAttachedToWindow:");
        LIZ.append(hashCode());
        LLog.LIZLLL(2, "Lynx", X1D.LIZIZ(LIZ));
        this.mAttached = true;
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("lynxview onAttachedToWindow ");
            LIZ2.append(lynxTemplateRender.toString());
            LLog.LIZLLL(2, "LynxTemplateRender", X1D.LIZIZ(LIZ2));
            TraceEvent.LJII("onAttachedToWindow", "#e6ee9c");
            lynxTemplateRender.LJIIJJI(false);
            VOR vor = lynxTemplateRender.LIZIZ;
            if (vor != null && (uIBody = vor.LIZIZ) != null) {
                uIBody.onAttach();
            }
            VNU vnu = lynxTemplateRender.mLynxContext;
            if (vnu != null && (voe = vnu.LLFZ) != null) {
                voe.LJIIIIZZ();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onDetachedFromWindow:");
        LIZ.append(hashCode());
        LLog.LIZLLL(2, "Lynx", X1D.LIZIZ(LIZ));
        this.mAttached = false;
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.LJIIIZ();
        }
        super.onDetachedFromWindow();
    }

    public void onEnterBackground() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onEnterBackground");
        LIZ.append(toString());
        LLog.LIZLLL(2, "LynxView", X1D.LIZIZ(LIZ));
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.LJIIJ(true);
        }
        InterfaceC79633VNd interfaceC79633VNd = this.mRenderkitView;
        if (interfaceC79633VNd != null) {
            interfaceC79633VNd.LLJILJIL();
        }
    }

    public void onEnterForeground() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onEnterForeground ");
        LIZ.append(toString());
        LLog.LIZLLL(2, "LynxView", X1D.LIZIZ(LIZ));
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            lynxTemplateRender.LJIIJJI(true);
        }
        InterfaceC79633VNd interfaceC79633VNd = this.mRenderkitView;
        if (interfaceC79633VNd != null) {
            interfaceC79633VNd.g();
        }
    }

    public VPF getKeyboardEvent() {
        return this.mKeyboardEvent;
    }

    public VNS(Context context) {
        super(context);
        this.mDispatchTouchEventToDev = true;
    }

    public static C60540NpQ builder(Context context) {
        return new C60540NpQ();
    }

    public void addLynxViewClient(LynxViewClient lynxViewClient) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return;
        }
        if (lynxViewClient == null) {
            lynxTemplateRender.getClass();
        } else {
            lynxTemplateRender.LJIILJJIL.LJJIIZI(lynxViewClient);
        }
    }

    @Override // X.VOT, X.VPU
    public void bindDrawChildHook(VOV vov) {
        if (this.mRenderkitView != null) {
            return;
        }
        super.bindDrawChildHook(vov);
    }

    @Override // X.VOT, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        VNU vnu;
        WeakReference<C79646VNq> weakReference;
        C79646VNq c79646VNq;
        super.dispatchDraw(canvas);
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null && (vnu = lynxTemplateRender.mLynxContext) != null) {
            VOE voe = vnu.LLFZ;
            if (voe != null) {
                C79411VEp.LJ(new ARunnableS50S0100000_14(voe, 200));
            }
            if (vnu.LLIIJI && (weakReference = vnu.LJLLILLLL) != null && (c79646VNq = weakReference.get()) != null) {
                C79411VEp.LJ(new ARunnableS50S0100000_14(c79646VNq, 200));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        InterfaceC79633VNd interfaceC79633VNd = this.mRenderkitView;
        if (interfaceC79633VNd != null) {
            return interfaceC79633VNd.LLJJ();
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        VNX vnx;
        InterfaceC79644VNo interfaceC79644VNo;
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("LynxView dispatchTouchEvent, this: ");
            LIZ.append(hashCode());
            LLog.LIZLLL(2, "Lynx", X1D.LIZIZ(LIZ));
        } catch (Throwable th) {
            LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
            if (lynxTemplateRender != null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("An exception occurred during dispatchTouchEvent(): ");
                LIZ2.append(C78886Uxe.LJJ(th));
                lynxTemplateRender.LJIILIIL(1801, X1D.LIZIZ(LIZ2));
            }
        }
        if (this.mLynxTemplateRender == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (C39942Fly.LIZJ.booleanValue()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mCanDispatchTouchEvent = true;
        }
        if (this.mCanDispatchTouchEvent) {
            z = this.mLynxTemplateRender.LJIILL.LJ(motionEvent, null);
            if (z && this.mLynxTemplateRender.LIZIZ(motionEvent) && getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        } else {
            z = false;
        }
        if (action == 1 || action == 3) {
            this.mCanDispatchTouchEvent = false;
        }
        if (z) {
            if (this.mDispatchTouchEventToDev && (vnx = this.mLynxTemplateRender.LJJIIJZLJL) != null && (interfaceC79644VNo = vnx.LIZ) != null) {
                interfaceC79644VNo.LJIILIIL();
            }
            if (this.mLynxTemplateRender.LIZJ(motionEvent)) {
                return true;
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    public LynxBaseUI findUIByIdSelector(String str) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return null;
        }
        return lynxTemplateRender.LIZIZ.LJI(str);
    }

    public LynxBaseUI findUIByIndex(int i) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null) {
            return lynxTemplateRender.LIZIZ.LJI.get(Integer.valueOf(i));
        }
        return null;
    }

    public LynxBaseUI findUIByName(String str) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return null;
        }
        return lynxTemplateRender.LJI(str);
    }

    public View findViewByIdSelector(String str) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return null;
        }
        LynxBaseUI LJI = lynxTemplateRender.LIZIZ.LJI(str);
        if (!(LJI instanceof LynxUI)) {
            return null;
        }
        return ((LynxUI) LJI).mView;
    }

    public View findViewByName(String str) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return null;
        }
        LynxBaseUI LJI = lynxTemplateRender.LJI(str);
        if (!(LJI instanceof LynxUI)) {
            return null;
        }
        return ((LynxUI) LJI).mView;
    }

    public void getCurrentData(VNH vnh) {
        TemplateAssembler templateAssembler;
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return;
        }
        if (!lynxTemplateRender.LJIJJ || (templateAssembler = lynxTemplateRender.LIZ) == null) {
            vnh.onFail();
        } else {
            templateAssembler.LIZJ(vnh);
        }
    }

    public C79639VNj getJSModule(String str) {
        VNU vnu;
        WeakReference<JSProxy> weakReference;
        JSProxy jSProxy;
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null || (vnu = lynxTemplateRender.mLynxContext) == null || (weakReference = vnu.LJLJLJ) == null || (jSProxy = weakReference.get()) == null) {
            return null;
        }
        return new C79639VNj(str, jSProxy);
    }

    public java.util.Map<String, Object> getPageDataByKey(String[] strArr) {
        TemplateAssembler templateAssembler;
        if (strArr == null || strArr.length == 0) {
            LLog.LIZLLL(2, "LynxView", "getPageDataByKey called with empty keys.");
            return null;
        }
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null || !lynxTemplateRender.LJIJJ || (templateAssembler = lynxTemplateRender.LIZ) == null) {
            return null;
        }
        return templateAssembler.LJFF(strArr);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("LynxView onInterceptTouchEvent, this: ");
            LIZ.append(hashCode());
            LLog.LIZLLL(2, "Lynx", X1D.LIZIZ(LIZ));
            LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
            if (lynxTemplateRender != null && this.mCanDispatchTouchEvent) {
                lynxTemplateRender.getClass();
            }
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Throwable th) {
            LynxTemplateRender lynxTemplateRender2 = this.mLynxTemplateRender;
            if (lynxTemplateRender2 != null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("An exception occurred during onInterceptTouchEvent(): ");
                LIZ2.append(C78886Uxe.LJJ(th));
                lynxTemplateRender2.LJIILIIL(1801, X1D.LIZIZ(LIZ2));
                return false;
            }
            return false;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("LynxView onTouchEvent, this: ");
            LIZ.append(hashCode());
            LLog.LIZLLL(2, "Lynx", X1D.LIZIZ(LIZ));
            LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
            if (lynxTemplateRender != null && this.mCanDispatchTouchEvent) {
                lynxTemplateRender.getClass();
            }
            if (!this.mLynxTemplateRender.LIZIZ(motionEvent) || getParent() == null) {
                super.onTouchEvent(motionEvent);
                return true;
            }
            return true;
        } catch (Throwable th) {
            LynxTemplateRender lynxTemplateRender2 = this.mLynxTemplateRender;
            if (lynxTemplateRender2 != null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("An exception occurred during onTouchEvent(): ");
                LIZ2.append(C78886Uxe.LJJ(th));
                lynxTemplateRender2.LJIILIIL(1801, X1D.LIZIZ(LIZ2));
                return false;
            }
            return false;
        }
    }

    public void preloadDynamicComponents(String[] strArr) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("preload dynamic components: ");
        C13870gZ.LIZJ(LIZ, TextUtils.join(", ", strArr), LIZ, 2, "LynxView");
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null || strArr == null || strArr.length == 0) {
            return;
        }
        lynxTemplateRender.LIZ.LJIJ(strArr);
    }

    public void reloadTemplate(TemplateData templateData) {
        reloadTemplate(templateData, null);
    }

    public void removeLynxViewClient(LynxViewClient lynxViewClient) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return;
        }
        if (lynxViewClient == null) {
            lynxTemplateRender.getClass();
            return;
        }
        VNV vnv = lynxTemplateRender.LJIILJJIL;
        if (vnv == null) {
            return;
        }
        vnv.LIZ.remove(lynxViewClient);
    }

    public void resetData(TemplateData templateData) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("resetData with json in ");
        LIZ.append(templateData.toString());
        LLog.LIZLLL(2, "LynxView", X1D.LIZIZ(LIZ));
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return;
        }
        if (lynxTemplateRender.LJIILL(templateData)) {
            lynxTemplateRender.LIZ.LJJIFFI(templateData);
        }
        LLog.LIZLLL(2, "LynxTemplateRender", lynxTemplateRender.LJII("reset"));
    }

    public void runOnTasmThread(Runnable runnable) {
        TemplateAssembler templateAssembler;
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null || (templateAssembler = lynxTemplateRender.LIZ) == null) {
            return;
        }
        templateAssembler.LJJII(runnable);
    }

    public void setAsyncImageInterceptor(InterfaceC79290V9y interfaceC79290V9y) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return;
        }
        lynxTemplateRender.mLynxContext.LJLILLLLZI = interfaceC79290V9y;
    }

    public void setExtraTiming(java.util.Map<String, Long> map) {
        if (map == null) {
            return;
        }
        C79598VLu c79598VLu = new C79598VLu();
        if (map.containsKey("open_time")) {
            c79598VLu.LIZ = map.get("open_time").longValue();
        }
        if (map.containsKey("container_init_start")) {
            c79598VLu.LIZIZ = map.get("container_init_start").longValue();
        }
        if (map.containsKey("container_init_end")) {
            c79598VLu.LIZJ = map.get("container_init_end").longValue();
        }
        if (map.containsKey("prepare_template_start")) {
            c79598VLu.LIZLLL = map.get("prepare_template_start").longValue();
        }
        if (map.containsKey("prepare_template_end")) {
            c79598VLu.LJ = map.get("prepare_template_end").longValue();
        }
        C79600VLw c79600VLw = this.mLynxTemplateRender.LIZIZ.LJIIIIZZ;
        c79600VLw.getClass();
        C79411VEp.LJ(new ARunnableS33S0200000_14(c79600VLw, c79598VLu, 20));
    }

    public void setGlobalProps(java.util.Map<String, Object> map) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return;
        }
        lynxTemplateRender.LJJIFFI(TemplateData.LJ(map));
    }

    public void setImageInterceptor(InterfaceC79290V9y interfaceC79290V9y) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return;
        }
        lynxTemplateRender.mLynxContext.LJLIL = interfaceC79290V9y;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        boolean z;
        if (onClickListener == null) {
            z = true;
        } else {
            z = false;
        }
        setFocusableInTouchMode(z);
        super.setOnClickListener(onClickListener);
    }

    public void setTheme(VNG vng) {
        TemplateAssembler templateAssembler;
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null || vng == null) {
            return;
        }
        VNG vng2 = lynxTemplateRender.LJJIFFI;
        if (vng2 == null) {
            lynxTemplateRender.LJJIFFI = vng;
        } else {
            vng2.LIZ = vng.LIZ;
        }
        if (!lynxTemplateRender.LJIJJ || (templateAssembler = lynxTemplateRender.LIZ) == null) {
            return;
        }
        templateAssembler.LJJIJIIJIL(vng);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setVisibility:");
        LIZ.append(hashCode());
        LIZ.append(" ");
        LIZ.append(i);
        LLog.LIZLLL(2, "Lynx", X1D.LIZIZ(LIZ));
    }

    public void updateData(TemplateData templateData) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateData with data in ");
        LIZ.append(templateData.toString());
        LLog.LIZLLL(2, "LynxView", X1D.LIZIZ(LIZ));
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender != null && lynxTemplateRender.LJIILL(templateData)) {
            lynxTemplateRender.LIZ.LJJJ(templateData);
        }
    }

    public void updateFontScacle(float f) {
        TemplateAssembler templateAssembler;
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null || !lynxTemplateRender.LJIJJ || (templateAssembler = lynxTemplateRender.LIZ) == null) {
            return;
        }
        templateAssembler.LJJJI(f);
    }

    public void updateGlobalProps(TemplateData templateData) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return;
        }
        lynxTemplateRender.LJJIFFI(templateData);
    }

    public void setExtraTiming(C79598VLu c79598VLu) {
        if (c79598VLu == null) {
            return;
        }
        C79600VLw c79600VLw = this.mLynxTemplateRender.LIZIZ.LJIIIIZZ;
        c79600VLw.getClass();
        C79411VEp.LJ(new ARunnableS33S0200000_14(c79600VLw, c79598VLu, 20));
    }

    public void setGlobalProps(TemplateData templateData) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return;
        }
        lynxTemplateRender.LJJIFFI(templateData);
    }

    public void setTheme(ByteBuffer byteBuffer) {
        TemplateAssembler templateAssembler;
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null || byteBuffer == null || !lynxTemplateRender.LJIJJ || (templateAssembler = lynxTemplateRender.LIZ) == null) {
            return;
        }
        templateAssembler.LJJIJIIJI(byteBuffer);
    }

    public void updateData(String str) {
        updateData(str, (String) null);
    }

    public void updateGlobalProps(java.util.Map<String, Object> map) {
        updateGlobalProps(TemplateData.LJ(map));
    }

    public void updateData(java.util.Map<String, Object> map) {
        updateData(map, (String) null);
    }

    public VNS(Context context, C60540NpQ c60540NpQ) {
        super(context);
        this.mDispatchTouchEventToDev = true;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("new lynxview  ");
        LIZ.append(toString());
        LLog.LIZLLL(2, "LynxView", X1D.LIZIZ(LIZ));
        if (C39942Fly.LIZJ.booleanValue()) {
            try {
                Constructor<?> constructor = Class.forName("com.lynx.tasm.RenderkitViewDelegateImpl").getConstructor(VNS.class, Context.class, EnumC63958P8g.class, Object.class);
                EnumC63958P8g enumC63958P8g = EnumC63958P8g.SURFACE;
                c60540NpQ.getClass();
                Class<?> cls = Class.forName("io.flutter.embedding.engine.renderkit.utils.MemoryCacheOptions");
                Class<?> cls2 = Integer.TYPE;
                this.mRenderkitView = (InterfaceC79633VNd) constructor.newInstance(this, context, enumC63958P8g, cls.getConstructor(cls2, cls2).newInstance(0, 0));
                EnumC59959Ng3 enumC59959Ng3 = c60540NpQ.LJIILLIIL;
                if (enumC59959Ng3 == EnumC59959Ng3.MULTI_THREADS || enumC59959Ng3 == EnumC59959Ng3.PART_ON_LAYOUT) {
                    LLog.LIZLLL(4, "LynxView", "Renderkit dont support MULTI_THREADS and PART_ON_LAYOUT currently，change to ALL_ON_UI");
                    c60540NpQ.LJIILLIIL = EnumC59959Ng3.ALL_ON_UI;
                }
            } catch (Exception e) {
                LLog.LIZLLL(4, "LynxView", "Could not init renderkit view");
                throw new RuntimeException(C1DD.LJ("Fatal: init renderkit view error: ", e));
            }
        }
        initialize(context, c60540NpQ);
    }

    public void com_lynx_tasm_LynxView__renderTemplateUrl$___twin___(String str, String str2) {
        StringBuilder LIZIZ = C25620zW.LIZIZ("renderTemplateUrl ", str, "with jsonData in");
        LIZIZ.append(toString());
        LLog.LIZLLL(2, "LynxView", X1D.LIZIZ(LIZIZ));
        this.mUrl = str;
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return;
        }
        lynxTemplateRender.getClass();
        lynxTemplateRender.LJJ(str, new VNW(lynxTemplateRender, str, str2));
    }

    public void hotModuleReplace(JSONObject jSONObject, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("hotModuleReplace, message is ");
        LIZ.append(str);
        LLog.LIZLLL(2, "LynxView", X1D.LIZIZ(LIZ));
    }

    public void initialize(Context context, C60540NpQ c60540NpQ) {
        setFocusableInTouchMode(true);
        VSyncMonitor.LIZ = new WeakReference<>(C16880lQ.LLILL(context, "window"));
        if (VSyncMonitor.LIZIZ == null) {
            C79411VEp.LJ(new ARunnableS15S0000000_8(1));
        }
        this.mLynxTemplateRender = new LynxTemplateRender(context, this, c60540NpQ);
        this.mKeyboardEvent = new VPF(getLynxContext());
    }

    public void innerSetMeasuredDimension(int i, int i2) {
        setMeasuredDimension(i, i2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        long j;
        int width;
        int height;
        TemplateAssembler templateAssembler;
        VNQ vnq;
        TemplateAssembler templateAssembler2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onMeasure:");
        LIZ.append(hashCode());
        LIZ.append(", width");
        LIZ.append(View.MeasureSpec.toString(i));
        LIZ.append(", height");
        LIZ.append(View.MeasureSpec.toString(i2));
        LLog.LIZLLL(2, "Lynx", X1D.LIZIZ(LIZ));
        if (this.mLynxTemplateRender == null) {
            super.onMeasure(i, i2);
            return;
        }
        if (C39942Fly.LIZJ.booleanValue()) {
            super.onMeasure(i, i2);
        }
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender.LJJIIJ == -1) {
            j = System.currentTimeMillis();
        } else {
            j = 0;
        }
        TraceEvent.LIZ(1L, "Platform.onMeasure");
        lynxTemplateRender.LJIIZILJ.getClass();
        lynxTemplateRender.LJJII(i, i2);
        if (lynxTemplateRender.LJIIL == EnumC59959Ng3.PART_ON_LAYOUT && (templateAssembler2 = lynxTemplateRender.LIZ) != null && lynxTemplateRender.LJIJJLI) {
            templateAssembler2.LJJIJL();
            lynxTemplateRender.LJIJJLI = false;
        }
        C79359VCp c79359VCp = lynxTemplateRender.LJ;
        if (c79359VCp != null) {
            Runnable runnable = (Runnable) c79359VCp.LIZIZ;
            if (runnable != null) {
                runnable.run();
            }
            c79359VCp.LIZIZ = null;
        }
        if (lynxTemplateRender.LJJIJIL && (templateAssembler = lynxTemplateRender.LIZ) != null && (vnq = templateAssembler.LJIIZILJ) != null && vnq.LJIJI) {
            lynxTemplateRender.LIZ.LIZIZ();
            lynxTemplateRender.LJIJJLI = false;
        }
        lynxTemplateRender.LIZIZ.LIZIZ.measureChildren();
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            width = lynxTemplateRender.LIZIZ.LIZIZ.getWidth();
        } else {
            width = View.MeasureSpec.getSize(i);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            height = lynxTemplateRender.LIZIZ.LIZIZ.getHeight();
        } else {
            height = View.MeasureSpec.getSize(i2);
        }
        VNS vns = lynxTemplateRender.LJIL;
        if (vns != null) {
            vns.innerSetMeasuredDimension(width, height);
        }
        TraceEvent.LIZLLL(1L, "Platform.onMeasure");
        if (lynxTemplateRender.LJJIIJ == -1) {
            lynxTemplateRender.LJJIIJ = System.currentTimeMillis() - j;
        }
    }

    public void reloadTemplate(TemplateData templateData, TemplateData templateData2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("reloadTemplate with data: ");
        LIZ.append(String.valueOf(templateData));
        LIZ.append(", with globalProps:");
        LIZ.append(String.valueOf(templateData2));
        LLog.LIZLLL(2, "LynxView", X1D.LIZIZ(LIZ));
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return;
        }
        lynxTemplateRender.getClass();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("reloadTemplate with url: ");
        LIZ2.append(lynxTemplateRender.LJIIIIZZ());
        LLog.LIZLLL(1, "LynxTemplateRender", X1D.LIZIZ(LIZ2));
        if (lynxTemplateRender.LJIILL(templateData)) {
            if (templateData2 != null) {
                lynxTemplateRender.LJJII = templateData2;
            }
            lynxTemplateRender.LIZ.LJIL(templateData, templateData2);
        }
        LLog.LIZLLL(2, "LynxTemplateRender", lynxTemplateRender.LJII("reload"));
    }

    public void renderSSRUrl(String str, java.util.Map<String, Object> map) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("renderSSRUrl ");
        LIZ.append(str);
        LLog.LIZLLL(1, "LynxView", X1D.LIZIZ(LIZ));
        this.mUrl = str;
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return;
        }
        lynxTemplateRender.LJJ(str, new VNW(lynxTemplateRender, str, map, 0));
    }

    public void renderTemplate(byte[] bArr, TemplateData templateData) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("renderTemplate with templateData in ");
        LIZ.append(toString());
        LLog.LIZLLL(2, "LynxView", X1D.LIZIZ(LIZ));
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return;
        }
        lynxTemplateRender.LJIJJ(bArr, templateData);
    }

    public void renderTemplateUrl(String str, TemplateData templateData) {
        StringBuilder LIZIZ = C25620zW.LIZIZ("renderTemplateUrl ", str, "with templatedata in");
        LIZIZ.append(toString());
        LLog.LIZLLL(2, "LynxView", X1D.LIZIZ(LIZIZ));
        this.mUrl = str;
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return;
        }
        lynxTemplateRender.LJJ(str, new VNW(lynxTemplateRender, str, templateData));
    }

    public void sendGlobalEvent(String str, JavaOnlyArray javaOnlyArray) {
        VNU vnu;
        EnumC79630VNa enumC79630VNa;
        TemplateAssembler templateAssembler;
        if (this.mLynxTemplateRender == null) {
            return;
        }
        if (enableAirStrictMode()) {
            sendGlobalEventToLepus(str, javaOnlyArray);
            return;
        }
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        C79636VNg c79636VNg = lynxTemplateRender.LJIIIZ;
        if (c79636VNg != null && ((enumC79630VNa = c79636VNg.LIZ) == EnumC79630VNa.PENDING || enumC79630VNa == EnumC79630VNa.BEGINNING || enumC79630VNa == EnumC79630VNa.FAILED)) {
            if (lynxTemplateRender.LJIJJ && (templateAssembler = lynxTemplateRender.LIZ) != null) {
                templateAssembler.LJJIIJZLJL(str, javaOnlyArray);
            }
            lynxTemplateRender.LJIIIZ.getClass();
            if (javaOnlyArray == null) {
                javaOnlyArray = new JavaOnlyArray();
            }
            javaOnlyArray.pushString("from_ssr_cache");
        }
        if (lynxTemplateRender.LJIJJ && (vnu = lynxTemplateRender.mLynxContext) != null) {
            vnu.LJIIJJI(str, javaOnlyArray);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sendGlobalEvent error, can't get GlobalEventEmitter in ");
        LIZ.append(lynxTemplateRender.toString());
        LLog.LIZLLL(4, "LynxTemplateRender", X1D.LIZIZ(LIZ));
    }

    public void sendGlobalEventToLepus(String str, List<Object> list) {
        TemplateAssembler templateAssembler;
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return;
        }
        if (lynxTemplateRender.LJIJJ && (templateAssembler = lynxTemplateRender.LIZ) != null) {
            templateAssembler.LJJIII(str, list);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sendGlobalEventToLepus error, Env not prepared or mTemplateAssembler is null in ");
        LIZ.append(lynxTemplateRender.toString());
        LLog.LIZLLL(4, "LynxTemplateRender", X1D.LIZIZ(LIZ));
    }

    public void ssrHydrateUrl(String str, java.util.Map<String, Object> map) {
        if (map != null) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("ssrHydrateUrl  ", str, " with data in ");
            LIZIZ.append(map.toString());
            LLog.LIZLLL(1, "LynxView", X1D.LIZIZ(LIZIZ));
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ssrHydrateUrl  ");
            LIZ.append(str);
            LLog.LIZLLL(1, "LynxView", X1D.LIZIZ(LIZ));
        }
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return;
        }
        lynxTemplateRender.LIZ();
        lynxTemplateRender.LJJ(str, new VNW(lynxTemplateRender, str, map));
    }

    public void triggerEventBus(String str, List<Object> list) {
        TemplateAssembler templateAssembler;
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return;
        }
        if (lynxTemplateRender.LJIJJ && (templateAssembler = lynxTemplateRender.LIZ) != null) {
            templateAssembler.LJJIJLIJ(str, list);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("triggerEventBus error, Env not prepared or mTemplateAssembler is null in ");
        LIZ.append(lynxTemplateRender.toString());
        LLog.LIZLLL(4, "LynxTemplateRender", X1D.LIZIZ(LIZ));
    }

    public void updateData(String str, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateData with json in ");
        LIZ.append(toString());
        LLog.LIZLLL(2, "LynxView", X1D.LIZIZ(LIZ));
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return;
        }
        TemplateData LJFF = TemplateData.LJFF(str);
        LJFF.LIZLLL = str2;
        LJFF.LJFF = true;
        if (lynxTemplateRender.LJIILL(LJFF)) {
            lynxTemplateRender.LIZ.LJJJ(LJFF);
        }
    }

    public void updateScreenMetrics(int i, int i2) {
        VNU vnu;
        InterfaceC79644VNo interfaceC79644VNo;
        if (this.mLynxTemplateRender == null) {
            return;
        }
        DisplayMetricsHolder.LJ(i, i2);
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        TemplateAssembler templateAssembler = lynxTemplateRender.LIZ;
        if (templateAssembler == null || (vnu = lynxTemplateRender.mLynxContext) == null) {
            return;
        }
        DisplayMetrics displayMetrics = vnu.LJLZ;
        if (i == displayMetrics.widthPixels && i2 == displayMetrics.heightPixels) {
            return;
        }
        lynxTemplateRender.LJJIJ = true;
        displayMetrics.widthPixels = i;
        displayMetrics.heightPixels = i2;
        templateAssembler.LJJJJ(i, i2);
        VNX vnx = lynxTemplateRender.LJJIIJZLJL;
        if (vnx == null || (interfaceC79644VNo = vnx.LIZ) == null) {
            return;
        }
        interfaceC79644VNo.LJIIL();
    }

    public void updateViewport(int i, int i2) {
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return;
        }
        lynxTemplateRender.LJJII(i, i2);
    }

    public VNS(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mDispatchTouchEventToDev = true;
    }

    public void com_lynx_tasm_LynxView__renderTemplateUrl$___twin___(String str, java.util.Map<String, Object> map) {
        StringBuilder LIZIZ = C25620zW.LIZIZ("renderTemplateUrl ", str, "with Map in");
        LIZIZ.append(toString());
        LLog.LIZLLL(2, "LynxView", X1D.LIZIZ(LIZIZ));
        this.mUrl = str;
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return;
        }
        lynxTemplateRender.LJJ(str, new VNW(lynxTemplateRender, str, map));
    }

    public void renderTemplate(byte[] bArr, java.util.Map<String, Object> map) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("renderTemplate with initdata in ");
        LIZ.append(toString());
        LLog.LIZLLL(2, "LynxView", X1D.LIZIZ(LIZ));
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return;
        }
        lynxTemplateRender.LJIJJLI(bArr, map);
    }

    public void ssrHydrateUrl(String str, TemplateData templateData) {
        StringBuilder LIZIZ = C25620zW.LIZIZ("ssrHydrateUrl  ", str, " with data in ");
        LIZIZ.append(templateData.toString());
        LLog.LIZLLL(1, "LynxView", X1D.LIZIZ(LIZIZ));
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return;
        }
        lynxTemplateRender.LIZ();
        lynxTemplateRender.LJJ(str, new VNW(lynxTemplateRender, str, templateData));
    }

    public void updateData(java.util.Map<String, Object> map, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateData with map in ");
        LIZ.append(toString());
        LLog.LIZLLL(2, "LynxView", X1D.LIZIZ(LIZ));
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return;
        }
        lynxTemplateRender.updateData(map, str);
    }

    public static void com_lynx_tasm_LynxView_com_ss_android_ugc_tiktok_security_lancet_lynx_LynxSecLancet_renderTemplateUrl(VNS vns, String str, String str2) {
        if (((Boolean) C37037EgD.LIZ.LIZ(vns, str).getSecond()).booleanValue()) {
            vns.com_lynx_tasm_LynxView__renderTemplateUrl$___twin___(str, str2);
        }
    }

    public void com_lynx_tasm_LynxView__renderTemplateWithBaseUrl$___twin___(byte[] bArr, String str, String str2) {
        StringBuilder LIZIZ = C25620zW.LIZIZ("renderTemplateWithBaseUrl ", str2, "with stringdata in");
        LIZIZ.append(toString());
        LLog.LIZLLL(2, "LynxView", X1D.LIZIZ(LIZIZ));
        this.mUrl = str2;
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return;
        }
        TemplateData LJFF = TemplateData.LJFF(str);
        VNX vnx = lynxTemplateRender.LJJIIJZLJL;
        if (vnx != null) {
            vnx.LIZ(LJFF);
        }
        lynxTemplateRender.LJJI(str2);
        lynxTemplateRender.LJIJJ(bArr, LJFF);
    }

    public void renderSSR(byte[] bArr, String str, java.util.Map<String, Object> map) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("renderSSR ");
        LIZ.append(str);
        LLog.LIZLLL(1, "LynxView", X1D.LIZIZ(LIZ));
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return;
        }
        lynxTemplateRender.LJIJ(bArr, str, map);
    }

    public void renderTemplateBundle(TemplateBundle templateBundle, TemplateData templateData, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("renderTemplateBundle with templateData in ");
        LIZ.append(toString());
        LLog.LIZLLL(2, "LynxView", X1D.LIZIZ(LIZ));
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return;
        }
        lynxTemplateRender.LJIL(templateBundle, templateData, str);
    }

    public void ssrHydrate(byte[] bArr, String str, java.util.Map<String, Object> map) {
        StringBuilder LIZIZ = C25620zW.LIZIZ("ssrHydrate ", str, " with data in ");
        LIZIZ.append(map.toString());
        LLog.LIZLLL(1, "LynxView", X1D.LIZIZ(LIZIZ));
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return;
        }
        lynxTemplateRender.LIZ();
        TemplateData LJ = TemplateData.LJ(map);
        VNX vnx = lynxTemplateRender.LJJIIJZLJL;
        if (vnx != null) {
            vnx.LIZ(LJ);
        }
        lynxTemplateRender.LJJI(str);
        lynxTemplateRender.LJIJJ(bArr, LJ);
    }

    public static void com_lynx_tasm_LynxView_com_ss_android_ugc_tiktok_security_lancet_lynx_LynxSecLancet_renderTemplateUrl(VNS vns, String str, java.util.Map map) {
        if (((Boolean) C37037EgD.LIZ.LIZ(vns, str).getSecond()).booleanValue()) {
            vns.com_lynx_tasm_LynxView__renderTemplateUrl$___twin___(str, (java.util.Map<String, Object>) map);
        }
    }

    public void com_lynx_tasm_LynxView__renderTemplateWithBaseUrl$___twin___(byte[] bArr, java.util.Map<String, Object> map, String str) {
        StringBuilder LIZIZ = C25620zW.LIZIZ("renderTemplateWithBaseUrl ", str, "with map in ");
        LIZIZ.append(toString());
        LLog.LIZLLL(2, "LynxView", X1D.LIZIZ(LIZIZ));
        this.mUrl = str;
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return;
        }
        TemplateData LJ = TemplateData.LJ(map);
        VNX vnx = lynxTemplateRender.LJJIIJZLJL;
        if (vnx != null) {
            vnx.LIZ(LJ);
        }
        lynxTemplateRender.LJJI(str);
        lynxTemplateRender.LJIJJ(bArr, LJ);
    }

    public void ssrHydrate(byte[] bArr, String str, TemplateData templateData) {
        StringBuilder LIZIZ = C25620zW.LIZIZ("ssrHydrate ", str, " with data in ");
        LIZIZ.append(templateData.toString());
        LLog.LIZLLL(1, "LynxView", X1D.LIZIZ(LIZIZ));
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return;
        }
        lynxTemplateRender.LIZ();
        VNX vnx = lynxTemplateRender.LJJIIJZLJL;
        if (vnx != null) {
            vnx.LIZ(templateData);
        }
        lynxTemplateRender.LJJI(str);
        lynxTemplateRender.LJIJJ(bArr, templateData);
    }

    public void com_lynx_tasm_LynxView__renderTemplateWithBaseUrl$___twin___(byte[] bArr, TemplateData templateData, String str) {
        StringBuilder LIZIZ = C25620zW.LIZIZ("renderTemplateWithBaseUrl ", str, "with templateData in ");
        LIZIZ.append(toString());
        LLog.LIZLLL(2, "LynxView", X1D.LIZIZ(LIZIZ));
        this.mUrl = str;
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        if (lynxTemplateRender == null) {
            return;
        }
        VNX vnx = lynxTemplateRender.LJJIIJZLJL;
        if (vnx != null) {
            vnx.LIZ(templateData);
        }
        lynxTemplateRender.LJJI(str);
        lynxTemplateRender.LJIJJ(bArr, templateData);
    }

    public static void com_lynx_tasm_LynxView_com_ss_android_ugc_tiktok_security_lancet_lynx_LynxSecLancet_renderTemplateWithBaseUrl(VNS vns, byte[] bArr, TemplateData templateData, String str) {
        if (((Boolean) C37037EgD.LIZ.LIZ(vns, str).getSecond()).booleanValue()) {
            vns.com_lynx_tasm_LynxView__renderTemplateWithBaseUrl$___twin___(bArr, templateData, str);
        }
    }

    public static void com_lynx_tasm_LynxView_com_ss_android_ugc_tiktok_security_lancet_lynx_LynxSecLancet_renderTemplateWithBaseUrl(VNS vns, byte[] bArr, String str, String str2) {
        if (((Boolean) C37037EgD.LIZ.LIZ(vns, str2).getSecond()).booleanValue()) {
            vns.com_lynx_tasm_LynxView__renderTemplateWithBaseUrl$___twin___(bArr, str, str2);
        }
    }

    public static void com_lynx_tasm_LynxView_com_ss_android_ugc_tiktok_security_lancet_lynx_LynxSecLancet_renderTemplateWithBaseUrl(VNS vns, byte[] bArr, java.util.Map map, String str) {
        if (((Boolean) C37037EgD.LIZ.LIZ(vns, str).getSecond()).booleanValue()) {
            vns.com_lynx_tasm_LynxView__renderTemplateWithBaseUrl$___twin___(bArr, (java.util.Map<String, Object>) map, str);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.mLynxTemplateRender == null) {
            return;
        }
        if (C39942Fly.LIZJ.booleanValue()) {
            super.onLayout(z, i, i2, i3, i4);
        }
        LynxTemplateRender lynxTemplateRender = this.mLynxTemplateRender;
        lynxTemplateRender.getClass();
        TraceEvent.LIZ(1L, "Platform.onLayout");
        VOR vor = lynxTemplateRender.LIZIZ;
        vor.LIZIZ.layoutChildren();
        VNL vnl = vor.LIZIZ.mContext.LJLJJL;
        if (vnl != null) {
            ARunnableS25S0300000_14 aRunnableS25S0300000_14 = new ARunnableS25S0300000_14(vnl, VJ4.kLynxEventTypeLayoutEvent, null, 2);
            if (C16880lQ.LLJJJJ() == Looper.myLooper()) {
                aRunnableS25S0300000_14.run();
            } else {
                vnl.LIZJ.post(aRunnableS25S0300000_14);
            }
        }
        Iterator<LynxBaseUI> it = vor.LJII.iterator();
        while (it.hasNext()) {
            it.next().uiOwnerDidPerformLayout();
        }
        vor.LJII.clear();
        TraceEvent.LIZLLL(1L, "Platform.onLayout");
        if (z && getLynxContext() != null && getLynxContext().LLI) {
            VPF vpf = this.mKeyboardEvent;
            if (vpf.LIZLLL) {
                C64493PSv.LIZ().execute(new ARunnableS50S0100000_14(vpf, 195));
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLayout:");
        LIZ.append(hashCode());
        LIZ.append(i);
        LIZ.append(" ");
        C15890jp.LIZIZ(LIZ, i2, " ", i3, " ");
        LIZ.append(i4);
        LLog.LIZLLL(2, "Lynx", X1D.LIZIZ(LIZ));
    }
}
