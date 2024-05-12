package X;

import android.app.Activity;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class CP6 {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(BNA.LJLIL);
    public static final ArrayList<CPE> LIZIZ;
    public static final ArrayList<CPD> LIZJ;

    static {
        ArrayList<CPE> arrayList = new ArrayList<>();
        LIZIZ = arrayList;
        ArrayList<CPD> arrayList2 = new ArrayList<>();
        LIZJ = arrayList2;
        LIZJ(new CPA(), arrayList2);
        LIZJ(new CP8(), arrayList2);
        LIZJ(new CP4(), arrayList2);
        LIZJ(new CP5(), arrayList2);
        LIZJ(new CPB(), arrayList);
        LIZJ(new CPC(), arrayList);
    }

    public static java.util.Map LIZIZ() {
        return (java.util.Map) LIZ.getValue();
    }

    public static InterfaceC28597BKf LIZ(Activity activity) {
        int i;
        if (activity != null) {
            i = activity.hashCode();
        } else {
            i = 0;
        }
        InterfaceC28597BKf interfaceC28597BKf = (InterfaceC28597BKf) LIZIZ().get(Integer.valueOf(i));
        if (interfaceC28597BKf == null) {
            interfaceC28597BKf = new CP7(LIZJ, LIZIZ);
        }
        if (LIZIZ().get(Integer.valueOf(i)) == null) {
            LIZIZ().put(Integer.valueOf(i), interfaceC28597BKf);
        }
        return interfaceC28597BKf;
    }

    public static void LIZJ(Object obj, ArrayList arrayList) {
        if (!arrayList.contains(obj)) {
            arrayList.add(obj);
        }
    }
}
