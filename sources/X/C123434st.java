package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import defpackage.s0;
import kotlin.jvm.internal.o;

/* renamed from: X.4st, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C123434st {
    public final NLETrackSlot LIZ;
    public final NLETrackSlot LIZIZ;
    public final OSZ<Integer, Integer> LIZJ;
    public final Integer LIZLLL;

    public C123434st() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C123434st)) {
            return false;
        }
        C123434st c123434st = (C123434st) obj;
        return o.LJ(this.LIZ, c123434st.LIZ) && o.LJ(this.LIZIZ, c123434st.LIZIZ) && o.LJ(this.LIZJ, c123434st.LIZJ) && o.LJ(this.LIZLLL, c123434st.LIZLLL);
    }

    public final int hashCode() {
        NLETrackSlot nLETrackSlot = this.LIZ;
        int hashCode = (nLETrackSlot == null ? 0 : nLETrackSlot.hashCode()) * 31;
        NLETrackSlot nLETrackSlot2 = this.LIZIZ;
        int hashCode2 = (hashCode + (nLETrackSlot2 == null ? 0 : nLETrackSlot2.hashCode())) * 31;
        OSZ<Integer, Integer> osz = this.LIZJ;
        int hashCode3 = (hashCode2 + (osz == null ? 0 : osz.hashCode())) * 31;
        Integer num = this.LIZLLL;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MainTrackLinkageParams(beforeOperatedMainSlot=");
        LIZ.append(this.LIZ);
        LIZ.append(", afterOperatedMainSlot=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", diffIndexPair=");
        LIZ.append(this.LIZJ);
        LIZ.append(", side=");
        return s0.LIZJ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C123434st(NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2, OSZ osz, Integer num, int i) {
        osz = (i & 4) != 0 ? null : osz;
        num = (i & 8) != 0 ? null : num;
        this.LIZ = nLETrackSlot;
        this.LIZIZ = nLETrackSlot2;
        this.LIZJ = osz;
        this.LIZLLL = num;
    }
}
