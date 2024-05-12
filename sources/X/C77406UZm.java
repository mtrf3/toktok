package X;

import kotlin.jvm.internal.o;

/* renamed from: X.UZm, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77406UZm implements InterfaceC73592SuS<Throwable> {
    public final /* synthetic */ C77404UZk LJLIL;

    public C77406UZm(C77404UZk c77404UZk) {
        this.LJLIL = c77404UZk;
    }

    @Override // X.InterfaceC73592SuS
    public final boolean test(Throwable t) {
        o.LJIIIZ(t, "t");
        C77404UZk c77404UZk = this.LJLIL;
        if (c77404UZk.LJ >= c77404UZk.LIZJ.size() - 1) {
            return false;
        }
        this.LJLIL.LJ++;
        return true;
    }
}
