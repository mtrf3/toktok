package X;

import kotlin.jvm.internal.o;

/* renamed from: X.5lQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C144285lQ extends F9E {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final String LJLJI;
    public final boolean LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI), this.LJLJI, Boolean.valueOf(this.LJLJJI)};
    }

    public C144285lQ(int i, int i2, String stickerPath, boolean z) {
        o.LJIIIZ(stickerPath, "stickerPath");
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = stickerPath;
        this.LJLJJI = z;
    }
}
