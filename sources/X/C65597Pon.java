package X;

/* renamed from: X.Pon, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65597Pon<E> extends AbstractC65598Poo<E> {
    public final AbstractC65590Pog<E> LJLJI;

    @Override // X.AbstractC65598Poo
    public final E LIZ(int i) {
        return this.LJLJI.get(i);
    }

    public C65597Pon(AbstractC65590Pog<E> abstractC65590Pog, int i) {
        super(abstractC65590Pog.size(), i);
        this.LJLJI = abstractC65590Pog;
    }
}
