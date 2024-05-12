package X;

import java.util.List;
import kotlin.jvm.internal.AqS161S0100000_11;
import kotlin.jvm.internal.o;

/* renamed from: X.R2h, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC68899R2h<K, V> implements InterfaceC68904R2m<K, V> {
    public static final /* synthetic */ InterfaceC74236TBo[] LIZIZ;
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(new AqS161S0100000_11(this, 89));

    static {
        TBT tbt = new TBT(C65352Pkq.LIZ(AbstractC68899R2h.class), "dataSource", "getDataSource$model_release()Lcom/bytedance/jedi/model/datasource/IDataSource;");
        C65352Pkq.LIZ.getClass();
        LIZIZ = new InterfaceC74236TBo[]{tbt};
    }

    public abstract V LIZIZ(K k);

    public abstract List<OSZ<K, V>> LJII();

    public abstract void LJIIIIZZ(K k, V v);

    @Override // X.InterfaceC68904R2m
    public final C73565Su1 getAll() {
        return AbstractC73672Svk.LJJIJIL(LJII());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC68904R2m
    public final C73565Su1 get(Object obj) {
        return AbstractC73672Svk.LJJIJIL(C1XY.LJJIIJ(LIZIZ(obj)));
    }

    @Override // X.InterfaceC68904R2m
    public final void put(K k, V v) {
        InterfaceC68901R2j<?> LIZ;
        LJIIIIZZ(k, v);
        InterfaceC68914R2w LJ = UC0.LJ(this);
        if (!(LJ instanceof InterfaceC68900R2i)) {
            LJ = null;
        }
        InterfaceC68900R2i interfaceC68900R2i = (InterfaceC68900R2i) LJ;
        if (interfaceC68900R2i != null) {
            java.util.Map<QDR<?>, java.util.Map<?, InterfaceC68901R2j<?>>> map = C68757Qyf.LIZ;
            if (map.get(this) != null) {
                java.util.Map<?, InterfaceC68901R2j<?>> map2 = map.get(this);
                if (map2 != null) {
                    if (map2.get(k) != null) {
                        java.util.Map<?, InterfaceC68901R2j<?>> map3 = map.get(this);
                        if (map3 != null) {
                            InterfaceC68901R2j<?> interfaceC68901R2j = map3.get(k);
                            if (interfaceC68901R2j != null) {
                                LIZ = interfaceC68901R2j;
                                interfaceC68900R2i.LIZLLL(LIZ);
                            }
                            throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.jedi.model.traceable.ITraceable<kotlin.Pair<K, V?>>");
                        }
                        o.LJIIZILJ();
                        throw null;
                    }
                } else {
                    o.LJIIZILJ();
                    throw null;
                }
            }
            LIZ = QDQ.LIZ(new OSZ(k, v));
            interfaceC68900R2i.LIZLLL(LIZ);
        }
    }
}
