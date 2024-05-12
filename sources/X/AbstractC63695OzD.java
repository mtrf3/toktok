package X;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.OzD, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC63695OzD {
    public final String LIZ;
    public final C93833mF LIZIZ = C113554cx.LJJJLIIL();
    public final boolean LIZJ = true;
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(ELG.LJLIL);
    public final C62822Ol8 LJ = C221108m2.LIZIZ(new AqS160S0100000_10(this, 615));
    public final java.util.Set<String> LJFF = new LinkedHashSet();
    public final List<InterfaceC63702OzK> LJI = C47261Igj.LJJIJIIJI(new C63698OzG(), new C63697OzF(), new C63700OzI(), new C63699OzH());

    public AbstractC63695OzD LJ(InterfaceC54035LIp group) {
        o.LJIIIZ(group, "group");
        return this;
    }

    public final CopyOnWriteArraySet<InterfaceC54035LIp> LIZ() {
        return (CopyOnWriteArraySet) this.LJ.getValue();
    }

    public java.util.Map<String, String> LIZJ() {
        Object obj;
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : ((ConcurrentHashMap) this.LIZLLL.getValue()).entrySet()) {
            Object key = entry.getKey();
            C63696OzE c63696OzE = (C63696OzE) entry.getValue();
            c63696OzE.getClass();
            if (o.LJ(c63696OzE, C63696OzE.LIZIZ)) {
                obj = null;
            } else {
                obj = c63696OzE.LIZ;
            }
            hashMap.put(key, obj);
        }
        return hashMap;
    }

    public final void LJFF() {
        FMX.LJIIL(this.LIZ, LIZJ());
    }

    public java.util.Map<String, C214578bV> LIZIZ() {
        return this.LIZIZ;
    }

    public AbstractC63695OzD(String str) {
        this.LIZ = str;
    }

    public void LIZLLL(Object obj, String key) {
        String str;
        C63696OzE c63696OzE;
        o.LJIIIZ(key, "key");
        if (obj != null) {
            str = obj.toString();
        } else {
            str = null;
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.LIZLLL.getValue();
        if (str == null) {
            c63696OzE = C63696OzE.LIZIZ;
        } else {
            c63696OzE = new C63696OzE(str);
        }
        concurrentHashMap.put(key, c63696OzE);
    }
}
