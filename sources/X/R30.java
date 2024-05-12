package X;

import Y.AfS60S0200000_11;
import kotlin.jvm.internal.AqS161S0100000_11;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public abstract class R30<K, V, REQ, RESP> implements InterfaceC68907R2p<K, V, REQ, RESP> {
    public static final /* synthetic */ InterfaceC74236TBo[] LIZIZ;
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(new AqS161S0100000_11(this, 102));

    static {
        TBT tbt = new TBT(C65352Pkq.LIZ(R30.class), "dataSource", "getDataSource$model_release()Lcom/bytedance/jedi/model/datasource/IDataSource;");
        C65352Pkq.LIZ.getClass();
        LIZIZ = new InterfaceC74236TBo[]{tbt};
    }

    public abstract AbstractC73672Svk<RESP> LJII(REQ req);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC68907R2p
    public final C73422Sri LIZ(Object obj) {
        AbstractC73672Svk<RESP> observable = LJII(obj);
        o.LJIIJ(observable, "observable");
        return observable.LJIJJLI(new AfS60S0200000_11(obj, this, 5));
    }
}
