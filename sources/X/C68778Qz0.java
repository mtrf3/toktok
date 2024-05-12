package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.StyleSpan;
import java.util.ArrayList;

/* renamed from: X.Qz0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68778Qz0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        ArrayList arrayList = null;
        com.google.android.gms.maps.model.Cap cap = null;
        com.google.android.gms.maps.model.Cap cap2 = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        float f = 0.0f;
        int i = 0;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    arrayList = C67315QbP.LJIIJJI(parcel, readInt, LatLng.CREATOR);
                    break;
                case 3:
                    f = C67315QbP.LJIJ(parcel, readInt);
                    break;
                case 4:
                    i = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case 5:
                    f2 = C67315QbP.LJIJ(parcel, readInt);
                    break;
                case 6:
                    z = C67315QbP.LJIILIIL(parcel, readInt);
                    break;
                case 7:
                    z2 = C67315QbP.LJIILIIL(parcel, readInt);
                    break;
                case '\b':
                    z3 = C67315QbP.LJIILIIL(parcel, readInt);
                    break;
                case '\t':
                    cap = (com.google.android.gms.maps.model.Cap) C67315QbP.LJI(parcel, readInt, com.google.android.gms.maps.model.Cap.CREATOR);
                    break;
                case '\n':
                    cap2 = (com.google.android.gms.maps.model.Cap) C67315QbP.LJI(parcel, readInt, com.google.android.gms.maps.model.Cap.CREATOR);
                    break;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    i2 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case '\f':
                    arrayList2 = C67315QbP.LJIIJJI(parcel, readInt, PatternItem.CREATOR);
                    break;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    arrayList3 = C67315QbP.LJIIJJI(parcel, readInt, StyleSpan.CREATOR);
                    break;
                default:
                    C67315QbP.LJJII(parcel, readInt);
                    break;
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new PolylineOptions(arrayList, f, i, f2, z, z2, z3, cap, cap2, i2, arrayList2, arrayList3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PolylineOptions[i];
    }
}
