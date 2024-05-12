package X;

import android.app.Activity;
import android.app.Dialog;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feedback.reply.FeedbackNewestReplyApi;
import com.ss.android.ugc.aweme.feedback.reply.NewestReply;
import com.ss.android.ugc.aweme.feedback.reply.ReplyInfo;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("feedback_replay_dialog")
/* renamed from: X.FvH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40519FvH extends AbstractC56328M8u<Dialog> {
    public final Activity LJLJJL;

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return 225;
    }

    @Override // X.InterfaceC55641Lsb
    public final C54082LKk getPopupContext() {
        LifecycleOwner LIZIZ = C57434MgQ.LIZIZ(this.LJLJJL);
        if (LIZIZ != null) {
            return C54081LKj.LIZ(this.LJLJJL, LIZIZ);
        }
        return null;
    }

    public C40519FvH(ActivityC45651qj activityC45651qj) {
        this.LJLJJL = activityC45651qj;
    }

    @Override // X.InterfaceC56316M8i
    public final void LJI(C54082LKk context) {
        NewestReply newestReply;
        ReplyInfo replyInfo;
        o.LJIIIZ(context, "context");
        if (C40278FrO.LIZ == null) {
            C40278FrO.LIZ = Keva.getRepo("HasFeedbackKeva");
        }
        Keva keva = C40278FrO.LIZ;
        if (keva != null && keva.getBoolean("has", false)) {
            try {
                NewestReply newestReply2 = FeedbackNewestReplyApi.LIZ.getNewestReply().execute().LIZIZ;
                o.LJIIIIZZ(newestReply2, "{\n                api.ge…te().body()\n            }");
                newestReply = newestReply2;
            } catch (Exception unused) {
                newestReply = new NewestReply(null, 0, null, 7, null);
            }
            if (newestReply.errCode == 0 && (replyInfo = newestReply.replyInfo) != null && o.LJ(replyInfo.hasReply, Boolean.TRUE) && V1B.LJJZZI(C84763XOl.LJIIIIZZ(), false) && C38752FIu.LIZ() > 0) {
                V1M.LJJJJJ(this, true);
                return;
            }
        }
        V1M.LJJJJJ(this, false);
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C54082LKk context) {
        o.LJIIIZ(context, "context");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("uid", ((RBX) HG3.LJIILL()).getCurUserId());
        FMX.LJIIL("feedback_reply_alert", c188727au.LIZ);
        C26227ARb c26227ARb = new C26227ARb(context.LIZ);
        c26227ARb.LIZ(R.string.hgi);
        UC0.LIZJ(c26227ARb, new AqS170S0100000_4(this, 380));
        return c26227ARb.LJI().LJ();
    }
}
