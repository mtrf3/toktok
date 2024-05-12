package X;

import Y.IDRunnableS30S0200000_24;
import com.byted.cast.common.api.IWriteCacheListener;
import com.byted.cast.common.source.ServiceInfo;

/* renamed from: X.Zkp, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90831Zkp implements IWriteCacheListener {
    public final /* synthetic */ C90495ZfP LIZ;

    public C90831Zkp(C90495ZfP c90495ZfP) {
        this.LIZ = c90495ZfP;
    }

    @Override // com.byted.cast.common.api.IWriteCacheListener
    public final void writeCache(ServiceInfo serviceInfo) {
        C90416Ze8 c90416Ze8 = this.LIZ.LJFF;
        c90416Ze8.LIZJ.i("BDLinkServiceDiskCacheHelper", "writeCache");
        c90416Ze8.LJFF.post(new IDRunnableS30S0200000_24(c90416Ze8, serviceInfo, 1));
    }
}
