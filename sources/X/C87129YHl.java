package X;

import kotlin.jvm.internal.o;

/* renamed from: X.YHl, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87129YHl implements InterfaceC87132YHo {
    public final int LIZ;
    public final String LIZIZ;

    @Override // X.InterfaceC87132YHo
    public final String getAid() {
        return this.LIZIZ;
    }

    public C87129YHl(int i, String aid) {
        o.LJIIIZ(aid, "aid");
        this.LIZ = i;
        this.LIZIZ = aid;
    }

    @Override // X.InterfaceC87132YHo
    public final boolean LIZ(int i, int i2) {
        int i3 = this.LIZ;
        if (i <= i3 && i3 <= i2) {
            return true;
        }
        return false;
    }
}
