package com.bytedance.ies.xelement.overlay.ng;

import X.C03880Dg;
import X.C49615Jdb;
import X.C65300Pk0;
import X.C78996UzQ;
import X.C79784VSy;
import X.DialogC79783VSx;
import X.DialogInterfaceOnKeyListenerC79780VSu;
import X.EnumC79647VNr;
import X.F5B;
import X.VNA;
import X.VNL;
import X.VNU;
import X.VPD;
import X.VPH;
import X.VPV;
import X.VPY;
import X.VRK;
import X.VRN;
import X.VT2;
import X.VT3;
import X.VUG;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.ies.xelement.viewpager.LynxFoldView;
import com.bytedance.ies.xelement.viewpager.foldview.BaseLynxFoldView;
import com.bytedance.ies.xelement.viewpager.foldview.LynxFoldViewNG;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIBody;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.tasm.behavior.ui.list.UIList;
import com.lynx.tasm.behavior.ui.scroll.UIScrollView;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class LynxOverlayViewNG extends UIGroup<VRK> {
    public int LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public String LJLJJLL;
    public String LJLJL;
    public String LJLJLJ;
    public LynxBaseUI LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public final boolean LJLLILLLL;
    public boolean LJLLJ;
    public VelocityTracker LJLLL;
    public float LJLLLL;
    public float LJLLLLLL;
    public Boolean LJLZ;
    public final DialogC79783VSx LJZ;
    public final VRN LJZI;
    public final int[] LJZL;
    public final VPV LL;
    public final LynxOverlayViewProxyNG LLD;

    public static void LJJ(DialogC79783VSx dialogC79783VSx) {
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/ies/xelement/overlay/ng/LynxOverlayDialogNG", "show", dialogC79783VSx, new Object[0], "void", new C65300Pk0(false, "()V", "691158329189956769")).LIZ) {
            return;
        }
        dialogC79783VSx.show();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean isUserInteractionEnabled() {
        return false;
    }

    public final void LJJIII() {
        VNU lynxContext = this.mContext;
        o.LJFF(lynxContext, "lynxContext");
        UIBody uIBody = lynxContext.LJLJLLL;
        o.LJFF(uIBody, "lynxContext.uiBody");
        int[] iArr = {0, 0};
        int[] iArr2 = {0, 0};
        uIBody.LJLIL.getLocationOnScreen(iArr);
        this.mView.getLocationOnScreen(iArr2);
        int[] iArr3 = this.LJZL;
        iArr3[0] = iArr2[0] - iArr[0];
        iArr3[1] = iArr2[1] - iArr[1];
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        if (this.LJZ.isShowing()) {
            try {
                this.LJZ.dismiss();
                C79784VSy.LIZIZ(this.LJLJL);
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
        if (this.LJLLILLLL && this.LJZL[0] == Integer.MIN_VALUE) {
            LJJIII();
        }
        Rect boundingClientRect = super.getBoundingClientRect();
        o.LJFF(boundingClientRect, "super.getBoundingClientRect()");
        return boundingClientRect;
    }

    public final void hide() {
        if (this.LJZ.isShowing()) {
            try {
                this.LJZ.dismiss();
                VNU lynxContext = this.mContext;
                o.LJFF(lynxContext, "lynxContext");
                lynxContext.LJLJJL.LIZIZ(new C49615Jdb(getSign(), "dismissoverlay"));
                C79784VSy.LIZIZ(this.LJLJL);
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
        if (this.LJLLILLLL) {
            LJJIII();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onAttach() {
        super.onAttach();
        if (this.LJLLJ) {
            this.LJLLL = VelocityTracker.obtain();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onDetach() {
        super.onDetach();
        if (this.LJLLJ) {
            try {
                VelocityTracker velocityTracker = this.LJLLL;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                }
            } catch (Throwable th) {
                LLog.LIZLLL(4, "x-overlay", th.toString());
            }
        }
        if (!this.LJLLI) {
            hide();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI, X.VPH
    public final void requestLayout() {
        super.requestLayout();
        if (this.LLD.getTransitionAnimator() != null || this.LLD.enableLayoutAnimation()) {
            this.LJZI.invalidate();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final int[] getOffsetDescendantRectToLynxView() {
        return this.LJZL;
    }

    public final boolean LJIJJLI(VPY vpy) {
        String str;
        if (vpy == null || !(vpy instanceof LynxBaseUI) || (vpy instanceof LynxOverlayViewNG) || (str = this.LJLJLJ) == null || str.length() == 0) {
            return false;
        }
        LynxBaseUI lynxBaseUI = this.LJLJLLL;
        if (lynxBaseUI != null) {
            return LJIL(lynxBaseUI);
        }
        if (!(vpy instanceof UIGroup)) {
            LJIJJLI(vpy.parent());
        }
        LynxBaseUI lynxBaseUI2 = (LynxBaseUI) vpy;
        if (o.LJ(this.LJLJLJ, lynxBaseUI2.getIdSelector())) {
            this.LJLJLLL = lynxBaseUI2;
            return LJIL(lynxBaseUI2);
        }
        return LJIJJLI(vpy.parent());
    }

    public final boolean LJIL(LynxBaseUI lynxBaseUI) {
        if (lynxBaseUI instanceof UIScrollView) {
            LynxUI lynxUI = (LynxUI) lynxBaseUI;
            VUG vug = (VUG) lynxUI.mView;
            o.LJFF(vug, "view.view");
            if (!vug.LJLLLLLL) {
                VUG vug2 = (VUG) lynxUI.mView;
                o.LJFF(vug2, "view.view");
                if (vug2.getRealScrollY() > 0) {
                    return true;
                }
                return false;
            }
        }
        if (lynxBaseUI instanceof UIList) {
            UIList uIList = (UIList) lynxBaseUI;
            if (uIList.LLF) {
                if (((RecyclerView) uIList.mView).computeVerticalScrollOffset() > 0) {
                    return true;
                }
                return false;
            }
        }
        if (lynxBaseUI instanceof LynxFoldView) {
            if (Math.abs(((BaseLynxFoldView) lynxBaseUI).LJLJJL) > 0) {
                return true;
            }
            return false;
        }
        if ((lynxBaseUI instanceof LynxFoldViewNG) && Math.abs(((BaseLynxFoldView) lynxBaseUI).LJLJJL) > 0) {
            return true;
        }
        return false;
    }

    public final void LJJI(int i) {
        String str;
        if (i != -2) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1) {
                        str = "";
                    } else {
                        str = "context is not activity";
                    }
                } else {
                    str = "success";
                }
            } else {
                str = "context is finishing";
            }
        } else {
            str = "context is destroyed";
        }
        VNU lynxContext = this.mContext;
        o.LJFF(lynxContext, "lynxContext");
        VNL vnl = lynxContext.LJLJJL;
        C49615Jdb c49615Jdb = new C49615Jdb(getSign(), "showoverlay");
        c49615Jdb.LIZJ(Integer.valueOf(i), "errorCode");
        c49615Jdb.LIZJ(str, "errorMsg");
        vnl.LIZIZ(c49615Jdb);
    }

    public final void LJJIFFI(int i) {
        Window window = this.LJZ.getWindow();
        if (window != null) {
            window.setType(i);
        }
    }

    public final void LJJII(boolean z) {
        Window window;
        View decorView;
        Integer valueOf;
        int intValue;
        int i;
        View decorView2;
        View decorView3;
        Window window2;
        View decorView4;
        Integer valueOf2;
        if (z) {
            Window window3 = this.LJZ.getWindow();
            if (window3 != null) {
                window3.addFlags(65792);
            }
            Window window4 = this.LJZ.getWindow();
            if (window4 != null) {
                window4.addFlags(LiveLayoutPreloadThreadPriority.DEFAULT);
            }
            Window window5 = this.LJZ.getWindow();
            if (window5 != null) {
                window5.setStatusBarColor(0);
            }
        } else {
            Window window6 = this.LJZ.getWindow();
            if (window6 != null) {
                window6.clearFlags(256);
            }
            Window window7 = this.LJZ.getWindow();
            if (window7 != null) {
                window7.clearFlags(65536);
            }
            Window window8 = this.LJZ.getWindow();
            if (window8 != null) {
                window8.clearFlags(LiveLayoutPreloadThreadPriority.DEFAULT);
            }
        }
        if (Build.VERSION.SDK_INT >= 23 && o.LJ(this.LJLJJLL, "lite")) {
            DialogC79783VSx dialogC79783VSx = this.LJZ;
            if (dialogC79783VSx != null && (window2 = dialogC79783VSx.getWindow()) != null && (decorView4 = window2.getDecorView()) != null && (valueOf2 = Integer.valueOf(decorView4.getSystemUiVisibility())) != null) {
                intValue = valueOf2.intValue();
                i = 9472;
            } else {
                o.LJIIZILJ();
                throw null;
            }
        } else {
            DialogC79783VSx dialogC79783VSx2 = this.LJZ;
            if (dialogC79783VSx2 != null && (window = dialogC79783VSx2.getWindow()) != null && (decorView = window.getDecorView()) != null && (valueOf = Integer.valueOf(decorView.getSystemUiVisibility())) != null) {
                intValue = valueOf.intValue();
                i = 1280;
            } else {
                o.LJIIZILJ();
                throw null;
            }
        }
        int i2 = intValue | i;
        if (z) {
            Window window9 = this.LJZ.getWindow();
            if (window9 != null && (decorView3 = window9.getDecorView()) != null) {
                decorView3.setSystemUiVisibility(i2);
                return;
            }
            return;
        }
        Window window10 = this.LJZ.getWindow();
        if (window10 == null || (decorView2 = window10.getDecorView()) == null) {
            return;
        }
        decorView2.setSystemUiVisibility(0);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        return new VRK(context);
    }

    @VPD(name = "always-show")
    public final void setAlwaysShow(boolean z) {
        this.LJLLI = z;
    }

    @VPD(name = "android-set-soft-input-mode")
    public final void setAndroidSetSoftInputMode(String value) {
        Window window;
        o.LJIIJ(value, "value");
        if ("unspecified".equals(value)) {
            Window window2 = this.LJZ.getWindow();
            if (window2 != null) {
                window2.setSoftInputMode(0);
                return;
            }
            return;
        }
        if ("nothing".equals(value)) {
            Window window3 = this.LJZ.getWindow();
            if (window3 == null) {
                return;
            }
            window3.setSoftInputMode(48);
            return;
        }
        if ("pan".equals(value)) {
            Window window4 = this.LJZ.getWindow();
            if (window4 == null) {
                return;
            }
            window4.setSoftInputMode(32);
            return;
        }
        if (!"resize".equals(value) || (window = this.LJZ.getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(16);
    }

    @VPD(name = "cut-out-mode")
    public final void setCutOutMode(boolean z) {
        Window window;
        WindowManager.LayoutParams attributes;
        int i;
        this.LJLJJI = z;
        DialogC79783VSx dialogC79783VSx = this.LJZ;
        if (dialogC79783VSx != null && (window = dialogC79783VSx.getWindow()) != null && (attributes = window.getAttributes()) != null && Build.VERSION.SDK_INT >= 28) {
            if (z) {
                i = 1;
            } else {
                i = 2;
            }
            attributes.layoutInDisplayCutoutMode = i;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setEvents(Map<String, VNA> map) {
        super.setEvents(map);
        if (map == null) {
            return;
        }
        boolean containsKey = map.containsKey("overlaymoved");
        this.LJLLJ = containsKey;
        if (containsKey) {
            this.LJLLL = VelocityTracker.obtain();
            DialogC79783VSx dialogC79783VSx = this.LJZ;
            if (dialogC79783VSx != null) {
                dialogC79783VSx.LJLIL = new VT3(this);
            }
        }
    }

    @VPD(name = "events-pass-through")
    public final void setEventsPassThrough(F5B eventsPassThrough) {
        o.LJIIJ(eventsPassThrough, "eventsPassThrough");
        ReadableType type = eventsPassThrough.getType();
        if (type == null) {
            return;
        }
        int i = VT2.LIZJ[type.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            this.LJLJJL = eventsPassThrough.asBoolean();
        } else {
            String asString = eventsPassThrough.asString();
            if (asString != null) {
                this.LJLJJL = Boolean.parseBoolean(asString);
            } else {
                o.LJIIZILJ();
                throw null;
            }
        }
    }

    @VPD(defaultInt = 1, name = "level")
    public final void setLevel(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        LJJIFFI(2);
                        return;
                    } else {
                        LJJIFFI(1000);
                        return;
                    }
                }
                LJJIFFI(1002);
                return;
            }
            LJJIFFI(1);
            return;
        }
        LJJIFFI(2);
    }

    @VPD(name = "nest-scroll")
    public final void setNestScroll(String id) {
        o.LJIIJ(id, "id");
        this.LJLJLJ = id;
        this.LJLJLLL = null;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setParent(VPH vph) {
        super.setParent(vph);
        if (vph == null) {
            hide();
        }
    }

    @VPD(name = "status-bar-translucent")
    public final void setStatusBarTranslucent(F5B statusBarTranslucent) {
        o.LJIIJ(statusBarTranslucent, "statusBarTranslucent");
        ReadableType type = statusBarTranslucent.getType();
        if (type != null) {
            int i = VT2.LIZIZ[type.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    this.LJLJI = statusBarTranslucent.asBoolean();
                }
            } else {
                String asString = statusBarTranslucent.asString();
                if (asString != null) {
                    this.LJLJI = Boolean.parseBoolean(asString);
                } else {
                    o.LJIIZILJ();
                    throw null;
                }
            }
        }
        LJJII(this.LJLJI);
    }

    @VPD(name = "status-bar-translucent-style")
    public final void setStatusBarTranslucentStyle(String str) {
        if (str == null) {
            str = "dark";
        }
        this.LJLJJLL = str;
        LJJII(this.LJLJI);
    }

    @VPD(name = "visible")
    public final void setVisible(F5B visible) {
        o.LJIIJ(visible, "visible");
        ReadableType type = visible.getType();
        if (type != null) {
            int i = VT2.LIZ[type.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    this.LJLILLLLZI = visible.asBoolean();
                }
            } else {
                String asString = visible.asString();
                if (asString != null) {
                    this.LJLILLLLZI = Boolean.parseBoolean(asString);
                } else {
                    o.LJIIZILJ();
                    throw null;
                }
            }
        }
        if (this.LJLILLLLZI) {
            Activity LJIIJJI = C78996UzQ.LJIIJJI(this.mContext);
            if (LJIIJJI != null && !LJIIJJI.isFinishing()) {
                try {
                    this.LJLJL = C79784VSy.LIZ(this.LJZ);
                    this.LJZ.getClass();
                    int LIZ = DialogC79783VSx.LIZ(LJIIJJI);
                    if (LIZ >= 0) {
                        LJJ(this.LJZ);
                    }
                    LJJI(LIZ);
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
    public LynxOverlayViewNG(VNU context, LynxOverlayViewProxyNG proxy) {
        super(context);
        o.LJIIJ(context, "context");
        o.LJIIJ(proxy, "proxy");
        this.LLD = proxy;
        this.LJLJI = true;
        this.LJLJJI = true;
        this.LJLJJL = true;
        this.LJLJJLL = "dark";
        this.LJLLI = true;
        this.LJLLILLLL = true;
        DialogC79783VSx dialogC79783VSx = new DialogC79783VSx(context, this);
        this.LJZ = dialogC79783VSx;
        VRN vrn = new VRN(this, context);
        this.LJZI = vrn;
        this.LJZL = new int[]{LiveLayoutPreloadThreadPriority.DEFAULT, LiveLayoutPreloadThreadPriority.DEFAULT};
        Window window = dialogC79783VSx.getWindow();
        if (window != null) {
            window.clearFlags(2);
        }
        Window window2 = dialogC79783VSx.getWindow();
        if (window2 != null) {
            window2.setDimAmount(0.0f);
        }
        vrn.addView(this.mView, -1, -1);
        dialogC79783VSx.setContentView(vrn, new ViewGroup.LayoutParams(-1, -1));
        dialogC79783VSx.setOnKeyListener(new DialogInterfaceOnKeyListenerC79780VSu(this));
        vrn.setClickable(true);
        vrn.setFocusable(true);
        vrn.setFocusableInTouchMode(true);
        this.LL = new VPV(context.LJFF());
        LJJII(this.LJLJI);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final void onInsertChild(LynxBaseUI lynxBaseUI, int i) {
        if (this.LJLLILLLL && this.LJZL[0] == Integer.MIN_VALUE) {
            LJJIII();
        }
        super.onInsertChild(lynxBaseUI, i);
    }
}
