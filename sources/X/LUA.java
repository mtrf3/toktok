package X;

import com.ss.android.ugc.aweme.publish.service.PublishConfigExternalService;

/* loaded from: classes10.dex */
public final class LUA extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public static final LUA LJLIL = new LUA();

    public LUA() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        PublishConfigExternalService.LIZ().updateParallelGuideTooltipShown();
        return C76800UCe.LIZ;
    }
}
