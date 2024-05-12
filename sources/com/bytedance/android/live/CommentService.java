package com.bytedance.android.live;

import X.BCE;
import X.C01D;
import X.C01E;
import X.C0JU;
import X.C0M5;
import X.C15380j0;
import X.C16880lQ;
import X.C1FC;
import X.C29044Baa;
import X.C29P;
import X.C31061Ju;
import X.C32537Cpp;
import X.CIV;
import X.CN1;
import X.EnumC30204BtI;
import X.InterfaceC09660Zm;
import X.InterfaceC09670Zn;
import X.InterfaceC30925CBt;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService;
import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent;
import com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.QuickCommentWidget;
import com.bytedance.android.livesdk.livesetting.other.subscribe.SubscribeShortPaySetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSubscribeLynxUrl;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import emotes.ui.EmotePreviewDialog;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public class CommentService implements ICommentService {
    public final C0M5<InterfaceC09660Zm> LJLIL = new C0M5<>();
    public final Set<InterfaceC09670Zn> LJLILLLLZI = new LinkedHashSet();

    @Override // com.bytedance.android.live.ICommentService
    public final Class<? extends LiveRecyclableWidget> XC() {
        return CommentWidget.class;
    }

    @Override // com.bytedance.android.live.ICommentService
    public final Class<? extends LiveRecyclableWidget> de0() {
        return QuickCommentWidget.class;
    }

    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.live.ICommentService
    public final void LLZLI() {
        DataChannelGlobal.LJLJJI.sv0(ShowKeyboardEvent.class, Boolean.FALSE);
    }

    @Override // com.bytedance.android.live.ICommentService
    public final List<C31061Ju> Td() {
        return C1FC.LIZIZ().LJ();
    }

    @Override // com.bytedance.android.live.ICommentService
    public final void Lt0(InterfaceC09670Zn l) {
        o.LJIIIZ(l, "l");
        this.LJLILLLLZI.remove(l);
    }

    @Override // com.bytedance.android.live.ICommentService
    public final void cn(InterfaceC09670Zn l) {
        o.LJIIIZ(l, "l");
        this.LJLILLLLZI.add(l);
    }

    @Override // com.bytedance.android.live.ICommentService
    public final void o50(Context context, DataChannel dataChannel) {
        EnumC30204BtI.COMMENT_EXT.load(dataChannel, new BCE(context));
    }

    @Override // com.bytedance.android.live.ICommentService
    public final void tD(Room room, DataChannel dataChannel) {
        o.LJIIIZ(dataChannel, "dataChannel");
        ((C32537Cpp) dataChannel.gv0(CIV.class)).LIZ = null;
    }

    @Override // com.bytedance.android.live.ICommentService
    public final void qr(long j, List list, ISendCommentEvent.Sender sender) {
        o.LJIIIZ(sender, "sender");
        InterfaceC09660Zm LJ = this.LJLIL.LJ(j, null);
        if (LJ != null) {
            LJ.LJJJJL(list, sender);
        }
    }

    @Override // com.bytedance.android.live.ICommentService
    public final void YJ(DataChannel dataChannel, EmoteModel emote, FragmentManager fragmentManager, boolean z) {
        C01D c01d;
        o.LJIIIZ(emote, "emote");
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room == null || room.getOwner() == null || !room.getOwner().isAnchorHasSubQualification()) {
            return;
        }
        if (dataChannel != null) {
            C01E c01e = (C01E) dataChannel.kv0(C29P.class);
            if (c01e != null) {
                c01d = c01e.LIZ(InterfaceC30925CBt.class);
            } else {
                c01d = null;
            }
            InterfaceC30925CBt interfaceC30925CBt = (InterfaceC30925CBt) c01d;
            if (interfaceC30925CBt != null && interfaceC30925CBt.LIZ(emote)) {
                return;
            }
        }
        if (SubscribeShortPaySetting.INSTANCE.getValue() && !room.getOwner().isSubscribed() && !z) {
            String anchor_user_badge_or_emotes_subscribe = LiveSubscribeLynxUrl.INSTANCE.getValue().getAnchor_user_badge_or_emotes_subscribe();
            LinkedHashMap LIZ = C0JU.LIZ("page_type", "emotes");
            ISubscribeService iSubscribeService = (ISubscribeService) CN1.LIZ(ISubscribeService.class);
            Context LIZLLL = C15380j0.LIZLLL();
            o.LJIIIIZZ(LIZLLL, "getContext()");
            iSubscribeService.Up(LIZLLL, room, anchor_user_badge_or_emotes_subscribe, "emote_preview", LIZ, emote.emoteId);
            return;
        }
        EmotePreviewDialog emotePreviewDialog = new EmotePreviewDialog();
        emotePreviewDialog.LJLLJ = emote;
        emotePreviewDialog.show(fragmentManager, C16880lQ.LJLLJ(EmotePreviewDialog.class));
    }

    @Override // com.bytedance.android.live.ICommentService
    public final void Em0(long j, String content, String str, int i, ISendCommentEvent.Sender sender) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(sender, "sender");
        InterfaceC09660Zm LJ = this.LJLIL.LJ(j, null);
        if (LJ != null) {
            LJ.LJIJI(content, str, i, sender);
        }
    }
}
