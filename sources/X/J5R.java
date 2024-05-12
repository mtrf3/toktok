package X;

import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class J5R extends F9E {
    public static final J5R LJLJJI = new J5R(1.0f, "Default", -1);
    public final int LJLIL;
    public final String LJLILLLLZI;
    public final float LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), this.LJLILLLLZI, Float.valueOf(this.LJLJI)};
    }

    public J5R(float f, String name, int i) {
        o.LJIIIZ(name, "name");
        this.LJLIL = i;
        this.LJLILLLLZI = name;
        this.LJLJI = f;
    }
}
