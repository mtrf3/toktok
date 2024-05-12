package X;

import Y.ARunnableS12S0101000_8;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenMockChatHighlightDelaySetting;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public final class CQM extends C31270CPa {
    public boolean LJJJJZI;
    public boolean LJJJLIIL;
    public final ForegroundColorSpan LJJJLL;

    @Override // X.CQL, X.InterfaceC31368CSu
    public final void LJJLL() {
        if (!this.LJJJJZI) {
            if (LivePublicScreenMockChatHighlightDelaySetting.INSTANCE.getValue() > 0) {
                this.LJJJJZI = true;
                this.LJIJ.postDelayed(new ARunnableS12S0101000_8(0, this, 33), r4.getValue());
            }
        }
    }

    @Override // X.CQJ
    public final SpannableStringBuilder LLILII() {
        User user;
        SpannableStringBuilder spannableStringBuilder = this.LJJIL;
        if (spannableStringBuilder == null) {
            String LIZIZ = C0YG.LIZIZ(((ChatMessage) this.LJIJJLI).content);
            if (LIZIZ == null || (user = ((ChatMessage) this.LJIJJLI).userInfo) == null || TextUtils.isEmpty(C05170If.LIZ(user)) || TextUtils.isEmpty(C05170If.LIZ(user)) || TextUtils.isEmpty(LIZIZ)) {
                LIZIZ = "";
            }
            spannableStringBuilder = C31418CUs.LIZ(((ChatMessage) this.LJIJJLI).f117emotes, CQW.PUBLICSCREEN_MESSAGE_TYPE, LIZIZ, this.LJJJJLI, this.LJJIIJ, this.LJJJJJ, null, false);
            spannableStringBuilder.setSpan(new C30778C6c(0, ((ChatMessage) this.LJIJJLI).userInfo), 0, spannableStringBuilder.length(), 33);
            if (LivePublicScreenMockChatHighlightDelaySetting.INSTANCE.getValue() != 0) {
                spannableStringBuilder.setSpan(this.LJJJLL, 0, spannableStringBuilder.length(), 33);
            }
        }
        return spannableStringBuilder;
    }

    @Override // X.CQJ, X.CQK, X.CQL, X.CRD
    public final void dispose() {
        super.dispose();
        this.LJIJ.removeCallbacksAndMessages(null);
    }

    public CQM(ChatMessage chatMessage) {
        super(chatMessage);
        ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).m90().getClass();
        this.LJJJLL = new ForegroundColorSpan(C15380j0.LIZIZ(R.color.a8i));
    }

    @Override // X.CQJ
    public final void LLILL(SpannableStringBuilder spannableStringBuilder) {
        LLILLJJLI(spannableStringBuilder);
    }

    @Override // X.CQJ
    public final void LLILLIZIL(SpannableStringBuilder spannableStringBuilder) {
        LLILLJJLI(spannableStringBuilder);
    }

    public final void LLILLJJLI(SpannableStringBuilder spannableStringBuilder) {
        if (spannableStringBuilder != null && LivePublicScreenMockChatHighlightDelaySetting.INSTANCE.getValue() != 0) {
            if (!this.LJJJLIIL) {
                spannableStringBuilder.setSpan(this.LJJJLL, 0, spannableStringBuilder.length(), 33);
            } else {
                spannableStringBuilder.removeSpan(this.LJJJLL);
            }
        }
    }
}
