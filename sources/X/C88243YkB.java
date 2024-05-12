package X;

import kotlin.jvm.internal.o;

/* renamed from: X.YkB, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88243YkB implements InterfaceC30265BuH {
    public final Integer LJLIL;

    public C88243YkB(Integer num) {
        this.LJLIL = num;
    }

    @Override // X.InterfaceC30265BuH
    public final boolean isLiveDesignLayout(EnumC30259BuB theme) {
        o.LJIIIZ(theme, "theme");
        if (this.LJLIL == null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC30265BuH
    public final Integer layoutID(EnumC30259BuB theme) {
        o.LJIIIZ(theme, "theme");
        return this.LJLIL;
    }
}
