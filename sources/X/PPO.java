package X;

import android.graphics.Rect;
import java.util.Arrays;

/* loaded from: classes12.dex */
public class PPO {
    public final float LIZ;
    public final float LIZIZ;

    public final int hashCode() {
        return Arrays.hashCode(new float[]{this.LIZ, this.LIZIZ});
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Point{x=");
        LIZ.append(this.LIZ);
        LIZ.append(", y=");
        return C74221TAz.LIZLLL(LIZ, this.LIZIZ, '}', LIZ);
    }

    public PPO() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof PPO)) {
            return false;
        }
        PPO ppo = (PPO) obj;
        if (Float.compare(ppo.LIZ, this.LIZ) == 0 && Float.compare(ppo.LIZIZ, this.LIZIZ) == 0) {
            return true;
        }
        return false;
    }

    public PPO(float f, float f2) {
        this.LIZ = f;
        this.LIZIZ = f2;
    }

    public final PPO LIZ(Rect rect, Rect rect2) {
        return new PPO((rect.left - rect2.left) + this.LIZ, (rect.top - rect2.top) + this.LIZIZ);
    }
}
