package X;

import X.AbstractC36987EfP;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.o;

/* renamed from: X.Ebu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC36770Ebu<T extends AbstractC36987EfP> {
    public InterfaceC36763Ebn LIZ;
    public Executor LIZIZ;
    public InterfaceC36604EYe LIZJ;
    public InterfaceC36737EbN LIZLLL;
    public List<? extends InterfaceC36772Ebw> LJ;
    public InterfaceC36766Ebq LJFF;
    public InterfaceC36767Ebr LJI;
    public boolean LJII;
    public java.util.Map<String, InterfaceC65784Pro<Boolean>> LJIIIZ;
    public final String LJIIJ = "default_business";
    public int LJIIIIZZ = 32;

    public abstract AbstractC36987EfP LIZIZ(String str, C36769Ebt c36769Ebt, C36735EbL c36735EbL);

    public final T LIZ() {
        InterfaceC36737EbN interfaceC36737EbN = this.LIZLLL;
        if (interfaceC36737EbN != null) {
            InterfaceC36604EYe interfaceC36604EYe = this.LIZJ;
            if (interfaceC36604EYe != null) {
                Executor executor = this.LIZIZ;
                if (executor != null) {
                    InterfaceC36767Ebr interfaceC36767Ebr = this.LJI;
                    if (interfaceC36767Ebr != null) {
                        C36762Ebm.LIZ = interfaceC36767Ebr;
                    }
                    C36735EbL c36735EbL = new C36735EbL(executor, interfaceC36737EbN, this.LJFF);
                    C36756Ebg c36756Ebg = new C36756Ebg(this.LIZ, interfaceC36604EYe, executor, this.LJIIIIZZ);
                    T t = (T) LIZIZ(this.LJIIJ, new C36769Ebt(c36756Ebg, c36735EbL, this.LJFF, this.LJIIIZ, this.LJ), c36735EbL);
                    if (this.LJII) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(this.LJIIJ);
                        LIZ.append("@");
                        LIZ.append(t.hashCode());
                        String businessTag = X1D.LIZIZ(LIZ);
                        o.LJIIJ(businessTag, "businessTag");
                        c36735EbL.LIZLLL = businessTag;
                        c36735EbL.LIZJ = true;
                        C36738EbO c36738EbO = C36738EbO.LIZLLL;
                        C35980EAe<String, C36760Ebk> lruCache = c36756Ebg.LIZ;
                        c36738EbO.getClass();
                        o.LJIIJ(lruCache, "lruCache");
                        ((ConcurrentHashMap) C36738EbO.LIZJ.getValue()).put(businessTag, lruCache);
                    }
                    return t;
                }
                "workerExecutor must be provided.".toString();
                throw new IllegalStateException("workerExecutor must be provided.");
            }
            "networkExecutor must be provided.".toString();
            throw new IllegalStateException("networkExecutor must be provided.");
        }
        "configProvider must be provided.".toString();
        throw new IllegalStateException("configProvider must be provided.");
    }
}
