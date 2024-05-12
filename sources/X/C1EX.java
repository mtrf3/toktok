package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1EX, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1EX<T> implements InterfaceC73592SuS {
    public final /* synthetic */ Long LJLIL;

    public C1EX(Long l) {
        this.LJLIL = l;
    }

    @Override // X.InterfaceC73592SuS
    public final boolean test(Object obj) {
        C05120Ia data = (C05120Ia) obj;
        o.LJIIIZ(data, "data");
        long j = data.LIZ;
        Long l = this.LJLIL;
        if (l == null || j != l.longValue()) {
            return false;
        }
        return true;
    }
}
