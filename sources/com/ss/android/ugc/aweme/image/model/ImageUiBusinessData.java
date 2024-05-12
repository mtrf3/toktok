package com.ss.android.ugc.aweme.image.model;

import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.image.model.ImageUiBusinessData;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class ImageUiBusinessData implements Parcelable, Serializable {
    public static final Parcelable.Creator<ImageUiBusinessData> CREATOR = new Parcelable.Creator<ImageUiBusinessData>() { // from class: X.5xH
        @Override // android.os.Parcelable.Creator
        public final ImageUiBusinessData createFromParcel(Parcel parcel) {
            boolean z;
            o.LJIIIZ(parcel, "parcel");
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new ImageUiBusinessData(z);
        }

        @Override // android.os.Parcelable.Creator
        public final ImageUiBusinessData[] newArray(int i) {
            return new ImageUiBusinessData[i];
        }
    };

    @InterfaceC65349Pkn("has_showed_title")
    public boolean hasShowedTitle;

    public ImageUiBusinessData() {
        this(false, 1, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.hasShowedTitle ? 1 : 0);
    }

    public final boolean getHasShowedTitle() {
        return this.hasShowedTitle;
    }

    public ImageUiBusinessData(boolean z) {
        this.hasShowedTitle = z;
    }

    public final void setHasShowedTitle(boolean z) {
        this.hasShowedTitle = z;
    }

    public /* synthetic */ ImageUiBusinessData(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
