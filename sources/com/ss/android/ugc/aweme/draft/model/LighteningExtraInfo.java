package com.ss.android.ugc.aweme.draft.model;

import X.C43234Gxy;
import X.F9E;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class LighteningExtraInfo extends F9E implements Parcelable, Serializable {
    public static final Parcelable.Creator<LighteningExtraInfo> CREATOR = new C43234Gxy();

    @InterfaceC65349Pkn("scheduleId")
    public final String scheduleId;

    /* JADX WARN: Multi-variable type inference failed */
    public LighteningExtraInfo() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ LighteningExtraInfo copy$default(LighteningExtraInfo lighteningExtraInfo, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lighteningExtraInfo.scheduleId;
        }
        return lighteningExtraInfo.copy(str);
    }

    public final LighteningExtraInfo copy(String scheduleId) {
        o.LJIIIZ(scheduleId, "scheduleId");
        return new LighteningExtraInfo(scheduleId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.scheduleId};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.scheduleId);
    }

    public final String getScheduleId() {
        return this.scheduleId;
    }

    public LighteningExtraInfo(String scheduleId) {
        o.LJIIIZ(scheduleId, "scheduleId");
        this.scheduleId = scheduleId;
    }

    public /* synthetic */ LighteningExtraInfo(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
