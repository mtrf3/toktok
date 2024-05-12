package X;

import android.os.SystemClock;

/* renamed from: X.Gy0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43236Gy0 extends F9E {
    public final long LJLIL;
    public final long LJLILLLLZI;

    public C43236Gy0() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.LJLIL), Long.valueOf(this.LJLILLLLZI)};
    }

    public C43236Gy0(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        long uptimeMillis = SystemClock.uptimeMillis();
        this.LJLIL = currentTimeMillis;
        this.LJLILLLLZI = uptimeMillis;
    }
}
