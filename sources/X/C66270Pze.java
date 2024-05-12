package X;

import android.telephony.PhoneStateListener;

/* renamed from: X.Pze, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66270Pze extends PhoneStateListener {
    public C66270Pze(ExecutorC64417PPx executorC64417PPx) {
        super(executorC64417PPx);
    }

    @Override // android.telephony.PhoneStateListener
    public final void onDataConnectionStateChanged(int i, int i2) {
        C66272Pzg.LJLJJL.getClass();
        C66272Pzg.LJLIL = i2;
    }
}
