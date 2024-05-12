package com.ss.android.ugc.aweme.creative.model.edit;

import X.H8O;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class EditBackSaveModel implements Parcelable {
    public static final Parcelable.Creator<EditBackSaveModel> CREATOR = new H8O();

    @InterfaceC65349Pkn("new_clips")
    public boolean newClips;

    @InterfaceC65349Pkn("new_clips_type")
    public String newClipsType;

    /* JADX WARN: Multi-variable type inference failed */
    public EditBackSaveModel() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.newClips ? 1 : 0);
        out.writeString(this.newClipsType);
    }

    public EditBackSaveModel(boolean z, String newClipsType) {
        o.LJIIIZ(newClipsType, "newClipsType");
        this.newClips = z;
        this.newClipsType = newClipsType;
    }

    public /* synthetic */ EditBackSaveModel(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "shoot" : str);
    }
}
