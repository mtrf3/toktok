package X;

import com.ss.android.ugc.aweme.relation.storage.experiment.StorageConfig;

/* renamed from: X.3gd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C90353gd extends AbstractC65781Prl implements InterfaceC65784Pro<StorageConfig> {
    public static final C90353gd LJLIL = new C90353gd();

    public C90353gd() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.relation.storage.experiment.StorageConfig, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final StorageConfig invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        StorageConfig storageConfig = C90343gc.LIZ;
        LJIIIZ.getClass();
        ?? LJIJ = FFL.LJIJ(true, "relation_local_storage_config", 31744, StorageConfig.class, storageConfig);
        if (LJIJ == 0) {
            return storageConfig;
        }
        return LJIJ;
    }
}
