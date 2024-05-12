package defpackage;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class EcomPaymentStyleModel {

    @InterfaceC65349Pkn("interact")
    public final Interact interact;

    @InterfaceC65349Pkn("vision")
    public final Vision vision;

    /* JADX WARN: Multi-variable type inference failed */
    public EcomPaymentStyleModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EcomPaymentStyleModel)) {
            return false;
        }
        EcomPaymentStyleModel ecomPaymentStyleModel = (EcomPaymentStyleModel) obj;
        return o.LJ(this.interact, ecomPaymentStyleModel.interact) && o.LJ(this.vision, ecomPaymentStyleModel.vision);
    }

    public final int hashCode() {
        Interact interact = this.interact;
        int hashCode = (interact == null ? 0 : interact.hashCode()) * 31;
        Vision vision = this.vision;
        return hashCode + (vision != null ? vision.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EcomPaymentStyleModel(interact=");
        LIZ.append(this.interact);
        LIZ.append(", vision=");
        LIZ.append(this.vision);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public EcomPaymentStyleModel(Interact interact, Vision vision) {
        this.interact = interact;
        this.vision = vision;
    }

    public /* synthetic */ EcomPaymentStyleModel(Interact interact, Vision vision, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Interact(null, 1, null) : interact, (i & 2) != 0 ? new Vision(null, null, null, null, 15, null) : vision);
    }
}
