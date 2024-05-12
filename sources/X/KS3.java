package X;

import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KS3 extends F9E {
    public final int LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final long LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), this.LJLILLLLZI, this.LJLJI, Long.valueOf(this.LJLJJI)};
    }

    public KS3(String str, String scene, long j) {
        o.LJIIIZ(scene, "scene");
        this.LJLIL = 0;
        this.LJLILLLLZI = str;
        this.LJLJI = scene;
        this.LJLJJI = j;
    }
}
