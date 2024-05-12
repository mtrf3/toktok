package X;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import defpackage.i0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.1eM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37981eM extends C13R {
    public int LJ = -1;
    public float LJFF = Float.NaN;
    public float LJI = Float.NaN;
    public float LJII = Float.NaN;
    public float LJIIIIZZ = Float.NaN;
    public float LJIIIZ = Float.NaN;
    public float LJIIJ = Float.NaN;
    public float LJIIJJI = Float.NaN;
    public float LJIIL = Float.NaN;
    public float LJIILIIL = Float.NaN;
    public float LJIILJJIL = Float.NaN;
    public float LJIILL = Float.NaN;
    public float LJIILLIIL = Float.NaN;
    public float LJIIZILJ = Float.NaN;
    public float LJIJ = Float.NaN;

    public C37981eM() {
        this.LIZLLL = new HashMap<>();
    }

    @Override // X.C13R
    public final void LIZ(HashMap<String, AbstractC267613g> hashMap) {
        for (String str : hashMap.keySet()) {
            AbstractC267613g abstractC267613g = hashMap.get(str);
            if (str.startsWith("CUSTOM")) {
                C019405u c019405u = this.LIZLLL.get(str.substring(7));
                if (c019405u != null) {
                    ((C38171ef) abstractC267613g).LJFF.append(this.LIZ, c019405u);
                }
            } else {
                switch (str.hashCode()) {
                    case -1249320806:
                        if (str.equals("rotationX") && !Float.isNaN(this.LJIIIIZZ)) {
                            abstractC267613g.LIZIZ(this.LJIIIIZZ, this.LIZ);
                            break;
                        }
                        break;
                    case -1249320805:
                        if (str.equals("rotationY") && !Float.isNaN(this.LJIIIZ)) {
                            abstractC267613g.LIZIZ(this.LJIIIZ, this.LIZ);
                            break;
                        }
                        break;
                    case -1225497657:
                        if (str.equals("translationX") && !Float.isNaN(this.LJIILL)) {
                            abstractC267613g.LIZIZ(this.LJIILL, this.LIZ);
                            break;
                        }
                        break;
                    case -1225497656:
                        if (str.equals("translationY") && !Float.isNaN(this.LJIILLIIL)) {
                            abstractC267613g.LIZIZ(this.LJIILLIIL, this.LIZ);
                            break;
                        }
                        break;
                    case -1225497655:
                        if (str.equals("translationZ") && !Float.isNaN(this.LJIIZILJ)) {
                            abstractC267613g.LIZIZ(this.LJIIZILJ, this.LIZ);
                            break;
                        }
                        break;
                    case -1001078227:
                        if (str.equals("progress") && !Float.isNaN(this.LJIJ)) {
                            abstractC267613g.LIZIZ(this.LJIJ, this.LIZ);
                            break;
                        }
                        break;
                    case -908189618:
                        if (str.equals("scaleX") && !Float.isNaN(this.LJIILIIL)) {
                            abstractC267613g.LIZIZ(this.LJIILIIL, this.LIZ);
                            break;
                        }
                        break;
                    case -908189617:
                        if (str.equals("scaleY") && !Float.isNaN(this.LJIILJJIL)) {
                            abstractC267613g.LIZIZ(this.LJIILJJIL, this.LIZ);
                            break;
                        }
                        break;
                    case -760884510:
                        if (str.equals("transformPivotX") && !Float.isNaN(this.LJIIIIZZ)) {
                            abstractC267613g.LIZIZ(this.LJIIJ, this.LIZ);
                            break;
                        }
                        break;
                    case -760884509:
                        if (str.equals("transformPivotY") && !Float.isNaN(this.LJIIIZ)) {
                            abstractC267613g.LIZIZ(this.LJIIJJI, this.LIZ);
                            break;
                        }
                        break;
                    case -40300674:
                        if (str.equals("rotation") && !Float.isNaN(this.LJII)) {
                            abstractC267613g.LIZIZ(this.LJII, this.LIZ);
                            break;
                        }
                        break;
                    case -4379043:
                        if (str.equals("elevation") && !Float.isNaN(this.LJI)) {
                            abstractC267613g.LIZIZ(this.LJI, this.LIZ);
                            break;
                        }
                        break;
                    case 37232917:
                        if (str.equals("transitionPathRotate") && !Float.isNaN(this.LJIIL)) {
                            abstractC267613g.LIZIZ(this.LJIIL, this.LIZ);
                            break;
                        }
                        break;
                    case 92909918:
                        if (str.equals("alpha") && !Float.isNaN(this.LJFF)) {
                            abstractC267613g.LIZIZ(this.LJFF, this.LIZ);
                            break;
                        }
                        break;
                }
            }
        }
    }

    @Override // X.C13R
    public final void LIZIZ(HashSet<String> hashSet) {
        if (!Float.isNaN(this.LJFF)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.LJI)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.LJII)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.LJIIIIZZ)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.LJIIIZ)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.LJIIJ)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.LJIIJJI)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.LJIILL)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.LJIILLIIL)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.LJIIZILJ)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.LJIIL)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.LJIILIIL)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.LJIILJJIL)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.LJIJ)) {
            hashSet.add("progress");
        }
        if (this.LIZLLL.size() > 0) {
            for (String str : this.LIZLLL.keySet()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("CUSTOM,");
                LIZ.append(str);
                hashSet.add(X1D.LIZIZ(LIZ));
            }
        }
    }

    @Override // X.C13R
    public final void LIZLLL(HashMap<String, Integer> hashMap) {
        if (this.LJ == -1) {
            return;
        }
        if (!Float.isNaN(this.LJFF)) {
            hashMap.put("alpha", Integer.valueOf(this.LJ));
        }
        if (!Float.isNaN(this.LJI)) {
            hashMap.put("elevation", Integer.valueOf(this.LJ));
        }
        if (!Float.isNaN(this.LJII)) {
            hashMap.put("rotation", Integer.valueOf(this.LJ));
        }
        if (!Float.isNaN(this.LJIIIIZZ)) {
            hashMap.put("rotationX", Integer.valueOf(this.LJ));
        }
        if (!Float.isNaN(this.LJIIIZ)) {
            hashMap.put("rotationY", Integer.valueOf(this.LJ));
        }
        if (!Float.isNaN(this.LJIIJ)) {
            hashMap.put("transformPivotX", Integer.valueOf(this.LJ));
        }
        if (!Float.isNaN(this.LJIIJJI)) {
            hashMap.put("transformPivotY", Integer.valueOf(this.LJ));
        }
        if (!Float.isNaN(this.LJIILL)) {
            hashMap.put("translationX", Integer.valueOf(this.LJ));
        }
        if (!Float.isNaN(this.LJIILLIIL)) {
            hashMap.put("translationY", Integer.valueOf(this.LJ));
        }
        if (!Float.isNaN(this.LJIIZILJ)) {
            hashMap.put("translationZ", Integer.valueOf(this.LJ));
        }
        if (!Float.isNaN(this.LJIIL)) {
            hashMap.put("transitionPathRotate", Integer.valueOf(this.LJ));
        }
        if (!Float.isNaN(this.LJIILIIL)) {
            hashMap.put("scaleX", Integer.valueOf(this.LJ));
        }
        if (!Float.isNaN(this.LJIILJJIL)) {
            hashMap.put("scaleY", Integer.valueOf(this.LJ));
        }
        if (!Float.isNaN(this.LJIJ)) {
            hashMap.put("progress", Integer.valueOf(this.LJ));
        }
        if (this.LIZLLL.size() > 0) {
            Iterator<String> it = this.LIZLLL.keySet().iterator();
            while (it.hasNext()) {
                hashMap.put(i0.LJFF("CUSTOM,", it.next()), Integer.valueOf(this.LJ));
            }
        }
    }

    @Override // X.C13R
    public final void LIZJ(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.alpha, R.attr.transformPivotX, R.attr.transformPivotY, R.attr.translationX, R.attr.translationY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.rotationX, R.attr.rotationY, R.attr.translationZ, R.attr.elevation, com.zhiliaoapp.musically.R.attr.a8s, com.zhiliaoapp.musically.R.attr.aeu, com.zhiliaoapp.musically.R.attr.b1d, com.zhiliaoapp.musically.R.attr.b1f, com.zhiliaoapp.musically.R.attr.bky, com.zhiliaoapp.musically.R.attr.bl0});
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (C13S.LIZ.get(index)) {
                case 1:
                    this.LJFF = obtainStyledAttributes.getFloat(index, this.LJFF);
                    break;
                case 2:
                    this.LJI = obtainStyledAttributes.getDimension(index, this.LJI);
                    break;
                case 4:
                    this.LJII = obtainStyledAttributes.getFloat(index, this.LJII);
                    break;
                case 5:
                    this.LJIIIIZZ = obtainStyledAttributes.getFloat(index, this.LJIIIIZZ);
                    break;
                case 6:
                    this.LJIIIZ = obtainStyledAttributes.getFloat(index, this.LJIIIZ);
                    break;
                case 7:
                    this.LJIILIIL = obtainStyledAttributes.getFloat(index, this.LJIILIIL);
                    break;
                case 8:
                    this.LJIIL = obtainStyledAttributes.getFloat(index, this.LJIIL);
                    break;
                case 9:
                    C16880lQ.LLLZLZ(obtainStyledAttributes, index);
                    break;
                case 10:
                    if (C45601qe.LLJILLL) {
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.LIZIZ);
                        this.LIZIZ = resourceId;
                        if (resourceId == -1) {
                            this.LIZJ = C16880lQ.LLLZLZ(obtainStyledAttributes, index);
                            break;
                        } else {
                            break;
                        }
                    } else if (obtainStyledAttributes.peekValue(index).type == 3) {
                        this.LIZJ = C16880lQ.LLLZLZ(obtainStyledAttributes, index);
                        break;
                    } else {
                        this.LIZIZ = obtainStyledAttributes.getResourceId(index, this.LIZIZ);
                        break;
                    }
                case 12:
                    this.LIZ = obtainStyledAttributes.getInt(index, this.LIZ);
                    break;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    this.LJ = obtainStyledAttributes.getInteger(index, this.LJ);
                    break;
                case 14:
                    this.LJIILJJIL = obtainStyledAttributes.getFloat(index, this.LJIILJJIL);
                    break;
                case 15:
                    this.LJIILL = obtainStyledAttributes.getDimension(index, this.LJIILL);
                    break;
                case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                    this.LJIILLIIL = obtainStyledAttributes.getDimension(index, this.LJIILLIIL);
                    break;
                case 17:
                    this.LJIIZILJ = obtainStyledAttributes.getDimension(index, this.LJIIZILJ);
                    break;
                case 18:
                    this.LJIJ = obtainStyledAttributes.getFloat(index, this.LJIJ);
                    break;
                case 19:
                    this.LJIIJ = obtainStyledAttributes.getDimension(index, this.LJIIJ);
                    break;
                case 20:
                    this.LJIIJJI = obtainStyledAttributes.getDimension(index, this.LJIIJJI);
                    break;
            }
        }
    }
}
