package X;

import com.bytedance.android.live.liveinteract.multihost.biz.link.MultiCoHostWidget;
import com.bytedance.android.livesdk.chatroom.ui.PortraitAudienceInteractionFragment;
import com.bytedance.android.widget.Widget;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Bqs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30054Bqs implements InterfaceC32212Cka {
    public final /* synthetic */ InterfaceC30069Br7 LIZ;
    public final /* synthetic */ PortraitAudienceInteractionFragment LIZIZ;

    @Override // X.InterfaceC32212Cka
    public final void LIZ(LiveWidget liveWidget) {
        this.LIZIZ.mWidgetManager.unload(liveWidget);
    }

    public C30054Bqs(PortraitAudienceInteractionFragment portraitAudienceInteractionFragment, InterfaceC30069Br7 interfaceC30069Br7) {
        this.LIZIZ = portraitAudienceInteractionFragment;
        this.LIZ = interfaceC30069Br7;
    }

    @Override // X.InterfaceC32212Cka
    public final InterfaceC75487Tjv LIZIZ(int i, boolean z) {
        if (i != 2) {
            if (i != 6) {
                return null;
            }
            InterfaceC30069Br7 interfaceC30069Br7 = this.LIZ;
            this.LIZIZ.rootView.findViewById(R.id.epk);
            MultiCoHostWidget LIZ = interfaceC30069Br7.LIZ(z);
            this.LIZIZ.mWidgetManager.load(R.id.hql, (Widget) LIZ, false);
            PortraitAudienceInteractionFragment portraitAudienceInteractionFragment = this.LIZIZ;
            IMessage iMessage = (IMessage) portraitAudienceInteractionFragment.mDataChannel.kv0(BDD.class);
            if (iMessage != null) {
                portraitAudienceInteractionFragment.messageManager.insertMessage(iMessage);
            }
            ((C32537Cpp) portraitAudienceInteractionFragment.mDataChannel.gv0(BDD.class)).LIZ = null;
            return LIZ;
        }
        InterfaceC30069Br7 interfaceC30069Br72 = this.LIZ;
        this.LIZIZ.rootView.findViewById(R.id.epk);
        interfaceC30069Br72.LJ();
        this.LIZIZ.mWidgetManager.load(R.id.hql, (Widget) null, false);
        PortraitAudienceInteractionFragment portraitAudienceInteractionFragment2 = this.LIZIZ;
        IMessage iMessage2 = (IMessage) portraitAudienceInteractionFragment2.mDataChannel.kv0(BDD.class);
        if (iMessage2 != null) {
            portraitAudienceInteractionFragment2.messageManager.insertMessage(iMessage2);
        }
        ((C32537Cpp) portraitAudienceInteractionFragment2.mDataChannel.gv0(BDD.class)).LIZ = null;
        return null;
    }
}
