package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.internal.zzy;
import com.google.android.gms.cast.zzar;

/* renamed from: X.Zf7, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90477Zf7 implements Parcelable.Creator<zzy> {
    @Override // android.os.Parcelable.Creator
    public final zzy createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        ApplicationMetadata applicationMetadata = null;
        double d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        double d2 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        zzar zzarVar = null;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < LJJIII) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    d = C67315QbP.LJIILLIIL(parcel, readInt);
                    break;
                case 3:
                    z = C67315QbP.LJIILIIL(parcel, readInt);
                    break;
                case 4:
                    i = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case 5:
                    applicationMetadata = (ApplicationMetadata) C67315QbP.LJI(parcel, readInt, ApplicationMetadata.CREATOR);
                    break;
                case 6:
                    i2 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case 7:
                    zzarVar = (zzar) C67315QbP.LJI(parcel, readInt, zzar.CREATOR);
                    break;
                case '\b':
                    d2 = C67315QbP.LJIILLIIL(parcel, readInt);
                    break;
                default:
                    C67315QbP.LJJII(parcel, readInt);
                    break;
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new zzy(d, z, i, applicationMetadata, i2, zzarVar, d2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzy[] newArray(int i) {
        return new zzy[i];
    }
}
