package X;

import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TO8 extends F9E {
    public final EnumC74565TOf LJLIL;
    public final Object LJLILLLLZI;
    public final Object LJLJI;
    public final Exception LJLJJI;
    public final Integer LJLJJL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL};
    }

    public /* synthetic */ TO8(EnumC74565TOf enumC74565TOf, Object obj, Object obj2, Exception exc) {
        this(enumC74565TOf, obj, obj2, exc, null);
    }

    public TO8(EnumC74565TOf state, Object obj, Object obj2, Exception exc, Integer num) {
        o.LJIIIZ(state, "state");
        this.LJLIL = state;
        this.LJLILLLLZI = obj;
        this.LJLJI = obj2;
        this.LJLJJI = exc;
        this.LJLJJL = num;
    }
}
