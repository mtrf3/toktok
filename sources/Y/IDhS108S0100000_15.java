package Y;

import X.AbstractC84920XUm;
import X.C0EM;
import X.C84767XOp;
import X.C86192XsC;
import X.InterfaceC48038ItG;
import X.XLY;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyPushFor2067Activity;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class IDhS108S0100000_15 implements InterfaceC48038ItG {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            case 4:
                return apply$4(this, obj);
            default:
                return null;
        }
    }

    public IDhS108S0100000_15(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object apply$0(IDhS108S0100000_15 iDhS108S0100000_15, Object obj) {
        Object[] requests = (Object[]) obj;
        o.LJIIIZ(requests, "requests");
        ArrayList arrayList = new ArrayList();
        C86192XsC c86192XsC = (C86192XsC) iDhS108S0100000_15.l0;
        int i = 0;
        for (Object obj2 : requests) {
            if (obj2 instanceof Bitmap) {
                i++;
                arrayList.add(obj2);
            } else {
                Object defaultAvatar = c86192XsC.LJJI.getValue();
                o.LJIIIIZZ(defaultAvatar, "defaultAvatar");
                arrayList.add(defaultAvatar);
            }
        }
        Bitmap LJFF = ((C86192XsC) iDhS108S0100000_15.l0).LJFF(arrayList);
        if (i == ((C86192XsC) iDhS108S0100000_15.l0).LJI()) {
            C86192XsC c86192XsC2 = (C86192XsC) iDhS108S0100000_15.l0;
            c86192XsC2.LJJIIZI = "complete";
            if (c86192XsC2.LJIIL) {
                XLY.LIZ.LIZIZ(LJFF, c86192XsC2.LJIIJ());
            }
        }
        return LJFF;
    }

    public static final Object apply$1(IDhS108S0100000_15 iDhS108S0100000_15, Object obj) {
        Long it = (Long) obj;
        o.LJIIIZ(it, "it");
        return C0EM.LIZIZ(it, ((TwoStepVerifyPushFor2067Activity) iDhS108S0100000_15.l0).LJLLJ);
    }

    public static final Object apply$2(IDhS108S0100000_15 iDhS108S0100000_15, Object obj) {
        C84767XOp it = (C84767XOp) obj;
        o.LJIIIZ(it, "it");
        ((AbstractC84920XUm) iDhS108S0100000_15.l0).LJ = it.LJ;
        return it;
    }

    public static final Object apply$3(IDhS108S0100000_15 iDhS108S0100000_15, Object obj) {
        C84767XOp it = (C84767XOp) obj;
        o.LJIIIZ(it, "it");
        ((AbstractC84920XUm) iDhS108S0100000_15.l0).LJ = it.LJ;
        return it;
    }

    public static final Object apply$4(IDhS108S0100000_15 iDhS108S0100000_15, Object obj) {
        C84767XOp it = (C84767XOp) obj;
        o.LJIIIZ(it, "it");
        ((AbstractC84920XUm) iDhS108S0100000_15.l0).LJ = it.LJ;
        return it;
    }
}
