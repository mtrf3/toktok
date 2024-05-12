package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzlo;
import com.google.android.gms.measurement.internal.zzq;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Qpq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68210Qpq extends C68224Qq4 implements InterfaceC68041Qn7 {
    public C68210Qpq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // X.InterfaceC68041Qn7
    public final String LLJILLL(zzq zzqVar) {
        Parcel LJLJI = LJLJI();
        C68209Qpp.LIZJ(LJLJI, zzqVar);
        Parcel LLJI = LLJI(LJLJI, 11);
        String readString = LLJI.readString();
        LLJI.recycle();
        return readString;
    }

    @Override // X.InterfaceC68041Qn7
    public final void LLLILZ(zzq zzqVar) {
        Parcel LJLJI = LJLJI();
        C68209Qpp.LIZJ(LJLJI, zzqVar);
        LLJJIII(LJLJI, 4);
    }

    @Override // X.InterfaceC68041Qn7
    public final void LLLIZZ(zzq zzqVar) {
        Parcel LJLJI = LJLJI();
        C68209Qpp.LIZJ(LJLJI, zzqVar);
        LLJJIII(LJLJI, 20);
    }

    @Override // X.InterfaceC68041Qn7
    public final void LLLJL(zzq zzqVar) {
        Parcel LJLJI = LJLJI();
        C68209Qpp.LIZJ(LJLJI, zzqVar);
        LLJJIII(LJLJI, 18);
    }

    @Override // X.InterfaceC68041Qn7
    public final void LLLLJ(zzq zzqVar) {
        Parcel LJLJI = LJLJI();
        C68209Qpp.LIZJ(LJLJI, zzqVar);
        LLJJIII(LJLJI, 6);
    }

    @Override // X.InterfaceC68041Qn7
    public final void LJLJJLL(Bundle bundle, zzq zzqVar) {
        Parcel LJLJI = LJLJI();
        C68209Qpp.LIZJ(LJLJI, bundle);
        C68209Qpp.LIZJ(LJLJI, zzqVar);
        LLJJIII(LJLJI, 19);
    }

    @Override // X.InterfaceC68041Qn7
    public final void LLIILII(zzlo zzloVar, zzq zzqVar) {
        Parcel LJLJI = LJLJI();
        C68209Qpp.LIZJ(LJLJI, zzloVar);
        C68209Qpp.LIZJ(LJLJI, zzqVar);
        LLJJIII(LJLJI, 2);
    }

    @Override // X.InterfaceC68041Qn7
    public final byte[] V(zzaw zzawVar, String str) {
        Parcel LJLJI = LJLJI();
        C68209Qpp.LIZJ(LJLJI, zzawVar);
        LJLJI.writeString(str);
        Parcel LLJI = LLJI(LJLJI, 9);
        byte[] createByteArray = LLJI.createByteArray();
        LLJI.recycle();
        return createByteArray;
    }

    @Override // X.InterfaceC68041Qn7
    public final void u0(zzac zzacVar, zzq zzqVar) {
        Parcel LJLJI = LJLJI();
        C68209Qpp.LIZJ(LJLJI, zzacVar);
        C68209Qpp.LIZJ(LJLJI, zzqVar);
        LLJJIII(LJLJI, 12);
    }

    @Override // X.InterfaceC68041Qn7
    public final void z(zzaw zzawVar, zzq zzqVar) {
        Parcel LJLJI = LJLJI();
        C68209Qpp.LIZJ(LJLJI, zzawVar);
        C68209Qpp.LIZJ(LJLJI, zzqVar);
        LLJJIII(LJLJI, 1);
    }

    @Override // X.InterfaceC68041Qn7
    public final List LLJJJ(String str, String str2, zzq zzqVar) {
        Parcel LJLJI = LJLJI();
        LJLJI.writeString(str);
        LJLJI.writeString(str2);
        C68209Qpp.LIZJ(LJLJI, zzqVar);
        Parcel LLJI = LLJI(LJLJI, 16);
        ArrayList createTypedArrayList = LLJI.createTypedArrayList(zzac.CREATOR);
        LLJI.recycle();
        return createTypedArrayList;
    }

    @Override // X.InterfaceC68041Qn7
    public final List LLLLLJIL(String str, String str2, String str3) {
        Parcel LJLJI = LJLJI();
        LJLJI.writeString(null);
        LJLJI.writeString(str2);
        LJLJI.writeString(str3);
        Parcel LLJI = LLJI(LJLJI, 17);
        ArrayList createTypedArrayList = LLJI.createTypedArrayList(zzac.CREATOR);
        LLJI.recycle();
        return createTypedArrayList;
    }

    @Override // X.InterfaceC68041Qn7
    public final void A(long j, String str, String str2, String str3) {
        Parcel LJLJI = LJLJI();
        LJLJI.writeLong(j);
        LJLJI.writeString(str);
        LJLJI.writeString(str2);
        LJLJI.writeString(str3);
        LLJJIII(LJLJI, 10);
    }

    @Override // X.InterfaceC68041Qn7
    public final List E(String str, String str2, boolean z, zzq zzqVar) {
        Parcel LJLJI = LJLJI();
        LJLJI.writeString(str);
        LJLJI.writeString(str2);
        LJLJI.writeInt(z ? 1 : 0);
        C68209Qpp.LIZJ(LJLJI, zzqVar);
        Parcel LLJI = LLJI(LJLJI, 14);
        ArrayList createTypedArrayList = LLJI.createTypedArrayList(zzlo.CREATOR);
        LLJI.recycle();
        return createTypedArrayList;
    }

    @Override // X.InterfaceC68041Qn7
    public final List R(String str, String str2, String str3, boolean z) {
        Parcel LJLJI = LJLJI();
        LJLJI.writeString(null);
        LJLJI.writeString(str2);
        LJLJI.writeString(str3);
        LJLJI.writeInt(z ? 1 : 0);
        Parcel LLJI = LLJI(LJLJI, 15);
        ArrayList createTypedArrayList = LLJI.createTypedArrayList(zzlo.CREATOR);
        LLJI.recycle();
        return createTypedArrayList;
    }
}
