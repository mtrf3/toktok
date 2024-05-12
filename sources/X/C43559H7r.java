package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.CreativePublishPermissionModel;
import kotlin.jvm.internal.o;

/* renamed from: X.H7r, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43559H7r implements Parcelable.Creator<CreativePublishPermissionModel> {
    @Override // android.os.Parcelable.Creator
    public final CreativePublishPermissionModel createFromParcel(Parcel parcel) {
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new CreativePublishPermissionModel(z);
    }

    @Override // android.os.Parcelable.Creator
    public final CreativePublishPermissionModel[] newArray(int i) {
        return new CreativePublishPermissionModel[i];
    }
}
