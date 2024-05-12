package Y;

import X.C26045AKb;
import X.C45804HyK;
import X.C49411JaJ;
import X.C51698KQs;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import android.app.Activity;
import android.view.View;
import com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel;
import com.ss.android.ugc.aweme.comment.keyboard.ui.KeyboardDialogFragment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;

/* loaded from: classes9.dex */
public class AObjectS41S0201000_8 implements InterfaceC88472Yns {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS41S0201000_8 aObjectS41S0201000_8, Object obj) {
        C51698KQs c51698KQs = (C51698KQs) aObjectS41S0201000_8.l0;
        int i = aObjectS41S0201000_8.i2;
        User user = (User) aObjectS41S0201000_8.l1;
        if (i == 4) {
            C51698KQs.LIZIZ(c51698KQs.LJLILLLLZI);
        }
        c51698KQs.LIZLLL(user);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AObjectS41S0201000_8 aObjectS41S0201000_8, Object obj) {
        switch (aObjectS41S0201000_8.i2) {
            case 0:
                KeyboardDialogFragment keyboardDialogFragment = (KeyboardDialogFragment) aObjectS41S0201000_8.l0;
                View view = (View) aObjectS41S0201000_8.l1;
                GiftViewModel giftViewModel = keyboardDialogFragment.LLJJ;
                if (giftViewModel != null) {
                    giftViewModel.jv0().postValue(null);
                }
                Activity LJIJJ = C45804HyK.LJIJJ(view.getContext());
                if (LJIJJ != null) {
                    C26045AKb c26045AKb = new C26045AKb(LJIJJ);
                    c26045AKb.LJIIIIZZ(R.string.tpd);
                    c26045AKb.LJI(R.attr.eb);
                    c26045AKb.LIZLLL(3000L);
                    c26045AKb.LJIIJ();
                }
                return C76800UCe.LIZ;
            default:
                C51698KQs c51698KQs = (C51698KQs) aObjectS41S0201000_8.l0;
                User user = (User) aObjectS41S0201000_8.l1;
                c51698KQs.LJLL = false;
                C49411JaJ c49411JaJ = c51698KQs.LJLJLJ;
                user.getFollowStatus();
                c49411JaJ.LIZ.l0();
                return C76800UCe.LIZ;
        }
    }

    public AObjectS41S0201000_8(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
