package com.ss.android.ugc.aweme.creative.model;

import X.C41358GLa;
import X.F9E;
import X.GPV;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ForwardEditPublishData extends F9E implements Parcelable {
    public static final Parcelable.Creator<ForwardEditPublishData> CREATOR = new C41358GLa();

    @GPV
    public final boolean disableProgressView;

    @GPV
    public final String draftId;

    @GPV
    public final String publishId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.draftId, this.publishId, Boolean.valueOf(this.disableProgressView)};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.draftId);
        out.writeString(this.publishId);
        out.writeInt(this.disableProgressView ? 1 : 0);
    }

    public ForwardEditPublishData(String draftId, String publishId, boolean z) {
        o.LJIIIZ(draftId, "draftId");
        o.LJIIIZ(publishId, "publishId");
        this.draftId = draftId;
        this.publishId = publishId;
        this.disableProgressView = z;
    }
}
