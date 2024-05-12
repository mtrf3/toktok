package Y;

import X.C76800UCe;
import X.InterfaceC88472Yns;
import android.text.SpannableStringBuilder;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.bytedance.android.livesdk.chatroom.ui.LiveEmojiInputDialogFragment;

/* loaded from: classes6.dex */
public class AObjectS54S1100000_5 implements InterfaceC88472Yns {
    public final int $t;
    public Object l1;
    public String s0;

    public static final Object invoke$1(AObjectS54S1100000_5 aObjectS54S1100000_5, Object obj) {
        C76800UCe lambda$onViewCreated$1;
        lambda$onViewCreated$1 = ((AbsAudienceInteractionFragment) aObjectS54S1100000_5.l1).lambda$onViewCreated$1(aObjectS54S1100000_5.s0, (C76800UCe) obj);
        return lambda$onViewCreated$1;
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS54S1100000_5 aObjectS54S1100000_5, Object obj) {
        LiveEmojiInputDialogFragment liveEmojiInputDialogFragment = (LiveEmojiInputDialogFragment) aObjectS54S1100000_5.l1;
        String str = aObjectS54S1100000_5.s0;
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) obj;
        liveEmojiInputDialogFragment.LLIFFJFJJ.setVisibility(0);
        spannableStringBuilder.insert(0, (CharSequence) str);
        liveEmojiInputDialogFragment.LLIFFJFJJ.setText(spannableStringBuilder);
        return C76800UCe.LIZ;
    }

    public AObjectS54S1100000_5(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
