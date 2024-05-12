package X;

import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;

/* renamed from: X.In5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47655In5 implements IAVEffectService.OnFetchResult {
    public final /* synthetic */ C47656In6 LIZ;

    public C47655In5(C47656In6 c47656In6) {
        this.LIZ = c47656In6;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService.OnFetchResult
    public final void onResult(String str) {
        this.LIZ.LIZJ = str;
        if (str != null) {
            if (str.isEmpty()) {
                FMX.LJIIL("fetch_feed_page_ae_loki", C78920UyC.LIZJ(-1, "success").LIZ);
                return;
            } else {
                FMX.LJIIL("fetch_feed_page_ae_loki", C78920UyC.LIZJ(0, "success").LIZ);
                return;
            }
        }
        FMX.LJIIL("fetch_feed_page_ae_loki", C78920UyC.LIZJ(-2, "success").LIZ);
    }
}
