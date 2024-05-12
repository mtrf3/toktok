package X;

import android.graphics.Color;
import com.lynx.react.bridge.ReadableArray;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.VQv, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79729VQv {
    public int LIZ;
    public float LIZIZ;
    public float LIZJ;
    public float LIZLLL;
    public float LJ;
    public float LJFF;
    public int LJI;

    public final boolean LIZ() {
        if (this.LJI == 1) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = ((this.LJI * 31) + this.LIZ) * 31;
        float f = this.LIZIZ;
        int i6 = 0;
        if (f != 0.0f) {
            i = Float.floatToIntBits(f);
        } else {
            i = 0;
        }
        int i7 = (i5 + i) * 31;
        float f2 = this.LIZJ;
        if (f2 != 0.0f) {
            i2 = Float.floatToIntBits(f2);
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 31;
        float f3 = this.LIZLLL;
        if (f3 != 0.0f) {
            i3 = Float.floatToIntBits(f3);
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 31;
        float f4 = this.LJ;
        if (f4 != 0.0f) {
            i4 = Float.floatToIntBits(f4);
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 31;
        float f5 = this.LJFF;
        if (f5 != 0.0f) {
            i6 = Float.floatToIntBits(f5);
        }
        return i10 + i6;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShadowData: Color: red ");
        LIZ.append(Color.red(this.LIZ));
        LIZ.append(" green: ");
        LIZ.append(Color.green(this.LIZ));
        LIZ.append(" blue: ");
        LIZ.append(Color.blue(Color.blue(this.LIZ)));
        LIZ.append(" OffsetX: ");
        LIZ.append(this.LIZIZ);
        LIZ.append(" offsetY: ");
        LIZ.append(this.LIZJ);
        LIZ.append(" blurRadius: ");
        LIZ.append(this.LIZLLL);
        LIZ.append(" spreadRadius: ");
        LIZ.append(this.LJ);
        LIZ.append("option: ");
        LIZ.append(this.LJI);
        return X1D.LIZIZ(LIZ);
    }

    public static List<C79729VQv> LIZIZ(ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readableArray.size(); i++) {
            ReadableArray array = readableArray.getArray(i);
            C79729VQv c79729VQv = new C79729VQv();
            c79729VQv.LIZIZ = (float) array.getDouble(0);
            c79729VQv.LIZJ = (float) array.getDouble(1);
            float f = (float) array.getDouble(2);
            c79729VQv.LIZLLL = f;
            c79729VQv.LJFF = f * 1.25f;
            c79729VQv.LJ = (float) array.getDouble(3);
            c79729VQv.LJI = (int) array.getDouble(4);
            int i2 = (int) array.getLong(5);
            c79729VQv.LIZ = i2;
            if ((c79729VQv.LIZIZ != 0.0f || c79729VQv.LIZJ != 0.0f || c79729VQv.LIZLLL != 0.0f || c79729VQv.LJ != 0.0f) && Color.alpha(i2) != 0 && c79729VQv.LIZLLL >= 0.0f) {
                arrayList.add(c79729VQv);
            }
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C79729VQv.class != obj.getClass()) {
            return false;
        }
        C79729VQv c79729VQv = (C79729VQv) obj;
        if (this.LIZ == c79729VQv.LIZ && Float.compare(c79729VQv.LIZIZ, this.LIZIZ) == 0 && Float.compare(c79729VQv.LIZJ, this.LIZJ) == 0 && Float.compare(c79729VQv.LIZLLL, this.LIZLLL) == 0 && Float.compare(c79729VQv.LJ, this.LJ) == 0 && Float.compare(c79729VQv.LJFF, this.LJFF) == 0 && this.LJI == c79729VQv.LJI) {
            return true;
        }
        return false;
    }
}
