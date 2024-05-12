package X;

/* renamed from: X.FCd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38579FCd extends AbstractC65781Prl implements InterfaceC88471Ynr<Boolean, String, C76800UCe> {
    public final /* synthetic */ C68322mC<String> LJLIL;
    public final /* synthetic */ C68322mC<String> LJLILLLLZI;
    public final /* synthetic */ C68322mC<String> LJLJI;
    public final /* synthetic */ C68322mC<String> LJLJJI;
    public final /* synthetic */ C68322mC<String> LJLJJL;
    public final /* synthetic */ C68322mC<String> LJLJJLL;
    public final /* synthetic */ C68322mC<String> LJLJL;
    public final /* synthetic */ boolean LJLJLJ;
    public final /* synthetic */ boolean LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38579FCd(C68322mC<String> c68322mC, C68322mC<String> c68322mC2, C68322mC<String> c68322mC3, C68322mC<String> c68322mC4, C68322mC<String> c68322mC5, C68322mC<String> c68322mC6, C68322mC<String> c68322mC7, boolean z, boolean z2) {
        super(2);
        this.LJLIL = c68322mC;
        this.LJLILLLLZI = c68322mC2;
        this.LJLJI = c68322mC3;
        this.LJLJJI = c68322mC4;
        this.LJLJJL = c68322mC5;
        this.LJLJJLL = c68322mC6;
        this.LJLJL = c68322mC7;
        this.LJLJLJ = z;
        this.LJLJLLL = z2;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(Boolean bool, String str) {
        boolean booleanValue = bool.booleanValue();
        String str2 = str;
        C68322mC<String> c68322mC = this.LJLIL;
        C68322mC<String> c68322mC2 = this.LJLILLLLZI;
        C68322mC<String> c68322mC3 = this.LJLJI;
        C68322mC<String> c68322mC4 = this.LJLJJI;
        C68322mC<String> c68322mC5 = this.LJLJJL;
        C68322mC<String> c68322mC6 = this.LJLJJLL;
        C68322mC<String> c68322mC7 = this.LJLJL;
        boolean z = this.LJLJLJ;
        boolean z2 = this.LJLJLLL;
        try {
            if (FCZ.LIZ()) {
                C38995FSd.LIZJ().execute(new RunnableC38578FCc(c68322mC, c68322mC2, c68322mC3, c68322mC4, c68322mC5, c68322mC6, c68322mC7, booleanValue, str2, z, z2));
            } else {
                C38577FCb.LIZ(c68322mC.element, c68322mC2.element, c68322mC3.element, c68322mC4.element, c68322mC5.element, c68322mC6.element, c68322mC7.element, booleanValue, str2, z, z2);
            }
        } catch (Throwable unused) {
        }
        return C76800UCe.LIZ;
    }
}
