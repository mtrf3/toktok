package X;

import android.os.Parcel;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.internal.zza;
import com.google.android.gms.cast.internal.zzy;

/* renamed from: X.Zkg, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public abstract class AbstractBinderC90822Zkg extends BinderC90358ZdC implements InterfaceC90473Zf3 {
    public AbstractBinderC90822Zkg() {
        super("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
    }

    @Override // X.BinderC90358ZdC
    public final boolean LJLJI(int i, Parcel parcel, Parcel parcel2) {
        boolean z = false;
        switch (i) {
            case 1:
                LJJIIJ(parcel.readInt());
                return true;
            case 2:
                ApplicationMetadata applicationMetadata = (ApplicationMetadata) C90257ZbZ.LIZ(parcel, ApplicationMetadata.CREATOR);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = true;
                }
                i0(applicationMetadata, readString, readString2, z);
                return true;
            case 3:
                LJIJJLI(parcel.readInt());
                return true;
            case 4:
                parcel.readString();
                parcel.readDouble();
                parcel.readInt();
                LLZLI();
                return true;
            case 5:
                LLJJIJIL(parcel.readString(), parcel.readString());
                return true;
            case 6:
                parcel.readString();
                C(parcel.createByteArray());
                return true;
            case 7:
                LJIJJ(parcel.readInt());
                return true;
            case 8:
                LJIILL(parcel.readInt());
                return true;
            case 9:
                LJIJI(parcel.readInt());
                return true;
            case 10:
                parcel.readString();
                n(parcel.readInt(), parcel.readLong());
                return true;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                parcel.readString();
                LJLLI(parcel.readLong());
                return true;
            case 12:
                m0((zza) C90257ZbZ.LIZ(parcel, zza.CREATOR));
                return true;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                LLILLJJLI((zzy) C90257ZbZ.LIZ(parcel, zzy.CREATOR));
                return true;
            case 14:
                LJLIIIL(parcel.readInt());
                return true;
            case 15:
                LLFZ(parcel.readInt());
                return true;
            default:
                return false;
        }
    }
}
