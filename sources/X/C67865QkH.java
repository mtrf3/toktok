package X;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.GetServiceRequest;

/* renamed from: X.QkH, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67865QkH implements Parcelable.Creator<GetServiceRequest> {
    @Override // android.os.Parcelable.Creator
    public final GetServiceRequest createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        String str = null;
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Bundle bundle = null;
        Account account = null;
        Feature[] featureArr = null;
        Feature[] featureArr2 = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case 2:
                    i2 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case 3:
                    i3 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case 4:
                    str = C67315QbP.LJII(parcel, readInt);
                    break;
                case 5:
                    iBinder = C67315QbP.LJIJJ(parcel, readInt);
                    break;
                case 6:
                    scopeArr = (Scope[]) C67315QbP.LJIIJ(parcel, readInt, Scope.CREATOR);
                    break;
                case 7:
                    bundle = C67315QbP.LIZIZ(parcel, readInt);
                    break;
                case '\b':
                    account = (Account) C67315QbP.LJI(parcel, readInt, Account.CREATOR);
                    break;
                case '\t':
                default:
                    C67315QbP.LJJII(parcel, readInt);
                    break;
                case '\n':
                    featureArr = (Feature[]) C67315QbP.LJIIJ(parcel, readInt, Feature.CREATOR);
                    break;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    featureArr2 = (Feature[]) C67315QbP.LJIIJ(parcel, readInt, Feature.CREATOR);
                    break;
                case '\f':
                    z = C67315QbP.LJIILIIL(parcel, readInt);
                    break;
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                    i4 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case 14:
                    z2 = C67315QbP.LJIILIIL(parcel, readInt);
                    break;
                case 15:
                    str2 = C67315QbP.LJII(parcel, readInt);
                    break;
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new GetServiceRequest(i, i2, i3, str, iBinder, scopeArr, bundle, account, featureArr, featureArr2, z, i4, z2, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GetServiceRequest[] newArray(int i) {
        return new GetServiceRequest[i];
    }

    public static void LIZ(GetServiceRequest getServiceRequest, Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 1, getServiceRequest.LJLIL);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 2, getServiceRequest.LJLILLLLZI);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 3, getServiceRequest.LJLJI);
        C79057V0z.LJJZZIII(parcel, 4, getServiceRequest.LJLJJI, false);
        C79057V0z.LJJLIIIJLJLI(parcel, 5, getServiceRequest.LJLJJL);
        C79057V0z.LJLIIIL(parcel, 6, getServiceRequest.LJLJJLL, i);
        C79057V0z.LJJLI(parcel, 7, getServiceRequest.zzg);
        C79057V0z.LJJZZI(parcel, 8, getServiceRequest.LJLJL, i, false);
        C79057V0z.LJLIIIL(parcel, 10, getServiceRequest.LJLJLJ, i);
        C79057V0z.LJLIIIL(parcel, 11, getServiceRequest.LJLJLLL, i);
        C79057V0z.LJJJZ(parcel, 12, getServiceRequest.LJLL);
        C79057V0z.LJJLIIIJLLLLLLLZ(parcel, 13, getServiceRequest.LJLLI);
        C79057V0z.LJJJZ(parcel, 14, getServiceRequest.LJLLILLLL);
        C79057V0z.LJJZZIII(parcel, 15, getServiceRequest.zzn, false);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
