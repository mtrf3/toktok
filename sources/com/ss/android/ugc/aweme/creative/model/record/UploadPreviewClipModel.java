package com.ss.android.ugc.aweme.creative.model.record;

import X.C43566H7y;
import X.GPV;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class UploadPreviewClipModel implements Parcelable {
    public static final Parcelable.Creator<UploadPreviewClipModel> CREATOR = new C43566H7y();

    @GPV
    public boolean hasMediaClipped;

    public UploadPreviewClipModel() {
        this(false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.hasMediaClipped ? 1 : 0);
    }

    public UploadPreviewClipModel(boolean z) {
        this.hasMediaClipped = z;
    }
}
