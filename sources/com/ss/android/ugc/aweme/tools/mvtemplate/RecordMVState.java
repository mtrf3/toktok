package com.ss.android.ugc.aweme.tools.mvtemplate;

import X.C78920UyC;
import X.InterfaceC61312at;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class RecordMVState implements InterfaceC61312at {
    public final Boolean relayout;
    public final Boolean topMargin;

    /* JADX WARN: Multi-variable type inference failed */
    public RecordMVState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ RecordMVState copy$default(RecordMVState recordMVState, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = recordMVState.relayout;
        }
        if ((i & 2) != 0) {
            bool2 = recordMVState.topMargin;
        }
        return recordMVState.copy(bool, bool2);
    }

    public final RecordMVState copy(Boolean bool, Boolean bool2) {
        return new RecordMVState(bool, bool2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecordMVState)) {
            return false;
        }
        RecordMVState recordMVState = (RecordMVState) obj;
        return o.LJ(this.relayout, recordMVState.relayout) && o.LJ(this.topMargin, recordMVState.topMargin);
    }

    public int hashCode() {
        Boolean bool = this.relayout;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.topMargin;
        return hashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecordMVState(relayout=");
        LIZ.append(this.relayout);
        LIZ.append(", topMargin=");
        return C78920UyC.LIZIZ(LIZ, this.topMargin, ')', LIZ);
    }

    public final Boolean getRelayout() {
        return this.relayout;
    }

    public final Boolean getTopMargin() {
        return this.topMargin;
    }

    public RecordMVState(Boolean bool, Boolean bool2) {
        this.relayout = bool;
        this.topMargin = bool2;
    }

    public /* synthetic */ RecordMVState(Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2);
    }
}
