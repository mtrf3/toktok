package X;

import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class F52 {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;

    public F52(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("left_bottom");
                JSONArray optJSONArray2 = jSONObject.optJSONArray("left_top");
                JSONArray optJSONArray3 = jSONObject.optJSONArray("right_bottom");
                JSONArray optJSONArray4 = jSONObject.optJSONArray("right_top");
                if (optJSONArray != null && optJSONArray2 != null && optJSONArray3 != null && optJSONArray4 != null) {
                    int i = JSONArrayProtectorUtils.getInt(optJSONArray, 0);
                    int i2 = JSONArrayProtectorUtils.getInt(optJSONArray, 1);
                    this.LIZ = i2;
                    int i3 = JSONArrayProtectorUtils.getInt(optJSONArray2, 0);
                    this.LIZIZ = i3;
                    int i4 = JSONArrayProtectorUtils.getInt(optJSONArray2, 1);
                    this.LIZJ = i4;
                    int i5 = JSONArrayProtectorUtils.getInt(optJSONArray3, 0);
                    int i6 = JSONArrayProtectorUtils.getInt(optJSONArray3, 1);
                    this.LIZLLL = i6;
                    int i7 = JSONArrayProtectorUtils.getInt(optJSONArray4, 0);
                    this.LJ = i7;
                    int i8 = JSONArrayProtectorUtils.getInt(optJSONArray4, 1);
                    this.LJFF = i8;
                    if (i3 > i5 && i4 < i6 && i < i7 && i2 < i8) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("card number is heading right, adjust it: \n[");
                        LIZ.append(i);
                        LIZ.append(" , ");
                        LIZ.append(i2);
                        LIZ.append(" ] [");
                        LIZ.append(i3);
                        LIZ.append(" , ");
                        LIZ.append(i4);
                        LIZ.append(" ]\n [");
                        LIZ.append(i5);
                        LIZ.append(" , ");
                        LIZ.append(i6);
                        LIZ.append(" ] [");
                        LIZ.append(i7);
                        LIZ.append(" , ");
                        LIZ.append(i8);
                        LIZ.append(" ]");
                        X1D.LIZIZ(LIZ);
                        this.LIZIZ = i;
                        this.LIZJ = i2;
                        this.LJ = i3;
                        this.LJFF = i4;
                        this.LIZ = i6;
                        this.LIZLLL = i8;
                        this.LJII = true;
                        this.LJI = true;
                        return;
                    }
                    if (i3 < i5 && i4 > i6 && i > i7 && i2 > i8) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("card number is heading left, adjust it: \n[");
                        LIZ2.append(i7);
                        LIZ2.append(" , ");
                        LIZ2.append(i8);
                        LIZ2.append(" ] [");
                        LIZ2.append(i5);
                        LIZ2.append(" , ");
                        LIZ2.append(i6);
                        LIZ2.append(" ]\n [");
                        LIZ2.append(i3);
                        LIZ2.append(" , ");
                        LIZ2.append(i4);
                        LIZ2.append(" ] [");
                        LIZ2.append(i);
                        LIZ2.append(" , ");
                        LIZ2.append(i2);
                        LIZ2.append(" ]");
                        X1D.LIZIZ(LIZ2);
                        this.LIZIZ = i7;
                        this.LIZJ = i8;
                        this.LJ = i5;
                        this.LJFF = i6;
                        this.LIZ = i4;
                        this.LIZLLL = i2;
                        this.LJIIIIZZ = true;
                        this.LJI = true;
                        return;
                    }
                    if (i3 > i5 && i4 > i6) {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("card number has be reverted , adjust it: \n[");
                        LIZ3.append(i5);
                        LIZ3.append(" , ");
                        LIZ3.append(i6);
                        LIZ3.append(" ] [");
                        LIZ3.append(i);
                        LIZ3.append(" , ");
                        LIZ3.append(i2);
                        LIZ3.append(" ]\n [");
                        LIZ3.append(i7);
                        LIZ3.append(" , ");
                        LIZ3.append(i8);
                        LIZ3.append(" ] [");
                        LIZ3.append(i3);
                        LIZ3.append(" , ");
                        LIZ3.append(i4);
                        LIZ3.append(" ]");
                        X1D.LIZIZ(LIZ3);
                        this.LIZIZ = i5;
                        this.LIZJ = i6;
                        this.LJ = i;
                        this.LJFF = i2;
                        this.LIZ = i8;
                        this.LIZLLL = i4;
                    }
                    if (this.LJ - this.LIZIZ < this.LIZ - this.LIZJ) {
                        this.LJII = true;
                    }
                    this.LJI = true;
                }
            } catch (Throwable unused) {
            }
        }
    }
}
