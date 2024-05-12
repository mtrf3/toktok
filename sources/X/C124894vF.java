package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.internal.o;

/* renamed from: X.4vF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C124894vF {
    public final NLETrackSlot LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C124894vF) && o.LJ(this.LIZ, ((C124894vF) obj).LIZ);
    }

    public final int hashCode() {
        NLETrackSlot nLETrackSlot = this.LIZ;
        if (nLETrackSlot == null) {
            return 0;
        }
        return nLETrackSlot.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ChangeSlotSelectStateEvent(nleTrackSlot=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C124894vF(NLETrackSlot nLETrackSlot) {
        this.LIZ = nLETrackSlot;
    }
}
