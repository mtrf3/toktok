package X;

import java.util.LinkedHashMap;
import java.util.List;
import ud2.ApS201S0100000_14;

/* renamed from: X.Wbh, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82621Wbh {
    public final InterfaceC82629Wbp LIZ;
    public final C82622Wbi LIZIZ;
    public final java.util.Map<C83683Qe, AbstractC82618Wbe<?>> LIZJ;
    public final java.util.Map<Class<Object>, Object> LIZLLL;
    public final java.util.Map<Object, java.util.Map<?, AbstractC82618Wbe<?>>> LJ;
    public final java.util.Map<Object, java.util.Set<AbstractC82618Wbe<?>>> LJFF;
    public final java.util.Map<Object, List<AbstractC82618Wbe<?>>> LJI;

    public C82621Wbh() {
        this(new C82628Wbo(""), null);
    }

    public final C82622Wbi LIZ() {
        return new C82622Wbi(this.LIZ, this.LIZIZ, this);
    }

    public C82621Wbh(C82628Wbo c82628Wbo, C82622Wbi c82622Wbi) {
        this.LIZJ = new LinkedHashMap();
        this.LIZLLL = new LinkedHashMap();
        this.LJ = new LinkedHashMap();
        this.LJFF = new LinkedHashMap();
        this.LJI = new LinkedHashMap();
        this.LIZ = c82628Wbo;
        this.LIZIZ = c82622Wbi;
        if (c82622Wbi != null) {
            c82628Wbo.getClass();
        }
    }

    public final void LJ(Class cls, AbstractC82618Wbe abstractC82618Wbe) {
        LIZLLL(cls, null, abstractC82618Wbe);
    }

    public final <T> C82624Wbk<T> LIZIZ(Class<T> cls, String str, AbstractC82618Wbe<T> abstractC82618Wbe) {
        C83683Qe c83683Qe = new C83683Qe(str, cls);
        if (!this.LIZJ.containsKey(c83683Qe)) {
            this.LIZJ.put(c83683Qe, abstractC82618Wbe);
            return new C82624Wbk<>(this, cls, str);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("duplicate already contain ");
        LIZ.append(cls.toString());
        LIZ.append(" ");
        LIZ.append(((LinkedHashMap) this.LIZJ).get(c83683Qe));
        throw new C79535VJj(X1D.LIZIZ(LIZ));
    }

    public final C82624Wbk LIZJ(Class cls, String str, Object obj) {
        return LIZIZ(cls, str, new C82617Wbd(new ApS201S0100000_14(obj, 14)));
    }

    public final <T> C82624Wbk<T> LIZLLL(Class<T> cls, String str, AbstractC82618Wbe<T> abstractC82618Wbe) {
        return LIZIZ(cls, str, new C82617Wbd(abstractC82618Wbe));
    }
}
