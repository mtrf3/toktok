package X;

import android.os.SystemClock;
import kotlin.jvm.internal.o;

/* renamed from: X.Gc3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41875Gc3 extends F9E {
    public final long LJLIL;
    public final long LJLILLLLZI;

    public C41875Gc3() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.LJLIL), Long.valueOf(this.LJLILLLLZI)};
    }

    public /* synthetic */ C41875Gc3(int i) {
        this(System.currentTimeMillis(), SystemClock.uptimeMillis());
    }

    public final C41875Gc3 L(C41875Gc3 beforeTime) {
        o.LJIIIZ(beforeTime, "beforeTime");
        return new C41875Gc3(this.LJLIL - beforeTime.LJLIL, this.LJLILLLLZI - beforeTime.LJLILLLLZI);
    }

    public C41875Gc3(long j, long j2) {
        this.LJLIL = j;
        this.LJLILLLLZI = j2;
    }
}
