package X;

import com.bytedance.android.livesdk.model.message.LiveEventMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;

/* renamed from: X.C0l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30631C0l implements OnMessageListener {
    public final /* synthetic */ Room LJLIL;

    public C30631C0l(Room room) {
        this.LJLIL = room;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (iMessage instanceof LiveEventMessage) {
            C30628C0i.LIZIZ(this.LJLIL.getId(), C17390mF.LIZ(new C17390mF(this.LJLIL.getId()), (LiveEventMessage) iMessage, false, null, 13));
        }
    }
}
