package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: X.FwR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40591FwR extends C40592FwS implements InterfaceC40594FwU {
    public C40591FwR(IBinder iBinder) {
        super(iBinder);
    }

    @Override // X.InterfaceC40594FwU
    public final int LJJIIZ(String str, String str2) {
        Parcel LJLJI = C40592FwS.LJLJI();
        LJLJI.writeInt(3);
        LJLJI.writeString(str);
        LJLJI.writeString(str2);
        Parcel LLJI = LLJI(LJLJI, 5);
        int readInt = LLJI.readInt();
        LLJI.recycle();
        return readInt;
    }

    @Override // X.InterfaceC40594FwU
    public final int LJJLIIJ(int i, String str, String str2) {
        Parcel LJLJI = C40592FwS.LJLJI();
        LJLJI.writeInt(i);
        LJLJI.writeString(str);
        LJLJI.writeString(str2);
        Parcel LLJI = LLJI(LJLJI, 1);
        int readInt = LLJI.readInt();
        LLJI.recycle();
        return readInt;
    }

    @Override // X.InterfaceC40594FwU
    public final Bundle LLZZLLIL(String str, String str2, String str3) {
        Parcel LJLJI = C40592FwS.LJLJI();
        LJLJI.writeInt(3);
        LJLJI.writeString(str);
        LJLJI.writeString(str2);
        LJLJI.writeString(str3);
        Parcel LLJI = LLJI(LJLJI, 4);
        Bundle bundle = (Bundle) ESJ.LIZ(LLJI, Bundle.CREATOR);
        LLJI.recycle();
        return bundle;
    }

    @Override // X.InterfaceC40594FwU
    public final Bundle M(String str, String str2, Bundle bundle) {
        Parcel LJLJI = C40592FwS.LJLJI();
        LJLJI.writeInt(9);
        LJLJI.writeString(str);
        LJLJI.writeString(str2);
        LJLJI.writeInt(1);
        bundle.writeToParcel(LJLJI, 0);
        Parcel LLJI = LLJI(LJLJI, 12);
        Bundle bundle2 = (Bundle) ESJ.LIZ(LLJI, Bundle.CREATOR);
        LLJI.recycle();
        return bundle2;
    }

    @Override // X.InterfaceC40594FwU
    public final Bundle W(String str, String str2, Bundle bundle) {
        Parcel LJLJI = C40592FwS.LJLJI();
        LJLJI.writeInt(3);
        LJLJI.writeString(str);
        LJLJI.writeString(str2);
        LJLJI.writeInt(1);
        bundle.writeToParcel(LJLJI, 0);
        Parcel LLJI = LLJI(LJLJI, 2);
        Bundle bundle2 = (Bundle) ESJ.LIZ(LLJI, Bundle.CREATOR);
        LLJI.recycle();
        return bundle2;
    }

    @Override // X.InterfaceC40594FwU
    public final Bundle l(String str, String str2, String str3) {
        Parcel LJLJI = C40592FwS.LJLJI();
        LJLJI.writeInt(3);
        LJLJI.writeString(str);
        LJLJI.writeString(str2);
        LJLJI.writeString(str3);
        LJLJI.writeString(null);
        Parcel LLJI = LLJI(LJLJI, 3);
        Bundle bundle = (Bundle) ESJ.LIZ(LLJI, Bundle.CREATOR);
        LLJI.recycle();
        return bundle;
    }

    @Override // X.InterfaceC40594FwU
    public final Bundle u(String str, String str2, Bundle bundle) {
        Parcel LJLJI = C40592FwS.LJLJI();
        LJLJI.writeInt(9);
        LJLJI.writeString(str);
        LJLJI.writeString(str2);
        LJLJI.writeInt(1);
        bundle.writeToParcel(LJLJI, 0);
        Parcel LLJI = LLJI(LJLJI, 902);
        Bundle bundle2 = (Bundle) ESJ.LIZ(LLJI, Bundle.CREATOR);
        LLJI.recycle();
        return bundle2;
    }

    @Override // X.InterfaceC40594FwU
    public final int LLIFFJFJJ(int i, String str, String str2, Bundle bundle) {
        Parcel LJLJI = C40592FwS.LJLJI();
        LJLJI.writeInt(i);
        LJLJI.writeString(str);
        LJLJI.writeString(str2);
        LJLJI.writeInt(1);
        bundle.writeToParcel(LJLJI, 0);
        Parcel LLJI = LLJI(LJLJI, 10);
        int readInt = LLJI.readInt();
        LLJI.recycle();
        return readInt;
    }

    @Override // X.InterfaceC40594FwU
    public final Bundle k0(Bundle bundle, String str, String str2, String str3) {
        Parcel LJLJI = C40592FwS.LJLJI();
        LJLJI.writeInt(9);
        LJLJI.writeString(str);
        LJLJI.writeString(str2);
        LJLJI.writeString(str3);
        LJLJI.writeInt(1);
        bundle.writeToParcel(LJLJI, 0);
        Parcel LLJI = LLJI(LJLJI, 11);
        Bundle bundle2 = (Bundle) ESJ.LIZ(LLJI, Bundle.CREATOR);
        LLJI.recycle();
        return bundle2;
    }

    @Override // X.InterfaceC40594FwU
    public final Bundle LLLLIL(int i, String str, String str2, String str3, Bundle bundle) {
        Parcel LJLJI = C40592FwS.LJLJI();
        LJLJI.writeInt(i);
        LJLJI.writeString(str);
        LJLJI.writeString(str2);
        LJLJI.writeString(str3);
        LJLJI.writeString(null);
        LJLJI.writeInt(1);
        bundle.writeToParcel(LJLJI, 0);
        Parcel LLJI = LLJI(LJLJI, 8);
        Bundle bundle2 = (Bundle) ESJ.LIZ(LLJI, Bundle.CREATOR);
        LLJI.recycle();
        return bundle2;
    }

    @Override // X.InterfaceC40594FwU
    public final Bundle LLLLJI(int i, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel LJLJI = C40592FwS.LJLJI();
        LJLJI.writeInt(i);
        LJLJI.writeString(str);
        LJLJI.writeString(str2);
        LJLJI.writeInt(1);
        bundle.writeToParcel(LJLJI, 0);
        LJLJI.writeInt(1);
        bundle2.writeToParcel(LJLJI, 0);
        Parcel LLJI = LLJI(LJLJI, 901);
        Bundle bundle3 = (Bundle) ESJ.LIZ(LLJI, Bundle.CREATOR);
        LLJI.recycle();
        return bundle3;
    }
}
