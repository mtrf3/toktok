package com.bytedance.ies.xelement.overlay;

import X.C03880Dg;
import X.C16300kU;
import X.C65300Pk0;
import X.C78996UzQ;
import X.C79774VSo;
import X.C79775VSp;
import X.C79777VSr;
import X.DialogC79776VSq;
import X.DialogInterfaceOnKeyListenerC79778VSs;
import X.EnumC79647VNr;
import X.F5B;
import X.VNU;
import X.VOW;
import X.VOX;
import X.VPD;
import X.VPH;
import X.VPJ;
import X.VPN;
import X.VPV;
import X.VRK;
import X.VRM;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.UIBody;
import com.lynx.tasm.behavior.ui.UIGroup;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import o3.h0;

/* loaded from: classes15.dex */
public final class LynxOverlayView extends UIGroup<VRK> {
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public String LJLJJI;
    public String LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public final DialogC79776VSq LJLJLJ;
    public final VRM LJLJLLL;
    public final int[] LJLL;
    public final VPV LJLLI;
    public boolean LJLLILLLL;
    public VPJ LJLLJ;
    public VPN LJLLL;
    public final LynxOverlayViewProxy LJLLLL;

    public static void LJIJJLI(DialogC79776VSq dialogC79776VSq) {
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/ies/xelement/overlay/LynxOverlayDialog", "show", dialogC79776VSq, new Object[0], "void", new C65300Pk0(false, "()V", "5040777110389869438")).LIZ) {
            return;
        }
        dialogC79776VSq.show();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean isUserInteractionEnabled() {
        return false;
    }

    public final void LJJ() {
        Window window;
        View decorView;
        Integer valueOf;
        int intValue;
        int i;
        Window window2;
        Window window3;
        Window window4;
        View decorView2;
        Window window5;
        View decorView3;
        Integer valueOf2;
        Window window6;
        DialogC79776VSq dialogC79776VSq = this.LJLJLJ;
        if (dialogC79776VSq != null && (window6 = dialogC79776VSq.getWindow()) != null) {
            window6.addFlags(65792);
        }
        if (Build.VERSION.SDK_INT >= 23 && o.LJ(this.LJLJJI, "lite")) {
            DialogC79776VSq dialogC79776VSq2 = this.LJLJLJ;
            if (dialogC79776VSq2 != null && (window5 = dialogC79776VSq2.getWindow()) != null && (decorView3 = window5.getDecorView()) != null && (valueOf2 = Integer.valueOf(decorView3.getSystemUiVisibility())) != null) {
                intValue = valueOf2.intValue();
                i = 9472;
            } else {
                o.LJIIZILJ();
                throw null;
            }
        } else {
            DialogC79776VSq dialogC79776VSq3 = this.LJLJLJ;
            if (dialogC79776VSq3 != null && (window = dialogC79776VSq3.getWindow()) != null && (decorView = window.getDecorView()) != null && (valueOf = Integer.valueOf(decorView.getSystemUiVisibility())) != null) {
                intValue = valueOf.intValue();
                i = 1280;
            } else {
                o.LJIIZILJ();
                throw null;
            }
        }
        int i2 = intValue | i;
        DialogC79776VSq dialogC79776VSq4 = this.LJLJLJ;
        if (dialogC79776VSq4 != null && (window4 = dialogC79776VSq4.getWindow()) != null && (decorView2 = window4.getDecorView()) != null) {
            decorView2.setSystemUiVisibility(i2);
        }
        DialogC79776VSq dialogC79776VSq5 = this.LJLJLJ;
        if (dialogC79776VSq5 != null && (window3 = dialogC79776VSq5.getWindow()) != null) {
            window3.addFlags(LiveLayoutPreloadThreadPriority.DEFAULT);
        }
        DialogC79776VSq dialogC79776VSq6 = this.LJLJLJ;
        if (dialogC79776VSq6 != null && (window2 = dialogC79776VSq6.getWindow()) != null) {
            window2.setStatusBarColor(0);
        }
    }

