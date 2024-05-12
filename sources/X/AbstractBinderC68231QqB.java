package X;

import android.os.Bundle;
import android.os.Parcel;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzlo;
import com.google.android.gms.measurement.internal.zzq;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: X.QqB, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractBinderC68231QqB extends BinderC68226Qq6 implements InterfaceC68041Qn7 {
    public AbstractBinderC68231QqB() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // X.BinderC68226Qq6
    public final boolean LJLJI(int i, Parcel parcel, Parcel parcel2) {
        ArrayList arrayList;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        switch (i) {
            case 1:
                zzaw zzawVar = (zzaw) C68209Qpp.LIZ(parcel, zzaw.CREATOR);
                zzq zzqVar = (zzq) C68209Qpp.LIZ(parcel, zzq.CREATOR);
                C68209Qpp.LIZIZ(parcel);
                ((BinderC68232QqC) this).z(zzawVar, zzqVar);
                parcel2.writeNoException();
                return true;
            case 2:
                zzlo zzloVar = (zzlo) C68209Qpp.LIZ(parcel, zzlo.CREATOR);
                zzq zzqVar2 = (zzq) C68209Qpp.LIZ(parcel, zzq.CREATOR);
                C68209Qpp.LIZIZ(parcel);
                ((BinderC68232QqC) this).LLIILII(zzloVar, zzqVar2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            default:
                return false;
            case 4:
                zzq zzqVar3 = (zzq) C68209Qpp.LIZ(parcel, zzq.CREATOR);
                C68209Qpp.LIZIZ(parcel);
                ((BinderC68232QqC) this).LLLILZ(zzqVar3);
                parcel2.writeNoException();
                return true;
            case 5:
                zzaw zzawVar2 = (zzaw) C68209Qpp.LIZ(parcel, zzaw.CREATOR);
                String readString = parcel.readString();
                parcel.readString();
                C68209Qpp.LIZIZ(parcel);
                BinderC68232QqC binderC68232QqC = (BinderC68232QqC) this;
                QH7.LJIIIIZZ(zzawVar2);
                QH7.LJI(readString);
                binderC68232QqC.j(readString, true);
                binderC68232QqC.LLJJIII(new RunnableC68189QpV(binderC68232QqC, zzawVar2, readString));
                parcel2.writeNoException();
                return true;
            case 6:
                zzq zzqVar4 = (zzq) C68209Qpp.LIZ(parcel, zzq.CREATOR);
                C68209Qpp.LIZIZ(parcel);
                ((BinderC68232QqC) this).LLLLJ(zzqVar4);
                parcel2.writeNoException();
                return true;
            case 7:
                zzq zzqVar5 = (zzq) C68209Qpp.LIZ(parcel, zzq.CREATOR);
                if (parcel.readInt() != 0) {
                    i2 = 1;
                }
                C68209Qpp.LIZIZ(parcel);
                BinderC68232QqC binderC68232QqC2 = (BinderC68232QqC) this;
                binderC68232QqC2.LLZZJLIL(zzqVar5);
                String str = zzqVar5.zza;
                QH7.LJIIIIZZ(str);
                try {
                    List<C68135Qod> list = (List) binderC68232QqC2.LJLIL.LIZIZ().LJIIJJI(new CallableC68293QrB(binderC68232QqC2, str)).get();
                    arrayList = new ArrayList(list.size());
                    for (C68135Qod c68135Qod : list) {
                        if (i2 != 0 || !C68083Qnn.LJJJJ(c68135Qod.LIZJ)) {
                            arrayList.add(new zzlo(c68135Qod));
                        }
                    }
                } catch (InterruptedException | ExecutionException e) {
                    binderC68232QqC2.LJLIL.LIZJ().LJFF.LIZJ(C67280Qaq.LJIIIZ(zzqVar5.zza), e, "Failed to get user properties. appId");
                    arrayList = null;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case 9:
                zzaw zzawVar3 = (zzaw) C68209Qpp.LIZ(parcel, zzaw.CREATOR);
                String readString2 = parcel.readString();
                C68209Qpp.LIZIZ(parcel);
                byte[] V = ((BinderC68232QqC) this).V(zzawVar3, readString2);
                parcel2.writeNoException();
                parcel2.writeByteArray(V);
                return true;
            case 10:
                long readLong = parcel.readLong();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                C68209Qpp.LIZIZ(parcel);
                ((BinderC68232QqC) this).A(readLong, readString3, readString4, readString5);
                parcel2.writeNoException();
                return true;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                zzq zzqVar6 = (zzq) C68209Qpp.LIZ(parcel, zzq.CREATOR);
                C68209Qpp.LIZIZ(parcel);
                String LLJILLL = ((BinderC68232QqC) this).LLJILLL(zzqVar6);
                parcel2.writeNoException();
                parcel2.writeString(LLJILLL);
                return true;
            case 12:
                zzac zzacVar = (zzac) C68209Qpp.LIZ(parcel, zzac.CREATOR);
                zzq zzqVar7 = (zzq) C68209Qpp.LIZ(parcel, zzq.CREATOR);
                C68209Qpp.LIZIZ(parcel);
                ((BinderC68232QqC) this).u0(zzacVar, zzqVar7);
                parcel2.writeNoException();
                return true;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                zzac zzacVar2 = (zzac) C68209Qpp.LIZ(parcel, zzac.CREATOR);
                C68209Qpp.LIZIZ(parcel);
                BinderC68232QqC binderC68232QqC3 = (BinderC68232QqC) this;
                QH7.LJIIIIZZ(zzacVar2);
                QH7.LJIIIIZZ(zzacVar2.zzc);
                QH7.LJI(zzacVar2.zza);
                binderC68232QqC3.j(zzacVar2.zza, true);
                binderC68232QqC3.LLJJIII(new RunnableC68238QqI(i2, binderC68232QqC3, new zzac(zzacVar2)));
                parcel2.writeNoException();
                return true;
            case 14:
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                zzq zzqVar8 = (zzq) C68209Qpp.LIZ(parcel, zzq.CREATOR);
                C68209Qpp.LIZIZ(parcel);
                List E = ((BinderC68232QqC) this).E(readString6, readString7, z2, zzqVar8);
                parcel2.writeNoException();
                parcel2.writeTypedList(E);
                return true;
            case 15:
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = true;
                }
                C68209Qpp.LIZIZ(parcel);
                List R = ((BinderC68232QqC) this).R(readString8, readString9, readString10, z);
                parcel2.writeNoException();
                parcel2.writeTypedList(R);
                return true;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                zzq zzqVar9 = (zzq) C68209Qpp.LIZ(parcel, zzq.CREATOR);
                C68209Qpp.LIZIZ(parcel);
                List LLJJJ = ((BinderC68232QqC) this).LLJJJ(readString11, readString12, zzqVar9);
                parcel2.writeNoException();
                parcel2.writeTypedList(LLJJJ);
                return true;
            case 17:
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                C68209Qpp.LIZIZ(parcel);
                List LLLLLJIL = ((BinderC68232QqC) this).LLLLLJIL(readString13, readString14, readString15);
                parcel2.writeNoException();
                parcel2.writeTypedList(LLLLLJIL);
                return true;
            case 18:
                zzq zzqVar10 = (zzq) C68209Qpp.LIZ(parcel, zzq.CREATOR);
                C68209Qpp.LIZIZ(parcel);
                ((BinderC68232QqC) this).LLLJL(zzqVar10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) C68209Qpp.LIZ(parcel, Bundle.CREATOR);
                zzq zzqVar11 = (zzq) C68209Qpp.LIZ(parcel, zzq.CREATOR);
                C68209Qpp.LIZIZ(parcel);
                ((BinderC68232QqC) this).LJLJJLL(bundle, zzqVar11);
                parcel2.writeNoException();
                return true;
            case 20:
                zzq zzqVar12 = (zzq) C68209Qpp.LIZ(parcel, zzq.CREATOR);
                C68209Qpp.LIZIZ(parcel);
                ((BinderC68232QqC) this).LLLIZZ(zzqVar12);
                parcel2.writeNoException();
                return true;
        }
    }
}
