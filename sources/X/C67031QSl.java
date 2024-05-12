package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.QSl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C67031QSl {
    public final long LIZ;
    public final List<InterfaceC67072QUa> LIZIZ = new ArrayList();

    public final C67032QSm LIZ() {
        if (this.LIZ >= 0) {
            return new C67032QSm(this);
        }
        throw new IllegalArgumentException("bizId < 0");
    }

    public C67031QSl(long j) {
        this.LIZ = j;
    }
}
