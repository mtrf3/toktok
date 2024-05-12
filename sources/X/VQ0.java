package X;

import com.lynx.tasm.TemplateAssembler;
import com.lynx.tasm.ui.image.UIImage;

/* loaded from: classes15.dex */
public final class VQ0 extends C61828OOi {
    public final /* synthetic */ UIImage LIZ;

    @Override // X.C61828OOi
    public final boolean LIZ() {
        return this.LIZ.mPendingLoad;
    }

    public VQ0(UIImage uIImage) {
        this.LIZ = uIImage;
    }

    @Override // X.C61828OOi
    public final void LIZIZ(int i, int i2) {
        UIImage uIImage = this.LIZ;
        uIImage.mImageDstWidth = i;
        uIImage.mImageDstHeight = i2;
    }

    @Override // X.C61828OOi
    public final void LIZLLL(int i, int i2) {
        java.util.Map<String, VNA> map = this.LIZ.mEvents;
        if (map != null && map.containsKey("load")) {
            C49615Jdb c49615Jdb = new C49615Jdb(this.LIZ.getSign(), "load");
            c49615Jdb.LIZJ(Integer.valueOf(i2), "height");
            c49615Jdb.LIZJ(Integer.valueOf(i), "width");
            this.LIZ.mContext.LJLJJL.LIZIZ(c49615Jdb);
        }
    }

    @Override // X.C61828OOi
    public final void LIZJ(int i, int i2, String str) {
        C49615Jdb c49615Jdb = new C49615Jdb(this.LIZ.getSign(), "error");
        c49615Jdb.LIZJ(str, "errMsg");
        c49615Jdb.LIZJ(Integer.valueOf(i), "lynx_categorized_code");
        c49615Jdb.LIZJ(Integer.valueOf(i2), "error_code");
        this.LIZ.mContext.LJLJJL.LIZIZ(c49615Jdb);
        UIImage uIImage = this.LIZ;
        VNL vnl = uIImage.mContext.LJLJJL;
        C61322O4w c61322O4w = new C61322O4w(uIImage.getSign(), 0);
        TemplateAssembler templateAssembler = vnl.LIZ;
        if (templateAssembler != null) {
            templateAssembler.LJJIIJ(c61322O4w);
        }
        UIImage uIImage2 = this.LIZ;
        uIImage2.mContext.LJIIJ(uIImage2.mSources, "image", str);
    }
}
