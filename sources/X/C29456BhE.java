package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.model.UserAttr;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.BhE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29456BhE {
    public final UserProfileEvent LIZ;
    public final User LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final List<Long> LJ;
    public final boolean LJFF;

    public final boolean LIZ() {
        if (this.LIZIZ.getId() == this.LIZLLL) {
            return true;
        }
        return false;
    }

    public final boolean LIZIZ() {
        UserAttr userAttr = this.LIZIZ.getUserAttr();
        if (userAttr != null) {
            return userAttr.isAdmin;
        }
        return false;
    }

    public final boolean LIZJ() {
        if (this.LIZJ == this.LIZLLL) {
            return true;
        }
        return false;
    }

    public final boolean LIZLLL() {
        if (this.LIZIZ.getId() == this.LIZJ) {
            return true;
        }
        return false;
    }

    public final boolean LJ() {
        return this.LJ.contains(Long.valueOf(this.LIZJ));
    }

    public C29456BhE(UserProfileEvent event, User selfUser, long j, long j2, List<Long> list, boolean z) {
        o.LJIIIZ(event, "event");
        o.LJIIIZ(selfUser, "selfUser");
        this.LIZ = event;
        this.LIZIZ = selfUser;
        this.LIZJ = j;
        this.LIZLLL = j2;
        this.LJ = list;
        this.LJFF = z;
    }
}
