package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import java.util.ArrayList;

/* renamed from: X.Qz4, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68782Qz4 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        LatLng latLng = null;
        ArrayList arrayList = null;
        double d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        float f = 0.0f;
        int i = 0;
        int i2 = 0;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    latLng = (LatLng) C67315QbP.LJI(parcel, readInt, LatLng.CREATOR);
                    break;
                case 3:
                    d = C67315QbP.LJIILLIIL(parcel, readInt);
                    break;
                case 4:
                    f = C67315QbP.LJIJ(parcel, readInt);
                    break;
                case 5:
                    i = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case 6:
                    i2 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case 7:
                    f2 = C67315QbP.LJIJ(parcel, readInt);
                    break;
                case '\b':
                    z = C67315QbP.LJIILIIL(parcel, readInt);
                    break;
                case '\t':
                    z2 = C67315QbP.LJIILIIL(parcel, readInt);
                    break;
                case '\n':
                    arrayList = C67315QbP.LJIIJJI(parcel, readInt, PatternItem.CREATOR);
                    break;
                default:
                    C67315QbP.LJJII(parcel, readInt);
                    break;
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new CircleOptions(latLng, d, f, i, i2, f2, z, z2, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CircleOptions[i];
    }
}
