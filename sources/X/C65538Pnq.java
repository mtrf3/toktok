package X;

import java.util.Collection;

/* renamed from: X.Pnq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65538Pnq extends AbstractC65516PnU<T>.j {
    public static final long serialVersionUID = 0;
    public transient AbstractC65583PoZ<AbstractC65516PnU<? super T>> LJLJI;
    public final /* synthetic */ AbstractC65516PnU LJLJJI;

    @Override // X.AbstractC65516PnU.j
    public final AbstractC65516PnU<T>.j classes() {
        return this;
    }

    private Object readResolve() {
        return this.LJLJJI.getTypes().classes();
    }

    @Override // X.AbstractC65516PnU.j, X.AbstractC65543Pnv
    /* renamed from: LJIIIZ */
    public final java.util.Set<AbstractC65516PnU<? super T>> LJII() {
        java.util.Set set = this.LJLJI;
        if (set == null) {
            AbstractC65540Pns LIZJ = AbstractC65540Pns.LJFF(new C65541Pnt(AbstractC65539Pnr.LIZ).LIZIZ(AbstractC65590Pog.of(this.LJLJJI))).LIZJ(EnumC65527Pnf.LJLIL);
            AbstractC65583PoZ<AbstractC65516PnU<? super T>> copyOf = AbstractC65583PoZ.copyOf((Iterable) LIZJ.LJLIL.or((AbstractC65743Pr9<Iterable<E>>) LIZJ));
            this.LJLJI = copyOf;
            return copyOf;
        }
        return set;
    }

    @Override // X.AbstractC65516PnU.j
    public final AbstractC65516PnU<T>.j interfaces() {
        throw new UnsupportedOperationException("classes().interfaces() not supported.");
    }

    @Override // X.AbstractC65516PnU.j
    public final java.util.Set<Class<? super T>> rawTypes() {
        return AbstractC65583PoZ.copyOf((Collection) new C65541Pnt(AbstractC65539Pnr.LIZIZ).LIZIZ(this.LJLJJI.getRawTypes()));
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
    public C65538Pnq(AbstractC65516PnU abstractC65516PnU) {
        super();
        this.LJLJJI = abstractC65516PnU;
    }
}
