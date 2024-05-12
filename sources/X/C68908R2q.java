package X;

import Y.AfS63S0100000_11;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.R2q, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68908R2q<K, V> implements InterfaceC68900R2i<OSZ<? extends K, ? extends V>> {
    public static final /* synthetic */ InterfaceC74236TBo[] LIZJ;
    public final WeakReference<QDR<OSZ<K, V>>> LIZ;
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(R31.LJLIL);

    static {
        TBT tbt = new TBT(C65352Pkq.LIZ(C68908R2q.class), "subject", "getSubject()Lcom/jakewharton/rxrelay2/Relay;");
        C65352Pkq.LIZ.getClass();
        LIZJ = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.InterfaceC68900R2i
    public final C73422Sri LJFF() {
        return ((AbstractC73672Svk) this.LIZIZ.getValue()).LJIJJLI(new AfS63S0100000_11(this, 53));
    }

    public C68908R2q(QDR<OSZ<K, V>> qdr) {
        this.LIZ = new WeakReference<>(qdr);
    }

    @Override // X.InterfaceC68900R2i
    public final void LIZLLL(InterfaceC68901R2j<OSZ<K, V>> traceable) {
        o.LJIIJ(traceable, "traceable");
        ((R35) this.LIZIZ.getValue()).accept(traceable);
    }
}
