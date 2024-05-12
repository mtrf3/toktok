package com.ss.android.ugc.aweme.creative.model.publish;

import X.C43565H7x;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class PublishPreviewModel implements Parcelable {
    public static final Parcelable.Creator<PublishPreviewModel> CREATOR = new C43565H7x();

    @InterfaceC65349Pkn("first_frame_path")
    public String firstFramePath;

    /* JADX WARN: Multi-variable type inference failed */
    public PublishPreviewModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.firstFramePath);
    }

    public PublishPreviewModel(String firstFramePath) {
        o.LJIIIZ(firstFramePath, "firstFramePath");
        this.firstFramePath = firstFramePath;
    }

    public /* synthetic */ PublishPreviewModel(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
