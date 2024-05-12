package Y;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.effectcreatormobile.ckeapi.api.album.Media;
import com.spotify.sdk.android.auth.AuthorizationRequest;
import com.spotify.sdk.android.auth.AuthorizationResponse;
import com.ugc.effectcreator.foundation.widgets.highlight.Configuration;

/* loaded from: classes34.dex */
public class IDCreatorS58S0000000_42 implements Parcelable.Creator {
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
            default:
                return new Object[0];
        }
    }

    public IDCreatorS58S0000000_42(int i) {
        this.$t = i;
    }

    public static final Object createFromParcel$0(IDCreatorS58S0000000_42 iDCreatorS58S0000000_42, Parcel parcel) {
        return new Media(parcel);
    }

    public static final Object createFromParcel$1(IDCreatorS58S0000000_42 iDCreatorS58S0000000_42, Parcel parcel) {
        return new AuthorizationRequest(parcel);
    }

    public static final Object createFromParcel$2(IDCreatorS58S0000000_42 iDCreatorS58S0000000_42, Parcel parcel) {
        return new AuthorizationResponse(parcel);
    }

    public static final Object createFromParcel$3(IDCreatorS58S0000000_42 iDCreatorS58S0000000_42, Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        Configuration configuration = new Configuration();
        configuration.LJLJJLL = parcel.readInt();
        configuration.LJLJL = parcel.readInt();
        configuration.LJLJLJ = parcel.readInt();
        configuration.LJLLI = parcel.readInt();
        configuration.LJLJLLL = parcel.readInt();
        configuration.LJLIL = parcel.readInt();
        configuration.LJLILLLLZI = parcel.readInt();
        configuration.LJLJI = parcel.readInt();
        configuration.LJLJJI = parcel.readInt();
        configuration.LJLJJL = parcel.readInt();
        configuration.LJLL = parcel.readInt();
        boolean z4 = false;
        if (parcel.readByte() == 1) {
            z = true;
        } else {
            z = false;
        }
        configuration.LJLLILLLL = z;
        if (parcel.readByte() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        configuration.LJLLLL = z2;
        if (parcel.readByte() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        configuration.LJLLJ = z3;
        if (parcel.readByte() == 1) {
            z4 = true;
        }
        configuration.LJLLL = z4;
        return configuration;
    }

    public static final Object[] newArray$0(IDCreatorS58S0000000_42 iDCreatorS58S0000000_42, int i) {
        return new Media[i];
    }

    public static final Object[] newArray$1(IDCreatorS58S0000000_42 iDCreatorS58S0000000_42, int i) {
        return new AuthorizationRequest[i];
    }

    public static final Object[] newArray$2(IDCreatorS58S0000000_42 iDCreatorS58S0000000_42, int i) {
        return new AuthorizationResponse[i];
    }

    public static final Object[] newArray$3(IDCreatorS58S0000000_42 iDCreatorS58S0000000_42, int i) {
        return new Configuration[i];
    }
}
