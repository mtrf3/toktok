package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import com.google.android.gms.wallet.wobs.TextModuleData;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;
import java.util.ArrayList;

/* renamed from: X.Qyl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68763Qyl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        TimeInterval timeInterval = null;
        String str9 = null;
        String str10 = null;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = C67315QbP.LJII(parcel, readInt);
                    break;
                case 3:
                    str2 = C67315QbP.LJII(parcel, readInt);
                    break;
                case 4:
                    str3 = C67315QbP.LJII(parcel, readInt);
                    break;
                case 5:
                    str4 = C67315QbP.LJII(parcel, readInt);
                    break;
                case 6:
                    str5 = C67315QbP.LJII(parcel, readInt);
                    break;
                case 7:
                    str6 = C67315QbP.LJII(parcel, readInt);
                    break;
                case '\b':
                    str7 = C67315QbP.LJII(parcel, readInt);
                    break;
                case '\t':
                    str8 = C67315QbP.LJII(parcel, readInt);
                    break;
                case '\n':
                    i = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    arrayList = C67315QbP.LJIIJJI(parcel, readInt, WalletObjectMessage.CREATOR);
                    break;
                case '\f':
                    timeInterval = (TimeInterval) C67315QbP.LJI(parcel, readInt, TimeInterval.CREATOR);
                    break;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    arrayList2 = C67315QbP.LJIIJJI(parcel, readInt, LatLng.CREATOR);
                    break;
                case 14:
                    str9 = C67315QbP.LJII(parcel, readInt);
                    break;
                case 15:
                    str10 = C67315QbP.LJII(parcel, readInt);
                    break;
                case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                    arrayList3 = C67315QbP.LJIIJJI(parcel, readInt, LabelValueRow.CREATOR);
                    break;
                case 17:
                    z = C67315QbP.LJIILIIL(parcel, readInt);
                    break;
                case 18:
                    arrayList4 = C67315QbP.LJIIJJI(parcel, readInt, UriData.CREATOR);
                    break;
                case 19:
                    arrayList5 = C67315QbP.LJIIJJI(parcel, readInt, TextModuleData.CREATOR);
                    break;
                case 20:
                    arrayList6 = C67315QbP.LJIIJJI(parcel, readInt, UriData.CREATOR);
                    break;
                default:
                    C67315QbP.LJJII(parcel, readInt);
                    break;
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new CommonWalletObject(str, str2, str3, str4, str5, str6, str7, str8, i, arrayList, timeInterval, arrayList2, str9, str10, arrayList3, z, arrayList4, arrayList5, arrayList6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CommonWalletObject[i];
    }
}
