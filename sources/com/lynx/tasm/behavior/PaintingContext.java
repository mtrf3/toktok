package com.lynx.tasm.behavior;

import X.C79411VEp;
import X.C79600VLw;
import X.VNA;
import X.VNQ;
import X.VNU;
import X.VOG;
import X.VOH;
import X.VOI;
import X.VOJ;
import X.VOK;
import X.VOR;
import X.VPA;
import X.VPH;
import X.VPJ;
import X.VPV;
import X.X1D;
import Y.ARunnableS50S0100000_14;
import Y.ARunnableS7S1100000_6;
import android.graphics.Rect;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.WritableArray;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.UIBody;
import com.lynx.tasm.behavior.ui.UIShadowProxy;
import com.lynx.tasm.behavior.ui.list.UIList;
import com.lynx.tasm.behavior.utils.LynxUIMethodsExecutor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes15.dex */
public final class PaintingContext {
    public static final Set<String> LIZLLL = new HashSet(Arrays.asList("x-overlay", "x-input", "input", "page"));
    public final VOR LIZ;
    public boolean LIZIZ;
    public final boolean LIZJ;

    public int[] getVisibleOverlayView() {
        try {
            Class<?> cls = Class.forName("com.bytedance.ies.xelement.overlay.ng.LynxOverlayViewCaptureHelperNG");
            Method method = cls.getMethod("getAllVisibleOverlaySign", new Class[0]);
            method.setAccessible(true);
            ArrayList arrayList = (ArrayList) method.invoke(cls.newInstance(), new Object[0]);
            int[] iArr = new int[arrayList.size()];
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                iArr[i] = ((Integer) ListProtector.get(arrayList, i)).intValue();
            }
            return iArr;
        } catch (Throwable unused) {
            return new int[0];
        }
    }

    public native void nativeInvokeCallback(long j, int i, WritableArray writableArray);

    public void onCollectExtraUpdates(int i) {
    }

    public void requestLayout() {
        C79411VEp.LJ(new ARunnableS50S0100000_14(this, 39));
    }

    public void FinishTasmOperation(long j) {
        List<VOJ> list = this.LIZ.LIZJ.LLD;
        if (list == null) {
            return;
        }
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            ((VOJ) it.next()).LJIIL();
        }
    }

    public int GetCurrentIndex(int i) {
        VPH LJIIJ = this.LIZ.LJIIJ(i);
        if (LJIIJ instanceof VOH) {
            return ((VOH) LJIIJ).getCurrentIndex();
        }
        return 0;
    }

    public boolean IsTagVirtual(String str) {
        VOR vor = this.LIZ;
        vor.getClass();
        try {
            ShadowNode LIZJ = vor.LJIIJ.LIZIZ(str).LIZJ();
            if (LIZJ != null) {
                return LIZJ.LJIIZILJ();
            }
        } catch (RuntimeException unused) {
        }
        return false;
    }

    public boolean IsViewVisible(int i) {
        VPH LJIIJ = this.LIZ.LJIIJ(i);
        if (LJIIJ instanceof VOI) {
            return ((VOI) LJIIJ).isViewVisible();
        }
        return true;
    }

    public void UpdateNodeReadyPatching(int[] iArr) {
        for (int i : iArr) {
            LynxBaseUI lynxBaseUI = this.LIZ.LJI.get(Integer.valueOf(i));
            if (lynxBaseUI != null) {
                if (lynxBaseUI instanceof UIShadowProxy) {
                    lynxBaseUI = ((UIShadowProxy) lynxBaseUI).LJLIL;
                }
                lynxBaseUI.onNodeReady();
            }
        }
    }

    public float[] getBoundingClientOrigin(int i) {
        float[] fArr = {0.0f, 0.0f};
        LynxBaseUI LJIIJ = this.LIZ.LJIIJ(i);
        if (LJIIJ != null) {
            Rect boundingClientRect = LJIIJ.getBoundingClientRect();
            fArr[0] = boundingClientRect.left;
            fArr[1] = boundingClientRect.top;
        }
        return fArr;
    }

    public float[] getRectToLynxView(int i) {
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f};
        LynxBaseUI LJIIJ = this.LIZ.LJIIJ(i);
        if (LJIIJ != null) {
            Rect boundingClientRect = LJIIJ.getBoundingClientRect();
            fArr[0] = boundingClientRect.left;
            fArr[1] = boundingClientRect.top;
            fArr[2] = boundingClientRect.width();
            fArr[3] = boundingClientRect.height();
        }
        return fArr;
    }

    public float[] getRectToWindow(int i) {
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f};
        LynxBaseUI LJIIJ = this.LIZ.LJIIJ(i);
        if (LJIIJ != null) {
            Rect rectToWindow = LJIIJ.getRectToWindow();
            fArr[0] = rectToWindow.left;
            fArr[1] = rectToWindow.top;
            fArr[2] = rectToWindow.width();
            fArr[3] = rectToWindow.height();
        }
        return fArr;
    }

    public float[] getWindowSize(int i) {
        float[] fArr = new float[2];
        LynxBaseUI LJIIJ = this.LIZ.LJIIJ(i);
        try {
            Class<?> cls = Class.forName("com.bytedance.ies.xelement.overlay.ng.LynxOverlayViewProxyNG");
            if (LJIIJ.getClass() == cls) {
                cls.getDeclaredField("screenWidth").setAccessible(true);
                cls.getDeclaredField("screenHeight").setAccessible(true);
                fArr[0] = ((Integer) r1.get(LJIIJ)).intValue();
                fArr[1] = ((Integer) r2.get(LJIIJ)).intValue();
            }
        } catch (Exception unused) {
        }
        return fArr;
    }

    public void onAnimatedNodeReady(int i) {
        LynxBaseUI lynxBaseUI = this.LIZ.LJI.get(Integer.valueOf(i));
        if (lynxBaseUI != null) {
            if (lynxBaseUI instanceof UIShadowProxy) {
                lynxBaseUI = ((UIShadowProxy) lynxBaseUI).LJLIL;
            }
            lynxBaseUI.onAnimatedNodeReady();
        }
    }

    public void scrollIntoView(int i) {
        LynxBaseUI LJIIJ = this.LIZ.LJIIJ(i);
        if (LJIIJ == null) {
            return;
        }
        LJIIJ.scrollIntoView(false, "center", "center");
    }

    public void setKeyframes(ReadableMap readableMap) {
        VNU vnu = this.LIZ.LIZJ;
        ReadableMap map = readableMap.getMap("keyframes");
        if (vnu.LJLJI == null) {
            vnu.LJLJI = new JavaOnlyMap();
        }
        vnu.LJLJI.merge(map);
    }

    public void updateEventInfo(boolean z) {
        boolean z2;
        VPV vpv = this.LIZ.LIZJ.LJLJJLL;
        if (vpv.LJIILL || z) {
            z2 = true;
        } else {
            z2 = false;
        }
        vpv.LJIILL = z2;
    }

    public void validate(int i) {
        LynxBaseUI LJIIJ = this.LIZ.LJIIJ(i);
        if (LJIIJ == null) {
            LLog.LIZLLL(4, "LynxUIOwner", "try to validate a not-existing node");
        } else {
            LJIIJ.renderIfNeeded();
        }
    }

    public PaintingContext(VOR vor, boolean z) {
        this.LIZ = vor;
        this.LIZJ = z;
    }

    public void MarkUIOperationQueueFlushTiming(String str, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(".");
        LIZ.append(str2);
        TraceEvent.LJII(X1D.LIZIZ(LIZ), "#4caf50");
        this.LIZ.LJIIIIZZ.LJIIIIZZ(str, System.currentTimeMillis(), str2);
    }

    public void destroyNode(int i, int i2) {
        LynxBaseUI lynxBaseUI;
        VOR vor = this.LIZ;
        vor.getClass();
        TraceEvent.LIZIZ("UIOwner.destroy");
        if (vor.LJI.size() > 0) {
            LynxBaseUI lynxBaseUI2 = vor.LJI.get(Integer.valueOf(i2));
            if (lynxBaseUI2 == null) {
                TraceEvent.LJ("UIOwner.destroy");
                return;
            }
            vor.LJ.remove(lynxBaseUI2);
            VOR.LJIIZILJ(lynxBaseUI2);
            vor.LJI.remove(Integer.valueOf(i2));
            vor.LIZJ.LJIIIZ(lynxBaseUI2);
            lynxBaseUI2.destroy();
            VPJ vpj = vor.LIZIZ.LJLJJI;
            if (vor.LJIJI(vpj)) {
                vpj.LIZJ(2, lynxBaseUI2, "");
            }
            VNQ vnq = vor.LJIILIIL.LJIIZILJ;
            if (vnq != null && !vnq.LJJIZ) {
                vor.LJ(lynxBaseUI2);
            }
            if (i == -1) {
                lynxBaseUI = lynxBaseUI2.getParentBaseUI();
            } else {
                lynxBaseUI = vor.LJI.get(Integer.valueOf(i));
            }
            if (lynxBaseUI == null) {
                TraceEvent.LJ("UIOwner.destroy");
                return;
            }
            lynxBaseUI.removeChild(lynxBaseUI2);
        }
        TraceEvent.LJ("UIOwner.destroy");
    }

    public float[] getTransformValue(int i, float[] fArr) {
        VOG transformValue;
        float[] fArr2 = new float[32];
        LynxBaseUI LJIIJ = this.LIZ.LJIIJ(i);
        if (LJIIJ != null) {
            for (int i2 = 0; i2 < 4; i2++) {
                if (i2 == 0) {
                    transformValue = LJIIJ.getTransformValue(fArr[0] + fArr[4] + fArr[12], ((-fArr[2]) - fArr[6]) - fArr[14], fArr[1] + fArr[5] + fArr[13], ((-fArr[3]) - fArr[7]) - fArr[15]);
                } else if (i2 == 1) {
                    transformValue = LJIIJ.getTransformValue(fArr[4] + fArr[12], (-fArr[6]) - fArr[14], fArr[5] + fArr[13], (-fArr[7]) - fArr[15]);
                } else if (i2 == 2) {
                    transformValue = LJIIJ.getTransformValue(fArr[12], -fArr[14], fArr[13], -fArr[15]);
                } else {
                    transformValue = LJIIJ.getTransformValue((-fArr[8]) + fArr[12], fArr[10] - fArr[14], (-fArr[9]) + fArr[13], fArr[11] - fArr[15]);
                }
                int i3 = i2 * 8;
                float[] fArr3 = transformValue.LIZ;
                fArr2[i3] = fArr3[0];
                fArr2[i3 + 1] = fArr3[1];
                float[] fArr4 = transformValue.LIZIZ;
                fArr2[i3 + 2] = fArr4[0];
                fArr2[i3 + 3] = fArr4[1];
                float[] fArr5 = transformValue.LIZJ;
                fArr2[i3 + 4] = fArr5[0];
                fArr2[i3 + 5] = fArr5[1];
                float[] fArr6 = transformValue.LIZLLL;
                fArr2[i3 + 6] = fArr6[0];
                fArr2[i3 + 7] = fArr6[1];
            }
        }
        return fArr2;
    }

    public void removeNode(int i, int i2) {
        this.LIZ.LJIILLIIL(i, i2);
    }

    public void reuseListNode(int i, String str) {
        LynxBaseUI lynxBaseUI = this.LIZ.LJI.get(Integer.valueOf(i));
        if (lynxBaseUI != null && (lynxBaseUI.getParentBaseUI() instanceof UIList)) {
            lynxBaseUI.onListCellPrepareForReuse(str, (UIList) lynxBaseUI.getParentBaseUI());
        }
    }

    public void updateDrawEndTimingState(boolean z, String str) {
        VOR vor = this.LIZ;
        if (z) {
            C79600VLw c79600VLw = vor.LJIIIIZZ;
            c79600VLw.getClass();
            if (str == null) {
                return;
            }
            C79411VEp.LJ(new ARunnableS7S1100000_6(c79600VLw, str, 2));
            return;
        }
        vor.getClass();
    }

    public void updateExtraData(int i, Object obj) {
        VOR vor = this.LIZ;
        vor.getClass();
        if (C79411VEp.LIZ()) {
            LynxBaseUI lynxBaseUI = vor.LJI.get(Integer.valueOf(i));
            if (lynxBaseUI != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("UIOwner.updateViewExtra");
                LIZ.append(lynxBaseUI.getTagName());
                String LIZIZ = X1D.LIZIZ(LIZ);
                TraceEvent.LIZIZ(LIZIZ);
                lynxBaseUI.updateExtraData(obj);
                TraceEvent.LJ(LIZIZ);
                return;
            }
            return;
        }
        throw new AssertionError("Expected to run on UI thread!");
    }

    public void updateFlattenStatus(int i, boolean z) {
        this.LIZ.LJIILL(i, z);
    }

    public void insertNode(int i, int i2, int i3) {
        this.LIZ.LJIIL(i, i2, i3);
    }

    public float[] scrollBy(int i, float f, float f2) {
        LynxBaseUI LJIIJ = this.LIZ.LJIIJ(i);
        if (LJIIJ != null) {
            return LJIIJ.scrollBy(f, f2);
        }
        return new float[]{0.0f, 0.0f, f, f2};
    }

    public void UpdateLayoutPatching(int[] iArr, int[] iArr2, float[] fArr, float[] fArr2) {
        Rect rect;
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = i3 * 19;
            float[] fArr3 = null;
            if (iArr2[i4 + 16] != 0) {
                int i5 = i * 4;
                rect = new Rect((int) fArr[i5], (int) fArr[i5 + 1], (int) fArr[i5 + 2], (int) fArr[i5 + 3]);
                i++;
            } else {
                rect = null;
            }
            if (iArr2[i4 + 17] != 0) {
                int i6 = i2 * 4;
                fArr3 = new float[]{fArr2[i6], fArr2[i6 + 1], fArr2[i6 + 2], fArr2[i6 + 3]};
                i2++;
            }
            this.LIZ.LJIJJLI(iArr[i3], iArr2[i4], iArr2[i4 + 1], iArr2[i4 + 2], iArr2[i4 + 3], iArr2[i4 + 4], iArr2[i4 + 5], iArr2[i4 + 6], iArr2[i4 + 7], iArr2[i4 + 8], iArr2[i4 + 9], iArr2[i4 + 10], iArr2[i4 + 11], iArr2[i4 + 12], iArr2[i4 + 13], iArr2[i4 + 14], iArr2[i4 + 15], rect, fArr3, iArr2[i4 + 18]);
        }
    }

    public void updateProps(int i, boolean z, ReadableMap readableMap, ReadableArray readableArray) {
        VPA vpa;
        VPH vph;
        Map<String, VNA> LIZ = VNA.LIZ(readableArray);
        VOR vor = this.LIZ;
        if (readableMap != null) {
            vpa = new VPA(readableMap);
        } else {
            vpa = null;
        }
        vor.getClass();
        if (C79411VEp.LIZ()) {
            LynxBaseUI lynxBaseUI = vor.LJI.get(Integer.valueOf(i));
            if (lynxBaseUI == null) {
                return;
            }
            vor.LJIJJ(i, lynxBaseUI.getTagName(), vpa);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("UIOwner.updateProps.");
            LIZ2.append(lynxBaseUI.getTagName());
            String LIZIZ = X1D.LIZIZ(LIZ2);
            TraceEvent.LIZIZ(LIZIZ);
            if (LIZ != null) {
                lynxBaseUI.setEvents(LIZ);
            }
            if (vpa != null) {
                vor.LIZ(vpa);
                if (!z && lynxBaseUI.isFlatten()) {
                    vor.LJIILL(i, z);
                    lynxBaseUI = vor.LJI.get(Integer.valueOf(i));
                }
                if (vpa.LJIIIIZZ("transition")) {
                    if (lynxBaseUI instanceof UIShadowProxy) {
                        ((UIShadowProxy) lynxBaseUI).LJLIL.initTransitionAnimator(vpa.LIZ);
                    } else {
                        lynxBaseUI.initTransitionAnimator(vpa.LIZ);
                    }
                }
                if (vpa.LJIIIIZZ("animation")) {
                    if (lynxBaseUI instanceof UIShadowProxy) {
                        ((UIShadowProxy) lynxBaseUI).LJLIL.setAnimation(vpa.LIZ("animation"));
                    } else {
                        lynxBaseUI.setAnimation(vpa.LIZ("animation"));
                    }
                }
                if (VOR.LJIIJJI(vpa) && ((vpa.LIZ("box-shadow") != null || vpa.LJFF("outline-style", -1) != -1) && !(lynxBaseUI instanceof UIShadowProxy) && (vph = lynxBaseUI.mParent) != null && !(vph instanceof UIShadowProxy))) {
                    LynxBaseUI parentBaseUI = lynxBaseUI.getParentBaseUI();
                    if (parentBaseUI == null) {
                        LLog.LIZLLL(4, "LynxUIOwner", "addShadowProxy failed, parent is null.");
                    } else {
                        int index = parentBaseUI.getIndex(lynxBaseUI);
                        vor.LJIILLIIL(parentBaseUI.getSign(), lynxBaseUI.getSign());
                        vor.LIZJ.LJIIIZ(lynxBaseUI);
                        UIShadowProxy uIShadowProxy = new UIShadowProxy(vor.LIZJ, lynxBaseUI);
                        vor.LJI.put(Integer.valueOf(lynxBaseUI.getSign()), uIShadowProxy);
                        vor.LJIIL(parentBaseUI.getSign(), uIShadowProxy.getSign(), index);
                    }
                }
                lynxBaseUI.updateProperties(vpa);
                if (lynxBaseUI.getParentBaseUI() != null) {
                    vor.LIZJ(lynxBaseUI.getSign(), lynxBaseUI.getParentBaseUI().getSign());
                }
            }
            TraceEvent.LJ(LIZIZ);
            return;
        }
        throw new AssertionError("Expected to run on UI thread!");
    }

    public void FinishLayoutOperation(int i, long j, boolean z, boolean z2, String str) {
        LynxBaseUI lynxBaseUI;
        VNU vnu;
        VOR vor = this.LIZ;
        if (vor.LIZJ.LLIIIJ) {
            Iterator<LynxBaseUI> it = vor.LJ.iterator();
            while (it.hasNext()) {
                LynxBaseUI next = it.next();
                if (next.mFlattenChildrenCount > 0 && next.mNeedSortChildren) {
                    Iterator<LynxBaseUI> it2 = next.getChildren().iterator();
                    while (it2.hasNext()) {
                        VOR.LJIIZILJ(it2.next());
                    }
                    try {
                        Collections.sort(next.getChildren(), VOR.LJIILJJIL);
                    } catch (Exception e) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("Something went wrong during sort children by translation Z ");
                        LIZ.append(e.getStackTrace());
                        LLog.LIZLLL(2, "LynxUIOwner", X1D.LIZIZ(LIZ));
                    }
                    VOR.LJIILIIL(next);
                    next.mNeedSortChildren = false;
                }
            }
        }
        VPJ vpj = vor.LIZIZ.LJLJJI;
        if (vor.LJIJI(vpj) && (vnu = vpj.LIZIZ.mContext) != null && !vpj.LJIIJJI.isEmpty()) {
            JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
            Iterator<JavaOnlyMap> it3 = vpj.LJIIJJI.iterator();
            while (it3.hasNext()) {
                javaOnlyArray.add(it3.next());
            }
            JavaOnlyArray javaOnlyArray2 = new JavaOnlyArray();
            javaOnlyArray2.add(javaOnlyArray);
            vnu.LJIIJJI("a11y-mutations", javaOnlyArray2);
            vpj.LJIIJJI.clear();
        }
        if (j == 0 || (lynxBaseUI = vor.LJI.get(Integer.valueOf((int) (j >>> 32)))) == null) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("UIOwner.layoutFinish.");
        LIZ2.append(lynxBaseUI.getTagName());
        String LIZIZ = X1D.LIZIZ(LIZ2);
        TraceEvent.LIZIZ(LIZIZ);
        lynxBaseUI.onLayoutFinish(j, vor.LJI.get(Integer.valueOf(i)));
        TraceEvent.LJ(LIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v6, types: [com.lynx.tasm.behavior.ui.LynxBaseUI] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [com.lynx.tasm.behavior.ui.LynxBaseUI] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.VOR] */
    public final void LIZ(int i, String str, ReadableMap readableMap, ReadableArray readableArray, boolean z) {
        VPA vpa;
        String str2;
        StringBuilder LIZ;
        HashMap<Integer, LynxBaseUI> hashMap;
        Integer valueOf;
        UIShadowProxy uIShadowProxy;
        ?? r3;
        UIShadowProxy uIShadowProxy2 = null;
        if (readableMap != null) {
            vpa = new VPA(readableMap);
        } else {
            vpa = null;
        }
        Map<String, VNA> LIZ2 = VNA.LIZ(readableArray);
        ?? r4 = this.LIZ;
        synchronized (r4) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("UIOwner.createView.");
            LIZ3.append(str);
            String LIZIZ = X1D.LIZIZ(LIZ3);
            TraceEvent.LIZIZ(LIZIZ);
            if (C79411VEp.LIZ()) {
                try {
                    if (r4.LIZ < 0 && str.equals("page")) {
                        UIBody uIBody = r4.LIZIZ;
                        r4.LIZ = i;
                        r3 = uIBody;
                    } else {
                        LynxBaseUI LIZLLL2 = r4.LIZLLL(str, z);
                        LIZLLL2.setEvents(LIZ2);
                        r3 = LIZLLL2;
                    }
                    r3.setSign(i, str);
                    if (vpa != null) {
                        try {
                            if (VOR.LJIIJJI(vpa)) {
                                uIShadowProxy2 = new UIShadowProxy(r4.LIZJ, r3);
                            }
                            r3.updatePropertiesInterval(vpa);
                        } catch (Throwable th) {
                            th = th;
                            uIShadowProxy2 = r3;
                            try {
                                StringBuilder LIZ4 = X1D.LIZ();
                                LIZ4.append("createUI catch error while createUI for tag: ");
                                LIZ4.append(str);
                                LIZ4.append(", ");
                                LIZ4.append(th.getMessage());
                                RuntimeException runtimeException = new RuntimeException(X1D.LIZIZ(LIZ4), th);
                                runtimeException.setStackTrace(th.getStackTrace());
                                r4.LIZIZ.mContext.handleException(runtimeException);
                                if (uIShadowProxy2 != null) {
                                    r4.LJIJ(str);
                                    r4.LJIJJ(i, str, vpa);
                                    hashMap = r4.LJI;
                                    valueOf = Integer.valueOf(i);
                                    uIShadowProxy = uIShadowProxy2;
                                    hashMap.put(valueOf, uIShadowProxy);
                                    TraceEvent.LJ(LIZIZ);
                                }
                                str2 = "LynxUIOwner";
                                LIZ = X1D.LIZ();
                                LIZ.append("createUI got null ui for tag:");
                                LIZ.append(str);
                                LLog.LIZLLL(4, str2, X1D.LIZIZ(LIZ));
                                TraceEvent.LJ(LIZIZ);
                            } catch (Throwable th2) {
                                if (uIShadowProxy2 == null) {
                                    StringBuilder LIZ5 = X1D.LIZ();
                                    LIZ5.append("createUI got null ui for tag:");
                                    LIZ5.append(str);
                                    LLog.LIZLLL(4, "LynxUIOwner", X1D.LIZIZ(LIZ5));
                                } else {
                                    r4.LJIJ(str);
                                    r4.LJIJJ(i, str, vpa);
                                    r4.LJI.put(Integer.valueOf(i), uIShadowProxy2);
                                }
                                throw th2;
                            }
                        }
                    }
                    r3 = r4.LIZIZ(r3, uIShadowProxy2, vpa);
                    r4.LIZ(vpa);
                } catch (Throwable th3) {
                    th = th3;
                }
                if (r3 == 0) {
                    str2 = "LynxUIOwner";
                    LIZ = X1D.LIZ();
                    LIZ.append("createUI got null ui for tag:");
                    LIZ.append(str);
                    LLog.LIZLLL(4, str2, X1D.LIZIZ(LIZ));
                    TraceEvent.LJ(LIZIZ);
                } else {
                    r4.LJIJ(str);
                    r4.LJIJJ(i, str, vpa);
                    hashMap = r4.LJI;
                    valueOf = Integer.valueOf(i);
                    uIShadowProxy = r3;
                    hashMap.put(valueOf, uIShadowProxy);
                    TraceEvent.LJ(LIZIZ);
                }
            } else {
                throw new AssertionError("Expected to run on UI thread!");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0086, code lost:
    
        if (r1.LJIIJ.LIZIZ(r8).LIZJ == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object createNode(int r20, java.lang.String r21, com.lynx.react.bridge.ReadableMap r22, com.lynx.react.bridge.ReadableArray r23, boolean r24) {
        /*
            r19 = this;
            r8 = r21
            java.lang.String r0 = "list"
            boolean r0 = r8.equals(r0)
            r9 = r22
            if (r0 == 0) goto L1a
            java.lang.String r0 = "custom-list-name"
            boolean r0 = r9.hasKey(r0)
            if (r0 == 0) goto L1a
            java.lang.String r0 = "custom-list-name"
            java.lang.String r8 = r9.getString(r0)
        L1a:
            com.lynx.tasm.LynxEnv r0 = com.lynx.tasm.LynxEnv.LJIIIZ()
            boolean r0 = r0.LJIIJ
            r7 = r20
            r5 = r19
            r10 = r23
            r11 = r24
            if (r0 != 0) goto L36
        L2a:
            X.VEk r0 = new X.VEk
            r1 = r5
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
        L36:
            X.VOR r0 = r5.LIZ
            com.lynx.tasm.TemplateAssembler r0 = r0.LJIILIIL
            if (r0 != 0) goto L3d
            goto L2a
        L3d:
            X.VNQ r0 = r0.LJIIZILJ
            if (r0 != 0) goto L42
            goto L2a
        L42:
            boolean r0 = r0.LJIJ
            if (r0 != 0) goto L47
            goto L2a
        L47:
            java.util.Set<java.lang.String> r0 = com.lynx.tasm.behavior.PaintingContext.LIZLLL
            java.util.HashSet r0 = (java.util.HashSet) r0
            boolean r0 = r0.contains(r8)
            if (r0 == 0) goto L52
            goto L2a
        L52:
            boolean r0 = r5.LIZJ
            if (r0 == 0) goto L70
        L56:
            if (r9 == 0) goto L6e
            X.VPA r4 = new X.VPA
            r4.<init>(r9)
        L5d:
            java.util.Map r16 = X.VNA.LIZ(r10)
            X.VOR r13 = r5.LIZ
            r13.LIZ(r4)
            java.util.concurrent.ExecutorService r0 = X.C64493PSv.LIZIZ
            if (r0 != 0) goto La4
            java.lang.Class<X.PSv> r3 = X.C64493PSv.class
            monitor-enter(r3)
            goto L89
        L6e:
            r4 = 0
            goto L5d
        L70:
            X.VOR r1 = r5.LIZ
            r1.getClass()
            java.lang.String r0 = "page"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L7e
            goto L2a
        L7e:
            X.N0t r0 = r1.LJIIJ
            X.Fq5 r0 = r0.LIZIZ(r8)
            boolean r0 = r0.LIZJ
            if (r0 == 0) goto L2a
            goto L56
        L89:
            java.util.concurrent.ExecutorService r0 = X.C64493PSv.LIZIZ     // Catch: java.lang.Throwable -> La1
            if (r0 != 0) goto L9f
            java.lang.String r2 = "lynx-view-op-thread"
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> La1
            int r1 = r0.availableProcessors()     // Catch: java.lang.Throwable -> La1
            r0 = 10
            java.util.concurrent.ExecutorService r0 = X.C64493PSv.LIZIZ(r0, r1, r2)     // Catch: java.lang.Throwable -> La1
            X.C64493PSv.LIZIZ = r0     // Catch: java.lang.Throwable -> La1
        L9f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> La1
            goto La4
        La1:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> La1
            throw r0
        La4:
            java.util.concurrent.ExecutorService r0 = X.C64493PSv.LIZIZ
            X.VJg r12 = new X.VJg
            r14 = r8
            r15 = r7
            r17 = r11
            r18 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18)
            java.util.concurrent.Future r6 = r0.submit(r12)
            X.VEj r4 = new X.VEj
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.PaintingContext.createNode(int, java.lang.String, com.lynx.react.bridge.ReadableMap, com.lynx.react.bridge.ReadableArray, boolean):java.lang.Object");
    }

    public void invoke(int i, String str, ReadableMap readableMap, long j, int i2) {
        LynxBaseUI LJIIJ = this.LIZ.LJIIJ(i);
        if (LJIIJ != null) {
            LynxUIMethodsExecutor.LIZ(LJIIJ, str, readableMap, new VOK(this, j, i2));
        }
    }

    public void updateLayout(int i, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float[] fArr, float[] fArr2, float f17) {
        Rect rect;
        VOR vor = this.LIZ;
        int i2 = (int) f;
        int i3 = (int) f2;
        int i4 = (int) f3;
        int i5 = (int) f4;
        int i6 = (int) f5;
        int i7 = (int) f6;
        int i8 = (int) f7;
        int i9 = (int) f8;
        int i10 = (int) f9;
        int i11 = (int) f10;
        int i12 = (int) f11;
        int i13 = (int) f12;
        int i14 = (int) f13;
        int i15 = (int) f14;
        int i16 = (int) f15;
        int i17 = (int) f16;
        if (fArr != null) {
            rect = new Rect((int) fArr[0], (int) fArr[1], (int) fArr[2], (int) fArr[3]);
        } else {
            rect = null;
        }
        vor.LJIJJLI(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, rect, fArr2, f17);
    }
}
