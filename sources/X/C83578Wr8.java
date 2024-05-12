package X;

import com.ss.android.ugc.aweme.live.sdk.chatroom.ui.TTLiveBroadcastView;
import java.util.Iterator;

/* renamed from: X.Wr8, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83578Wr8 implements InterfaceC83584WrE {
    public final /* synthetic */ TTLiveBroadcastView LIZ;

    public C83578Wr8(TTLiveBroadcastView tTLiveBroadcastView) {
        this.LIZ = tTLiveBroadcastView;
    }

    @Override // X.InterfaceC83584WrE
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        Iterator<InterfaceC30516ByK> it = this.LIZ.LJZI.iterator();
        while (it.hasNext()) {
            it.next().onMessageReceived(i, i2, i3, str);
        }
    }
}
