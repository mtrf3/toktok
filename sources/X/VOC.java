package X;

import android.graphics.Rect;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes15.dex */
public final class VOC {
    public final int LIZ;
    public final WeakReference<C79646VNq> LIZIZ;
    public final LynxBaseUI LIZJ;
    public final LynxBaseUI LIZLLL;
    public LynxBaseUI LJ;
    public float LJFF;
    public float LJI;
    public float LJII;
    public float LJIIIIZZ;
    public final ArrayList<Float> LJIIIZ;
    public final float LJIIJ;
    public boolean LJIIJJI;
    public final ArrayList<VOB> LJIIL;
    public final boolean LJIILIIL;

    public final VNU LIZIZ() {
        C79646VNq c79646VNq = this.LIZIZ.get();
        if (c79646VNq == null) {
            LLog.LIZLLL(4, "LynxIntersectionObserver", "getContext failed because mManager is null");
            return null;
        }
        return c79646VNq.LJIIIZ();
    }

    public final Rect LIZJ() {
        Rect boundingClientRect;
        LynxBaseUI lynxBaseUI = this.LJ;
        if (lynxBaseUI != null) {
            boundingClientRect = lynxBaseUI.getBoundingClientRect();
        } else if (this.LJIIJJI) {
            boundingClientRect = this.LIZIZ.get().LJFF(LIZIZ());
        } else {
            boundingClientRect = this.LIZIZ.get().LJIIIZ().LJLJLLL.getBoundingClientRect();
        }
        boundingClientRect.left = (int) (boundingClientRect.left - this.LJFF);
        boundingClientRect.right = (int) (boundingClientRect.right + this.LJI);
        boundingClientRect.top = (int) (boundingClientRect.top - this.LJII);
        boundingClientRect.bottom = (int) (boundingClientRect.bottom + this.LJIIIIZZ);
        return boundingClientRect;
    }

    public final VOR LIZLLL() {
        VNU LIZIZ = LIZIZ();
        if (LIZIZ == null) {
            LLog.LIZLLL(4, "LynxIntersectionObserver", "getRootUIOwner failed because context is null");
            return null;
        }
        return LIZIZ.LJFF();
    }

    public final void LJ(ReadableMap readableMap) {
        this.LJFF = VPR.LIZIZ(readableMap.getString("left", CardStruct.IStatusCode.DEFAULT), 0.0f);
        this.LJI = VPR.LIZIZ(readableMap.getString("right", CardStruct.IStatusCode.DEFAULT), 0.0f);
        this.LJII = VPR.LIZIZ(readableMap.getString("top", CardStruct.IStatusCode.DEFAULT), 0.0f);
        this.LJIIIIZZ = VPR.LIZIZ(readableMap.getString("bottom", CardStruct.IStatusCode.DEFAULT), 0.0f);
    }

    public VOC(C79646VNq c79646VNq, ReadableMap readableMap, LynxBaseUI lynxBaseUI) {
        this(c79646VNq, -1, -1, readableMap);
        this.LIZJ = lynxBaseUI;
        String string = readableMap.getString("relativeToIdSelector", null);
        this.LJIIJJI = readableMap.getBoolean("relativeToScreen", false);
        this.LJFF = VPR.LIZIZ(readableMap.getString("marginLeft", CardStruct.IStatusCode.DEFAULT), 0.0f);
        this.LJI = VPR.LIZIZ(readableMap.getString("marginRight", CardStruct.IStatusCode.DEFAULT), 0.0f);
        this.LJII = VPR.LIZIZ(readableMap.getString("marginTop", CardStruct.IStatusCode.DEFAULT), 0.0f);
        this.LJIIIIZZ = VPR.LIZIZ(readableMap.getString("marginBottom", CardStruct.IStatusCode.DEFAULT), 0.0f);
        if (string != null && string.startsWith("#")) {
            VOR LJFF = this.LIZIZ.get().LJIIIZ().LJFF();
            String substring = string.substring(1);
            LJFF.getClass();
            this.LJ = VOR.LJIIIIZZ(substring, lynxBaseUI);
        }
        this.LJIILIIL = true;
        VOB vob = new VOB();
        vob.LIZ = lynxBaseUI;
        this.LJIIL.add(vob);
        LIZ(vob, LIZJ(), true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x0174, code lost:
    
        if (r12.intersect(r22) == false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:? A[LOOP:1: B:81:0x0132->B:101:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x013e A[EDGE_INSN: B:102:0x013e->B:94:0x013e BREAK  A[LOOP:1: B:81:0x0132->B:101:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x013e A[EDGE_INSN: B:93:0x013e->B:94:0x013e BREAK  A[LOOP:1: B:81:0x0132->B:101:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.VOB r21, android.graphics.Rect r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VOC.LIZ(X.VOB, android.graphics.Rect, boolean):void");
    }

    public VOC(C79646VNq c79646VNq, int i, int i2, ReadableMap readableMap) {
        LynxBaseUI lynxBaseUI;
        WeakReference<C79646VNq> weakReference = new WeakReference<>(c79646VNq);
        this.LIZIZ = weakReference;
        this.LIZ = i;
        if (i2 != -1) {
            VOR vor = weakReference.get().LJIIIZ().LJLLI.get();
            if (vor != null) {
                lynxBaseUI = vor.LJFF(i2);
            } else {
                lynxBaseUI = null;
            }
            this.LIZLLL = lynxBaseUI;
        } else {
            this.LIZLLL = weakReference.get().LJIIIZ().LJLJLLL;
        }
        ArrayList<Float> arrayList = new ArrayList<>();
        this.LJIIIZ = arrayList;
        ReadableArray array = readableMap.getArray("thresholds");
        if (array != null) {
            for (int i3 = 0; i3 < array.size(); i3++) {
                this.LJIIIZ.add(Float.valueOf((float) array.getDouble(i3)));
            }
        } else {
            arrayList.add(Float.valueOf(0.0f));
        }
        this.LJIIJ = (float) readableMap.getDouble("initialRatio", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
        readableMap.getBoolean("observeAll", false);
        this.LJIIL = new ArrayList<>();
        this.LJIILIIL = false;
    }
}
