package X;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes15.dex */
public final class VOE extends VOO {
    public final HashMap<String, WeakReference<LynxBaseUI>> LJIILL;
    public HashSet<VOF> LJIILLIIL;
    public HashSet<VOF> LJIIZILJ;
    public Rect LJIJ;
    public final ChoreographerFrameCallbackC79421VEz LJIJI;

    public VOE() {
        super("Lynx.UIExposure");
        this.LJIILL = new HashMap<>();
        this.LJIIZILJ = new HashSet<>();
        this.LJIILLIIL = new HashSet<>();
        this.LIZ = new WeakReference<>(null);
        this.LJIJ = new Rect();
        this.LJIJI = new ChoreographerFrameCallbackC79421VEz(this);
    }

    @Override // X.VOO
    public final void LJII() {
        Rect rect;
        if (!this.LJ) {
            LLog.LIZLLL(4, "Lynx.UIExposure", "Lynx exposureHandler failed since rootView not draw");
            this.LJIIJ = false;
            return;
        }
        VNS LJ = LJ();
        if (LJ == null) {
            LLog.LIZLLL(4, "Lynx.UIExposure", "Lynx exposureHandler failed since rootView is null");
            this.LJIIJ = false;
            return;
        }
        if (!LJ.isShown()) {
            if (this.LJIIL) {
                LJIIJ(new HashSet<>(this.LJIIZILJ), "disexposure");
                this.LJIIZILJ.clear();
            }
            this.LJIIJ = false;
            return;
        }
        if (!this.LJIILIIL && LJ.isLayoutRequested()) {
            ChoreographerFrameCallbackC79421VEz choreographerFrameCallbackC79421VEz = this.LJIJI;
            this.LJIIJ = true;
            C16880lQ.LLIIIJ().postFrameCallbackDelayed(choreographerFrameCallbackC79421VEz, this.LJII);
            return;
        }
        this.LJIJ = LJFF(this.LIZ.get().mContext);
        Iterator<WeakReference<LynxBaseUI>> it = this.LJIILL.values().iterator();
        while (it.hasNext()) {
            LynxBaseUI lynxBaseUI = it.next().get();
            if (lynxBaseUI != null && lynxBaseUI.getHeight() != 0 && lynxBaseUI.getWidth() != 0) {
                ArrayList arrayList = new ArrayList();
                LynxBaseUI lynxBaseUI2 = lynxBaseUI;
                while (lynxBaseUI2 != this.LIZ.get()) {
                    if (!(lynxBaseUI2 instanceof LynxUI) || lynxBaseUI2.isVisible()) {
                        if (lynxBaseUI2.isScrollContainer()) {
                            arrayList.add(lynxBaseUI2);
                        }
                        lynxBaseUI2 = (LynxBaseUI) lynxBaseUI2.mParent;
                        if (lynxBaseUI2 == null) {
                            break;
                        }
                    }
                }
                Rect LIZLLL = LIZLLL(lynxBaseUI);
                float f = 0.0f;
                if (lynxBaseUI.getEnableExposureUIMargin()) {
                    float width = LIZLLL.width();
                    float height = LIZLLL.height();
                    DisplayMetrics displayMetrics = lynxBaseUI.mContext.LJLZ;
                    float LJ2 = VPR.LJ(lynxBaseUI.mExposureUIMarginLeft, width, displayMetrics);
                    float LJ3 = VPR.LJ(lynxBaseUI.mExposureUIMarginRight, width, displayMetrics);
                    float LJ4 = VPR.LJ(lynxBaseUI.mExposureUIMarginTop, height, displayMetrics);
                    float LJ5 = VPR.LJ(lynxBaseUI.mExposureUIMarginBottom, height, displayMetrics);
                    if (width + LJ2 + LJ3 <= 0.0f || height + LJ4 + LJ5 <= 0.0f) {
                        LIZLLL = new Rect();
                    } else {
                        LIZLLL.left = (int) (LIZLLL.left - LJ2);
                        LIZLLL.top = (int) (LIZLLL.top - LJ4);
                        LIZLLL.right = (int) (LIZLLL.right + LJ3);
                        LIZLLL.bottom = (int) (LIZLLL.bottom + LJ5);
                    }
                } else {
                    float f2 = LIZLLL.left;
                    float f3 = lynxBaseUI.mExposureScreenMarginRight;
                    if (f3 <= 0.0f) {
                        f3 = 0.0f;
                    }
                    LIZLLL.left = (int) (f2 - f3);
                    float f4 = LIZLLL.right;
                    float f5 = lynxBaseUI.mExposureScreenMarginLeft;
                    if (f5 <= 0.0f) {
                        f5 = 0.0f;
                    }
                    LIZLLL.right = (int) (f4 + f5);
                    float f6 = LIZLLL.top;
                    float f7 = lynxBaseUI.mExposureScreenMarginBottom;
                    if (f7 <= 0.0f) {
                        f7 = 0.0f;
                    }
                    LIZLLL.top = (int) (f6 - f7);
                    float f8 = LIZLLL.bottom;
                    float f9 = lynxBaseUI.mExposureScreenMarginTop;
                    if (f9 <= 0.0f) {
                        f9 = 0.0f;
                    }
                    LIZLLL.bottom = (int) (f8 + f9);
                }
                float LIZIZ = VPR.LIZIZ(lynxBaseUI.mExposureArea, 0.0f);
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!LJIIIZ(LIZIZ, LIZLLL, LIZLLL((LynxBaseUI) it2.next()))) {
                            break;
                        }
                    } else {
                        Rect LIZLLL2 = LIZLLL(this.LIZ.get());
                        if (this.LJIJ == null) {
                            this.LJIJ = LJFF(lynxBaseUI.mContext);
                        }
                        if (this.LJIJ != null) {
                            if (lynxBaseUI.getEnableExposureUIMargin()) {
                                rect = this.LJIJ;
                                if (rect.width() + lynxBaseUI.mExposureScreenMarginLeft + lynxBaseUI.mExposureScreenMarginRight > 0.0f) {
                                    float height2 = rect.height();
                                    float f10 = lynxBaseUI.mExposureScreenMarginTop;
                                    float f11 = lynxBaseUI.mExposureScreenMarginBottom;
                                    if (height2 + f10 + f11 > 0.0f) {
                                        rect.left = (int) (rect.left - lynxBaseUI.mExposureScreenMarginLeft);
                                        rect.top = (int) (rect.top - f10);
                                        rect.right = (int) (rect.right + lynxBaseUI.mExposureScreenMarginRight);
                                        rect.bottom = (int) (rect.bottom + f11);
                                    }
                                }
                                rect = new Rect();
                            } else {
                                Rect rect2 = this.LJIJ;
                                int i = rect2.left;
                                float f12 = lynxBaseUI.mExposureScreenMarginLeft;
                                if (f12 >= 0.0f) {
                                    f12 = 0.0f;
                                }
                                int i2 = i - ((int) f12);
                                int i3 = rect2.top;
                                float f13 = lynxBaseUI.mExposureScreenMarginTop;
                                if (f13 >= 0.0f) {
                                    f13 = 0.0f;
                                }
                                int i4 = i3 - ((int) f13);
                                int i5 = rect2.right;
                                float f14 = lynxBaseUI.mExposureScreenMarginRight;
                                if (f14 >= 0.0f) {
                                    f14 = 0.0f;
                                }
                                int i6 = i5 + ((int) f14);
                                int i7 = rect2.bottom;
                                float f15 = lynxBaseUI.mExposureScreenMarginBottom;
                                if (f15 < 0.0f) {
                                    f = f15;
                                }
                                rect = new Rect(i2, i4, i6, i7 + ((int) f));
                            }
                            if (LJIIIZ(LIZIZ, LIZLLL, LIZLLL2) && LJIIIZ(LIZIZ, LIZLLL, rect)) {
                                this.LJIILLIIL.add(new VOF(lynxBaseUI));
                            }
                        } else if (LJIIIZ(LIZIZ, LIZLLL, LIZLLL2)) {
                            this.LJIILLIIL.add(new VOF(lynxBaseUI));
                        }
                    }
                }
            }
        }
        HashSet<VOF> hashSet = new HashSet<>();
        hashSet.addAll(this.LJIIZILJ);
        hashSet.removeAll(this.LJIILLIIL);
        HashSet<VOF> hashSet2 = new HashSet<>();
        hashSet2.addAll(this.LJIILLIIL);
        hashSet2.removeAll(this.LJIIZILJ);
        this.LJIIZILJ = this.LJIILLIIL;
        this.LJIILLIIL = new HashSet<>();
        LJIIJ(hashSet, "disexposure");
        LJIIJ(hashSet2, "exposure");
        this.LJIIJ = false;
    }

    public final void LJIIJJI() {
        LIZJ();
        LJIIJ(new HashSet<>(this.LJIIZILJ), "disexposure");
        this.LJIIZILJ.clear();
    }

    public final void LJIIJ(HashSet<VOF> hashSet, String str) {
        VNS LJ = LJ();
        if (LJ != null && !hashSet.isEmpty()) {
            if (LJ.enableJSRuntime() || LJ.enableAirStrictMode()) {
                JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
                Iterator<VOF> it = hashSet.iterator();
                while (it.hasNext()) {
                    VOF next = it.next();
                    JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
                    javaOnlyMap.put("exposure-id", next.LIZIZ);
                    javaOnlyMap.put("exposureID", next.LIZIZ);
                    javaOnlyMap.put("exposure-scene", next.LIZJ);
                    javaOnlyMap.put("exposureScene", next.LIZJ);
                    javaOnlyMap.put("sign", String.valueOf(next.LIZLLL));
                    javaOnlyMap.put("dataSet", next.LJ);
                    javaOnlyMap.put("dataset", next.LJ);
                    javaOnlyArray.pushMap(javaOnlyMap);
                }
                JavaOnlyArray javaOnlyArray2 = new JavaOnlyArray();
                javaOnlyArray2.add(javaOnlyArray);
                LJ.sendGlobalEvent(str, javaOnlyArray2);
                return;
            }
            Iterator<VOF> it2 = hashSet.iterator();
            while (it2.hasNext()) {
                VOF next2 = it2.next();
                LynxBaseUI LJIIJ = LJ.getLynxContext().LJFF().LJIIJ(next2.LIZLLL);
                if (LJIIJ != null && LJIIJ.getEvents() != null && LJIIJ.getEvents().containsKey(str)) {
                    int sign = LJIIJ.getSign();
                    HashMap hashMap = new HashMap();
                    hashMap.put("exposure-id", next2.LIZIZ);
                    hashMap.put("exposure-scene", next2.LIZJ);
                    hashMap.put("dataset", next2.LJ);
                    LJIIJ.mContext.LJLJJL.LIZIZ(new C49615Jdb(sign, str, hashMap));
                }
            }
        }
    }

    public static boolean LJIIIZ(float f, Rect rect, Rect rect2) {
        float f2 = 0.0f;
        if (f != 0.0f) {
            if (new Rect().setIntersect(rect, rect2)) {
                f2 = (r3.width() * r3.height()) / (rect.width() * rect.height());
            }
            if (f2 >= f) {
                return true;
            }
            return false;
        }
        return Rect.intersects(rect, rect2);
    }
}
