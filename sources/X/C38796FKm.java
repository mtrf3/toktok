package X;

/* renamed from: X.FKm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38796FKm extends AbstractC73391SrD<Long> {
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ C38795FKl LJLJI;

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        C38795FKl c38795FKl = this.LJLJI;
        String str = this.LJLILLLLZI;
        c38795FKl.getClass();
        C38795FKl.LIZ(str);
    }

    @Override // X.InterfaceC116954iR
    public final /* bridge */ /* synthetic */ void onNext(Object obj) {
    }

    public C38796FKm(C38795FKl c38795FKl, String str) {
        this.LJLJI = c38795FKl;
        this.LJLILLLLZI = str;
    }
}
