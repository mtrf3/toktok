package X;

import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.UIGroup;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes15.dex */
public final class VPJ extends C16120kC {
    public final AccessibilityManager LIZ;
    public final UIGroup LIZIZ;
    public final View LIZJ;
    public VPM LJFF;
    public LynxBaseUI LJII;
    public InterfaceC79645VNp LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public final VFM LJIILIIL;
    public final VFN LJIILJJIL;
    public int LIZLLL = LiveLayoutPreloadThreadPriority.DEFAULT;
    public int LJ = LiveLayoutPreloadThreadPriority.DEFAULT;
    public boolean LJI = true;
    public final ArrayList<JavaOnlyMap> LJIIJJI = new ArrayList<>();
    public final java.util.Set<String> LJIIL = new HashSet();

    public static String LJ(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "" : "style_update" : "update" : "detach" : "remove" : "insert";
    }

    public final boolean LIZLLL() {
        if (this.LIZ != null && this.LJIIIZ && this.LJIIJ) {
            return true;
        }
        return false;
    }

    public VPJ(UIGroup uIGroup) {
        this.LJIILIIL = null;
        this.LJIILJJIL = null;
        if (uIGroup != null && uIGroup.getAccessibilityHostView() != null) {
            this.LIZIZ = uIGroup;
            View accessibilityHostView = uIGroup.getAccessibilityHostView();
            this.LIZJ = accessibilityHostView;
            AccessibilityManager accessibilityManager = (AccessibilityManager) C16880lQ.LLIZLLLIL(uIGroup.mContext, "accessibility");
            this.LIZ = accessibilityManager;
            this.LJIIIZ = accessibilityManager.isEnabled();
            this.LJIIJ = accessibilityManager.isTouchExplorationEnabled();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Create LynxAccessibilityDelegate with mAccessibilityEnable = ");
            LIZ.append(this.LJIIIZ);
            LIZ.append(", mTouchExplorationEnable = ");
            LIZ.append(this.LJIIJ);
            LLog.LIZLLL(2, "LynxA11yDelegate", X1D.LIZIZ(LIZ));
            VFM vfm = new VFM(this);
            this.LJIILIIL = vfm;
            accessibilityManager.addAccessibilityStateChangeListener(vfm);
            VFN vfn = new VFN(this);
            this.LJIILJJIL = vfn;
            accessibilityManager.addTouchExplorationStateChangeListener(vfn);
            this.LJFF = new VPM(this);
            accessibilityHostView.setFocusable(true);
            if (C16300kU.LIZJ(accessibilityHostView) == 0) {
                C16300kU.LJIJ(accessibilityHostView, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("host ui or host view is null");
    }

    public final boolean LIZ(MotionEvent motionEvent) {
        if (!LIZLLL()) {
            return false;
        }
        VPY hitTest = this.LIZIZ.hitTest((int) motionEvent.getX(), (int) motionEvent.getY());
        while (true) {
            if (hitTest == null) {
                break;
            }
            if (!(hitTest instanceof LynxBaseUI)) {
                hitTest = hitTest.parent();
            } else if (hitTest instanceof LynxBaseUI) {
                LynxBaseUI lynxBaseUI = (LynxBaseUI) hitTest;
                while (!this.LJFF.LJIILJJIL(lynxBaseUI)) {
                    lynxBaseUI = lynxBaseUI.getParentBaseUI();
                    if (lynxBaseUI == null) {
                        return false;
                    }
                }
                int LJIIIIZZ = this.LJFF.LJIIIIZZ(lynxBaseUI);
                if (LJIIIIZZ == -1) {
                    return false;
                }
                int action = motionEvent.getAction();
                if (action != 9) {
                    if (action != 10) {
                        return false;
                    }
                    int i = this.LJ;
                    if (i != Integer.MIN_VALUE && i != Integer.MIN_VALUE) {
                        LJI(LiveLayoutPreloadThreadPriority.DEFAULT, 128);
                        LJI(this.LJ, 256);
                        this.LJ = LiveLayoutPreloadThreadPriority.DEFAULT;
                    }
                    return true;
                }
                if (this.LJ != LJIIIIZZ) {
                    LJI(LJIIIIZZ, 128);
                    LJI(this.LJ, 256);
                    this.LJ = LJIIIIZZ;
                }
                return true;
            }
        }
        return false;
    }

    public final boolean LJFF(int i) {
        int i2;
        LynxBaseUI lynxBaseUI;
        if (!LIZLLL() || (i2 = this.LIZLLL) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.LIZLLL = LiveLayoutPreloadThreadPriority.DEFAULT;
            this.LIZJ.invalidate();
            this.LJII = null;
            LJI(i2, 65536);
        }
        this.LIZLLL = i;
        this.LJII = ((VPQ) ListProtector.get(this.LJFF.LJII, i)).LIZ;
        this.LIZJ.invalidate();
        LJI(i, 32768);
        if (this.LJIIIIZZ != null && (lynxBaseUI = this.LJII) != null && lynxBaseUI.mContext != null) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            javaOnlyMap.put("element-id", Integer.valueOf(lynxBaseUI.getSign()));
            javaOnlyMap.put("a11y-id", lynxBaseUI.mAccessibilityId);
            JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
            javaOnlyArray.pushMap(javaOnlyMap);
            lynxBaseUI.mContext.LJIIJJI("activeElement", javaOnlyArray);
            return true;
        }
        return true;
    }

    @Override // X.C16120kC
    public final C17780ms getAccessibilityNodeProvider(View view) {
        if (this.LJFF == null) {
            this.LJFF = new VPM(this);
        }
        return this.LJFF;
    }

    public final void LJI(int i, int i2) {
        ViewParent parent;
        AccessibilityEvent obtain;
        if (i == Integer.MIN_VALUE || !LIZLLL() || (parent = this.LIZJ.getParent()) == null) {
            return;
        }
        if (i != -1) {
            obtain = AccessibilityEvent.obtain(i2);
            C17760mq LJ = this.LJFF.LJ(i);
            obtain.getText().add(LJ.LJI());
            obtain.setContentDescription(LJ.LJ());
            obtain.setScrollable(LJ.LIZ.isScrollable());
            obtain.setPassword(LJ.LIZ.isPassword());
            obtain.setEnabled(LJ.LIZ.isEnabled());
            obtain.setChecked(LJ.LIZ.isChecked());
            obtain.setClassName(LJ.LIZ.getClassName());
            C17800mu.LIZ(obtain, this.LIZJ, i);
            obtain.setPackageName(this.LIZJ.getContext().getPackageName());
        } else {
            obtain = AccessibilityEvent.obtain(i2);
            this.LIZJ.onInitializeAccessibilityEvent(obtain);
        }
        parent.requestSendAccessibilityEvent(this.LIZJ, obtain);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZIZ(LynxBaseUI lynxBaseUI, boolean z, JavaOnlyArray javaOnlyArray) {
        String str;
        if (lynxBaseUI != 0) {
            if (!z) {
                JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
                javaOnlyMap.putInt("element-id", lynxBaseUI.getSign());
                javaOnlyMap.putString("a11y-id", lynxBaseUI.mAccessibilityId);
                javaOnlyArray.add(javaOnlyMap);
            } else if (lynxBaseUI instanceof VPL) {
                Layout LJIILIIL = ((VPL) lynxBaseUI).LJIILIIL();
                if (LJIILIIL != null && LJIILIIL.getText() != null) {
                    str = LJIILIIL.getText().toString();
                } else {
                    str = "";
                }
                javaOnlyArray.pushString(str);
            }
            for (int i = 0; i < lynxBaseUI.getChildren().size(); i++) {
                LIZIZ((LynxBaseUI) ListProtector.get(lynxBaseUI.getChildren(), i), z, javaOnlyArray);
            }
        }
    }

    public final void LIZJ(int i, LynxBaseUI lynxBaseUI, String str) {
        if (lynxBaseUI != null && !LJ(i).isEmpty()) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            javaOnlyMap.putInt("target", lynxBaseUI.getSign());
            javaOnlyMap.putString("action", LJ(i));
            javaOnlyMap.putString("a11y-id", lynxBaseUI.mAccessibilityId);
            if (i == 4) {
                if (!((HashSet) this.LJIIL).contains(str)) {
                    return;
                } else {
                    javaOnlyMap.putString("style", str);
                }
            }
            this.LJIIJJI.add(javaOnlyMap);
        }
    }
}
