package X;

import Y.ARunnableS15S1100000_14;
import Y.IDComparatorS42S0000000_14;
import android.animation.AnimatorSet;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.TemplateAssembler;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIBody;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.tasm.behavior.ui.UIShadowProxy;
import com.lynx.tasm.behavior.ui.swiper.XSwiperUI;
import com.lynx.tasm.behavior.ui.view.UIComponent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes15.dex */
public final class VOR {
    public static final IDComparatorS42S0000000_14 LJIILJJIL = new IDComparatorS42S0000000_14(11);
    public int LIZ;
    public final UIBody LIZIZ;
    public final VNU LIZJ;
    public final java.util.Set<String> LIZLLL;
    public final HashSet<LynxBaseUI> LJ;
    public final List<InterfaceC79641VNl> LJFF;
    public final HashMap<Integer, LynxBaseUI> LJI;
    public final HashSet<LynxBaseUI> LJII;
    public final C79600VLw LJIIIIZZ;
    public final HashMap<Integer, Integer> LJIIIZ;
    public final C58667N0t LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public TemplateAssembler LJIILIIL;

    public static boolean LJIIJJI(VPA vpa) {
        if (vpa.LJIIIIZZ("box-shadow") || vpa.LJIIIIZZ("outline-color") || vpa.LJIIIIZZ("outline-style") || vpa.LJIIIIZZ("outline-width")) {
            return true;
        }
        return false;
    }

    public static void LJIILIIL(LynxBaseUI lynxBaseUI) {
        int i = 0;
        for (LynxBaseUI lynxBaseUI2 : lynxBaseUI.getChildren()) {
            int i2 = i + 1;
            LJIILJJIL(lynxBaseUI, lynxBaseUI2, i);
            if (lynxBaseUI2.isFlatten()) {
                LJIILIIL(lynxBaseUI2);
            }
            i = i2;
        }
    }

    public static void LJIIZILJ(LynxBaseUI lynxBaseUI) {
        UIGroup uIGroup = (UIGroup) lynxBaseUI.getDrawParent();
        LynxBaseUI parentBaseUI = lynxBaseUI.getParentBaseUI();
        if (uIGroup == null || parentBaseUI == null) {
            return;
        }
        if (!lynxBaseUI.isFlatten()) {
            LynxBaseUI lynxBaseUI2 = lynxBaseUI.mPreviousDrawUI;
            LynxBaseUI lynxBaseUI3 = lynxBaseUI.mNextDrawUI;
            if (lynxBaseUI2 != null) {
                lynxBaseUI2.mNextDrawUI = lynxBaseUI3;
                if (lynxBaseUI3 != null) {
                    lynxBaseUI3.mPreviousDrawUI = lynxBaseUI2;
                }
            } else {
                uIGroup.mDrawHead = lynxBaseUI3;
                if (lynxBaseUI3 != null) {
                    lynxBaseUI3.mPreviousDrawUI = null;
                }
            }
            if (parentBaseUI.isFlatten()) {
                uIGroup.removeView(lynxBaseUI);
            }
            lynxBaseUI.mNextDrawUI = null;
            lynxBaseUI.mPreviousDrawUI = null;
            lynxBaseUI.mDrawParent = null;
            return;
        }
        LynxBaseUI lynxBaseUI4 = lynxBaseUI;
        while (lynxBaseUI4.isFlatten() && !lynxBaseUI4.getChildren().isEmpty()) {
            lynxBaseUI4 = lynxBaseUI4.getChildAt(lynxBaseUI4.getChildren().size() - 1);
        }
        LynxBaseUI lynxBaseUI5 = lynxBaseUI.mPreviousDrawUI;
        if (lynxBaseUI5 != null) {
            lynxBaseUI5.mNextDrawUI = lynxBaseUI4.mNextDrawUI;
            LynxBaseUI lynxBaseUI6 = lynxBaseUI4.mNextDrawUI;
            if (lynxBaseUI6 != null) {
                lynxBaseUI6.mPreviousDrawUI = lynxBaseUI5;
            }
        } else {
            LynxBaseUI lynxBaseUI7 = lynxBaseUI4.mNextDrawUI;
            uIGroup.mDrawHead = lynxBaseUI7;
            if (lynxBaseUI7 != null) {
                lynxBaseUI7.mPreviousDrawUI = null;
            }
        }
        lynxBaseUI.mPreviousDrawUI = null;
        for (LynxBaseUI lynxBaseUI8 = lynxBaseUI.mNextDrawUI; lynxBaseUI8 != lynxBaseUI4.mNextDrawUI; lynxBaseUI8 = lynxBaseUI8.mNextDrawUI) {
            lynxBaseUI8.mPreviousDrawUI.mNextDrawUI = null;
            lynxBaseUI8.mPreviousDrawUI = null;
            uIGroup.removeView(lynxBaseUI8);
            lynxBaseUI8.mDrawParent = null;
        }
        lynxBaseUI4.mNextDrawUI = null;
        lynxBaseUI.mDrawParent = null;
        parentBaseUI.invalidate();
    }

