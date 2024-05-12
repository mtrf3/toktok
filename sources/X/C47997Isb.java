package X;

import android.telephony.PhoneStateListener;

/* renamed from: X.Isb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47997Isb extends PhoneStateListener {
    public final /* synthetic */ C47998Isc LIZ;

    public C47997Isb(C47998Isc c47998Isc) {
        this.LIZ = c47998Isc;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onDataConnectionStateChanged(int i, int i2) {
        super.onDataConnectionStateChanged(i, i2);
        this.LIZ.LIZJ.set(i2);
    }
}
