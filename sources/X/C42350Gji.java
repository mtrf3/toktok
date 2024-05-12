package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEMediaParserProviderV2;
import v5.n;

/* renamed from: X.Gji, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42350Gji<T> implements InterfaceC15040iS {
    public final /* synthetic */ C36581c6 LIZ;
    public final /* synthetic */ n<Bitmap> LIZIZ;
    public final /* synthetic */ VEMediaParserProviderV2 LIZJ;
    public final /* synthetic */ String LIZLLL;

    public C42350Gji(C36581c6 c36581c6, n<Bitmap> nVar, VEMediaParserProviderV2 vEMediaParserProviderV2, String str) {
        this.LIZ = c36581c6;
        this.LIZIZ = nVar;
        this.LIZJ = vEMediaParserProviderV2;
        this.LIZLLL = str;
    }

    @Override // X.InterfaceC15040iS
    public final void accept(Object obj) {
        RunnableC42349Gjh.LIZIZ(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, (Bitmap) obj, false);
    }
}
