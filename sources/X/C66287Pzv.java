package X;

import android.os.SystemClock;
import kotlin.jvm.internal.o;

/* renamed from: X.Pzv, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66287Pzv implements J1T {
    public long LJLIL;
    public final long LJLILLLLZI;

    public C66287Pzv(long j) {
        this.LJLILLLLZI = j;
    }

    @Override // X.J1T
    public final boolean LIZ(InterfaceC66286Pzu store, String storeKey, int i, String str, String str2, String str3, C65300Pk0 c65300Pk0) {
        o.LJIIIZ(store, "store");
        o.LJIIIZ(storeKey, "storeKey");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!store.LIZ(storeKey)) {
            this.LJLIL = elapsedRealtime;
            return true;
        }
        if (elapsedRealtime - this.LJLIL > this.LJLILLLLZI) {
            this.LJLIL = elapsedRealtime;
            return true;
        }
        return false;
    }
}
