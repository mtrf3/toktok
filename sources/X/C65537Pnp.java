package X;

import java.util.Collection;

/* renamed from: X.Pnp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65537Pnp extends AbstractC65516PnU<T>.j {
    public static final long serialVersionUID = 0;
    public final transient AbstractC65516PnU<T>.j LJLJI;
    public transient AbstractC65583PoZ<AbstractC65516PnU<? super T>> LJLJJI;
    public final /* synthetic */ AbstractC65516PnU LJLJJL;

    @Override // X.AbstractC65516PnU.j
    public final AbstractC65516PnU<T>.j interfaces() {
        return this;
    }

    private Object readResolve() {
        return this.LJLJJL.getTypes().interfaces();
    }

    @Override // X.AbstractC65516PnU.j, X.AbstractC65543Pnv
    /* renamed from: LJIIIZ */
    public final java.util.Set<AbstractC65516PnU<? super T>> LJII() {
        java.util.Set set = this.LJLJJI;
        if (set == null) {
            AbstractC65540Pns LIZJ = AbstractC65540Pns.LJFF(this.LJLJI).LIZJ(EnumC65527Pnf.LJLILLLLZI);
            AbstractC65583PoZ<AbstractC65516PnU<? super T>> copyOf = AbstractC65583PoZ.copyOf((Iterable) LIZJ.LJLIL.or((AbstractC65743Pr9<Iterable<E>>) LIZJ));
            this.LJLJJI = copyOf;
            return copyOf;
        }
        return set;
    }

    @Override // X.AbstractC65516PnU.j
    public final AbstractC65516PnU<T>.j classes() {
        throw new UnsupportedOperationException("interfaces().classes() not supported.");
    }

    @Override // X.AbstractC65516PnU.j
    public final java.util.Set<Class<? super T>> rawTypes() {
        AbstractC65540Pns LIZJ = AbstractC65540Pns.LJFF(AbstractC65539Pnr.LIZIZ.LIZIZ(this.LJLJJL.getRawTypes())).LIZJ(new C65536Pno());
        return AbstractC65583PoZ.copyOf((Iterable) LIZJ.LJLIL.or((AbstractC65743Pr9<Iterable<E>>) LIZJ));
    }

    @Override // X.AbstractC65516PnU.j, X.AbstractC65543Pnv, X.AbstractC65559PoB, X.AbstractC65561PoD
    public final /* bridge */ /* synthetic */ Object LJII() {
        return LJII();
    }

    @Override // X.AbstractC65516PnU.j, X.AbstractC65543Pnv, X.AbstractC65559PoB
    /* renamed from: LJIIIIZZ */
    public final /* bridge */ /* synthetic */ Collection LJII() {
        return LJII();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65537Pnp(AbstractC65516PnU abstractC65516PnU, AbstractC65516PnU<T>.j jVar) {
        super();
        this.LJLJJL = abstractC65516PnU;
        this.LJLJI = jVar;
    }
}
