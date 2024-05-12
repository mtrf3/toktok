package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import com.google.android.gms.maps.model.PolygonOptions;
import java.util.ArrayList;

/* renamed from: X.Qz3, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68781Qz3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        float f = 0.0f;
        int i = 0;
        int i2 = 0;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i3 = 0;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    arrayList2 = C67315QbP.LJIIJJI(parcel, readInt, LatLng.CREATOR);
                    break;
                case 3:
                    ClassLoader classLoader = C68781Qz3.class.getClassLoader();
                    int LJJIFFI = C67315QbP.LJJIFFI(parcel, readInt);
                    int dataPosition = parcel.dataPosition();
                    if (LJJIFFI != 0) {
                        parcel.readList(arrayList, classLoader);
                        parcel.setDataPosition(dataPosition + LJJIFFI);
                        break;
                    } else {
                        break;
                    }
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
                    z3 = C67315QbP.LJIILIIL(parcel, readInt);
                    break;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    i3 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case '\f':
                    arrayList3 = C67315QbP.LJIIJJI(parcel, readInt, PatternItem.CREATOR);
                    break;
                default:
                    C67315QbP.LJJII(parcel, readInt);
                    break;
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new PolygonOptions(arrayList2, arrayList, f, i, i2, f2, z, z2, z3, i3, arrayList3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PolygonOptions[i];
    }
}
