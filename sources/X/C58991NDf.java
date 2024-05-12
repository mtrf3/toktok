package X;

import android.os.SystemClock;
import defpackage.q;

/* renamed from: X.NDf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58991NDf {
    public final SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZ;
    public final C58628Mzg LIZIZ;
    public InterfaceC88472Yns<? super SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, C76800UCe> LIZJ;
    public final InterfaceC65784Pro<C76800UCe> LIZLLL;
    public final long LJ;
    public EnumC58992NDg LJFF;
    public Long LJI;

    public C58991NDf() {
        throw null;
    }

    public final String toString() {
        String str;
        C60737Nsb hybridContext;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IBECacheCell(containerId=");
        InterfaceC60761Nsz kitView = this.LIZ.getKitView();
        if (kitView != null && (hybridContext = kitView.getHybridContext()) != null) {
            str = hybridContext.containerId;
        } else {
            str = null;
        }
        return q.LIZIZ(LIZ, str, ')', LIZ);
    }

    public C58991NDf(SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, C58628Mzg c58628Mzg, InterfaceC88472Yns interfaceC88472Yns, InterfaceC65784Pro interfaceC65784Pro) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        EnumC58992NDg enumC58992NDg = EnumC58992NDg.NOT_READY;
        this.LIZ = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        this.LIZIZ = c58628Mzg;
        this.LIZJ = interfaceC88472Yns;
        this.LIZLLL = interfaceC65784Pro;
        this.LJ = elapsedRealtime;
        this.LJFF = enumC58992NDg;
        this.LJI = null;
    }
}
