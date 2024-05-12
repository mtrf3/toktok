package X;

import android.media.MediaMetadataRetriever;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.ss.android.vesdk.VEMediaParser;
import java.util.concurrent.Callable;

/* loaded from: classes8.dex */
public final class HO1<V> implements Callable {
    public final /* synthetic */ C45507HtX LJLIL;
    public final /* synthetic */ MyMediaModel LJLILLLLZI;
    public final /* synthetic */ HO4 LJLJI;
    public final /* synthetic */ VEMediaParser LJLJJI;

    public HO1(C45507HtX c45507HtX, MyMediaModel myMediaModel, HO4 ho4, VEMediaParser vEMediaParser) {
        this.LJLIL = c45507HtX;
        this.LJLILLLLZI = myMediaModel;
        this.LJLJI = ho4;
        this.LJLJJI = vEMediaParser;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean z;
        float f;
        Integer LJJIL;
        Integer valueOf = Integer.valueOf(this.LJLIL.itemView.getWidth());
        MyMediaModel myMediaModel = this.LJLILLLLZI;
        int intValue = valueOf.intValue();
        int i = 0;
        if (intValue > 0 && myMediaModel.width > intValue) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            valueOf = null;
        }
        if (valueOf != null) {
            f = this.LJLIL.itemView.getWidth() / valueOf.intValue();
        } else {
            f = 1.0f;
        }
        MyMediaModel myMediaModel2 = this.LJLILLLLZI;
        int i2 = (int) (myMediaModel2.width * f);
        int i3 = (int) (myMediaModel2.height * f);
        if (HOC.LIZIZ()) {
            if (HOF.LIZ()) {
                HO4 ho4 = this.LJLJI;
                MyMediaModel myMediaModel3 = this.LJLILLLLZI;
                ho4.getClass();
                if (!myMediaModel3.isCorrectedResolution) {
                    MediaMetadataRetriever LJIILLIIL = C44694HgQ.LJIILLIIL(myMediaModel3.fileLocalUriPath);
                    try {
                        String extractMetadata = LJIILLIIL.extractMetadata(24);
                        if (extractMetadata != null && (LJJIL = C38350F3i.LJJIL(extractMetadata)) != null) {
                            i = LJJIL.intValue();
                        }
                        if (i == 90 || i == 270) {
                            int i4 = myMediaModel3.width;
                            myMediaModel3.width = myMediaModel3.height;
                            myMediaModel3.height = i4;
                        }
                        C3C5.m7constructorimpl(C76800UCe.LIZ);
                    } catch (Throwable th) {
                        C3C5.m7constructorimpl(C141335gf.LIZ(th));
                    }
                    myMediaModel3.isCorrectedResolution = true;
                    LJIILLIIL.release();
                }
            }
            MyMediaModel myMediaModel4 = this.LJLILLLLZI;
            i2 = myMediaModel4.width;
            i3 = myMediaModel4.height;
        }
        this.LJLJJI.init(this.LJLILLLLZI.fileLocalUriPath);
        return this.LJLJJI.getVideoFrame(this.LJLILLLLZI.startTime, i2, i3, true);
    }
}
