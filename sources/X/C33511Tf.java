package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1Tf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33511Tf extends F9E {
    public final String LJLIL;
    public final long LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Long.valueOf(this.LJLILLLLZI)};
    }

    public C33511Tf(String albumName, long j) {
        o.LJIIIZ(albumName, "albumName");
        this.LJLIL = albumName;
        this.LJLILLLLZI = j;
    }
}
