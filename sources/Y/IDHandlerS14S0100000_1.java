package Y;

import X.C109544Rq;
import X.C114834f1;
import X.C120144na;
import X.C36746EbW;
import X.C3QO;
import X.C3QP;
import X.C47261Igj;
import X.C4WD;
import X.C4WF;
import X.C4WT;
import X.C4WW;
import X.C4ZL;
import X.C63308Osy;
import X.C63356Otk;
import X.C63375Ou3;
import X.C63623Oy3;
import X.C73969T1h;
import X.C74672wR;
import X.C85463Xa;
import X.C99023uc;
import X.HandlerC108084Ma;
import X.T16;
import X.X1D;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.api.PaymentApi;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindStatusRequest;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class IDHandlerS14S0100000_1 extends Handler {
    public final int $t;
    public Object l0;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.$t) {
            case 0:
                handleMessage$0(this, message);
                return;
            case 1:
                handleMessage$1(this, message);
                return;
            case 2:
                handleMessage$2(this, message);
                return;
            case 3:
                handleMessage$3(this, message);
                return;
            case 4:
                handleMessage$4(this, message);
                return;
            default:
                super.handleMessage(message);
                return;
        }
    }

    public static final void handleMessage$0(IDHandlerS14S0100000_1 iDHandlerS14S0100000_1, Message msg) {
        o.LJIIIZ(msg, "msg");
        int i = msg.what;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            C3QP c3qp = ((C3QO) iDHandlerS14S0100000_1.l0).LIZIZ;
            if (c3qp != null) {
                c3qp.LIZIZ();
            }
            C3QO c3qo = (C3QO) iDHandlerS14S0100000_1.l0;
            c3qo.LIZLLL.removeCallbacksAndMessages(null);
            c3qo.LIZJ = true;
            return;
        }
        C3QO c3qo2 = (C3QO) iDHandlerS14S0100000_1.l0;
        c3qo2.getClass();
        C36746EbW.LIZ(4, "queryBindStatus");
        BindStatusRequest bindStatusRequest = new BindStatusRequest(C47261Igj.LJJIJ(c3qo2.LIZ));
        PaymentApi.LIZ.getClass();
        ((PaymentApi) C74672wR.LIZIZ.create(PaymentApi.class)).getBindStatus(bindStatusRequest).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS53S0100000_1(c3qo2, 7), new AfS53S0100000_1(c3qo2, 8));
    }

    public static final void handleMessage$1(IDHandlerS14S0100000_1 iDHandlerS14S0100000_1, Message msg) {
        o.LJIIIZ(msg, "msg");
        Object obj = msg.obj;
        if (obj != null && (obj instanceof User)) {
            C99023uc c99023uc = (C99023uc) iDHandlerS14S0100000_1.l0;
            IMUser fromUser = IMUser.fromUser((User) obj);
            synchronized (c99023uc) {
                c99023uc.LJ = fromUser;
                c99023uc.LIZ();
            }
        }
    }

    public static final void handleMessage$2(IDHandlerS14S0100000_1 iDHandlerS14S0100000_1, Message msg) {
        o.LJIIIZ(msg, "msg");
        C4WW c4ww = (C4WW) iDHandlerS14S0100000_1.l0;
        Object obj = msg.obj;
        o.LJII(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        c4ww.getClass();
        C4ZL.LIZJ();
        C114834f1 c114834f1 = C114834f1.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handleMessage[");
        LIZ.append(str);
        LIZ.append(']');
        c114834f1.i("MsgSender_CQ", X1D.LIZIZ(LIZ));
        c4ww.LIZIZ(str);
        HandlerC108084Ma handlerC108084Ma = c4ww.LJLIL;
        C63623Oy3 c63623Oy3 = new C63375Ou3().LIZ;
        c63623Oy3.LIZJ = "CQ timeout";
        handlerC108084Ma.LIZIZ(str, true, c63623Oy3);
    }

    public static final void handleMessage$3(IDHandlerS14S0100000_1 iDHandlerS14S0100000_1, Message message) {
        if (message.what != 100) {
            return;
        }
        C63356Otk LJIIIZ = C63356Otk.LJIIIZ();
        List<C109544Rq> list = ((C4WD) iDHandlerS14S0100000_1.l0).LIZJ;
        IDcS364S0100000_1 iDcS364S0100000_1 = new IDcS364S0100000_1(iDHandlerS14S0100000_1, 24);
        LJIIIZ.getClass();
        C4WD.LIZ().getClass();
        C4WT c4wt = new C4WT();
        C4WF c4wf = new C4WF(c4wt, iDcS364S0100000_1, new ArrayList());
        ArrayList arrayList = new ArrayList();
        int i = C63308Osy.LJI().LIZLLL().LJJLIL;
        int i2 = C63308Osy.LJI().LIZLLL().LJJLJ;
        Iterator it = ((CopyOnWriteArrayList) list).iterator();
        ArrayList arrayList2 = null;
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            "on_get_ws_msg".equals("on_get_ws_msg");
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
            }
            arrayList2.add(next);
            if (i > 0 && !z) {
                if (arrayList2.size() == i) {
                    new C120144na(c4wf).LJIILIIL("on_get_ws_msg", arrayList2, true);
                    arrayList2 = null;
                    z = true;
                }
            } else if (arrayList2.size() == i2) {
                arrayList.add(arrayList2);
                arrayList2 = null;
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            List list2 = (List) it2.next();
            c4wt.LIZ++;
            new C120144na(c4wf).LJIILIIL("on_get_ws_msg", list2, false);
        }
        if (arrayList2 != null) {
            c4wt.LIZ++;
            new C120144na(c4wf).LJIILIIL("on_get_ws_msg", arrayList2, false);
        }
        ((CopyOnWriteArrayList) ((C4WD) iDHandlerS14S0100000_1.l0).LIZJ).clear();
    }

    public static final void handleMessage$4(IDHandlerS14S0100000_1 iDHandlerS14S0100000_1, Message msg) {
        o.LJIIIZ(msg, "msg");
        super.handleMessage(msg);
        if (msg.what == 1) {
            ((C85463Xa) iDHandlerS14S0100000_1.l0).LIZIZ(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDHandlerS14S0100000_1(Object obj, Looper looper, int i) {
        super(looper);
        this.$t = i;
        this.l0 = obj;
    }
}
