package X;

import Y.AUListenerS101S0100000_14;
import Y.AUListenerS98S0100000_10;
import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;
import android.util.SparseArray;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIShadowProxy;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.VQa, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79708VQa {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public final LynxBaseUI LJI;
    public SparseArray<C79713VQf> LJIIIZ = new SparseArray<>();
    public final HashMap<Integer, Animator> LJII = new HashMap<>();
    public final HashMap<Integer, Animator> LJIIIIZZ = new HashMap<>();

    public final void LJ() {
        Iterator it = ((HashMap) this.LJII.clone()).values().iterator();
        while (it.hasNext()) {
            ((Animator) it.next()).cancel();
        }
        this.LJII.clear();
        this.LJIIIIZZ.clear();
    }

    public C79708VQa(LynxUI lynxUI) {
        this.LJI = lynxUI;
    }

    public final boolean LIZIZ(int i) {
        if (this.LJIIIZ.size() != 0 && this.LJIIIZ.get(i) != null) {
            return true;
        }
        return false;
    }

    public final boolean LIZJ(int i) {
        if (this.LJIIIZ.indexOfKey(i) >= 0) {
            return true;
        }
        return false;
    }

    public final void LJFF(Integer num) {
        Animator animator = this.LJII.get(num);
        if (animator != null) {
            animator.cancel();
            this.LJII.remove(num);
        }
    }

    public final void LIZ(LynxBaseUI lynxBaseUI, int i, Object obj) {
        LynxUI lynxUI;
        int i2;
        if (this.LJIIIZ.size() == 0 || this.LJIIIZ.get(i) == null) {
            return;
        }
        LynxBaseUI lynxBaseUI2 = this.LJI;
        if (lynxBaseUI2 == null) {
            lynxBaseUI2 = lynxBaseUI;
        }
        C79713VQf c79713VQf = this.LJIIIZ.get(i);
        float f = 1.0f;
        if (i != 1) {
            if (i != 64) {
                if (i != 128) {
                    if (i != 4096 || !(lynxBaseUI2 instanceof LynxUI)) {
                        return;
                    }
                    LynxUI lynxUI2 = (LynxUI) lynxBaseUI2;
                    lynxUI2.mContext.LJLJLLL.getLatestWidth();
                    lynxUI2.mContext.LJLJLLL.getLatestHeight();
                    C79716VQi LJIIIIZZ = C79716VQi.LJIIIIZZ((List) obj, lynxUI2.getLatestWidth(), lynxUI2.getLatestHeight());
                    if (LJIIIIZZ == null) {
                        return;
                    }
                    float translationX = lynxUI2.getTranslationX();
                    float translationY = lynxUI2.getTranslationY();
                    float translationZ = lynxUI2.mView.getTranslationZ();
                    float rotation = lynxUI2.mView.getRotation();
                    float rotationX = lynxUI2.mView.getRotationX();
                    float rotationY = lynxUI2.mView.getRotationY();
                    float scaleX = lynxUI2.mView.getScaleX();
                    float scaleY = lynxUI2.mView.getScaleY();
                    ValueAnimator ofInt = ValueAnimator.ofInt(0);
                    this.LJIIIIZZ.put(4096, ofInt);
                    ofInt.setDuration(c79713VQf.LJLILLLLZI);
                    ofInt.setInterpolator(C79723VQp.LIZ(c79713VQf));
                    ofInt.setStartDelay(c79713VQf.LJLJI);
                    ofInt.addListener(new C79717VQj(this, lynxUI2, i, lynxUI2, LJIIIIZZ));
                    ofInt.addUpdateListener(new C79718VQk(translationX, LJIIIIZZ, lynxUI2, translationY, translationZ, rotation, rotationX, rotationY, scaleX, scaleY));
                    return;
                }
                if (this.LJFF) {
                    return;
                }
                VPH vph = lynxBaseUI2.mParent;
                if (vph instanceof UIShadowProxy) {
                    lynxUI = (LynxUI) vph;
                } else {
                    lynxUI = (LynxUI) lynxBaseUI2;
                }
                int intValue = ((Integer) obj).intValue();
                int visibility = lynxUI.mView.getVisibility();
                if (intValue == 1) {
                    i2 = 0;
                } else {
                    i2 = 4;
                }
                if (visibility == i2) {
                    return;
                }
                this.LJ = true;
                float alpha = lynxUI.mView.getAlpha();
                float f2 = 0.0f;
                if (visibility == 0) {
                    f2 = alpha;
                    f = 0.0f;
                } else if ((visibility == 4 || visibility == 8) && i2 == 0) {
                    lynxUI.mView.setAlpha(0.0f);
                } else {
                    f2 = alpha;
                }
                ValueAnimator ofObject = ValueAnimator.ofObject(new FloatEvaluator(), Float.valueOf(f2), Float.valueOf(f));
                ofObject.setDuration(c79713VQf.LJLILLLLZI);
                ofObject.setInterpolator(C79723VQp.LIZ(c79713VQf));
                ofObject.setStartDelay(c79713VQf.LJLJI);
                ofObject.addUpdateListener(new AUListenerS98S0100000_10(lynxUI, 5));
                ofObject.addListener(new VQY(this, lynxBaseUI2, i, lynxUI, i2, alpha));
                this.LJIIIIZZ.put(128, ofObject);
                return;
            }
            int intValue2 = ((Integer) obj).intValue();
            ValueAnimator ofObject2 = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(lynxBaseUI2.mLynxBackground.LJ), Integer.valueOf(intValue2));
            this.LJIIIIZZ.put(64, ofObject2);
            ofObject2.setDuration(Math.round((float) c79713VQf.LJLILLLLZI));
            ofObject2.setInterpolator(C79723VQp.LIZ(c79713VQf));
            ofObject2.setStartDelay(c79713VQf.LJLJI);
            ofObject2.addListener(new VQV(this, lynxBaseUI2, i, lynxBaseUI2, intValue2));
            ofObject2.addUpdateListener(new AUListenerS101S0100000_14(lynxBaseUI2, 35));
            return;
        }
        if (this.LJ) {
            return;
        }
        float min = Math.min(((Float) obj).floatValue(), 1.0f);
        LynxUI lynxUI3 = (LynxUI) lynxBaseUI2;
        ValueAnimator ofObject3 = ValueAnimator.ofObject(new FloatEvaluator(), Float.valueOf(lynxUI3.mView.getAlpha()), Float.valueOf(min));
        this.LJIIIIZZ.put(1, ofObject3);
        ofObject3.setDuration(c79713VQf.LJLILLLLZI);
        ofObject3.setInterpolator(C79723VQp.LIZ(c79713VQf));
        ofObject3.setStartDelay(c79713VQf.LJLJI);
        ofObject3.addListener(new VQW(this, lynxUI3, i, lynxUI3, min));
        ofObject3.addUpdateListener(new AUListenerS101S0100000_14(lynxUI3, 36));
        this.LJFF = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        if (r4 != 2048) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.ValueAnimator LIZLLL(int r4, com.lynx.tasm.behavior.ui.LynxBaseUI r5, int r6, int r7, X.C79713VQf r8, boolean r9) {
        /*
            r3 = this;
            r0 = 2
            int[] r1 = new int[r0]
            r0 = 0
            r1[r0] = r6
            r0 = 1
            r1[r0] = r7
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofInt(r1)
            long r0 = r8.LJLILLLLZI
            r2.setDuration(r0)
            android.view.animation.Interpolator r0 = X.C79723VQp.LIZ(r8)
            r2.setInterpolator(r0)
            long r0 = r8.LJLJI
            r2.setStartDelay(r0)
            X.VQU r0 = new X.VQU
            r0.<init>(r5, r4, r3, r9)
            r2.addListener(r0)
            r0 = 16
            if (r4 == r0) goto L60
            r0 = 32
            if (r4 == r0) goto L55
            r0 = 256(0x100, float:3.59E-43)
            if (r4 == r0) goto L4a
            r0 = 512(0x200, float:7.17E-43)
            if (r4 == r0) goto L3f
            r0 = 1024(0x400, float:1.435E-42)
            if (r4 == r0) goto L4a
            r0 = 2048(0x800, float:2.87E-42)
            if (r4 == r0) goto L3f
        L3e:
            return r2
        L3f:
            Y.AUListenerS101S0100000_14 r1 = new Y.AUListenerS101S0100000_14
            r0 = 31
            r1.<init>(r5, r0)
            r2.addUpdateListener(r1)
            goto L3e
        L4a:
            Y.AUListenerS101S0100000_14 r1 = new Y.AUListenerS101S0100000_14
            r0 = 34
            r1.<init>(r5, r0)
            r2.addUpdateListener(r1)
            goto L3e
        L55:
            Y.AUListenerS101S0100000_14 r1 = new Y.AUListenerS101S0100000_14
            r0 = 33
            r1.<init>(r5, r0)
            r2.addUpdateListener(r1)
            goto L3e
        L60:
            Y.AUListenerS101S0100000_14 r1 = new Y.AUListenerS101S0100000_14
            r0 = 32
            r1.<init>(r5, r0)
            r2.addUpdateListener(r1)
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79708VQa.LIZLLL(int, com.lynx.tasm.behavior.ui.LynxBaseUI, int, int, X.VQf, boolean):android.animation.ValueAnimator");
    }
}
