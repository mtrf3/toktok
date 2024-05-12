package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.UploadableDraftEffect;
import kotlin.jvm.internal.o;

/* renamed from: X.ERo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36432ERo implements Parcelable.Creator<UploadableDraftEffect> {
    @Override // android.os.Parcelable.Creator
    public final UploadableDraftEffect createFromParcel(Parcel parcel) {
        boolean z;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        String readString6 = parcel.readString();
        boolean z2 = false;
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (parcel.readInt() != 0) {
            z2 = true;
        }
        return new UploadableDraftEffect(readString, readString2, readString3, readString4, readString5, readString6, z, z2, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final UploadableDraftEffect[] newArray(int i) {
        return new UploadableDraftEffect[i];
    }
}
