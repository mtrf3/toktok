package Y;

import X.C106674Gp;
import X.C115074fP;
import X.C16880lQ;
import X.C3Q9;
import X.C3QW;
import X.C3WT;
import X.C45804HyK;
import X.C4WC;
import X.C5S1;
import X.C63120Opw;
import X.C68322mC;
import X.C73340SqO;
import X.C75782yE;
import X.C98523to;
import X.EnumC96103pu;
import X.InterfaceC64592gB;
import X.InterfaceC88472Yns;
import X.V1B;
import X.X1D;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.donation.token.DonationSessionResponse;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class AfS41S0300000_1 implements InterfaceC64592gB {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS41S0300000_1 afS41S0300000_1, Object obj) {
        Integer num;
        BaseResponse baseResponse = (BaseResponse) obj;
        Context context = ((C3WT) afS41S0300000_1.l0).getContext();
        o.LJIIIIZZ(context, "context");
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (LJIJJ != null && C73340SqO.LJJIJ(LJIJJ)) {
            if (baseResponse != null && baseResponse.status_code == 0) {
                C3WT c3wt = (C3WT) afS41S0300000_1.l0;
                String conversationId = ((C98523to) afS41S0300000_1.l1).getConversationId();
                c3wt.getClass();
                C3Q9.LIZ.getClass();
                C75782yE.LIZ();
                C63120Opw LIZ = C4WC.LIZIZ.LIZ(conversationId);
                if (LIZ != null) {
                    C75782yE.LIZ();
                    C4WC.LJJ(LIZ);
                }
                C3WT c3wt2 = (C3WT) afS41S0300000_1.l0;
                ARunnableS20S0200000_1 aRunnableS20S0200000_1 = new ARunnableS20S0200000_1((EnumC96103pu) afS41S0300000_1.l2, LJIJJ, 16);
                c3wt2.getClass();
                new Handler(C16880lQ.LLJJJJ()).post(aRunnableS20S0200000_1);
            } else {
                ((C3WT) afS41S0300000_1.l0).LJFF();
            }
        }
        if (baseResponse != null && baseResponse.status_code == 0) {
            C3WT c3wt3 = (C3WT) afS41S0300000_1.l0;
            String conversationId2 = ((C98523to) afS41S0300000_1.l1).getConversationId();
            c3wt3.getClass();
            C3Q9.LIZ.getClass();
            C75782yE.LIZ();
            C63120Opw LIZ2 = C4WC.LIZIZ.LIZ(conversationId2);
            if (LIZ2 != null) {
                C75782yE.LIZ();
                C4WC.LJJ(LIZ2);
            }
            if (C3QW.LIZ().pullMsgWhenAccept && !C115074fP.LIZJ()) {
                C106674Gp.LJIIJJI("stranger_accepted", false);
            }
            C3WT c3wt4 = (C3WT) afS41S0300000_1.l0;
            ARunnableS37S0100000_1 aRunnableS37S0100000_1 = new ARunnableS37S0100000_1(c3wt4, 37);
            c3wt4.getClass();
            new Handler(C16880lQ.LLJJJJ()).post(aRunnableS37S0100000_1);
        } else {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("postChatStrangeUnLimit status_code: ");
            if (baseResponse != null) {
                num = Integer.valueOf(baseResponse.status_code);
            } else {
                num = null;
            }
            LIZ3.append(num);
            String msg = X1D.LIZIZ(LIZ3);
            o.LJIIIZ(msg, "msg");
        }
        ((C3WT) afS41S0300000_1.l0).LJLJJL = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$1(AfS41S0300000_1 afS41S0300000_1, Object obj) {
        DonationSessionResponse donationSessionResponse = (DonationSessionResponse) obj;
        Dialog dialog = (Dialog) ((C68322mC) afS41S0300000_1.l0).element;
        if (dialog != null) {
            V1B.LJLILLLLZI(dialog);
        }
        if (donationSessionResponse.status_code == 0 && !TextUtils.isEmpty(donationSessionResponse.getSessionUrl())) {
            ((InterfaceC88472Yns) afS41S0300000_1.l1).invoke(donationSessionResponse.getSessionUrl());
            return;
        }
        Context context = (Context) afS41S0300000_1.l2;
        if (context == null) {
            return;
        }
        C5S1 c5s1 = new C5S1(context);
        c5s1.LIZLLL(context.getString(R.string.pei));
        c5s1.LJ();
    }

    public AfS41S0300000_1(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
