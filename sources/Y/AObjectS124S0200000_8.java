package Y;

import X.C0NB;
import X.C49411JaJ;
import X.C51698KQs;
import X.C76800UCe;
import X.C78072UkW;
import X.InterfaceC88472Yns;
import X.X1D;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Queue;

/* loaded from: classes9.dex */
public class AObjectS124S0200000_8 implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS124S0200000_8 aObjectS124S0200000_8, Object obj) {
        C51698KQs c51698KQs = (C51698KQs) aObjectS124S0200000_8.l0;
        User user = (User) aObjectS124S0200000_8.l1;
        C49411JaJ c49411JaJ = c51698KQs.LJLJLJ;
        user.getFollowStatus();
        c49411JaJ.LIZ.n0();
        c51698KQs.LIZLLL(user);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AObjectS124S0200000_8 aObjectS124S0200000_8, Object obj) {
        C51698KQs c51698KQs = (C51698KQs) aObjectS124S0200000_8.l0;
        User user = (User) aObjectS124S0200000_8.l1;
        C49411JaJ c49411JaJ = c51698KQs.LJLJLJ;
        user.getFollowStatus();
        c49411JaJ.LIZ.l0();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AObjectS124S0200000_8 aObjectS124S0200000_8, Object obj) {
        C51698KQs c51698KQs = (C51698KQs) aObjectS124S0200000_8.l0;
        User user = (User) aObjectS124S0200000_8.l1;
        C49411JaJ c49411JaJ = c51698KQs.LJLJLJ;
        user.getFollowStatus();
        c49411JaJ.LIZ.n0();
        c51698KQs.LIZLLL(user);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$3(AObjectS124S0200000_8 aObjectS124S0200000_8, Object obj) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("re-show the ongoing item: ");
        LIZ.append(obj);
        C0NB.LJIIIZ("GiftTrayMultiHost", X1D.LIZIZ(LIZ));
        if (obj != null) {
            ((Queue) aObjectS124S0200000_8.l1).add(obj);
        }
        MutableLiveData mutableLiveData = (MutableLiveData) aObjectS124S0200000_8.l0;
        Integer num = (Integer) mutableLiveData.getValue();
        if (num == null) {
            num = 0;
        }
        mutableLiveData.setValue(Integer.valueOf(num.intValue() + 1));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AObjectS124S0200000_8(Object obj, MutableLiveData<Integer> mutableLiveData, Queue<C78072UkW> queue) {
        this.$t = queue;
        this.l0 = obj;
        this.l1 = mutableLiveData;
    }

    public AObjectS124S0200000_8(int i, C51698KQs c51698KQs, User user, int i2) {
        this.$t = i2;
        this.l0 = c51698KQs;
        this.l1 = user;
    }
}
