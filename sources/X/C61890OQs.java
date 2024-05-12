package X;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: X.OQs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61890OQs<T> extends AbstractC61891OQt<T> {
    public int LJLJI;
    public int LJLJJI;
    public final /* synthetic */ C61889OQr<T> LJLJJL;

    @Override // X.AbstractC61891OQt
    public final void LIZ() {
        int i = this.LJLJI;
        if (i == 0) {
            this.LJLIL = EnumC61894OQw.Done;
            return;
        }
        C61889OQr<T> c61889OQr = this.LJLJJL;
        Object[] objArr = c61889OQr.LJLILLLLZI;
        int i2 = this.LJLJJI;
        this.LJLILLLLZI = (T) objArr[i2];
        this.LJLIL = EnumC61894OQw.Ready;
        this.LJLJJI = (i2 + 1) % c61889OQr.LJLJI;
        this.LJLJI = i - 1;
    }

    public C61890OQs(C61889OQr<T> c61889OQr) {
        this.LJLJJL = c61889OQr;
        this.LJLJI = c61889OQr.LIZJ();
        this.LJLJJI = c61889OQr.LJLJJI;
    }
}
