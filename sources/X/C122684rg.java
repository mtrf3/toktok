package X;

import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.internal.o;

/* renamed from: X.4rg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122684rg {
    public final EnumC123864ta LIZ;
    public final NLETrack LIZIZ;
    public final NLETrackSlot LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C122684rg)) {
            return false;
        }
        C122684rg c122684rg = (C122684rg) obj;
        return this.LIZ == c122684rg.LIZ && o.LJ(this.LIZIZ, c122684rg.LIZIZ) && o.LJ(this.LIZJ, c122684rg.LIZJ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        NLETrack nLETrack = this.LIZIZ;
        int hashCode2 = (hashCode + (nLETrack == null ? 0 : nLETrack.hashCode())) * 31;
        NLETrackSlot nLETrackSlot = this.LIZJ;
        return hashCode2 + (nLETrackSlot != null ? nLETrackSlot.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DeleteSlotEvent(deleteTrackType=");
        LIZ.append(this.LIZ);
        LIZ.append(", deletedSlotTrack=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", deletedSlot=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C122684rg(EnumC123864ta deleteTrackType, NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
        o.LJIIIZ(deleteTrackType, "deleteTrackType");
        this.LIZ = deleteTrackType;
        this.LIZIZ = nLETrack;
        this.LIZJ = nLETrackSlot;
    }
}
