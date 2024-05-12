package X;

import com.bytedance.ies.ugc.aweme.commercialize.search.core.SearchAdServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdService;

/* renamed from: X.N6t, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58823N6t extends AbstractC65781Prl implements InterfaceC65784Pro<ISearchAdService> {
    public static final C58823N6t LJLIL = new C58823N6t();

    public C58823N6t() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdService, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final ISearchAdService invoke() {
        ?? LIZ = C58096Mr6.LIZ(ISearchAdService.class, false);
        if (LIZ != 0) {
            return LIZ;
        }
        return new SearchAdServiceImpl();
    }
}
