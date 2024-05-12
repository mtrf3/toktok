package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.SystemClock;
import com.google.android.gms.measurement.internal.zzac;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Qmo, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68022Qmo extends AbstractC68050QnG {
    public final ServiceConnectionC67949Qld LIZJ;
    public InterfaceC68041Qn7 LIZLLL;
    public volatile Boolean LJ;
    public final C68027Qmt LJFF;
    public final C68029Qmv LJI;
    public final List LJII;
    public final C68028Qmu LJIIIIZZ;

    @Override // X.AbstractC68050QnG
    public final boolean LJIIIIZZ() {
        return false;
    }

    public final boolean LJIIJJI() {
        LJFF();
        LJI();
        if (this.LIZLLL != null) {
            return true;
        }
        return false;
    }

    public final boolean LJIIL() {
        LJFF();
        LJI();
        if (!LJIILIIL() || this.LIZ.LJIL().LJJLI() >= ((Integer) C68555QvP.LJJLIIIJ.LIZ(null)).intValue()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b4, code lost:
    
        if (r3 == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0117, code lost:
    
        if (r4 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0106, code lost:
    
        if (r6 == null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIILIIL() {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68022Qmo.LJIILIIL():boolean");
    }

    public final void LJIILL() {
        LJFF();
        this.LIZ.LIZJ().LJIILIIL.LIZIZ(Integer.valueOf(((ArrayList) this.LJII).size()), "Processing queued up service tasks");
        Iterator it = ((ArrayList) this.LJII).iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e) {
                this.LIZ.LIZJ().LJFF.LIZIZ(e, "Task exception while flushing queue");
            }
        }
        ((ArrayList) this.LJII).clear();
        this.LJIIIIZZ.LIZ();
    }

    public final void LJIILLIIL() {
        LJFF();
        C68029Qmv c68029Qmv = this.LJI;
        ((InterfaceC67689QhR) c68029Qmv.LIZIZ).getClass();
        c68029Qmv.LIZ = SystemClock.elapsedRealtime();
        this.LJFF.LIZJ(((Long) C68555QvP.LJJIJL.LIZ(null)).longValue());
    }

    public final void LJIJI() {
        LJFF();
        LJI();
        if (LJIIJJI()) {
            return;
        }
        if (!LJIILIIL()) {
            if (!this.LIZ.LJI.LJIJ()) {
                this.LIZ.getClass();
                List<ResolveInfo> queryIntentServices = this.LIZ.LIZ.getPackageManager().queryIntentServices(new Intent().setClassName(this.LIZ.LIZ, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                    Intent intent = new Intent("com.google.android.gms.measurement.START");
                    intent.setComponent(new ComponentName(this.LIZ.LIZ, "com.google.android.gms.measurement.AppMeasurementService"));
                    this.LIZJ.LIZ(intent);
                    return;
                }
                this.LIZ.LIZJ().LJFF.LIZ("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                return;
            }
            return;
        }
        ServiceConnectionC67949Qld serviceConnectionC67949Qld = this.LIZJ;
        serviceConnectionC67949Qld.LJLJI.LJFF();
        Context context = serviceConnectionC67949Qld.LJLJI.LIZ.LIZ;
        synchronized (serviceConnectionC67949Qld) {
            if (serviceConnectionC67949Qld.LJLIL) {
                serviceConnectionC67949Qld.LJLJI.LIZ.LIZJ().LJIILIIL.LIZ("Connection attempt already in progress");
                return;
            }
            if (serviceConnectionC67949Qld.LJLILLLLZI != null && (serviceConnectionC67949Qld.LJLILLLLZI.LJIIJJI() || serviceConnectionC67949Qld.LJLILLLLZI.isConnected())) {
                serviceConnectionC67949Qld.LJLJI.LIZ.LIZJ().LJIILIIL.LIZ("Already awaiting connection attempt");
                return;
            }
            serviceConnectionC67949Qld.LJLILLLLZI = new C67877QkT(context, C16880lQ.LLJJJJ(), serviceConnectionC67949Qld, serviceConnectionC67949Qld);
            serviceConnectionC67949Qld.LJLJI.LIZ.LIZJ().LJIILIIL.LIZ("Connecting to remote service");
            serviceConnectionC67949Qld.LJLIL = true;
            QH7.LJIIIIZZ(serviceConnectionC67949Qld.LJLILLLLZI);
            serviceConnectionC67949Qld.LJLILLLLZI.LJIJJ();
        }
    }

    public final void LJIJJ() {
        LJFF();
        LJI();
        ServiceConnectionC67949Qld serviceConnectionC67949Qld = this.LIZJ;
        if (serviceConnectionC67949Qld.LJLILLLLZI != null && (serviceConnectionC67949Qld.LJLILLLLZI.isConnected() || serviceConnectionC67949Qld.LJLILLLLZI.LJIIJJI())) {
            serviceConnectionC67949Qld.LJLILLLLZI.LIZLLL();
        }
        serviceConnectionC67949Qld.LJLILLLLZI = null;
        try {
            QCV.LIZIZ().LIZJ(this.LIZ.LIZ, this.LIZJ);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.LIZLLL = null;
    }

    public C68022Qmo(C68033Qmz c68033Qmz) {
        super(c68033Qmz);
        this.LJII = new ArrayList();
        this.LJI = new C68029Qmv(c68033Qmz.LJIILIIL);
        this.LIZJ = new ServiceConnectionC67949Qld(this);
        this.LJFF = new C68027Qmt(this, c68033Qmz);
        this.LJIIIIZZ = new C68028Qmu(this, c68033Qmz);
    }

    public final void LJIIJ(zzac zzacVar) {
        boolean LJIIL;
        LJFF();
        LJI();
        this.LIZ.getClass();
        C67546Qf8 LJIILL = this.LIZ.LJIILL();
        LJIILL.LIZ.LJIL().getClass();
        byte[] LJJJJL = C68083Qnn.LJJJJL(zzacVar);
        if (LJJJJL.length > 131072) {
            LJIILL.LIZ.LIZJ().LJI.LIZ("Conditional user property too long for local database. Sending directly to service");
            LJIIL = false;
        } else {
            LJIIL = LJIILL.LJIIL(2, LJJJJL);
        }
        LJIIZILJ(new RunnableC68026Qms(this, LJIILJJIL(true), LJIIL, new zzac(zzacVar)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x02f9, code lost:
    
        if (r3 != null) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.zzq LJIILJJIL(boolean r51) {
        /*
            Method dump skipped, instructions count: 811
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68022Qmo.LJIILJJIL(boolean):com.google.android.gms.measurement.internal.zzq");
    }

    public final void LJIIZILJ(Runnable runnable) {
        LJFF();
        if (LJIIJJI()) {
            runnable.run();
            return;
        }
        int size = ((ArrayList) this.LJII).size();
        C68033Qmz c68033Qmz = this.LIZ;
        if (size >= 1000) {
            c68033Qmz.LIZJ().LJFF.LIZ("Discarding data. Max runnable queue size reached");
            return;
        }
        ((ArrayList) this.LJII).add(runnable);
        this.LJIIIIZZ.LIZJ(60000L);
        LJIJI();
    }

    public final void LJIJJLI(AtomicReference atomicReference) {
        LJFF();
        LJI();
        LJIIZILJ(new RunnableC68030Qmw(this, atomicReference, LJIILJJIL(false)));
    }

    public static /* bridge */ /* synthetic */ void LJIJ(C68022Qmo c68022Qmo, ComponentName componentName) {
        c68022Qmo.LJFF();
        if (c68022Qmo.LIZLLL != null) {
            c68022Qmo.LIZLLL = null;
            c68022Qmo.LIZ.LIZJ().LJIILIIL.LIZIZ(componentName, "Disconnected from device MeasurementService");
            c68022Qmo.LJFF();
            c68022Qmo.LJIJI();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x029e, code lost:
    
        if (r0 == null) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02ab, code lost:
    
        r4 = r4 + 1;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02af, code lost:
    
        if (r4 >= 5) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02b3, code lost:
    
        r2.LIZ.LIZJ().LJIIIIZZ.LIZ("Failed to read events from database in reasonable time");
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02a8, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02a6, code lost:
    
        if (r0 == null) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0285, code lost:
    
        if (r0 == null) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x025c, code lost:
    
        if (r0 != null) goto L136;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0264 A[Catch: all -> 0x02d4, TryCatch #23 {all -> 0x02d4, blocks: (B:71:0x012f, B:73:0x0135, B:75:0x0140, B:129:0x0146, B:135:0x015a, B:138:0x015f, B:153:0x025e, B:155:0x0264, B:156:0x0267, B:142:0x028b, B:162:0x01fb, B:163:0x01fe, B:165:0x0170, B:111:0x0177, B:116:0x018b, B:119:0x0190, B:126:0x01a1, B:123:0x0200, B:124:0x0203, B:93:0x01a7, B:98:0x01bb, B:101:0x01c0, B:108:0x01d2, B:105:0x0205, B:106:0x0208, B:90:0x01da, B:86:0x01e9, B:172:0x020d, B:174:0x0215, B:178:0x0225, B:179:0x0232, B:186:0x027b), top: B:70:0x012f }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0225 A[Catch: SQLiteException -> 0x023a, SQLiteFullException -> 0x023c, SQLiteDatabaseLockedException -> 0x027a, all -> 0x02d4, TryCatch #22 {SQLiteDatabaseLockedException -> 0x027a, blocks: (B:71:0x012f, B:73:0x0135, B:75:0x0140, B:129:0x0146, B:135:0x015a, B:138:0x015f, B:162:0x01fb, B:163:0x01fe, B:165:0x0170, B:111:0x0177, B:116:0x018b, B:119:0x0190, B:126:0x01a1, B:123:0x0200, B:124:0x0203, B:93:0x01a7, B:98:0x01bb, B:101:0x01c0, B:108:0x01d2, B:105:0x0205, B:106:0x0208, B:90:0x01da, B:86:0x01e9, B:172:0x020d, B:174:0x0215, B:178:0x0225, B:179:0x0232), top: B:70:0x012f }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:196:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0135 A[Catch: SQLiteException -> 0x0242, SQLiteFullException -> 0x0244, SQLiteDatabaseLockedException -> 0x027a, all -> 0x02d4, TRY_LEAVE, TryCatch #22 {SQLiteDatabaseLockedException -> 0x027a, blocks: (B:71:0x012f, B:73:0x0135, B:75:0x0140, B:129:0x0146, B:135:0x015a, B:138:0x015f, B:162:0x01fb, B:163:0x01fe, B:165:0x0170, B:111:0x0177, B:116:0x018b, B:119:0x0190, B:126:0x01a1, B:123:0x0200, B:124:0x0203, B:93:0x01a7, B:98:0x01bb, B:101:0x01c0, B:108:0x01d2, B:105:0x0205, B:106:0x0208, B:90:0x01da, B:86:0x01e9, B:172:0x020d, B:174:0x0215, B:178:0x0225, B:179:0x0232), top: B:70:0x012f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(X.InterfaceC68041Qn7 r29, com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable r30, com.google.android.gms.measurement.internal.zzq r31) {
        /*
            Method dump skipped, instructions count: 738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68022Qmo.LJIIIZ(X.Qn7, com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable, com.google.android.gms.measurement.internal.zzq):void");
    }
}
