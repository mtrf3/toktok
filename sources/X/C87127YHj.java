package X;

import kotlin.jvm.internal.o;

/* renamed from: X.YHj, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87127YHj implements InterfaceC87132YHo {
    public final int LIZ;
    public final String LIZIZ;
    public final int LIZJ;

    @Override // X.InterfaceC87132YHo
    public final String getAid() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC87132YHo
    public final boolean LIZ(int i, int i2) {
        int i3 = this.LIZ;
        if (i > i3 || i3 > i2 || this.LIZJ < i) {
            return false;
        }
        return true;
    }

    public C87127YHj(int i, String aid, int i2) {
        o.LJIIIZ(aid, "aid");
        this.LIZ = i;
        this.LIZIZ = aid;
        this.LIZJ = i2;
    }
}
