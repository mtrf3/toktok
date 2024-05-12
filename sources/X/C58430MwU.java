package X;

import com.ss.android.ugc.aweme.experiment.RelationListCacheConfig;

/* renamed from: X.MwU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58430MwU extends AbstractC65781Prl implements InterfaceC65784Pro<RelationListCacheConfig> {
    public static final C58430MwU LJLIL = new C58430MwU();

    public C58430MwU() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.ss.android.ugc.aweme.experiment.RelationListCacheConfig] */
    @Override // X.InterfaceC65784Pro
    public final RelationListCacheConfig invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        RelationListCacheConfig relationListCacheConfig = C58429MwT.LIZ;
        LJIIIZ.getClass();
        ?? LJIJ = FFL.LJIJ(true, "relation_list_cache_strategy", 31744, RelationListCacheConfig.class, relationListCacheConfig);
        if (LJIJ == 0) {
            return relationListCacheConfig;
        }
        return LJIJ;
    }
}
