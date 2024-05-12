package X;

import Y.ARunnableS48S0100000_12;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.header.PdpHeadViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.sku.v2.ImageSelectData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreLabel;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreOfficialLabel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Rmv, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70577Rmv implements C0C3 {
    public boolean LJLIL;
    public final /* synthetic */ PdpHeadViewHolder LJLILLLLZI;

    public C70577Rmv(PdpHeadViewHolder pdpHeadViewHolder) {
        this.LJLILLLLZI = pdpHeadViewHolder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
        String str;
        String str2;
        SellerInfo sellerInfo;
        String str3;
        Float f;
        StoreOfficialLabel storeOfficialLabel;
        String str4;
        PdpHeadViewHolder pdpHeadViewHolder = this.LJLILLLLZI;
        if (!pdpHeadViewHolder.LJLJLLL && C52469KiX.LIZ && pdpHeadViewHolder.LJLJJL == ((C69695RWx) pdpHeadViewHolder.getItem()).LJLIL.size() - 1) {
            if (i == 0 || i == 2) {
                PdpHeadViewHolder pdpHeadViewHolder2 = this.LJLILLLLZI;
                pdpHeadViewHolder2.LJLJLLL = true;
                if (this.LJLIL) {
                    this.LJLIL = false;
                    if (pdpHeadViewHolder2.getViewModel().LJZ) {
                        str = "viewer";
                    } else {
                        str = "main";
                    }
                    boolean z = C52469KiX.LIZIZ;
                    String str5 = null;
                    if (z) {
                        str2 = "store";
                    } else if (C52469KiX.LIZJ) {
                        str2 = "description";
                    } else {
                        str2 = null;
                    }
                    C70414RkI c70414RkI = this.LJLILLLLZI.getViewModel().LLFII;
                    if (c70414RkI != null) {
                        boolean z2 = this.LJLILLLLZI.getViewModel().LJLJL;
                        Image image = (Image) ORZ.LJLLLLLL(this.LJLILLLLZI.LJLJJL, ((C69695RWx) this.LJLILLLLZI.getItem()).LJLIL);
                        if (image == null || (str4 = image.getUri()) == null) {
                            str4 = "";
                        }
                        c70414RkI.LJJJJJ(str, str4, str2, z2);
                    }
                    if (C52469KiX.LIZJ) {
                        this.LJLILLLLZI.getViewModel().tx0(EnumC27721AuL.SELLER_INFO.getValue(), true);
                    } else if (z) {
                        PdpHeadViewHolder pdpHeadViewHolder3 = this.LJLILLLLZI;
                        Context context = pdpHeadViewHolder3.itemView.getContext();
                        o.LJIIIIZZ(context, "itemView.context");
                        ProductPackStruct productPackStruct = pdpHeadViewHolder3.getViewModel().LJLJLLL;
                        if (productPackStruct != null && (sellerInfo = productPackStruct.sellerInfo) != null && (str3 = sellerInfo.shopLink) != null && !ujb.o.LJJJJJL(str3)) {
                            PdpViewModel viewModel = pdpHeadViewHolder3.getViewModel();
                            String str6 = sellerInfo.sellerId;
                            String str7 = sellerInfo.rating;
                            if (str7 != null) {
                                f = C38350F3i.LJJIJLIJ(str7);
                            } else {
                                f = null;
                            }
                            StoreLabel storeLabel = sellerInfo.storeLabel;
                            if (storeLabel != null && (storeOfficialLabel = storeLabel.officialLabel) != null) {
                                str5 = storeOfficialLabel.labelTypeStr;
                            }
                            PdpViewModel.nw0(viewModel, context, str3, str6, f, "pdp_photo_glide", str5, pdpHeadViewHolder3.getViewModel().aw0(), null, null, null, null, null, null, null, 16256);
                        }
                        View itemView = this.LJLILLLLZI.itemView;
                        o.LJIIIIZZ(itemView, "itemView");
                        C78946Uyc.LJJIIJZLJL(itemView, new C70941Rsn(), new AqS162S0100000_12(this, 1244), C70578Rmw.LJLIL);
                    }
                }
                new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS48S0100000_12(this.LJLILLLLZI, LiveTryModeCountDownThresholdSetting.DEFAULT));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0C3
    public final void onPageSelected(int i) {
        boolean z;
        String str;
        C70414RkI c70414RkI;
        EnumC70107RfL enumC70107RfL;
        int size;
        if (this.LJLILLLLZI.M() > 0) {
            if (i != this.LJLILLLLZI.Q()) {
                this.LJLILLLLZI._$_findCachedViewById(R.id.n4s).setVisibility(8);
                this.LJLILLLLZI.T().pause();
            } else {
                this.LJLILLLLZI.L().LJJIIZI();
                this.LJLILLLLZI._$_findCachedViewById(R.id.n4s).setVisibility(0);
            }
        }
        if (i == 0) {
            this.LJLILLLLZI._$_findCachedViewById(R.id.ck6).setVisibility(0);
        } else {
            this.LJLILLLLZI._$_findCachedViewById(R.id.ck6).setVisibility(8);
        }
        Image image = (Image) ORZ.LJLLLLLL(i, ((C69695RWx) this.LJLILLLLZI.getItem()).LJLIL);
        if (image == null) {
            return;
        }
        this.LJLILLLLZI.getViewModel().LLIILZL = image;
        PdpHeadViewHolder pdpHeadViewHolder = this.LJLILLLLZI;
        pdpHeadViewHolder.LJLJJL = i;
        if (i < pdpHeadViewHolder.LJLJLJ) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            TextView indicatorText = pdpHeadViewHolder.LJLJI;
            o.LJIIIIZZ(indicatorText, "indicatorText");
            indicatorText.setVisibility(0);
            this.LJLILLLLZI.LJLJI.setText(C27162AlK.LIZ(String.valueOf(i + 1), String.valueOf(this.LJLILLLLZI.LJLJLJ)));
        } else {
            TextView indicatorText2 = pdpHeadViewHolder.LJLJI;
            o.LJIIIIZZ(indicatorText2, "indicatorText");
            indicatorText2.setVisibility(8);
        }
        PdpHeadViewHolder pdpHeadViewHolder2 = this.LJLILLLLZI;
        if (pdpHeadViewHolder2.LJLJL) {
            if (z) {
                enumC70107RfL = EnumC70107RfL.PRODUCT;
                size = -1;
            } else {
                enumC70107RfL = EnumC70107RfL.SKU;
                size = ((((C69695RWx) pdpHeadViewHolder2.getItem()).LJLILLLLZI + i) - ((C69695RWx) this.LJLILLLLZI.getItem()).LJLIL.size()) + (((C69695RWx) this.LJLILLLLZI.getItem()).LJLJI ? 1 : 0);
            }
            this.LJLILLLLZI.getViewModel().LLIILII.Hv0(new ImageSelectData(image, EnumC70012Rdo.HEAD_PAGER, enumC70107RfL, size));
        }
        PdpHeadViewHolder pdpHeadViewHolder3 = this.LJLILLLLZI;
        pdpHeadViewHolder3.LJLJL = true;
        C70414RkI c70414RkI2 = pdpHeadViewHolder3.getViewModel().LLFII;
        if (c70414RkI2 != null) {
            c70414RkI2.LJJLIIIJLLLLLLLZ(image.getUri());
        }
        if (this.LJLILLLLZI.getViewModel().LJZ) {
            str = "viewer";
        } else {
            str = "main";
        }
        this.LJLILLLLZI.getViewModel().Sv0("picture");
        PdpHeadViewHolder pdpHeadViewHolder4 = this.LJLILLLLZI;
        if (!pdpHeadViewHolder4.LJLJLLL && (c70414RkI = pdpHeadViewHolder4.getViewModel().LLFII) != null) {
            boolean z2 = this.LJLILLLLZI.getViewModel().LJLJL;
            String uri = image.getUri();
            if (uri == null) {
                uri = "";
            }
            c70414RkI.LJJJJJ(str, uri, null, z2);
        }
        View it = this.LJLILLLLZI._$_findCachedViewById(R.id.kxw);
        PdpHeadViewHolder pdpHeadViewHolder5 = this.LJLILLLLZI;
        o.LJIIIIZZ(it, "it");
        if (it.getVisibility() == 0 || pdpHeadViewHolder5.P()) {
            ((C90503gs) this.LJLILLLLZI._$_findCachedViewById(R.id.kxw)).setTabPosition(i);
        }
        this.LJLILLLLZI.U(i, image);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
        if (C52469KiX.LIZ && i == ((C69695RWx) this.LJLILLLLZI.getItem()).LJLIL.size() - 1) {
            if (f >= 0.2f) {
                this.LJLIL = true;
            } else {
                if (f >= 0.2f || f <= 0.0f) {
                    return;
                }
                this.LJLIL = false;
                this.LJLILLLLZI.LJLJLLL = false;
            }
        }
    }
}
