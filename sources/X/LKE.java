package X;

import android.content.Context;
import android.text.Spanned;
import com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService;
import com.ss.android.ugc.aweme.recommend.users.IRecommendUsersServiceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LKE implements IRecommendUsersService {
    public static final LKE LIZIZ = new LKE();
    public final /* synthetic */ IRecommendUsersService LIZ = IRecommendUsersServiceImpl.LJIIIZ();

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final void LIZ(LKD lkd) {
        this.LIZ.LIZ(lkd);
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final void LIZIZ() {
        this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final Spanned LIZJ(Context context, Integer num, Integer num2, Integer num3, int i, String enterFrom, String str, int i2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(enterFrom, "enterFrom");
        return this.LIZ.LIZJ(context, num, num2, num3, i, enterFrom, str, i2, interfaceC65784Pro);
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final boolean LIZLLL(String tabName) {
        o.LJIIIZ(tabName, "tabName");
        return this.LIZ.LIZLLL(tabName);
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final String LJ() {
        return this.LIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final void LJFF(ActivityC45651qj activityC45651qj, String enterFrom, String str) {
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LIZ.LJFF(activityC45651qj, enterFrom, str);
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final boolean LJI(String str, String str2) {
        return this.LIZ.LJI(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final void LJII(String str, String str2) {
        this.LIZ.LJII(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final void LJIIIIZZ(String str) {
        this.LIZ.LJIIIIZZ(str);
    }
}
