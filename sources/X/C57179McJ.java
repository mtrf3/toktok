package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.notice.api.bean.GuideOutPushParam;
import kotlin.jvm.internal.o;

/* renamed from: X.McJ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57179McJ implements Parcelable.Creator<GuideOutPushParam> {
    @Override // android.os.Parcelable.Creator
    public final GuideOutPushParam createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new GuideOutPushParam(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final GuideOutPushParam[] newArray(int i) {
        return new GuideOutPushParam[i];
    }
}
