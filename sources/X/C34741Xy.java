package X;

/* renamed from: X.1Xy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34741Xy implements InterfaceC19330pN {
    public final AbstractC03300Ba LIZ;
    public final C43531nJ LIZIZ;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1nJ] */
    public C34741Xy(final AbstractC03300Ba abstractC03300Ba) {
        this.LIZ = abstractC03300Ba;
        this.LIZIZ = new C1CG<C19320pM>(abstractC03300Ba) { // from class: X.1nJ
            @Override // X.C0BI
            public final String LIZIZ() {
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            }

            @Override // X.C1CG
            public final void LIZLLL(InterfaceC37591dj interfaceC37591dj, C19320pM c19320pM) {
                C19320pM c19320pM2 = c19320pM;
                String str = c19320pM2.LIZ;
                if (str == null) {
                    interfaceC37591dj.LLLLLLJ(1);
                } else {
                    interfaceC37591dj.LJJII(1, str);
                }
                String str2 = c19320pM2.LIZIZ;
                if (str2 == null) {
                    interfaceC37591dj.LLLLLLJ(2);
                } else {
                    interfaceC37591dj.LJJII(2, str2);
                }
            }
        };
    }
}
