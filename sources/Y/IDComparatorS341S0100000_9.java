package Y;

import X.C116144h8;
import X.C53551Kzz;
import X.C56708MNk;
import X.C56717MNt;
import X.C56988MYe;
import X.EnumC56711MNn;
import X.HG3;
import X.InterfaceC57784Mm4;
import X.RBX;
import com.ss.android.ugc.aweme.ecommerce.core.preloader.ImagePreloadExperiment;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowPageData;
import java.util.Comparator;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class IDComparatorS341S0100000_9 implements Comparator {
    public final int $t;
    public Object l0;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return compare$0(this, obj, obj2);
            case 1:
                return compare$1(this, obj, obj2);
            default:
                return 0;
        }
    }

    public IDComparatorS341S0100000_9(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final int compare$0(IDComparatorS341S0100000_9 iDComparatorS341S0100000_9, Object obj, Object obj2) {
        int i;
        InterfaceC57784Mm4 o1 = (InterfaceC57784Mm4) obj;
        InterfaceC57784Mm4 o2 = (InterfaceC57784Mm4) obj2;
        C56988MYe c56988MYe = (C56988MYe) iDComparatorS341S0100000_9.l0;
        o.LJIIIIZZ(o1, "o1");
        c56988MYe.getClass();
        int LIZIZ = C56988MYe.LIZIZ(o1);
        C56988MYe c56988MYe2 = (C56988MYe) iDComparatorS341S0100000_9.l0;
        o.LJIIIIZZ(o2, "o2");
        c56988MYe2.getClass();
        int LIZIZ2 = LIZIZ - C56988MYe.LIZIZ(o2);
        if (LIZIZ2 == 0) {
            ((C56988MYe) iDComparatorS341S0100000_9.l0).getClass();
            boolean z = o1 instanceof C116144h8;
            int i2 = ImagePreloadExperiment.PRIORITY_DEFAULT;
            if (z) {
                i = ((C116144h8) o1).LJLJJI;
            } else {
                i = ImagePreloadExperiment.PRIORITY_DEFAULT;
            }
            ((C56988MYe) iDComparatorS341S0100000_9.l0).getClass();
            if (o2 instanceof C116144h8) {
                i2 = ((C116144h8) o2).LJLJJI;
            }
            return i - i2;
        }
        return LIZIZ2;
    }

    public static final int compare$1(IDComparatorS341S0100000_9 iDComparatorS341S0100000_9, Object obj, Object obj2) {
        FollowPageData f1 = (FollowPageData) obj;
        FollowPageData f2 = (FollowPageData) obj2;
        int intValue = ((Number) C53551Kzz.LIZ.getValue()).intValue();
        if (intValue != 1) {
            if (intValue != 2 && intValue != 3) {
                return 0;
            }
            C56708MNk c56708MNk = (C56708MNk) iDComparatorS341S0100000_9.l0;
            o.LJIIIIZZ(f1, "f1");
            o.LJIIIIZZ(f2, "f2");
            EnumC56711MNn enumC56711MNn = EnumC56711MNn.HAS_READ;
            c56708MNk.getClass();
            int LJIIJ = C56708MNk.LJIIJ(f1, f2, enumC56711MNn);
            if (LJIIJ != 0) {
                return LJIIJ;
            }
            C56708MNk c56708MNk2 = (C56708MNk) iDComparatorS341S0100000_9.l0;
            EnumC56711MNn enumC56711MNn2 = EnumC56711MNn.FOLLOW_STATE;
            c56708MNk2.getClass();
            int LJIIJ2 = C56708MNk.LJIIJ(f1, f2, enumC56711MNn2);
            if (LJIIJ2 != 0) {
                return LJIIJ2;
            }
            C56708MNk c56708MNk3 = (C56708MNk) iDComparatorS341S0100000_9.l0;
            EnumC56711MNn enumC56711MNn3 = EnumC56711MNn.FROM_NOW;
            c56708MNk3.getClass();
            int LJIIJ3 = C56708MNk.LJIIJ(f1, f2, enumC56711MNn3);
            if (LJIIJ3 != 0) {
                return LJIIJ3;
            }
            C56708MNk c56708MNk4 = (C56708MNk) iDComparatorS341S0100000_9.l0;
            EnumC56711MNn enumC56711MNn4 = EnumC56711MNn.CREATE_TIME;
            c56708MNk4.getClass();
            return C56708MNk.LJIIJ(f1, f2, enumC56711MNn4);
        }
        if (((RBX) HG3.LJIILL()).getCurUser().historyMaxFollowerCount > C56717MNt.LIZ().getMaxFansDivide()) {
            return 0;
        }
        C56708MNk c56708MNk5 = (C56708MNk) iDComparatorS341S0100000_9.l0;
        o.LJIIIIZZ(f1, "f1");
        o.LJIIIIZZ(f2, "f2");
        EnumC56711MNn enumC56711MNn5 = EnumC56711MNn.HAS_READ;
        c56708MNk5.getClass();
        int LJIIJ4 = C56708MNk.LJIIJ(f1, f2, enumC56711MNn5);
        if (LJIIJ4 != 0) {
            return LJIIJ4;
        }
        C56708MNk c56708MNk6 = (C56708MNk) iDComparatorS341S0100000_9.l0;
        EnumC56711MNn enumC56711MNn6 = EnumC56711MNn.FOLLOW_STATE;
        c56708MNk6.getClass();
        int LJIIJ5 = C56708MNk.LJIIJ(f1, f2, enumC56711MNn6);
        if (LJIIJ5 != 0) {
            return LJIIJ5;
        }
        C56708MNk c56708MNk7 = (C56708MNk) iDComparatorS341S0100000_9.l0;
        EnumC56711MNn enumC56711MNn7 = EnumC56711MNn.CREATE_TIME;
        c56708MNk7.getClass();
        return C56708MNk.LJIIJ(f1, f2, enumC56711MNn7);
    }
}
