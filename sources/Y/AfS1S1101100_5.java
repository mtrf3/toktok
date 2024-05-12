package Y;

import X.BR1;
import X.BR4;
import X.C0NB;
import X.C28751BQd;
import X.C28752BQe;
import X.C28753BQf;
import X.C28754BQg;
import X.C780334l;
import X.InterfaceC64592gB;
import X.XKX;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.goody_bag.model.GoodyBagWinnerInfo;
import com.bytedance.android.livesdk.model.message.GoodyBagMessage;
import java.util.ArrayList;
import java.util.List;
import webcast.api.goody_bag.GetGoodyBagLotteryResponse;
import webcast.api.goody_bag.GetGoodyBagWinnerListResponse;

/* loaded from: classes6.dex */
public class AfS1S1101100_5 implements InterfaceC64592gB {
    public final int $t;
    public int i2;
    public long j3;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(AfS1S1101100_5 afS1S1101100_5, Object obj) {
        int i;
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null) {
            i = baseResponse.statusCode;
        } else {
            i = -2;
        }
        Integer valueOf = Integer.valueOf(i);
        BR1 br1 = (BR1) afS1S1101100_5.l1;
        BR4.LJFF(valueOf, br1.LIZJ, afS1S1101100_5.s0, (GetGoodyBagLotteryResponse.ResponseData) baseResponse.data, afS1S1101100_5.i2, afS1S1101100_5.j3, br1.LJIIJJI);
        if (i != 0) {
            XKX.LIZLLL(C780334l.LJLIL, null, null, new C28751BQd((BR1) afS1S1101100_5.l1, null), 3);
            return;
        }
        GetGoodyBagLotteryResponse.ResponseData responseData = (GetGoodyBagLotteryResponse.ResponseData) baseResponse.data;
        if (responseData == null) {
            return;
        }
        BR1 br12 = (BR1) afS1S1101100_5.l1;
        C0NB.LIZIZ("GoodyBagPresenter", "requestTheServerForOpen");
        br12.LJII(responseData);
    }

    public static final void accept$1(AfS1S1101100_5 afS1S1101100_5, Object obj) {
        BR1 br1 = (BR1) afS1S1101100_5.l1;
        BR4.LJFF(-1, br1.LIZJ, afS1S1101100_5.s0, null, afS1S1101100_5.i2, afS1S1101100_5.j3, br1.LJIIJJI);
        BR1 br12 = (BR1) afS1S1101100_5.l1;
        if (br12.LJIIJJI == 2) {
            br12.LJIIL();
        } else {
            XKX.LIZLLL(C780334l.LJLIL, null, null, new C28752BQe(br12, null), 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$2(AfS1S1101100_5 afS1S1101100_5, Object obj) {
        int i;
        int i2;
        List<GoodyBagWinnerInfo> list;
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null) {
            i = baseResponse.statusCode;
        } else {
            i = -2;
        }
        Integer valueOf = Integer.valueOf(i);
        boolean z = ((BR1) afS1S1101100_5.l1).LIZJ;
        String str = afS1S1101100_5.s0;
        GetGoodyBagWinnerListResponse.ResponseData responseData = (GetGoodyBagWinnerListResponse.ResponseData) baseResponse.data;
        if (responseData != null && (list = responseData.winners) != null) {
            i2 = list.size();
        } else {
            i2 = 0;
        }
        BR4.LJIIIIZZ(valueOf, z, str, i2, afS1S1101100_5.i2, afS1S1101100_5.j3, ((BR1) afS1S1101100_5.l1).LJIIJJI);
        if (i != 0) {
            XKX.LIZLLL(C780334l.LJLIL, null, null, new C28753BQf((BR1) afS1S1101100_5.l1, null), 3);
            return;
        }
        GetGoodyBagWinnerListResponse.ResponseData responseData2 = (GetGoodyBagWinnerListResponse.ResponseData) baseResponse.data;
        if (responseData2 != null) {
            BR1 br1 = (BR1) afS1S1101100_5.l1;
            GoodyBagMessage goodyBagMessage = new GoodyBagMessage();
            br1.LJIIIZ = goodyBagMessage;
            goodyBagMessage.baseInfo = br1.LJIIJ;
            List<GoodyBagWinnerInfo> list2 = responseData2.winners;
            if (list2 == null) {
                list2 = new ArrayList<>();
            }
            goodyBagMessage.winners = list2;
            GoodyBagMessage goodyBagMessage2 = br1.LJIIIZ;
            if (goodyBagMessage2 != null) {
                goodyBagMessage2.type = 3;
            }
        }
        ((BR1) afS1S1101100_5.l1).LJI();
    }

    public static final void accept$3(AfS1S1101100_5 afS1S1101100_5, Object obj) {
        BR1 br1 = (BR1) afS1S1101100_5.l1;
        BR4.LJIIIIZZ(-1, br1.LIZJ, afS1S1101100_5.s0, 0, afS1S1101100_5.i2, afS1S1101100_5.j3, br1.LJIIJJI);
        BR1 br12 = (BR1) afS1S1101100_5.l1;
        if (br12.LJIIJJI == 2) {
            br12.LJIIL();
        } else {
            XKX.LIZLLL(C780334l.LJLIL, null, null, new C28754BQg(br12, null), 3);
        }
    }

    public AfS1S1101100_5(BR1 br1, String str, int i, long j, int i2) {
        this.$t = i2;
        this.l1 = br1;
        this.s0 = str;
        this.i2 = i;
        this.j3 = j;
    }
}
