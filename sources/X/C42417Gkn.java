package X;

import java.io.File;
import java.util.List;

/* renamed from: X.Gkn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42417Gkn implements InterfaceC47084Ids {
    public final /* synthetic */ C34K LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ AbstractC42414Gkk LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ List<String> LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ String LJLJL;

    @Override // X.InterfaceC47084Ids
    public final /* synthetic */ void LJIIJ(long j, long j2) {
    }

    @Override // X.InterfaceC47084Ids
    public final void LJIILJJIL(int i) {
        H7B.LIZ("DuetVideoDownloader - copy video cache: error");
        C22690un.LIZ("duet");
        C42418Gko.LIZIZ(this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJI);
    }

    @Override // X.InterfaceC47084Ids
    public final void LJIILIIL(boolean z, String str) {
        if (z) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("DuetVideoDownloader - copy video cache: success, isDuplicateCall: ");
            LIZ.append(this.LJLIL.element);
            H7B.LIZ(X1D.LIZIZ(LIZ));
            if (!this.LJLIL.element) {
                File file = new File(this.LJLILLLLZI);
                AbstractC42414Gkk abstractC42414Gkk = this.LJLJI;
                if (abstractC42414Gkk != null) {
                    file.length();
                    file.length();
                    abstractC42414Gkk.LIZLLL(100);
                }
                AbstractC42414Gkk abstractC42414Gkk2 = this.LJLJI;
                if (abstractC42414Gkk2 != null) {
                    abstractC42414Gkk2.LJ(this.LJLJJI, this.LJLILLLLZI);
                }
            }
            this.LJLIL.element = true;
            return;
        }
        H7B.LIZ("DuetVideoDownloader - copy video cache: fail");
        C22690un.LIZ("duet");
        C42418Gko.LIZIZ(this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJI);
    }

    public C42417Gkn(C34K c34k, String str, C42416Gkm c42416Gkm, String str2, List list, String str3, String str4) {
        this.LJLIL = c34k;
        this.LJLILLLLZI = str;
        this.LJLJI = c42416Gkm;
        this.LJLJJI = str2;
        this.LJLJJL = list;
        this.LJLJJLL = str3;
        this.LJLJL = str4;
    }
}
