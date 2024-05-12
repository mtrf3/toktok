package X;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: X.152, reason: invalid class name */
/* loaded from: classes.dex */
public class AnonymousClass152 implements IInterface {
    public final IBinder LJLIL;
    public final String LJLILLLLZI = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService";

    public AnonymousClass152(IBinder iBinder) {
        this.LJLIL = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.LJLIL;
    }
}
