package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.FileInputStream;

/* renamed from: X.WYp, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82479WYp extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C82481WYr LJLIL;
    public final /* synthetic */ Effect LJLILLLLZI;
    public final /* synthetic */ C168316j5 LJLJI;
    public final /* synthetic */ C82493WZd LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82479WYp(C82481WYr c82481WYr, Effect effect, C168316j5 c168316j5, C82493WZd c82493WZd) {
        super(0);
        this.LJLIL = c82481WYr;
        this.LJLILLLLZI = effect;
        this.LJLJI = c168316j5;
        this.LJLJJI = c82493WZd;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        try {
            this.LJLIL.LIZ = true;
            OUP.LJJJLZIJ(this.LJLILLLLZI);
            if (this.LJLJI.L()) {
                this.LJLJJI.LIZJ();
                this.LJLJJI.LJFF(this.LJLILLLLZI);
                this.LJLJJI.LJ();
                byte[] bArr = new byte[8820];
                String str = this.LJLJI.LJLILLLLZI;
                if (C44687HgJ.LJIIIIZZ(str) <= 0) {
                    Thread.interrupted();
                }
                FileInputStream fileInputStream = new FileInputStream(str);
                while (this.LJLIL.LIZ) {
                    int read = fileInputStream.read(bArr);
                    this.LJLJJI.LIZLLL(bArr, false);
                    this.LJLIL.LIZIZ.invoke(bArr);
                    Thread.sleep(20L);
                    if (read == -1) {
                        break;
                    }
                }
                this.LJLJJI.LJII();
                this.LJLIL.LIZJ.getClass();
            }
        } catch (Throwable th) {
            this.LJLIL.LIZLLL.invoke(th);
        }
        return C76800UCe.LIZ;
    }
}
