package X;

import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.broadcast.BroadcastGameFloatWindowLibra;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.CPv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31291CPv extends C31290CPu {
    public CharSequence LJIL;

    @Override // X.CQL
    public final boolean LJLJJL() {
        return true;
    }

    @Override // X.CQL, X.CXK
    public final int LJIIL() {
        return C15380j0.LIZIZ(R.color.a13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31291CPv(GiftMessage message) {
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
