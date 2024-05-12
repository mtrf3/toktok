package X;

import java.io.IOException;

/* loaded from: classes12.dex */
public final class PWN extends AbstractRunnableC64621PXt {
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ C64533PUj LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ PWE LJLJJLL;

    @Override // X.AbstractRunnableC64621PXt
    public final void LIZIZ() {
        try {
            C64568PVs c64568PVs = this.LJLJJLL.LJLL;
            C64533PUj c64533PUj = this.LJLJJI;
            int i = this.LJLJJL;
            c64568PVs.getClass();
            c64533PUj.skip(i);
            this.LJLJJLL.LL.LJI(this.LJLJI, PWT.CANCEL);
            synchronized (this.LJLJJLL) {
                this.LJLJJLL.LLF.remove(Integer.valueOf(this.LJLJI));
            }
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PWN(PWE pwe, Object[] objArr, int i, C64533PUj c64533PUj, int i2, boolean z) {
        super("OkHttp %s Push Data[%s]", objArr);
        this.LJLJJLL = pwe;
        this.LJLJI = i;
        this.LJLJJI = c64533PUj;
        this.LJLJJL = i2;
    }
}
