package X;

import com.bytedance.android.livesdk.drawerfeed.LiveNonPersonalizedDialog;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BOV implements InterfaceC62896OmK {
    public final /* synthetic */ LiveNonPersonalizedDialog LIZ;

    @Override // X.InterfaceC62896OmK
    public final void LIZIZ(String str) {
    }

    @Override // X.InterfaceC62896OmK
    public final void LIZ() {
        this.LIZ.dismiss();
    }

    @Override // X.InterfaceC62896OmK
    public final void LJ() {
        LiveNonPersonalizedDialog liveNonPersonalizedDialog = this.LIZ;
        liveNonPersonalizedDialog.LJLIL = true;
        BOT.LJ(liveNonPersonalizedDialog.dataChannel, "done");
        this.LIZ.dismiss();
    }

    public BOV(LiveNonPersonalizedDialog liveNonPersonalizedDialog) {
        this.LIZ = liveNonPersonalizedDialog;
    }

    @Override // X.InterfaceC62896OmK
    public final void LIZJ(boolean z) {
        String str;
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        BOT.LJ(this.LIZ.dataChannel, str);
    }

    @Override // X.InterfaceC62896OmK
    public final void LIZLLL(String link) {
        o.LJIIIZ(link, "link");
        BOT.LJ(this.LIZ.dataChannel, "learn more");
    }
}
