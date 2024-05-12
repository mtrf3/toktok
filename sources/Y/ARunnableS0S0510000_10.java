package Y;

import X.ActivityC45651qj;
import X.C109544Rq;
import X.C115284fk;
import X.C1B3;
import X.C32H;
import X.C63120Opw;
import X.C63243Orv;
import X.C63309Osz;
import X.C68322mC;
import X.IWF;
import X.NMO;
import X.NMS;
import X.NOO;
import android.app.Activity;
import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.im.core.proto.MessageBody;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public class ARunnableS0S0510000_10 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public boolean z5;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        C63309Osz.LIZLLL().LJIIL((HashMap) this.l1, -1, Collections.singletonList((C109544Rq) this.l0));
        C63309Osz LIZLLL = C63309Osz.LIZLLL();
        C109544Rq c109544Rq = (C109544Rq) this.l0;
        Map map = (Map) this.l2;
        Map<String, List<C32H>> propertyItemListMap = c109544Rq.getPropertyItemListMap();
        MessageBody messageBody = (MessageBody) this.l3;
        Long l = messageBody.create_time;
        Long l2 = messageBody.sender;
        LIZLLL.getClass();
        if (!TextUtils.isEmpty(c109544Rq.getConversationId())) {
            LIZLLL.LIZJ(c109544Rq.getConversationId(), new C63243Orv(c109544Rq, map, propertyItemListMap, l, l2));
        }
        if (this.z5) {
            ((C63120Opw) this.l4).setLastShowMessage((C109544Rq) this.l0);
            C115284fk.LJIILIIL().LJIJI(2, (C63120Opw) this.l4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ$1() {
        NMS nms;
        ActivityC45651qj activityC45651qj;
        FragmentManager supportFragmentManager;
        NOO noo = (NOO) this.l0;
        FrameLayout frameLayout = (FrameLayout) this.l1;
        T t = ((C68322mC) this.l2).element;
        if (t instanceof NMS) {
            nms = (NMS) t;
        } else {
            nms = null;
        }
        boolean z = this.z5;
        noo.getClass();
        if (frameLayout.getVisibility() != 8) {
            frameLayout.setVisibility(8);
            if (nms != null) {
                nms.onHide();
            }
            if (!z) {
                IWF.LJJLIIIIJ().LIZIZ();
            }
        }
        Fragment fragment = (Fragment) ((C68322mC) this.l2).element;
        if (fragment != null) {
            Activity activity = (Activity) this.l4;
            if ((activity instanceof ActivityC45651qj) && (activityC45651qj = (ActivityC45651qj) activity) != null && (supportFragmentManager = activityC45651qj.getSupportFragmentManager()) != null) {
                C1B3 c1b3 = new C1B3(supportFragmentManager);
                c1b3.LJJI(fragment);
                c1b3.LJI();
            }
        }
        ((C68322mC) this.l2).element = null;
        NMO nmo = (NMO) this.l3;
        if (nmo != null) {
            nmo.enable(false);
        }
    }

    public static final void run$0(ARunnableS0S0510000_10 aRunnableS0S0510000_10) {
        boolean LIZ;
        try {
            aRunnableS0S0510000_10.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S0510000_10 aRunnableS0S0510000_10) {
        boolean LIZ;
        try {
            aRunnableS0S0510000_10.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S0510000_10(Object obj, Object obj2, Object obj3, Object obj4, boolean z, Object obj5, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
        this.z5 = z;
        this.l4 = obj5;
    }
}
