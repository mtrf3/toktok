package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.offlinemode.api.OfflineModeApi;

/* renamed from: X.4iS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C116964iS extends AbstractC65781Prl implements InterfaceC65784Pro<OfflineModeApi.OfflineModeApiDefinition> {
    public static final C116964iS LJLIL = new C116964iS();

    public C116964iS() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.offlinemode.api.OfflineModeApi$OfflineModeApiDefinition, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final OfflineModeApi.OfflineModeApiDefinition invoke() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        return C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(OfflineModeApi.OfflineModeApiDefinition.class);
    }
}
