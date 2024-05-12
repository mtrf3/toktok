package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Wgs, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82942Wgs extends F9E {
    public final String LJLIL;
    public final int LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI)};
    }

    public C82942Wgs(String effectId, int i) {
        o.LJIIIZ(effectId, "effectId");
        this.LJLIL = effectId;
        this.LJLILLLLZI = i;
    }
}
