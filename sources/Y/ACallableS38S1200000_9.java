package Y;

import X.ActivityC45651qj;
import X.C116484hg;
import X.C198517qh;
import X.C39398FdC;
import X.C53976LGi;
import X.C54029LIj;
import X.C68322mC;
import X.C76800UCe;
import X.FMX;
import X.LIA;
import X.X1D;
import android.util.Log;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabProtocolAbility;
import defpackage.q;
import java.util.HashMap;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class ACallableS38S1200000_9 implements Callable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS38S1200000_9 aCallableS38S1200000_9) {
        C39398FdC c39398FdC = C39398FdC.LIZ;
        String str = aCallableS38S1200000_9.s0;
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("from_group_id", ((Aweme) aCallableS38S1200000_9.l1).getAid());
        c198517qh.LIZ.put("to_group_id", ((Aweme) aCallableS38S1200000_9.l2).getAid());
        c198517qh.LIZ.put("author_id", ((Aweme) aCallableS38S1200000_9.l1).getAuthorUid());
        C39398FdC.LIZIZ(str, q.LIZJ(c198517qh.LIZ, "log_pb", ((Aweme) aCallableS38S1200000_9.l1).getLogPbString(), c198517qh, c39398FdC));
        return C76800UCe.LIZ;
    }

    public static final Object call$1(ACallableS38S1200000_9 aCallableS38S1200000_9) {
        int i;
        ISocial2TabProtocolAbility LJFF;
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) aCallableS38S1200000_9.l1;
        if (activityC45651qj != null && (LJFF = C53976LGi.LJFF(activityC45651qj)) != null && LJFF.BJ()) {
            i = LIA.LIZJ;
        } else {
            i = LIA.LIZIZ;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", aCallableS38S1200000_9.s0);
        T enterMethod = ((C68322mC) aCallableS38S1200000_9.l2).element;
        o.LJIIIIZZ(enterMethod, "enterMethod");
        hashMap.put("enter_method", enterMethod);
        if (C54029LIj.LIZIZ.LJJIJL()) {
            hashMap.put("is_top_tab", "1");
        } else {
            hashMap.put("is_top_tab", CardStruct.IStatusCode.DEFAULT);
        }
        if (o.LJ(((C68322mC) aCallableS38S1200000_9.l2).element, "click_button_icon")) {
            if (LIA.LIZLLL > 0) {
                hashMap.put("notice_type", "number_dot");
                hashMap.put("number_cnt", String.valueOf(LIA.LIZLLL));
            }
        } else if (i > 0) {
            C116484hg.LIZIZ(hashMap, "notice_type", "number_dot", i, "number_cnt");
        }
        FMX.LJIIL("enter_homepage_friends", hashMap);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("enter_homepage_friends ");
        LIZ.append(hashMap);
        return Integer.valueOf(Log.d("FriendsFeedMonitor", X1D.LIZIZ(LIZ)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ACallableS38S1200000_9(Object obj, ActivityC45651qj activityC45651qj, String str, C68322mC<String> c68322mC) {
        this.$t = c68322mC;
        this.l1 = obj;
        this.s0 = activityC45651qj;
        this.l2 = str;
    }
}
