package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.userservice.UserService;
import kotlin.jvm.internal.AqS66S0000000_1;
import kotlin.jvm.internal.AqS69S0000000_9;
import kotlin.jvm.internal.AqS71S0000000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TC5 extends AbstractC73313Spx {
    public final TCD LJLILLLLZI;
    public final InterfaceC68904R2m<String, User> LJLJI;

    public TC5() {
        TCD tcd = new TCD();
        this.LJLILLLLZI = tcd;
        C68897R2f tc7 = new TC7();
        InterfaceC68904R2m LJ = UserService.LIZ().LJ();
        this.LJLJI = LJ;
        LLJLIL(tcd, tc7, new AqS71S0000000_12(2));
        LJLILLLLZI(LJ, tc7, new AqS66S0000000_1(5));
        LLLLIILL(LJ, tc7, new AqS69S0000000_9(2));
    }

    public final C73422Sri LLLLZ(String userId, String secUserId, long j, int i, int i2, int i3, int i4) {
        o.LJIIIZ(userId, "userId");
        o.LJIIIZ(secUserId, "secUserId");
        return this.LJLILLLLZI.LIZ(new TCE(userId, secUserId, j, i, i2, i3, i4));
    }
}
