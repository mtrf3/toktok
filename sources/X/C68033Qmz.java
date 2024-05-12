package X;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzcl;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Qmz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68033Qmz implements InterfaceC68124QoS {
    public static volatile C68033Qmz LJJIJIIJI;
    public final Context LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final C17J LJFF;
    public final C68034Qn0 LJI;
    public final C67274Qak LJII;
    public final C67280Qaq LJIIIIZZ;
    public final C67284Qau LJIIIZ;
    public final C68110QoE LJIIJ;
    public final C68083Qnn LJIIJJI;
    public final C68095Qnz LJIIL;
    public final C67688QhQ LJIILIIL;
    public final C68084Qno LJIILJJIL;
    public final C68082Qnm LJIILL;
    public final C68089Qnt LJIILLIIL;
    public final C67277Qan LJIIZILJ;
    public final String LJIJ;
    public C67546Qf8 LJIJI;
    public C68022Qmo LJIJJ;
    public C67287Qax LJIJJLI;
    public C68031Qmx LJIL;
    public boolean LJJ;
    public Boolean LJJI;
    public long LJJIFFI;
    public volatile Boolean LJJII;
    public final Boolean LJJIII;
    public final Boolean LJJIIJ;
    public volatile boolean LJJIIJZLJL;
    public int LJJIIZ;
    public final AtomicInteger LJJIIZI = new AtomicInteger(0);
    public final long LJJIJ;

    public static List LJFF(PackageManager packageManager, Intent intent) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(101311, "android/content/pm/PackageManager", "queryIntentActivities", packageManager, new Object[]{intent, 0}, "java.util.List", new C65300Pk0(false, "(Landroid/content/Intent;I)Ljava/util/List;", "-8261907262454631751"));
        return LIZJ.LIZ ? (List) LIZJ.LIZIZ : packageManager.queryIntentActivities(intent, 0);
    }

    @Override // X.InterfaceC68124QoS
    public final Context LIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC68124QoS
    public final InterfaceC67689QhR LIZLLL() {
        return this.LJIILIIL;
    }

    @Override // X.InterfaceC68124QoS
    public final C17J LJ() {
        return this.LJFF;
    }

    @Override // X.InterfaceC68124QoS
    public final C67284Qau LIZIZ() {
        LJIIJ(this.LJIIIZ);
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC68124QoS
    public final C67280Qaq LIZJ() {
        LJIIJ(this.LJIIIIZZ);
        return this.LJIIIIZZ;
    }

    public final void LJI() {
        this.LJJIIZI.incrementAndGet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        if (java.lang.Math.abs(android.os.SystemClock.elapsedRealtime() - r6.LJJIFFI) > 1000) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b0, code lost:
    
        if (android.text.TextUtils.isEmpty(r0.LJIIL) == false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIIIZZ() {
        /*
            r6 = this;
            boolean r0 = r6.LJJ
            if (r0 == 0) goto Lc2
            X.Qau r0 = r6.LIZIZ()
            r0.LJFF()
            java.lang.Boolean r5 = r6.LJJI
            if (r5 == 0) goto L33
            long r3 = r6.LJJIFFI
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L33
            boolean r0 = r5.booleanValue()
            if (r0 != 0) goto Lb9
            X.QhQ r0 = r6.LJIILIIL
            r0.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r0 = r6.LJJIFFI
            long r2 = r2 - r0
            long r3 = java.lang.Math.abs(r2)
            r1 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto Lb9
        L33:
            X.QhQ r0 = r6.LJIILIIL
            r0.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            r6.LJJIFFI = r0
            X.Qnn r1 = r6.LJIL()
            java.lang.String r0 = "android.permission.INTERNET"
            boolean r0 = r1.LJJJ(r0)
            r3 = 0
            if (r0 == 0) goto Lc0
            X.Qnn r1 = r6.LJIL()
            java.lang.String r0 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r0 = r1.LJJJ(r0)
            if (r0 == 0) goto Lc0
            android.content.Context r0 = r6.LIZ
            X.QXq r0 = X.QCX.LIZ(r0)
            boolean r0 = r0.LIZJ()
            if (r0 != 0) goto L7b
            X.Qn0 r0 = r6.LJI
            boolean r0 = r0.LJIJ()
            if (r0 != 0) goto L7b
            android.content.Context r0 = r6.LIZ
            boolean r0 = X.C68083Qnn.LJJJJIZL(r0)
            if (r0 == 0) goto Lc0
            android.content.Context r0 = r6.LIZ
            boolean r0 = X.C68083Qnn.LJJJJJ(r0)
            if (r0 == 0) goto Lc0
        L7b:
            r0 = 1
        L7c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.LJJI = r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lb9
            X.Qnn r2 = r6.LJIL()
            X.Qmx r0 = r6.LJIILJJIL()
            java.lang.String r1 = r0.LJIIJJI()
            X.Qmx r0 = r6.LJIILJJIL()
            r0.LJI()
            java.lang.String r0 = r0.LJIIL
            boolean r0 = r2.LJJIJ(r1, r0)
            if (r0 != 0) goto Lb2
            X.Qmx r0 = r6.LJIILJJIL()
            r0.LJI()
            java.lang.String r0 = r0.LJIIL
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb3
        Lb2:
            r3 = 1
        Lb3:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r6.LJJI = r0
        Lb9:
            java.lang.Boolean r0 = r6.LJJI
            boolean r0 = r0.booleanValue()
            return r0
        Lc0:
            r0 = 0
            goto L7c
        Lc2:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "AppMeasurement is not initialized"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68033Qmz.LJIIIIZZ():boolean");
    }

    public final C68089Qnt LJIIL() {
        C68089Qnt c68089Qnt = this.LJIILLIIL;
        if (c68089Qnt != null) {
            return c68089Qnt;
        }
        throw new IllegalStateException("Component not created");
    }

    public final C67287Qax LJIILIIL() {
        LJIIJ(this.LJIJJLI);
        return this.LJIJJLI;
    }

    public final C68031Qmx LJIILJJIL() {
        LJIIIZ(this.LJIL);
        return this.LJIL;
    }

    public final C67546Qf8 LJIILL() {
        LJIIIZ(this.LJIJI);
        return this.LJIJI;
    }

    public final C67274Qak LJIILLIIL() {
        C67274Qak c67274Qak = this.LJII;
        if (c67274Qak != null) {
            return c67274Qak;
        }
        throw new IllegalStateException("Component not created");
    }

    public final C68082Qnm LJIJ() {
        LJIIIZ(this.LJIILL);
        return this.LJIILL;
    }

    public final C68084Qno LJIJI() {
        LJIIIZ(this.LJIILJJIL);
        return this.LJIILJJIL;
    }

    public final C68022Qmo LJIJJ() {
        LJIIIZ(this.LJIJJ);
        return this.LJIJJ;
    }

    public final C68110QoE LJIJJLI() {
        LJIIIZ(this.LJIIJ);
        return this.LJIIJ;
    }

    public final C68083Qnn LJIL() {
        C68083Qnn c68083Qnn = this.LJIIJJI;
        if (c68083Qnn != null) {
            return c68083Qnn;
        }
        throw new IllegalStateException("Component not created");
    }

    public final boolean LJII() {
        if (LJIIJJI() == 0) {
            return true;
        }
        return false;
    }

    public final int LJIIJJI() {
        LIZIZ().LJFF();
        if (this.LJI.LJIILLIIL()) {
            return 1;
        }
        Boolean bool = this.LJJIIJ;
        if (bool == null || !bool.booleanValue()) {
            LIZIZ().LJFF();
            if (!this.LJJIIJZLJL) {
                return 8;
            }
            Boolean LJIILIIL = LJIILLIIL().LJIILIIL();
            if (LJIILIIL != null) {
                if (LJIILIIL.booleanValue()) {
                    return 0;
                }
                return 3;
            }
            Boolean LJIILIIL2 = this.LJI.LJIILIIL("firebase_analytics_collection_enabled");
            if (LJIILIIL2 != null) {
                if (LJIILIIL2.booleanValue()) {
                    return 0;
                }
                return 4;
            }
            Boolean bool2 = this.LJJIII;
            if (bool2 != null) {
                if (bool2.booleanValue()) {
                    return 0;
                }
                return 5;
            }
            if (this.LJJII == null || this.LJJII.booleanValue()) {
                return 0;
            }
            return 7;
        }
        return 2;
    }

    public C68033Qmz(C68037Qn3 c68037Qn3) {
        long currentTimeMillis;
        Bundle bundle;
        Context context = c68037Qn3.LIZ;
        C17J c17j = new C17J(0);
        this.LJFF = c17j;
        C63081OpJ.LJLJJLL = c17j;
        this.LIZ = context;
        this.LIZIZ = c68037Qn3.LIZIZ;
        this.LIZJ = c68037Qn3.LIZJ;
        this.LIZLLL = c68037Qn3.LIZLLL;
        this.LJ = c68037Qn3.LJII;
        this.LJJII = c68037Qn3.LJ;
        this.LJIJ = c68037Qn3.LJIIIZ;
        this.LJJIIJZLJL = true;
        zzcl zzclVar = c68037Qn3.LJI;
        if (zzclVar != null && (bundle = zzclVar.zzg) != null) {
            Object LLJJIII = C16880lQ.LLJJIII(bundle, "measurementEnabled");
            if (LLJJIII instanceof Boolean) {
                this.LJJIII = (Boolean) LLJJIII;
            }
            Object LLJJIII2 = C16880lQ.LLJJIII(zzclVar.zzg, "measurementDeactivated");
            if (LLJJIII2 instanceof Boolean) {
                this.LJJIIJ = (Boolean) LLJJIII2;
            }
        }
        if (AbstractC68056QnM.LJI == null) {
            Object obj = AbstractC68056QnM.LJFF;
            synchronized (obj) {
                if (AbstractC68056QnM.LJI == null) {
                    synchronized (obj) {
                        C68060QnQ c68060QnQ = AbstractC68056QnM.LJI;
                        Context LLLLL = C16880lQ.LLLLL(context);
                        if (LLLLL == null) {
                            LLLLL = context;
                        }
                        if (c68060QnQ == null || c68060QnQ.LIZ != LLLLL) {
                            QC6.LIZLLL();
                            QC8.LIZJ();
                            C68055QnL.LIZJ();
                            AbstractC68056QnM.LJI = new C68060QnQ(LLLLL, C62814Ol0.LJJIL(new C39670Fha(LLLLL)));
                            AbstractC68056QnM.LJII.incrementAndGet();
                        }
                    }
                }
            }
        }
        this.LJIILIIL = C67688QhQ.LIZ;
        Long l = c68037Qn3.LJIIIIZZ;
        if (l != null) {
            currentTimeMillis = l.longValue();
        } else {
            currentTimeMillis = System.currentTimeMillis();
        }
        this.LJJIJ = currentTimeMillis;
        this.LJI = new C68034Qn0(this);
        C67274Qak c67274Qak = new C67274Qak(this);
        c67274Qak.LJIIIIZZ();
        this.LJII = c67274Qak;
        C67280Qaq c67280Qaq = new C67280Qaq(this);
        c67280Qaq.LJIIIIZZ();
        this.LJIIIIZZ = c67280Qaq;
        C68083Qnn c68083Qnn = new C68083Qnn(this);
        c68083Qnn.LJIIIIZZ();
        this.LJIIJJI = c68083Qnn;
        this.LJIIL = new C68095Qnz(new C48326Ixu(this));
        this.LJIILLIIL = new C68089Qnt(this);
        C68084Qno c68084Qno = new C68084Qno(this);
        c68084Qno.LJII();
        this.LJIILJJIL = c68084Qno;
        C68082Qnm c68082Qnm = new C68082Qnm(this);
        c68082Qnm.LJII();
        this.LJIILL = c68082Qnm;
        C68110QoE c68110QoE = new C68110QoE(this);
        c68110QoE.LJII();
        this.LJIIJ = c68110QoE;
        C67277Qan c67277Qan = new C67277Qan(this);
        c67277Qan.LJIIIIZZ();
        this.LJIIZILJ = c67277Qan;
        C67284Qau c67284Qau = new C67284Qau(this);
        c67284Qau.LJIIIIZZ();
        this.LJIIIZ = c67284Qau;
        zzcl zzclVar2 = c68037Qn3.LJI;
        int i = (zzclVar2 == null || zzclVar2.zzb == 0) ? 1 : 0;
        if (C16880lQ.LLLLL(context) instanceof Application) {
            C68082Qnm LJIJ = LJIJ();
            if (C16880lQ.LLLLL(LJIJ.LIZ.LIZ) instanceof Application) {
                Application application = (Application) C16880lQ.LLLLL(LJIJ.LIZ.LIZ);
                if (LJIJ.LIZJ == null) {
                    LJIJ.LIZJ = new C68085Qnp(LJIJ);
                }
                if (i != 0) {
                    application.unregisterActivityLifecycleCallbacks(LJIJ.LIZJ);
                    application.registerActivityLifecycleCallbacks(LJIJ.LIZJ);
                    LJIJ.LIZ.LIZJ().LJIILIIL.LIZ("Registered activity lifecycle callback");
                }
            }
        } else {
            LIZJ().LJIIIIZZ.LIZ("Application context is not an Application");
        }
        c67284Qau.LJIILIIL(new RunnableC68032Qmy(this, c68037Qn3));
    }

    public static final void LJIIIZ(AbstractC68050QnG abstractC68050QnG) {
        if (abstractC68050QnG != null) {
            if (abstractC68050QnG.LIZIZ) {
                return;
            } else {
                throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(abstractC68050QnG.getClass())));
            }
        }
        throw new IllegalStateException("Component not created");
    }

    public static final void LJIIJ(AbstractC68049QnF abstractC68049QnF) {
        if (abstractC68049QnF != null) {
            if (abstractC68049QnF.LIZIZ) {
                return;
            } else {
                throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(abstractC68049QnF.getClass())));
            }
        }
        throw new IllegalStateException("Component not created");
    }

    public static C68033Qmz LJIIZILJ(Context context, zzcl zzclVar, Long l) {
        Bundle bundle;
        if (zzclVar != null && (zzclVar.zze == null || zzclVar.zzf == null)) {
            zzclVar = new zzcl(zzclVar.zza, zzclVar.zzb, zzclVar.zzc, zzclVar.zzd, null, null, zzclVar.zzg, null);
        }
        QH7.LJIIIIZZ(context);
        QH7.LJIIIIZZ(C16880lQ.LLLLL(context));
        if (LJJIJIIJI == null) {
            synchronized (C68033Qmz.class) {
                if (LJJIJIIJI == null) {
                    LJJIJIIJI = new C68033Qmz(new C68037Qn3(context, zzclVar, l));
                }
            }
        } else if (zzclVar != null && (bundle = zzclVar.zzg) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            QH7.LJIIIIZZ(LJJIJIIJI);
            LJJIJIIJI.LJJII = Boolean.valueOf(zzclVar.zzg.getBoolean("dataCollectionDefaultEnabled"));
        }
        QH7.LJIIIIZZ(LJJIJIIJI);
        return LJJIJIIJI;
    }
}
