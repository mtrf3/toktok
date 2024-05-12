package com.ss.android.ugc.aweme.relation.storage;

import X.AnonymousClass390;
import X.C791538t;
import X.C791938x;
import X.EE1;
import X.InterfaceC791438s;
import com.ss.android.ugc.aweme.relation.storage.common.StorageLegoTask;

/* loaded from: classes2.dex */
public final class RelationStorageServiceImpl implements IRelationStorageService {
    public final C791938x LIZ = new C791938x();
    public final C791538t LIZIZ = new C791538t();

    @Override // com.ss.android.ugc.aweme.relation.storage.IRelationStorageService
    public final EE1 LIZIZ() {
        return new StorageLegoTask();
    }

    @Override // com.ss.android.ugc.aweme.relation.storage.IRelationStorageService
    public final InterfaceC791438s LIZ() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.relation.storage.IRelationStorageService
    public final AnonymousClass390 LIZJ() {
        return this.LIZ;
    }
}
