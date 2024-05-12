package X;

import com.bytedance.android.live.liveinteract.voicechat.api.AbsVoiceChatSubWidget;
import com.bytedance.android.live.liveinteract.voicechat.main.AbsVoiceChatWidget;
import com.bytedance.android.live.liveinteract.voicechat.main.guest.VoiceChatGuestWidget;
import com.bytedance.android.live.liveinteract.voicechat.main.guest.VoiceChatWatchWidget;
import com.bytedance.android.livesdk.chatroom.ui.PortraitAudienceInteractionFragment;
import com.bytedance.android.widget.Widget;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Br9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30071Br9 implements TX9 {
    public final /* synthetic */ InterfaceC30069Br7 LIZ;
    public final /* synthetic */ PortraitAudienceInteractionFragment LIZIZ;

    @Override // X.TX9
    public final AbsVoiceChatSubWidget LIZJ() {
        VoiceChatWatchWidget LJI = this.LIZ.LJI();
        this.LIZIZ.mWidgetManager.load(R.id.h3c, (Widget) LJI, false);
        return LJI;
    }

    @Override // X.TX9
    public final void LIZ(AbsVoiceChatWidget absVoiceChatWidget) {
        this.LIZIZ.mWidgetManager.unload(absVoiceChatWidget);
    }

    @Override // X.TX9
    public final void LIZIZ(VoiceChatGuestWidget voiceChatGuestWidget) {
        this.LIZIZ.mWidgetManager.load(R.id.ndg, (Widget) voiceChatGuestWidget, false);
    }

    public C30071Br9(PortraitAudienceInteractionFragment portraitAudienceInteractionFragment, InterfaceC30069Br7 interfaceC30069Br7) {
        this.LIZIZ = portraitAudienceInteractionFragment;
        this.LIZ = interfaceC30069Br7;
    }
}
