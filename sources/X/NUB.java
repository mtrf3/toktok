package X;

import com.ss.android.ugc.aweme.web.business.special.PassBackApi;

/* loaded from: classes11.dex */
public final class NUB extends AbstractC65781Prl implements InterfaceC65784Pro<PassBackApi> {
    public static final NUB LJLIL = new NUB();

    public NUB() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, com.ss.android.ugc.aweme.web.business.special.PassBackApi] */
    @Override // X.InterfaceC65784Pro
    public final PassBackApi invoke() {
        C65087PgZ c65087PgZ = (C65087PgZ) C46104I7o.LJIILLIIL("https://ads.tiktok.com");
        c65087PgZ.LIZJ = true;
        return c65087PgZ.LJFF().LIZ.LIZ(PassBackApi.class);
    }
}
