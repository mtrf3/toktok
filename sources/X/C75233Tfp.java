package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Tfp, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75233Tfp extends F9E {
    public final EnumC74778TWk LJLIL;
    public final int LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), Integer.valueOf(this.LJLJJI)};
    }

    public final boolean L() {
        EnumC74778TWk enumC74778TWk = this.LJLIL;
        if (enumC74778TWk == EnumC74778TWk.NORMAL || enumC74778TWk == EnumC74778TWk.FLOATING || ((enumC74778TWk == EnumC74778TWk.GRID && this.LJLILLLLZI <= 0) || ((enumC74778TWk == EnumC74778TWk.GRID_FIX && this.LJLILLLLZI <= 0) || (enumC74778TWk == EnumC74778TWk.FLOATING_FIX && this.LJLILLLLZI <= 0)))) {
            return true;
        }
        return false;
    }

    public C75233Tfp(EnumC74778TWk type, int i) {
        o.LJIIIZ(type, "type");
        this.LJLIL = type;
        this.LJLILLLLZI = i;
        this.LJLJI = 0;
        this.LJLJJI = 0;
    }
}
