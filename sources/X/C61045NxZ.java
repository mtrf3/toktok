package X;

import kotlin.jvm.internal.o;

/* renamed from: X.NxZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61045NxZ extends F9E {
    public final String LJLIL;
    public final long LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Long.valueOf(this.LJLILLLLZI)};
    }

    public C61045NxZ(String intervalName, long j) {
        o.LJIIIZ(intervalName, "intervalName");
        this.LJLIL = intervalName;
        this.LJLILLLLZI = j;
    }
}