    public final void LIZ(VPA vpa) {
        if (vpa == null || !vpa.LJIIIIZZ("__lynx_timing_flag")) {
            return;
        }
        String LJII = vpa.LJII("__lynx_timing_flag");
        if (TextUtils.isEmpty(LJII)) {
            return;
        }
        this.LJIIIIZZ.LIZ(LJII);
    }

    public final void LJ(LynxBaseUI lynxBaseUI) {
        for (int i = 0; i < lynxBaseUI.getChildren().size(); i++) {
            LynxBaseUI childAt = lynxBaseUI.getChildAt(i);
            childAt.destroy();
            this.LJI.remove(Integer.valueOf(childAt.getSign()));
            this.LJ.remove(childAt);
            this.LIZJ.LJIIIZ(childAt);
            LJ(childAt);
        }
    }

    public final LynxBaseUI LJFF(int i) {
        if (i == -1) {
            return this.LIZIZ;
        }
        if (this.LJIIIZ.containsKey(Integer.valueOf(i))) {
            i = this.LJIIIZ.get(Integer.valueOf(i)).intValue();
        }
        return LJIIJ(i);
    }

    public final LynxBaseUI LJI(String str) {
        for (LynxBaseUI lynxBaseUI : this.LJI.values()) {
            if (lynxBaseUI != null && str.equals(lynxBaseUI.getIdSelector())) {
                return lynxBaseUI;
            }
        }
        return null;
    }

    public final LynxBaseUI LJIIJ(int i) {
        HashMap<Integer, LynxBaseUI> hashMap = this.LJI;
        if (hashMap != null) {
            return hashMap.get(Integer.valueOf(i));
        }
        return null;
    }

    public final void LJIJ(String str) {
        if (Build.VERSION.SDK_INT >= 24 && LynxEnv.LIZLLL("enable_component_statistic_report") && !this.LIZLLL.contains(str)) {
            this.LIZLLL.add(str);
            C64493PSv.LIZ().execute(new ARunnableS15S1100000_14(this, str, 16));
        }
    }

    public final boolean LJIJI(VPJ vpj) {
        VNQ vnq;
        TemplateAssembler templateAssembler = this.LJIILIIL;
        if (templateAssembler == null || (vnq = templateAssembler.LJIIZILJ) == null || !vnq.LJJI || vpj == null || !vpj.LIZLLL()) {
            return false;
        }
        return true;
    }

    public static LynxBaseUI LJII(String str, LynxBaseUI lynxBaseUI) {
        LynxBaseUI LJII;
        if (lynxBaseUI != null && lynxBaseUI.getIdSelector() != null && lynxBaseUI.getIdSelector().equals(str)) {
            return lynxBaseUI;
        }
        if (lynxBaseUI == null) {
            return null;
        }
        for (LynxBaseUI lynxBaseUI2 : lynxBaseUI.getChildren()) {
            if (lynxBaseUI2.getIdSelector() != null && lynxBaseUI2.getIdSelector().equals(str)) {
                return lynxBaseUI2;
            }
            if (!(lynxBaseUI2 instanceof UIComponent) && (LJII = LJII(str, lynxBaseUI2)) != null) {
                return LJII;
            }
        }
        return null;
    }

    public static LynxBaseUI LJIIIIZZ(String str, LynxBaseUI lynxBaseUI) {
        if (lynxBaseUI == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("findLynxUIByIdSelectorSearchUp failed, the ui is null for ");
            LIZ.append(str);
            LIZ.append(".");
            LLog.LIZLLL(4, "LynxUIOwner", X1D.LIZIZ(LIZ));
            return null;
        }
        if (lynxBaseUI.getIdSelector() != null && lynxBaseUI.getIdSelector().equals(str)) {
            return lynxBaseUI;
        }
        return LJIIIIZZ(str, lynxBaseUI.getParentBaseUI());
    }

