package X;

import com.ss.android.ugc.aweme.live.sdk.chatroom.ui.TTLiveBroadcastView;

/* renamed from: X.Wr9, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83579Wr9 implements InterfaceC83583WrD {
    public final /* synthetic */ TTLiveBroadcastView LIZIZ;

    public C83579Wr9(TTLiveBroadcastView tTLiveBroadcastView) {
        this.LIZIZ = tTLiveBroadcastView;
    }

    @Override // X.InterfaceC83583WrD
    public final void onResult(int i) {
        TTLiveBroadcastView tTLiveBroadcastView = this.LIZIZ;
        if (tTLiveBroadcastView.LJLLL) {
            C40 c40 = tTLiveBroadcastView.LJLZ;
            if (c40 != null) {
                c40.onResult(-1);
                return;
            }
            return;
        }
        C40 c402 = tTLiveBroadcastView.LJLZ;
        if (c402 == null) {
            return;
        }
        c402.onResult(i);
    }
}
