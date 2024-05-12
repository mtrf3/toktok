package com.ss.android.elearning.lingo.lynx.component.overlay;

import X.C03880Dg;
import X.C49615Jdb;
import X.C65300Pk0;
import X.C78996UzQ;
import X.C79785VSz;
import X.DialogC79782VSw;
import X.EnumC79647VNr;
import X.F5B;
import X.VNA;
import X.VNL;
import X.VNU;
import X.VPD;
import X.VPH;
import X.VPV;
import X.VPY;
import X.VRJ;
import X.VRK;
import X.VRL;
import X.VT4;
import X.VUG;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
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
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.tasm.behavior.ui.list.UIList;
import com.lynx.tasm.behavior.ui.scroll.UIScrollView;
import com.ss.android.elearning.lingo.lynx.component.overlay.LynxOverlayViewNG;
import java.util.Map;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class LynxOverlayViewNG extends UIGroup<VRK> {
    public static final /* synthetic */ int LLF = 0;
    public final LynxOverlayViewProxyNG LJLIL;
    public int LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public String LJLJL;
    public String LJLJLJ;
    public String LJLJLLL;
    public LynxBaseUI LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public final boolean LJLLJ;
    public boolean LJLLL;
    public VelocityTracker LJLLLL;
    public float LJLLLLLL;
    public float LJLZ;
    public Boolean LJZ;
    public final DialogC79782VSw LJZI;
    public final VRL LJZL;
    public final int[] LL;
    public final VPV LLD;

    public static void LJJ(DialogC79782VSw dialogC79782VSw) {
        if (new C03880Dg(2).LIZJ(300000, "com/ss/android/elearning/lingo/lynx/component/overlay/LynxOverlayDialogNG", "show", dialogC79782VSw, new Object[0], "void", new C65300Pk0(false, "()V", "-6295483393243457775")).LIZ) {
            return;
        }
        dialogC79782VSw.show();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean isUserInteractionEnabled() {
        return false;
    }

    public final void LJJIII() {
        int[] iArr = {0, 0};
        int[] iArr2 = {0, 0};
        this.mContext.LJLJLLL.LJLIL.getLocationOnScreen(iArr);
        this.mView.getLocationOnScreen(iArr2);
        int[] iArr3 = this.LL;
        iArr3[0] = iArr2[0] - iArr[0];
        iArr3[1] = iArr2[1] - iArr[1];
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        if (this.LJZI.isShowing()) {
            try {
                this.LJZI.dismiss();
                C79785VSz.LIZIZ(this.LJLJLJ);
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
        if (this.LJLLJ && this.LL[0] == Integer.MIN_VALUE) {
            LJJIII();
        }
        Rect boundingClientRect = super.getBoundingClientRect();
        o.LJIIIIZZ(boundingClientRect, "super.getBoundingClientRect()");
        return boundingClientRect;
    }

    public final void hide() {
        if (this.LJZI.isShowing()) {
            try {
                DialogC79782VSw dialogC79782VSw = this.LJZI;
                if (!dialogC79782VSw.LJLJJI && dialogC79782VSw.LJLJI != null) {
                    try {
                        new AqS164S0100000_14(dialogC79782VSw, 377).invoke();
                    } catch (Throwable unused) {
                    }
                }
                this.LJZI.dismiss();
                this.mContext.LJLJJL.LIZIZ(new C49615Jdb(getSign(), "dismissoverlay"));
                C79785VSz.LIZIZ(this.LJLJLJ);
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
        if (this.LJLLJ) {
            LJJIII();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onAttach() {
        super.onAttach();
        if (this.LJLLL) {
            this.LJLLLL = VelocityTracker.obtain();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onDetach() {
        super.onDetach();
        if (this.LJLLL) {
            try {
                VelocityTracker velocityTracker = this.LJLLLL;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                }
            } catch (Throwable th) {
                LLog.LIZLLL(4, "x-overlay", th.toString());
            }
        }
        if (!this.LJLLILLLL) {
            hide();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI, X.VPH
    public final void requestLayout() {
        super.requestLayout();
        if (this.LJLIL.getTransitionAnimator() != null || this.LJLIL.enableLayoutAnimation()) {
            this.LJZL.invalidate();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final int[] getOffsetDescendantRectToLynxView() {
        return this.LL;
    }

    public final boolean LJIJJLI(VPY vpy) {
        String str;
        if (vpy == null || !(vpy instanceof LynxBaseUI) || (vpy instanceof LynxOverlayViewNG) || (str = this.LJLJLLL) == null || str.length() == 0) {
            return false;
        }
        LynxBaseUI lynxBaseUI = this.LJLL;
        if (lynxBaseUI != null) {
            return LJIL(lynxBaseUI);
        }
        if (!(vpy instanceof UIGroup)) {
            LJIJJLI(((LynxBaseUI) vpy).parent());
        }
        LynxBaseUI lynxBaseUI2 = (LynxBaseUI) vpy;
        if (o.LJ(this.LJLJLLL, lynxBaseUI2.getIdSelector())) {
            this.LJLL = lynxBaseUI2;
            return LJIL(lynxBaseUI2);
        }
        return LJIJJLI(lynxBaseUI2.parent());
    }

    public final boolean LJIL(LynxBaseUI lynxBaseUI) {
        if (lynxBaseUI instanceof UIScrollView) {
            VUG vug = (VUG) ((LynxUI) lynxBaseUI).mView;
            if (!vug.LJLLLLLL) {
                if (vug.getRealScrollY() > 0) {
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
        VNL vnl = this.mContext.LJLJJL;
        C49615Jdb c49615Jdb = new C49615Jdb(getSign(), "showoverlay");
        c49615Jdb.LIZJ(Integer.valueOf(i), "errorCode");
        c49615Jdb.LIZJ(str, "errorMsg");
        vnl.LIZIZ(c49615Jdb);
    }

    public final void LJJIFFI(int i) {
        Window window = this.LJZI.getWindow();
        if (window != null) {
            window.setType(i);
        }
    }

    public final void LJJII(boolean z) {
        int intValue;
        int i;
        Window window;
        View decorView;
        View decorView2;
        View decorView3;
        Window window2;
        View decorView4;
        if (z) {
            Window window3 = this.LJZI.getWindow();
            if (window3 != null) {
                window3.addFlags(65792);
            }
            Window window4 = this.LJZI.getWindow();
            if (window4 != null) {
                window4.addFlags(LiveLayoutPreloadThreadPriority.DEFAULT);
            }
            Window window5 = this.LJZI.getWindow();
            if (window5 != null) {
                window5.setStatusBarColor(0);
            }
        } else {
            Window window6 = this.LJZI.getWindow();
            if (window6 != null) {
                window6.clearFlags(256);
            }
            Window window7 = this.LJZI.getWindow();
            if (window7 != null) {
                window7.clearFlags(65536);
            }
            Window window8 = this.LJZI.getWindow();
            if (window8 != null) {
                window8.clearFlags(LiveLayoutPreloadThreadPriority.DEFAULT);
            }
        }
        Integer num = null;
        if (Build.VERSION.SDK_INT >= 23 && o.LJ(this.LJLJL, "lite")) {
            DialogC79782VSw dialogC79782VSw = this.LJZI;
            if (dialogC79782VSw != null && (window2 = dialogC79782VSw.getWindow()) != null && (decorView4 = window2.getDecorView()) != null) {
                num = Integer.valueOf(decorView4.getSystemUiVisibility());
            }
            o.LJI(num);
            intValue = num.intValue();
            i = 9472;
        } else {
            DialogC79782VSw dialogC79782VSw2 = this.LJZI;
            if (dialogC79782VSw2 != null && (window = dialogC79782VSw2.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                num = Integer.valueOf(decorView.getSystemUiVisibility());
            }
            o.LJI(num);
            intValue = num.intValue();
            i = 1280;
        }
        int i2 = intValue | i;
        if (z) {
            Window window9 = this.LJZI.getWindow();
            if (window9 == null || (decorView3 = window9.getDecorView()) == null) {
                return;
            }
            decorView3.setSystemUiVisibility(i2);
            return;
        }
        Window window10 = this.LJZI.getWindow();
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
        this.LJLLILLLL = z;
    }

    @VPD(name = "android-set-soft-input-mode")
    public final void setAndroidSetSoftInputMode(String value) {
        Window window;
        o.LJIIIZ(value, "value");
        if ("unspecified".equals(value)) {
            Window window2 = this.LJZI.getWindow();
            if (window2 != null) {
                window2.setSoftInputMode(0);
                return;
            }
            return;
        }
        if ("nothing".equals(value)) {
            Window window3 = this.LJZI.getWindow();
            if (window3 == null) {
                return;
            }
            window3.setSoftInputMode(48);
            return;
        }
        if ("pan".equals(value)) {
            Window window4 = this.LJZI.getWindow();
            if (window4 == null) {
                return;
            }
            window4.setSoftInputMode(32);
            return;
        }
        if (!"resize".equals(value) || (window = this.LJZI.getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(16);
    }

    @VPD(name = "cut-out-mode")
    public final void setCutOutMode(boolean z) {
        Window window;
        WindowManager.LayoutParams attributes;
        int i;
        this.LJLJJL = z;
        DialogC79782VSw dialogC79782VSw = this.LJZI;
        if (dialogC79782VSw != null && (window = dialogC79782VSw.getWindow()) != null && (attributes = window.getAttributes()) != null && Build.VERSION.SDK_INT >= 28) {
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
        DialogC79782VSw dialogC79782VSw;
        super.setEvents(map);
        if (map == null) {
            return;
        }
        boolean containsKey = map.containsKey("overlaymoved");
        this.LJLLL = containsKey;
        if (containsKey && (dialogC79782VSw = this.LJZI) != null) {
            dialogC79782VSw.LJLILLLLZI = new VT4(this);
        }
    }

    @VPD(name = "events-pass-through")
    public final void setEventsPassThrough(F5B eventsPassThrough) {
        o.LJIIIZ(eventsPassThrough, "eventsPassThrough");
        ReadableType type = eventsPassThrough.getType();
        if (type == null) {
            return;
        }
        int i = VRJ.LIZ[type.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            this.LJLJJLL = eventsPassThrough.asBoolean();
        } else {
            String asString = eventsPassThrough.asString();
            o.LJI(asString);
            this.LJLJJLL = Boolean.parseBoolean(asString);
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
        o.LJIIIZ(id, "id");
        this.LJLJLLL = id;
        this.LJLL = null;
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
        o.LJIIIZ(statusBarTranslucent, "statusBarTranslucent");
        ReadableType type = statusBarTranslucent.getType();
        if (type != null) {
            int i = VRJ.LIZ[type.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    this.LJLJJI = statusBarTranslucent.asBoolean();
                }
            } else {
                String asString = statusBarTranslucent.asString();
                o.LJI(asString);
                this.LJLJJI = Boolean.parseBoolean(asString);
            }
        }
        LJJII(this.LJLJJI);
    }

    @VPD(name = "status-bar-translucent-style")
    public final void setStatusBarTranslucentStyle(String str) {
        if (str == null) {
            str = "dark";
        }
        this.LJLJL = str;
        LJJII(this.LJLJJI);
    }

    @VPD(name = "visible")
    public final void setVisible(F5B visible) {
        o.LJIIIZ(visible, "visible");
        ReadableType type = visible.getType();
        if (type != null) {
            int i = VRJ.LIZ[type.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    this.LJLJI = visible.asBoolean();
                }
            } else {
                String asString = visible.asString();
                o.LJI(asString);
                this.LJLJI = Boolean.parseBoolean(asString);
            }
        }
        if (this.LJLJI) {
            Activity LJIIJJI = C78996UzQ.LJIIJJI(this.mContext);
            if (LJIIJJI != null && !LJIIJJI.isFinishing()) {
                try {
                    this.LJLJLJ = C79785VSz.LIZ(this.LJZI);
                    this.LJZI.getClass();
                    int LIZ = DialogC79782VSw.LIZ(LJIIJJI);
                    if (LIZ >= 0) {
                        LJJ(this.LJZI);
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
        o.LJIIIZ(context, "context");
        o.LJIIIZ(proxy, "proxy");
        this.LJLIL = proxy;
        this.LJLJJI = true;
        this.LJLJJL = true;
        this.LJLJJLL = true;
        this.LJLJL = "dark";
        this.LJLLILLLL = true;
        this.LJLLJ = true;
        DialogC79782VSw dialogC79782VSw = new DialogC79782VSw(context, this);
        this.LJZI = dialogC79782VSw;
        VRL vrl = new VRL(context, this);
        this.LJZL = vrl;
        this.LL = new int[]{LiveLayoutPreloadThreadPriority.DEFAULT, LiveLayoutPreloadThreadPriority.DEFAULT};
        Window window = dialogC79782VSw.getWindow();
        if (window != null) {
            window.clearFlags(2);
        }
        Window window2 = dialogC79782VSw.getWindow();
        if (window2 != null) {
            window2.setDimAmount(0.0f);
        }
        vrl.addView(this.mView, -1, -1);
        dialogC79782VSw.setContentView(vrl, new ViewGroup.LayoutParams(-1, -1));
        dialogC79782VSw.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: X.VSv
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                LynxOverlayViewNG this$0 = LynxOverlayViewNG.this;
                o.LJIIIZ(this$0, "this$0");
                if (i == 4 && keyEvent.getAction() == 0) {
                    this$0.mContext.LJLJJL.LIZIZ(new C49615Jdb(this$0.getSign(), "requestclose"));
                    return true;
                }
                return false;
            }
        });
        vrl.setClickable(true);
        vrl.setFocusable(true);
        vrl.setFocusableInTouchMode(true);
        this.LLD = new VPV(context.LJFF());
        this.LJLLLL = VelocityTracker.obtain();
        LJJII(this.LJLJJI);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final void onInsertChild(LynxBaseUI lynxBaseUI, int i) {
        if (this.LJLLJ && this.LL[0] == Integer.MIN_VALUE) {
            LJJIII();
        }
        super.onInsertChild(lynxBaseUI, i);
    }
}
