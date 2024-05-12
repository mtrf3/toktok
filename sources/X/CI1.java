package X;

import Y.AObjectS86S0300000_5;
import android.text.Editable;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.livesdk.chatroom.ui.LiveEmojiInputDialogFragment;

/* loaded from: classes6.dex */
public final class CI1 implements InterfaceC42211lB {
    public final /* synthetic */ LiveEmojiInputDialogFragment LIZ;

    @Override // X.InterfaceC32191Od
    public final void LIZIZ(C0Y5 c0y5) {
    }

    @Override // X.InterfaceC32191Od
    public final void LIZ() {
        this.LIZ.vl();
    }

    public CI1(LiveEmojiInputDialogFragment liveEmojiInputDialogFragment) {
        this.LIZ = liveEmojiInputDialogFragment;
    }

    @Override // X.C0YL
    public final void LIZJ(C31061Ju c31061Ju) {
        String obj;
        C31089CIb c31089CIb = this.LIZ.LLI;
        if (c31089CIb == null) {
            return;
        }
        Editable text = c31089CIb.getText();
        LiveEmojiInputDialogFragment liveEmojiInputDialogFragment = this.LIZ;
        if (text == null) {
            obj = "";
        } else {
            obj = text.toString();
        }
        liveEmojiInputDialogFragment.LJZI = obj;
        EmoteModel emoteModel = (EmoteModel) c31061Ju;
        C31418CUs.LIZIZ(emoteModel, CQW.INPUT_PANNEL, this.LIZ, new AObjectS86S0300000_5(this, text, emoteModel, 1));
    }
}
