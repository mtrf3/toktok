package X;

import kotlin.jvm.internal.o;

/* renamed from: X.8NC, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8NC extends F9E {
    public final EnumC72807Shn LJLIL;
    public final float LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Float.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), Integer.valueOf(this.LJLJJI), Integer.valueOf(this.LJLJJL)};
    }

    public C8NC(EnumC72807Shn scaleType, float f, int i, int i2, int i3) {
        o.LJIIIZ(scaleType, "scaleType");
        this.LJLIL = scaleType;
        this.LJLILLLLZI = f;
        this.LJLJI = i;
        this.LJLJJI = i2;
        this.LJLJJL = i3;
    }
}
