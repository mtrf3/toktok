package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect;
import kotlin.jvm.internal.o;

/* renamed from: X.ERr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36435ERr implements Parcelable.Creator<UploadableMobileEffect> {
    @Override // android.os.Parcelable.Creator
    public final UploadableMobileEffect createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new UploadableMobileEffect(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final UploadableMobileEffect[] newArray(int i) {
        return new UploadableMobileEffect[i];
    }
}
