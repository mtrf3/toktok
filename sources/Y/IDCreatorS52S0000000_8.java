package Y;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.vesdk.VEEqualizerParams;
import com.ss.bytenn.ByteNNConfig;
import com.ss.bytenn.LossInfo;
import com.ss.bytenn.Tensor;
import com.ttnet.org.chromium.base.library_loader.Linker;

/* loaded from: classes9.dex */
public class IDCreatorS52S0000000_8 implements Parcelable.Creator {
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

    public IDCreatorS52S0000000_8(int i) {
        this.$t = i;
    }

    public static final Object createFromParcel$0(IDCreatorS52S0000000_8 iDCreatorS52S0000000_8, Parcel parcel) {
        return new HttpHeader(parcel);
    }

    public static final Object createFromParcel$1(IDCreatorS52S0000000_8 iDCreatorS52S0000000_8, Parcel parcel) {
        return new VEEqualizerParams(parcel);
    }

    public static final Object createFromParcel$2(IDCreatorS52S0000000_8 iDCreatorS52S0000000_8, Parcel parcel) {
        return new ByteNNConfig(parcel);
    }

    public static final Object createFromParcel$3(IDCreatorS52S0000000_8 iDCreatorS52S0000000_8, Parcel parcel) {
        return new LossInfo(parcel);
    }

    public static final Object createFromParcel$4(IDCreatorS52S0000000_8 iDCreatorS52S0000000_8, Parcel parcel) {
        return new Tensor(parcel);
    }

    public static final Object createFromParcel$5(IDCreatorS52S0000000_8 iDCreatorS52S0000000_8, Parcel parcel) {
        return new Linker.LibInfo(parcel);
    }

    public static final Object[] newArray$0(IDCreatorS52S0000000_8 iDCreatorS52S0000000_8, int i) {
        return new HttpHeader[i];
    }

    public static final Object[] newArray$1(IDCreatorS52S0000000_8 iDCreatorS52S0000000_8, int i) {
        return new VEEqualizerParams[i];
    }

    public static final Object[] newArray$2(IDCreatorS52S0000000_8 iDCreatorS52S0000000_8, int i) {
        return new ByteNNConfig[i];
    }

    public static final Object[] newArray$3(IDCreatorS52S0000000_8 iDCreatorS52S0000000_8, int i) {
        return new LossInfo[i];
    }

    public static final Object[] newArray$4(IDCreatorS52S0000000_8 iDCreatorS52S0000000_8, int i) {
        return new Tensor[i];
    }

    public static final Object[] newArray$5(IDCreatorS52S0000000_8 iDCreatorS52S0000000_8, int i) {
        return new Linker.LibInfo[i];
    }
}
