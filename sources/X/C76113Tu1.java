package X;

import com.bytedance.android.livesdk.chatroom.model.interact.CohostListUser;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Tu1, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76113Tu1 extends F9E {
    public final String LJLIL;
    public final long LJLILLLLZI;
    public final List<CohostListUser> LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Long.valueOf(this.LJLILLLLZI), this.LJLJI};
    }

    public C76113Tu1(long j, String rtcExtInfo, List users) {
        o.LJIIIZ(rtcExtInfo, "rtcExtInfo");
        o.LJIIIZ(users, "users");
        this.LJLIL = rtcExtInfo;
        this.LJLILLLLZI = j;
        this.LJLJI = users;
    }
}
