package com.ss.android.ugc.aweme.utils;

import X.C57522No;
import X.C70123Rfb;
import X.C70677RoX;
import X.C70681Rob;
import X.C70691Rol;
import X.C70912RsK;
import X.C78946Uyc;
import X.C79234V7u;
import X.EnumC69988RdQ;
import X.InterfaceC36571c5;
import X.InterfaceC70680Roa;
import X.InterfaceC71003Rtn;
import X.TAT;
import X.X1D;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Video;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleProduct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.review.ProductReviewViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewMedia;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS32S0301000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class Au2S0S0501000_12 extends TAT {
    public final int $t;
    public int i5;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // X.TAT
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                return;
            case 1:
                LIZ$1(this, view);
                return;
            default:
                super.LIZ(view);
                return;
        }
    }

    public static final void LIZ$0(Au2S0S0501000_12 au2S0S0501000_12, View view) {
        String str;
        InterfaceC71003Rtn interfaceC71003Rtn;
        if (view != null && (str = ((BundleProduct) au2S0S0501000_12.l0).schema) != null) {
            ((C70123Rfb) au2S0S0501000_12.l1).LIZLLL(view, (BundleInfo) au2S0S0501000_12.l2, "product_card");
            C70123Rfb c70123Rfb = (C70123Rfb) au2S0S0501000_12.l1;
            BundleInfo bundleInfo = (BundleInfo) au2S0S0501000_12.l2;
            BundleProduct bundleProduct = (BundleProduct) au2S0S0501000_12.l0;
            int i = au2S0S0501000_12.i5;
            c70123Rfb.getClass();
            o.LJIIIZ(bundleInfo, "bundleInfo");
            o.LJIIIZ(bundleProduct, "bundleProduct");
            InterfaceC36571c5 LJIIIZ = C79234V7u.LJIIIZ(view);
            if ((LJIIIZ instanceof InterfaceC71003Rtn) && (interfaceC71003Rtn = (InterfaceC71003Rtn) LJIIIZ) != null) {
                C78946Uyc.LJJII(interfaceC71003Rtn, new C70912RsK(), new AqS32S0301000_12(c70123Rfb, bundleInfo, bundleProduct, i, 5));
            }
            PdpViewModel pdpViewModel = (PdpViewModel) au2S0S0501000_12.l3;
            C57522No c57522No = (C57522No) au2S0S0501000_12.l4;
            EnumC69988RdQ enumC69988RdQ = EnumC69988RdQ.BUNDLE;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("product_id", ((BundleProduct) au2S0S0501000_12.l0).productId);
            linkedHashMap.put("product_source", ((BundleProduct) au2S0S0501000_12.l0).productSource);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(((C70123Rfb) au2S0S0501000_12.l1).LIZJ);
            LIZ.append('_');
            LIZ.append(au2S0S0501000_12.i5 + 1);
            linkedHashMap.put("track_id", X1D.LIZIZ(LIZ));
            pdpViewModel.Iw0(c57522No, enumC69988RdQ, str, linkedHashMap, null);
        }
    }

    public static final void LIZ$1(Au2S0S0501000_12 au2S0S0501000_12, View view) {
        C70691Rol c70691Rol;
        boolean z;
        String str;
        if (view != null) {
            C70681Rob c70681Rob = (C70681Rob) au2S0S0501000_12.l0;
            ReviewMedia reviewMedia = (ReviewMedia) au2S0S0501000_12.l1;
            int i = au2S0S0501000_12.i5;
            ProductReviewViewModel productReviewViewModel = (ProductReviewViewModel) au2S0S0501000_12.l2;
            View view2 = (View) au2S0S0501000_12.l3;
            C70677RoX c70677RoX = (C70677RoX) au2S0S0501000_12.l4;
            InterfaceC70680Roa interfaceC70680Roa = c70681Rob.LJLIL;
            if (interfaceC70680Roa != null) {
                interfaceC70680Roa.LIZ(i, reviewMedia);
            }
            Integer num = reviewMedia.mediaType;
            boolean z2 = false;
            if (num == null || num.intValue() != 1) {
                Integer num2 = reviewMedia.mediaType;
                if (num2 == null || num2.intValue() != 2) {
                    return;
                }
                Video video = reviewMedia.video;
                C70691Rol c70691Rol2 = productReviewViewModel.LJLLILLLL;
                if (c70691Rol2 == null) {
                    return;
                }
                ReviewItemStruct reviewItemStruct = c70677RoX.LIZ;
                if (video != null) {
                    str = video.id;
                } else {
                    str = null;
                }
                String valueOf = String.valueOf(str);
                Boolean bool = c70677RoX.LIZ.isOwner;
                if (bool != null) {
                    z2 = bool.booleanValue();
                }
                c70691Rol2.LJJIL(view2, reviewItemStruct, valueOf, z2);
                return;
            }
            Image image = reviewMedia.image;
            if (image == null || image.getUri() == null || (c70691Rol = productReviewViewModel.LJLLILLLL) == null) {
                return;
            }
            ReviewItemStruct.MainReview mainReview = c70677RoX.LIZ.review;
            String valueOf2 = String.valueOf(reviewMedia.image.getUri());
            ReviewItemStruct reviewItemStruct2 = c70677RoX.LIZ;
            String str2 = reviewItemStruct2.skuId;
            int i2 = i + 1;
            Boolean bool2 = reviewItemStruct2.isOwner;
            if (bool2 != null) {
                z = bool2.booleanValue();
            } else {
                z = false;
            }
            c70691Rol.LJIL(view2, mainReview, valueOf2, str2, i2, z, c70677RoX.LIZJ);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Au2S0S0501000_12(C70681Rob c70681Rob, ReviewMedia reviewMedia, ProductReviewViewModel productReviewViewModel, SmartImageView smartImageView, C70677RoX c70677RoX, int i) {
        super(700L);
        this.$t = i;
        this.l0 = c70681Rob;
        this.l1 = reviewMedia;
        this.i5 = 0;
        this.l2 = productReviewViewModel;
        this.l3 = smartImageView;
        this.l4 = c70677RoX;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Au2S0S0501000_12(BundleProduct bundleProduct, C70123Rfb c70123Rfb, BundleInfo bundleInfo, int i, PdpViewModel pdpViewModel, C57522No c57522No, int i2) {
        super(700L);
        this.$t = i2;
        this.l0 = bundleProduct;
        this.l1 = c70123Rfb;
        this.l2 = bundleInfo;
        this.i5 = i;
        this.l3 = pdpViewModel;
        this.l4 = c57522No;
    }
}
