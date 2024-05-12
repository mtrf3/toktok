package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcReviewGlobalV2Model;

/* renamed from: X.RiM, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70294RiM extends AbstractC65781Prl implements InterfaceC65784Pro<EcReviewGlobalV2Model> {
    public static final C70294RiM LJLIL = new C70294RiM();

    public C70294RiM() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.ecommerce.core.ab.EcReviewGlobalV2Model, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final EcReviewGlobalV2Model invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        EcReviewGlobalV2Model ecReviewGlobalV2Model = C70293RiL.LIZ;
        ?? LJIIIIZZ = LIZLLL.LJIIIIZZ("ttec_review_global_v2", EcReviewGlobalV2Model.class, ecReviewGlobalV2Model);
        if (LJIIIIZZ == 0) {
            return ecReviewGlobalV2Model;
        }
        return LJIIIIZZ;
    }
}