    public static LynxBaseUI LJIIIZ(String str, LynxBaseUI lynxBaseUI) {
        LynxBaseUI LJIIIZ;
        if (lynxBaseUI.getRefIdSelector() != null && lynxBaseUI.getRefIdSelector().equals(str)) {
            return lynxBaseUI;
        }
        for (LynxBaseUI lynxBaseUI2 : lynxBaseUI.getChildren()) {
            if (lynxBaseUI2.getRefIdSelector() != null && lynxBaseUI2.getRefIdSelector().equals(str)) {
                return lynxBaseUI2;
            }
            if (!lynxBaseUI2.getTagName().equals("component") && (LJIIIZ = LJIIIZ(str, lynxBaseUI2)) != null) {
                return LJIIIZ;
            }
        }
        return null;
    }

    public final void LIZJ(int i, int i2) {
        LynxBaseUI lynxBaseUI;
        if (this.LIZJ.LLIIIJ && (lynxBaseUI = this.LJI.get(Integer.valueOf(i))) != null && lynxBaseUI.getTranslationZ() != lynxBaseUI.mLastTranslateZ) {
            LynxBaseUI lynxBaseUI2 = this.LJI.get(Integer.valueOf(i2));
            if (lynxBaseUI2 != null && lynxBaseUI2.isFlatten()) {
                LJIILL(i2, false);
            }
            LynxBaseUI lynxBaseUI3 = this.LJI.get(Integer.valueOf(i2));
            this.LJ.add(lynxBaseUI3);
            lynxBaseUI3.mNeedSortChildren = true;
            lynxBaseUI.mLastTranslateZ = lynxBaseUI.getTranslationZ();
        }
    }

    public final LynxBaseUI LIZLLL(String str, boolean z) {
        VNQ vnq;
        LynxBaseUI LIZLLL;
        TemplateAssembler templateAssembler = this.LJIILIIL;
        if (templateAssembler == null || (vnq = templateAssembler.LJIIZILJ) == null || !vnq.LJIIJJI || (!"swiper".equals(str) && !"x-swiper".equals(str))) {
            C40197Fq5 LIZIZ = this.LJIIJ.LIZIZ(str);
            if (z && LIZIZ.LIZIZ) {
                LIZLLL = LIZIZ.LIZIZ(this.LIZJ);
            } else {
                LIZLLL = LIZIZ.LIZLLL(this.LIZJ);
            }
            if (LIZLLL == null) {
                return LIZIZ.LIZLLL(this.LIZJ);
            }
            return LIZLLL;
        }
        return new XSwiperUI(this.LIZJ);
    }

