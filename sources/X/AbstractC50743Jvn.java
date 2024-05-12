package X;

import X.InterfaceC50315Jot;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Jvn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50743Jvn<T extends InterfaceC50315Jot> {
    public static final ArrayList<AbstractC50743Jvn<?>> LJ = new ArrayList<>();
    public final HashMap<EnumC50746Jvq, C50747Jvr<T>> LIZ;
    public final ArrayList<EnumC50746Jvq> LIZIZ;
    public final java.util.Map<String, T> LIZJ;
    public final C50745Jvp<T> LIZLLL;

    public abstract T LIZ();

    public AbstractC50743Jvn() {
        LJ.add(this);
        this.LIZ = new HashMap<>();
        this.LIZIZ = new ArrayList<>();
        java.util.Map<String, T> synchronizedMap = Collections.synchronizedMap(new C35953E9d(0, 1, null));
        o.LJIIIIZZ(synchronizedMap, "synchronizedMap(LRULinkedHashMap<String, T>())");
        this.LIZJ = synchronizedMap;
        this.LIZLLL = new C50745Jvp<>();
    }

    public final synchronized C50747Jvr<T> LIZJ(EnumC50746Jvq binderKeyProvider) {
        o.LJIIIZ(binderKeyProvider, "binderKeyProvider");
        if (!this.LIZIZ.contains(binderKeyProvider)) {
            this.LIZIZ.add(binderKeyProvider);
        }
        return new C50747Jvr<>(binderKeyProvider, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C50744Jvo<T> LIZIZ(EnumC50746Jvq binder, C50650JuI c50650JuI) {
        C50650JuI c50650JuI2 = c50650JuI;
        o.LJIIIZ(binder, "binder");
        C50747Jvr<T> c50747Jvr = this.LIZ.get(binder);
        if (c50747Jvr == null) {
            c50747Jvr = LIZJ(binder);
            this.LIZ.put(binder, c50747Jvr);
        }
        if (c50650JuI2 == null) {
            c50650JuI2 = new C50650JuI(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0);
        }
        return new C50744Jvo<>(c50650JuI2, c50747Jvr.LIZ, c50747Jvr.LIZIZ);
    }
}
