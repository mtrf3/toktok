package Y;

import X.BZI;
import X.C06540Nm;
import X.C279117r;
import X.C28787BRn;
import X.C28852BUa;
import X.C29374Bfu;
import X.UFE;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.livesdk.qa.AskQuestionDialog;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* loaded from: classes6.dex */
public class ARunnableS0S2100000_5 implements Runnable {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        ((AskQuestionDialog) this.l2).xl(true);
        DataChannel dataChannel = ((AskQuestionDialog) this.l2).dataChannel;
        String str = this.s0;
        String str2 = this.s1;
        BZI LIZ = C28787BRn.LIZ("livesdk_qa_rethink_post_ck");
        C06540Nm.LJFF((C29374Bfu) C279117r.LIZJ(LIZ, dataChannel), LIZ, "user_id", str2, "comment");
        LIZ.LJIJJ(Integer.valueOf(TextUtils.equals(str, str2) ? 1 : 0), "resend_same_cmt");
        UFE.LIZIZ(C28852BUa.LIZ ? 1 : 0, LIZ, "if_click_cg");
    }

    public final void LIZ$1() {
        DataChannel dataChannel = ((AskQuestionDialog) this.l2).dataChannel;
        String str = this.s0;
        String str2 = this.s1;
        BZI LIZ = C28787BRn.LIZ("livesdk_qa_rethink_edit_ck");
        C06540Nm.LJFF((C29374Bfu) C279117r.LIZJ(LIZ, dataChannel), LIZ, "user_id", str2, "comment");
        LIZ.LJIJJ(Integer.valueOf(TextUtils.equals(str, str2) ? 1 : 0), "resend_same_cmt");
        LIZ.LJIJJ(Integer.valueOf(C28852BUa.LIZ ? 1 : 0), "if_click_cg");
        LIZ.LJJIIJZLJL();
        C28852BUa.LIZIZ = SystemClock.uptimeMillis();
        C28852BUa.LIZJ = str2;
    }

    public static final void run$0(ARunnableS0S2100000_5 aRunnableS0S2100000_5) {
        boolean LIZ;
        try {
            aRunnableS0S2100000_5.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S2100000_5 aRunnableS0S2100000_5) {
        boolean LIZ;
        try {
            aRunnableS0S2100000_5.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S2100000_5(AskQuestionDialog askQuestionDialog, String str, String str2, int i) {
        this.$t = i;
        this.l2 = askQuestionDialog;
        this.s0 = str;
        this.s1 = str2;
    }
}
