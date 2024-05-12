package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.chatroom.banner.panel.model.BannerPanelItem;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CAY implements Parcelable.Creator<BannerPanelItem> {
    @Override // android.os.Parcelable.Creator
    public final BannerPanelItem createFromParcel(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        return new BannerPanelItem(parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final BannerPanelItem[] newArray(int i) {
        return new BannerPanelItem[i];
    }
}
