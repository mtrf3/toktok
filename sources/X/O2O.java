package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O2O {
    public static final List<EnumC61089NyH> LIZ = C47261Igj.LJJIJIL(EnumC61089NyH.GECKO, EnumC61089NyH.BUILTIN, EnumC61089NyH.CDN);

    public static O2L LIZ(O2K resourceService, C61261O2n c61261O2n) {
        o.LJIIJ(resourceService, "resourceService");
        O1M o1m = c61261O2n.LIZIZ;
        ArrayList arrayList = new ArrayList();
        o1m.LIZ.getClass();
        arrayList.addAll(O2R.LIZ);
        O26 o26 = c61261O2n.LIZ;
        if (o26 instanceof O2Z) {
            if (o26 != null) {
                if (((O2Z) o26).LJIJJLI) {
                    arrayList.add(O2E.class);
                }
            } else {
                throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.lynx.hybrid.resource.RLResourceInfo");
            }
        }
        if (o1m.LIZ.LIZ.isEmpty()) {
            C61091NyJ c61091NyJ = o1m.LIZ;
            if (!c61091NyJ.LIZIZ) {
                List<EnumC61089NyH> list = LIZ;
                o.LJIIJ(list, "<set-?>");
                c61091NyJ.LIZ = list;
            }
        }
        Iterator<EnumC61089NyH> it = o1m.LIZ.LIZ.iterator();
        while (it.hasNext()) {
            int i = C61090NyI.LIZ[it.next().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        arrayList.add(O2Q.class);
                    }
                } else {
                    arrayList.add(O2D.class);
                }
            } else {
                arrayList.add(O2F.class);
            }
        }
        arrayList.addAll(O2R.LIZIZ);
        o1m.LIZ.getClass();
        o1m.LIZ.getClass();
        return new O2L(arrayList, resourceService);
    }
}
