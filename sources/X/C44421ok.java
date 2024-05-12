package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

/* renamed from: X.1ok, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C44421ok extends AbstractC38131eb {
    public String LJFF;
    public int LJII;
    public int LJIILJJIL;
    public int LJI = -1;
    public float LJIIIIZZ = Float.NaN;
    public float LJIIIZ = Float.NaN;
    public float LJIIJ = Float.NaN;
    public float LJIIJJI = Float.NaN;
    public final float LJIIL = Float.NaN;
    public final float LJIILIIL = Float.NaN;

    @Override // X.C13R
    public final void LIZ(HashMap<String, AbstractC267613g> hashMap) {
    }

    @Override // X.C13R
    public final void LIZJ(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a8s, R.attr.aa1, R.attr.aeu, R.attr.ajv, R.attr.b1f, R.attr.b44, R.attr.b48, R.attr.b49, R.attr.b4_, R.attr.b4a, R.attr.bbk, R.attr.bky});
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (C13Z.LIZ.get(index)) {
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
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        this.LJFF = C16880lQ.LLLZLZ(obtainStyledAttributes, index);
                        break;
                    } else {
                        this.LJFF = C11Y.LIZJ[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    this.LJ = obtainStyledAttributes.getInteger(index, this.LJ);
                    break;
                case 5:
                    this.LJII = obtainStyledAttributes.getInt(index, this.LJII);
                    break;
                case 6:
                    this.LJIIJ = obtainStyledAttributes.getFloat(index, this.LJIIJ);
                    break;
                case 7:
                    this.LJIIJJI = obtainStyledAttributes.getFloat(index, this.LJIIJJI);
                    break;
                case 8:
                    float f = obtainStyledAttributes.getFloat(index, this.LJIIIZ);
                    this.LJIIIIZZ = f;
                    this.LJIIIZ = f;
                    break;
                case 9:
                    this.LJIILJJIL = obtainStyledAttributes.getInt(index, this.LJIILJJIL);
                    break;
                case 10:
                    this.LJI = obtainStyledAttributes.getInt(index, this.LJI);
                    break;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    this.LJIIIIZZ = obtainStyledAttributes.getFloat(index, this.LJIIIIZZ);
                    break;
                case 12:
                    this.LJIIIZ = obtainStyledAttributes.getFloat(index, this.LJIIIZ);
                    break;
            }
        }
    }
}
