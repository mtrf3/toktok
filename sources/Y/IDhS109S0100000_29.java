package Y;

import X.AbstractC73672Svk;
import X.C32I;
import X.C91391Ztr;
import X.C91494ZvW;
import X.InterfaceC48038ItG;
import X.InterfaceC91296ZsK;
import com.ss.android.ugc.aweme.dsp.common.model.BaseDspFeedResponse;
import com.ss.android.ugc.aweme.dsp.common.model.DspPlayInfoResponse;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public class IDhS109S0100000_29 implements InterfaceC48038ItG {
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
            case 5:
                return apply$5(this, obj);
            default:
                return null;
        }
    }

    public IDhS109S0100000_29(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object apply$0(IDhS109S0100000_29 iDhS109S0100000_29, Object obj) {
        DspPlayInfoResponse it = (DspPlayInfoResponse) obj;
        o.LJIIIZ(it, "it");
        if (!it.getPlayInfo().isEmpty()) {
            ((InterfaceC91296ZsK) iDhS109S0100000_29.l0).LJIIIIZZ().getDspMusic().setPlayInfo(it.getPlayInfo());
        }
        return (InterfaceC91296ZsK) iDhS109S0100000_29.l0;
    }

    public static final Object apply$1(IDhS109S0100000_29 iDhS109S0100000_29, Object it) {
        o.LJIIIZ(it, "it");
        return (InterfaceC91296ZsK) iDhS109S0100000_29.l0;
    }

    public static final Object apply$2(IDhS109S0100000_29 iDhS109S0100000_29, Object obj) {
        BaseDspFeedResponse it = (BaseDspFeedResponse) obj;
        o.LJIIIZ(it, "it");
        CopyOnWriteArrayList<InterfaceC91296ZsK> copyOnWriteArrayList = ((C91494ZvW) iDhS109S0100000_29.l0).LJLIL;
        ArrayList arrayList = new ArrayList(C32I.LJJL(copyOnWriteArrayList, 10));
        Iterator<InterfaceC91296ZsK> it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getId());
        }
        List<InterfaceC91296ZsK> LIZIZ = ((C91494ZvW) iDhS109S0100000_29.l0).LIZIZ(it);
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = ((ArrayList) LIZIZ).iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            if (hashSet.add(((InterfaceC91296ZsK) next).getId())) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            Object next2 = it4.next();
            if (!arrayList.contains(((InterfaceC91296ZsK) next2).getId())) {
                arrayList3.add(next2);
            }
        }
        ((C91494ZvW) iDhS109S0100000_29.l0).LJLIL.addAll(arrayList3);
        return arrayList3;
    }

    public static final Object apply$3(IDhS109S0100000_29 iDhS109S0100000_29, Object obj) {
        BaseDspFeedResponse it = (BaseDspFeedResponse) obj;
        o.LJIIIZ(it, "it");
        if (it.getDspList().isEmpty()) {
            return (AbstractC73672Svk) iDhS109S0100000_29.l0;
        }
        return AbstractC73672Svk.LJJIJIL(it);
    }

    public static final Object apply$4(IDhS109S0100000_29 iDhS109S0100000_29, Object it) {
        o.LJIIIZ(it, "it");
        return ((C91494ZvW) iDhS109S0100000_29.l0).LJLIL;
    }

    public static final Object apply$5(IDhS109S0100000_29 iDhS109S0100000_29, Object it) {
        o.LJIIIZ(it, "it");
        ((C91391Ztr) iDhS109S0100000_29.l0).LIZJ = false;
        return it;
    }
}
