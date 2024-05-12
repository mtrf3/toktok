package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.editSticker.model.CreateAwemeCoverTextAttr;
import kotlin.jvm.internal.o;

/* renamed from: X.GaZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C41783GaZ implements Parcelable.Creator<CreateAwemeCoverTextAttr> {
    @Override // android.os.Parcelable.Creator
    public final CreateAwemeCoverTextAttr createFromParcel(Parcel in) {
        o.LJIIIZ(in, "in");
        return new CreateAwemeCoverTextAttr(in.readString(), in.readString(), in.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final CreateAwemeCoverTextAttr[] newArray(int i) {
        return new CreateAwemeCoverTextAttr[i];
    }
}
