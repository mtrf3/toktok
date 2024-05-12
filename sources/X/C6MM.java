package X;

import com.ss.android.ugc.gamora.editor.recommendeffect.net.RecommendEffectRequestApi;

/* renamed from: X.6MM, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6MM extends AbstractC65781Prl implements InterfaceC65784Pro<RecommendEffectRequestApi.Api> {
    public static final C6MM LJLIL = new C6MM();

    public C6MM() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.ss.android.ugc.gamora.editor.recommendeffect.net.RecommendEffectRequestApi$Api] */
    @Override // X.InterfaceC65784Pro
    public final RecommendEffectRequestApi.Api invoke() {
        return C60903NvH.LJIIJJI().getNetworkService().createDefaultRetrofit(RecommendEffectRequestApi.Api.class);
    }
}
