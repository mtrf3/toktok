package X;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.bullet.business.PassBackApi;

/* loaded from: classes11.dex */
public final class NU8 extends AbstractC65781Prl implements InterfaceC65784Pro<PassBackApi> {
    public static final NU8 LJLIL = new NU8();

    public NU8() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, com.ss.android.ugc.aweme.bullet.business.PassBackApi] */
    @Override // X.InterfaceC65784Pro
    public final PassBackApi invoke() {
        C65087PgZ LIZ = RetrofitFactory.LIZLLL().LIZ("https://ads.tiktok.com");
        LIZ.LIZJ = true;
        return LIZ.LJFF().LIZ.LIZ(PassBackApi.class);
    }
}
