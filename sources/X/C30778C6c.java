package X;

import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveClickCommentShowReplyPanelSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.FirstScreenDebounceClickEnabledSetting;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.android.livesdk.model.message.PinMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

/* renamed from: X.C6c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30778C6c extends C6Y {
    public C30778C6c(User user) {
        super(user);
        this.LJLJI = FirstScreenDebounceClickEnabledSetting.INSTANCE.getValue();
    }

    @Override // X.C6Y, X.C6L
    public final void LIZIZ(View view) {
        Object tag = view.getTag(R.id.lrn);
        if (tag instanceof CQO) {
            CQO<? extends CR6> cqo = (CQO) tag;
            if (cqo.LJIIJJI != null && cqo.LJLJJL() && LiveClickCommentShowReplyPanelSetting.getEnableClick()) {
                C30779C6d c30779C6d = new C30779C6d();
                c30779C6d.LJFF = "comment";
                c30779C6d.LIZ = "report_message";
                c30779C6d.LIZIZ = "click";
                cqo.LJIIJJI.LJ(cqo, c30779C6d);
                return;
            }
        }
        super.LIZIZ(view);
    }

    public C30778C6c(int i, User user) {
        super(i, user);
        this.LJLJI = FirstScreenDebounceClickEnabledSetting.INSTANCE.getValue();
    }

    @Override // X.C6Y
    public final void LIZJ(View view, C30926CBu c30926CBu, ISendCommentEvent.Sender sender) {
        Object obj;
        Text text;
        PinMessage pinMessage;
        java.util.Map<String, String> logArgs = sender.getLogArgs();
        Object tag = view.getTag(R.id.lrn);
        if (tag instanceof CQO) {
            CQO cqo = (CQO) tag;
            if (cqo.LJIILL.LIZIZ) {
                logArgs.put("reply_method", "pin");
                CS6 cs6 = cqo.LJIILL.LIZJ;
                if (cs6 != null && (pinMessage = cs6.LJI) != null) {
                    logArgs.put("pin_msg_id", String.valueOf(pinMessage.getMessageId()));
                    logArgs.put("pin_id", String.valueOf(pinMessage.pinId));
                }
            } else if (cqo.LJLJJLL()) {
                logArgs.put("reply_method", "anchor");
            } else {
                logArgs.put("reply_method", "viewer");
            }
            c30926CBu.LJIIJJI = cqo.LJIJJLI.getMessageId();
            c30926CBu.LJIIL = cqo.LJIILLIIL.LIZ;
            obj = cqo.LJIJJLI;
            logArgs.put("reply_event_page", "click_msg");
        } else {
            obj = null;
        }
        if ((obj instanceof MemberMessage) && (text = ((MemberMessage) obj).anchorDisplayText) != null && "pm_mt_guidance_interaction".equals(text.key)) {
            HashMap LIZ = C45243HpH.LIZ("event_type", "click", "click_module", "message");
            BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_interact_notice");
            LIZ2.LJJIFFI(LIZ);
            LIZ2.LJIIZILJ();
            LIZ2.LJJIIJZLJL();
            c30926CBu.LJI = "interact_guide";
        }
    }
}
