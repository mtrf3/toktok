package X;

import com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayState;
import kotlin.jvm.internal.o;

/* renamed from: X.KRn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51719KRn extends AbstractC65781Prl implements InterfaceC88472Yns<ShoutoutsPlayState, ShoutoutsPlayState> {
    public static final C51719KRn LJLIL = new C51719KRn();

    public C51719KRn() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final ShoutoutsPlayState invoke(ShoutoutsPlayState shoutoutsPlayState) {
        ShoutoutsPlayState setState = shoutoutsPlayState;
        o.LJIIIZ(setState, "$this$setState");
        return setState.copy(0, EnumC51721KRp.PREPARED);
    }
}
