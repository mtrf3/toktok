package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.internal.o;

/* renamed from: X.4wp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C125874wp {
    public final NLETrackSlot LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final int LIZLLL;
    public final EnumC124724uy LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C125874wp)) {
            return false;
        }
        C125874wp c125874wp = (C125874wp) obj;
        return o.LJ(this.LIZ, c125874wp.LIZ) && this.LIZIZ == c125874wp.LIZIZ && this.LIZJ == c125874wp.LIZJ && this.LIZLLL == c125874wp.LIZLLL && this.LJ == c125874wp.LJ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MainTrackSlotClipEvent(slot=");
        LIZ.append(this.LIZ);
        LIZ.append(", start=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", duration=");
        LIZ.append(this.LIZJ);
        LIZ.append(", side=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", commitLevel=");
        LIZ.append(this.LJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        int LIZJ = (JBR.LIZJ(this.LIZJ, JBR.LIZJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31), 31) + this.LIZLLL) * 31;
        EnumC124724uy enumC124724uy = this.LJ;
        if (enumC124724uy == null) {
            hashCode = 0;
        } else {
            hashCode = enumC124724uy.hashCode();
        }
        return LIZJ + hashCode;
    }

    public C125874wp(NLETrackSlot slot, long j, long j2, int i) {
        EnumC124724uy enumC124724uy = EnumC124724uy.DONE;
        o.LJIIIZ(slot, "slot");
        this.LIZ = slot;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = i;
        this.LJ = enumC124724uy;
    }
}
