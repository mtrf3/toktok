package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import java.util.ArrayList;

/* loaded from: classes29.dex */
public final class ZYP implements Parcelable.Creator<CastOptions> {
    @Override // android.os.Parcelable.Creator
    public final CastOptions createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        String str = null;
        ArrayList<String> arrayList = null;
        LaunchOptions launchOptions = null;
        CastMediaOptions castMediaOptions = null;
        double d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = C67315QbP.LJII(parcel, readInt);
                    break;
                case 3:
                    arrayList = C67315QbP.LJIIIZ(parcel, readInt);
                    break;
                case 4:
                    z = C67315QbP.LJIILIIL(parcel, readInt);
                    break;
                case 5:
                    launchOptions = (LaunchOptions) C67315QbP.LJI(parcel, readInt, LaunchOptions.CREATOR);
                    break;
                case 6:
                    z2 = C67315QbP.LJIILIIL(parcel, readInt);
                    break;
                case 7:
                    castMediaOptions = (CastMediaOptions) C67315QbP.LJI(parcel, readInt, CastMediaOptions.CREATOR);
                    break;
                case '\b':
                    z3 = C67315QbP.LJIILIIL(parcel, readInt);
                    break;
                case '\t':
                    d = C67315QbP.LJIILLIIL(parcel, readInt);
                    break;
                case '\n':
                    z4 = C67315QbP.LJIILIIL(parcel, readInt);
                    break;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    z5 = C67315QbP.LJIILIIL(parcel, readInt);
                    break;
                case '\f':
                    z6 = C67315QbP.LJIILIIL(parcel, readInt);
                    break;
                default:
                    C67315QbP.LJJII(parcel, readInt);
                    break;
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new CastOptions(str, arrayList, z, launchOptions, z2, castMediaOptions, z3, d, z4, z5, z6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CastOptions[] newArray(int i) {
        return new CastOptions[i];
    }
}
