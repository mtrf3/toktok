package X;

import com.lynx.tasm.TemplateAssembler;
import com.lynx.tasm.ui.image.FlattenUIImage;

/* loaded from: classes15.dex */
public final class VQ1 extends C61828OOi {
    public final /* synthetic */ FlattenUIImage LIZ;

    public VQ1(FlattenUIImage flattenUIImage) {
        this.LIZ = flattenUIImage;
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
        FlattenUIImage flattenUIImage = this.LIZ;
        VNL vnl = flattenUIImage.mContext.LJLJJL;
        C61322O4w c61322O4w = new C61322O4w(flattenUIImage.getSign(), 0);
        TemplateAssembler templateAssembler = vnl.LIZ;
        if (templateAssembler != null) {
            templateAssembler.LJJIIJ(c61322O4w);
        }
        FlattenUIImage flattenUIImage2 = this.LIZ;
        flattenUIImage2.mContext.LJIIJ(flattenUIImage2.mSources, "image", str);
    }
}
