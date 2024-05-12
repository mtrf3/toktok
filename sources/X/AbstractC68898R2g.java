package X;

import java.util.List;
import kotlin.jvm.internal.AqS161S0100000_11;
import kotlin.jvm.internal.o;

/* renamed from: X.R2g, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC68898R2g<K, V> implements InterfaceC68903R2l<K, V> {
    public static final /* synthetic */ InterfaceC74236TBo[] LIZIZ;
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(new AqS161S0100000_11(this, 90));

    static {
        TBT tbt = new TBT(C65352Pkq.LIZ(AbstractC68898R2g.class), "dataSource", "getDataSource$model_release()Lcom/bytedance/jedi/model/datasource/IDataSource;");
        C65352Pkq.LIZ.getClass();
        LIZIZ = new InterfaceC74236TBo[]{tbt};
    }

    public void LIZIZ() {
    }

    public abstract List<V> LJII(K k);

    public abstract List<OSZ<K, List<V>>> LJIIIIZZ();

    public abstract void LJIIIZ(K k, List<? extends V> list);

    @Override // X.InterfaceC68903R2l
    public final C73565Su1 getAll() {
        return AbstractC73672Svk.LJJIJIL(LJIIIIZZ());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC68903R2l
    public final C73565Su1 get(Object obj) {
        return AbstractC73672Svk.LJJIJIL(C1XY.LJJIIJ(LJII(obj)));
    }

    @Override // X.InterfaceC68903R2l
    public final void LIZJ(K k, List<? extends V> list) {
        Object LIZ;
        LIZIZ();
        LJIIIZ(k, list);
        InterfaceC68914R2w LJFF = UC0.LJFF(this);
        if (!(LJFF instanceof InterfaceC68900R2i)) {
            LJFF = null;
        }
        InterfaceC68900R2i interfaceC68900R2i = (InterfaceC68900R2i) LJFF;
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
                                LIZ = interfaceC68901R2j.LIZIZ(new OSZ(k, list));
                                interfaceC68900R2i.LIZLLL(LIZ);
                            }
                            throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.jedi.model.traceable.ITraceable<kotlin.Pair<K, kotlin.collections.List<V>?>>");
                        }
                        o.LJIIZILJ();
                        throw null;
                    }
                } else {
                    o.LJIIZILJ();
                    throw null;
                }
            }
            LIZ = QDQ.LIZ(new OSZ(k, list));
            interfaceC68900R2i.LIZLLL(LIZ);
        }
    }
}
