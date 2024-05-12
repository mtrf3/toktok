package X;

import android.util.ArrayMap;
import com.bytedance.android.live.liveinteract.platform.common.monitor.MultiGuestSeiAbnormalDetector;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.DestroyChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ExtraDataWrapper;
import com.bytedance.android.livesdk.comp.api.linkcore.model.KickOutMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveMessage;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class TYS extends C74625TQn {
    public final /* synthetic */ C75492Tk0 LJLIL;

    public TYS(C75492Tk0 c75492Tk0) {
        this.LJLIL = c75492Tk0;
    }

    @Override // X.C74625TQn, X.U62
    public final void LJIIJJI(InterfaceC75441TjB interfaceC75441TjB, LeaveMessage leaveMessage) {
        java.util.Map<Long, Long> map;
        if (this.LJLIL.LJLJJI != null && TRK.LIZ() != null && (map = TRK.LIZ().LJIIZILJ) != null && leaveMessage.getLeftUser() != null) {
            ArrayMap arrayMap = (ArrayMap) map;
            if (arrayMap.containsValue(leaveMessage.getLeftUser().getUserId())) {
                arrayMap.remove(Long.valueOf(this.LJLIL.LJLJJI.getId()));
            }
        }
    }

    @Override // X.C74625TQn, X.U62
    public final void LJJJI(InterfaceC75441TjB interfaceC75441TjB, DestroyChannelMessage destroyChannelMessage) {
        LinkMessage linkMessage = new LinkMessage();
        linkMessage.scene = 4;
        ExtraDataWrapper extra = destroyChannelMessage.getCustomMessage().getExtra();
        if (extra != null && (extra.getContent() instanceof Long)) {
            linkMessage.extraStr = extra.getContent().toString();
        }
        this.LJLIL.LJLLI.LLLLLLLLLL(linkMessage);
        C74987Tbr.LIZ("LinkControlPresenter", "host close linkmic by destroyChannel");
        T widget = this.LJLIL.mView;
        o.LJIIIZ(interfaceC75441TjB, "<this>");
        o.LJIIIZ(widget, "widget");
        InterfaceC55235Lm3 LJIILL = C44729Hgz.LJIILL(widget);
        if (LJIILL != null) {
            C44729Hgz.LIZ(LJIILL, false);
        }
    }

    @Override // X.C74625TQn, X.U62
    public final void LJJJIL(InterfaceC75441TjB interfaceC75441TjB, KickOutMessage kickOutMessage) {
        if (this.LJLIL.LJLJJL) {
            return;
        }
        if (kickOutMessage.getOwner() != null && kickOutMessage.getOwner().getUserId().longValue() != ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
            return;
        }
        LinkMessage linkMessage = new LinkMessage();
        linkMessage.scene = 4;
        this.LJLIL.LJLLI.LLLLIIL(linkMessage);
        C74987Tbr.LIZ("LinkControlPresenter", "guest kickOuted by host");
    }

    @Override // X.C74625TQn, X.U62
    public final void LJLZ(InterfaceC75441TjB interfaceC75441TjB, CreateChannelMessage createChannelMessage) {
        if (this.LJLIL.LJLJJL) {
            return;
        }
        C74987Tbr.LIZ("LinkControlPresenter", "host opened linkmic by createChannel");
        this.LJLIL.LJLJL = true;
        C74838TYs.LJ().LJIILIIL = createChannelMessage.getOwner().getLinkMicId();
        C74751TVj.LIZJ = "others";
        C75492Tk0 c75492Tk0 = this.LJLIL;
        InterfaceC75495Tk3 interfaceC75495Tk3 = (InterfaceC75495Tk3) c75492Tk0.mView;
        if (interfaceC75495Tk3 != null && c75492Tk0.LJLJJI != null) {
            interfaceC75495Tk3.nJ(EnumC74990Tbu.AUDIENCE_OPEN);
            if (this.LJLIL.LJLJJI.isWithLinkMic()) {
                C74769TWb.LJFF(this.LJLIL.LJLJJI, interfaceC75495Tk3);
            }
        }
        MultiGuestSeiAbnormalDetector LIZ = C74803TXj.LIZ();
        if (LIZ != null) {
            LIZ.LIZ = true;
            LIZ.LIZIZ = false;
        }
    }
}
