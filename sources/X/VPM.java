package X;

import android.graphics.Rect;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxFlattenUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.tasm.behavior.ui.UIShadowProxy;
import com.lynx.tasm.behavior.ui.list.UIList;
import com.lynx.tasm.behavior.ui.view.UIComponent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes15.dex */
public final class VPM extends C17780ms {
    public static final Rect LJIIIIZZ = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, LiveLayoutPreloadThreadPriority.DEFAULT, LiveLayoutPreloadThreadPriority.DEFAULT);
    public final WeakReference<VPJ> LIZIZ;
    public final UIGroup LIZJ;
    public final View LIZLLL;
    public final int LJ;
    public final int LJFF;
    public boolean LJI;
    public final ArrayList<VPQ> LJII;

    public final C17760mq LJFF() {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.LIZLLL);
        C17760mq c17760mq = new C17760mq(obtain);
        this.LIZLLL.onInitializeAccessibilityNodeInfo(obtain);
        LJI(this.LIZJ, this.LJII);
        if (obtain.getChildCount() > 0 && this.LJII.size() > 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Views cannot have both real and virtual children, with real child count = ");
            LIZ.append(obtain.getChildCount());
            LIZ.append("and virtual child count = ");
            LIZ.append(this.LJII.size());
            LLog.LIZLLL(4, "LynxA11yNodeProvider", X1D.LIZIZ(LIZ));
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("createNodeForHost with child count = ");
        LIZ2.append(this.LJII.size());
        LLog.LIZLLL(2, "LynxA11yNodeProvider", X1D.LIZIZ(LIZ2));
        for (int i = 0; i < this.LJII.size(); i++) {
            c17760mq.LIZ.addChild(this.LIZLLL, i);
        }
        LynxBaseUI lynxBaseUI = this.LIZIZ.get().LJII;
        int i2 = this.LIZIZ.get().LIZLLL;
        if (lynxBaseUI != null && lynxBaseUI.mAccessibilityKeepFocused && i2 != -1) {
            for (int i3 = 0; i3 < this.LJII.size(); i3++) {
                LynxBaseUI lynxBaseUI2 = ((VPQ) ListProtector.get(this.LJII, i3)).LIZ;
                if (lynxBaseUI2 != null && lynxBaseUI2 == lynxBaseUI && i3 != i2 && LJIIL(lynxBaseUI2, new Rect())) {
                    LIZLLL(i3, 64, null);
                }
            }
        }
        return c17760mq;
    }

    public VPM(VPJ vpj) {
        if (vpj != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Create LynxNodeProvider for ");
            LIZ.append(vpj.LIZIZ);
            LLog.LIZLLL(2, "LynxA11yNodeProvider", X1D.LIZIZ(LIZ));
            this.LIZIZ = new WeakReference<>(vpj);
            UIGroup uIGroup = vpj.LIZIZ;
            this.LIZJ = uIGroup;
            this.LIZLLL = vpj.LIZJ;
            this.LJII = new ArrayList<>();
            DisplayMetrics displayMetrics = uIGroup.mContext.LJLZ;
            this.LJ = displayMetrics.widthPixels / 50;
            this.LJFF = displayMetrics.heightPixels / 50;
        }
    }

    public static String LJIIIZ(LynxBaseUI lynxBaseUI) {
        CharSequence accessibilityLabel = lynxBaseUI.getAccessibilityLabel();
        if (accessibilityLabel == null) {
            accessibilityLabel = "";
        }
        return accessibilityLabel.toString();
    }

    public static Rect LJIIJ(LynxBaseUI lynxBaseUI) {
        Rect rect = new Rect();
        if (lynxBaseUI instanceof LynxUI) {
            View view = ((LynxUI) lynxBaseUI).mView;
            if (lynxBaseUI instanceof UIShadowProxy) {
                LynxBaseUI lynxBaseUI2 = ((UIShadowProxy) lynxBaseUI).LJLIL;
                if (lynxBaseUI2 instanceof LynxUI) {
                    view = ((LynxUI) lynxBaseUI2).mView;
                }
            }
            LJIIJJI(rect, view);
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
                        view2 = ((UIGroup) parentBaseUI).getAccessibilityHostView();
                    }
                    LJIIJJI(rect, view2);
                    rect.offset(-view2.getScrollX(), -view2.getScrollY());
                    rect.offset(lynxBaseUI.getLeft(), lynxBaseUI.getTop());
                    int i2 = rect.left;
                    rect.set(i2, rect.top, lynxBaseUI.getWidth() + i2, lynxBaseUI.getHeight() + rect.top);
                }
            }
        }
        return rect;
    }

    @Override // X.C17780ms
    public final C17760mq LIZ(int i) {
        VPQ vpq;
        try {
            if (-1 == i) {
                return new C17760mq(AccessibilityNodeInfo.obtain(LJFF().LIZ));
            }
            C17760mq c17760mq = new C17760mq(AccessibilityNodeInfo.obtain(LJ(i).LIZ));
            if (i != -1 && i < this.LJII.size() && (vpq = (VPQ) ListProtector.get(this.LJII, i)) != null) {
                LynxBaseUI lynxBaseUI = vpq.LIZ;
                if ((lynxBaseUI instanceof LynxUI) && ((LynxUI) lynxBaseUI).mView != 0) {
                    C16300kU.LJIJ(((LynxUI) lynxBaseUI).mView, 2);
                }
            }
            return c17760mq;
        } catch (Exception e) {
            StringBuilder LJ = C7MY.LJ("createAccessibilityNodeInfo with virtual view id = ", i, " with virtual children size = ");
            LJ.append(this.LJII.size());
            LJ.append(", and exception msg = ");
            LJ.append(e.getMessage());
            LLog.LIZLLL(4, "LynxA11yNodeProvider", X1D.LIZIZ(LJ));
            return new C17760mq(AccessibilityNodeInfo.obtain());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0064, code lost:
    
        if ((r1 instanceof com.lynx.tasm.behavior.ui.UIGroup) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006a, code lost:
    
        if (r1.isScrollContainer() == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006c, code lost:
    
        r0 = ((com.lynx.tasm.behavior.ui.UIGroup) r1).getAccessibilityHostView();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0073, code lost:
    
        if (r0 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0075, code lost:
    
        r4.LJJI(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0078, code lost:
    
        r1 = r6.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007e, code lost:
    
        if (LJIILJJIL(r1) != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0080, code lost:
    
        r3 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0082, code lost:
    
        r4.LJJIIJ(r3);
        r4.LJIJ(r3);
        r4.LJIILJJIL(r6.LIZ.getClass().getName());
        r2 = r6.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0098, code lost:
    
        if (r2 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009e, code lost:
    
        if (r2.getEvents() == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00aa, code lost:
    
        if (r2.getEvents().containsKey("click") != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b6, code lost:
    
        if (r2.getEvents().containsKey("tap") == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b8, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b9, code lost:
    
        r4.LJIILL(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c0, code lost:
    
        if (r6.LIZ.mAccessibilityEnableTap == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c2, code lost:
    
        r4.LIZ(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c7, code lost:
    
        r4.LJIIJ(r6.LIZ.getBoundingClientRect());
        r2 = new android.graphics.Rect();
        r1 = LJIIL(r6.LIZ, r2);
        r4.LIZ.setVisibleToUser(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e0, code lost:
    
        if (r1 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e2, code lost:
    
        r4.LJIIJJI(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ef, code lost:
    
        if (r7.LIZIZ.get().LIZLLL != r8) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f1, code lost:
    
        r4.LJIIIIZZ(true);
        r4.LIZ(128);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00fa, code lost:
    
        r4.LJIIIIZZ(false);
        r4.LIZ(64);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0103, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0105, code lost:
    
        r3 = LJIIIZ(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x010d, code lost:
    
        if (android.text.TextUtils.isEmpty(r3) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x010f, code lost:
    
        r2 = r1.getChildren().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x011b, code lost:
    
        if (r2.hasNext() == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x011d, code lost:
    
        r0 = r2.next();
        r1 = X.X1D.LIZ();
        r1.append((java.lang.Object) r3);
        r1.append(LJIIIZ(r0));
        r3 = X.X1D.LIZIZ(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0136, code lost:
    
        r3.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x013b, code lost:
    
        r1 = (com.lynx.tasm.behavior.ui.LynxBaseUI) r1.mParent;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x013f, code lost:
    
        if (r1 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f9, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x005c, code lost:
    
        if (r1 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0060, code lost:
    
        if (r1 == r7.LIZJ) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C17760mq LJ(int r8) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VPM.LJ(int):X.0mq");
    }

    public final int LJIIIIZZ(LynxBaseUI lynxBaseUI) {
        ArrayList<VPQ> arrayList;
        if (lynxBaseUI != null && (arrayList = this.LJII) != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((VPQ) ListProtector.get(this.LJII, size)).LIZ == lynxBaseUI) {
                    return size;
                }
            }
        }
        return -1;
    }

    public final boolean LJIILJJIL(LynxBaseUI lynxBaseUI) {
        if (lynxBaseUI == null) {
            return false;
        }
        if (lynxBaseUI.mAccessibilityElementStatus == -1 && this.LIZIZ.get() != null) {
            return this.LIZIZ.get().LJI;
        }
        if (lynxBaseUI.mAccessibilityElementStatus != 1) {
            return false;
        }
        return true;
    }

    public static void LJIIJJI(Rect rect, View view) {
        rect.set(0, 0, view.getRight() - view.getLeft(), view.getBottom() - view.getTop());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.offset(iArr[0], iArr[1]);
    }

    @Override // X.C17780ms
    public final List<C17760mq> LIZIZ(String str, int i) {
        LynxBaseUI lynxBaseUI;
        String LJIIIZ;
        String LJIIIZ2;
        ArrayList arrayList = new ArrayList();
        if (str == null) {
            return arrayList;
        }
        String lowerCase = str.toLowerCase();
        if (i == -1) {
            for (int i2 = 0; i2 < this.LJII.size(); i2++) {
                if (((VPQ) ListProtector.get(this.LJII, i2)).LIZ != null && (LJIIIZ2 = LJIIIZ(((VPQ) ListProtector.get(this.LJII, i2)).LIZ)) != null && LJIIIZ2.toLowerCase().contains(lowerCase)) {
                    arrayList.add(LIZ(i2));
                }
            }
        } else if (i > -1 && i < this.LJII.size() && (lynxBaseUI = ((VPQ) ListProtector.get(this.LJII, i)).LIZ) != null && (LJIIIZ = LJIIIZ(lynxBaseUI)) != null && LJIIIZ.toLowerCase().contains(lowerCase)) {
            arrayList.add(LIZ(i));
        }
        return arrayList;
    }

    public final void LJI(LynxBaseUI lynxBaseUI, ArrayList<VPQ> arrayList) {
        LynxBaseUI lynxBaseUI2;
        if (lynxBaseUI == null || arrayList == null) {
            return;
        }
        arrayList.clear();
        LJII(lynxBaseUI, arrayList);
        Collections.sort(arrayList, new VPO(this, lynxBaseUI));
        if (this.LJI) {
            ArrayList<VPQ> arrayList2 = new ArrayList<>();
            Iterator<VPQ> it = arrayList.iterator();
            while (true) {
                boolean z = false;
                if (!it.hasNext()) {
                    break;
                }
                VPQ next = it.next();
                LynxBaseUI lynxBaseUI3 = next.LIZ;
                if (lynxBaseUI3 != null && next.LIZJ) {
                    ArrayList<String> arrayList3 = lynxBaseUI3.mAccessibilityElementsA11y;
                    if (arrayList3 == null) {
                        arrayList3 = lynxBaseUI3.mAccessibilityElements;
                        if (arrayList3 != null) {
                        }
                    } else {
                        z = true;
                    }
                    VNU vnu = this.LIZJ.mContext;
                    if (vnu != null && vnu.LJFF() != null) {
                        VOR LJFF = this.LIZJ.mContext.LJFF();
                        Iterator<String> it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            String next2 = it2.next();
                            if (z) {
                                LJFF.getClass();
                                if (!next2.isEmpty()) {
                                    Iterator<Integer> it3 = LJFF.LJI.keySet().iterator();
                                    while (it3.hasNext()) {
                                        lynxBaseUI2 = LJFF.LJI.get(it3.next());
                                        if (lynxBaseUI2 != null && next2.equals(lynxBaseUI2.mAccessibilityId)) {
                                            if ((lynxBaseUI2 instanceof LynxUI) || C16330kX.LIZIZ(((LynxUI) lynxBaseUI2).mView)) {
                                                LJIILIIL(lynxBaseUI2, arrayList2);
                                            }
                                        }
                                    }
                                }
                            } else {
                                lynxBaseUI2 = LJFF.LJI(next2);
                                if (lynxBaseUI2 != null) {
                                    if (lynxBaseUI2 instanceof LynxUI) {
                                    }
                                    LJIILIIL(lynxBaseUI2, arrayList2);
                                }
                            }
                        }
                    }
                } else {
                    arrayList2.add(next);
                }
            }
            arrayList.clear();
            arrayList.addAll(arrayList2);
            this.LJI = false;
        }
        boolean z2 = lynxBaseUI instanceof UIList;
        if (z2) {
            Iterator<ArrayList<VPQ>> it4 = ((UIList) lynxBaseUI).LLFZ.values().iterator();
            while (it4.hasNext()) {
                Iterator<VPQ> it5 = it4.next().iterator();
                while (it5.hasNext()) {
                    VPQ next3 = it5.next();
                    next3.LIZ = null;
                    next3.LIZIZ = LJIIIIZZ;
                }
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator<VPQ> it6 = arrayList.iterator();
        while (it6.hasNext()) {
            VPQ next4 = it6.next();
            if (next4.LIZLLL) {
                ArrayList<VPQ> arrayList5 = new ArrayList<>();
                LJI(next4.LIZ, arrayList5);
                LynxBaseUI lynxBaseUI4 = next4.LIZ;
                if (lynxBaseUI4 instanceof UIComponent) {
                    VPH vph = lynxBaseUI4.mParent;
                    if (vph instanceof UIList) {
                        UIList uIList = (UIList) vph;
                        String str = ((UIComponent) lynxBaseUI4).LJLIL;
                        if (!uIList.LLFZ.containsKey(str)) {
                            uIList.LLFII.add(str);
                        }
                        uIList.LLFZ.put(str, arrayList5);
                    }
                }
                arrayList4.addAll(arrayList5);
            } else {
                arrayList4.add(next4);
            }
        }
        arrayList.clear();
        if (z2) {
            UIList uIList2 = (UIList) lynxBaseUI;
            Iterator<String> it7 = uIList2.LLFII.iterator();
            while (it7.hasNext()) {
                arrayList4.addAll(uIList2.LLFZ.get(it7.next()));
            }
        }
        arrayList.addAll(arrayList4);
    }

    public final void LJII(LynxBaseUI lynxBaseUI, ArrayList<VPQ> arrayList) {
        if (arrayList != null && lynxBaseUI != null) {
            if (((lynxBaseUI instanceof LynxUI) && !C16330kX.LIZIZ(((LynxUI) lynxBaseUI).mView)) || (lynxBaseUI instanceof VOI)) {
                return;
            }
            ArrayList<String> arrayList2 = lynxBaseUI.mAccessibilityElements;
            ArrayList<String> arrayList3 = lynxBaseUI.mAccessibilityElementsA11y;
            if (arrayList2 != null || arrayList3 != null) {
                VPQ vpq = new VPQ(lynxBaseUI, LJIIJ(lynxBaseUI));
                vpq.LIZJ = true;
                arrayList.add(vpq);
                this.LJI = true;
                return;
            }
            for (int size = lynxBaseUI.getChildren().size() - 1; size >= 0; size--) {
                LynxBaseUI lynxBaseUI2 = (LynxBaseUI) ListProtector.get(lynxBaseUI.getChildren(), size);
                if (lynxBaseUI2 instanceof LynxUI) {
                    if (C16330kX.LIZIZ(((LynxUI) lynxBaseUI2).mView)) {
                        if (lynxBaseUI2.isAccessibilityHostUI()) {
                            VPQ vpq2 = new VPQ(lynxBaseUI2, LJIIJ(lynxBaseUI2));
                            vpq2.LIZLLL = true;
                            arrayList.add(vpq2);
                        }
                    }
                }
                LJII(lynxBaseUI2, arrayList);
            }
            LJIILIIL(lynxBaseUI, arrayList);
        }
    }

    public final boolean LJIIL(LynxBaseUI lynxBaseUI, Rect rect) {
        if (lynxBaseUI == null) {
            return false;
        }
        Rect rect2 = new Rect();
        if (lynxBaseUI instanceof LynxUI) {
            View view = ((LynxUI) lynxBaseUI).mView;
            if (lynxBaseUI instanceof UIShadowProxy) {
                LynxBaseUI lynxBaseUI2 = ((UIShadowProxy) lynxBaseUI).LJLIL;
                if (lynxBaseUI2 instanceof LynxUI) {
                    view = ((LynxUI) lynxBaseUI2).mView;
                }
            }
            if (view.getGlobalVisibleRect(rect)) {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                rect.offset(iArr[0] - rect.left, iArr[1] - rect.top);
                return true;
            }
        } else if (lynxBaseUI instanceof LynxFlattenUI) {
            LynxBaseUI lynxBaseUI3 = lynxBaseUI;
            while ((lynxBaseUI3 instanceof LynxFlattenUI) && lynxBaseUI3 != this.LIZJ) {
                rect2.left = lynxBaseUI3.getOriginLeft() + rect2.left;
                rect2.top = lynxBaseUI3.getOriginTop() + rect2.top;
                lynxBaseUI3 = lynxBaseUI3.getParentBaseUI();
            }
            if (lynxBaseUI3 != null && (lynxBaseUI3 instanceof LynxUI)) {
                View view2 = ((LynxUI) lynxBaseUI3).mView;
                if (lynxBaseUI3 instanceof UIGroup) {
                    view2 = ((UIGroup) lynxBaseUI3).getAccessibilityHostView();
                }
                Rect rect3 = new Rect();
                int[] iArr2 = new int[2];
                if (view2.getLocalVisibleRect(rect3)) {
                    rect2.right = lynxBaseUI.getWidth() + rect2.left;
                    rect2.bottom = lynxBaseUI.getHeight() + rect2.top;
                    if (rect2.intersect(rect3)) {
                        view2.getLocationOnScreen(iArr2);
                        rect.set(rect2);
                        rect.offset(iArr2[0] - view2.getScrollX(), iArr2[1] - view2.getScrollY());
                        return true;
                    }
                }
            }
        }
        rect.set(0, 0, lynxBaseUI.getWidth(), lynxBaseUI.getHeight());
        return false;
    }

    public final void LJIILIIL(LynxBaseUI lynxBaseUI, ArrayList<VPQ> arrayList) {
        if (lynxBaseUI != null && lynxBaseUI != this.LIZJ) {
            if (lynxBaseUI instanceof UIShadowProxy) {
                lynxBaseUI = ((UIShadowProxy) lynxBaseUI).LJLIL;
            }
            if (LJIILJJIL(lynxBaseUI)) {
                arrayList.add(new VPQ(lynxBaseUI, LJIIJ(lynxBaseUI)));
            }
        }
    }

    @Override // X.C17780ms
    public final boolean LIZLLL(int i, int i2, Bundle bundle) {
        VNU vnu;
        boolean z = false;
        if (i < -1 || i >= this.LJII.size()) {
            LLog.LIZLLL(4, "LynxA11yNodeProvider", "performAction: check virtualViewId failed");
            return false;
        }
        WeakReference<VPJ> weakReference = this.LIZIZ;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        VPJ vpj = this.LIZIZ.get();
        if (i != -1) {
            LynxBaseUI lynxBaseUI = ((VPQ) ListProtector.get(this.LJII, i)).LIZ;
            vpj.getClass();
            if (i2 != 16) {
                if (i2 != 64) {
                    if (i2 != 128) {
                        if (i2 != 16908342 || lynxBaseUI == null) {
                            return false;
                        }
                        if (lynxBaseUI instanceof LynxUI) {
                            return ((LynxUI) lynxBaseUI).mView.performAccessibilityAction(i2, bundle);
                        }
                        if (!(lynxBaseUI instanceof LynxFlattenUI)) {
                            return false;
                        }
                        LynxBaseUI parentBaseUI = lynxBaseUI.getParentBaseUI();
                        Rect rect = new Rect(0, 0, lynxBaseUI.getWidth(), lynxBaseUI.getHeight());
                        Rect rect2 = new Rect();
                        while (true) {
                            LynxBaseUI lynxBaseUI2 = lynxBaseUI;
                            lynxBaseUI = parentBaseUI;
                            if (lynxBaseUI == null || lynxBaseUI == vpj.LIZIZ) {
                                return z;
                            }
                            rect2.set(rect);
                            z |= lynxBaseUI.requestChildUIRectangleOnScreen(lynxBaseUI2, rect2, true);
                            rect.offset(lynxBaseUI2.getOriginLeft() - lynxBaseUI2.getScrollX(), lynxBaseUI2.getOriginTop() - lynxBaseUI2.getScrollY());
                            parentBaseUI = lynxBaseUI.getParentBaseUI();
                        }
                    } else {
                        if (vpj.LIZLLL != i) {
                            return false;
                        }
                        vpj.LIZLLL = LiveLayoutPreloadThreadPriority.DEFAULT;
                        vpj.LIZJ.invalidate();
                        vpj.LJII = null;
                        vpj.LJI(i, 65536);
                    }
                } else {
                    return vpj.LJFF(i);
                }
            } else {
                VPQ vpq = (VPQ) ListProtector.get(vpj.LJFF.LJII, i);
                LynxBaseUI lynxBaseUI3 = vpq.LIZ;
                if (lynxBaseUI3 == null || (vnu = lynxBaseUI3.mContext) == null || vnu.LJLJJL == null || !lynxBaseUI3.mAccessibilityEnableTap) {
                    return false;
                }
                Rect rect3 = vpq.LIZIZ;
                PPO ppo = new PPO(rect3.centerX(), rect3.centerY());
                PPO ppo2 = new PPO(rect3.centerX() - rect3.left, rect3.centerY() - rect3.top);
                if (lynxBaseUI3.getEvents() != null) {
                    java.util.Map<String, VNA> events = lynxBaseUI3.getEvents();
                    if (events.containsKey("tap")) {
                        lynxBaseUI3.mContext.LJLJJL.LIZJ(new VNM(lynxBaseUI3.getSign(), "tap", ppo2, ppo2, ppo));
                    }
                    if (events.containsKey("click")) {
                        lynxBaseUI3.mContext.LJLJJL.LIZJ(new VNM(lynxBaseUI3.getSign(), "click", ppo2, ppo2, ppo));
                    }
                }
            }
            return true;
        }
        return C16300kU.LJIIIZ(vpj.LIZJ, i2, bundle);
    }
}
