package Y;

import X.AbstractC93769aWD;
import X.C16880lQ;
import X.C1C8;
import X.C76800UCe;
import X.C78842Uww;
import X.C79823Bi;
import X.C79863Bm;
import X.C93484aRc;
import X.C93485aRd;
import X.C93698aV4;
import X.C93709aVF;
import X.C93723aVT;
import X.C93726aVW;
import X.C93738aVi;
import X.C93797aWf;
import X.C93819aX1;
import X.C93887aY7;
import X.C93932aYq;
import X.C93939aYx;
import X.C93979aZb;
import X.C93992aZo;
import X.C94007aa3;
import X.C94034aaU;
import X.C94090abO;
import X.C94141acD;
import X.C94221adV;
import X.C94389agD;
import X.C94838anS;
import X.C94840anU;
import X.C94842anW;
import X.C94855anj;
import X.C94910aoc;
import X.C94923aop;
import X.C94926aos;
import X.C94930aow;
import X.C94933aoz;
import X.C94936ap2;
import X.C94938ap4;
import X.C94943ap9;
import X.EnumC93712aVI;
import X.EnumC93725aVV;
import X.EnumC93821aX3;
import X.EnumC93888aY8;
import X.EnumC93978aZa;
import X.EnumC93993aZp;
import X.InterfaceC65462ha;
import X.InterfaceC70352pT;
import X.InterfaceC71762rk;
import X.MBB;
import X.V1M;
import X.X1D;
import X.XKI;
import X.XKX;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import com.bytedance.effectcreatormobile.behaviour.view.preview.BehaviourPreviewFragment;
import com.bytedance.effectcreatormobile.ckeapi.api.assetEditor.IAssetEditor;
import com.bytedance.effectcreatormobile.ckeapi.api.behaviour.IBehaviour;
import com.bytedance.effectcreatormobile.ckeapi.api.icanvas.ICanvas;
import com.bytedance.effectcreatormobile.ckeapi.api.layer.ILayer;
import com.bytedance.effectcreatormobile.ckeapi.api.main.IMain;
import com.bytedance.effectcreatormobile.ckeapi.api.modelselect.IModelSelect;
import com.bytedance.effectcreatormobile.ckeapi.api.text.ITextEdit;
import com.bytedance.effectcreatormobile.modelselect.ModelSelectFragment;
import com.bytedance.ugc.effectcreator.main.MainFragment;
import com.bytedance.ugc.effectcreator.main.MainImpl;
import com.bytedance.ugc.effectcreator.main.MainLiveData;
import com.ugc.effectcreator.canvas.CanvasFragment;
import com.ugc.effectcreator.canvas.CanvasViewModel;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;
import kotlin.jvm.internal.IDqS419S0100000_42;
import kotlin.jvm.internal.IDqS423S0100000_42;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public class IDRunnableS33S0200000_42 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;

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
            default:
                return;
        }
    }

    public final void LIZ$0() {
        InterfaceC70352pT<C76800UCe> validCommandAdded;
        InterfaceC65462ha<AbstractC93769aWD> mainEvent;
        LiveData<EnumC93888aY8> pageState;
        LiveData<EnumC93712aVI> layerPageStatus;
        LiveData<EnumC93993aZp> panelStateLiveData;
        InterfaceC65462ha<C93485aRd> canvasGestureOperateData;
        InterfaceC65462ha<C93484aRc> canvasFeatureOperateData;
        InterfaceC65462ha<C94221adV> layerFeatureOperateData;
        InterfaceC71762rk<Boolean> focusState;
        MainLiveData<Boolean> loadingShow;
        MainFragment mainFragment = (MainFragment) this.l1;
        mainFragment.Ol().LJLILLLLZI.LIZ.observe(mainFragment.getViewLifecycleOwner(), new IDObserverS227S0100000_42(mainFragment, 32));
        MainImpl LIZ = C93932aYq.LIZ();
        if (LIZ != null && (loadingShow = LIZ.getLoadingShow()) != null) {
            loadingShow.observe(mainFragment.getViewLifecycleOwner(), new IDObserverS227S0100000_42(mainFragment, 33));
        }
        mainFragment.Ol().LJLJI.LIZ.observe(mainFragment.getViewLifecycleOwner(), new IDObserverS227S0100000_42(mainFragment, 34));
        C93939aYx.LIZ().getRenderModeData().observe(mainFragment.getViewLifecycleOwner(), new IDObserverS227S0100000_42(mainFragment, 35));
        IAssetEditor LIZ2 = C93979aZb.LIZ();
        if (LIZ2 != null && (focusState = LIZ2.getFocusState()) != null) {
            LifecycleOwner viewLifecycleOwner = mainFragment.getViewLifecycleOwner();
            o.LJIIIIZZ(viewLifecycleOwner, "viewLifecycleOwner");
            XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C94923aop(focusState, viewLifecycleOwner, Lifecycle.State.STARTED, null, mainFragment), 3);
        }
        ILayer LIZ3 = C93709aVF.LIZ();
        if (LIZ3 != null && (layerFeatureOperateData = LIZ3.getLayerFeatureOperateData()) != null) {
            LifecycleOwner viewLifecycleOwner2 = mainFragment.getViewLifecycleOwner();
            o.LJIIIIZZ(viewLifecycleOwner2, "viewLifecycleOwner");
            XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new C94926aos(layerFeatureOperateData, viewLifecycleOwner2, Lifecycle.State.STARTED, null, mainFragment), 3);
        }
        ICanvas LIZ4 = C93698aV4.LIZ();
        if (LIZ4 != null && (canvasFeatureOperateData = LIZ4.getCanvasFeatureOperateData()) != null) {
            LifecycleOwner viewLifecycleOwner3 = mainFragment.getViewLifecycleOwner();
            o.LJIIIIZZ(viewLifecycleOwner3, "viewLifecycleOwner");
            XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner3), null, null, new C94930aow(canvasFeatureOperateData, viewLifecycleOwner3, Lifecycle.State.STARTED, null, mainFragment), 3);
        }
        ICanvas LIZ5 = C93698aV4.LIZ();
        if (LIZ5 != null && (canvasGestureOperateData = LIZ5.getCanvasGestureOperateData()) != null) {
            LifecycleOwner viewLifecycleOwner4 = mainFragment.getViewLifecycleOwner();
            o.LJIIIIZZ(viewLifecycleOwner4, "viewLifecycleOwner");
            XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner4), null, null, new C94933aoz(canvasGestureOperateData, viewLifecycleOwner4, Lifecycle.State.STARTED, null, mainFragment), 3);
        }
        C93939aYx.LIZ().getModelPathChangeData().observe(mainFragment.getViewLifecycleOwner(), new IDObserverS227S0100000_42(mainFragment, 36));
        IModelSelect LIZ6 = C93797aWf.LIZ();
        LifecycleOwner viewLifecycleOwner5 = mainFragment.getViewLifecycleOwner();
        o.LJIIIIZZ(viewLifecycleOwner5, "viewLifecycleOwner");
        Lifecycle lifecycle = viewLifecycleOwner5.getLifecycle();
        o.LJIIIIZZ(lifecycle, "viewLifecycleOwner.lifecycle");
        LIZ6.registerAutoSwitchModelCallback(lifecycle, new IDqS419S0100000_42(mainFragment, 104));
        IBehaviour LIZ7 = C93992aZo.LIZ();
        if (LIZ7 != null && (panelStateLiveData = LIZ7.getPanelStateLiveData()) != null) {
            panelStateLiveData.observe(mainFragment.getViewLifecycleOwner(), new IDObserverS227S0100000_42(mainFragment, 37));
        }
        C93819aX1.LIZ().getPanelStateLiveData().observe(mainFragment.getViewLifecycleOwner(), new IDObserverS227S0100000_42(mainFragment, 38));
        InterfaceC71762rk<EnumC93821aX3> panelStatus = C93726aVW.LIZIZ().getPanelStatus();
        LifecycleOwner viewLifecycleOwner6 = mainFragment.getViewLifecycleOwner();
        o.LJIIIIZZ(viewLifecycleOwner6, "viewLifecycleOwner");
        Lifecycle.State state = Lifecycle.State.STARTED;
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner6), null, null, new C94936ap2(panelStatus, viewLifecycleOwner6, state, null, mainFragment), 3);
        ILayer LIZ8 = C93709aVF.LIZ();
        if (LIZ8 != null && (layerPageStatus = LIZ8.getLayerPageStatus()) != null) {
            layerPageStatus.observe(mainFragment.getViewLifecycleOwner(), new IDObserverS227S0100000_42(mainFragment, 30));
        }
        ITextEdit LIZ9 = C93887aY7.LIZ();
        if (LIZ9 != null && (pageState = LIZ9.getPageState()) != null) {
            pageState.observe(mainFragment.getViewLifecycleOwner(), new IDObserverS227S0100000_42(mainFragment, 31));
        }
        LifecycleOwner viewLifecycleOwner7 = mainFragment.getViewLifecycleOwner();
        o.LJIIIIZZ(viewLifecycleOwner7, "viewLifecycleOwner");
        CKEffectEditorContext.LIZJ(viewLifecycleOwner7, new IDqS423S0100000_42(mainFragment, 142));
        MainImpl LIZ10 = C93932aYq.LIZ();
        if (LIZ10 != null && (mainEvent = LIZ10.getMainEvent()) != null) {
            LifecycleOwner viewLifecycleOwner8 = mainFragment.getViewLifecycleOwner();
            o.LJIIIIZZ(viewLifecycleOwner8, "viewLifecycleOwner");
            XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner8), null, null, new C94938ap4(mainEvent, viewLifecycleOwner8, state, null, mainFragment), 3);
        }
        InterfaceC65462ha LJIIJ = V1M.LJIIJ(new C79823Bi(new IDObjectS326S0100000_1(new InterfaceC65462ha[]{mainFragment.Ol().LJLJL, mainFragment.LJLJLLL}, 16), MBB.INSTANCE, -2, XKI.SUSPEND), 100L);
        LifecycleOwner viewLifecycleOwner9 = mainFragment.getViewLifecycleOwner();
        o.LJIIIIZZ(viewLifecycleOwner9, "viewLifecycleOwner");
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner9), null, null, new C94943ap9(LJIIJ, viewLifecycleOwner9, Lifecycle.State.CREATED, null, mainFragment), 3);
        IBehaviour LIZ11 = C93992aZo.LIZ();
        if (LIZ11 != null && (validCommandAdded = LIZ11.validCommandAdded()) != null) {
            LifecycleOwner viewLifecycleOwner10 = mainFragment.getViewLifecycleOwner();
            o.LJIIIIZZ(viewLifecycleOwner10, "viewLifecycleOwner");
            XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner10), null, null, new C94910aoc(validCommandAdded, viewLifecycleOwner10, state, null, mainFragment), 3);
        }
    }

    public final void LIZ$1() {
        LiveData<EnumC93725aVV> mainPageStatus;
        InterfaceC70352pT<EnumC93978aZa> editorEvent;
        CanvasFragment canvasFragment = (CanvasFragment) this.l1;
        C79863Bm c79863Bm = ((CanvasViewModel) canvasFragment.LJLJJLL.getValue()).LJLILLLLZI;
        LifecycleOwner viewLifecycleOwner = canvasFragment.getViewLifecycleOwner();
        o.LJIIIIZZ(viewLifecycleOwner, "viewLifecycleOwner");
        Lifecycle.State state = Lifecycle.State.STARTED;
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C94838anS(c79863Bm, viewLifecycleOwner, state, null, canvasFragment), 3);
        IAssetEditor LIZ = C93979aZb.LIZ();
        if (LIZ != null && (editorEvent = LIZ.getEditorEvent()) != null) {
            LifecycleOwner viewLifecycleOwner2 = canvasFragment.getViewLifecycleOwner();
            o.LJIIIIZZ(viewLifecycleOwner2, "viewLifecycleOwner");
            XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new C94840anU(editorEvent, viewLifecycleOwner2, state, null, canvasFragment), 3);
        }
        C93939aYx.LIZ().getRenderModeData().observe(canvasFragment.getViewLifecycleOwner(), new IDObserverS227S0100000_42(canvasFragment, 7));
        canvasFragment.Dl();
        CKEffectEditorContext.LJIIIZ.observe(canvasFragment.getViewLifecycleOwner(), new IDObserverS227S0100000_42(canvasFragment, 8));
        IMain LIZ2 = C93723aVT.LIZ();
        if (LIZ2 != null && (mainPageStatus = LIZ2.getMainPageStatus()) != null) {
            mainPageStatus.observe(canvasFragment.getViewLifecycleOwner(), new IDObserverS227S0100000_42(canvasFragment, 9));
        }
        C93939aYx.LIZ().getRenderModeData().observe(canvasFragment.getViewLifecycleOwner(), new IDObserverS227S0100000_42(canvasFragment, 10));
        C94141acD onDataChange = canvasFragment.LJLJL;
        o.LJIIIZ(onDataChange, "onDataChange");
        CKEffectEditorContext.LJIILIIL.add(onDataChange);
        InterfaceC70352pT<C76800UCe> frameRefreshEvent = C93939aYx.LIZ().frameRefreshEvent();
        LifecycleOwner viewLifecycleOwner3 = canvasFragment.getViewLifecycleOwner();
        o.LJIIIIZZ(viewLifecycleOwner3, "viewLifecycleOwner");
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner3), null, null, new C94842anW(frameRefreshEvent, viewLifecycleOwner3, state, null, canvasFragment), 3);
    }

    public final void LIZ$2() {
        C94090abO c94090abO = ModelSelectFragment.vl((ModelSelectFragment) ((IDObserverS227S0100000_42) this.l1).l0).LJLJJL;
        int i = ((ModelSelectFragment) ((IDObserverS227S0100000_42) this.l1).l0).xl().LJLJJL;
        if (c94090abO.LJLJJL.getChildCount() > 2) {
            LinearLayout linearLayout = c94090abO.LJLJJL;
            View childAt = linearLayout.getChildAt(C78842Uww.LJIIL(i + 1, 1, linearLayout.getChildCount() - 2));
            o.LJIIIIZZ(childAt, "itemContainer.getChildAt…dCount - 2)\n            )");
            c94090abO.LIZ(childAt);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("scroll to index ");
        LIZ.append(((ModelSelectFragment) ((IDObserverS227S0100000_42) this.l1).l0).xl().LJLJJL);
        C94034aaU.LIZ("ModelSelectFragment", X1D.LIZIZ(LIZ));
    }

    public static final void run$0(IDRunnableS33S0200000_42 iDRunnableS33S0200000_42) {
        boolean LIZ;
        try {
            iDRunnableS33S0200000_42.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(IDRunnableS33S0200000_42 iDRunnableS33S0200000_42) {
        boolean LIZ;
        try {
            iDRunnableS33S0200000_42.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(IDRunnableS33S0200000_42 iDRunnableS33S0200000_42) {
        boolean LIZ;
        try {
            PopupWindow popupWindow = (PopupWindow) iDRunnableS33S0200000_42.l0;
            Window window = ((C93738aVi) iDRunnableS33S0200000_42.l1).LJ.getWindow();
            o.LJIIIIZZ(window, "activity.window");
            C16880lQ.LLJLLIL(popupWindow, window.getDecorView(), 0, 0, 0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(IDRunnableS33S0200000_42 iDRunnableS33S0200000_42) {
        boolean LIZ;
        try {
            ((BehaviourPreviewFragment) ((IDObserverS227S0100000_42) iDRunnableS33S0200000_42.l1).l0).startPostponedEnterTransition();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(IDRunnableS33S0200000_42 iDRunnableS33S0200000_42) {
        boolean LIZ;
        try {
            C94007aa3 c94007aa3 = ((C94855anj) iDRunnableS33S0200000_42.l0).LJLILLLLZI;
            if (c94007aa3 != null) {
                C1C8 c1c8 = c94007aa3.LIZ;
                if (c1c8 != null) {
                    c1c8.LJIJI((C94389agD) iDRunnableS33S0200000_42.l1);
                } else {
                    o.LJIJI("itemTouchHelper");
                    throw null;
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(IDRunnableS33S0200000_42 iDRunnableS33S0200000_42) {
        boolean LIZ;
        try {
            iDRunnableS33S0200000_42.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public IDRunnableS33S0200000_42(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public IDRunnableS33S0200000_42(View view, MainFragment mainFragment, Bundle bundle, int i) {
        this.$t = i;
        this.l0 = view;
        this.l1 = mainFragment;
    }
}
