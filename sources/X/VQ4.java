package X;

import com.lynx.react.bridge.ReadableArray;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes15.dex */
public final class VQ4 {
    public final int LIZ;
    public final float LIZIZ;
    public final int LIZJ;
    public final float LIZLLL;
    public final int LJ;
    public final float LJFF;
    public final int LJI;

    public final boolean LIZIZ() {
        if (this.LIZJ == 1) {
            return true;
        }
        return false;
    }

    public static boolean LIZ(List<VQ4> list) {
        if (list != null && !list.isEmpty()) {
            for (VQ4 vq4 : list) {
                if (vq4.LIZIZ() || vq4.LJ == 1 || vq4.LJI == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static List<VQ4> LIZJ(ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readableArray.size(); i++) {
            ReadableArray array = readableArray.getArray(i);
            if (array.size() < 7) {
                new IllegalArgumentException("transform params is error.");
            } else {
                int i2 = array.getInt(0);
                float f = (float) array.getDouble(1);
                int i3 = array.getInt(2);
                float f2 = (float) array.getDouble(3);
                arrayList.add(new VQ4(i2, i3, array.getInt(4), array.getInt(6), f, f2, (float) array.getDouble(5)));
            }
        }
        return arrayList;
    }

    public VQ4(int i, int i2, int i3, int i4, float f, float f2, float f3) {
        this.LIZ = i;
        this.LIZIZ = f;
        this.LIZJ = i2;
        this.LIZLLL = f2;
        this.LJ = i3;
        this.LJFF = f3;
        this.LJI = i4;
    }
}
