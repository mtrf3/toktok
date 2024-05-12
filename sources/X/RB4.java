package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.user.SignificantUserInfo;
import com.ss.android.ugc.aweme.user.UserStore;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final /* synthetic */ class RB4 extends TBS implements InterfaceC65784Pro<SignificantUserInfo> {
    public RB4(RB3 rb3) {
        super(0, rb3, RB3.class, "significantUserInfoUpgrade", "significantUserInfoUpgrade()Lcom/ss/android/ugc/aweme/user/SignificantUserInfo;", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final SignificantUserInfo invoke() {
        String str;
        RB3 rb3 = (RB3) this.receiver;
        rb3.getClass();
        User LJI = UserStore.LJI();
        if (LJI != null) {
            str = LJI.getUid();
        } else {
            str = null;
        }
        if (!o.LJ(str, rb3.LIZ) || LJI == null) {
            return null;
        }
        return C68543QvD.LIZIZ(LJI);
    }
}
