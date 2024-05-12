package X;

import com.bytedance.android.livesdk.hashtag.BroadcastHashTagWidget;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.Hashtag;

/* renamed from: X.BHd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28517BHd implements InterfaceC14450hV {
    public final /* synthetic */ BroadcastHashTagWidget LIZ;

    public C28517BHd(BroadcastHashTagWidget broadcastHashTagWidget) {
        this.LIZ = broadcastHashTagWidget;
    }

    @Override // X.InterfaceC14450hV
    public final void LIZ(Hashtag hashtag, GameTag gameTag) {
        BroadcastHashTagWidget broadcastHashTagWidget = this.LIZ;
        broadcastHashTagWidget.LJLJL = gameTag;
        broadcastHashTagWidget.LJLJLJ = hashtag;
    }
}
