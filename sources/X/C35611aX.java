package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1aX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35611aX extends F9E {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final long LJLJI;
    public final long LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, Long.valueOf(this.LJLJI), Long.valueOf(this.LJLJJI)};
    }

    public C35611aX(long j, long j2, String triggerType, String str) {
        o.LJIIIZ(triggerType, "triggerType");
        this.LJLIL = triggerType;
        this.LJLILLLLZI = str;
        this.LJLJI = j;
        this.LJLJJI = j2;
    }
}
