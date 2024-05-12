package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.PostLandingModel;
import kotlin.jvm.internal.o;

/* renamed from: X.H7m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43554H7m implements Parcelable.Creator<PostLandingModel> {
    @Override // android.os.Parcelable.Creator
    public final PostLandingModel createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        String readString = parcel.readString();
        Bundle readBundle = parcel.readBundle();
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
        return new PostLandingModel(z, readString, readBundle, z2, z3);
    }

    @Override // android.os.Parcelable.Creator
    public final PostLandingModel[] newArray(int i) {
        return new PostLandingModel[i];
    }
}
