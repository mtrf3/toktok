package com.ss.android.ugc.aweme.shortvideo.model;

import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CreativeDurationExtra implements Parcelable, Serializable {
    public static final Parcelable.Creator<CreativeDurationExtra> CREATOR = new Creator();

    @InterfaceC65349Pkn("shoot_publish_duration")
    public long shootPublishDuration;

    @InterfaceC65349Pkn("start_edit_draft_time")
    public long startEditDraftTime;

    @InterfaceC65349Pkn("start_time")
    public long startTime;

    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<CreativeDurationExtra> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreativeDurationExtra createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new CreativeDurationExtra(parcel.readLong(), parcel.readLong(), parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreativeDurationExtra[] newArray(int i) {
            return new CreativeDurationExtra[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CreativeDurationExtra() {
        /*
            r9 = this;
            r1 = 0
            r7 = 7
            r8 = 0
            r0 = r9
            r3 = r1
            r5 = r1
            r0.<init>(r1, r3, r5, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.model.CreativeDurationExtra.<init>():void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CreativeDurationExtra(long r10) {
        /*
            r9 = this;
            r3 = 0
            r7 = 6
            r8 = 0
            r0 = r9
            r1 = r10
            r5 = r3
            r0.<init>(r1, r3, r5, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.model.CreativeDurationExtra.<init>(long):void");
    }

    public CreativeDurationExtra(long j, long j2) {
        this(j, j2, 0L, 4, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeLong(this.startTime);
        out.writeLong(this.shootPublishDuration);
        out.writeLong(this.startEditDraftTime);
    }

    public final long getShootPublishDuration() {
        return this.shootPublishDuration;
    }

    public final long getStartEditDraftTime() {
        return this.startEditDraftTime;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final void setShootPublishDuration(long j) {
        this.shootPublishDuration = j;
    }

    public final void setStartEditDraftTime(long j) {
        this.startEditDraftTime = j;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public CreativeDurationExtra(long j, long j2, long j3) {
        this.startTime = j;
        this.shootPublishDuration = j2;
        this.startEditDraftTime = j3;
    }

    public /* synthetic */ CreativeDurationExtra(long j, long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? 0L : j3);
    }
}
