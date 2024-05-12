package X;

import com.ss.android.ugc.aweme.relation.storage.IRelationStorageService;
import com.ss.android.ugc.aweme.relation.storage.RelationStorageServiceImpl;

/* renamed from: X.393, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass393 implements IRelationStorageService {
    public static final AnonymousClass393 LIZIZ = new AnonymousClass393();
    public final /* synthetic */ IRelationStorageService LIZ;

    @Override // com.ss.android.ugc.aweme.relation.storage.IRelationStorageService
    public final InterfaceC791438s LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.relation.storage.IRelationStorageService
    public final EE1 LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.relation.storage.IRelationStorageService
    public final AnonymousClass390 LIZJ() {
        return this.LIZ.LIZJ();
    }

    public AnonymousClass393() {
        IRelationStorageService iRelationStorageService;
        Object LIZ = C58096Mr6.LIZ(IRelationStorageService.class, false);
        if (LIZ != null) {
            iRelationStorageService = (IRelationStorageService) LIZ;
        } else {
            if (C58096Mr6.y4 == null) {
                synchronized (IRelationStorageService.class) {
                    if (C58096Mr6.y4 == null) {
                        C58096Mr6.y4 = new RelationStorageServiceImpl();
                    }
                }
            }
            iRelationStorageService = C58096Mr6.y4;
        }
        this.LIZ = iRelationStorageService;
    }
}
