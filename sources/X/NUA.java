package X;

import com.ss.android.ugc.aweme.crossplatform.business.PassBackApi;

/* loaded from: classes11.dex */
public final class NUA extends AbstractC65781Prl implements InterfaceC65784Pro<PassBackApi> {
    public static final NUA LJLIL = new NUA();

    public NUA() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.ss.android.ugc.aweme.crossplatform.business.PassBackApi, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final PassBackApi invoke() {
        C65087PgZ c65087PgZ = (C65087PgZ) C46104I7o.LJIILLIIL("https://ads.tiktok.com");
        c65087PgZ.LIZJ = true;
        return c65087PgZ.LJFF().LIZ.LIZ(PassBackApi.class);
    }
}
