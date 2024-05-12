package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.MethodInvocation;

/* renamed from: X.Qk2, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67850Qk2 implements Parcelable.Creator<MethodInvocation> {
    @Override // android.os.Parcelable.Creator
    public final MethodInvocation createFromParcel(Parcel parcel) {
        int LJJIII = C67315QbP.LJJIII(parcel);
        String str = null;
        long j = 0;
        long j2 = 0;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = -1;
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
                    j = C67315QbP.LJJ(parcel, readInt);
                    break;
                case 5:
                    j2 = C67315QbP.LJJ(parcel, readInt);
                    break;
                case 6:
                    str = C67315QbP.LJII(parcel, readInt);
                    break;
                case 7:
                    str2 = C67315QbP.LJII(parcel, readInt);
                    break;
                case '\b':
                    i4 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                case '\t':
                    i5 = C67315QbP.LJIJJLI(parcel, readInt);
                    break;
                default:
                    C67315QbP.LJJII(parcel, readInt);
                    break;
            }
        }
        C67315QbP.LJIIL(parcel, LJJIII);
        return new MethodInvocation(i, i2, i3, i4, i5, j, j2, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MethodInvocation[] newArray(int i) {
        return new MethodInvocation[i];
    }
}
