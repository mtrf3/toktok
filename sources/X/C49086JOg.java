package X;

import kotlin.jvm.internal.o;

/* renamed from: X.JOg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49086JOg extends F9E {
    public final String LJLIL;
    public final int LJLILLLLZI;
    public final String LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI), this.LJLJI};
    }

    public C49086JOg(String sourceId, int i, String info) {
        o.LJIIIZ(sourceId, "sourceId");
        o.LJIIIZ(info, "info");
        this.LJLIL = sourceId;
        this.LJLILLLLZI = i;
        this.LJLJI = info;
    }
}
