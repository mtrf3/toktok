package X;

import kotlin.jvm.internal.o;

/* renamed from: X.UdU, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77636UdU implements InterfaceC77665Udx<RVP, C77626UdK> {
    public final C278417k<String, C77626UdK> LIZ = new C278417k<>(3);

    @Override // X.InterfaceC77665Udx
    /* renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    public final C77626UdK LIZIZ(InterfaceC77685UeH cachePolicy, RVP cacheKey) {
        o.LJIIIZ(cachePolicy, "cachePolicy");
        o.LJIIIZ(cacheKey, "cacheKey");
        if (!cachePolicy.canUse()) {
            return null;
        }
        C77626UdK c77626UdK = this.LIZ.get(cacheKey.LIZ());
        if (c77626UdK == null || System.currentTimeMillis() - c77626UdK.LJLJI > 2147483647L) {
            this.LIZ.LIZ(cacheKey.LIZ());
            return null;
        }
        return c77626UdK;
    }

    @Override // X.InterfaceC77665Udx
    /* renamed from: LIZLLL, reason: merged with bridge method [inline-methods] */
    public final void LIZ(InterfaceC77685UeH cachePolicy, RVP cacheKey, C77626UdK queryData) {
        o.LJIIIZ(cachePolicy, "cachePolicy");
        o.LJIIIZ(cacheKey, "cacheKey");
        o.LJIIIZ(queryData, "queryData");
        if (cachePolicy.canCache()) {
            this.LIZ.put(cacheKey.LIZ(), queryData);
        }
    }
}
