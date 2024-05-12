package Y;

import X.InterfaceC76622U5i;
import X.U7F;
import X.UB4;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyResult;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes14.dex */
public class ARunnableS0S0301100_13 implements Runnable {
    public final int $t;
    public int i3;
    public long j4;
    public Object l0;
    public Object l1;
    public Object l2;

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
        U7F u7f = (U7F) this.l0;
        CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = u7f.LJIILJJIL;
        ReplyInviteData replyInviteData = (ReplyInviteData) this.l1;
        int i = this.i3;
        Throwable th = (Throwable) this.l2;
        long j = this.j4;
        Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            List<UB4> LJJLIIIJLJLI = it.next().LJJLIIIJLJLI(u7f);
            if (LJJLIIIJLJLI != null) {
                for (UB4 ub4 : LJJLIIIJLJLI) {
                    if (ub4 != null) {
                        ub4.LIZIZ(i, replyInviteData.getInviter().getUserId(), j, th);
                    }
                }
            }
        }
    }

    public final void LIZ$1() {
        U7F u7f = (U7F) this.l0;
        CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = u7f.LJIILJJIL;
        ReplyInviteData replyInviteData = (ReplyInviteData) this.l1;
        int i = this.i3;
        ReplyResult replyResult = (ReplyResult) this.l2;
        long j = this.j4;
        Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            List<UB4> LJJLIIIJLJLI = it.next().LJJLIIIJLJLI(u7f);
            if (LJJLIIIJLJLI != null) {
                for (UB4 ub4 : LJJLIIIJLJLI) {
                    if (ub4 != null) {
                        ub4.LIZ(i, replyInviteData.getInviter().getUserId(), j, replyResult.logId);
                    }
                }
            }
        }
    }

    public static final void run$0(ARunnableS0S0301100_13 aRunnableS0S0301100_13) {
        boolean LIZ;
        try {
            aRunnableS0S0301100_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S0301100_13 aRunnableS0S0301100_13) {
        boolean LIZ;
        try {
            aRunnableS0S0301100_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S0301100_13(U7F u7f, LinkMessage linkMessage, ReplyInviteData replyInviteData, int i, ReplyResult replyResult, long j, int i2) {
        this.$t = i2;
        this.l0 = u7f;
        this.l1 = replyInviteData;
        this.i3 = i;
        this.l2 = replyResult;
        this.j4 = j;
    }

    public ARunnableS0S0301100_13(U7F u7f, LinkMessage linkMessage, ReplyInviteData replyInviteData, int i, Throwable th, long j, int i2) {
        this.$t = i2;
        this.l0 = u7f;
        this.l1 = replyInviteData;
        this.i3 = i;
        this.l2 = th;
        this.j4 = j;
    }
}
