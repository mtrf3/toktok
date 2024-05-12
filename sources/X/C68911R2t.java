package X;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.R2t, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68911R2t<K, V, REQ, RESP> extends AbstractC73910Sza<K, V> implements InterfaceC68900R2i<OSZ<? extends K, ? extends V>> {
    public final /* synthetic */ C68908R2q LIZIZ;

    @Override // X.InterfaceC68900R2i
    public final void LIZLLL(InterfaceC68901R2j<OSZ<K, V>> traceable) {
        o.LJIIJ(traceable, "traceable");
        this.LIZIZ.LIZLLL(traceable);
    }

    @Override // X.InterfaceC68900R2i
    public final C73422Sri LJFF() {
        return this.LIZIZ.LJFF();
    }

    @Override // X.InterfaceC68914R2w
    public final AbstractC73672Svk<List<OSZ<K, V>>> LJ() {
        C73536StY c73536StY = C73536StY.LJLIL;
        o.LJFF(c73536StY, "Observable.empty()");
        return c73536StY;
    }

    public C68911R2t(R30 r30) {
        super(r30);
        this.LIZIZ = new C68908R2q(r30);
    }

    @Override // X.InterfaceC68914R2w
    public final AbstractC73672Svk<C35794E3a<V>> LIZ(K k) {
        if (!(k instanceof Object) || k == null) {
            C73536StY c73536StY = C73536StY.LJLIL;
            o.LJFF(c73536StY, "Observable.empty()");
            return c73536StY;
        }
        QDR<OSZ<K, V>> LIZIZ = LIZIZ();
        if (LIZIZ != null) {
            InterfaceC68907R2p interfaceC68907R2p = (InterfaceC68907R2p) LIZIZ;
            return interfaceC68907R2p.LIZ(k).LJJIJL(new C68912R2u(interfaceC68907R2p, k));
        }
        throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.jedi.model.fetcher.IFetcher<K, V, REQ, RESP>");
    }

    @Override // X.InterfaceC68914R2w
    public final C73454SsE LIZJ(boolean z, InterfaceC68914R2w... exclude) {
        o.LJIIJ(exclude, "exclude");
        return AbstractC73910Sza.LJIIIIZZ(LJFF().LJJIFFI(new C68916R2y(exclude)).LJJIJL(C79156V4u.LJLJJLL), z).LJJJ(C73969T1h.LIZIZ());
    }

    @Override // X.InterfaceC68914R2w
    public final C73805Sxt LJII(Object obj, InterfaceC68914R2w... interfaceC68914R2wArr) {
        return C77117UOj.LJIIJ(LIZJ(false, (InterfaceC68914R2w[]) Arrays.copyOf(interfaceC68914R2wArr, interfaceC68914R2wArr.length)).LJJJJLL()).LJJIFFI(new C35949E8z(obj)).LJJIJL(TMC.LJLIL);
    }
}
