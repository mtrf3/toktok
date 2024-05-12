package X;

/* renamed from: X.Zww, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91582Zww extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public final /* synthetic */ C91396Ztw LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C91582Zww(C91396Ztw c91396Ztw, String str, int i) {
        super(0);
        this.LJLIL = c91396Ztw;
        this.LJLILLLLZI = str;
        this.LJLJI = i;
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        try {
            i = this.LJLIL.LIZ.LJI(this.LJLILLLLZI);
        } catch (Exception unused) {
            i = this.LJLJI;
        }
        return Integer.valueOf(i);
    }
}
