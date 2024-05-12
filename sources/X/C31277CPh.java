package X;

import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.broadcast.BroadcastGameFloatWindowLibra;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.CPh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31277CPh extends C31276CPg {
    @Override // X.C31276CPg, X.CQL
    public final CharSequence LJJZZIII() {
        if (((MemberMessage) this.LJIJJLI).action == 1) {
            if (LLII() || LLIFFJFJJ() || ((MemberMessage) this.LJIJJLI).isTopUser) {
                return CPR.LIZLLL(((MemberMessage) this.LJIJJLI).user, "  ", LLFII(), R.color.a8k, R.color.a8j, this);
            }
            return LJLLLL();
        }
        return super.LJJZZIII();
    }

    @Override // X.CQL, X.CXK
    public final int LJIIL() {
        return C15380j0.LIZIZ(R.color.a13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31277CPh(MemberMessage message) {
        super(message);
        o.LJIIIZ(message, "message");
    }

    @Override // X.CQL, X.CXK
    public final BadgeStruct LJJJJJ(User user) {
        o.LJIIIZ(user, "user");
        if (BroadcastGameFloatWindowLibra.INSTANCE.isExperimentGroup()) {
            return null;
        }
        return super.LJJJJJ(user);
    }
}
