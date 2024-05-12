package com.ss.android.ugc.aweme.search.common.config;

import X.C47959Irz;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class FeedSearchGuide {

    @InterfaceC65349Pkn("display_interval")
    public float displayInterval;

    @InterfaceC65349Pkn("group")
    public Integer group;

    @InterfaceC65349Pkn("show_tips_delay")
    public Long showTipsDelay;

    /* JADX WARN: Multi-variable type inference failed */
    public FeedSearchGuide() {
        this(null, 0.0f, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedSearchGuide)) {
            return false;
        }
        FeedSearchGuide feedSearchGuide = (FeedSearchGuide) obj;
        return o.LJ(this.group, feedSearchGuide.group) && Float.compare(this.displayInterval, feedSearchGuide.displayInterval) == 0 && o.LJ(this.showTipsDelay, feedSearchGuide.showTipsDelay);
    }

    public final int hashCode() {
        int hashCode;
        Integer num = this.group;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int LIZIZ = C47959Irz.LIZIZ(this.displayInterval, hashCode * 31, 31);
        Long l = this.showTipsDelay;
        if (l != null) {
            i = l.hashCode();
        }
        return LIZIZ + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FeedSearchGuide(group=");
        LIZ.append(this.group);
        LIZ.append(", displayInterval=");
        LIZ.append(this.displayInterval);
        LIZ.append(", showTipsDelay=");
        return JBR.LJ(LIZ, this.showTipsDelay, ')', LIZ);
    }

    public FeedSearchGuide(Integer num, float f, Long l) {
        this.group = num;
        this.displayInterval = f;
        this.showTipsDelay = l;
    }

    public /* synthetic */ FeedSearchGuide(Integer num, float f, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? null : l);
    }
}
