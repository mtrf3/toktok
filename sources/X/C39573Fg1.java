package X;

import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;

/* renamed from: X.Fg1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39573Fg1 extends PhoneStateListener {
    @Override // android.telephony.PhoneStateListener
    public final void onDataConnectionStateChanged(int i) {
        C39405FdJ.LJFF.getClass();
        C39405FdJ.LIZIZ.evictAll();
        C39405FdJ.LIZJ.evictAll();
    }

    @Override // android.telephony.PhoneStateListener
    public final void onServiceStateChanged(ServiceState serviceState) {
        C39405FdJ.LJFF.getClass();
        C39405FdJ.LIZIZ.evictAll();
        C39405FdJ.LIZJ.evictAll();
    }

    @Override // android.telephony.PhoneStateListener
    public final void onUserMobileDataStateChanged(boolean z) {
        C39405FdJ.LJFF.getClass();
        C39405FdJ.LIZIZ.evictAll();
        C39405FdJ.LIZJ.evictAll();
    }
}
