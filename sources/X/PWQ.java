package X;

import java.io.IOException;
import java.util.List;

/* loaded from: classes12.dex */
public final class PWQ extends AbstractRunnableC64621PXt {
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ List LJLJJI;
    public final /* synthetic */ PWE LJLJJL;

    @Override // X.AbstractRunnableC64621PXt
    public final void LIZIZ() {
        this.LJLJJL.LJLL.getClass();
        try {
            this.LJLJJL.LL.LJI(this.LJLJI, PWT.CANCEL);
            synchronized (this.LJLJJL) {
                this.LJLJJL.LLF.remove(Integer.valueOf(this.LJLJI));
            }
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PWQ(PWE pwe, Object[] objArr, int i, List list) {
        super("OkHttp %s Push Request[%s]", objArr);
        this.LJLJJL = pwe;
        this.LJLJI = i;
        this.LJLJJI = list;
    }
}
