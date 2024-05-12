package com.ss.android.ugc.aweme.experiment;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class Candidate {

    @InterfaceC65349Pkn("entrance_key")
    public final String entranceKey;

    @InterfaceC65349Pkn("request_slot_lock")
    public final Integer requestSlotLock;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Candidate)) {
            return false;
        }
        Candidate candidate = (Candidate) obj;
        return o.LJ(this.entranceKey, candidate.entranceKey) && o.LJ(this.requestSlotLock, candidate.requestSlotLock);
    }

    public final int hashCode() {
        int hashCode = this.entranceKey.hashCode() * 31;
        Integer num = this.requestSlotLock;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Candidate(entranceKey=");
        LIZ.append(this.entranceKey);
        LIZ.append(", requestSlotLock=");
        return s0.LIZJ(LIZ, this.requestSlotLock, ')', LIZ);
    }

    public Candidate(String entranceKey, Integer num) {
        o.LJIIIZ(entranceKey, "entranceKey");
        this.entranceKey = entranceKey;
        this.requestSlotLock = num;
    }

    public /* synthetic */ Candidate(String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : num);
    }
}
