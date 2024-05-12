package X;

import android.telephony.TelephonyCallback;

/* renamed from: X.Pzr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66283Pzr extends TelephonyCallback implements TelephonyCallback.DataConnectionStateListener {
    public final /* synthetic */ C66272Pzg LIZ;

    public C66283Pzr(C66272Pzg c66272Pzg) {
        this.LIZ = c66272Pzg;
    }

    @Override // android.telephony.TelephonyCallback.DataConnectionStateListener
    public final void onDataConnectionStateChanged(int i, int i2) {
        this.LIZ.getClass();
        C66272Pzg.LJLIL = i2;
    }
}
