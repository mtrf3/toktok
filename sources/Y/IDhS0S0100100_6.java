package Y;

import X.AFJ;
import X.C40920G4e;
import X.C40922G4g;
import X.C61878OQg;
import X.InterfaceC48038ItG;
import X.OSZ;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.kids.liked.model.KidFeedItemList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class IDhS0S0100100_6 implements InterfaceC48038ItG {
    public final int $t;
    public long j1;
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
            default:
                return null;
        }
    }

    public static final Object apply$0(IDhS0S0100100_6 iDhS0S0100100_6, Object obj) {
        KidFeedItemList it = (KidFeedItemList) obj;
        o.LJIIIZ(it, "it");
        AFJ.LIZ(2, 0, iDhS0S0100100_6.j1, "kids_api_like");
        C40920G4e c40920G4e = (C40920G4e) iDhS0S0100100_6.l0;
        c40920G4e.getClass();
        boolean z = true;
        if (it.getHasMore() != 1) {
            z = false;
        }
        c40920G4e.LIZLLL = z;
        if (c40920G4e.LIZJ >= it.getMaxCursor()) {
            return new OSZ(C61878OQg.INSTANCE, -1);
        }
        c40920G4e.LIZJ = it.getMaxCursor();
        List<Aweme> items = it.getItems();
        if (items != null) {
            if (((Aweme) ListProtector.get(items, 0)).getLogPbBean() == null) {
                Iterator<Aweme> it2 = items.iterator();
                while (it2.hasNext()) {
                    it2.next().setLogPbBean(it.getLogPb());
                }
            }
            if (items.isEmpty()) {
                return new OSZ(C61878OQg.INSTANCE, -1);
            }
            return new OSZ(items, 0);
        }
        return new OSZ(C61878OQg.INSTANCE, -1);
    }

    public static final Object apply$1(IDhS0S0100100_6 iDhS0S0100100_6, Object obj) {
        KidFeedItemList it = (KidFeedItemList) obj;
        o.LJIIIZ(it, "it");
        AFJ.LIZ(2, 0, iDhS0S0100100_6.j1, "kids_api_like");
        return ((C40922G4g) iDhS0S0100100_6.l0).LIZ(it);
    }

    public static final Object apply$2(IDhS0S0100100_6 iDhS0S0100100_6, Object obj) {
        KidFeedItemList it = (KidFeedItemList) obj;
        o.LJIIIZ(it, "it");
        AFJ.LIZ(1, 0, iDhS0S0100100_6.j1, "kids_api_like");
        return ((C40922G4g) iDhS0S0100100_6.l0).LIZ(it);
    }

    public IDhS0S0100100_6(long j, Object obj, int i) {
        this.$t = i;
        this.j1 = j;
        this.l0 = obj;
    }
}
