package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.userservice.UserService;
import kotlin.jvm.internal.AqS66S0000000_1;
import kotlin.jvm.internal.AqS69S0000000_9;
import kotlin.jvm.internal.AqS71S0000000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TC4 extends AbstractC73313Spx {
    public final TCK LJLILLLLZI;
    public final InterfaceC68904R2m<String, User> LJLJI;

    public TC4() {
        TCK tck = new TCK();
        this.LJLILLLLZI = tck;
        C68897R2f tc6 = new TC6();
        InterfaceC68904R2m LJ = UserService.LIZ().LJ();
        this.LJLJI = LJ;
        LLJLIL(tck, tc6, new AqS71S0000000_12(0));
        LJLILLLLZI(LJ, tc6, new AqS66S0000000_1(1));
        LLLLIILL(LJ, tc6, new AqS69S0000000_9(0));
    }

    public final C73422Sri LLLLZ(String userId, String secUserId, long j, int i, int i2, int i3, String str, String str2) {
        o.LJIIIZ(userId, "userId");
        o.LJIIIZ(secUserId, "secUserId");
        return this.LJLILLLLZI.LIZ(new TCI(i, i2, i3, 0, j, userId, secUserId, str, str2));
    }
}
