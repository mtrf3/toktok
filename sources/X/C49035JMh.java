package X;

import com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentService;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentServiceImpl;

/* renamed from: X.JMh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49035JMh extends AbstractC65781Prl implements InterfaceC65784Pro<SearchComponentService> {
    public static final C49035JMh LJLIL = new C49035JMh();

    public C49035JMh() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentService, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final SearchComponentService invoke() {
        ?? LIZ = C58096Mr6.LIZ(SearchComponentService.class, false);
        if (LIZ != 0) {
            return LIZ;
        }
        if (C58096Mr6.E4 == null) {
            synchronized (SearchComponentService.class) {
                if (C58096Mr6.E4 == null) {
                    C58096Mr6.E4 = new SearchComponentServiceImpl();
                }
            }
        }
        return C58096Mr6.E4;
    }
}
