package X;

import kotlin.jvm.internal.o;

/* renamed from: X.5iy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C142765iy extends F9E {
    public final String LJLIL;
    public final int LJLILLLLZI;
    public final boolean LJLJI;
    public final boolean LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI), Boolean.valueOf(this.LJLJI), Boolean.valueOf(this.LJLJJI)};
    }

    public C142765iy(int i, String coverPath, boolean z, boolean z2) {
        o.LJIIIZ(coverPath, "coverPath");
        this.LJLIL = coverPath;
        this.LJLILLLLZI = i;
        this.LJLJI = z;
        this.LJLJJI = z2;
    }
}
