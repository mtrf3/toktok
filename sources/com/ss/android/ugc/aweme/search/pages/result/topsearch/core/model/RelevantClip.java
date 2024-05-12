package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class RelevantClip {

    @InterfaceC65349Pkn("enable_skip_button")
    public final Boolean enableSkipButton;

    @InterfaceC65349Pkn("revelant_times")
    public final List<Float> relevantTimes;

    /* JADX WARN: Multi-variable type inference failed */
    public RelevantClip() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RelevantClip)) {
            return false;
        }
        RelevantClip relevantClip = (RelevantClip) obj;
        return o.LJ(this.enableSkipButton, relevantClip.enableSkipButton) && o.LJ(this.relevantTimes, relevantClip.relevantTimes);
    }

    public final int hashCode() {
        Boolean bool = this.enableSkipButton;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        List<Float> list = this.relevantTimes;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RelevantClip(enableSkipButton=");
        LIZ.append(this.enableSkipButton);
        LIZ.append(", relevantTimes=");
        return C1NE.LIZIZ(LIZ, this.relevantTimes, ')', LIZ);
    }

    public RelevantClip(Boolean bool, List<Float> list) {
        this.enableSkipButton = bool;
        this.relevantTimes = list;
    }

    public /* synthetic */ RelevantClip(Boolean bool, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? null : list);
    }
}
