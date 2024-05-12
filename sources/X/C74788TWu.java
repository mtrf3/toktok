package X;

import android.content.Context;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.CurrentRealDisplayChannel;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ChangeMaxPositionResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.dataChannel.VoiceChatStartFailedEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.voicechat.VoiceChatReconnectSettings;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.TWu, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74788TWu implements InterfaceC75414Tik<ChangeMaxPositionResult> {
    public final /* synthetic */ C74843TYx LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ Room LJLJI;

    @Override // X.InterfaceC75414Tik
    public final void onSuccess(ChangeMaxPositionResult value) {
        o.LJIIIZ(value, "value");
        C0NB.LIZIZ("VoiceChatAnchorPresenter", "changeLayout onSuccess");
        DataChannel dataChannel = this.LJLIL.dataChannel;
        if (dataChannel != null) {
            dataChannel.rv0(CurrentRealDisplayChannel.class, new OSZ(this.LJLILLLLZI, 2));
        }
        HashMap LIZLLL = C73098SmU.LIZLLL();
        LIZLLL.put("costTime", String.valueOf(C31012CFc.LIZIZ() - C74824TYe.LJIIJ));
        C74824TYe.LJLL("livesdk_audio_chat_init_succeed", LIZLLL);
        this.LJLIL.LJJJLZIJ(this.LJLJI);
    }

    @Override // X.InterfaceC75414Tik
    public final void LJ(LinkCoreError error, Throwable th) {
        Context context;
        String str;
        o.LJIIIZ(error, "error");
        C0NB.LJ("VoiceChatAnchorPresenter", "changeLayout onFail");
        InterfaceC31336CRo interfaceC31336CRo = (InterfaceC31336CRo) this.LJLIL.mView;
        if (interfaceC31336CRo != null) {
            context = interfaceC31336CRo.getContext();
        } else {
            context = null;
        }
        BPP.LIZJ(context, th);
        if (th != null) {
            C74987Tbr.LIZIZ("VoiceChatAnchorPresenter", "changeMaxPosition failed,", th);
        }
        C74843TYx c74843TYx = this.LJLIL;
        String valueOf = String.valueOf(error.getErrorCode());
        String errorMsg = error.getErrorMsg();
        if (th instanceof CH1) {
            str = ((CH1) th).getxTtLogId();
        } else {
            str = "";
        }
        o.LJIIIIZZ(str, "if (throwable is CustomA…                        }");
        c74843TYx.getClass();
        if (VoiceChatReconnectSettings.INSTANCE.getValue()) {
            int i = c74843TYx.LJLLI + 1;
            c74843TYx.LJLLI = i;
            if (i >= 3) {
                C30868C9o.LIZJ(R.string.nem);
                c74843TYx.dataChannel.pv0(VoiceChatStartFailedEvent.class);
                C74824TYe.LJLJLLL("change_layout_error", valueOf, errorMsg, str);
            } else {
                C30868C9o.LIZJ(R.string.nel);
                c74843TYx.LJJJJLL(c74843TYx.LJLJI);
            }
        }
    }

    public C74788TWu(C74843TYx c74843TYx, String str, Room room) {
        this.LJLIL = c74843TYx;
        this.LJLILLLLZI = str;
        this.LJLJI = room;
    }
}
