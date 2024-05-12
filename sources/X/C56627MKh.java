package X;

import kotlin.jvm.internal.o;

/* renamed from: X.MKh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56627MKh extends F9E {
    public final int LJLIL;
    public final EnumC56629MKj LJLILLLLZI;

    public C56627MKh() {
        this(0, null, 3);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), this.LJLILLLLZI};
    }

    public C56627MKh(int i, EnumC56629MKj mode, int i2) {
        i = (i2 & 1) != 0 ? Integer.MAX_VALUE : i;
        mode = (i2 & 2) != 0 ? EnumC56629MKj.SHOW_ALL : mode;
        o.LJIIIZ(mode, "mode");
        this.LJLIL = i;
        this.LJLILLLLZI = mode;
    }
}
