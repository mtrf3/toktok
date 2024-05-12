package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.MqS, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58056MqS {
    public final List<C58054MqQ> LIZ;
    public final float LIZIZ;

    public C58056MqS() {
        throw null;
    }

    public final float LIZ() {
        Iterator<C58054MqQ> it = this.LIZ.iterator();
        double d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        while (it.hasNext()) {
            d += it.next().LIZLLL;
        }
        return (float) d;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Line(");
        LIZ.append(this.LIZIZ);
        LIZ.append("):[");
        return C1NE.LIZIZ(LIZ, this.LIZ, ']', LIZ);
    }

    public C58056MqS(float f) {
        this.LIZ = new ArrayList();
        this.LIZIZ = f;
    }
}
