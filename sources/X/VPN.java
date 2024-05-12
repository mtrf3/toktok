package X;

import Y.IDComparatorS344S0100000_14;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxFlattenUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.tasm.behavior.ui.UIShadowProxy;
import com.lynx.tasm.utils.DisplayMetricsHolder;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes15.dex */
public final class VPN extends AccessibilityNodeProvider {
    public final UIGroup LIZIZ;
    public final View LIZLLL;
    public final AccessibilityManager LJ;
    public boolean LJFF;
    public final ArrayList<VPP> LIZJ = new ArrayList<>();
    public boolean LJI = false;
    public boolean LJII = true;
    public boolean LJIIIIZZ = true;
    public final int LIZ = DisplayMetricsHolder.LIZIZ().heightPixels / 50;

    public VPN(UIGroup uIGroup) {
        this.LIZIZ = uIGroup;
        this.LIZLLL = uIGroup.getRealParentView();
        this.LJ = (AccessibilityManager) C16880lQ.LLIZLLLIL(uIGroup.mContext, "accessibility");
    }

    public static String LIZJ(LynxBaseUI lynxBaseUI) {
        CharSequence accessibilityLabel = lynxBaseUI.getAccessibilityLabel();
        if (accessibilityLabel == null) {
            accessibilityLabel = "";
        }
        return accessibilityLabel.toString();
    }

    public static Rect LJ(LynxBaseUI lynxBaseUI) {
        Rect rect = new Rect();
        if (lynxBaseUI instanceof LynxUI) {
            View view = ((LynxUI) lynxBaseUI).mView;
            if (lynxBaseUI instanceof UIShadowProxy) {
                LynxBaseUI lynxBaseUI2 = ((UIShadowProxy) lynxBaseUI).LJLIL;
                if (lynxBaseUI2 instanceof LynxUI) {
                    view = ((LynxUI) lynxBaseUI2).mView;
                }
            }
            LJFF(rect, view);
            int i = rect.left;
            rect.set(i, rect.top, lynxBaseUI.getWidth() + i, lynxBaseUI.getHeight() + rect.top);
        } else if (lynxBaseUI instanceof LynxFlattenUI) {
            LynxBaseUI parentBaseUI = lynxBaseUI.getParentBaseUI();
            while (true) {
                if (parentBaseUI == null) {
                    break;
                }
                if (!(parentBaseUI instanceof LynxUI)) {
                    parentBaseUI = parentBaseUI.getParentBaseUI();
                } else {
                    View view2 = ((LynxUI) parentBaseUI).mView;
                    if (parentBaseUI instanceof UIGroup) {
                        view2 = ((UIGroup) parentBaseUI).getRealParentView();
                    }
                    LJFF(rect, view2);
                    rect.offset(-view2.getScrollX(), -view2.getScrollY());
                    rect.offset(lynxBaseUI.getLeft(), lynxBaseUI.getTop());
                    int i2 = rect.left;
                    rect.set(i2, rect.top, lynxBaseUI.getWidth() + i2, lynxBaseUI.getHeight() + rect.top);
                }
            }
        }
        return rect;
    }

    public final void LIZIZ(View view) {
        boolean z;
        boolean z2 = true;
        if (view.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (view.getImportantForAccessibility() != 1 && (view.getImportantForAccessibility() == 2 || TextUtils.isEmpty(view.getContentDescription()))) {
            z2 = false;
        }
        if (z && z2) {
            Rect rect = new Rect();
            LJFF(rect, view);
            this.LIZJ.add(new VPP(rect, view));
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                LIZIZ(viewGroup.getChildAt(i));
            }
        }
    }

