package X;

import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.internal.o;

/* renamed from: X.4wV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C125674wV {
    public final NLETrack LIZ;
    public final NLETrackSlot LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C125674wV)) {
            return false;
        }
        C125674wV c125674wV = (C125674wV) obj;
        return o.LJ(this.LIZ, c125674wV.LIZ) && o.LJ(this.LIZIZ, c125674wV.LIZIZ) && this.LIZJ == c125674wV.LIZJ && this.LIZLLL == c125674wV.LIZLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        NLETrack nLETrack = this.LIZ;
        int hashCode = (nLETrack == null ? 0 : nLETrack.hashCode()) * 31;
        NLETrackSlot nLETrackSlot = this.LIZIZ;
        int hashCode2 = (hashCode + (nLETrackSlot != null ? nLETrackSlot.hashCode() : 0)) * 31;
        boolean z = this.LIZJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode2 + i) * 31) + (this.LIZLLL ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SelectedTrackSlotEvent(nleTrack=");
        LIZ.append(this.LIZ);
        LIZ.append(", nleTrackSlot=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", isFromUserClick=");
        LIZ.append(this.LIZJ);
        LIZ.append(", isDragMode=");
        return C48339Iy7.LIZJ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C125674wV(NLETrack nLETrack, NLETrackSlot nLETrackSlot, boolean z, boolean z2) {
        this.LIZ = nLETrack;
        this.LIZIZ = nLETrackSlot;
        this.LIZJ = z;
        this.LIZLLL = z2;
    }

    public /* synthetic */ C125674wV(NLETrack nLETrack, NLETrackSlot nLETrackSlot, boolean z, int i) {
        this(nLETrack, nLETrackSlot, (i & 4) != 0 ? true : z, false);
    }
}
