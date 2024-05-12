package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.DestroyChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ExtraDataWrapper;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TYT extends C74625TQn {
    public final /* synthetic */ TYW LJLIL;

    public TYT(TYW tyw) {
        this.LJLIL = tyw;
    }

    @Override // X.C74625TQn, X.U62
    public final void LJJJI(InterfaceC75441TjB session, DestroyChannelMessage destroyChannelMessage) {
        o.LJIIIZ(session, "session");
        LinkMessage linkMessage = new LinkMessage();
        linkMessage.scene = 4;
        ExtraDataWrapper extra = destroyChannelMessage.getCustomMessage().getExtra();
        if (extra != null && (extra.getContent() instanceof Long)) {
            linkMessage.extraStr = String.valueOf(extra.getContent());
        }
        this.LJLIL.LJLJI.LLLLLLLLLL(linkMessage);
        C74987Tbr.LIZ("VoiceChatControlPresenter", "host close linkmic by destroyChannel");
        T viewInterface = this.LJLIL.mView;
        o.LJIIIIZZ(viewInterface, "viewInterface");
        InterfaceC55235Lm3 LJIILL = C44729Hgz.LJIILL(viewInterface);
        if (LJIILL != null) {
            C44729Hgz.LIZ(LJIILL, false);
        }
    }
}
