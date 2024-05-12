package X;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.ecommerce.smartcheck.core.roma.RomaOpenApi;

/* renamed from: X.EDk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36064EDk extends AbstractC65781Prl implements InterfaceC65784Pro<RomaOpenApi> {
    public static final C36064EDk LJLIL = new C36064EDk();

    public C36064EDk() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.ss.android.ugc.aweme.ecommerce.smartcheck.core.roma.RomaOpenApi, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final RomaOpenApi invoke() {
        return RetrofitFactory.LIZLLL().create(EDY.LIZ().getFetch().getApiHost()).create(RomaOpenApi.class);
    }
}