    public final void LJJI() {
        VNU lynxContext = this.mContext;
        o.LJFF(lynxContext, "lynxContext");
        UIBody uIBody = lynxContext.LJLJLLL;
        o.LJFF(uIBody, "lynxContext.uiBody");
        int[] iArr = {0, 0};
        int[] iArr2 = {0, 0};
        uIBody.LJLIL.getLocationOnScreen(iArr);
        this.mView.getLocationOnScreen(iArr2);
        int[] iArr3 = this.LJLL;
        iArr3[0] = iArr2[0] - iArr[0];
        iArr3[1] = iArr2[1] - iArr[1];
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        if (this.LJLJLJ.isShowing()) {
            try {
                this.LJLJLJ.dismiss();
                C79774VSo.LIZIZ(this.LJLJJL);
            } catch (WindowManager.BadTokenException e) {
                LLog.LIZLLL(3, "x-overlay", e.toString());
            } catch (RuntimeException e2) {
                LLog.LIZLLL(3, "x-overlay", e2.toString());
            }
        }
        super.destroy();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.VPY
    public final boolean eventThrough() {
        if (this.mEventThrough == EnumC79647VNr.Enable) {
            return true;
        }
        return false;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final Rect getBoundingClientRect() {
        if (this.LJLJL && this.LJLL[0] == Integer.MIN_VALUE) {
            LJJI();
        }
        Rect boundingClientRect = super.getBoundingClientRect();
        o.LJFF(boundingClientRect, "super.getBoundingClientRect()");
        return boundingClientRect;
    }

    public final void hide() {
        if (this.LJLJLJ.isShowing()) {
            try {
                this.LJLJLJ.dismiss();
                LJIL("onDismissOverlay");
                C79774VSo.LIZIZ(this.LJLJJL);
            } catch (WindowManager.BadTokenException e) {
                LLog.LIZLLL(3, "x-overlay", e.toString());
            } catch (RuntimeException e2) {
                LLog.LIZLLL(3, "x-overlay", e2.toString());
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void layout() {
        super.layout();
        if (this.LJLJL) {
            LJJI();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onDetach() {
        super.onDetach();
        if (!this.LJLJJLL) {
            hide();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onPropsUpdated() {
        super.onPropsUpdated();
        if (!this.LJLLILLLL) {
            return;
        }
        VNU lynxContext = this.mContext;
        o.LJFF(lynxContext, "lynxContext");
        if (lynxContext.LJLJLLL.LJLILLLLZI) {
            if (this.LJLLJ == null) {
                VPJ vpj = new VPJ(this);
                this.LJLLJ = vpj;
                h0.LJIJI(this.mView, vpj);
            }
        } else if (this.LJLLL == null) {
            VPN vpn = new VPN(this);
            T t = this.mView;
            if (t != 0) {
                t.setAccessibilityDelegate(new VOW(vpn));
            }
            this.LJLLL = vpn;
        }
        C16300kU.LJIJ(this.LJLJLLL, 1);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI, X.VPH
    public final void requestLayout() {
        super.requestLayout();
        if (this.LJLLLL.getTransitionAnimator() != null || this.LJLLLL.enableLayoutAnimation()) {
            this.LJLJLLL.invalidate();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final int[] getOffsetDescendantRectToLynxView() {
        return this.LJLL;
    }

    public final void LJIL(String str) {
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.put("currentOverlayId", this.LJLJJL);
        JavaOnlyArray javaOnlyArray2 = new JavaOnlyArray();
        Iterator it = ((ArrayList) C79774VSo.LIZ).iterator();
        while (it.hasNext()) {
            javaOnlyArray2.pushString(((C79775VSp) it.next()).LIZ);
        }
        javaOnlyMap.put("overlays", javaOnlyArray2);
        javaOnlyArray.pushMap(javaOnlyMap);
        this.mContext.LJIIJJI(str, javaOnlyArray);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        return new VOX(this, context);
    }

    @VPD(name = "always-show")
    public final void setAlwaysShow(boolean z) {
        this.LJLJJLL = z;
    }

    @VPD(name = "android-set-soft-input-mode")
    public final void setAndroidSetSoftInputMode(String value) {
        Window window;
        o.LJIIJ(value, "value");
        if ("unspecified".equals(value)) {
            Window window2 = this.LJLJLJ.getWindow();
            if (window2 != null) {
                window2.setSoftInputMode(0);
                return;
            }
            return;
        }
        if ("nothing".equals(value)) {
            Window window3 = this.LJLJLJ.getWindow();
            if (window3 == null) {
                return;
            }
            window3.setSoftInputMode(48);
            return;
        }
        if ("pan".equals(value)) {
            Window window4 = this.LJLJLJ.getWindow();
            if (window4 == null) {
                return;
            }
            window4.setSoftInputMode(32);
            return;
        }
        if (!"resize".equals(value) || (window = this.LJLJLJ.getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(16);
    }

    @VPD(name = "cut-out-mode")
    public final void setCutOutMode(boolean z) {
        DialogC79776VSq dialogC79776VSq;
        Window window;
        WindowManager.LayoutParams attributes;
        if (z && (dialogC79776VSq = this.LJLJLJ) != null && (window = dialogC79776VSq.getWindow()) != null && (attributes = window.getAttributes()) != null && Build.VERSION.SDK_INT >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
    }

    @VPD(name = "android-enable-accessibility")
    public final void setEnableAccessibility(boolean z) {
        this.LJLLILLLL = z;
        if (z) {
            T mView = this.mView;
            o.LJFF(mView, "mView");
            mView.setFocusableInTouchMode(true);
        }
    }

    @VPD(name = "events-pass-through")
    public final void setEventsPassThrough(F5B eventsPassThrough) {
        o.LJIIJ(eventsPassThrough, "eventsPassThrough");
        ReadableType type = eventsPassThrough.getType();
        if (type == null) {
            return;
        }
        int i = C79777VSr.LIZJ[type.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            this.LJLJI = eventsPassThrough.asBoolean();
        } else {
            String asString = eventsPassThrough.asString();
            if (asString != null) {
                this.LJLJI = Boolean.parseBoolean(asString);
            } else {
                o.LJIIZILJ();
                throw null;
            }
        }
    }

    @VPD(name = "full-screen")
    public final void setFullScreen(boolean z) {
        Window window;
        View decorView;
        Integer valueOf;
        Window window2;
        View decorView2;
        if (z) {
            DialogC79776VSq dialogC79776VSq = this.LJLJLJ;
            if (dialogC79776VSq != null && (window = dialogC79776VSq.getWindow()) != null && (decorView = window.getDecorView()) != null && (valueOf = Integer.valueOf(decorView.getSystemUiVisibility())) != null) {
                int intValue = valueOf.intValue() | 5894;
                DialogC79776VSq dialogC79776VSq2 = this.LJLJLJ;
                if (dialogC79776VSq2 != null && (window2 = dialogC79776VSq2.getWindow()) != null && (decorView2 = window2.getDecorView()) != null) {
                    decorView2.setSystemUiVisibility(intValue);
                    return;
                }
                return;
            }
            o.LJIIZILJ();
            throw null;
        }
    }

    @VPD(name = "overlay-id")
    public final void setOverlayId(String id) {
        o.LJIIJ(id, "id");
        this.LJLJJL = id;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setParent(VPH vph) {
        super.setParent(vph);
        if (vph == null) {
            hide();
        }
    }

    @VPD(name = "compat-bounding-rect")
    public final void setShouldOffsetBoundingRect(Boolean bool) {
        boolean z;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.LJLJL = z;
        if (z) {
            LJJI();
        }
    }

    @VPD(name = "status-bar-translucent")
    public final void setStatusBarTranslucent(F5B statusBarTranslucent) {
        o.LJIIJ(statusBarTranslucent, "statusBarTranslucent");
        ReadableType type = statusBarTranslucent.getType();
        if (type != null) {
            int i = C79777VSr.LIZIZ[type.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    this.LJLILLLLZI = statusBarTranslucent.asBoolean();
                }
            } else {
                String asString = statusBarTranslucent.asString();
                if (asString != null) {
                    this.LJLILLLLZI = Boolean.parseBoolean(asString);
                } else {
                    o.LJIIZILJ();
                    throw null;
                }
            }
        }
        if (this.LJLILLLLZI) {
            LJJ();
        }
    }

    @VPD(name = "status-bar-translucent-style")
    public final void setStatusBarTranslucentStyle(String str) {
        if (str == null) {
            str = "dark";
        }
        this.LJLJJI = str;
        if (this.LJLILLLLZI) {
            LJJ();
        }
    }

    @VPD(name = "visible")
    public final void setVisible(F5B visible) {
        o.LJIIJ(visible, "visible");
        ReadableType type = visible.getType();
        if (type != null) {
            int i = C79777VSr.LIZ[type.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    this.LJLIL = visible.asBoolean();
                }
            } else {
                String asString = visible.asString();
                if (asString != null) {
                    this.LJLIL = Boolean.parseBoolean(asString);
                } else {
                    o.LJIIZILJ();
                    throw null;
                }
            }
        }
        if (this.LJLIL) {
            Activity LJIIJJI = C78996UzQ.LJIIJJI(this.mContext);
            if (LJIIJJI != null && !LJIIJJI.isFinishing()) {
                try {
                    this.LJLJJL = C79774VSo.LIZ(this.LJLJJL, this.LJLJLJ);
                    LJIJJLI(this.LJLJLJ);
                    LJIL("onShowOverlay");
                    return;
                } catch (WindowManager.BadTokenException e) {
                    LLog.LIZLLL(3, "x-overlay", e.toString());
                    return;
                } catch (RuntimeException e2) {
                    LLog.LIZLLL(3, "x-overlay", e2.toString());
                    return;
                }
            }
            return;
        }
        hide();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LynxOverlayView(VNU context, LynxOverlayViewProxy proxy) {
        super(context);
        o.LJIIJ(context, "context");
        o.LJIIJ(proxy, "proxy");
        this.LJLLLL = proxy;
        this.LJLJI = true;
        this.LJLJJI = "dark";
        DialogC79776VSq dialogC79776VSq = new DialogC79776VSq(context, this);
        this.LJLJLJ = dialogC79776VSq;
        VRM vrm = new VRM(this, context);
        this.LJLJLLL = vrm;
        this.LJLL = new int[]{LiveLayoutPreloadThreadPriority.DEFAULT, LiveLayoutPreloadThreadPriority.DEFAULT};
        Window window = dialogC79776VSq.getWindow();
        if (window != null) {
            window.clearFlags(2);
        }
        Window window2 = dialogC79776VSq.getWindow();
        if (window2 != null) {
            window2.setDimAmount(0.0f);
        }
        vrm.addView(this.mView, -1, -1);
        dialogC79776VSq.setContentView(vrm, new ViewGroup.LayoutParams(-1, -1));
        dialogC79776VSq.setOnKeyListener(new DialogInterfaceOnKeyListenerC79778VSs(this));
        vrm.setClickable(true);
        vrm.setFocusable(true);
        vrm.setFocusableInTouchMode(true);
        this.LJLLI = new VPV(context.LJFF());
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final void onInsertChild(LynxBaseUI lynxBaseUI, int i) {
        if (this.LJLJL && this.LJLL[0] == Integer.MIN_VALUE) {
            LJJI();
        }
        super.onInsertChild(lynxBaseUI, i);
    }
}
