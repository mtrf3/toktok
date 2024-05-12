package X;

import com.bytedance.android.live.liveinteract.voicechat.api.AbsVoiceChatSubWidget;
import com.bytedance.android.live.liveinteract.voicechat.main.AbsVoiceChatWidget;
import com.bytedance.android.live.liveinteract.voicechat.main.anchor.VoiceChatAnchorWidget;
import com.bytedance.android.live.liveinteract.voicechat.main.guest.VoiceChatGuestWidget;
import com.bytedance.android.livesdk.broadcast.voicechat.VoiceChatBroadcastInteractionFragment;
import com.bytedance.android.widget.Widget;
import com.bytedance.ies.sdk.widgets.LayeredWidgetManager;
import com.zhiliaoapp.musically.R;

/* renamed from: X.BtL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30207BtL implements TX9 {
    public final /* synthetic */ InterfaceC30069Br7 LIZ;
    public final /* synthetic */ VoiceChatBroadcastInteractionFragment LIZIZ;

    @Override // X.TX9
    public final AbsVoiceChatSubWidget LIZJ() {
        VoiceChatAnchorWidget LIZLLL = this.LIZ.LIZLLL();
        LayeredWidgetManager layeredWidgetManager = this.LIZIZ.LJLILLLLZI;
        if (layeredWidgetManager != null) {
            layeredWidgetManager.load(R.id.h3c, (Widget) LIZLLL, false);
        }
        return LIZLLL;
    }

    @Override // X.TX9
    public final void LIZ(AbsVoiceChatWidget absVoiceChatWidget) {
        LayeredWidgetManager layeredWidgetManager = this.LIZIZ.LJLILLLLZI;
        if (layeredWidgetManager != null) {
            layeredWidgetManager.unload(absVoiceChatWidget);
        }
    }

    @Override // X.TX9
    public final void LIZIZ(VoiceChatGuestWidget voiceChatGuestWidget) {
        LayeredWidgetManager layeredWidgetManager = this.LIZIZ.LJLILLLLZI;
        if (layeredWidgetManager != null) {
            layeredWidgetManager.load(R.id.ndg, voiceChatGuestWidget);
        }
    }

    public C30207BtL(InterfaceC30069Br7 interfaceC30069Br7, VoiceChatBroadcastInteractionFragment voiceChatBroadcastInteractionFragment) {
        this.LIZ = interfaceC30069Br7;
        this.LIZIZ = voiceChatBroadcastInteractionFragment;
    }
}
