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

/* renamed from: X.1ec, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38141ec extends C13R {
    public int LJIIZILJ;
    public float LJIJI;
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
    public float LJIJ = Float.NaN;

    public C38141ec() {
        this.LIZLLL = new HashMap<>();
    }

    @Override // X.C13R
    public final void LIZ(HashMap<String, AbstractC267613g> hashMap) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
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
        if (!Float.isNaN(this.LJIILIIL)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.LJIILJJIL)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.LJIILL)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.LJIIJ)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.LJIIJJI)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.LJIIL)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.LJIILLIIL)) {
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
        if (!Float.isNaN(this.LJIILIIL)) {
            hashMap.put("translationX", Integer.valueOf(this.LJ));
        }
        if (!Float.isNaN(this.LJIILJJIL)) {
            hashMap.put("translationY", Integer.valueOf(this.LJ));
        }
        if (!Float.isNaN(this.LJIILL)) {
            hashMap.put("translationZ", Integer.valueOf(this.LJ));
        }
        if (!Float.isNaN(this.LJIIJ)) {
            hashMap.put("transitionPathRotate", Integer.valueOf(this.LJ));
        }
        if (!Float.isNaN(this.LJIIJJI)) {
            hashMap.put("scaleX", Integer.valueOf(this.LJ));
        }
        if (!Float.isNaN(this.LJIIJJI)) {
            hashMap.put("scaleY", Integer.valueOf(this.LJ));
        }
        if (!Float.isNaN(this.LJIILLIIL)) {
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
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.alpha, R.attr.translationX, R.attr.translationY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.rotationX, R.attr.rotationY, R.attr.translationZ, R.attr.elevation, com.zhiliaoapp.musically.R.attr.a8s, com.zhiliaoapp.musically.R.attr.aeu, com.zhiliaoapp.musically.R.attr.b1d, com.zhiliaoapp.musically.R.attr.b1f, com.zhiliaoapp.musically.R.attr.bky, com.zhiliaoapp.musically.R.attr.bl0, com.zhiliaoapp.musically.R.attr.bwh, com.zhiliaoapp.musically.R.attr.bwn, com.zhiliaoapp.musically.R.attr.bwo, com.zhiliaoapp.musically.R.attr.bwp});
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (C267013a.LIZ.get(index)) {
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
                    this.LJIIJJI = obtainStyledAttributes.getFloat(index, this.LJIIJJI);
                    break;
                case 8:
                    this.LJIIJ = obtainStyledAttributes.getFloat(index, this.LJIIJ);
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
                    this.LJIIL = obtainStyledAttributes.getFloat(index, this.LJIIL);
                    break;
                case 15:
                    this.LJIILIIL = obtainStyledAttributes.getDimension(index, this.LJIILIIL);
                    break;
                case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                    this.LJIILJJIL = obtainStyledAttributes.getDimension(index, this.LJIILJJIL);
                    break;
                case 17:
                    this.LJIILL = obtainStyledAttributes.getDimension(index, this.LJIILL);
                    break;
                case 18:
                    this.LJIILLIIL = obtainStyledAttributes.getFloat(index, this.LJIILLIIL);
                    break;
                case 19:
                    this.LJIIZILJ = obtainStyledAttributes.getInt(index, this.LJIIZILJ);
                    break;
                case 20:
                    this.LJIJ = obtainStyledAttributes.getFloat(index, this.LJIJ);
                    break;
                case 21:
                    if (obtainStyledAttributes.peekValue(index).type == 5) {
                        this.LJIJI = obtainStyledAttributes.getDimension(index, this.LJIJI);
                        break;
                    } else {
                        this.LJIJI = obtainStyledAttributes.getFloat(index, this.LJIJI);
                        break;
                    }
            }
        }
    }
}