    public final String LIZLLL(LynxBaseUI lynxBaseUI) {
        if (!LJI(lynxBaseUI)) {
            return "";
        }
        String LIZJ = LIZJ(lynxBaseUI);
        if (TextUtils.isEmpty(LIZJ)) {
            for (LynxBaseUI lynxBaseUI2 : lynxBaseUI.mChildren) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append((Object) LIZJ);
                LIZ.append(LIZJ(lynxBaseUI2));
                LIZJ = X1D.LIZIZ(LIZ);
            }
        }
        LIZJ.toString();
        return LIZJ;
    }

    public final boolean LJI(LynxBaseUI lynxBaseUI) {
        if (lynxBaseUI == null) {
            return false;
        }
        int i = lynxBaseUI.mAccessibilityElementStatus;
        if (i == -1) {
            return this.LJII;
        }
        if (i != 1) {
            return false;
        }
        return true;
    }

    public final boolean LJII(MotionEvent motionEvent) {
        VPY hitTest = this.LIZIZ.hitTest((int) motionEvent.getX(), (int) motionEvent.getY());
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onHover with target = ");
        LIZ.append(hitTest);
        LIZ.append(" event: [");
        LIZ.append((int) motionEvent.getX());
        LIZ.append(", ");
        LIZ.append((int) motionEvent.getY());
        LIZ.append("]");
        LLog.LIZLLL(2, "LynxAccessibilityNodeProvider", X1D.LIZIZ(LIZ));
        while (hitTest != null && !(hitTest instanceof LynxBaseUI)) {
            hitTest = hitTest.parent();
        }
        if (hitTest == null || !(hitTest instanceof LynxBaseUI)) {
            return false;
        }
        LynxBaseUI lynxBaseUI = (LynxBaseUI) hitTest;
        while (!LJI(lynxBaseUI)) {
            lynxBaseUI = lynxBaseUI.getParentBaseUI();
            if (lynxBaseUI == null) {
                return false;
            }
        }
        int size = this.LIZJ.size() - 1;
        while (true) {
            if (size >= 0) {
                if (((VPP) ListProtector.get(this.LIZJ, size)).LIZ == lynxBaseUI) {
                    break;
                }
                size--;
            } else {
                size = -1;
                break;
            }
        }
        Rect rect = new Rect();
        LJFF(rect, this.LIZLLL);
        int x = ((int) motionEvent.getX()) + rect.left;
        int y = ((int) motionEvent.getY()) + rect.top;
        for (int size2 = this.LIZJ.size() - 1; size2 >= size && size2 >= 0; size2--) {
            if (((VPP) ListProtector.get(this.LIZJ, size2)).LIZJ.contains(x, y)) {
                size = size2;
                break;
            }
        }
        if (size < 0) {
            return false;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onHover confirm virtualViewId = ");
        LIZ2.append(size);
        LLog.LIZLLL(2, "LynxAccessibilityNodeProvider", X1D.LIZIZ(LIZ2));
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action != 9) {
                if (action == 10) {
                    LJIIIIZZ(motionEvent, size);
                }
            } else {
                motionEvent.setAction(9);
                LJIIIIZZ(motionEvent, size);
            }
        } else {
            LJIIIIZZ(motionEvent, size);
        }
        return true;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        AccessibilityNodeInfo obtain;
        boolean z;
        java.util.Map<String, VNA> map;
        java.util.Map<String, VNA> map2;
        VNU vnu;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("createAccessibilityNodeInfo: ");
        LIZ.append(i);
        LLog.LIZLLL(2, "LynxAccessibilityNodeProvider", X1D.LIZIZ(LIZ));
        if (i == -1) {
            obtain = AccessibilityNodeInfo.obtain(this.LIZLLL);
            this.LIZJ.clear();
            LIZ(this.LIZIZ, new ArrayList());
            Collections.sort(this.LIZJ, new IDComparatorS344S0100000_14(this, 0));
            if (this.LJI) {
                ArrayList arrayList = new ArrayList();
                Iterator<VPP> it = this.LIZJ.iterator();
                while (it.hasNext()) {
                    VPP next = it.next();
                    LynxBaseUI lynxBaseUI = next.LIZ;
                    if (lynxBaseUI != null && next.LIZLLL) {
                        ArrayList<String> arrayList2 = lynxBaseUI.mAccessibilityElements;
                        if (arrayList2 != null && (vnu = this.LIZIZ.mContext) != null && vnu.LJFF() != null) {
                            VOR LJFF = this.LIZIZ.mContext.LJFF();
                            Iterator<String> it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                LynxBaseUI LJI = LJFF.LJI(it2.next());
                                if (LJI != null && (!(LJI instanceof LynxUI) || C16330kX.LIZIZ(((LynxUI) LJI).mView))) {
                                    if (LJI instanceof UIShadowProxy) {
                                        LJI = ((UIShadowProxy) LJI).LJLIL;
                                    }
                                    if (LJI(LJI)) {
                                        arrayList.add(new VPP(LJI, LJ(LJI)));
                                    }
                                }
                            }
                        }
                    } else {
                        arrayList.add(next);
                    }
                }
                this.LIZJ.clear();
                this.LIZJ.addAll(arrayList);
                this.LJI = false;
            }
            this.LIZLLL.onInitializeAccessibilityNodeInfo(obtain);
            for (int i2 = 0; i2 < this.LIZJ.size(); i2++) {
                obtain.addChild(this.LIZLLL, i2);
            }
            Rect rect = new Rect();
            LJFF(rect, this.LIZLLL);
            int i3 = rect.left;
            rect.set(i3, rect.top, this.LIZIZ.getWidth() + i3, this.LIZIZ.getHeight() + rect.top);
        } else {
            if (i < 0 || i >= this.LIZJ.size()) {
                return null;
            }
            VPP vpp = (VPP) ListProtector.get(this.LIZJ, i);
            obtain = AccessibilityNodeInfo.obtain(this.LIZLLL, i);
            this.LIZLLL.onInitializeAccessibilityNodeInfo(obtain);
            LynxBaseUI lynxBaseUI2 = vpp.LIZ;
            if (lynxBaseUI2 != null) {
                Rect LJ = LJ(lynxBaseUI2);
                vpp.LIZJ = LJ;
                obtain.setBoundsInScreen(LJ);
                obtain.setClassName(vpp.LIZ.getClass().getName());
                String LIZLLL = LIZLLL(vpp.LIZ);
                obtain.setContentDescription(LIZLLL);
                obtain.setText(LIZLLL);
                obtain.setScrollable(vpp.LIZ.isScrollable());
                obtain.setLongClickable(vpp.LIZ.isLongClickable());
                obtain.setFocusable(vpp.LIZ.isFocusable());
                LynxBaseUI lynxBaseUI3 = vpp.LIZ;
                if (lynxBaseUI3 != null && (map2 = lynxBaseUI3.mEvents) != null && (map2.containsKey("click") || lynxBaseUI3.mEvents.containsKey("tap"))) {
                    z = true;
                } else {
                    z = false;
                }
                obtain.setClickable(z);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Label for UI: ");
                LIZ2.append(i);
                LIZ2.append(", ");
                C13870gZ.LIZJ(LIZ2, LIZLLL, LIZ2, 2, "LynxAccessibilityNodeProvider");
                LynxBaseUI lynxBaseUI4 = vpp.LIZ;
                if (lynxBaseUI4.mAccessibilityEnableTap && (map = lynxBaseUI4.mEvents) != null && (map.containsKey("click") || lynxBaseUI4.mEvents.containsKey("tap"))) {
                    obtain.addAction(16);
                }
            } else {
                View view = vpp.LIZIZ;
                if (view != null && C16330kX.LIZIZ(view)) {
                    vpp.LIZIZ.onInitializeAccessibilityNodeInfo(obtain);
                    obtain.setSource(this.LIZLLL, i);
                }
            }
            obtain.setParent(this.LIZLLL);
            obtain.addAction(64);
            obtain.setAccessibilityFocused(false);
            obtain.setFocused(false);
            obtain.addAction(4096);
            obtain.addAction(FileUtils.BUFFER_SIZE);
            obtain.setVisibleToUser(true);
        }
        return obtain;
    }

    public static void LJFF(Rect rect, View view) {
        rect.set(0, 0, view.getRight() - view.getLeft(), view.getBottom() - view.getTop());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.offset(iArr[0], iArr[1]);
    }

    public final void LIZ(LynxBaseUI lynxBaseUI, List<Rect> list) {
        if (lynxBaseUI.mAccessibilityElements != null) {
            VPP vpp = new VPP(lynxBaseUI, LJ(lynxBaseUI));
            vpp.LIZLLL = true;
            this.LIZJ.add(vpp);
            this.LJI = true;
            return;
        }
        for (int size = lynxBaseUI.getChildren().size() - 1; size >= 0; size--) {
            LynxBaseUI lynxBaseUI2 = (LynxBaseUI) ListProtector.get(lynxBaseUI.getChildren(), size);
            if ((!(lynxBaseUI2 instanceof LynxUI) || C16330kX.LIZIZ(((LynxUI) lynxBaseUI2).mView)) && !(lynxBaseUI2 instanceof VOI)) {
                LIZ(lynxBaseUI2, list);
            }
        }
        if (lynxBaseUI != this.LIZIZ) {
            if (lynxBaseUI instanceof UIShadowProxy) {
                lynxBaseUI = ((UIShadowProxy) lynxBaseUI).LJLIL;
            }
            if (LJI(lynxBaseUI)) {
                Rect LJ = LJ(lynxBaseUI);
                if (!this.LJIIIIZZ) {
                    ArrayList arrayList = (ArrayList) list;
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((Rect) it.next()).contains(LJ)) {
                                break;
                            }
                        } else {
                            this.LIZJ.add(new VPP(lynxBaseUI, LJ));
                            break;
                        }
                    }
                    arrayList.add(LJ);
                } else {
                    this.LIZJ.add(new VPP(lynxBaseUI, LJ));
                }
            }
            if ((lynxBaseUI instanceof LynxUI) && lynxBaseUI.mChildren.isEmpty()) {
                T t = ((LynxUI) lynxBaseUI).mView;
                if (t instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) t;
                    for (int i = 0; i < viewGroup.getChildCount(); i++) {
                        LIZIZ(viewGroup.getChildAt(i));
                    }
                }
            }
        }
    }

    public final void LJIIIIZZ(MotionEvent motionEvent, int i) {
        int action = motionEvent.getAction();
        if (!this.LJFF) {
            if (action == 9 || action == 7) {
                LJIIIZ(i, 128);
                this.LJFF = true;
            }
        } else if (action == 10 || action == 7) {
            this.LJFF = false;
            LJIIIZ(i, 256);
        }
        if (action != 9) {
            if (action != 10) {
                return;
            }
            this.LIZLLL.setHovered(false);
            return;
        }
        this.LIZLLL.setHovered(true);
    }

    public final void LJIIIZ(int i, int i2) {
        if (this.LJ.isTouchExplorationEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
            if (i >= 0) {
                VPP vpp = (VPP) ListProtector.get(this.LIZJ, i);
                if (vpp.LIZ != null) {
                    obtain.setPackageName(this.LIZLLL.getContext().getPackageName());
                    obtain.setClassName(vpp.LIZ.getClass().getName());
                    obtain.setEnabled(true);
                    obtain.setContentDescription(LIZLLL(vpp.LIZ));
                } else {
                    View view = vpp.LIZIZ;
                    if (view != null) {
                        view.onInitializeAccessibilityEvent(obtain);
                    } else {
                        return;
                    }
                }
                obtain.setSource(this.LIZLLL, i);
                this.LIZLLL.invalidate();
                if (this.LIZLLL.getParent() == null) {
                    LLog.LIZLLL(4, "LynxAccessibilityNodeProvider", "sendAccessibilityEventForLynxUI failed, parent is null.");
                } else {
                    this.LIZLLL.getParent().requestSendAccessibilityEvent(this.LIZLLL, obtain);
                }
            }
        }
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
        LynxBaseUI lynxBaseUI;
        String LIZJ;
        String LIZJ2;
        ArrayList arrayList = new ArrayList();
        if (str == null) {
            return arrayList;
        }
        String lowerCase = str.toLowerCase();
        if (i == -1) {
            for (int i2 = 0; i2 < this.LIZJ.size(); i2++) {
                if (((VPP) ListProtector.get(this.LIZJ, i2)).LIZ != null && (LIZJ2 = LIZJ(((VPP) ListProtector.get(this.LIZJ, i2)).LIZ)) != null) {
                    LIZJ2.toString();
                    if (LIZJ2.toLowerCase().contains(lowerCase)) {
                        arrayList.add(createAccessibilityNodeInfo(i2));
                    }
                }
            }
        } else if (i > 0 && i < this.LIZJ.size() && (lynxBaseUI = ((VPP) ListProtector.get(this.LIZJ, i)).LIZ) != null && (LIZJ = LIZJ(lynxBaseUI)) != null) {
            LIZJ.toString();
            if (LIZJ.toLowerCase().contains(lowerCase)) {
                arrayList.add(createAccessibilityNodeInfo(i));
            }
        }
        return arrayList;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        VNU vnu;
        LLog.LIZLLL(2, "LynxAccessibilityNodeProvider", C48263Iwt.LIZLLL("performAction on virtualViewId ", i, " action ", i2));
        if (i != -1 && i >= 0 && i < this.LIZJ.size()) {
            if (i2 != 16) {
                if (i2 != 64) {
                    if (i2 == 128) {
                        LJIIIZ(i, 65536);
                        return true;
                    }
                } else {
                    LJIIIZ(i, 32768);
                    LJIIIZ(i, 4);
                    return true;
                }
            } else {
                VPP vpp = (VPP) ListProtector.get(this.LIZJ, i);
                LynxBaseUI lynxBaseUI = vpp.LIZ;
                if (lynxBaseUI != null && (vnu = lynxBaseUI.mContext) != null && vnu.LJLJJL != null && lynxBaseUI.mAccessibilityEnableTap) {
                    Rect rect = vpp.LIZJ;
                    PPO ppo = new PPO(rect.centerX(), rect.centerY());
                    PPO ppo2 = new PPO(rect.centerX() - rect.left, rect.centerY() - rect.top);
                    java.util.Map<String, VNA> map = lynxBaseUI.mEvents;
                    if (map != null) {
                        if (map.containsKey("tap")) {
                            lynxBaseUI.mContext.LJLJJL.LIZJ(new VNM(lynxBaseUI.getSign(), "tap", ppo2, ppo2, ppo));
                        } else if (lynxBaseUI.mEvents.containsKey("click")) {
                            lynxBaseUI.mContext.LJLJJL.LIZJ(new VNM(lynxBaseUI.getSign(), "click", ppo2, ppo2, ppo));
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
