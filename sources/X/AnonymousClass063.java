package X;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: X.063, reason: invalid class name */
/* loaded from: classes.dex */
public class AnonymousClass063 {
    public static final SparseIntArray LJIILIIL;
    public boolean LIZ;
    public float LIZIZ;
    public float LIZJ;
    public float LIZLLL;
    public float LJ = 1.0f;
    public float LJFF = 1.0f;
    public float LJI = Float.NaN;
    public float LJII = Float.NaN;
    public float LJIIIIZZ;
    public float LJIIIZ;
    public float LJIIJ;
    public boolean LJIIJJI;
    public float LJIIL;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        LJIILIIL = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
    }

    public final void LIZ(AnonymousClass063 anonymousClass063) {
        this.LIZ = anonymousClass063.LIZ;
        this.LIZIZ = anonymousClass063.LIZIZ;
        this.LIZJ = anonymousClass063.LIZJ;
        this.LIZLLL = anonymousClass063.LIZLLL;
        this.LJ = anonymousClass063.LJ;
        this.LJFF = anonymousClass063.LJFF;
        this.LJI = anonymousClass063.LJI;
        this.LJII = anonymousClass063.LJII;
        this.LJIIIIZZ = anonymousClass063.LJIIIIZZ;
        this.LJIIIZ = anonymousClass063.LJIIIZ;
        this.LJIIJ = anonymousClass063.LJIIJ;
        this.LJIIJJI = anonymousClass063.LJIIJJI;
        this.LJIIL = anonymousClass063.LJIIL;
    }

    public final void LIZIZ(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.transformPivotX, R.attr.transformPivotY, R.attr.translationX, R.attr.translationY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.rotationX, R.attr.rotationY, R.attr.translationZ, R.attr.elevation});
        this.LIZ = true;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (LJIILIIL.get(index)) {
                case 1:
                    this.LIZIZ = obtainStyledAttributes.getFloat(index, this.LIZIZ);
                    break;
                case 2:
                    this.LIZJ = obtainStyledAttributes.getFloat(index, this.LIZJ);
                    break;
                case 3:
                    this.LIZLLL = obtainStyledAttributes.getFloat(index, this.LIZLLL);
                    break;
                case 4:
                    this.LJ = obtainStyledAttributes.getFloat(index, this.LJ);
                    break;
                case 5:
                    this.LJFF = obtainStyledAttributes.getFloat(index, this.LJFF);
                    break;
                case 6:
                    this.LJI = obtainStyledAttributes.getDimension(index, this.LJI);
                    break;
                case 7:
                    this.LJII = obtainStyledAttributes.getDimension(index, this.LJII);
                    break;
                case 8:
                    this.LJIIIIZZ = obtainStyledAttributes.getDimension(index, this.LJIIIIZZ);
                    break;
                case 9:
                    this.LJIIIZ = obtainStyledAttributes.getDimension(index, this.LJIIIZ);
                    break;
                case 10:
                    this.LJIIJ = obtainStyledAttributes.getDimension(index, this.LJIIJ);
                    break;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    this.LJIIJJI = true;
                    this.LJIIL = obtainStyledAttributes.getDimension(index, this.LJIIL);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
