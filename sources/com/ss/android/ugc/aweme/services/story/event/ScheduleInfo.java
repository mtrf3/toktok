package com.ss.android.ugc.aweme.services.story.event;

import X.F9E;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ScheduleInfo extends F9E implements Parcelable {
    public static final Parcelable.Creator<ScheduleInfo> CREATOR = new Creator();
    public final String scheduleId;
    public final Bundle scheduleParam;

    /* loaded from: classes13.dex */
    public static final class Creator implements Parcelable.Creator<ScheduleInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ScheduleInfo createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new ScheduleInfo(parcel.readString(), parcel.readBundle());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ScheduleInfo[] newArray(int i) {
            return new ScheduleInfo[i];
        }
    }

    public static /* synthetic */ ScheduleInfo copy$default(ScheduleInfo scheduleInfo, String str, Bundle bundle, int i, Object obj) {
        if ((i & 1) != 0) {
            str = scheduleInfo.scheduleId;
        }
        if ((i & 2) != 0) {
            bundle = scheduleInfo.scheduleParam;
        }
        return scheduleInfo.copy(str, bundle);
    }

    public final ScheduleInfo copy(String scheduleId, Bundle scheduleParam) {
        o.LJIIIZ(scheduleId, "scheduleId");
        o.LJIIIZ(scheduleParam, "scheduleParam");
        return new ScheduleInfo(scheduleId, scheduleParam);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.scheduleId, this.scheduleParam};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.scheduleId);
        out.writeBundle(this.scheduleParam);
    }

    public final String getScheduleId() {
        return this.scheduleId;
    }

    public final Bundle getScheduleParam() {
        return this.scheduleParam;
    }

    public ScheduleInfo(String scheduleId, Bundle scheduleParam) {
        o.LJIIIZ(scheduleId, "scheduleId");
        o.LJIIIZ(scheduleParam, "scheduleParam");
        this.scheduleId = scheduleId;
        this.scheduleParam = scheduleParam;
    }
}
