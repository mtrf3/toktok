package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.05a, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C017405a {
    public static final float[][] LJIJJLI = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};
    public static final float[][] LJIL = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public float LJI;
    public float LJII;
    public float LJIIIIZZ;
    public float LJIIIZ;
    public boolean LJIIJ;
    public final float[] LJIIJJI = new float[2];
    public float LJIIL;
    public float LJIILIIL;
    public final C45601qe LJIILJJIL;
    public float LJIILL;
    public float LJIILLIIL;
    public boolean LJIIZILJ;
    public float LJIJ;
    public int LJIJI;
    public float LJIJJ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(" , ");
        LIZ.append(this.LJIIIZ);
        return X1D.LIZIZ(LIZ);
    }

    public final void LIZIZ(boolean z) {
        float[][] fArr = LJIJJLI;
        float[][] fArr2 = LJIL;
        if (z) {
            fArr2[4] = fArr2[3];
            fArr2[5] = fArr2[2];
            fArr[5] = fArr[2];
            fArr[6] = fArr[1];
        } else {
            fArr2[4] = fArr2[2];
            fArr2[5] = fArr2[3];
            fArr[5] = fArr[1];
            fArr[6] = fArr[2];
        }
        float[] fArr3 = fArr[this.LIZ];
        this.LJII = fArr3[0];
        this.LJI = fArr3[1];
        float[] fArr4 = fArr2[this.LIZIZ];
        this.LJIIIIZZ = fArr4[0];
        this.LJIIIZ = fArr4[1];
    }

    public final RectF LIZ(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i = this.LJ;
        if (i == -1 || (findViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        return rectF;
    }

    public C017405a(Context context, C45601qe c45601qe, XmlPullParser xmlPullParser) {
        this.LIZLLL = -1;
        this.LJ = -1;
        this.LJFF = -1;
        this.LJI = 0.5f;
        this.LJII = 0.5f;
        this.LJIIIZ = 1.0f;
        this.LJIILL = 4.0f;
        this.LJIILLIIL = 1.2f;
        this.LJIIZILJ = true;
        this.LJIJ = 1.0f;
        this.LJIJJ = 10.0f;
        this.LJIILJJIL = c45601qe;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(android.util.Xml.asAttributeSet(xmlPullParser), new int[]{R.attr.a_t, R.attr.a_u, R.attr.a_v, R.attr.aoe, R.attr.b08, R.attr.b0i, R.attr.b1i, R.attr.b21, R.attr.b3b, R.attr.bkl, R.attr.bkm, R.attr.bkn});
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 9) {
                this.LIZLLL = obtainStyledAttributes.getResourceId(index, this.LIZLLL);
            } else if (index == 10) {
                int i2 = obtainStyledAttributes.getInt(index, this.LIZ);
                this.LIZ = i2;
                float[] fArr = LJIJJLI[i2];
                this.LJII = fArr[0];
                this.LJI = fArr[1];
            } else if (index == 0) {
                int i3 = obtainStyledAttributes.getInt(index, this.LIZIZ);
                this.LIZIZ = i3;
                float[] fArr2 = LJIL[i3];
                this.LJIIIIZZ = fArr2[0];
                this.LJIIIZ = fArr2[1];
            } else if (index == 5) {
                this.LJIILL = obtainStyledAttributes.getFloat(index, this.LJIILL);
            } else if (index == 4) {
                this.LJIILLIIL = obtainStyledAttributes.getFloat(index, this.LJIILLIIL);
            } else if (index == 6) {
                this.LJIIZILJ = obtainStyledAttributes.getBoolean(index, this.LJIIZILJ);
            } else if (index == 1) {
                this.LJIJ = obtainStyledAttributes.getFloat(index, this.LJIJ);
            } else if (index == 2) {
                this.LJIJJ = obtainStyledAttributes.getFloat(index, this.LJIJJ);
            } else if (index == 11) {
                this.LJ = obtainStyledAttributes.getResourceId(index, this.LJ);
            } else if (index == 8) {
                this.LIZJ = obtainStyledAttributes.getInt(index, this.LIZJ);
            } else if (index == 7) {
                this.LJIJI = obtainStyledAttributes.getInteger(index, 0);
            } else if (index == 3) {
                this.LJFF = obtainStyledAttributes.getResourceId(index, 0);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
