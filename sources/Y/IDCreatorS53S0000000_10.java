package Y;

import X.C62373Odt;
import X.C62374Odu;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.scene.navigation.ActivityStatusRecord;
import com.ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class IDCreatorS53S0000000_10 implements Parcelable.Creator {
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

    public IDCreatorS53S0000000_10(int i) {
        this.$t = i;
    }

    public static final Object createFromParcel$0(IDCreatorS53S0000000_10 iDCreatorS53S0000000_10, Parcel parcel) {
        return new ActivityStatusRecord(parcel);
    }

    public static final Object createFromParcel$1(IDCreatorS53S0000000_10 iDCreatorS53S0000000_10, Parcel parcel) {
        return new LiveWallPaperBean(parcel);
    }

    public static final Object createFromParcel$2(IDCreatorS53S0000000_10 iDCreatorS53S0000000_10, Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        C62373Odt c62373Odt = new C62373Odt();
        c62373Odt.LIZ(parcel);
        return new BaseSharePackage(c62373Odt);
    }

    public static final Object createFromParcel$3(IDCreatorS53S0000000_10 iDCreatorS53S0000000_10, Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        C62374Odu c62374Odu = new C62374Odu();
        c62374Odu.LIZLLL(parcel);
        return new SharePackage(c62374Odu);
    }

    public static final Object[] newArray$0(IDCreatorS53S0000000_10 iDCreatorS53S0000000_10, int i) {
        return new ActivityStatusRecord[i];
    }

    public static final Object[] newArray$1(IDCreatorS53S0000000_10 iDCreatorS53S0000000_10, int i) {
        return new LiveWallPaperBean[i];
    }

    public static final Object[] newArray$2(IDCreatorS53S0000000_10 iDCreatorS53S0000000_10, int i) {
        return new BaseSharePackage[i];
    }

    public static final Object[] newArray$3(IDCreatorS53S0000000_10 iDCreatorS53S0000000_10, int i) {
        return new SharePackage[i];
    }
}
