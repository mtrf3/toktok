package X;

import Y.ACallableS36S1200000_7;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEMediaParserProviderV2;
import com.ss.android.vesdk.VEMediaParser;
import defpackage.i0;
import java.util.LinkedHashMap;
import v5.n;

/* renamed from: X.Gjh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC42349Gjh implements Runnable {
    public final /* synthetic */ C36581c6 LJLIL;
    public final /* synthetic */ n<Bitmap> LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ VEMediaParserProviderV2 LJLJJL;
    public final /* synthetic */ int LJLJJLL;
    public final /* synthetic */ String LJLJL;

    public RunnableC42349Gjh(C36581c6 c36581c6, n<Bitmap> nVar, String str, int i, VEMediaParserProviderV2 vEMediaParserProviderV2, int i2, String str2) {
        this.LJLIL = c36581c6;
        this.LJLILLLLZI = nVar;
        this.LJLJI = str;
        this.LJLJJI = i;
        this.LJLJJL = vEMediaParserProviderV2;
        this.LJLJJLL = i2;
        this.LJLJL = str2;
    }

    public final void LIZ() {
        if (this.LJLIL.LIZIZ()) {
            this.LJLILLLLZI.LIZ();
            return;
        }
        if (C44687HgJ.LJIIJJI(this.LJLJI)) {
            UrlModel urlModel = new UrlModel();
            String str = this.LJLJI;
            if (!C44694HgQ.LJIL(str)) {
                str = i0.LJFF("file://", str);
            }
            urlModel.setUri(str);
            urlModel.setUrlList(C47261Igj.LJJIJIL(str));
            int i = this.LJLJJI;
            C78764Uvg.LJIILIIL(urlModel, i, i, new C42350Gji(this.LJLIL, this.LJLILLLLZI, this.LJLJJL, this.LJLJL));
            return;
        }
        VEMediaParser vEMediaParser = (VEMediaParser) ((LinkedHashMap) this.LJLJJL.LJLILLLLZI).get(this.LJLJI);
        if (vEMediaParser == null) {
            VEMediaParserProviderV2 vEMediaParserProviderV2 = this.LJLJJL;
            String str2 = this.LJLJI;
            vEMediaParser = new VEMediaParser();
            vEMediaParser.init(str2);
            vEMediaParserProviderV2.LJLILLLLZI.put(str2, vEMediaParser);
        }
        C36581c6 c36581c6 = this.LJLIL;
        n<Bitmap> nVar = this.LJLILLLLZI;
        VEMediaParserProviderV2 vEMediaParserProviderV22 = this.LJLJJL;
        LIZIZ(c36581c6, nVar, vEMediaParserProviderV22, this.LJLJL, vEMediaParser.getVideoFrame(this.LJLJJLL, vEMediaParserProviderV22.LJLJLJ, this.LJLJJI, vEMediaParserProviderV22.LJLIL), true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void LIZIZ(C36581c6 c36581c6, n<Bitmap> nVar, VEMediaParserProviderV2 vEMediaParserProviderV2, String str, Bitmap bitmap, boolean z) {
        if (c36581c6.LIZIZ()) {
            nVar.LIZ();
            return;
        }
        if (bitmap != null) {
            if (!bitmap.isRecycled() && z) {
                C10K.LIZIZ(new ACallableS36S1200000_7(vEMediaParserProviderV2, str, bitmap, 2), C38995FSd.LIZLLL(), null);
            }
            nVar.LIZJ(bitmap);
            return;
        }
        nVar.LIZIZ(new Exception());
    }
}
