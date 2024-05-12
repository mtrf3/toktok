package X;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: X.1eN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37991eN extends C13R {
    public int LJ;
    public float LJII;
    public int LJFF = -1;
    public float LJI = Float.NaN;
    public float LJIIIIZZ = Float.NaN;
    public int LJIIIZ = -1;
    public float LJIIJ = Float.NaN;
    public float LJIIJJI = Float.NaN;
    public float LJIIL = Float.NaN;
    public float LJIILIIL = Float.NaN;
    public float LJIILJJIL = Float.NaN;
    public float LJIILL = Float.NaN;
    public float LJIILLIIL = Float.NaN;
    public float LJIIZILJ = Float.NaN;
    public float LJIJ = Float.NaN;
    public float LJIJI = Float.NaN;
    public float LJIJJ = Float.NaN;

    public C37991eN() {
        this.LIZLLL = new HashMap<>();
    }

    @Override // X.C13R
    public final void LIZ(HashMap<String, AbstractC267613g> hashMap) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("add ");
        LIZ.append(hashMap.size());
        LIZ.append(" values");
        X1D.LIZIZ(LIZ);
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int min = Math.min(2, stackTrace.length - 1);
        String str = " ";
        for (int i = 1; i <= min; i++) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(".(");
            LIZ2.append(stackTrace[i].getFileName());
            LIZ2.append(":");
            LIZ2.append(stackTrace[i].getLineNumber());
            LIZ2.append(") ");
            LIZ2.append(stackTrace[i].getMethodName());
            X1D.LIZIZ(LIZ2);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(str);
            LIZ3.append(" ");
            str = X1D.LIZIZ(LIZ3);
        }
        for (String str2 : hashMap.keySet()) {
            AbstractC267613g abstractC267613g = hashMap.get(str2);
            str2.getClass();
            switch (str2.hashCode()) {
                case -1249320806:
                    if (str2.equals("rotationX")) {
                        abstractC267613g.LIZIZ(this.LJIILJJIL, this.LIZ);
                        break;
                    } else {
                        break;
                    }
                case -1249320805:
                    if (str2.equals("rotationY")) {
                        abstractC267613g.LIZIZ(this.LJIILL, this.LIZ);
                        break;
                    } else {
                        break;
                    }
                case -1225497657:
                    if (str2.equals("translationX")) {
                        abstractC267613g.LIZIZ(this.LJIJ, this.LIZ);
                        break;
                    } else {
                        break;
                    }
                case -1225497656:
                    if (str2.equals("translationY")) {
                        abstractC267613g.LIZIZ(this.LJIJI, this.LIZ);
                        break;
                    } else {
                        break;
                    }
                case -1225497655:
                    if (str2.equals("translationZ")) {
                        abstractC267613g.LIZIZ(this.LJIJJ, this.LIZ);
                        break;
                    } else {
                        break;
                    }
                case -1001078227:
                    if (str2.equals("progress")) {
                        abstractC267613g.LIZIZ(this.LJIIIIZZ, this.LIZ);
                        break;
                    } else {
                        break;
                    }
                case -908189618:
                    if (str2.equals("scaleX")) {
                        abstractC267613g.LIZIZ(this.LJIILLIIL, this.LIZ);
                        break;
                    } else {
                        break;
                    }
                case -908189617:
                    if (str2.equals("scaleY")) {
                        abstractC267613g.LIZIZ(this.LJIIZILJ, this.LIZ);
                        break;
                    } else {
                        break;
                    }
                case -40300674:
                    if (str2.equals("rotation")) {
                        abstractC267613g.LIZIZ(this.LJIIL, this.LIZ);
                        break;
                    } else {
                        break;
                    }
                case -4379043:
                    if (str2.equals("elevation")) {
                        abstractC267613g.LIZIZ(this.LJIIJJI, this.LIZ);
                        break;
                    } else {
                        break;
                    }
                case 37232917:
                    if (str2.equals("transitionPathRotate")) {
                        abstractC267613g.LIZIZ(this.LJIILIIL, this.LIZ);
                        break;
                    } else {
                        break;
                    }
                case 92909918:
                    if (str2.equals("alpha")) {
                        abstractC267613g.LIZIZ(this.LJIIJ, this.LIZ);
                        break;
                    } else {
                        break;
                    }
                case 156108012:
                    if (str2.equals("waveOffset")) {
                        abstractC267613g.LIZIZ(this.LJII, this.LIZ);
                        break;
                    } else {
                        break;
                    }
            }
        }
    }

    @Override // X.C13R
    public final void LIZIZ(HashSet<String> hashSet) {
        if (!Float.isNaN(this.LJIIJ)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.LJIIJJI)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.LJIIL)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.LJIILJJIL)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.LJIILL)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.LJIILLIIL)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.LJIIZILJ)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.LJIILIIL)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.LJIJ)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.LJIJI)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.LJIJJ)) {
            hashSet.add("translationZ");
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
    public final void LIZJ(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.alpha, R.attr.translationX, R.attr.translationY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.rotationX, R.attr.rotationY, R.attr.translationZ, R.attr.elevation, com.zhiliaoapp.musically.R.attr.a8s, com.zhiliaoapp.musically.R.attr.aeu, com.zhiliaoapp.musically.R.attr.b1d, com.zhiliaoapp.musically.R.attr.b1f, com.zhiliaoapp.musically.R.attr.bky, com.zhiliaoapp.musically.R.attr.bl0, com.zhiliaoapp.musically.R.attr.bwn, com.zhiliaoapp.musically.R.attr.bwo, com.zhiliaoapp.musically.R.attr.bwp, com.zhiliaoapp.musically.R.attr.bwr});
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (C13U.LIZ.get(index)) {
                case 1:
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
                case 2:
                    this.LIZ = obtainStyledAttributes.getInt(index, this.LIZ);
                    break;
                case 3:
                    C16880lQ.LLLZLZ(obtainStyledAttributes, index);
                    break;
                case 4:
                    this.LJ = obtainStyledAttributes.getInteger(index, this.LJ);
                    break;
                case 5:
                    this.LJFF = obtainStyledAttributes.getInt(index, this.LJFF);
                    break;
                case 6:
                    this.LJI = obtainStyledAttributes.getFloat(index, this.LJI);
                    break;
                case 7:
                    if (obtainStyledAttributes.peekValue(index).type == 5) {
                        this.LJII = obtainStyledAttributes.getDimension(index, this.LJII);
                        break;
                    } else {
                        this.LJII = obtainStyledAttributes.getFloat(index, this.LJII);
                        break;
                    }
                case 8:
                    this.LJIIIZ = obtainStyledAttributes.getInt(index, this.LJIIIZ);
                    break;
                case 9:
                    this.LJIIJ = obtainStyledAttributes.getFloat(index, this.LJIIJ);
                    break;
                case 10:
                    this.LJIIJJI = obtainStyledAttributes.getDimension(index, this.LJIIJJI);
                    break;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    this.LJIIL = obtainStyledAttributes.getFloat(index, this.LJIIL);
                    break;
                case 12:
                    this.LJIILJJIL = obtainStyledAttributes.getFloat(index, this.LJIILJJIL);
                    break;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    this.LJIILL = obtainStyledAttributes.getFloat(index, this.LJIILL);
                    break;
                case 14:
                    this.LJIILIIL = obtainStyledAttributes.getFloat(index, this.LJIILIIL);
                    break;
                case 15:
                    this.LJIILLIIL = obtainStyledAttributes.getFloat(index, this.LJIILLIIL);
                    break;
                case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                    this.LJIIZILJ = obtainStyledAttributes.getFloat(index, this.LJIIZILJ);
                    break;
                case 17:
                    this.LJIJ = obtainStyledAttributes.getDimension(index, this.LJIJ);
                    break;
                case 18:
                    this.LJIJI = obtainStyledAttributes.getDimension(index, this.LJIJI);
                    break;
                case 19:
                    this.LJIJJ = obtainStyledAttributes.getDimension(index, this.LJIJJ);
                    break;
                case 20:
                    this.LJIIIIZZ = obtainStyledAttributes.getFloat(index, this.LJIIIIZZ);
                    break;
            }
        }
    }
}
