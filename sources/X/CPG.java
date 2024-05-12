package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.UnauthorizedMemberMessage;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public final class CPG extends CQO<UnauthorizedMemberMessage> {
    public final CPH LJIL;

    @Override // X.CQL, X.InterfaceC29967BpT
    public final int LJJJ() {
        if (((UnauthorizedMemberMessage) this.LJIJJLI).action == 1) {
            return R.drawable.d2s;
        }
        return R.drawable.d2a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b8, code lost:
    
        if (r1 == null) goto L30;
     */
    @Override // X.CQL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence LJJZZIII() {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CPG.LJJZZIII():java.lang.CharSequence");
    }

    @Override // X.CQL
    public final boolean LJZI() {
        if (((UnauthorizedMemberMessage) this.LJIJJLI).action == 1 && (LJLJJL() || this.LJIJJLI.baseMessage.foldType != 0)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC31078CHq, X.CXK
    public final User getUser() {
        return this.LJIL;
    }

    public CPG(UnauthorizedMemberMessage unauthorizedMemberMessage) {
        super(unauthorizedMemberMessage);
        this.LJIL = new CPH(unauthorizedMemberMessage.nickName);
    }
}
