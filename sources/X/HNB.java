package X;

import com.ss.android.vesdk.VEWaterMarkPosition;
import java.io.Serializable;

/* loaded from: classes8.dex */
public final class HNB implements Serializable {
    public VEWaterMarkPosition position;
    public int xOffset;
    public int yOffset;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("WaterMarkPositionConfig{xOffset=");
        LIZ.append(this.xOffset);
        LIZ.append(", yOffset=");
        LIZ.append(this.yOffset);
        LIZ.append(", position=");
        LIZ.append(this.position);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }
}
