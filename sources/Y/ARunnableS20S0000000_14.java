package Y;

import X.AbstractC79673VOr;
import X.AbstractC79742VRi;
import X.C16880lQ;
import X.C38376F4i;
import X.C38379F4l;
import X.C39941Flx;
import X.C40017FnB;
import X.C58667N0t;
import X.C60540NpQ;
import X.C60682Nri;
import X.C61590OFe;
import X.C74069T5d;
import X.C79346VCc;
import X.C79347VCd;
import X.C79359VCp;
import X.C79411VEp;
import X.C79526VJa;
import X.C79527VJb;
import X.C79631VNb;
import X.C79651VNv;
import X.C79653VNx;
import X.C79654VNy;
import X.C79655VNz;
import X.C79656VOa;
import X.C79657VOb;
import X.C79658VOc;
import X.C79659VOd;
import X.C79660VOe;
import X.C79661VOf;
import X.C79662VOg;
import X.C79663VOh;
import X.C79665VOj;
import X.C79666VOk;
import X.C79669VOn;
import X.C79670VOo;
import X.C79672VOq;
import X.C79675VOt;
import X.C79676VOu;
import X.C79697VPp;
import X.C79699VPr;
import X.C79708VQa;
import X.C79713VQf;
import X.C79714VQg;
import X.C79715VQh;
import X.C79716VQi;
import X.C79722VQo;
import X.C79723VQp;
import X.C79727VQt;
import X.C79743VRj;
import X.C79744VRk;
import X.C79746VRm;
import X.C79747VRn;
import X.C79753VRt;
import X.C79756VRw;
import X.C79829VUr;
import X.EWH;
import X.EnumC59959Ng3;
import X.EnumC79692VPk;
import X.EnumC79725VQr;
import X.F4Z;
import X.F5B;
import X.HandlerC39977FmX;
import X.HandlerThreadC79757VRx;
import X.InterfaceC37728ErM;
import X.InterfaceC38380F4m;
import X.InterfaceC39937Flt;
import X.InterfaceC39940Flw;
import X.InterfaceC39978FmY;
import X.InterfaceC39980Fma;
import X.InterfaceC40021FnF;
import X.InterfaceC40525FvN;
import X.InterfaceC79290V9y;
import X.InterfaceC79637VNh;
import X.InterfaceC79649VNt;
import X.InterfaceC79650VNu;
import X.InterfaceC79652VNw;
import X.InterfaceC79664VOi;
import X.QLB;
import X.V9Y;
import X.VA1;
import X.VDQ;
import X.VEC;
import X.VF1;
import X.VI0;
import X.VI4;
import X.VJJ;
import X.VJZ;
import X.VNA;
import X.VND;
import X.VNG;
import X.VNL;
import X.VNM;
import X.VNN;
import X.VNP;
import X.VNS;
import X.VNT;
import X.VNU;
import X.VNV;
import X.VNX;
import X.VNZ;
import X.VO0;
import X.VO1;
import X.VOL;
import X.VOM;
import X.VON;
import X.VOR;
import X.VOT;
import X.VOV;
import X.VOY;
import X.VOZ;
import X.VPA;
import X.VPD;
import X.VPE;
import X.VPG;
import X.VPH;
import X.VPR;
import X.VPS;
import X.VPU;
import X.VPV;
import X.VQ3;
import X.VQ5;
import X.VQ9;
import X.VQC;
import X.VQD;
import X.VQE;
import X.VQS;
import X.VQZ;
import X.VR1;
import X.VR2;
import X.VRD;
import X.VRK;
import X.VRP;
import X.VRQ;
import X.VRS;
import X.VS2;
import X.VUG;
import X.VUP;
import android.os.Build;
import android.os.SystemClock;
import com.bytedance.otis.optimise.system.render.RenderManager;
import com.bytedance.pitaya.api.PitayaCoreFactory;
import com.bytedance.shadowhook.ShadowHook;
import com.lynx.devtoolwrapper.LynxInspectorManager;
import com.lynx.jsbridge.LynxModule;
import com.lynx.jsbridge.LynxModuleWrapper;
import com.lynx.jsbridge.MethodDescriptor;
import com.lynx.jsbridge.NetworkingModule;
import com.lynx.jsbridge.Promise;
import com.lynx.jsbridge.PromiseImpl;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.react.bridge.ReadableType;
import com.lynx.react.bridge.WritableArray;
import com.lynx.react.bridge.WritableMap;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.LynxViewClient;
import com.lynx.tasm.TemplateAssembler;
import com.lynx.tasm.TemplateData;
import com.lynx.tasm.base.CalledByNative;
import com.lynx.tasm.behavior.LayoutContext;
import com.lynx.tasm.behavior.PaintingContext;
import com.lynx.tasm.behavior.shadow.LayoutNode;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.shadow.text.AbsInlineImageShadowNode;
import com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode;
import com.lynx.tasm.behavior.shadow.text.InlineTextShadowNode;
import com.lynx.tasm.behavior.shadow.text.RawTextShadowNode;
import com.lynx.tasm.behavior.shadow.text.TextShadowNode;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxFlattenUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIBody;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.tasm.behavior.ui.UIShadowProxy;
import com.lynx.tasm.behavior.ui.image.AbsUIImage;
import com.lynx.tasm.behavior.ui.list.UIList;
import com.lynx.tasm.behavior.ui.scroll.UIScrollView;
import com.lynx.tasm.behavior.ui.text.FlattenUIText;
import com.lynx.tasm.behavior.ui.text.UIText;
import com.lynx.tasm.behavior.ui.utils.BackgroundDrawable;
import com.lynx.tasm.behavior.ui.view.UIComponent;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.lynx.tasm.behavior.ui.view.UIView;
import com.lynx.tasm.behavior.utils.LynxUISetter;
import com.lynx.tasm.behavior.utils.PropsUpdater;
import com.lynx.tasm.behavior.utils.Settable;
import com.lynx.tasm.behavior.utils.ShadowNodeSetter;
import com.lynx.tasm.core.JSProxy;
import com.lynx.tasm.core.ResourceLoader;
import com.lynx.tasm.utils.ColorUtils;
import com.lynx.tasm.utils.DisplayMetricsHolder;
import com.ss.videoarch.strategy.strategy.nodeOptimizer.DnsOptimizer;
import com.ss.videoarch.strategy.utils.smartStrategy.PitayaWrapper;
import com.ttnet.org.chromium.base.ApplicationStatus;

