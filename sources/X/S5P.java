package X;

import Y.ARunnableS48S0100000_12;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.commercialize.feed.assem.product.AdProductTileAssem;
import com.ss.android.ugc.aweme.commercialize.feed.assem.product.AdProductTileVM;
import com.ss.android.ugc.aweme.commercialize.model.AdNativeProduct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S5P extends AbstractC85293Wj {
    public final /* synthetic */ List<AdNativeProduct> LJLIL;
    public final /* synthetic */ AdNativeProduct LJLILLLLZI;
    public final /* synthetic */ AdProductTileAssem LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ S5N LJLJJL;

    @Override // X.InterfaceC78660Uu0
    public final void LIZIZ(Bitmap bitmap) {
        boolean z;
        Aweme aweme;
        int indexOf = this.LJLIL.indexOf(this.LJLILLLLZI);
        if (this.LJLIL.indexOf(this.LJLILLLLZI) == this.LJLIL.size() - 1) {
            z = true;
        } else {
            z = false;
        }
        AdProductTileAssem adProductTileAssem = this.LJLJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("success on ");
        LIZ.append(indexOf);
        X1D.LIZIZ(LIZ);
        adProductTileAssem.getClass();
        AdProductTileVM u4 = this.LJLJI.u4();
        String productId = this.LJLILLLLZI.getProductId();
        long currentTimeMillis = System.currentTimeMillis() - this.LJLJJI;
        u4.getClass();
        o.LJIIIZ(productId, "productId");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ(WM7.SCENE_SERVICE, "AdPlp");
        c188727au.LJIIIZ("pid", productId);
        c188727au.LJ(currentTimeMillis, "loadtime");
        c188727au.LJIIIZ("source", "network");
        FMX.LJIIL("product_tile_product_load_success", c188727au.LIZ);
        C1DH.LJJIJIIJI(new ARunnableS48S0100000_12(this.LJLJI, 87));
        AdProductTileAssem adProductTileAssem2 = this.LJLJI;
        adProductTileAssem2.LLI++;
        adProductTileAssem2.LLIFFJFJJ = (int) KL2.LIZJ(adProductTileAssem2.getContext(), (adProductTileAssem2.LLI * 56.0f) - 4);
        Aweme aweme2 = null;
        if (this.LJLJI.q4().getState().LJIIIIZZ() != 0) {
            InterfaceC57784Mm4 LJI = this.LJLJI.q4().getState().LJI(this.LJLJI.q4().getState().LJIIIIZZ() - 1);
            o.LJII(LJI, "null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.feed.assem.product.AdProductTileItem");
            if (((S5M) LJI).LJLJJI >= indexOf) {
                InterfaceC57784Mm4 LJI2 = this.LJLJI.q4().getState().LJI(0);
                o.LJII(LJI2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.feed.assem.product.AdProductTileItem");
                if (((S5M) LJI2).LJLJJI > indexOf) {
                    C72808Sho<InterfaceC57784Mm4> state = this.LJLJI.q4().getState();
                    AdNativeProduct adNativeProduct = this.LJLILLLLZI;
                    VideoItemParams gv0 = this.LJLJI.u4().gv0();
                    if (gv0 != null) {
                        aweme2 = gv0.getAweme();
                    }
                    state.LIZIZ(0, new S5M(adNativeProduct, aweme2, z, indexOf, this.LJLJJL));
                    return;
                }
                int LJIIIIZZ = this.LJLJI.q4().getState().LJIIIIZZ() - 1;
                int i = 0;
                while (i < LJIIIIZZ) {
                    InterfaceC57784Mm4 LJI3 = this.LJLJI.q4().getState().LJI(i);
                    o.LJII(LJI3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.feed.assem.product.AdProductTileItem");
                    int i2 = ((S5M) LJI3).LJLJJI;
                    i++;
                    InterfaceC57784Mm4 LJI4 = this.LJLJI.q4().getState().LJI(i);
                    o.LJII(LJI4, "null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.feed.assem.product.AdProductTileItem");
                    int i3 = ((S5M) LJI4).LJLJJI;
                    if (i2 + 1 <= indexOf && indexOf < i3) {
                        C72808Sho<InterfaceC57784Mm4> state2 = this.LJLJI.q4().getState();
                        AdNativeProduct adNativeProduct2 = this.LJLILLLLZI;
                        VideoItemParams gv02 = this.LJLJI.u4().gv0();
                        if (gv02 != null) {
                            aweme = gv02.getAweme();
                        } else {
                            aweme = null;
                        }
                        state2.LIZIZ(i, new S5M(adNativeProduct2, aweme, z, indexOf, this.LJLJJL));
                    }
                }
                return;
            }
        }
        C72808Sho<InterfaceC57784Mm4> state3 = this.LJLJI.q4().getState();
        AdNativeProduct adNativeProduct3 = this.LJLILLLLZI;
        VideoItemParams gv03 = this.LJLJI.u4().gv0();
        if (gv03 != null) {
            aweme2 = gv03.getAweme();
        }
        state3.LIZJ(new S5M(adNativeProduct3, aweme2, z, indexOf, this.LJLJJL));
    }

    @Override // X.InterfaceC78660Uu0
    public final void onFailed(Throwable th) {
        AdProductTileAssem adProductTileAssem = this.LJLJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fail on ");
        LIZ.append(this.LJLIL.indexOf(this.LJLILLLLZI));
        LIZ.append(", reason is ");
        LIZ.append(th);
        X1D.LIZIZ(LIZ);
        adProductTileAssem.getClass();
        AdProductTileVM u4 = this.LJLJI.u4();
        String productId = this.LJLILLLLZI.getProductId();
        u4.getClass();
        o.LJIIIZ(productId, "productId");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ(WM7.SCENE_SERVICE, "AdPlp");
        c188727au.LJIIIZ("pid", productId);
        FMX.LJIIL("product_tile_product_load_fail", c188727au.LIZ);
    }

    public S5P(List list, AdNativeProduct adNativeProduct, AdProductTileAssem adProductTileAssem, long j, S5S s5s) {
        this.LJLIL = list;
        this.LJLILLLLZI = adNativeProduct;
        this.LJLJI = adProductTileAssem;
        this.LJLJJI = j;
        this.LJLJJL = s5s;
    }
}
