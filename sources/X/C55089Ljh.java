package X;

import android.view.View;
import com.ss.android.ugc.aweme.services.ExternalService;
import kotlin.jvm.internal.o;

/* renamed from: X.Ljh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55089Ljh extends AbstractC65781Prl implements InterfaceC88472Yns<FVC, View> {
    public static final C55089Ljh LJLIL = new C55089Ljh();

    public C55089Ljh() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final View invoke(FVC fvc) {
        FVC params = fvc;
        o.LJIIIZ(params, "params");
        return ExternalService.INSTANCE.effectCardService().getEffectRecommendView(params.LIZIZ);
    }
}
