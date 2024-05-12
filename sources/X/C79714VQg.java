package X;

import Y.AUListenerS101S0100000_14;
import Y.IDComparatorS42S0000000_14;
import android.animation.ArgbEvaluator;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.utils.BackgroundDrawable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.VQg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79714VQg {
    public final WeakReference<LynxUI> LIZIZ;
    public final WeakReference<View> LIZJ;
    public final VRB LIZ = new VRB();
    public final HashMap<String, Object> LIZLLL = new HashMap<>();
    public long LJ = -1;
    public C79719VQl LJFF = null;
    public ObjectAnimator[] LJI = null;
    public VR0 LJII = VR0.IDLE;
    public C79713VQf LJIIIIZZ = null;

    public final void LIZLLL() {
        VR0 vr0 = this.LJII;
        if (vr0 != VR0.RUNNING && vr0 != VR0.PAUSED) {
            return;
        }
        ObjectAnimator[] objectAnimatorArr = this.LJI;
        if (objectAnimatorArr != null && objectAnimatorArr.length > 0) {
            for (ObjectAnimator objectAnimator : objectAnimatorArr) {
                objectAnimator.cancel();
            }
        }
        this.LJI = null;
        this.LJII = VR0.CANCELED;
    }

    public final void LJ() {
        String str;
        VR0 vr0 = this.LJII;
        if (vr0 == VR0.CANCELED || vr0 == VR0.RUNNING || vr0 == VR0.PAUSED) {
            LynxUI LJI = LJI();
            C79713VQf c79713VQf = this.LJIIIIZZ;
            if (c79713VQf != null) {
                str = c79713VQf.LJLIL;
            } else {
                str = "";
            }
            C79709VQb.LIZIZ(LJI, "animationcancel", str);
        }
        LIZLLL();
        LJIIIZ();
        this.LJII = VR0.DESTROYED;
    }

    public final LynxUI LJI() {
        return this.LIZIZ.get();
    }

    public final void LJIIIZ() {
        C79715VQh c79715VQh;
        View view = this.LIZJ.get();
        LynxUI LJI = LJI();
        if (LJI == null || view == null) {
            return;
        }
        for (Map.Entry<String, Object> entry : this.LIZLLL.entrySet()) {
            String key = entry.getKey();
            key.getClass();
            switch (key.hashCode()) {
                case -1238332596:
                    if (key.equals("Transform") && (c79715VQh = LJI.mBackgroundManager) != null) {
                        c79715VQh.LJIIJJI((List) entry.getValue());
                        break;
                    }
                    break;
                case 63357246:
                    if (key.equals("Alpha")) {
                        view.setAlpha(((Float) entry.getValue()).floatValue());
                        break;
                    } else {
                        break;
                    }
                case 65290051:
                    if (key.equals("Color")) {
                        LJFF().setColor(((Integer) entry.getValue()).intValue());
                        break;
                    } else {
                        break;
                    }
                case 290107061:
                    if (key.equals("BackgroundColor")) {
                        view.setBackgroundColor(((Integer) entry.getValue()).intValue());
                        break;
                    } else {
                        break;
                    }
            }
        }
    }

    public final boolean LJIIJJI() {
        VQ7 vq7;
        LynxUI lynxUI = this.LIZIZ.get();
        C79719VQl c79719VQl = this.LJFF;
        if (((c79719VQl != null && c79719VQl.LJIIJ) || ((vq7 = LJI().mTransformOrigin) != null && (vq7.LIZIZ == 1 || vq7.LIZLLL == 1))) && lynxUI != null && lynxUI.hasSizeChanged()) {
            return true;
        }
        return false;
    }

    public final BackgroundDrawable LJFF() {
        C79715VQh c79715VQh;
        LynxUI LJI = LJI();
        if (LJI == null || (c79715VQh = LJI.mBackgroundManager) == null) {
            return null;
        }
        return c79715VQh.LIZIZ;
    }

    public final void LIZ(C79713VQf c79713VQf) {
        int i;
        PropertyValuesHolder[] propertyValuesHolderArr;
        PropertyValuesHolder LIZIZ;
        int i2;
        PropertyValuesHolder[] propertyValuesHolderArr2;
        Object obj;
        long j;
        int i3;
        int length;
        long currentTimeMillis;
        C79713VQf c79713VQf2 = this.LJIIIIZZ;
        if (c79713VQf2 != null) {
            c79713VQf.LJLIL.equals(c79713VQf2.LJLIL);
        }
        if (LJI() == null) {
            return;
        }
        int i4 = VR3.LIZ[this.LJII.ordinal()];
        int i5 = 3;
        long j2 = 0;
        int i6 = 1;
        if (i4 != 1 && i4 != 2) {
            if (i4 != 3 && i4 != 4) {
                return;
            }
            C79713VQf c79713VQf3 = this.LJIIIIZZ;
            if (c79713VQf3 != null && c79713VQf.LIZ(c79713VQf3) && c79713VQf.LJLLL == c79713VQf3.LJLLL && !LJIIJJI()) {
                return;
            }
            C79713VQf c79713VQf4 = this.LJIIIIZZ;
            if (c79713VQf.LIZ(c79713VQf4) && c79713VQf.LJLLL != c79713VQf4.LJLLL) {
                if (this.LJII == VR0.PAUSED) {
                    this.LJII = VR0.RUNNING;
                    ObjectAnimator[] objectAnimatorArr = this.LJI;
                    if (objectAnimatorArr != null) {
                        for (ObjectAnimator objectAnimator : objectAnimatorArr) {
                            objectAnimator.resume();
                        }
                    }
                    long j3 = this.LJ;
                    VRB vrb = this.LIZ;
                    if (vrb.LIZ != -1) {
                        j2 = System.currentTimeMillis() - vrb.LIZ;
                        vrb.LIZ = -1L;
                    }
                    this.LJ = j2 + j3;
                    this.LJIIIIZZ = c79713VQf;
                    return;
                }
                LJIIIIZZ(c79713VQf);
                return;
            }
            LIZLLL();
            LIZ(c79713VQf);
            return;
        }
        C79713VQf c79713VQf5 = this.LJIIIIZZ;
        if ((c79713VQf5 != null && c79713VQf.LIZ(c79713VQf5) && c79713VQf.LJLLL == c79713VQf5.LJLLL && this.LJII == VR0.IDLE && !LJIIJJI()) || c79713VQf.LJLLI < 0 || c79713VQf.LJLILLLLZI <= 0) {
            return;
        }
        Object obj2 = this.LIZJ.get();
        LynxUI LJI = LJI();
        if (obj2 == null || LJI == null) {
            return;
        }
        if (this.LJFF == null || LJIIJJI()) {
            ReadableMap keyframes = LJI.getKeyframes(c79713VQf.LJLIL);
            if (keyframes != null) {
                C79719VQl c79719VQl = new C79719VQl();
                ReadableMapKeySetIterator keySetIterator = keyframes.keySetIterator();
                while (keySetIterator.hasNextKey()) {
                    String nextKey = keySetIterator.nextKey();
                    float parseFloat = CastFloatProtector.parseFloat(nextKey);
                    int i7 = c79713VQf.LJLLJ;
                    if (i7 == i6 || i7 == i5) {
                        parseFloat = 1.0f - parseFloat;
                    }
                    ReadableMap map = keyframes.getMap(nextKey);
                    ReadableMapKeySetIterator keySetIterator2 = map.keySetIterator();
                    while (keySetIterator2.hasNextKey()) {
                        String nextKey2 = keySetIterator2.nextKey();
                        if (nextKey2.equals("opacity")) {
                            LJIIJ(Float.valueOf(this.LIZJ.get().getAlpha()), "Alpha");
                            LIZJ(parseFloat, EnumC79721VQn.OPACITY, c79719VQl);
                            float f = (float) map.getDouble(nextKey2);
                            if (f >= 0.0f && f <= 1.0f) {
                                c79719VQl.LIZ.add(Keyframe.ofFloat(parseFloat, f));
                                i5 = 3;
                                i6 = 1;
                            }
                        } else {
                            if (nextKey2.equals("transform")) {
                                LJIIJ(LJI.mTransformRaw, "Transform");
                                List<VQ4> LIZJ = VQ4.LIZJ(map.getArray(nextKey2));
                                LJI.mContext.LJLJLLL.getLatestWidth();
                                LJI.mContext.LJLJLLL.getLatestHeight();
                                C79716VQi LJIIIIZZ = C79716VQi.LJIIIIZZ(LIZJ, LJI.getLatestWidth(), LJI.getLatestHeight());
                                if (LJIIIIZZ != null) {
                                    if (VQ4.LIZ(LIZJ)) {
                                        c79719VQl.LJIIJ = true;
                                    }
                                    LIZJ(parseFloat, EnumC79721VQn.TRANSLATE_X, c79719VQl);
                                    c79719VQl.LIZIZ.add(Keyframe.ofFloat(parseFloat, LJIIIIZZ.LJFF()));
                                    LIZJ(parseFloat, EnumC79721VQn.TRANSLATE_Y, c79719VQl);
                                    c79719VQl.LIZJ.add(Keyframe.ofFloat(parseFloat, LJIIIIZZ.LJI()));
                                    LJI.mView.setOutlineProvider(null);
                                    LIZJ(parseFloat, EnumC79721VQn.TRANSLATE_Z, c79719VQl);
                                    c79719VQl.LIZLLL.add(Keyframe.ofFloat(parseFloat, LJIIIIZZ.LJII()));
                                    LIZJ(parseFloat, EnumC79721VQn.ROTATE_Z, c79719VQl);
                                    c79719VQl.LJ.add(Keyframe.ofFloat(parseFloat, LJIIIIZZ.LIZ()));
                                    LIZJ(parseFloat, EnumC79721VQn.ROTATE_X, c79719VQl);
                                    c79719VQl.LJFF.add(Keyframe.ofFloat(parseFloat, LJIIIIZZ.LIZIZ()));
                                    LIZJ(parseFloat, EnumC79721VQn.ROTATE_Y, c79719VQl);
                                    c79719VQl.LJI.add(Keyframe.ofFloat(parseFloat, LJIIIIZZ.LIZJ()));
                                    LIZJ(parseFloat, EnumC79721VQn.SCALE_X, c79719VQl);
                                    c79719VQl.LJII.add(Keyframe.ofFloat(parseFloat, LJIIIIZZ.LIZLLL()));
                                    LIZJ(parseFloat, EnumC79721VQn.SCALE_Y, c79719VQl);
                                    c79719VQl.LJIIIIZZ.add(Keyframe.ofFloat(parseFloat, LJIIIIZZ.LJ()));
                                }
                            } else if (nextKey2.equals("background-color")) {
                                if (LJFF() == null) {
                                    LJIIJ(Integer.valueOf(LJI.getBackgroundColor()), "BackgroundColor");
                                } else {
                                    LJIIJ(Integer.valueOf(LJI.getBackgroundColor()), "Color");
                                }
                                LIZJ(parseFloat, EnumC79721VQn.BG_COLOR, c79719VQl);
                                c79719VQl.LJIIIZ.add(Keyframe.ofInt(parseFloat, map.getInt(nextKey2)));
                            }
                            i5 = 3;
                            i6 = 1;
                        }
                    }
                }
                if (LJFF() != null) {
                    i = 2;
                } else {
                    i = 1;
                }
                int i8 = 0;
                do {
                    View view = this.LIZJ.get();
                    LynxUI LJI2 = LJI();
                    if (view != null && LJI2 != null) {
                        ArrayList arrayList = new ArrayList();
                        IDComparatorS42S0000000_14 iDComparatorS42S0000000_14 = new IDComparatorS42S0000000_14(10);
                        if (c79719VQl.LIZ.size() != 0 && i8 == 0) {
                            java.util.Set<EnumC79721VQn> set = c79719VQl.LJIIJJI;
                            EnumC79721VQn enumC79721VQn = EnumC79721VQn.OPACITY;
                            if (!((HashSet) set).contains(enumC79721VQn)) {
                                c79719VQl.LIZ.add(Keyframe.ofFloat(0.0f, view.getAlpha()));
                            }
                            if (!((HashSet) c79719VQl.LJIIL).contains(enumC79721VQn)) {
                                c79719VQl.LIZ.add(Keyframe.ofFloat(1.0f, view.getAlpha()));
                            }
                            Collections.sort(c79719VQl.LIZ, iDComparatorS42S0000000_14);
                            arrayList.add(LIZIZ("Alpha", c79719VQl.LIZ));
                        }
                        if (c79719VQl.LIZIZ.size() != 0 && i8 == 0) {
                            java.util.Set<EnumC79721VQn> set2 = c79719VQl.LJIIJJI;
                            EnumC79721VQn enumC79721VQn2 = EnumC79721VQn.TRANSLATE_X;
                            if (!((HashSet) set2).contains(enumC79721VQn2)) {
                                c79719VQl.LIZIZ.add(Keyframe.ofFloat(0.0f, view.getTranslationX()));
                            }
                            if (!((HashSet) c79719VQl.LJIIL).contains(enumC79721VQn2)) {
                                c79719VQl.LIZIZ.add(Keyframe.ofFloat(1.0f, view.getTranslationX()));
                            }
                            Collections.sort(c79719VQl.LIZIZ, iDComparatorS42S0000000_14);
                            arrayList.add(LIZIZ("TranslationX", c79719VQl.LIZIZ));
                        }
                        if (c79719VQl.LIZJ.size() != 0 && i8 == 0) {
                            java.util.Set<EnumC79721VQn> set3 = c79719VQl.LJIIJJI;
                            EnumC79721VQn enumC79721VQn3 = EnumC79721VQn.TRANSLATE_Y;
                            if (!((HashSet) set3).contains(enumC79721VQn3)) {
                                c79719VQl.LIZJ.add(Keyframe.ofFloat(0.0f, view.getTranslationY()));
                            }
                            if (!((HashSet) c79719VQl.LJIIL).contains(enumC79721VQn3)) {
                                c79719VQl.LIZJ.add(Keyframe.ofFloat(1.0f, view.getTranslationY()));
                            }
                            Collections.sort(c79719VQl.LIZJ, iDComparatorS42S0000000_14);
                            arrayList.add(LIZIZ("TranslationY", c79719VQl.LIZJ));
                        }
                        if (c79719VQl.LIZLLL.size() != 0 && i8 == 0) {
                            float translationZ = view.getTranslationZ();
                            java.util.Set<EnumC79721VQn> set4 = c79719VQl.LJIIJJI;
                            EnumC79721VQn enumC79721VQn4 = EnumC79721VQn.TRANSLATE_Z;
                            if (!((HashSet) set4).contains(enumC79721VQn4)) {
                                c79719VQl.LIZLLL.add(Keyframe.ofFloat(0.0f, translationZ));
                            }
                            if (!((HashSet) c79719VQl.LJIIL).contains(enumC79721VQn4)) {
                                c79719VQl.LIZLLL.add(Keyframe.ofFloat(1.0f, translationZ));
                            }
                            Collections.sort(c79719VQl.LIZLLL, iDComparatorS42S0000000_14);
                            arrayList.add(LIZIZ("TranslationZ", c79719VQl.LIZLLL));
                        }
                        if (c79719VQl.LJ.size() != 0 && i8 == 0) {
                            java.util.Set<EnumC79721VQn> set5 = c79719VQl.LJIIJJI;
                            EnumC79721VQn enumC79721VQn5 = EnumC79721VQn.ROTATE_Z;
                            if (!((HashSet) set5).contains(enumC79721VQn5)) {
                                c79719VQl.LJ.add(Keyframe.ofFloat(0.0f, view.getRotation()));
                            }
                            if (!((HashSet) c79719VQl.LJIIL).contains(enumC79721VQn5)) {
                                c79719VQl.LJ.add(Keyframe.ofFloat(1.0f, view.getRotation()));
                            }
                            Collections.sort(c79719VQl.LJ, iDComparatorS42S0000000_14);
                            arrayList.add(LIZIZ("Rotation", c79719VQl.LJ));
                        }
                        if (c79719VQl.LJFF.size() != 0 && i8 == 0) {
                            java.util.Set<EnumC79721VQn> set6 = c79719VQl.LJIIJJI;
                            EnumC79721VQn enumC79721VQn6 = EnumC79721VQn.ROTATE_X;
                            if (!((HashSet) set6).contains(enumC79721VQn6)) {
                                c79719VQl.LJFF.add(Keyframe.ofFloat(0.0f, view.getRotationX()));
                            }
                            if (!((HashSet) c79719VQl.LJIIL).contains(enumC79721VQn6)) {
                                c79719VQl.LJFF.add(Keyframe.ofFloat(1.0f, view.getRotationX()));
                            }
                            Collections.sort(c79719VQl.LJFF, iDComparatorS42S0000000_14);
                            arrayList.add(LIZIZ("RotationX", c79719VQl.LJFF));
                        }
                        if (c79719VQl.LJI.size() != 0 && i8 == 0) {
                            java.util.Set<EnumC79721VQn> set7 = c79719VQl.LJIIJJI;
                            EnumC79721VQn enumC79721VQn7 = EnumC79721VQn.ROTATE_Y;
                            if (!((HashSet) set7).contains(enumC79721VQn7)) {
                                c79719VQl.LJI.add(Keyframe.ofFloat(0.0f, view.getRotationY()));
                            }
                            if (!((HashSet) c79719VQl.LJIIL).contains(enumC79721VQn7)) {
                                c79719VQl.LJI.add(Keyframe.ofFloat(1.0f, view.getRotationY()));
                            }
                            Collections.sort(c79719VQl.LJI, iDComparatorS42S0000000_14);
                            arrayList.add(LIZIZ("RotationY", c79719VQl.LJI));
                        }
                        if (c79719VQl.LJII.size() != 0 && i8 == 0) {
                            java.util.Set<EnumC79721VQn> set8 = c79719VQl.LJIIJJI;
                            EnumC79721VQn enumC79721VQn8 = EnumC79721VQn.SCALE_X;
                            if (!((HashSet) set8).contains(enumC79721VQn8)) {
                                c79719VQl.LJII.add(Keyframe.ofFloat(0.0f, view.getScaleX()));
                            }
                            if (!((HashSet) c79719VQl.LJIIL).contains(enumC79721VQn8)) {
                                c79719VQl.LJII.add(Keyframe.ofFloat(1.0f, view.getScaleX()));
                            }
                            Collections.sort(c79719VQl.LJII, iDComparatorS42S0000000_14);
                            arrayList.add(LIZIZ("ScaleX", c79719VQl.LJII));
                        }
                        if (c79719VQl.LJIIIIZZ.size() != 0 && i8 == 0) {
                            java.util.Set<EnumC79721VQn> set9 = c79719VQl.LJIIJJI;
                            EnumC79721VQn enumC79721VQn9 = EnumC79721VQn.SCALE_Y;
                            if (!((HashSet) set9).contains(enumC79721VQn9)) {
                                c79719VQl.LJIIIIZZ.add(Keyframe.ofFloat(0.0f, view.getScaleY()));
                            }
                            if (!((HashSet) c79719VQl.LJIIL).contains(enumC79721VQn9)) {
                                c79719VQl.LJIIIIZZ.add(Keyframe.ofFloat(1.0f, view.getScaleY()));
                            }
                            Collections.sort(c79719VQl.LJIIIIZZ, iDComparatorS42S0000000_14);
                            arrayList.add(LIZIZ("ScaleY", c79719VQl.LJIIIIZZ));
                        }
                        if (c79719VQl.LJIIIZ.size() != 0 && i8 + 1 == i) {
                            java.util.Set<EnumC79721VQn> set10 = c79719VQl.LJIIJJI;
                            EnumC79721VQn enumC79721VQn10 = EnumC79721VQn.BG_COLOR;
                            if (!((HashSet) set10).contains(enumC79721VQn10)) {
                                c79719VQl.LJIIIZ.add(Keyframe.ofInt(0.0f, LJI2.getBackgroundColor()));
                            }
                            if (!((HashSet) c79719VQl.LJIIL).contains(enumC79721VQn10)) {
                                c79719VQl.LJIIIZ.add(Keyframe.ofInt(1.0f, LJI2.getBackgroundColor()));
                            }
                            Collections.sort(c79719VQl.LJIIIZ, iDComparatorS42S0000000_14);
                            if (i8 == 0) {
                                LIZIZ = LIZIZ("BackgroundColor", c79719VQl.LJIIIZ);
                            } else {
                                LIZIZ = LIZIZ("Color", c79719VQl.LJIIIZ);
                            }
                            LIZIZ.setEvaluator(new ArgbEvaluator());
                            arrayList.add(LIZIZ);
                        }
                        if (arrayList.size() != 0 && (propertyValuesHolderArr = (PropertyValuesHolder[]) arrayList.toArray(new PropertyValuesHolder[arrayList.size()])) != null) {
                            if (i8 == 0) {
                                c79719VQl.LJIILIIL = propertyValuesHolderArr;
                            } else if (i8 == 1) {
                                c79719VQl.LJIILJJIL = propertyValuesHolderArr;
                            }
                        }
                    }
                    i8++;
                } while (i8 < i);
                this.LJFF = c79719VQl;
            }
            LLog.LIZLLL(4, "Lynx", "Keyframes input error.");
            return;
        }
        long j4 = this.LJ;
        if (j4 != -1 && c79713VQf.LJLLL == 1) {
            VRB vrb2 = this.LIZ;
            if (vrb2.LIZ == -1) {
                currentTimeMillis = 0;
            } else {
                currentTimeMillis = System.currentTimeMillis() - vrb2.LIZ;
                vrb2.LIZ = -1L;
            }
            this.LJ = currentTimeMillis + j4;
        }
        Object LJFF = LJFF();
        if (LJFF != null) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        ObjectAnimator[] objectAnimatorArr2 = new ObjectAnimator[i2];
        int i9 = 0;
        int i10 = 0;
        do {
            C79719VQl c79719VQl2 = this.LJFF;
            if (i9 == 1) {
                propertyValuesHolderArr2 = c79719VQl2.LJIILJJIL;
            } else {
                propertyValuesHolderArr2 = c79719VQl2.LJIILIIL;
            }
            if (propertyValuesHolderArr2 != null) {
                if (i9 == 1) {
                    obj = LJFF;
                } else {
                    obj = obj2;
                }
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(obj, propertyValuesHolderArr2);
                ofPropertyValuesHolder.addUpdateListener(new AUListenerS101S0100000_14(this, 25));
                objectAnimatorArr2[i9] = ofPropertyValuesHolder;
                ofPropertyValuesHolder.setDuration(c79713VQf.LJLILLLLZI);
                ofPropertyValuesHolder.setRepeatCount(c79713VQf.LJLLI);
                int i11 = c79713VQf.LJLLJ;
                if (i11 == 2 || i11 == 3) {
                    ofPropertyValuesHolder.setRepeatMode(2);
                } else {
                    ofPropertyValuesHolder.setRepeatMode(1);
                }
                ofPropertyValuesHolder.setInterpolator(C79723VQp.LIZ(c79713VQf));
                if (c79713VQf.LJLJI != 0 && ((i3 = c79713VQf.LJLLILLLL) == 2 || i3 == 3)) {
                    ObjectAnimator clone = ofPropertyValuesHolder.clone();
                    clone.setDuration(10000000L);
                    clone.addListener(new VR5());
                    clone.start();
                }
                i10++;
                long j5 = c79713VQf.LJLJI;
                if (j5 >= 0) {
                    ofPropertyValuesHolder.setStartDelay(j5);
                    j = -1;
                } else {
                    j = -1;
                    ofPropertyValuesHolder.setCurrentPlayTime(j5 * (-1));
                }
                if (this.LJ != j) {
                    long currentTimeMillis2 = System.currentTimeMillis() - this.LJ;
                    long j6 = c79713VQf.LJLJI;
                    if (currentTimeMillis2 < j6) {
                        ofPropertyValuesHolder.setStartDelay(j6 - currentTimeMillis2);
                    } else {
                        ofPropertyValuesHolder.setCurrentPlayTime(currentTimeMillis2 - j6);
                    }
                }
                ofPropertyValuesHolder.start();
            }
            i9++;
        } while (i9 < i2);
        if (i10 == 0) {
            this.LJI = null;
        } else if (i10 == i2) {
            this.LJI = objectAnimatorArr2;
        } else {
            this.LJI = new ObjectAnimator[i10];
            int i12 = 0;
            int i13 = 0;
            do {
                ObjectAnimator objectAnimator2 = objectAnimatorArr2[i12];
                if (objectAnimator2 != null) {
                    this.LJI[i13] = objectAnimator2;
                    i13++;
                }
                i12++;
            } while (i12 < i2);
        }
        ObjectAnimator[] objectAnimatorArr3 = this.LJI;
        if (objectAnimatorArr3 != null && (length = objectAnimatorArr3.length) > 0) {
            objectAnimatorArr3[length - 1].addListener(new C79709VQb(this));
        }
        if (this.LJ == -1) {
            this.LJ = System.currentTimeMillis();
        }
        if (!LJII(c79713VQf)) {
            if (this.LJII == VR0.IDLE) {
                C79709VQb.LIZIZ(LJI, "animationstart", c79713VQf.LJLIL);
            }
            this.LJII = VR0.RUNNING;
            if (c79713VQf.LJLLL == 0) {
                LJIIIIZZ(c79713VQf);
            }
        }
        this.LJIIIIZZ = c79713VQf;
    }

    public final boolean LJII(C79713VQf c79713VQf) {
        long j;
        if (this.LJ == -1) {
            return false;
        }
        if (c79713VQf.LJLLI >= 9.99999999E8d) {
            j = Long.MAX_VALUE;
        } else {
            j = (c79713VQf.LJLILLLLZI * (r5 + 1)) + c79713VQf.LJLJI;
        }
        if (System.currentTimeMillis() - this.LJ < j) {
            return false;
        }
        return true;
    }

    public final void LJIIIIZZ(C79713VQf c79713VQf) {
        this.LJII = VR0.PAUSED;
        ObjectAnimator[] objectAnimatorArr = this.LJI;
        if (objectAnimatorArr != null) {
            for (ObjectAnimator objectAnimator : objectAnimatorArr) {
                objectAnimator.pause();
            }
        }
        if (!LJII(c79713VQf)) {
            VRB vrb = this.LIZ;
            if (vrb.LIZ == -1) {
                vrb.LIZ = System.currentTimeMillis();
            }
        }
        this.LJIIIIZZ = c79713VQf;
    }

    public C79714VQg(View view, LynxUI lynxUI) {
        this.LIZIZ = new WeakReference<>(lynxUI);
        this.LIZJ = new WeakReference<>(view);
    }

    public static PropertyValuesHolder LIZIZ(String str, ArrayList arrayList) {
        return PropertyValuesHolder.ofKeyframe(str, (Keyframe[]) arrayList.toArray(new Keyframe[arrayList.size()]));
    }

    public final void LJIIJ(Object obj, String str) {
        if (!this.LIZLLL.containsKey(str)) {
            this.LIZLLL.put(str, obj);
        }
    }

    public static void LIZJ(float f, EnumC79721VQn enumC79721VQn, C79719VQl c79719VQl) {
        if (f == 0.0f) {
            ((HashSet) c79719VQl.LJIIJJI).add(enumC79721VQn);
        }
        if (f == 1.0f) {
            ((HashSet) c79719VQl.LJIIL).add(enumC79721VQn);
        }
    }
}
