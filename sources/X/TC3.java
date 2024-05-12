package X;

import Y.AfS53S0100000_1;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.userservice.UserService;
import kotlin.jvm.internal.AqS66S0000000_1;
import kotlin.jvm.internal.AqS69S0000000_9;
import kotlin.jvm.internal.AqS71S0000000_12;

/* loaded from: classes13.dex */
public final class TC3 extends AbstractC73313Spx {
    public final TCJ LJLILLLLZI;
    public final TC6 LJLJI;
    public final InterfaceC68904R2m<String, User> LJLJJI;
    public final String LJLJJL;
    public final C73411SrX LJLJJLL;

    public TC3() {
        TCJ tcj = new TCJ();
        this.LJLILLLLZI = tcj;
        TC6 tc6 = new TC6();
        this.LJLJI = tc6;
        InterfaceC68904R2m LJ = UserService.LIZ().LJ();
        this.LJLJJI = LJ;
        this.LJLJJL = "FollowingListRepo";
        LLJLIL(tcj, tc6, new AqS71S0000000_12(1));
        LJLILLLLZI(LJ, tc6, new AqS66S0000000_1(3));
        LLLLIILL(LJ, tc6, new AqS69S0000000_9(1));
        this.LJLJJLL = (C73411SrX) UC0.LJ(LJ).LIZJ(true, new InterfaceC68914R2w[0]).LJJJLIIL(new AfS53S0100000_1(this, 15), new AfS53S0100000_1(this, 16));
    }

    public final C73422Sri LLLLZ(String str, String str2, long j, int i, int i2, int i3, String str3, int i4) {
        HH1.LIZ(str, "userId", str2, "secUserId", str3, "pageToken");
        return this.LJLILLLLZI.LIZ(new TCI(i, i2, i3, i4, j, str, str2, str3, null));
    }
}
