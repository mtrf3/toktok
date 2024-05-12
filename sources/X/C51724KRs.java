package X;

import com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayState;
import kotlin.jvm.internal.o;

/* renamed from: X.KRs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51724KRs extends AbstractC65781Prl implements InterfaceC88472Yns<ShoutoutsPlayState, ShoutoutsPlayState> {
    public static final C51724KRs LJLIL = new C51724KRs();

    public C51724KRs() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final ShoutoutsPlayState invoke(ShoutoutsPlayState shoutoutsPlayState) {
        ShoutoutsPlayState setState = shoutoutsPlayState;
        o.LJIIIZ(setState, "$this$setState");
        return ShoutoutsPlayState.copy$default(setState, 0, EnumC51721KRp.CANCEL, 1, null);
    }
}
