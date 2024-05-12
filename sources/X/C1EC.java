package X;

import android.graphics.Matrix;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* renamed from: X.1EC, reason: invalid class name */
/* loaded from: classes.dex */
public class C1EC extends C0FO {
    public final Matrix LIZ;
    public final ArrayList<C0FO> LIZIZ;
    public float LIZJ;
    public float LIZLLL;
    public float LJ;
    public float LJFF;
    public float LJI;
    public float LJII;
    public float LJIIIIZZ;
    public final Matrix LJIIIZ;
    public final int LJIIJ;
    public String LJIIJJI;

    @Override // X.C0FO
    public final boolean LIZ() {
        for (int i = 0; i < this.LIZIZ.size(); i++) {
            if (((C0FO) ListProtector.get(this.LIZIZ, i)).LIZ()) {
                return true;
            }
        }
        return false;
    }

    public final void LIZJ() {
        this.LJIIIZ.reset();
        this.LJIIIZ.postTranslate(-this.LIZLLL, -this.LJ);
        this.LJIIIZ.postScale(this.LJFF, this.LJI);
        this.LJIIIZ.postRotate(this.LIZJ, 0.0f, 0.0f);
        this.LJIIIZ.postTranslate(this.LJII + this.LIZLLL, this.LJIIIIZZ + this.LJ);
    }

    public C1EC() {
        this.LIZ = new Matrix();
        this.LIZIZ = new ArrayList<>();
        this.LIZJ = 0.0f;
        this.LIZLLL = 0.0f;
        this.LJ = 0.0f;
        this.LJFF = 1.0f;
        this.LJI = 1.0f;
        this.LJII = 0.0f;
        this.LJIIIIZZ = 0.0f;
        this.LJIIIZ = new Matrix();
        this.LJIIJJI = null;
    }

    public String getGroupName() {
        return this.LJIIJJI;
    }

    public Matrix getLocalMatrix() {
        return this.LJIIIZ;
    }

    public float getPivotX() {
        return this.LIZLLL;
    }

    public float getPivotY() {
        return this.LJ;
    }

    public float getRotation() {
        return this.LIZJ;
    }

    public float getScaleX() {
        return this.LJFF;
    }

    public float getScaleY() {
        return this.LJI;
    }

    public float getTranslateX() {
        return this.LJII;
    }

    public float getTranslateY() {
        return this.LJIIIIZZ;
    }

    @Override // X.C0FO
    public final boolean LIZIZ(int[] iArr) {
        boolean z = false;
        for (int i = 0; i < this.LIZIZ.size(); i++) {
            z |= ((C0FO) ListProtector.get(this.LIZIZ, i)).LIZIZ(iArr);
        }
        return z;
    }

    public void setPivotX(float f) {
        if (f != this.LIZLLL) {
            this.LIZLLL = f;
            LIZJ();
        }
    }

    public void setPivotY(float f) {
        if (f != this.LJ) {
            this.LJ = f;
            LIZJ();
        }
    }

    public void setRotation(float f) {
        if (f != this.LIZJ) {
            this.LIZJ = f;
            LIZJ();
        }
    }

    public void setScaleX(float f) {
        if (f != this.LJFF) {
            this.LJFF = f;
            LIZJ();
        }
    }

    public void setScaleY(float f) {
        if (f != this.LJI) {
            this.LJI = f;
            LIZJ();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.LJII) {
            this.LJII = f;
            LIZJ();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.LJIIIIZZ) {
            this.LJIIIIZZ = f;
            LIZJ();
        }
    }

    public C1EC(C1EC c1ec, C1HQ<String, Object> c1hq) {
        C1ED c40661ig;
        this.LIZ = new Matrix();
        this.LIZIZ = new ArrayList<>();
        this.LIZJ = 0.0f;
        this.LIZLLL = 0.0f;
        this.LJ = 0.0f;
        this.LJFF = 1.0f;
        this.LJI = 1.0f;
        this.LJII = 0.0f;
        this.LJIIIIZZ = 0.0f;
        Matrix matrix = new Matrix();
        this.LJIIIZ = matrix;
        this.LJIIJJI = null;
        this.LIZJ = c1ec.LIZJ;
        this.LIZLLL = c1ec.LIZLLL;
        this.LJ = c1ec.LJ;
        this.LJFF = c1ec.LJFF;
        this.LJI = c1ec.LJI;
        this.LJII = c1ec.LJII;
        this.LJIIIIZZ = c1ec.LJIIIIZZ;
        String str = c1ec.LJIIJJI;
        this.LJIIJJI = str;
        this.LJIIJ = c1ec.LJIIJ;
        if (str != null) {
            c1hq.put(str, this);
        }
        matrix.set(c1ec.LJIIIZ);
        ArrayList<C0FO> arrayList = c1ec.LIZIZ;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = ListProtector.get(arrayList, i);
            if (obj instanceof C1EC) {
                this.LIZIZ.add(new C1EC((C1EC) obj, c1hq));
            } else {
                if (obj instanceof C40671ih) {
                    c40661ig = new C40671ih((C40671ih) obj);
                } else if (obj instanceof C40661ig) {
                    c40661ig = new C40661ig((C40661ig) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.LIZIZ.add(c40661ig);
                String str2 = c40661ig.LIZIZ;
                if (str2 != null) {
                    c1hq.put(str2, c40661ig);
                }
            }
        }
    }
}
