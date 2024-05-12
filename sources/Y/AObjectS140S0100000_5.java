package Y;

import X.B5G;
import X.C0NB;
import X.C75492Tk0;
import X.C75648TmW;
import X.C76800UCe;
import X.EnumC30098Bra;
import X.InterfaceC75495Tk3;
import X.InterfaceC88471Ynr;
import X.X1D;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;

/* loaded from: classes6.dex */
public class AObjectS140S0100000_5 implements InterfaceC88471Ynr {
    public final int $t;
    public Object l0;

    public static final Object invoke$0(AObjectS140S0100000_5 aObjectS140S0100000_5, Object obj, Object obj2) {
        C76800UCe lambda$onActivityCreated$19;
        lambda$onActivityCreated$19 = ((AbsAudienceInteractionFragment) aObjectS140S0100000_5.l0).lambda$onActivityCreated$19((EnumC30098Bra) obj, (EnumC30098Bra) obj2);
        return lambda$onActivityCreated$19;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            default:
                return null;
        }
    }

    public AObjectS140S0100000_5(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object invoke$1(AObjectS140S0100000_5 aObjectS140S0100000_5, Object obj, Object obj2) {
        C75492Tk0 c75492Tk0 = (C75492Tk0) aObjectS140S0100000_5.l0;
        c75492Tk0.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SessionDestroyMessage,  message = ");
        LIZ.append(obj2);
        C0NB.LJIIIZ("LinkControlPresenter", X1D.LIZIZ(LIZ));
        T t = c75492Tk0.mView;
        if (t != 0) {
            ((InterfaceC75495Tk3) t).J50();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AObjectS140S0100000_5 aObjectS140S0100000_5, Object obj, Object obj2) {
        String str;
        C75492Tk0 c75492Tk0 = (C75492Tk0) aObjectS140S0100000_5.l0;
        c75492Tk0.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OpenUserListMessage,  message = ");
        LIZ.append(obj2);
        C0NB.LJIIIZ("LinkControlPresenter", X1D.LIZIZ(LIZ));
        if (c75492Tk0.mView != 0) {
            C75648TmW c75648TmW = B5G.LIZIZ().LJJJ;
            InterfaceC75495Tk3 interfaceC75495Tk3 = (InterfaceC75495Tk3) c75492Tk0.mView;
            if (c75648TmW != null) {
                str = c75648TmW.LIZ;
            } else {
                str = null;
            }
            interfaceC75495Tk3.eG(str);
        }
        return C76800UCe.LIZ;
    }
}
