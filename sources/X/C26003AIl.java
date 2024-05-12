package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.utils.ZoomAnimationUtils;

/* renamed from: X.AIl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C26003AIl implements Parcelable.Creator<ZoomAnimationUtils.ZoomInfo> {
    @Override // android.os.Parcelable.Creator
    public final ZoomAnimationUtils.ZoomInfo createFromParcel(Parcel parcel) {
        return new ZoomAnimationUtils.ZoomInfo(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final ZoomAnimationUtils.ZoomInfo[] newArray(int i) {
        return new ZoomAnimationUtils.ZoomInfo[i];
    }
}
