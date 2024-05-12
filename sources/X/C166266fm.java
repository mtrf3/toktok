package X;

import android.os.SystemClock;

/* renamed from: X.6fm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166266fm extends F9E {
    public final String LJLIL;
    public final long LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Long.valueOf(this.LJLILLLLZI)};
    }

    public C166266fm(String str) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.LJLIL = str;
        this.LJLILLLLZI = elapsedRealtime;
    }
}
