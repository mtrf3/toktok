package X;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.measurement.internal.zzlo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Qnq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68086Qnq extends AbstractC68143Qol {
    public final C68033Qmz LIZ;
    public final C68082Qnm LIZIZ;

    @Override // X.InterfaceC68730QyE
    public final long LIZ() {
        return this.LIZ.LJIL().LJJLIIIJ();
    }

    @Override // X.InterfaceC68730QyE
    public final String LJI() {
        return this.LIZIZ.LJJIFFI();
    }

    @Override // X.InterfaceC68730QyE
    public final String LJII() {
        C68132Qoa c68132Qoa = this.LIZIZ.LIZ.LJIJI().LIZJ;
        if (c68132Qoa != null) {
            return c68132Qoa.LIZIZ;
        }
        return null;
    }

    @Override // X.InterfaceC68730QyE
    public final String LJIIJJI() {
        C68132Qoa c68132Qoa = this.LIZIZ.LIZ.LJIJI().LIZJ;
        if (c68132Qoa != null) {
            return c68132Qoa.LIZ;
        }
        return null;
    }

    @Override // X.InterfaceC68730QyE
    public final String LJIIL() {
        return this.LIZIZ.LJJIFFI();
    }

    public C68086Qnq(C68033Qmz c68033Qmz) {
        QH7.LJIIIIZZ(c68033Qmz);
        this.LIZ = c68033Qmz;
        this.LIZIZ = c68033Qmz.LJIJ();
    }

    @Override // X.InterfaceC68730QyE
    public final void LJIILL(String str) {
        C68089Qnt LJIIL = this.LIZ.LJIIL();
        this.LIZ.LJIILIIL.getClass();
        LJIIL.LJI(SystemClock.elapsedRealtime(), str);
    }

    @Override // X.InterfaceC68730QyE
    public final void LJIILLIIL(String str) {
        C68089Qnt LJIIL = this.LIZ.LJIIL();
        this.LIZ.LJIILIIL.getClass();
        LJIIL.LJII(SystemClock.elapsedRealtime(), str);
    }

    @Override // X.InterfaceC68730QyE
    public final int LJIJ(String str) {
        this.LIZIZ.getClass();
        QH7.LJI(str);
        return 25;
    }

    @Override // X.InterfaceC68730QyE
    public final void LJIJI(Bundle bundle) {
        C68082Qnm c68082Qnm = this.LIZIZ;
        c68082Qnm.LIZ.LJIILIIL.getClass();
        c68082Qnm.LJIILLIIL(System.currentTimeMillis(), bundle);
    }

    @Override // X.InterfaceC68730QyE
    public final List LJIILJJIL(String str, String str2) {
        C68082Qnm c68082Qnm = this.LIZIZ;
        if (c68082Qnm.LIZ.LIZIZ().LJIILL()) {
            c68082Qnm.LIZ.LIZJ().LJFF.LIZ("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        c68082Qnm.LIZ.getClass();
        if (C17J.LJJJJZ()) {
            c68082Qnm.LIZ.LIZJ().LJFF.LIZ("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        c68082Qnm.LIZ.LIZIZ().LJIIJ(atomicReference, 5000L, "get conditional user properties", new RunnableC68046QnC(c68082Qnm, atomicReference, str, str2));
        List list = (List) atomicReference.get();
        if (list == null) {
            c68082Qnm.LIZ.LIZJ().LJFF.LIZIZ(null, "Timed out waiting for get conditional user properties");
            return new ArrayList();
        }
        return C68083Qnn.LJIILL(list);
    }

    @Override // X.InterfaceC68730QyE
    public final void LJIILIIL(String str, String str2, Bundle bundle) {
        C68082Qnm c68082Qnm = this.LIZIZ;
        c68082Qnm.LIZ.LJIILIIL.getClass();
        c68082Qnm.LJIIJJI(str, str2, bundle, true, true, System.currentTimeMillis());
    }

    @Override // X.InterfaceC68730QyE
    public final java.util.Map LJIIZILJ(String str, String str2, boolean z) {
        C68082Qnm c68082Qnm = this.LIZIZ;
        if (c68082Qnm.LIZ.LIZIZ().LJIILL()) {
            c68082Qnm.LIZ.LIZJ().LJFF.LIZ("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        c68082Qnm.LIZ.getClass();
        if (C17J.LJJJJZ()) {
            c68082Qnm.LIZ.LIZJ().LJFF.LIZ("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        c68082Qnm.LIZ.LIZIZ().LJIIJ(atomicReference, 5000L, "get user properties", new RunnableC68047QnD(c68082Qnm, atomicReference, str, str2, z));
        List<zzlo> list = (List) atomicReference.get();
        if (list == null) {
            c68082Qnm.LIZ.LIZJ().LJFF.LIZIZ(Boolean.valueOf(z), "Timed out waiting for handle get user properties, includeInternal");
            return Collections.emptyMap();
        }
        C1HQ c1hq = new C1HQ(list.size());
        for (zzlo zzloVar : list) {
            Object LJJJJL = zzloVar.LJJJJL();
            if (LJJJJL != null) {
                c1hq.put(zzloVar.zzb, LJJJJL);
            }
        }
        return c1hq;
    }

    @Override // X.InterfaceC68730QyE
    public final void LJIJJ(String str, String str2, Bundle bundle) {
        this.LIZ.LJIJ().LJIIIZ(str, str2, bundle);
    }
}
