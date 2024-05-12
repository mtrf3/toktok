package X;

import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.ies.sdk.widgets.LiveWidget;

/* renamed from: X.BGj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28497BGj extends AbstractC65781Prl implements InterfaceC65784Pro<LiveWidget> {
    public static final C28497BGj LJLIL = new C28497BGj();

    public C28497BGj() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final LiveWidget invoke() {
        return ((IGameService) CN1.LIZ(IGameService.class)).SV();
    }
}
