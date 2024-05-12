package X;

import kotlin.jvm.internal.o;

/* renamed from: X.S6p, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71559S6p extends F9E {
    public final boolean LJLIL;
    public final boolean LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final long LJLJJL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), Boolean.valueOf(this.LJLILLLLZI), this.LJLJI, this.LJLJJI, Long.valueOf(this.LJLJJL)};
    }

    public C71559S6p(String str, long j, String imageFilepath, boolean z, boolean z2) {
        o.LJIIIZ(imageFilepath, "imageFilepath");
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
        this.LJLJI = str;
        this.LJLJJI = imageFilepath;
        this.LJLJJL = j;
    }
}
