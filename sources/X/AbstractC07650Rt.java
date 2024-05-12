package X;

/* renamed from: X.0Rt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC07650Rt {
    public final String LIZ() {
        if ((this instanceof C41801kW) || (this instanceof C41811kX) || (this instanceof C41871kd) || (this instanceof C41741kQ)) {
            return "queue_action";
        }
        if (this instanceof C31271Kp) {
            StringBuilder LIZ = X1D.LIZ();
            C31271Kp c31271Kp = (C31271Kp) this;
            LIZ.append(c31271Kp.LIZ);
            LIZ.append('_');
            LIZ.append(c31271Kp.LIZIZ.LIZ);
            return X1D.LIZIZ(LIZ);
        }
        if (this instanceof C1KZ) {
            return String.valueOf(((C1KZ) this).LIZ);
        }
        return "";
    }
}
