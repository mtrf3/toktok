package X;

import kotlin.jvm.internal.o;

/* renamed from: X.YHi, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87126YHi implements InterfaceC87132YHo {
    public final int LIZ;
    public final String LIZIZ;

    @Override // X.InterfaceC87132YHo
    public final String getAid() {
        return this.LIZIZ;
    }

    public C87126YHi(int i, String aid) {
        o.LJIIIZ(aid, "aid");
        this.LIZ = i;
        this.LIZIZ = aid;
    }

    @Override // X.InterfaceC87132YHo
    public final boolean LIZ(int i, int i2) {
        if (this.LIZ >= i) {
            return true;
        }
        return false;
    }
}
