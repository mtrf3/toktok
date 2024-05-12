package X;

import com.bytedance.ies.ugc.aweme.commercialize.search.core.PreciseAdServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.search.service.IPreciseAdService;

/* renamed from: X.N6r, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58821N6r extends AbstractC65781Prl implements InterfaceC65784Pro<IPreciseAdService> {
    public static final C58821N6r LJLIL = new C58821N6r();

    public C58821N6r() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.bytedance.ies.ugc.aweme.commercialize.search.service.IPreciseAdService] */
    @Override // X.InterfaceC65784Pro
    public final IPreciseAdService invoke() {
        ?? LIZ = C58096Mr6.LIZ(IPreciseAdService.class, false);
        if (LIZ != 0) {
            return LIZ;
        }
        return new PreciseAdServiceImpl();
    }
}
