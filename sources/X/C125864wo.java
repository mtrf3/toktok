package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.internal.o;

/* renamed from: X.4wo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C125864wo {
    public final NLETrackSlot LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final EnumC124724uy LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C125864wo)) {
            return false;
        }
        C125864wo c125864wo = (C125864wo) obj;
        return o.LJ(this.LIZ, c125864wo.LIZ) && this.LIZIZ == c125864wo.LIZIZ && this.LIZJ == c125864wo.LIZJ && this.LIZLLL == c125864wo.LIZLLL;
    }

    public final int hashCode() {
        int hashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31;
        EnumC124724uy enumC124724uy = this.LIZLLL;
        return hashCode + (enumC124724uy == null ? 0 : enumC124724uy.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MainTrackSlotMoveEvent(nleTrackSlot=");
        LIZ.append(this.LIZ);
        LIZ.append(", fromIndex=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", toIndex=");
        LIZ.append(this.LIZJ);
        LIZ.append(", commitLevel=");
        LIZ.append(this.LIZLLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C125864wo(NLETrackSlot nleTrackSlot, int i, int i2) {
        EnumC124724uy enumC124724uy = EnumC124724uy.DONE;
        o.LJIIIZ(nleTrackSlot, "nleTrackSlot");
        this.LIZ = nleTrackSlot;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = enumC124724uy;
    }
}
