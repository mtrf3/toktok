package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.0uk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22660uk {
    public final Object LIZ;
    public final Object LIZIZ;
    public final Object LIZJ;

    public /* synthetic */ C22660uk() {
        this.LIZ = " \"'<>#";
        this.LIZIZ = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";
        this.LIZJ = new LinkedHashMap();
    }

    public /* synthetic */ C22660uk(List list) {
        this.LIZJ = list;
        this.LIZ = new ArrayList(list.size());
        this.LIZIZ = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            ((List) this.LIZ).add(((C271614u) ListProtector.get(list, i)).LIZIZ.LIZ());
            ((List) this.LIZIZ).add(((C271614u) ListProtector.get(list, i)).LIZJ.LIZ());
        }
    }

    public final String LIZJ(String name) {
        o.LJIIIZ(name, "name");
        List list = (List) ((java.util.Map) this.LIZJ).get(name);
        if (list != null) {
            return (String) ORZ.LJLLLL(list);
        }
        return null;
    }

    public final void LIZ(String str, String str2) {
        String LJI;
        String key = QCU.LJI(0, str.length(), str, true);
        if (str2 == null) {
            LJI = null;
        } else {
            LJI = QCU.LJI(0, str2.length(), str2, true);
        }
        List list = (List) ((java.util.Map) this.LIZJ).get(key);
        if (list == null) {
            list = new ArrayList();
            java.util.Map map = (java.util.Map) this.LIZJ;
            o.LJIIIIZZ(key, "key");
            map.put(key, list);
        }
        list.add(LJI);
    }

    public final void LIZIZ(String name, String str) {
        String str2;
        o.LJIIIZ(name, "name");
        String LIZLLL = QCU.LIZLLL(name, (String) this.LIZIZ, true, true);
        o.LJIIIIZZ(LIZLLL, "EncodeUtil.canonicalize(…false, false, true, true)");
        if (str != null) {
            str2 = QCU.LIZLLL(str, (String) this.LIZIZ, true, true);
        } else {
            str2 = null;
        }
        LIZ(LIZLLL, str2);
    }

    public final void LIZLLL(String name, String str) {
        o.LJIIIZ(name, "name");
        List list = (List) ((java.util.Map) this.LIZJ).get(name);
        if (list != null) {
            list.clear();
        }
        LIZIZ(name, str);
    }

    public final void LJ(String name, String str) {
        o.LJIIIZ(name, "name");
        List list = (List) ((java.util.Map) this.LIZJ).get(name);
        if (list != null) {
            list.clear();
        }
        LIZIZ(name, str);
    }
}
