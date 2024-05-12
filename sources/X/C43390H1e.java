package X;

import kotlin.jvm.internal.o;

/* renamed from: X.H1e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43390H1e extends F9E {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final long LJLJI;
    public final int LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, Long.valueOf(this.LJLJI), Integer.valueOf(this.LJLJJI)};
    }

    public C43390H1e(int i, String probeContext, long j) {
        o.LJIIIZ(probeContext, "probeContext");
        this.LJLIL = "WaveUploadVideoTask";
        this.LJLILLLLZI = probeContext;
        this.LJLJI = j;
        this.LJLJJI = i;
    }
}
