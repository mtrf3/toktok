package Y;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.apm.core.SpPair;
import com.ss.ugc.android.editor.base.data.Media;

/* loaded from: classes7.dex */
public class IDCreatorS50S0000000_6 implements Parcelable.Creator {
    public final int $t;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.$t) {
            case 0:
                return createFromParcel$0(this, parcel);
            case 1:
                return createFromParcel$1(this, parcel);
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
            default:
                return new Object[0];
        }
    }

    public IDCreatorS50S0000000_6(int i) {
        this.$t = i;
    }

    public static final Object createFromParcel$0(IDCreatorS50S0000000_6 iDCreatorS50S0000000_6, Parcel parcel) {
        return new SpPair(parcel);
    }

    public static final Object createFromParcel$1(IDCreatorS50S0000000_6 iDCreatorS50S0000000_6, Parcel parcel) {
        return new Media(parcel);
    }

    public static final Object[] newArray$0(IDCreatorS50S0000000_6 iDCreatorS50S0000000_6, int i) {
        return new SpPair[i];
    }

    public static final Object[] newArray$1(IDCreatorS50S0000000_6 iDCreatorS50S0000000_6, int i) {
        return new Media[i];
    }
}
