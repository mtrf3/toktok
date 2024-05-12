package X;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.data.HybridABApi;
import defpackage.i0;

/* renamed from: X.E8i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35932E8i extends AbstractC65781Prl implements InterfaceC65784Pro<HybridABApi> {
    public static final C35932E8i LJLIL = new C35932E8i();

    public C35932E8i() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.ss.android.ugc.aweme.data.HybridABApi, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final HybridABApi invoke() {
        return RetrofitFactory.LIZLLL().create(i0.LJFF("https://", EF7.LJI.LIZ)).create(HybridABApi.class);
    }
}
