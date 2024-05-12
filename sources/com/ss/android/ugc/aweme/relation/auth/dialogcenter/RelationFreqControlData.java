package com.ss.android.ugc.aweme.relation.auth.dialogcenter;

import X.F9E;
import X.URQ;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class RelationFreqControlData extends F9E implements Parcelable {
    public static final Parcelable.Creator<RelationFreqControlData> CREATOR = new URQ();
    public final int firstPhaseCount;
    public final long lastShowTime;
    public final int secondPhaseCount;
    public final int showIndex;
    public final int totalPopupCount;

    public RelationFreqControlData() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.showIndex), Long.valueOf(this.lastShowTime), Integer.valueOf(this.firstPhaseCount), Integer.valueOf(this.secondPhaseCount), Integer.valueOf(this.totalPopupCount)};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.showIndex);
        out.writeLong(this.lastShowTime);
        out.writeInt(this.firstPhaseCount);
        out.writeInt(this.secondPhaseCount);
        out.writeInt(this.totalPopupCount);
    }

    public /* synthetic */ RelationFreqControlData(int i) {
        this(0, 0, 0, 0, 0L);
    }

    public RelationFreqControlData(int i, int i2, int i3, int i4, long j) {
        this.showIndex = i;
        this.lastShowTime = j;
        this.firstPhaseCount = i2;
        this.secondPhaseCount = i3;
        this.totalPopupCount = i4;
    }
}
