package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEMediaParserProviderV2;
import java.util.ArrayList;

/* renamed from: X.Gjd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42345Gjd<TTaskResult, TContinuationResult> implements C10I {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ VEMediaParserProviderV2 LIZIZ;
    public final /* synthetic */ int LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ int LJ;
    public final /* synthetic */ InterfaceC42346Gje LJFF;
    public final /* synthetic */ C72242sW LJI;

    public C42345Gjd(boolean z, VEMediaParserProviderV2 vEMediaParserProviderV2, int i, String str, int i2, InterfaceC42346Gje interfaceC42346Gje, C72242sW c72242sW) {
        this.LIZ = z;
        this.LIZIZ = vEMediaParserProviderV2;
        this.LIZJ = i;
        this.LIZLLL = str;
        this.LJ = i2;
        this.LJFF = interfaceC42346Gje;
        this.LJI = c72242sW;
    }

    @Override // X.C10I
    public final Object then(C10K c10k) {
        if (c10k.LJIILJJIL() && this.LIZ) {
            this.LIZIZ.LIZJ(this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, false);
        } else {
            Bitmap bitmap = (Bitmap) c10k.LJIIJJI();
            if (bitmap != null && (!bitmap.isRecycled())) {
                InterfaceC42346Gje interfaceC42346Gje = this.LJFF;
                C72242sW c72242sW = this.LJI;
                VEMediaParserProviderV2 vEMediaParserProviderV2 = this.LIZIZ;
                interfaceC42346Gje.LJ(bitmap);
                if (c72242sW.element != -1) {
                    ((ArrayList) vEMediaParserProviderV2.LJLJJLL).add(Long.valueOf(System.currentTimeMillis() - c72242sW.element));
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
