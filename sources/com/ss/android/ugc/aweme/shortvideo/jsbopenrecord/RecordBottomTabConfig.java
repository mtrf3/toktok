package com.ss.android.ugc.aweme.shortvideo.jsbopenrecord;

import X.C05040Hs;
import X.GPV;
import X.HCV;
import X.JBR;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class RecordBottomTabConfig implements Parcelable {
    public static final Parcelable.Creator<RecordBottomTabConfig> CREATOR = new HCV();

    @GPV
    public final Long maxVideoDuration;

    @GPV
    public final Long minVideoDuration;

    @GPV
    public final TabType tabType;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecordBottomTabConfig)) {
            return false;
        }
        RecordBottomTabConfig recordBottomTabConfig = (RecordBottomTabConfig) obj;
        return this.tabType == recordBottomTabConfig.tabType && o.LJ(this.minVideoDuration, recordBottomTabConfig.minVideoDuration) && o.LJ(this.maxVideoDuration, recordBottomTabConfig.maxVideoDuration);
    }

    public final int hashCode() {
        int hashCode = this.tabType.hashCode() * 31;
        Long l = this.minVideoDuration;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.maxVideoDuration;
        return hashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecordBottomTabConfig(tabType=");
        LIZ.append(this.tabType);
        LIZ.append(", minVideoDuration=");
        LIZ.append(this.minVideoDuration);
        LIZ.append(", maxVideoDuration=");
        return JBR.LJ(LIZ, this.maxVideoDuration, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        this.tabType.writeToParcel(out, i);
        Long l = this.minVideoDuration;
        if (l == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l);
        }
        Long l2 = this.maxVideoDuration;
        if (l2 == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l2);
        }
    }

    public RecordBottomTabConfig(TabType tabType, Long l, Long l2) {
        o.LJIIIZ(tabType, "tabType");
        this.tabType = tabType;
        this.minVideoDuration = l;
        this.maxVideoDuration = l2;
    }
}
