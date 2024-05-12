package Y;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.chatroom.model.InputAttrs;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.privilege.PrivilegeSheetOptions;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.Event;

/* loaded from: classes6.dex */
public class IDCreatorS49S0000000_5 implements Parcelable.Creator {
    public final int $t;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.$t) {
            case 0:
                return createFromParcel$0(this, parcel);
            case 1:
                return createFromParcel$1(this, parcel);
            case 2:
                return createFromParcel$2(this, parcel);
            case 3:
                return createFromParcel$3(this, parcel);
            case 4:
                return createFromParcel$4(this, parcel);
            case 5:
                return createFromParcel$5(this, parcel);
            default:
                return null;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.$t) {
            case 0:
                return newArray$0(this, i);
            case 1:
                return newArray$1(this, i);
            case 2:
                return newArray$2(this, i);
            case 3:
                return newArray$3(this, i);
            case 4:
                return newArray$4(this, i);
            case 5:
                return newArray$5(this, i);
            default:
                return new Object[0];
        }
    }

    public IDCreatorS49S0000000_5(int i) {
        this.$t = i;
    }

    public static final Object createFromParcel$0(IDCreatorS49S0000000_5 iDCreatorS49S0000000_5, Parcel parcel) {
        return new InputAttrs(parcel);
    }

    public static final Object createFromParcel$1(IDCreatorS49S0000000_5 iDCreatorS49S0000000_5, Parcel parcel) {
        return new FeedDataKey(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readLong());
    }

    public static final Object createFromParcel$2(IDCreatorS49S0000000_5 iDCreatorS49S0000000_5, Parcel parcel) {
        return new PrivilegeSheetOptions(parcel);
    }

    public static final Object createFromParcel$3(IDCreatorS49S0000000_5 iDCreatorS49S0000000_5, Parcel parcel) {
        return new LiveCoreSDKData.Quality(parcel);
    }

    public static final Object createFromParcel$4(IDCreatorS49S0000000_5 iDCreatorS49S0000000_5, Parcel parcel) {
        return new EnterRoomLinkSession(parcel);
    }

    public static final Object createFromParcel$5(IDCreatorS49S0000000_5 iDCreatorS49S0000000_5, Parcel parcel) {
        return new Event(parcel);
    }

    public static final Object[] newArray$0(IDCreatorS49S0000000_5 iDCreatorS49S0000000_5, int i) {
        return new InputAttrs[i];
    }

    public static final Object[] newArray$1(IDCreatorS49S0000000_5 iDCreatorS49S0000000_5, int i) {
        return new FeedDataKey[i];
    }

    public static final Object[] newArray$2(IDCreatorS49S0000000_5 iDCreatorS49S0000000_5, int i) {
        return new PrivilegeSheetOptions[i];
    }

    public static final Object[] newArray$3(IDCreatorS49S0000000_5 iDCreatorS49S0000000_5, int i) {
        return new LiveCoreSDKData.Quality[i];
    }

    public static final Object[] newArray$4(IDCreatorS49S0000000_5 iDCreatorS49S0000000_5, int i) {
        return new EnterRoomLinkSession[i];
    }

    public static final Object[] newArray$5(IDCreatorS49S0000000_5 iDCreatorS49S0000000_5, int i) {
        return new Event[i];
    }
}
