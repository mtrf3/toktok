package X;

import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.R2s, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68910R2s<K, V> extends AbstractC73910Sza<K, V> implements InterfaceC68900R2i<OSZ<? extends K, ? extends V>>, InterfaceC68905R2n<OSZ<? extends K, ? extends V>> {
    public final /* synthetic */ C68908R2q LIZIZ;
    public final /* synthetic */ C68902R2k LIZJ;

    @Override // X.InterfaceC68900R2i
    public final void LIZLLL(InterfaceC68901R2j<OSZ<K, V>> traceable) {
        o.LJIIJ(traceable, "traceable");
        this.LIZIZ.LIZLLL(traceable);
    }

    @Override // X.InterfaceC68900R2i
    public final C73422Sri LJFF() {
        return this.LIZIZ.LJFF();
    }

    @Override // X.InterfaceC68905R2n
    public final void LJI(InterfaceC68901R2j<OSZ<K, V>> traceable) {
        o.LJIIJ(traceable, "traceable");
        this.LIZJ.LJI(traceable);
    }

    @Override // X.InterfaceC68914R2w
    public final AbstractC73672Svk<List<OSZ<K, V>>> LJ() {
        QDR<OSZ<K, V>> LIZIZ = LIZIZ();
        if (LIZIZ != null) {
            return ((InterfaceC68904R2m) LIZIZ).getAll();
        }
        throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.jedi.model.cache.ICache<K, V>");
    }

    public C68910R2s(AbstractC68899R2h abstractC68899R2h) {
        super(abstractC68899R2h);
        this.LIZIZ = new C68908R2q(abstractC68899R2h);
        this.LIZJ = new C68902R2k(abstractC68899R2h);
    }

    @Override // X.InterfaceC68914R2w
    public final AbstractC73672Svk<C35794E3a<V>> LIZ(K k) {
        QDR<OSZ<K, V>> LIZIZ = LIZIZ();
        if (LIZIZ != null) {
            return ((InterfaceC68904R2m) LIZIZ).get(k);
        }
        throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.jedi.model.cache.ICache<K, V>");
    }

    @Override // X.InterfaceC68914R2w
    public final C73454SsE LIZJ(boolean z, InterfaceC68914R2w... exclude) {
        o.LJIIJ(exclude, "exclude");
        return AbstractC73910Sza.LJIIIIZZ(LJFF().LJJIFFI(new C68913R2v(exclude)).LJJIJL(C68906R2o.LJLIL), z).LJJJ(C73969T1h.LIZIZ());
    }

    @Override // X.InterfaceC68914R2w
    public final C73805Sxt LJII(Object obj, InterfaceC68914R2w... interfaceC68914R2wArr) {
        return C77117UOj.LJIIJ(LIZJ(false, (InterfaceC68914R2w[]) Arrays.copyOf(interfaceC68914R2wArr, interfaceC68914R2wArr.length)).LJJJJLL()).LJJIFFI(new C35948E8y(obj)).LJJIJL(C78596Usy.LJLILLLLZI);
    }
}
