package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.user.SignificantUserInfo;
import com.ss.android.ugc.aweme.user.UserStore;
import kotlin.jvm.internal.AqS161S0100000_11;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class RB3 {
    public final String LIZ;
    public final C62822Ol8 LIZIZ;
    public final C62822Ol8 LIZJ;
    public final C62822Ol8 LIZLLL;

    public final C65771Prb<UserStore.AccountUser> LIZ() {
        return (C65771Prb) this.LIZJ.getValue();
    }

    public final C65771Prb<User> LIZIZ() {
        return (C65771Prb) this.LIZIZ.getValue();
    }

    public final C65771Prb<SignificantUserInfo> LIZJ() {
        return (C65771Prb) this.LIZLLL.getValue();
    }

    public final void LIZLLL() {
        LIZIZ().LIZ();
        LIZ().LIZ();
        LIZJ().LIZ();
    }

    public RB3(String uid) {
        o.LJIIIZ(uid, "uid");
        this.LIZ = uid;
        this.LIZIZ = C221108m2.LIZIZ(new AqS161S0100000_11(this, 64));
        this.LIZJ = C221108m2.LIZIZ(new AqS161S0100000_11(this, 63));
        this.LIZLLL = C221108m2.LIZIZ(new AqS161S0100000_11(this, 65));
    }
}
