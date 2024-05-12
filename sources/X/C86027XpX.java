package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.XpX, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86027XpX {
    public final int LIZ;
    public final List<InterfaceC86026XpW> LIZIZ;
    public final Q9D LIZJ;
    public final InterfaceC86033Xpd LIZLLL;

    public final C86031Xpb LIZ(Q9D request) {
        o.LJIIIZ(request, "request");
        if (this.LIZ < this.LIZIZ.size()) {
            C86031Xpb LIZ = ((InterfaceC86026XpW) ListProtector.get(this.LIZIZ, this.LIZ)).LIZ(new C86027XpX(this.LIZ + 1, this.LIZIZ, request, this.LIZLLL));
            if (LIZ == null) {
                C86030Xpa c86030Xpa = new C86030Xpa();
                c86030Xpa.LIZ = request;
                c86030Xpa.LIZIZ = 0;
                c86030Xpa.LIZJ = "success";
                return new C86031Xpb(c86030Xpa);
            }
            return LIZ;
        }
        throw new AssertionError();
    }

    public C86027XpX(int i, List<InterfaceC86026XpW> interceptors, Q9D originalReq, InterfaceC86033Xpd call) {
        o.LJIIIZ(interceptors, "interceptors");
        o.LJIIIZ(originalReq, "originalReq");
        o.LJIIIZ(call, "call");
        this.LIZ = i;
        this.LIZIZ = interceptors;
        this.LIZJ = originalReq;
        this.LIZLLL = call;
    }
}