    public final void LJIILL(int i, boolean z) {
        int i2;
        UIShadowProxy uIShadowProxy;
        LynxBaseUI lynxBaseUI = this.LJI.get(Integer.valueOf(i));
        if (lynxBaseUI == null) {
            return;
        }
        LynxBaseUI parentBaseUI = lynxBaseUI.getParentBaseUI();
        VPA vpa = new VPA(lynxBaseUI.getProps());
        ArrayList arrayList = new ArrayList(lynxBaseUI.getChildren());
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UIOwner.updateFlatten.");
        LIZ.append(lynxBaseUI.getTagName());
        String LIZIZ = X1D.LIZIZ(LIZ);
        TraceEvent.LIZIZ(LIZIZ);
        int i3 = 0;
        if (parentBaseUI != null) {
            i2 = parentBaseUI.getIndex(lynxBaseUI);
            LJIIZILJ(lynxBaseUI);
            parentBaseUI.removeChild(lynxBaseUI);
        } else {
            i2 = 0;
        }
        if (!lynxBaseUI.isFlatten()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                LJIIZILJ((LynxBaseUI) it.next());
            }
        }
        int size = lynxBaseUI.getChildren().size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else {
                lynxBaseUI.removeChild(lynxBaseUI.getChildAt(size));
            }
        }
        LynxBaseUI LIZLLL = LIZLLL(lynxBaseUI.getTagName(), z);
        LIZLLL.setSign(lynxBaseUI.getSign(), lynxBaseUI.getTagName());
        if (LJIIJJI(vpa)) {
            uIShadowProxy = new UIShadowProxy(this.LIZJ, LIZLLL);
        } else {
            uIShadowProxy = null;
        }
        LIZLLL.updatePropertiesInterval(vpa);
        LIZIZ(LIZLLL, uIShadowProxy, vpa);
        this.LJI.put(Integer.valueOf(lynxBaseUI.getSign()), LIZLLL);
        if (this.LJ.contains(lynxBaseUI)) {
            this.LJ.remove(lynxBaseUI);
            this.LJ.add(LIZLLL);
        }
        if (parentBaseUI != null) {
            parentBaseUI.insertChild(LIZLLL, i2);
            LJIILJJIL(parentBaseUI, LIZLLL, i2);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            LynxBaseUI lynxBaseUI2 = (LynxBaseUI) it2.next();
            lynxBaseUI2.setBound(null);
            lynxBaseUI2.setLeft(lynxBaseUI2.getOriginLeft());
            lynxBaseUI2.setTop(lynxBaseUI2.getOriginTop());
            LIZLLL.insertChild(lynxBaseUI2, i3);
            i3++;
        }
        LJIILIIL(LIZLLL);
        LIZLLL.updateLayoutInfo(lynxBaseUI);
        LIZLLL.copyPropFromOldUiInUpdateFlatten(lynxBaseUI);
        LIZLLL.measure();
        ((LynxUI) LIZLLL).handleLayout();
        if (LIZLLL instanceof UIGroup) {
            ((UIGroup) LIZLLL).layoutChildren();
        }
        LIZLLL.invalidate();
        lynxBaseUI.destroy();
        TraceEvent.LJ(LIZIZ);
    }

    public final void LJIILLIIL(int i, int i2) {
        LynxBaseUI lynxBaseUI;
        if (this.LJI.size() > 0) {
            LynxBaseUI lynxBaseUI2 = this.LJI.get(Integer.valueOf(i2));
            if (lynxBaseUI2 != null) {
                if (i == -1) {
                    lynxBaseUI = lynxBaseUI2.getParentBaseUI();
                } else {
                    lynxBaseUI = this.LJI.get(Integer.valueOf(i));
                }
                if (lynxBaseUI != null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("UIOwner.remove.");
                    LIZ.append(lynxBaseUI.getTagName());
                    LIZ.append(".");
                    LIZ.append(lynxBaseUI2.getTagName());
                    String LIZIZ = X1D.LIZIZ(LIZ);
                    TraceEvent.LIZIZ(LIZIZ);
                    LJIIZILJ(lynxBaseUI2);
                    lynxBaseUI.removeChild(lynxBaseUI2);
                    lynxBaseUI2.setBound(null);
                    lynxBaseUI2.setLeft(lynxBaseUI2.getOriginLeft());
                    lynxBaseUI2.setTop(lynxBaseUI2.getOriginTop());
                    if (lynxBaseUI2.isFlatten()) {
                        lynxBaseUI.flattenChildrenCountDecrement();
                    }
                    VPJ vpj = this.LIZIZ.LJLJJI;
                    if (LJIJI(vpj)) {
                        vpj.LIZJ(1, lynxBaseUI2, "");
                    }
                    TraceEvent.LJ(LIZIZ);
                    return;
                }
                throw new RuntimeException(KMP.LJ("Trying to remove unknown ui signature: ", i2));
            }
            throw new RuntimeException(KMP.LJ("Trying to remove unknown ui signature: ", i2));
        }
    }

    public VOR(VNU vnu, C58667N0t c58667N0t, VNS vns) {
        this.LIZJ = vnu;
        this.LJIIJ = c58667N0t;
        if (Build.VERSION.SDK_INT >= 24) {
            this.LIZLLL = ConcurrentHashMap.newKeySet();
        } else {
            this.LIZLLL = new HashSet();
        }
        this.LJ = new HashSet<>();
        this.LJFF = new ArrayList();
        this.LJI = new HashMap<>();
        new HashMap();
        this.LJIIIZ = new HashMap<>();
        this.LIZ = -1;
        UIBody uIBody = new UIBody(vnu, vns);
        this.LIZIZ = uIBody;
        vnu.LJLJLLL = uIBody;
        this.LJIIJJI = true;
        this.LJIIL = true;
        C79600VLw c79600VLw = new C79600VLw(vnu);
        this.LJIIIIZZ = c79600VLw;
        this.LJII = new HashSet<>();
        if (!C39942Fly.LIZJ.booleanValue()) {
            vns.setTimingHandler(c79600VLw);
        }
    }

    public static void LJIILJJIL(LynxBaseUI lynxBaseUI, LynxBaseUI lynxBaseUI2, int i) {
        LynxBaseUI lynxBaseUI3;
        if (lynxBaseUI.isFlatten()) {
            lynxBaseUI3 = lynxBaseUI.getDrawParent();
            if (lynxBaseUI3 == null) {
                return;
            }
        } else {
            lynxBaseUI3 = lynxBaseUI;
        }
        if (i == 0) {
            LynxUI lynxUI = (LynxUI) lynxBaseUI3;
            if (!lynxBaseUI.isFlatten()) {
                lynxBaseUI = null;
            }
            lynxUI.insertDrawList(lynxBaseUI, lynxBaseUI2);
        } else {
            LynxBaseUI childAt = lynxBaseUI.getChildAt(i - 1);
            while (childAt.isFlatten() && !childAt.getChildren().isEmpty()) {
                childAt = childAt.getChildAt(childAt.getChildren().size() - 1);
            }
            ((LynxUI) lynxBaseUI3).insertDrawList(childAt, lynxBaseUI2);
        }
        if (!lynxBaseUI2.isFlatten()) {
            UIGroup uIGroup = (UIGroup) lynxBaseUI3;
            if (uIGroup.isInsertViewCalled()) {
                uIGroup.insertView((LynxUI) lynxBaseUI2);
            }
        }
    }

    public final LynxBaseUI LIZIZ(LynxBaseUI lynxBaseUI, UIShadowProxy uIShadowProxy, VPA vpa) {
        List<InterfaceC79641VNl> list;
        if (lynxBaseUI instanceof VOJ) {
            VNU vnu = this.LIZJ;
            if (vnu.LLD == null) {
                vnu.LLD = new ArrayList();
            }
            ((ArrayList) vnu.LLD).add(lynxBaseUI);
        }
        if ((lynxBaseUI instanceof InterfaceC79641VNl) && (list = this.LJFF) != null) {
            ((ArrayList) list).add(lynxBaseUI);
        }
        if (vpa != null) {
            lynxBaseUI.afterPropsUpdated(vpa);
            if (vpa.LJIIIIZZ("transition")) {
                lynxBaseUI.initTransitionAnimator(vpa.LIZ);
            }
            if (vpa.LJIIIIZZ("animation")) {
                lynxBaseUI.setAnimation(vpa.LIZ("animation"));
            }
        }
        if (uIShadowProxy != null) {
            return uIShadowProxy;
        }
        return lynxBaseUI;
    }

    public final void LJIIL(int i, int i2, int i3) {
        if (this.LJI.size() > 0) {
            if (this.LJI.get(Integer.valueOf(i)) != null) {
                LynxBaseUI lynxBaseUI = this.LJI.get(Integer.valueOf(i2));
                if (lynxBaseUI != null) {
                    LIZJ(i2, i);
                    LynxBaseUI lynxBaseUI2 = this.LJI.get(Integer.valueOf(i));
                    if (!lynxBaseUI2.canHaveFlattenChild() && lynxBaseUI.isFlatten()) {
                        LJIILL(i2, false);
                        lynxBaseUI = this.LJI.get(Integer.valueOf(i2));
                    }
                    if (i3 == -1) {
                        i3 = lynxBaseUI2.getChildren().size();
                    }
                    lynxBaseUI2.insertChild(lynxBaseUI, i3);
                    LJIILJJIL(lynxBaseUI2, lynxBaseUI, i3);
                    if (lynxBaseUI.isFlatten()) {
                        lynxBaseUI2.flattenChildrenCountIncrement();
                    }
                    if (lynxBaseUI.isFlatten()) {
                        LJIILIIL(lynxBaseUI);
                        lynxBaseUI.requestLayout();
                        lynxBaseUI.invalidate();
                    }
                    VPJ vpj = this.LIZIZ.LJLJJI;
                    if (LJIJI(vpj)) {
                        vpj.LIZJ(0, lynxBaseUI, "");
                        return;
                    }
                    return;
                }
                throw new RuntimeException(KMP.LJ("Insertion (new) failed due to unknown child signature: ", i2));
            }
            throw new RuntimeException(KMP.LJ("Insertion (new) failed due to unknown parent signature: ", i));
        }
    }

    public final void LJIJJ(int i, String str, VPA vpa) {
        if (str.equals("component") && vpa.LJIIIIZZ("ComponentID")) {
            this.LJIIIZ.put(Integer.valueOf(vpa.LJFF("ComponentID", -1)), Integer.valueOf(i));
        }
    }

    public final void LJIJJLI(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, Rect rect, float[] fArr, float f) {
        LynxBaseUI lynxBaseUI;
        int i18;
        LynxUI lynxUI;
        VR2 vr2;
        Animation animation;
        LynxBaseUI lynxBaseUI2;
        LynxBaseUI lynxBaseUI3;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        int i19;
        int i20;
        int i21;
        int i22;
        LynxBaseUI lynxBaseUI4 = this.LJI.get(Integer.valueOf(i));
        if (lynxBaseUI4 == null) {
            this.LIZJ.handleException(new RuntimeException(KMP.LJ("can't find ui tag is:", i)));
            return;
        }
        boolean z9 = lynxBaseUI4 instanceof UIShadowProxy;
        if (z9) {
            lynxBaseUI = ((UIShadowProxy) lynxBaseUI4).LJLIL;
        } else {
            lynxBaseUI = lynxBaseUI4;
        }
        lynxBaseUI.updateLayoutSize(i4, i5);
        if (lynxBaseUI4.getLayoutAnimator() != null) {
            lynxBaseUI4.getLayoutAnimator().LJIIIIZZ(i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, rect);
        }
        C79708VQa transitionAnimator = lynxBaseUI4.getTransitionAnimator();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UIOwner.updateLayout.");
        LIZ.append(lynxBaseUI4.getTagName());
        String LIZIZ = X1D.LIZIZ(LIZ);
        TraceEvent.LIZIZ(LIZIZ);
        if (transitionAnimator != null && transitionAnimator.LJIIIZ.size() != 0 && ((transitionAnimator.LIZJ(256) || transitionAnimator.LIZJ(1024) || transitionAnimator.LIZJ(512) || transitionAnimator.LIZJ(2048) || transitionAnimator.LIZJ(16) || transitionAnimator.LIZJ(32)) && !this.LJIIJJI && !lynxBaseUI4.isFirstAnimatedReady())) {
            if (z9) {
                lynxBaseUI3 = ((UIShadowProxy) lynxBaseUI4).LJLIL;
            } else {
                lynxBaseUI3 = lynxBaseUI4;
            }
            if (lynxBaseUI3 instanceof LynxUI) {
                LynxBaseUI lynxBaseUI5 = transitionAnimator.LJI;
                if (lynxBaseUI5 == null) {
                    lynxBaseUI5 = lynxBaseUI3;
                }
                if (lynxBaseUI5.getOriginLeft() != i2) {
                    z = true;
                } else {
                    z = false;
                }
                if (lynxBaseUI5.getOriginTop() != i3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (lynxBaseUI5.getWidth() != i4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (lynxBaseUI5.getHeight() != i5) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (lynxBaseUI5.getWidth() + lynxBaseUI5.getOriginLeft() == i2 + i4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (lynxBaseUI5.getHeight() + lynxBaseUI5.getOriginTop() == i3 + i5) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                lynxBaseUI5.onBeforeAnimation(i2, i3, i4, i5, i6, i7, i8, i9);
                if (transitionAnimator.LIZJ(256) || transitionAnimator.LIZJ(1024)) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                int i23 = 2048;
                if (transitionAnimator.LIZJ(512) || transitionAnimator.LIZJ(2048)) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                boolean LIZJ = transitionAnimator.LIZJ(16);
                boolean LIZJ2 = transitionAnimator.LIZJ(32);
                if ((z7 && z) || (LIZJ && z5)) {
                    i19 = lynxBaseUI5.getOriginLeft();
                } else {
                    i19 = i2;
                }
                if ((z8 && z2) || (LIZJ2 && z6)) {
                    i20 = lynxBaseUI5.getOriginTop();
                } else {
                    i20 = i3;
                }
                if (z3 && LIZJ) {
                    i21 = lynxBaseUI5.getWidth();
                } else {
                    i21 = i4;
                }
                if (z4 && LIZJ2) {
                    i22 = lynxBaseUI5.getHeight();
                } else {
                    i22 = i5;
                }
                transitionAnimator.LJFF(256);
                transitionAnimator.LJFF(1024);
                transitionAnimator.LJFF(512);
                transitionAnimator.LJFF(2048);
                transitionAnimator.LJFF(32);
                transitionAnimator.LJFF(16);
                lynxBaseUI5.updateLayout(i19, i20, i21, i22, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, rect);
                HashMap hashMap = new HashMap();
                int i24 = 0;
                while (i24 < transitionAnimator.LJIIIZ.size()) {
                    C79713VQf valueAt = transitionAnimator.LJIIIZ.valueAt(i24);
                    int i25 = valueAt.LJLJJI;
                    if ((i25 & 3888) != 0) {
                        if (i25 != 16) {
                            if (i25 != 32) {
                                if (i25 != 256) {
                                    if (i25 != 512) {
                                        if (i25 != 1024) {
                                            if (i25 != i23) {
                                            }
                                        }
                                    }
                                    if (z2) {
                                        hashMap.put(Integer.valueOf(valueAt.LJLJJI), transitionAnimator.LIZLLL(i25, lynxBaseUI5, lynxBaseUI5.getOriginTop(), i3, valueAt, true));
                                    }
                                }
                                if (z) {
                                    hashMap.put(Integer.valueOf(valueAt.LJLJJI), transitionAnimator.LIZLLL(i25, lynxBaseUI5, lynxBaseUI5.getOriginLeft(), i2, valueAt, true));
                                }
                            } else if (z4) {
                                AnimatorSet animatorSet = new AnimatorSet();
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(transitionAnimator.LIZLLL(32, lynxBaseUI5, lynxBaseUI5.getHeight(), i5, valueAt, true));
                                if (z2 && z6 && !z8) {
                                    arrayList.add(transitionAnimator.LIZLLL(512, lynxBaseUI5, lynxBaseUI5.getOriginTop(), i3, valueAt, false));
                                }
                                animatorSet.playTogether(arrayList);
                                hashMap.put(32, animatorSet);
                            }
                        } else if (z3) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(transitionAnimator.LIZLLL(16, lynxBaseUI5, lynxBaseUI5.getWidth(), i4, valueAt, true));
                            if (z && z5 && !z7) {
                                arrayList2.add(transitionAnimator.LIZLLL(256, lynxBaseUI5, lynxBaseUI5.getOriginLeft(), i2, valueAt, false));
                            }
                            animatorSet2.playTogether(arrayList2);
                            hashMap.put(16, animatorSet2);
                        }
                    }
                    i24++;
                    i23 = 2048;
                }
                if (!hashMap.isEmpty()) {
                    transitionAnimator.LJIIIIZZ.putAll(hashMap);
                }
                transitionAnimator.LIZ = i2;
                transitionAnimator.LIZIZ = i3;
                transitionAnimator.LIZJ = i4;
                transitionAnimator.LIZLLL = i5;
            }
            this.LIZIZ.invalidate();
        } else if (lynxBaseUI4.enableLayoutAnimation() && !this.LJIIJJI && (i != (i18 = this.LIZ) || (i == i18 && this.LJIIL))) {
            C79669VOn layoutAnimator = lynxBaseUI4.getLayoutAnimator();
            if (z9) {
                lynxUI = (LynxUI) ((UIShadowProxy) lynxBaseUI4).LJLIL;
            } else {
                lynxUI = (LynxUI) lynxBaseUI4;
            }
            layoutAnimator.getClass();
            View view = lynxUI.mView;
            layoutAnimator.LIZ = new WeakReference<>(lynxUI);
            int i26 = i6;
            int i27 = i7;
            int i28 = i8;
            int i29 = i9;
            layoutAnimator.LJIIIIZZ(i2, i3, i4, i5, i26, i27, i28, i29, i10, i11, i12, i13, i14, i15, i16, i17, rect);
            if (layoutAnimator.LJJ == -1.0f && view != null) {
                layoutAnimator.LJJ = view.getAlpha();
            }
            int sign = lynxUI.getSign();
            VOS vos = layoutAnimator.LJIL.get(sign);
            if (vos != null) {
                if (view != null && view.getAnimation() != null) {
                    vos.LIZ(i2, i3, i4, i5);
                    this.LIZIZ.invalidate();
                } else {
                    layoutAnimator.LJIL.remove(sign);
                }
            }
            if (lynxUI.getWidth() == 0 && lynxUI.getHeight() == 0) {
                vr2 = layoutAnimator.LJIJI;
            } else {
                vr2 = layoutAnimator.LJIJJ;
            }
            C79676VOu c79676VOu = layoutAnimator.LJIJJLI;
            if (c79676VOu != null && c79676VOu.LIZJ() && i4 == 0 && i5 == 0) {
                View view2 = lynxUI.mView;
                if (view2 != null) {
                    layoutAnimator.LIZ = new WeakReference<>(lynxUI);
                    Animation LIZ2 = layoutAnimator.LJIJJLI.LIZ(lynxUI, view2.getLeft(), view2.getTop(), view2.getWidth(), view2.getHeight(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, new Rect(), layoutAnimator.LJJ);
                    if (LIZ2 == null) {
                        lynxUI.updateLayout(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, new Rect());
                    } else {
                        LIZ2.setAnimationListener(new AnimationAnimationListenerC79668VOm(layoutAnimator, "layout-animation-delete"));
                        layoutAnimator.LIZ(view2, "layout-animation-delete");
                        view2.startAnimation(LIZ2);
                    }
                }
            } else {
                C79676VOu c79676VOu2 = layoutAnimator.LJIJJLI;
                if ((c79676VOu2 == null || !c79676VOu2.LIZJ()) && i4 == 0 && i5 == 0) {
                    lynxUI.updateLayout(i2, i3, i4, i5, i26, i27, i28, i29, i10, i11, i12, i13, i14, i15, i16, i17, rect);
                } else {
                    if (vr2 != null) {
                        animation = vr2.LIZ(lynxUI, i2, i3, i4, i5, i26, i27, i28, i29, i10, i11, i12, i13, i14, i15, i16, i17, rect, layoutAnimator.LJJ);
                    } else {
                        animation = null;
                    }
                    if (animation instanceof TranslateAnimation) {
                        VPH vph = lynxUI.mParent;
                        if (vph instanceof UIShadowProxy) {
                            view = ((LynxUI) vph).mView;
                        }
                    }
                    if (animation == null) {
                        float f2 = layoutAnimator.LJJ;
                        if (f2 != -1.0f) {
                            view.setAlpha(f2);
                        }
                        WeakReference<LynxUI> weakReference = layoutAnimator.LIZ;
                        if (weakReference != null) {
                            weakReference.clear();
                        }
                        lynxUI.updateLayout(i2, i3, i4, i5, i26, i27, i28, i29, i10, i11, i12, i13, i14, i15, i16, i17, rect);
                    } else {
                        if (lynxUI.getWidth() == 0 && lynxUI.getHeight() == 0) {
                            animation.setAnimationListener(new AnimationAnimationListenerC79668VOm(layoutAnimator, "layout-animation-create"));
                            layoutAnimator.LIZ(view, "layout-animation-create");
                        } else {
                            animation.setAnimationListener(new AnimationAnimationListenerC79668VOm(layoutAnimator, "layout-animation-update"));
                            layoutAnimator.LIZ(view, "layout-animation-update");
                        }
                        if (animation instanceof VOS) {
                            lynxUI.requestLayout();
                        } else {
                            i26 = i26;
                            i27 = i27;
                            i28 = i28;
                            i29 = i29;
                            lynxUI.updateLayout(i2, i3, i4, i5, i26, i27, i28, i29, i10, i11, i12, i13, i14, i15, i16, i17, rect);
                        }
                        lynxUI.onBeforeAnimation(i2, i3, i4, i5, i26, i27, i28, i29);
                        view.startAnimation(animation);
                    }
                }
            }
            this.LIZIZ.invalidate();
        } else {
            lynxBaseUI4.updateLayout(i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, rect);
        }
        if (!this.LIZJ.LLILII) {
            if (z9) {
                lynxBaseUI2 = ((UIShadowProxy) lynxBaseUI4).LJLIL;
            } else {
                lynxBaseUI2 = lynxBaseUI4;
            }
            lynxBaseUI2.onAnimatedNodeReady();
        }
        lynxBaseUI4.updateSticky(fArr);
        lynxBaseUI4.mMaxHeight = f;
        VPJ vpj = this.LIZIZ.LJLJJI;
        if (LJIJI(vpj)) {
            vpj.LIZJ(3, lynxBaseUI4, "");
        }
        TraceEvent.LJ(LIZIZ);
    }
}
