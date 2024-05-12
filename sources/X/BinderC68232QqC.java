package X;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzlo;
import com.google.android.gms.measurement.internal.zzq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: X.QqC, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class BinderC68232QqC extends AbstractBinderC68231QqB {
    public final C68241QqL LJLIL;
    public Boolean LJLILLLLZI;
    public String LJLJI;

    public BinderC68232QqC(C68241QqL c68241QqL) {
        QH7.LJIIIIZZ(c68241QqL);
        this.LJLIL = c68241QqL;
        this.LJLJI = null;
    }

    @Override // X.InterfaceC68041Qn7
    public final String LLJILLL(zzq zzqVar) {
        LLZZJLIL(zzqVar);
        C68241QqL c68241QqL = this.LJLIL;
        try {
            return (String) c68241QqL.LIZIZ().LJIIJJI(new CallableC68234QqE(c68241QqL, zzqVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            c68241QqL.LIZJ().LJFF.LIZJ(C67280Qaq.LJIIIZ(zzqVar.zza), e, "Failed to get app instance id. appId");
            return null;
        }
    }

    public final void LLJJIII(Runnable runnable) {
        if (this.LJLIL.LIZIZ().LJIILL()) {
            runnable.run();
        } else {
            this.LJLIL.LIZIZ().LJIILIIL(runnable);
        }
    }

    @Override // X.InterfaceC68041Qn7
    public final void LLLILZ(zzq zzqVar) {
        LLZZJLIL(zzqVar);
        LLJJIII(new RunnableC68288Qr6(this, zzqVar));
    }

    @Override // X.InterfaceC68041Qn7
    public final void LLLIZZ(zzq zzqVar) {
        QH7.LJI(zzqVar.zza);
        QH7.LJIIIIZZ(zzqVar.zzv);
        RunnableC68233QqD runnableC68233QqD = new RunnableC68233QqD(this, zzqVar);
        if (this.LJLIL.LIZIZ().LJIILL()) {
            runnableC68233QqD.run();
        } else {
            this.LJLIL.LIZIZ().LJIILJJIL(runnableC68233QqD);
        }
    }

    @Override // X.InterfaceC68041Qn7
    public final void LLLJL(zzq zzqVar) {
        QH7.LJI(zzqVar.zza);
        j(zzqVar.zza, false);
        LLJJIII(new RunnableC68287Qr5(this, zzqVar));
    }

    @Override // X.InterfaceC68041Qn7
    public final void LLLLJ(zzq zzqVar) {
        LLZZJLIL(zzqVar);
        LLJJIII(new RunnableC68235QqF(this, zzqVar));
    }

    public final void LLZZJLIL(zzq zzqVar) {
        QH7.LJIIIIZZ(zzqVar);
        QH7.LJI(zzqVar.zza);
        j(zzqVar.zza, false);
        this.LJLIL.LJJJI().LJJIJ(zzqVar.zzb, zzqVar.zzq);
    }

    @Override // X.InterfaceC68041Qn7
    public final void LJLJJLL(final Bundle bundle, zzq zzqVar) {
        LLZZJLIL(zzqVar);
        final String str = zzqVar.zza;
        QH7.LJIIIIZZ(str);
        LLJJIII(new Runnable() { // from class: X.QqZ
            public final void LIZ() {
                BinderC68232QqC binderC68232QqC = BinderC68232QqC.this;
                String str2 = str;
                Bundle bundle2 = bundle;
                C68242QqM c68242QqM = binderC68232QqC.LJLIL.LIZJ;
                C68241QqL.LJJIJIIJI(c68242QqM);
                c68242QqM.LJFF();
                c68242QqM.LJI();
                C68144Qom c68144Qom = new C68144Qom(c68242QqM.LIZ, "", str2, "dep", 0L, bundle2);
                C68243QqN c68243QqN = c68242QqM.LIZIZ.LJI;
                C68241QqL.LJJIJIIJI(c68243QqN);
                byte[] LJIIIIZZ = c68243QqN.LJJ(c68144Qom).LJIIIIZZ();
                c68242QqM.LIZ.LIZJ().LJIILIIL.LIZJ(c68242QqM.LIZ.LJIIL.LIZLLL(str2), Integer.valueOf(LJIIIIZZ.length), "Saving default event parameters, appId, data size");
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str2);
                contentValues.put("parameters", LJIIIIZZ);
                try {
                    if (c68242QqM.LJJI().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                        c68242QqM.LIZ.LIZJ().LJFF.LIZIZ(C67280Qaq.LJIIIZ(str2), "Failed to insert default event parameters (got -1). appId");
                    }
                } catch (SQLiteException e) {
                    c68242QqM.LIZ.LIZJ().LJFF.LIZJ(C67280Qaq.LJIIIZ(str2), e, "Error storing default event parameters. appId");
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ;
                try {
                    LIZ();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // X.InterfaceC68041Qn7
    public final void LLIILII(zzlo zzloVar, zzq zzqVar) {
        QH7.LJIIIIZZ(zzloVar);
        LLZZJLIL(zzqVar);
        LLJJIII(new RunnableC40649FxN(this, zzloVar, zzqVar));
    }

    public final void LLJI(zzaw zzawVar, zzq zzqVar) {
        this.LJLIL.LJFF();
        this.LJLIL.LJIIIIZZ(zzawVar, zzqVar);
    }

    @Override // X.InterfaceC68041Qn7
    public final byte[] V(zzaw zzawVar, String str) {
        QH7.LJI(str);
        QH7.LJIIIIZZ(zzawVar);
        j(str, true);
        this.LJLIL.LIZJ().LJIIL.LIZIZ(this.LJLIL.LJIIJJI.LJIIL.LIZLLL(zzawVar.zza), "Log and bundle. event");
        this.LJLIL.LIZLLL().getClass();
        long nanoTime = System.nanoTime() / 1000000;
        C67284Qau LIZIZ = this.LJLIL.LIZIZ();
        CallableC68237QqH callableC68237QqH = new CallableC68237QqH(this, zzawVar, str);
        LIZIZ.LJII();
        C67285Qav c67285Qav = new C67285Qav(LIZIZ, callableC68237QqH, true);
        if (C16880lQ.LLLLIIIILLL() == LIZIZ.LIZJ) {
            c67285Qav.run();
        } else {
            LIZIZ.LJIILLIIL(c67285Qav);
        }
        try {
            byte[] bArr = (byte[]) c67285Qav.get();
            if (bArr == null) {
                this.LJLIL.LIZJ().LJFF.LIZIZ(C67280Qaq.LJIIIZ(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            this.LJLIL.LIZLLL().getClass();
            this.LJLIL.LIZJ().LJIIL.LIZLLL(this.LJLIL.LJIIJJI.LJIIL.LIZLLL(zzawVar.zza), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - nanoTime), "Log and bundle processed. event, size, time_ms");
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.LJLIL.LIZJ().LJFF.LIZLLL(C67280Qaq.LJIIIZ(str), this.LJLIL.LJIIJJI.LJIIL.LIZLLL(zzawVar.zza), e, "Failed to log and bundle. appId, event, error");
            return null;
        }
    }

    public final void j(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    if (this.LJLILLLLZI == null) {
                        if (!"com.google.android.gms".equals(this.LJLJI) && !C67265Qab.LIZ(Binder.getCallingUid(), this.LJLIL.LJIIJJI.LIZ) && !C68435QtT.LIZ(this.LJLIL.LJIIJJI.LIZ).LIZIZ(Binder.getCallingUid())) {
                            z2 = false;
                            this.LJLILLLLZI = Boolean.valueOf(z2);
                        }
                        z2 = true;
                        this.LJLILLLLZI = Boolean.valueOf(z2);
                    }
                    if (this.LJLILLLLZI.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e) {
                    this.LJLIL.LIZJ().LJFF.LIZIZ(C67280Qaq.LJIIIZ(str), "Measurement Service called with invalid calling package. appId");
                    throw e;
                }
            }
            if (this.LJLJI == null && C67265Qab.LIZIZ(this.LJLIL.LJIIJJI.LIZ, Binder.getCallingUid(), str)) {
                this.LJLJI = str;
            }
            if (!str.equals(this.LJLJI)) {
                throw new SecurityException(C16880lQ.LLLZ("Unknown calling package name '%s'.", new Object[]{str}));
            }
            return;
        }
        this.LJLIL.LIZJ().LJFF.LIZ("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    @Override // X.InterfaceC68041Qn7
    public final void u0(zzac zzacVar, zzq zzqVar) {
        QH7.LJIIIIZZ(zzacVar);
        QH7.LJIIIIZZ(zzacVar.zzc);
        LLZZJLIL(zzqVar);
        zzac zzacVar2 = new zzac(zzacVar);
        zzacVar2.zza = zzqVar.zza;
        LLJJIII(new RunnableC68236QqG(this, zzacVar2, zzqVar));
    }

    @Override // X.InterfaceC68041Qn7
    public final void z(zzaw zzawVar, zzq zzqVar) {
        QH7.LJIIIIZZ(zzawVar);
        LLZZJLIL(zzqVar);
        LLJJIII(new RunnableC68239QqJ(this, zzawVar, zzqVar));
    }

    @Override // X.InterfaceC68041Qn7
    public final List LLJJJ(String str, String str2, zzq zzqVar) {
        LLZZJLIL(zzqVar);
        String str3 = zzqVar.zza;
        QH7.LJIIIIZZ(str3);
        try {
            return (List) this.LJLIL.LIZIZ().LJIIJJI(new CallableC68291Qr9(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.LJLIL.LIZJ().LJFF.LIZIZ(e, "Failed to get conditional user properties");
            return Collections.emptyList();
        }
    }

    @Override // X.InterfaceC68041Qn7
    public final List LLLLLJIL(String str, String str2, String str3) {
        j(str, true);
        try {
            return (List) this.LJLIL.LIZIZ().LJIIJJI(new CallableC68292QrA(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.LJLIL.LIZJ().LJFF.LIZIZ(e, "Failed to get conditional user properties as");
            return Collections.emptyList();
        }
    }

    @Override // X.InterfaceC68041Qn7
    public final void A(long j, String str, String str2, String str3) {
        LLJJIII(new RunnableC68098Qo2(this, str2, str3, str, j));
    }

    @Override // X.InterfaceC68041Qn7
    public final List E(String str, String str2, boolean z, zzq zzqVar) {
        LLZZJLIL(zzqVar);
        String str3 = zzqVar.zza;
        QH7.LJIIIIZZ(str3);
        try {
            List<C68135Qod> list = (List) this.LJLIL.LIZIZ().LJIIJJI(new CallableC68289Qr7(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C68135Qod c68135Qod : list) {
                if (z || !C68083Qnn.LJJJJ(c68135Qod.LIZJ)) {
                    arrayList.add(new zzlo(c68135Qod));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.LJLIL.LIZJ().LJFF.LIZJ(C67280Qaq.LJIIIZ(zzqVar.zza), e, "Failed to query user properties. appId");
            return Collections.emptyList();
        }
    }

    @Override // X.InterfaceC68041Qn7
    public final List R(String str, String str2, String str3, boolean z) {
        j(str, true);
        try {
            List<C68135Qod> list = (List) this.LJLIL.LIZIZ().LJIIJJI(new CallableC68290Qr8(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C68135Qod c68135Qod : list) {
                if (z || !C68083Qnn.LJJJJ(c68135Qod.LIZJ)) {
                    arrayList.add(new zzlo(c68135Qod));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.LJLIL.LIZJ().LJFF.LIZJ(C67280Qaq.LJIIIZ(str), e, "Failed to get user properties as. appId");
            return Collections.emptyList();
        }
    }
}
