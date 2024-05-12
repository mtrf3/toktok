package com.ss.android.ugc.aweme.creative.model.edit;

import X.C43564H7w;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class EditStickerModel implements Parcelable {
    public static final Parcelable.Creator<EditStickerModel> CREATOR = new C43564H7w();

    @InterfaceC65349Pkn("has_used_timestamp_ability")
    public boolean hasUsedTimestampAbility;

    public EditStickerModel() {
        this(false, 1, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.hasUsedTimestampAbility ? 1 : 0);
    }

    public EditStickerModel(boolean z) {
        this.hasUsedTimestampAbility = z;
    }

    public /* synthetic */ EditStickerModel(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
