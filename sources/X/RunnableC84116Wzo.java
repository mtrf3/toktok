package X;

/* renamed from: X.Wzo, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class RunnableC84116Wzo implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ int LJLJJLL;
    public final /* synthetic */ InterfaceC84052Wym LJLJL;
    public final /* synthetic */ C84092WzQ LJLJLJ;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            int concat = this.LJLJLJ.concat(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL);
            InterfaceC84052Wym interfaceC84052Wym = this.LJLJL;
            if (interfaceC84052Wym != null) {
                interfaceC84052Wym.LIZ(concat);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC84116Wzo(C84092WzQ c84092WzQ, String str, String str2, int i, String str3, String str4, int i2, InterfaceC84052Wym interfaceC84052Wym) {
        this.LJLJLJ = c84092WzQ;
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = i;
        this.LJLJJI = str3;
        this.LJLJJL = str4;
        this.LJLJJLL = i2;
        this.LJLJL = interfaceC84052Wym;
    }
}
