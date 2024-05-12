package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChoosePhotoPreviewPageConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.Hto, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45524Hto implements Parcelable.Creator<ChoosePhotoPreviewPageConfig> {
    @Override // android.os.Parcelable.Creator
    public final ChoosePhotoPreviewPageConfig createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (parcel.readInt() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (parcel.readInt() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (parcel.readInt() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (parcel.readInt() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (parcel.readInt() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (parcel.readInt() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (parcel.readInt() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (parcel.readInt() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (parcel.readInt() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (parcel.readInt() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (parcel.readInt() != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (parcel.readInt() != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (parcel.readInt() != 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        return new ChoosePhotoPreviewPageConfig(z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14, parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final ChoosePhotoPreviewPageConfig[] newArray(int i) {
        return new ChoosePhotoPreviewPageConfig[i];
    }
}
