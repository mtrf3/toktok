package Y;

import X.C109464Ri;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.vesdk.VEBitmapWithInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class IDCreatorS46S0000000_1 implements Parcelable.Creator {
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

    public IDCreatorS46S0000000_1(int i) {
        this.$t = i;
    }

    public static final Object createFromParcel$0(IDCreatorS46S0000000_1 iDCreatorS46S0000000_1, Parcel parcel) {
        o.LJIIJ(parcel, "parcel");
        SparkContext sparkContext = new SparkContext();
        C109464Ri.LIZ.getClass();
        return sparkContext;
    }

    public static final Object createFromParcel$1(IDCreatorS46S0000000_1 iDCreatorS46S0000000_1, Parcel parcel) {
        return new VEBitmapWithInfo(parcel);
    }

    public static final Object[] newArray$0(IDCreatorS46S0000000_1 iDCreatorS46S0000000_1, int i) {
        return new SparkContext[i];
    }

    public static final Object[] newArray$1(IDCreatorS46S0000000_1 iDCreatorS46S0000000_1, int i) {
        return new VEBitmapWithInfo[i];
    }
}
