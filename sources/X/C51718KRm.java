package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayState;
import kotlin.jvm.internal.o;

/* renamed from: X.KRm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51718KRm extends AbstractC65781Prl implements InterfaceC88471Ynr<ShoutoutsPlayState, Bundle, ShoutoutsPlayState> {
    public static final C51718KRm INSTANCE = new C51718KRm();

    public C51718KRm() {
        super(2);
    }

    public final ShoutoutsPlayState invoke(ShoutoutsPlayState receiver, Bundle bundle) {
        o.LJIIJ(receiver, "$receiver");
        return receiver;
    }

    @Override // X.InterfaceC88471Ynr
    public /* bridge */ /* synthetic */ ShoutoutsPlayState invoke(ShoutoutsPlayState shoutoutsPlayState, Bundle bundle) {
        ShoutoutsPlayState shoutoutsPlayState2 = shoutoutsPlayState;
        invoke(shoutoutsPlayState2, bundle);
        return shoutoutsPlayState2;
    }
}
