package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS58S1200000_3;
import kotlin.jvm.internal.AqS71S1100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7C3, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7C3 {
    public final C7C3 LIZ;
    public final java.util.Map<C62572cv, InterfaceC87283bg> LIZIZ;

    public C7C3() {
        this(null);
    }

    public C7C3(C7C3 c7c3) {
        this.LIZ = c7c3;
        this.LIZIZ = new LinkedHashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T LIZ(Class<T> clazz, String str) {
        o.LJIIIZ(clazz, "clazz");
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = this;
        C62572cv c62572cv = new C62572cv(clazz, str);
        String LJLLILLLL = C16880lQ.LJLLILLLL(clazz);
        while (c68322mC.element != null) {
            C8K7.LIZ("assem_hierarchy_data", new AqS71S1100000_3(LJLLILLLL, c68322mC, 0), false);
            if (((C7C3) c68322mC.element).LIZIZ.containsKey(c62572cv)) {
                C8K7.LIZ("assem_hierarchy_data", new AqS153S0100000_3(c68322mC, (C68322mC<C7C3>) 25), false);
                return (T) ((LinkedHashMap) ((C7C3) c68322mC.element).LIZIZ).get(c62572cv);
            }
            c68322mC.element = (T) ((C7C3) c68322mC.element).LIZ;
        }
        throw new IllegalArgumentException("No such data hierarchy by parent.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> T LIZIZ(Class<T> clazz, String str) {
        o.LJIIIZ(clazz, "clazz");
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = this;
        C62572cv c62572cv = new C62572cv(clazz, str);
        String LJLLILLLL = C16880lQ.LJLLILLLL(clazz);
        while (c68322mC.element != null) {
            C8K7.LIZ("assem_hierarchy_data", new AqS71S1100000_3(LJLLILLLL, c68322mC, 1), false);
            if (((C7C3) c68322mC.element).LIZIZ.containsKey(c62572cv)) {
                C8K7.LIZ("assem_hierarchy_data", new AqS153S0100000_3(c68322mC, (C68322mC<C7C3>) 26), false);
                return (T) ((LinkedHashMap) ((C7C3) c68322mC.element).LIZIZ).get(c62572cv);
            }
            c68322mC.element = (T) ((C7C3) c68322mC.element).LIZ;
        }
        return null;
    }

    public final void LIZJ(InterfaceC87283bg interfaceC87283bg, String str) {
        if (interfaceC87283bg == null) {
            return;
        }
        C8K7.LIZ("assem_hierarchy_data", new AqS58S1200000_3(this, str, interfaceC87283bg, 0), false);
        this.LIZIZ.put(new C62572cv(interfaceC87283bg.getClass(), str), interfaceC87283bg);
    }
}
