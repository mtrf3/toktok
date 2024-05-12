package X;

import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.google.gson.internal.b;
import com.zhiliaoapp.musically.R;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommercebase.live.WindowLivePlayer$playPrepared$1", f = "WindowLivePlayer.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.SIe, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71860SIe extends AbstractC65782Prm implements InterfaceC88473Ynt<InterfaceC70422pa, View, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ ViewOnTouchListenerC71861SIf LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71860SIe(ViewOnTouchListenerC71861SIf viewOnTouchListenerC71861SIf, InterfaceC67352kd<? super C71860SIe> interfaceC67352kd) {
        super(3, interfaceC67352kd);
        this.LJLIL = viewOnTouchListenerC71861SIf;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        ViewOnTouchListenerC71861SIf viewOnTouchListenerC71861SIf = this.LJLIL;
        boolean z = !viewOnTouchListenerC71861SIf.LJLJLJ;
        viewOnTouchListenerC71861SIf.LJLJLJ = z;
        viewOnTouchListenerC71861SIf.LJLJL.setMute(z);
        java.util.Map LJJLIL = C113554cx.LJJLIL(this.LJLIL.LJLJLLL);
        ViewOnTouchListenerC71861SIf viewOnTouchListenerC71861SIf2 = this.LJLIL;
        if (viewOnTouchListenerC71861SIf2.LJLJLJ) {
            ((TuxIconView) viewOnTouchListenerC71861SIf2.LJLJJL.findViewById(R.id.guh)).setIconRes(R.raw.icon_speaker_x_mark_ltr);
            LJJLIL.put("action_type", "mute");
        } else {
            ((TuxIconView) viewOnTouchListenerC71861SIf2.LJLJJL.findViewById(R.id.guh)).setIconRes(R.raw.icon_speaker_2_ltr);
            LJJLIL.put("action_type", "unmute");
        }
        b.LJJIJIIJI("livesdk_tiktokec_mini_window_mute", LJJLIL);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, View view, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C71860SIe(this.LJLIL, interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
