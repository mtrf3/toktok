package Y;

import X.C42352Gjk;
import X.C43870HJq;
import X.C44687HgJ;
import X.C44694HgQ;
import X.C47261Igj;
import X.C78764Uvg;
import X.InterfaceC43874HJu;
import X.X1D;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.shortvideo.cut.VEMediaParserFrameProviderImpl;
import com.ss.android.vesdk.VEMediaParser;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.AqS189S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class ARunnableS2S2201000_7 implements Runnable {
    public final int $t;
    public int i4;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        String LIZIZ;
        new AqS173S0100000_7(this, 237);
        AqS189S0100000_7 aqS189S0100000_7 = new AqS189S0100000_7(this, 32);
        if (C44687HgJ.LJIIJJI(this.s1)) {
            UrlModel urlModel = new UrlModel();
            if (C44694HgQ.LJIL(this.s1)) {
                LIZIZ = this.s1;
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("file://");
                LIZ.append(this.s1);
                LIZIZ = X1D.LIZIZ(LIZ);
            }
            urlModel.setUri(LIZIZ);
            urlModel.setUrlList(C47261Igj.LJJIJIL(LIZIZ));
            int i = ((VEMediaParserFrameProviderImpl) this.l2).LJLJJI;
            C78764Uvg.LJIILIIL(urlModel, i, i, new C42352Gjk(aqS189S0100000_7));
            return;
        }
        VEMediaParser vEMediaParser = (VEMediaParser) ((LinkedHashMap) ((VEMediaParserFrameProviderImpl) this.l2).LJLILLLLZI).get(this.s1);
        if (vEMediaParser == null) {
            String path = this.s1;
            o.LJIIIZ(path, "path");
            vEMediaParser = new VEMediaParser();
            vEMediaParser.init(path);
            ((VEMediaParserFrameProviderImpl) this.l2).LJLILLLLZI.put(path, vEMediaParser);
        }
        int i2 = this.i4;
        VEMediaParserFrameProviderImpl vEMediaParserFrameProviderImpl = (VEMediaParserFrameProviderImpl) this.l2;
        aqS189S0100000_7.LIZ$0(vEMediaParser.getVideoFrame(i2, -1, vEMediaParserFrameProviderImpl.LJLJJI, vEMediaParserFrameProviderImpl.LJLIL), true);
    }

    public static final void run$0(ARunnableS2S2201000_7 aRunnableS2S2201000_7) {
        boolean LIZ;
        try {
            aRunnableS2S2201000_7.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS2S2201000_7 aRunnableS2S2201000_7) {
        C43870HJq c43870HJq = (C43870HJq) aRunnableS2S2201000_7.l2;
        ((InterfaceC43874HJu) aRunnableS2S2201000_7.l3).LIZ(aRunnableS2S2201000_7.i4, aRunnableS2S2201000_7.s0, aRunnableS2S2201000_7.s1, c43870HJq.LIZJ);
    }

    public ARunnableS2S2201000_7(Object obj, String str, Object obj2, String str2, int i, int i2) {
        this.$t = i2;
        this.l2 = obj;
        this.s0 = str;
        this.l3 = obj2;
        this.s1 = str2;
        this.i4 = i;
    }
}
