package X;

import com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayState;
import kotlin.jvm.internal.o;

/* renamed from: X.KRt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51725KRt extends AbstractC65781Prl implements InterfaceC88472Yns<ShoutoutsPlayState, ShoutoutsPlayState> {
    public static final C51725KRt LJLIL = new C51725KRt();

    public C51725KRt() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final ShoutoutsPlayState invoke(ShoutoutsPlayState shoutoutsPlayState) {
        ShoutoutsPlayState setState = shoutoutsPlayState;
        o.LJIIIZ(setState, "$this$setState");
        return ShoutoutsPlayState.copy$default(setState, 0, EnumC51721KRp.SUCCESS, 1, null);
    }
}
