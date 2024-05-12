package X;

import com.bytedance.ies.ugc.aweme.commercialize.search.core.TopVideoAdServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.search.service.ITopVideoAdService;

/* renamed from: X.N6s, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58822N6s extends AbstractC65781Prl implements InterfaceC65784Pro<ITopVideoAdService> {
    public static final C58822N6s LJLIL = new C58822N6s();

    public C58822N6s() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.bytedance.ies.ugc.aweme.commercialize.search.service.ITopVideoAdService] */
    @Override // X.InterfaceC65784Pro
    public final ITopVideoAdService invoke() {
        ?? LIZ = C58096Mr6.LIZ(ITopVideoAdService.class, false);
        if (LIZ != 0) {
            return LIZ;
        }
        return new TopVideoAdServiceImpl();
    }
}
