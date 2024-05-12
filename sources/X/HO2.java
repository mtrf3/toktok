package X;

import android.util.Size;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.ss.android.vesdk.VEMediaParser;

/* loaded from: classes8.dex */
public final class HO2 implements Runnable {
    public final /* synthetic */ C45507HtX LJLIL;
    public final /* synthetic */ MyMediaModel LJLILLLLZI;
    public final /* synthetic */ HO4 LJLJI;
    public final /* synthetic */ VEMediaParser LJLJJI;
    public final /* synthetic */ Size LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;
    public final /* synthetic */ HO7 LJLJL;

    public HO2(Size size, C45470Hsw c45470Hsw, C45507HtX c45507HtX, HO4 ho4, MyMediaModel myMediaModel, VEMediaParser vEMediaParser, boolean z) {
        this.LJLIL = c45507HtX;
        this.LJLILLLLZI = myMediaModel;
        this.LJLJI = ho4;
        this.LJLJJI = vEMediaParser;
        this.LJLJJL = size;
        this.LJLJJLL = z;
        this.LJLJL = c45470Hsw;
    }

    public final void LIZ() {
        C10K LIZIZ = C10K.LIZIZ(new HO1(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI), C10K.LJI, null);
        HO4 ho4 = this.LJLJI;
        Size size = this.LJLJJL;
        MyMediaModel myMediaModel = this.LJLILLLLZI;
        boolean z = this.LJLJJLL;
        LIZIZ.LJ(new HO3(size, this.LJLJL, this.LJLIL, ho4, myMediaModel, this.LJLJJI, z), C10K.LJIIIIZZ, null);
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
}
