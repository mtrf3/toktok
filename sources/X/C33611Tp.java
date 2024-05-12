package X;

import android.graphics.Point;
import kotlin.jvm.internal.o;

/* renamed from: X.1Tp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33611Tp extends F9E {
    public final UE3 LJLIL;
    public final OSZ<Point, Point> LJLILLLLZI;
    public int LJLJI;
    public final long LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, Integer.valueOf(this.LJLJI), Long.valueOf(this.LJLJJI)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C33611Tp(UE3 giftTrayShowInfo, OSZ<? extends Point, ? extends Point> osz, int i, long j) {
        o.LJIIIZ(giftTrayShowInfo, "giftTrayShowInfo");
        this.LJLIL = giftTrayShowInfo;
        this.LJLILLLLZI = osz;
        this.LJLJI = i;
        this.LJLJJI = j;
    }

    public /* synthetic */ C33611Tp(UE3 ue3, OSZ osz, int i, long j, int i2) {
        this(ue3, osz, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? 0L : j);
    }
}
