package X;

import Y.ARunnableS11S0101000_7;
import Y.ARunnableS12S0101000_8;
import android.text.TextUtils;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Wbi, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82622Wbi {
    public static final EVG LJIILIIL = new EVG();
    public final InterfaceC82629Wbp LIZ;
    public final C82622Wbi LIZIZ;
    public final java.util.Map<C83683Qe, AbstractC82618Wbe<?>> LIZJ;
    public final java.util.Map<Class<Object>, Object> LIZLLL;
    public final java.util.Map<Object, java.util.Map<?, AbstractC82618Wbe<?>>> LJ;
    public final java.util.Map<Object, List<AbstractC82618Wbe<?>>> LJFF;
    public final java.util.Map<Object, java.util.Set<AbstractC82618Wbe<?>>> LJI;
    public final java.util.Map<C83683Qe, C82627Wbn> LJII;
    public final java.util.Map<C83683Qe, Object> LJIIIIZZ;
    public final java.util.Map<C83683Qe, List<InterfaceC77386UYs<?>>> LJIIIZ;
    public final java.util.Set<C83683Qe> LJIIJ;
    public volatile RuntimeException LJIIJJI;
    public final C77385UYr LJIIL;

    public C82622Wbi(C82621Wbh... c82621WbhArr) {
        this(new C82628Wbo(""), null, c82621WbhArr);
    }

    public final <T> void LIZ(C83683Qe c83683Qe) {
        if (this.LIZJ.get(c83683Qe) != null) {
            ((HashSet) this.LJIIJ).add(c83683Qe);
            return;
        }
        C82622Wbi c82622Wbi = this.LIZIZ;
        if (c82622Wbi == null) {
            return;
        }
        c82622Wbi.LIZ(c83683Qe);
    }

    public final boolean LIZIZ(Class cls) {
        return LIZJ(new C83683Qe(null, cls));
    }

    public final boolean LIZJ(C83683Qe c83683Qe) {
        if (this.LIZJ.get(c83683Qe) != null) {
            return true;
        }
        C82622Wbi c82622Wbi = this.LIZIZ;
        if (c82622Wbi != null) {
            return c82622Wbi.LIZJ(c83683Qe);
        }
        return false;
    }

    public final <T> C15070iV<AbstractC82618Wbe<T>, InterfaceC77388UYu> LJI(C83683Qe c83683Qe) {
        AbstractC82618Wbe<?> abstractC82618Wbe = this.LIZJ.get(c83683Qe);
        if (abstractC82618Wbe != null) {
            return new C15070iV<>(abstractC82618Wbe, this.LJIIL);
        }
        C82622Wbi c82622Wbi = this.LIZIZ;
        if (c82622Wbi != null) {
            return c82622Wbi.LJI(c83683Qe);
        }
        return null;
    }

    public final <T> T LJII(Class<T> cls) {
        return (T) LJIIIIZZ(null, cls);
    }

    public final <T> void LJIIJJI(C83683Qe c83683Qe) {
        if (this.LIZJ.get(c83683Qe) != null) {
            ((HashSet) this.LJIIJ).remove(c83683Qe);
            return;
        }
        C82622Wbi c82622Wbi = this.LIZIZ;
        if (c82622Wbi == null) {
            return;
        }
        c82622Wbi.LJIIJJI(c83683Qe);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized <T> T LIZLLL(C83683Qe c83683Qe, QBG<C15070iV<AbstractC82618Wbe<T>, InterfaceC77388UYu>> qbg) {
        T t = (T) ((HashMap) this.LJIIIIZZ).get(c83683Qe);
        if (t != null) {
            return t;
        }
        C15070iV LIZIZ = qbg.LIZIZ();
        if (LIZIZ == null) {
            return null;
        }
        AbstractC82618Wbe abstractC82618Wbe = (AbstractC82618Wbe) LIZIZ.LIZ;
        if (abstractC82618Wbe == null) {
            return null;
        }
        boolean z = true;
        if (this.LJII.containsKey(c83683Qe)) {
            java.util.Set<C83683Qe> keySet = ((LinkedHashMap) this.LJII).keySet();
            StringBuilder sb = new StringBuilder();
            for (C83683Qe c83683Qe2 : keySet) {
                C82627Wbn c82627Wbn = (C82627Wbn) ((LinkedHashMap) this.LJII).get(c83683Qe2);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(c83683Qe2.LIZ());
                LIZ.append(" ");
                LIZ.append(c82627Wbn.LIZ);
                LIZ.append("\n ╚> ");
                sb.append(X1D.LIZIZ(LIZ));
            }
            sb.append(c83683Qe.LIZ());
            throw new C58668N0u(C16880lQ.LLLZ("circle dependency: \n %s", new Object[]{sb.toString()}));
        }
        if (abstractC82618Wbe instanceof C82617Wbd) {
            this.LJII.put(c83683Qe, new C82627Wbn("singleton"));
        } else {
            this.LJII.put(c83683Qe, new C82627Wbn(""));
        }
        T t2 = (T) abstractC82618Wbe.LIZIZ(this);
        if (t2 != null) {
            if (!((HashMap) this.LJIIIIZZ).containsKey(c83683Qe)) {
                if (abstractC82618Wbe instanceof C82617Wbd) {
                    ((HashMap) this.LJIIIIZZ).put(c83683Qe, t2);
                }
                abstractC82618Wbe.LIZ(t2, this);
                if (abstractC82618Wbe instanceof C82617Wbd) {
                    ((HashMap) this.LJIIIIZZ).remove(c83683Qe);
                }
                this.LJII.remove(c83683Qe);
                InterfaceC77388UYu interfaceC77388UYu = (InterfaceC77388UYu) LIZIZ.LIZIZ;
                if (interfaceC77388UYu != null) {
                    if (this.LJII.size() == 0) {
                        z = false;
                    }
                    interfaceC77388UYu.LIZ(c83683Qe, t2, z);
                }
                return t2;
            }
            throw new C79534VJi("Why duplicate key!!!");
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Provider should return nonnull value ");
        LIZ2.append(abstractC82618Wbe);
        throw new NullPointerException(X1D.LIZIZ(LIZ2));
    }

    public final <T> T LJ(Class<T> cls, String str) {
        if (this.LJIIJJI == null) {
            try {
                return (T) LJFF(str, cls);
            } catch (RuntimeException e) {
                this.LJIIJJI = e;
                EVG evg = LJIILIIL;
                evg.LIZ.postAtFrontOfQueue(new ARunnableS12S0101000_8(1, e, 4));
                throw e;
            }
        }
        throw this.LJIIJJI;
    }

    public final Object LJFF(String str, Type type) {
        Object LJIIIIZZ = LJIIIIZZ(str, type);
        if (LJIIIIZZ != null) {
            return LJIIIIZZ;
        }
        StringBuilder sb = new StringBuilder();
        C83683Qe c83683Qe = new C83683Qe(str, type);
        if (this.LJII.size() > 0) {
            for (C83683Qe c83683Qe2 : ((LinkedHashMap) this.LJII).keySet()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(c83683Qe2.LIZ());
                LIZ.append("\n ╚> ");
                sb.append(X1D.LIZIZ(LIZ));
            }
            sb.append(c83683Qe.LIZ());
            throw new UCJ(C16880lQ.LLLZ("Dependency not registered: \n %s", new Object[]{sb.toString()}));
        }
        sb.append(c83683Qe.LIZ());
        throw new UCJ(C16880lQ.LLLZ("Dependency not registered %s", new Object[]{sb.toString()}));
    }

    public final Object LJIIIIZZ(String str, Type type) {
        if (type == C82622Wbi.class) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            throw new IllegalArgumentException("ObjectContainer.class should not contain name");
        }
        C83683Qe c83683Qe = new C83683Qe(str, type);
        C83673Wsf c83673Wsf = new C83673Wsf(LJI(c83683Qe));
        if (this.LJIIJJI == null) {
            try {
                return LIZLLL(c83683Qe, c83673Wsf);
            } catch (RuntimeException e) {
                this.LJIIJJI = e;
                EVG evg = LJIILIIL;
                evg.LIZ.postAtFrontOfQueue(new ARunnableS11S0101000_7(0, e, 17));
                throw e;
            }
        }
        throw this.LJIIJJI;
    }

    public final AbstractC82626Wbm LJIIIZ(String str, Type type) {
        if (type == C82622Wbi.class) {
            if (TextUtils.isEmpty(str)) {
                return new C82625Wbl(this);
            }
            throw new IllegalArgumentException("ObjectContainer.class should not contain name");
        }
        C83683Qe c83683Qe = new C83683Qe(str, type);
        C15070iV LJI = LJI(c83683Qe);
        if (LJI == null) {
            return null;
        }
        return new C82623Wbj(this, c83683Qe, LJI);
    }

    public final <T> boolean LJIIJ(C83683Qe c83683Qe, InterfaceC77386UYs<T> interfaceC77386UYs) {
        if (this.LIZJ.get(c83683Qe) != null) {
            List list = (List) ((HashMap) this.LJIIIZ).get(c83683Qe);
            if (list == null) {
                list = new ArrayList();
                ((HashMap) this.LJIIIZ).put(c83683Qe, list);
            }
            list.add(interfaceC77386UYs);
            return true;
        }
        C82622Wbi c82622Wbi = this.LIZIZ;
        if (c82622Wbi != null) {
            return c82622Wbi.LJIIJ(c83683Qe, interfaceC77386UYs);
        }
        return false;
    }

    public final <T> boolean LJIIL(C83683Qe c83683Qe, InterfaceC77386UYs<T> interfaceC77386UYs) {
        if (this.LIZJ.get(c83683Qe) != null) {
            List list = (List) ((HashMap) this.LJIIIZ).get(c83683Qe);
            if (list == null) {
                return false;
            }
            return list.remove(interfaceC77386UYs);
        }
        C82622Wbi c82622Wbi = this.LIZIZ;
        if (c82622Wbi == null) {
            return false;
        }
        return c82622Wbi.LJIIL(c83683Qe, interfaceC77386UYs);
    }

    public C82622Wbi(InterfaceC82629Wbp interfaceC82629Wbp, C82622Wbi c82622Wbi, C82621Wbh... c82621WbhArr) {
        this.LJII = new LinkedHashMap();
        this.LJIIIIZZ = new HashMap();
        this.LJIIIZ = new HashMap();
        this.LJIIJ = new HashSet();
        this.LJIIJJI = null;
        this.LJIIL = new C77385UYr(this);
        this.LIZ = interfaceC82629Wbp;
        this.LIZIZ = c82622Wbi;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        for (C82621Wbh c82621Wbh : c82621WbhArr) {
            for (Map.Entry entry : ((LinkedHashMap) c82621Wbh.LIZJ).entrySet()) {
                if (!linkedHashMap.containsKey(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("duplicate already contain ");
                    LIZ.append(((C83683Qe) entry.getKey()).LIZ());
                    LIZ.append(" ");
                    LIZ.append(entry.getValue());
                    throw new C79535VJj(X1D.LIZIZ(LIZ));
                }
            }
            for (Map.Entry entry2 : ((LinkedHashMap) c82621Wbh.LIZLLL).entrySet()) {
                if (!linkedHashMap2.containsKey(entry2.getKey())) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                } else {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("duplicate already contain ");
                    LIZ2.append(entry2.getKey());
                    LIZ2.append(" ");
                    LIZ2.append(entry2.getValue());
                    throw new C79535VJj(X1D.LIZIZ(LIZ2));
                }
            }
            for (Map.Entry entry3 : ((LinkedHashMap) c82621Wbh.LJ).entrySet()) {
                if (!linkedHashMap3.containsKey(entry3.getKey())) {
                    linkedHashMap3.put(entry3.getKey(), entry3.getValue());
                } else {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("duplicate already contain ");
                    LIZ3.append(entry3.getKey());
                    LIZ3.append(" ");
                    LIZ3.append(entry3.getValue());
                    throw new C79535VJj(X1D.LIZIZ(LIZ3));
                }
            }
            for (Map.Entry entry4 : ((LinkedHashMap) c82621Wbh.LJI).entrySet()) {
                if (!linkedHashMap4.containsKey(entry4.getKey())) {
                    linkedHashMap4.put(entry4.getKey(), entry4.getValue());
                } else {
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("duplicate already contain ");
                    LIZ4.append(entry4.getKey());
                    LIZ4.append(" ");
                    LIZ4.append(entry4.getValue());
                    throw new C79535VJj(X1D.LIZIZ(LIZ4));
                }
            }
            for (Map.Entry entry5 : ((LinkedHashMap) c82621Wbh.LJFF).entrySet()) {
                if (!linkedHashMap5.containsKey(entry5.getKey())) {
                    linkedHashMap5.put(entry5.getKey(), entry5.getValue());
                } else {
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("duplicate already contain ");
                    LIZ5.append(entry5.getKey());
                    LIZ5.append(" ");
                    LIZ5.append(entry5.getValue());
                    throw new C79535VJj(X1D.LIZIZ(LIZ5));
                }
            }
        }
        this.LIZJ = Collections.unmodifiableMap(linkedHashMap);
        this.LIZLLL = Collections.unmodifiableMap(linkedHashMap2);
        this.LJ = Collections.unmodifiableMap(linkedHashMap3);
        this.LJFF = Collections.unmodifiableMap(linkedHashMap4);
        this.LJI = Collections.unmodifiableMap(linkedHashMap5);
    }
}
