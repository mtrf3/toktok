package X;

import com.bytedance.effectcreatormobile.ckeapi.api.store.IStore;
import com.bytedance.news.common.service.manager.IService;

/* renamed from: X.aUb, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93669aUb {
    public final IStore LIZ;

    public C93669aUb(AbstractC94370afu abstractC94370afu) {
        IService iService;
        C93970aZS LIZ = C93971aZT.LIZ();
        if (LIZ != null) {
            iService = (IService) LIZ.LIZ(IStore.class);
        } else {
            iService = null;
        }
        this.LIZ = (IStore) iService;
    }
}
