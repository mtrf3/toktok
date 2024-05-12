package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.sticker.CustomizedPropInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.ESr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36461ESr implements Parcelable.Creator<CustomizedPropInfo> {
    @Override // android.os.Parcelable.Creator
    public final CustomizedPropInfo createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new CustomizedPropInfo(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final CustomizedPropInfo[] newArray(int i) {
        return new CustomizedPropInfo[i];
    }
}
