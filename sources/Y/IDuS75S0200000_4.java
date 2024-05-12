package Y;

import X.C184077Kh;
import X.C214378bB;
import X.C214528bQ;
import X.C243639hH;
import X.C246049lA;
import X.C247519nX;
import X.C27965AyH;
import X.C27966AyI;
import X.C27991Ayh;
import X.C2MW;
import X.C65352Pkq;
import X.C73433Srt;
import X.C76L;
import X.C78926UyI;
import X.C94Y;
import X.C95J;
import X.C9MR;
import X.C9O7;
import X.C9OV;
import X.C9OW;
import X.C9OY;
import X.InterfaceC247459nR;
import X.InterfaceC73573Su9;
import X.InterfaceC86003Zc;
import com.bytedance.touchpoint.core.coinbottomtab.CoinBottomTabViewModel;
import com.bytedance.touchpoint.core.model.TouchPoint;
import com.bytedance.touchpoint.core.model.TouchPointsResponse;
import com.bytedance.touchpoint.core.textlink.TextLinkViewModel;
import com.bytedance.touchpoint.core.viewmodel.BaseTouchPointDataVM;
import com.bytedance.touchpoint.data.request.INetworkApi;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.api.OrderSubmitApi;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class IDuS75S0200000_4 implements InterfaceC86003Zc {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<BillInfoResponse> interfaceC73573Su9) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, interfaceC73573Su9);
                return;
            case 1:
                subscribe$1(this, interfaceC73573Su9);
                return;
            default:
                return;
        }
    }

    public static final void subscribe$0(IDuS75S0200000_4 iDuS75S0200000_4, InterfaceC73573Su9 interfaceC73573Su9) {
        long currentTimeMillis = System.currentTimeMillis();
        ((C27966AyI) iDuS75S0200000_4.l0).LIZLLL = currentTimeMillis;
        C27965AyH c27965AyH = OrderSubmitApi.LIZ;
        BillInfoRequest request = (BillInfoRequest) iDuS75S0200000_4.l1;
        c27965AyH.getClass();
        o.LJIIIZ(request, "request");
        ((OrderSubmitApi) C27965AyH.LIZIZ.create(OrderSubmitApi.class)).getBillInfoByChunk(request, C27965AyH.LIZIZ(request.getBizType())).LJFF(new C27991Ayh((C27966AyI) iDuS75S0200000_4.l0, (C73433Srt) interfaceC73573Su9, currentTimeMillis));
    }

    public static final void subscribe$1(IDuS75S0200000_4 iDuS75S0200000_4, InterfaceC73573Su9 interfaceC73573Su9) {
        INetworkApi LJFF;
        C76L<TouchPointsResponse> touchPoint;
        try {
            InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
            if (interfaceC247459nR != null && (LJFF = interfaceC247459nR.LJFF()) != null && (touchPoint = LJFF.getTouchPoint((Integer) iDuS75S0200000_4.l1)) != null) {
                TouchPointsResponse touchPointsResponse = touchPoint.get();
                if (touchPointsResponse != null && touchPointsResponse.statusCode == 0) {
                    C2MW.LIZ().LIZIZ();
                    if (touchPointsResponse.dynamicPops != null) {
                        C2MW.LIZ().LIZLLL = touchPointsResponse.dynamicPops;
                        interfaceC73573Su9.onNext(2);
                    }
                    ((C243639hH) iDuS75S0200000_4.l0).LIZ = touchPointsResponse.touchPoints;
                    C9O7 LIZ = C2MW.LIZ();
                    List<TouchPoint> list = ((C243639hH) iDuS75S0200000_4.l0).LIZ;
                    LIZ.LIZ = list;
                    if (list != null && (!list.isEmpty())) {
                        try {
                            for (TouchPoint touchPoint2 : list) {
                                int i = touchPoint2.touchPointId;
                                if (i == 5) {
                                    ((ArrayList) LIZ.LIZJ).add(touchPoint2);
                                } else {
                                    LIZ.LIZIZ.put(Integer.valueOf(i), touchPoint2);
                                }
                                C247519nX.LJIIJ(touchPoint2);
                            }
                            Iterator<C94Y> it = LIZ.LJIIIIZZ.iterator();
                            while (it.hasNext()) {
                                it.next().LIZ(LIZ.LIZIZ);
                            }
                            if (!((ArrayList) LIZ.LIZJ).isEmpty()) {
                                C9MR c9mr = (C9MR) LIZ.LJII.getValue();
                                List<TouchPoint> list2 = LIZ.LIZJ;
                                c9mr.getClass();
                                C9MR.LIZ(list2);
                                ((TextLinkViewModel) new C214378bB(C65352Pkq.LIZ(TextLinkViewModel.class), null, C214528bQ.LJLIL, C78926UyI.LJJII(C246049lA.LJLILLLLZI, false), C184077Kh.LJLIL, C9OV.INSTANCE, null, null).getValue()).setState(C9OY.LJLIL);
                            }
                        } catch (Exception unused) {
                        }
                    }
                    List<TouchPoint> list3 = LIZ.LIZ;
                    if (list3 == null || list3.isEmpty()) {
                        ((BaseTouchPointDataVM) new C214378bB(C65352Pkq.LIZ(CoinBottomTabViewModel.class), null, C214528bQ.LJLIL, C78926UyI.LJJII(C246049lA.LJLILLLLZI, false), C184077Kh.LJLIL, C9OW.INSTANCE, null, null).getValue()).gv0();
                    }
                    interfaceC73573Su9.onNext(1);
                    return;
                }
            }
        } catch (InterruptedException | ExecutionException unused2) {
        }
        interfaceC73573Su9.tryOnError(new Throwable("touch points failed"));
    }

    public IDuS75S0200000_4(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