/* loaded from: classes15.dex */
public class ARunnableS20S0000000_14 implements Runnable {
    public final int $t;

    public static final void run$0(ARunnableS20S0000000_14 aRunnableS20S0000000_14) {
    }

    public static final void run$1(ARunnableS20S0000000_14 aRunnableS20S0000000_14) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                VI0.LIZ();
                return;
            default:
                return;
        }
    }

    public static void LIZ$2() {
        RenderManager renderManager = C79526VJa.LIZ;
        int i = Build.VERSION.SDK_INT;
        renderManager.getClass();
        synchronized (RenderManager.class) {
            if (!RenderManager.LIZIZ) {
                C16880lQ.LLJJJIL("otisopt");
                RenderManager.LIZIZ = true;
            }
        }
        if (i <= 33 && !RenderManager.LIZ) {
            RenderManager.LIZ = true;
            C79527VJb c79527VJb = new C79527VJb();
            c79527VJb.LIZ = VJZ.SHARED.value;
            c79527VJb.LIZIZ = false;
            if (ShadowHook.init(c79527VJb.LIZ()) == 0) {
                renderManager.nInit(i);
            }
        }
    }

    public static void LIZ$0() {
        SystemClock.uptimeMillis();
        try {
            Class.forName(C38376F4i.class.getName());
            Class.forName(InterfaceC37728ErM.class.getName());
            Class.forName(EWH.class.getName());
            Class.forName(LynxModule.class.getName());
            Class.forName(LynxModuleWrapper.class.getName());
            Class.forName(MethodDescriptor.class.getName());
            Class.forName(NetworkingModule.class.getName());
            Class.forName(Promise.class.getName());
            Class.forName(InterfaceC39978FmY.class.getName());
            Class.forName(HandlerC39977FmX.class.getName());
            Class.forName(Callback.class.getName());
            Class.forName(F5B.class.getName());
            Class.forName(VO1.class.getName());
            Class.forName(InterfaceC38380F4m.class.getName());
            Class.forName(ReadableArray.class.getName());
            Class.forName(ReadableMap.class.getName());
            Class.forName(ReadableMapKeySetIterator.class.getName());
            Class.forName(ReadableType.class.getName());
            Class.forName(C39941Flx.class.getName());
            Class.forName(VNL.class.getName());
            Class.forName(InterfaceC79650VNu.class.getName());
            Class.forName(InterfaceC39940Flw.class.getName());
            Class.forName(C79655VNz.class.getName());
            Class.forName(LynxEnv.class.getName());
            Class.forName(C60682Nri.class.getName());
            Class.forName(C60540NpQ.class.getName());
            Class.forName(TemplateData.class.getName());
            Class.forName(VND.class.getName());
            Class.forName(EnumC59959Ng3.class.getName());
            Class.forName(C79651VNv.class.getName());
            Class.forName(CalledByNative.class.getName());
            Class.forName(InterfaceC79649VNt.class.getName());
            Class.forName(VON.class.getName());
            Class.forName(InterfaceC39937Flt.class.getName());
            Class.forName(C58667N0t.class.getName());
            Class.forName(VO0.class.getName());
            Class.forName(InterfaceC79290V9y.class.getName());
            Class.forName(VR2.class.getName());
            Class.forName(C79669VOn.class.getName());
            Class.forName(LayoutContext.class.getName());
            Class.forName(VQZ.class.getName());
            Class.forName(C79714VQg.class.getName());
            Class.forName(VPD.class.getName());
            Class.forName(VPE.class.getName());
            Class.forName(VOZ.class.getName());
            Class.forName(VOR.class.getName());
            Class.forName(PaintingContext.class.getName());
            Class.forName(C79657VOb.class.getName());
            Class.forName(VOM.class.getName());
            Class.forName(VPA.class.getName());
            Class.forName(VPV.class.getName());
            Class.forName(LayoutNode.class.getName());
            Class.forName(VDQ.class.getName());
            Class.forName(InterfaceC79664VOi.class.getName());
            Class.forName(EnumC79692VPk.class.getName());
            Class.forName(C79697VPp.class.getName());
            Class.forName(VQC.class.getName());
            Class.forName(C79658VOc.class.getName());
            Class.forName(QLB.class.getName());
            Class.forName(C74069T5d.class.getName());
            Class.forName(C79747VRn.class.getName());
            Class.forName(C79659VOd.class.getName());
            Class.forName(C79756VRw.class.getName());
            Class.forName(VRD.class.getName());
            Class.forName(C79743VRj.class.getName());
            Class.forName(HandlerThreadC79757VRx.class.getName());
            Class.forName(C79744VRk.class.getName());
            Class.forName(VPS.class.getName());
            Class.forName(C79753VRt.class.getName());
            Class.forName(C79746VRm.class.getName());
            Class.forName(VRS.class.getName());
            Class.forName(InterfaceC40021FnF.class.getName());
            Class.forName(C61590OFe.class.getName());
            Class.forName(UIComponent.class.getName());
            Class.forName(C79662VOg.class.getName());
            Class.forName(VPU.class.getName());
            Class.forName(VOV.class.getName());
            Class.forName(LynxBaseUI.class.getName());
            Class.forName(VPH.class.getName());
            Class.forName(VA1.class.getName());
            Class.forName(VUP.class.getName());
            Class.forName(AbstractC79742VRi.class.getName());
            Class.forName(VS2.class.getName());
            Class.forName(VQS.class.getName());
            Class.forName(BackgroundDrawable.class.getName());
            Class.forName(C79660VOe.class.getName());
            Class.forName(VQ3.class.getName());
            Class.forName(VQ9.class.getName());
            Class.forName(C79661VOf.class.getName());
            Class.forName(PropsUpdater.class.getName());
            Class.forName(Settable.class.getName());
            Class.forName(C79666VOk.class.getName());
            Class.forName(ResourceLoader.class.getName());
            Class.forName(VNA.class.getName());
            Class.forName(VNP.class.getName());
            Class.forName(C79631VNb.class.getName());
            Class.forName(VOY.class.getName());
            Class.forName(InterfaceC40525FvN.class.getName());
            Class.forName(ColorUtils.class.getName());
            Class.forName(DisplayMetricsHolder.class.getName());
            Class.forName(VJJ.class.getName());
            Class.forName(C79656VOa.class.getName());
            Class.forName(C79653VNx.class.getName());
            Class.forName(V9Y.class.getName());
            Class.forName(C79411VEp.class.getName());
            Class.forName(VPR.class.getName());
            Class.forName(C79654VNy.class.getName());
            Class.forName(C40017FnB.class.getName());
            Class.forName(InterfaceC39980Fma.class.getName());
            Class.forName(InterfaceC79652VNw.class.getName());
            Class.forName(VNG.class.getName());
            Class.forName(NetworkingModule.class.getName());
            Class.forName(PromiseImpl.class.getName());
            Class.forName(C38379F4l.class.getName());
            Class.forName(F4Z.class.getName());
            Class.forName(WritableArray.class.getName());
            Class.forName(WritableMap.class.getName());
            Class.forName(VNT.class.getName());
            Class.forName(LynxViewClient.class.getName());
            Class.forName(TemplateAssembler.class.getName());
            Class.forName(VPG.class.getName());
            Class.forName(AbstractC79673VOr.class.getName());
            Class.forName(C79670VOo.class.getName());
            Class.forName(C79675VOt.class.getName());
            Class.forName(VNU.class.getName());
            Class.forName(VOL.class.getName());
            Class.forName(VF1.class.getName());
            Class.forName(C79665VOj.class.getName());
            Class.forName(ShadowNode.class.getName());
            Class.forName(C79359VCp.class.getName());
            Class.forName(LynxFlattenUI.class.getName());
            Class.forName(LynxUI.class.getName());
            Class.forName(VOT.class.getName());
            Class.forName(VUG.class.getName());
            Class.forName(C79715VQh.class.getName());
            Class.forName(EnumC79725VQr.class.getName());
            Class.forName(C79716VQi.class.getName());
            Class.forName(VRK.class.getName());
            Class.forName(LynxUISetter.class.getName());
            Class.forName(ShadowNodeSetter.class.getName());
            Class.forName(C79722VQo.class.getName());
            Class.forName(JSProxy.class.getName());
            Class.forName(VNN.class.getName());
            Class.forName(VNM.class.getName());
            Class.forName(JavaOnlyArray.class.getName());
            Class.forName(JavaOnlyMap.class.getName());
            Class.forName(VNV.class.getName());
            Class.forName(VNS.class.getName());
            Class.forName(C79672VOq.class.getName());
            Class.forName(C79676VOu.class.getName());
            Class.forName(C79708VQa.class.getName());
            Class.forName(C79713VQf.class.getName());
            Class.forName(C79723VQp.class.getName());
            Class.forName(AbsInlineImageShadowNode.class.getName());
            Class.forName(BaseTextShadowNode.class.getName());
            Class.forName(RawTextShadowNode.class.getName());
            Class.forName(UIGroup.class.getName());
            Class.forName(C79727VQt.class.getName());
            Class.forName(AbsUIImage.class.getName());
            Class.forName(FlattenUIText.class.getName());
            Class.forName(UIText.class.getName());
            Class.forName(VQ5.class.getName());
            Class.forName(VR1.class.getName());
            Class.forName(VRP.class.getName());
            Class.forName(VRQ.class.getName());
            Class.forName(VQE.class.getName());
            Class.forName(VQD.class.getName());
            Class.forName(VEC.class.getName());
            Class.forName(C79663VOh.class.getName());
            Class.forName(InlineTextShadowNode.class.getName());
            Class.forName(TextShadowNode.class.getName());
            Class.forName(UIBody.class.getName());
            Class.forName(UIShadowProxy.class.getName());
            Class.forName(UISimpleView.class.getName());
            Class.forName(UIScrollView.class.getName());
            Class.forName(UIView.class.getName());
            Class.forName(UIList.class.getName());
            Class.forName(C79829VUr.class.getName());
            Class.forName(VNZ.class.getName());
            Class.forName(InterfaceC79637VNh.class.getName());
            Class.forName(VNX.class.getName());
            Class.forName(LynxInspectorManager.class.getName());
            C79656VOa.LIZ();
            new C79699VPr();
            SystemClock.uptimeMillis();
        } catch (Throwable unused) {
        }
    }

    public static void LIZ$1() {
        SystemClock.uptimeMillis();
        try {
            Class.forName(C38376F4i.class.getName());
            Class.forName(InterfaceC37728ErM.class.getName());
            Class.forName(EWH.class.getName());
            Class.forName(LynxModule.class.getName());
            Class.forName(LynxModuleWrapper.class.getName());
            Class.forName(MethodDescriptor.class.getName());
            Class.forName(NetworkingModule.class.getName());
            Class.forName(Promise.class.getName());
            Class.forName(InterfaceC39978FmY.class.getName());
            Class.forName(HandlerC39977FmX.class.getName());
            Class.forName(Callback.class.getName());
            Class.forName(C39941Flx.class.getName());
            Class.forName(VNL.class.getName());
            Class.forName(InterfaceC79650VNu.class.getName());
            Class.forName(InterfaceC39940Flw.class.getName());
            Class.forName(C79655VNz.class.getName());
            Class.forName(LynxEnv.class.getName());
            Class.forName(C60682Nri.class.getName());
            Class.forName(C60540NpQ.class.getName());
            Class.forName(TemplateData.class.getName());
            Class.forName(VND.class.getName());
            Class.forName(EnumC59959Ng3.class.getName());
            Class.forName(C79651VNv.class.getName());
            Class.forName(CalledByNative.class.getName());
            Class.forName(InterfaceC79649VNt.class.getName());
            Class.forName(VON.class.getName());
            Class.forName(InterfaceC79290V9y.class.getName());
            Class.forName(LayoutContext.class.getName());
            Class.forName(VOR.class.getName());
            Class.forName(PaintingContext.class.getName());
            Class.forName(UIComponent.class.getName());
            Class.forName(LynxBaseUI.class.getName());
            Class.forName(VPH.class.getName());
            Class.forName(VA1.class.getName());
            Class.forName(ResourceLoader.class.getName());
            Class.forName(VNA.class.getName());
            Class.forName(VNP.class.getName());
            Class.forName(DisplayMetricsHolder.class.getName());
            Class.forName(C79653VNx.class.getName());
            Class.forName(C79411VEp.class.getName());
            Class.forName(C79654VNy.class.getName());
            Class.forName(InterfaceC39980Fma.class.getName());
            Class.forName(InterfaceC79652VNw.class.getName());
            Class.forName(NetworkingModule.class.getName());
            Class.forName(PromiseImpl.class.getName());
            Class.forName(C38379F4l.class.getName());
            Class.forName(F4Z.class.getName());
            Class.forName(WritableArray.class.getName());
            Class.forName(WritableMap.class.getName());
            Class.forName(VNT.class.getName());
            Class.forName(LynxViewClient.class.getName());
            Class.forName(TemplateAssembler.class.getName());
            Class.forName(VNU.class.getName());
            Class.forName(VOL.class.getName());
            Class.forName(LynxUI.class.getName());
            Class.forName(VOT.class.getName());
            Class.forName(JSProxy.class.getName());
            Class.forName(VNN.class.getName());
            Class.forName(VNM.class.getName());
            Class.forName(JavaOnlyArray.class.getName());
            Class.forName(JavaOnlyMap.class.getName());
            Class.forName(VNV.class.getName());
            Class.forName(VNS.class.getName());
            Class.forName(UIBody.class.getName());
            Class.forName(UIShadowProxy.class.getName());
            Class.forName("com.lynx.tasm.loader.RenderkitLoader");
            Class.forName("com.lynx.tasm.loader.RenderkitResourceLoader");
            Class.forName("com.lynx.tasm.RenderkitViewDelegateImpl");
            Class.forName("com.lynx.tasm.behavior.LayoutContextRenderkit");
            Class.forName("com.lynx.tasm.behavior.KeyEventDispatcher");
            Class.forName("com.lynx.devtoolwrapper.RenderkitSnapshotHelper");
            SystemClock.uptimeMillis();
        } catch (Throwable unused) {
        }
    }

    public static void LIZ$3() {
        if (C79347VCd.LIZ().LIZ && C79346VCc.LIZLLL().LJIIL.LIZLLL.mEnableUsePTY == 1 && PitayaCoreFactory.getCore(PitayaWrapper.LIZIZ().LIZIZ).isReady()) {
            C79347VCd.LIZ().LIZ = false;
            C79347VCd.LIZ().runStrategy();
            C79347VCd.LIZ().LIZIZ(-1L);
        }
    }

    public ARunnableS20S0000000_14(int i) {
        this.$t = i;
    }

    public static final void run$2(ARunnableS20S0000000_14 aRunnableS20S0000000_14) {
        boolean LIZ;
        try {
            LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS20S0000000_14 aRunnableS20S0000000_14) {
        boolean LIZ;
        try {
            LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS20S0000000_14 aRunnableS20S0000000_14) {
        boolean LIZ;
        try {
            LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS20S0000000_14 aRunnableS20S0000000_14) {
        boolean LIZ;
        try {
            LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS20S0000000_14 aRunnableS20S0000000_14) {
        boolean LIZ;
        try {
            DnsOptimizer.LJFF().LJI();
            DnsOptimizer.LJFF().LJJIJ = true;
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS20S0000000_14 aRunnableS20S0000000_14) {
        boolean LIZ;
        try {
            if (ApplicationStatus.LIZIZ == null) {
                VI4 vi4 = new VI4();
                ApplicationStatus.LIZIZ = vi4;
                ApplicationStatus.LIZIZ(vi4);
            }
        } finally {
            if (LIZ) {
            }
        }
    }
}
