package X;

import com.ss.android.ugc.aweme.shoutouts.model.ShoutoutsOrderGetResp;
import com.ss.android.ugc.aweme.shoutouts.player.ShoutoutsPlayViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.EGd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36135EGd implements InterfaceC73463SsN<ShoutoutsOrderGetResp> {
    public final /* synthetic */ ShoutoutsPlayViewModel LJLIL;

    @Override // X.InterfaceC73463SsN
    public final void onError(Throwable e) {
        o.LJIIIZ(e, "e");
    }

    @Override // X.InterfaceC73463SsN
    public final void onSubscribe(InterfaceC92693kP d) {
        o.LJIIIZ(d, "d");
    }

    public C36135EGd(ShoutoutsPlayViewModel shoutoutsPlayViewModel) {
        this.LJLIL = shoutoutsPlayViewModel;
    }

    @Override // X.InterfaceC73463SsN
    public final void onSuccess(ShoutoutsOrderGetResp shoutoutsOrderGetResp) {
        ShoutoutsOrderGetResp t = shoutoutsOrderGetResp;
        o.LJIIIZ(t, "t");
        if (t.statusCode == 0) {
            this.LJLIL.LJLJJLL.setValue(t.orderStruct);
        }
    }
}
