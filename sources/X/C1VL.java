package X;

import Y.IDLAdapterS2S0100000;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import com.bytedance.android.livesdk.livesetting.effect.LiveAndroidCycleThroughFiltersSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1VL, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1VL implements C0WG {
    public static boolean LJ;
    public static boolean LJFF;
    public static LiveEffect LJI;
    public static LiveEffect LJII;
    public static float LJIIJ;
    public static DataChannel LJIIJJI;
    public static boolean LJIIL;
    public static final C1VL LIZ = new C1VL();
    public static final C42681lw LIZIZ = C12880ey.LIZ();
    public static final String LIZJ = C0TY.LIZ();
    public static final boolean LIZLLL = C15380j0.LJIIZILJ();
    public static final C1VH LJIIIIZZ = C17250m1.LIZ();
    public static final C43381n4 LJIIIZ = (C43381n4) C43381n4.LJ.getValue();

    public static boolean LJIIIZ() {
        return !((ArrayList) LJIIIIZZ.LIZ).isEmpty();
    }

    public static boolean LJIIJ() {
        if (LiveAndroidCycleThroughFiltersSetting.INSTANCE.isEnabled()) {
            return false;
        }
        int LJIIIZ2 = LJIIIZ.LJIIIZ();
        if (C15380j0.LJIIZILJ()) {
            if (LJFF) {
                if (LJIIIZ2 < ((ArrayList) LJIIIIZZ.LIZ).size() - 1) {
                    return false;
                }
            } else if (LJIIIZ2 > 0) {
                return false;
            }
            return true;
        }
        if (LJFF) {
            if (LJIIIZ2 > 0) {
                return false;
            }
        } else if (LJIIIZ2 < ((ArrayList) LJIIIIZZ.LIZ).size() - 1) {
            return false;
        }
        return true;
    }

    @Override // X.C0WG
    public final int LJFF() {
        int i;
        int LJIIIZ2 = LJIIIZ.LJIIIZ();
        if (!LIZLLL ? !LJFF : LJFF) {
            i = LJIIIZ2 + 1;
        } else {
            i = LJIIIZ2 - 1;
        }
        boolean isEnabled = LiveAndroidCycleThroughFiltersSetting.INSTANCE.isEnabled();
        if (i < 0) {
            if (!isEnabled) {
                return 0;
            }
            return ((ArrayList) LJIIIIZZ.LIZ).size() - 1;
        }
        if (i >= ((ArrayList) LJIIIIZZ.LIZ).size()) {
            if (isEnabled) {
                return 0;
            }
            return ((ArrayList) r1.LIZ).size() - 1;
        }
        return i;
    }

    @Override // X.C0WG
    public final void release() {
        LJIIIZ.release();
        LJIIJJI = null;
    }

    @Override // X.C0WG
    public final void LJIIIIZZ() {
        Object obj;
        C0WB c0wb;
        if (!LJIIIZ() || LJIIJ()) {
            return;
        }
        C1VH c1vh = LJIIIIZZ;
        LJII = (LiveEffect) ListProtector.get(c1vh.LIZ, LJIIIZ.LJIIIZ());
        LiveEffect liveEffect = (LiveEffect) ListProtector.get(c1vh.LIZ, LJFF());
        LJI = liveEffect;
        if (!c1vh.LJIIIZ(liveEffect)) {
            C0TX.LIZ.LIZJ("ComposerFilterSlideHelper");
            C0NB.LIZIZ("effect_log", C0TX.LIZ("Filter isn't downloaded yet."));
            C0TX.LIZLLL = "";
            return;
        }
        C0TX.LIZ.LIZJ("ComposerFilterSlideHelper");
        C0TX.LIZLLL = "prepareNewFilter";
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("slideToRight: ");
        LIZ2.append(LJFF);
        LIZ2.append(" current: ");
        LIZ2.append(LJII);
        LIZ2.append(" new: ");
        LIZ2.append(LJI);
        C0TX.LIZIZ(X1D.LIZIZ(LIZ2));
        LiveEffect liveEffect2 = LJI;
        if (liveEffect2 == null || liveEffect2.isNone()) {
            return;
        }
        float LJII2 = c1vh.LJII(liveEffect2);
        C42681lw c42681lw = LIZIZ;
        String panelKey = LIZJ;
        o.LJIIIIZZ(panelKey, "panelKey");
        c42681lw.getClass();
        C12930f3 LJJIJIIJIL = C42681lw.LJJIJIIJIL(c42681lw, panelKey, liveEffect2, true, 16);
        if (LJJIJIIJIL == null) {
            return;
        }
        Iterator it = ((ArrayList) LJJIJIIJIL.LJI).iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String str = ((C12940f4) next).LIZ;
            LiveEffect.ComposerConfig smallItemConfig = liveEffect2.getSmallItemConfig();
            if (smallItemConfig != null) {
                obj = smallItemConfig.tag;
            }
            if (o.LJ(str, obj)) {
                obj = next;
                break;
            }
        }
        C12940f4 c12940f4 = (C12940f4) obj;
        if (c12940f4 != null) {
            c12940f4.LIZIZ = Float.valueOf(LJII2);
        }
        c42681lw.LJJJJ(false);
        String[] LJIIJ2 = C12920f2.LJIIJ(LJJIJIIJIL);
        String[] LJI2 = C12920f2.LJI(LJIIJ2, c42681lw.LJIIJ);
        c42681lw.LJJIZ(C47261Igj.LJJIJ(LJJIJIIJIL));
        C08780Wc c08780Wc = c42681lw.LJ;
        if (c08780Wc == null || (c0wb = c08780Wc.LIZJ) == null) {
            return;
        }
        c0wb.LJIIIZ(LJIIJ2, LJI2);
    }

    @Override // X.C0WG
    public final boolean LIZJ() {
        return LJ;
    }

    @Override // X.C0WG
    public final boolean LJ() {
        return LJFF;
    }

    @Override // X.C0WG
    public final void LIZ(boolean z) {
        LJFF = z;
    }

    @Override // X.C0WG
    public final void LIZLLL(float f) {
        if (!LJIIIZ() || LJIIJ()) {
            return;
        }
        LJIIJ = f;
        if (LJFF) {
            LJIIJJI(LJI, LJII, f);
        } else {
            LJIIJJI(LJII, LJI, f);
        }
    }

    @Override // X.C0WG
    public final void LJI(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        float f;
        if (!LJIIIZ()) {
            return;
        }
        if (!LJFF ? LJIIJ < 0.5f : LJIIJ >= 0.5f) {
            LJII(interfaceC65784Pro);
            return;
        }
        C0TX.LIZ.LIZJ("ComposerFilterSlideHelper");
        C0TX.LIZLLL = "rollbackToCurrentFilter";
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("current: ");
        LIZ2.append(LJII);
        C0TX.LIZIZ(X1D.LIZIZ(LIZ2));
        float[] fArr = new float[2];
        fArr[0] = LJIIJ;
        if (LJFF) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        fArr[1] = f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0m5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C1VL.LIZ.LIZLLL(((Float) C264612c.LIZ(valueAnimator, "animator", "null cannot be cast to non-null type kotlin.Float")).floatValue());
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: X.0m6
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animation) {
                o.LJIIIZ(animation, "animation");
                super.onAnimationEnd(animation);
                LiveEffect liveEffect = C1VL.LJI;
                if (liveEffect != null && (!liveEffect.isNone())) {
                    C42681lw c42681lw = C1VL.LIZIZ;
                    String panelKey = C1VL.LIZJ;
                    o.LJIIIIZZ(panelKey, "panelKey");
                    c42681lw.LJIILL(liveEffect, panelKey);
                }
            }
        });
        ofFloat.start();
    }

    @Override // X.C0WG
    public final void LJII(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        float f;
        if (!LJIIIZ() || LJIIJ()) {
            return;
        }
        C0TX.LIZ.LIZJ("ComposerFilterSlideHelper");
        C0TX.LIZLLL = "onFling";
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("newFilter: ");
        LIZ2.append(LJI);
        C0TX.LIZIZ(X1D.LIZIZ(LIZ2));
        float[] fArr = new float[2];
        fArr[0] = LJIIJ;
        if (LJFF) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        fArr[1] = f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0m3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C1VL.LIZ.LIZLLL(((Float) C264612c.LIZ(valueAnimator, "animator", "null cannot be cast to non-null type kotlin.Float")).floatValue());
            }
        });
        ofFloat.addListener(new IDLAdapterS2S0100000(interfaceC65784Pro, 5));
        ofFloat.start();
    }

    @Override // X.C0WG
    public final void LIZIZ(DataChannel dataChannel, boolean z) {
        if (!LJIIIZ()) {
            return;
        }
        LJIIJJI = dataChannel;
        LJ = z;
    }

    public static void LJIIJJI(LiveEffect liveEffect, LiveEffect liveEffect2, float f) {
        Object obj;
        List<C12940f4> list;
        Object obj2;
        C0WB c0wb;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (liveEffect != null && (!liveEffect.isNone())) {
            arrayList.add(liveEffect);
            arrayList2.add("leftSlidePosition");
        }
        if (liveEffect2 != null && (!liveEffect2.isNone())) {
            arrayList.add(liveEffect2);
            arrayList2.add("rightSlidePosition");
        }
        C42681lw c42681lw = LIZIZ;
        int i = 0;
        List values = C47261Igj.LJJIJIIJI(Float.valueOf(f), Float.valueOf(f));
        c42681lw.getClass();
        o.LJIIIZ(values, "values");
        C08780Wc c08780Wc = c42681lw.LJ;
        if (c08780Wc != null && c08780Wc.LIZJ != null) {
            ArrayList arrayList3 = new ArrayList(C32I.LJJL(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList3.add(((LiveEffect) it.next()).unzipPath);
            }
            String[] strArr = (String[]) arrayList3.toArray(new String[0]);
            C08780Wc c08780Wc2 = c42681lw.LJ;
            if (c08780Wc2 != null && (c0wb = c08780Wc2.LIZJ) != null) {
                c0wb.LIZIZ(strArr, (String[]) arrayList2.toArray(new String[0]), ORZ.LLIZ(values));
            }
            if (arrayList.size() != arrayList2.size() || arrayList.size() != values.size()) {
                return;
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                int i2 = i + 1;
                if (i >= 0) {
                    LiveEffect liveEffect3 = (LiveEffect) next;
                    Iterator it3 = ((ArrayList) c42681lw.LJII).iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj = it3.next();
                            if (o.LJ(((C12930f3) obj).LIZIZ, liveEffect3.getResourceId())) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    C12930f3 c12930f3 = (C12930f3) obj;
                    if (c12930f3 != null && (list = c12930f3.LJI) != null) {
                        Iterator it4 = ((ArrayList) list).iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                obj2 = it4.next();
                                if (o.LJ(((C12940f4) obj2).LIZ, ListProtector.get(arrayList2, i))) {
                                    break;
                                }
                            } else {
                                obj2 = null;
                                break;
                            }
                        }
                        C12940f4 c12940f4 = (C12940f4) obj2;
                        if (c12940f4 != null) {
                            c12940f4.LIZIZ = (Float) ListProtector.get(values, i);
                        }
                    }
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
    }
}
