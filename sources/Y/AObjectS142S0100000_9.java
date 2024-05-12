package Y;

import X.C57521Mhp;
import X.C57524Mhs;
import X.InterfaceC88471Ynr;
import com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment;
import com.ss.android.ugc.aweme.profile.model.User;

/* loaded from: classes10.dex */
public class AObjectS142S0100000_9 implements InterfaceC88471Ynr {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    public AObjectS142S0100000_9(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object invoke$0(AObjectS142S0100000_9 aObjectS142S0100000_9, Object obj, Object obj2) {
        User user = (User) obj;
        Integer num = (Integer) obj2;
        C57524Mhs c57524Mhs = ((C57521Mhp) aObjectS142S0100000_9.l0).LJLJLLL;
        if (c57524Mhs != null) {
            c57524Mhs.LIZ(user, num.intValue());
            return null;
        }
        return null;
    }

    public static final Object invoke$1(AObjectS142S0100000_9 aObjectS142S0100000_9, Object obj, Object obj2) {
        FeedFollowFragment feedFollowFragment = (FeedFollowFragment) aObjectS142S0100000_9.l0;
        Float f = (Float) obj2;
        feedFollowFragment.getClass();
        boolean z = false;
        if (Math.abs(f.floatValue()) > Math.abs(((Float) obj).floatValue()) && (f.floatValue() < 0.0f || feedFollowFragment.LLFZ.mCurIndex != 0)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
