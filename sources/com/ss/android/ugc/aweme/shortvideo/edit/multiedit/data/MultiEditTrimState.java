package com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data;

import X.C46107I7r;
import X.F9E;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class MultiEditTrimState extends F9E implements Parcelable, Serializable {
    public static final Parcelable.Creator<MultiEditTrimState> CREATOR = new C46107I7r();

    @InterfaceC65349Pkn(alternate = {"a"}, value = "enable")
    public final boolean enable;

    @InterfaceC65349Pkn(alternate = {"c"}, value = "endTime")
    public final long endTime;

    @InterfaceC65349Pkn(alternate = {"b"}, value = "startTime")
    public final long startTime;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MultiEditTrimState() {
        /*
            r8 = this;
            r1 = 0
            r2 = 0
            r6 = 7
            r7 = 0
            r0 = r8
            r4 = r2
            r0.<init>(r1, r2, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditTrimState.<init>():void");
    }

    public static /* synthetic */ MultiEditTrimState copy$default(MultiEditTrimState multiEditTrimState, boolean z, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = multiEditTrimState.enable;
        }
        if ((i & 2) != 0) {
            j = multiEditTrimState.startTime;
        }
        if ((i & 4) != 0) {
            j2 = multiEditTrimState.endTime;
        }
        return multiEditTrimState.copy(z, j, j2);
    }

    public final MultiEditTrimState copy(boolean z, long j, long j2) {
        return new MultiEditTrimState(z, j, j2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enable), Long.valueOf(this.startTime), Long.valueOf(this.endTime)};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.enable ? 1 : 0);
        out.writeLong(this.startTime);
        out.writeLong(this.endTime);
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public MultiEditTrimState(boolean z, long j, long j2) {
        this.enable = z;
        this.startTime = j;
        this.endTime = j2;
    }

    public /* synthetic */ MultiEditTrimState(boolean z, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? -1L : j2);
    }
}
