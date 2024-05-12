package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes16.dex */
public final class YOB {
    public int LIZ = -1;
    public int LIZIZ = -1;
    public final List<Integer> LIZJ = new ArrayList();
    public final List<Integer> LIZLLL = new ArrayList();

    public final int LIZ(int i) {
        if (i < 0) {
            return i;
        }
        if (this.LIZ == -1) {
            this.LIZ = i;
        }
        if (((ArrayList) this.LIZJ).size() > 0) {
            i = ((Integer) ListProtector.get(this.LIZJ, ((ArrayList) r1).size() - 1)).intValue() + 1;
        }
        ((ArrayList) this.LIZJ).add(Integer.valueOf(i));
        return i;
    }

    public final int LIZIZ(int i, int i2) {
        int i3;
        int i4 = 0;
        if (i != 1) {
            if (i == 2) {
                int i5 = this.LIZIZ;
                if (i2 < i5 || i5 == -1) {
                    return i2;
                }
                while (i4 < ((ArrayList) this.LIZLLL).size()) {
                    if (i2 == ((Integer) ListProtector.get(this.LIZLLL, i4)).intValue()) {
                        i3 = this.LIZIZ;
                        return i4 + i3;
                    }
                    i4++;
                }
            }
            return i2;
        }
        int i6 = this.LIZ;
        if (i2 >= i6 && i6 != -1) {
            while (i4 < ((ArrayList) this.LIZJ).size()) {
                if (i2 == ((Integer) ListProtector.get(this.LIZJ, i4)).intValue()) {
                    i3 = this.LIZ;
                    return i4 + i3;
                }
                i4++;
            }
        }
        return i2;
    }
}
