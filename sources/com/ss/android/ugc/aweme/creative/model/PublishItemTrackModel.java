package com.ss.android.ugc.aweme.creative.model;

import X.C42078GfK;
import X.C43588H8u;
import X.F9E;
import X.GPV;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class PublishItemTrackModel extends F9E implements Parcelable {
    public static final Parcelable.Creator<PublishItemTrackModel> CREATOR = new C42078GfK();

    @GPV
    public final String fromGroupId;

    @GPV
    public final String fromItemId;

    @GPV
    public final String lastFollowupItemId;

    @GPV
    public final String lastGroupId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.fromGroupId, this.lastGroupId, this.fromItemId, this.lastFollowupItemId};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.fromGroupId);
        out.writeString(this.lastGroupId);
        out.writeString(this.fromItemId);
        out.writeString(this.lastFollowupItemId);
    }

    public PublishItemTrackModel() {
        this("", "", "", "");
    }

    public PublishItemTrackModel(String str, String str2, String str3, String str4) {
        C43588H8u.LIZLLL(str, "fromGroupId", str2, "lastGroupId", str3, "fromItemId", str4, "lastFollowupItemId");
        this.fromGroupId = str;
        this.lastGroupId = str2;
        this.fromItemId = str3;
        this.lastFollowupItemId = str4;
    }
}
