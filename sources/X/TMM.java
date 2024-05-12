package X;

import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TMM<T, R> implements InterfaceC48038ItG<EnumC74492TLk, Boolean> {
    public static final TMM LJLIL = new TMM();

    @Override // X.InterfaceC48038ItG
    public final Boolean apply(EnumC74492TLk it) {
        boolean z;
        o.LJIIIZ(it, "it");
        if (it == EnumC74492TLk.PRE_SHOW) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
