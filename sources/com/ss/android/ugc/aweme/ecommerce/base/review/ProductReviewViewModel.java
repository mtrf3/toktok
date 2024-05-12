package com.ss.android.ugc.aweme.ecommerce.base.review;

import X.AbstractC70686Rog;
import X.AbstractC70730RpO;
import X.AbstractC70995Rtf;
import X.AbstractC73672Svk;
import X.C06530Nl;
import X.C221108m2;
import X.C245319jz;
import X.C252669vq;
import X.C36746EbW;
import X.C47261Igj;
import X.C62822Ol8;
import X.C70574Rms;
import X.C70657RoD;
import X.C70689Roj;
import X.C70691Rol;
import X.C70698Ros;
import X.C70699Rot;
import X.C70707Rp1;
import X.C70735RpT;
import X.C70801RqX;
import X.C70839Rr9;
import X.C70917RsP;
import X.C70948Rsu;
import X.C70949Rsv;
import X.C70954Rt0;
import X.C76800UCe;
import X.C78946Uyc;
import X.DialogInterfaceOnCancelListenerC70697Ror;
import X.EnumC70569Rmn;
import X.InterfaceC60061Nhh;
import X.InterfaceC61312at;
import X.InterfaceC88472Yns;
import X.InterfaceC92693kP;
import X.OSZ;
import X.TBT;
import X.X1D;
import Y.ACListenerS21S0100000_1;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.ext.list.ListViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.review.ProductReviewState;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewMedia;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseJediFragment;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS116S0300000_12;
import kotlin.jvm.internal.AqS12S1201000_12;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS16S0010000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.AqS35S1000000_12;
import kotlin.jvm.internal.AqS36S0001000_12;
import kotlin.jvm.internal.AqS3S1202000_12;
import kotlin.jvm.internal.AqS99S0101000_12;
import kotlin.jvm.internal.IDqS436S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ProductReviewViewModel extends ListViewModel<AbstractC70686Rog, C70839Rr9, ProductReviewState> implements InterfaceC60061Nhh {
    public InterfaceC92693kP LJLJLLL;
    public InterfaceC92693kP LJLL;
    public C70699Rot LJLLI;
    public C70691Rol LJLLILLLL;
    public final C70698Ros LJLLJ = new C70698Ros();
    public String LJLLL = "";
    public final C62822Ol8 LJLLLL = C221108m2.LIZIZ(C70707Rp1.LJLIL);
    public boolean LJLLLLLL = true;
    public final AqS178S0100000_12 LJLZ = new AqS178S0100000_12(this, 157);
    public final AqS178S0100000_12 LJZ = new AqS178S0100000_12(this, 156);

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final void onStart() {
        super.onStart();
        EventCenter.LJ().LIZJ("ec_review_digg", this);
        JediViewModel.xv0(this, new TBT() { // from class: X.Rp4
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((ProductReviewState) obj).getSelectFilterId();
            }
        }, new TBT() { // from class: X.Rp3
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((ProductReviewState) obj).getSortType();
            }
        }, null, new AqS194S0100000_12(this, 76), 4, null);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final InterfaceC61312at kv0() {
        return new ProductReviewState(0, null, "", null, new ListState(new C70839Rr9(3), null, null, null, null, 30, null), "", null, null, null, 0, null, null, null, null, null, null, null, null, null, 524224, null);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        C70699Rot c70699Rot = this.LJLLI;
        if (c70699Rot != null) {
            c70699Rot.LJLJL = null;
        }
        EventCenter.LJ().LIZIZ("ec_review_digg", this);
        super.onCleared();
    }

    @Override // com.bytedance.jedi.arch.ext.list.ListViewModel
    public final InterfaceC88472Yns<ProductReviewState, AbstractC73672Svk<OSZ<List<AbstractC70686Rog>, C70839Rr9>>> Iv0() {
        return this.LJZ;
    }

    @Override // com.bytedance.jedi.arch.ext.list.ListViewModel
    public final InterfaceC88472Yns<ProductReviewState, AbstractC73672Svk<OSZ<List<AbstractC70686Rog>, C70839Rr9>>> Jv0() {
        return this.LJLZ;
    }

    public static void Nv0(List list) {
        List<String> thumbUrls;
        List<String> urls;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ReviewMedia reviewMedia = (ReviewMedia) it.next();
                Integer num = reviewMedia.mediaType;
                if (num != null && num.intValue() == 1) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    Image image = reviewMedia.image;
                    if (image != null && (urls = image.getUrls()) != null) {
                        Iterator<String> it2 = urls.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(C70657RoD.LJIIJJI(it2.next(), EnumC70569Rmn.REVIEW_PHOTO));
                        }
                    }
                    Image image2 = reviewMedia.image;
                    if (image2 != null && (thumbUrls = image2.getThumbUrls()) != null) {
                        Iterator<String> it3 = thumbUrls.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(C70657RoD.LJIIJJI(it3.next(), EnumC70569Rmn.REVIEW));
                        }
                    }
                    Image image3 = reviewMedia.image;
                    if (image3 != null) {
                        image3.setUrls(arrayList);
                    }
                    Image image4 = reviewMedia.image;
                    if (image4 != null) {
                        image4.setThumbUrls(arrayList2);
                    }
                }
            }
        }
    }

    public final void Wv0(AbstractC70730RpO status) {
        o.LJIIIZ(status, "status");
        setState(new AqS178S0100000_12(status, 158));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("set new PageStatus: ");
        LIZ.append(status);
        C36746EbW.LIZ(3, X1D.LIZIZ(LIZ));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onDetectBlank(Map<String, String> params) {
        o.LJIIIZ(params, "params");
        ProductReviewState productReviewState = (ProductReviewState) lv0();
        if (productReviewState.getStatus() instanceof C70735RpT) {
            return false;
        }
        params.put("content_list_size", String.valueOf(productReviewState.getSubstate().getList().size()));
        if (productReviewState.getStatus() instanceof C70801RqX) {
            params.put("blank_type", "error_status");
            return true;
        }
        List<Object> list = productReviewState.getSubstate().getList();
        if (list != null && !list.isEmpty()) {
            return false;
        }
        params.put("blank_type", "empty_data_list");
        return true;
    }

    public final void Pv0(int i, String str) {
        withState(new AqS116S0300000_12(this, new AqS35S1000000_12(str, 44), new AqS36S0001000_12(i, 15), 25));
    }

    public final C70699Rot Qv0(Integer num, String str) {
        C70699Rot LIZ = C70689Roj.LIZ(str);
        LIZ.LJLJL = new AqS143S0200000_12(this, num, 137);
        LIZ.LJLJLJ = new IDqS436S0100000_12(this, 31);
        LIZ.LJLL = new AqS194S0100000_12(this, 235);
        this.LJLLL = str;
        if (this.LJLLI == null) {
            this.LJLLI = LIZ;
        }
        return LIZ;
    }

    public final void Vv0(ECBaseJediFragment node, int i) {
        o.LJIIIZ(node, "node");
        C70691Rol c70691Rol = this.LJLLILLLL;
        if (c70691Rol != null) {
            C78946Uyc.LJJII(node, new C70917RsP(), new AqS99S0101000_12(c70691Rol, i, 21));
        }
        setState(new AqS36S0001000_12(i, 14));
    }

    @Override // X.InterfaceC60061Nhh
    public final void onEvent(String eventName, String str) {
        o.LJIIIZ(eventName, "eventName");
        if (o.LJ(eventName, "ec_review_digg")) {
            refresh();
        }
    }

    public final void Rv0(int i, View view, String str) {
        o.LJIIIZ(view, "view");
        withState(new AqS12S1201000_12(this, view, str, i, 1));
    }

    public final void Ov0(View view, int i, ReviewItemStruct reviewData, String str, int i2) {
        String str2;
        boolean z;
        AbstractC70995Rtf c70948Rsu;
        C70699Rot c70699Rot;
        o.LJIIIZ(reviewData, "reviewData");
        ReviewItemStruct.MainReview mainReview = reviewData.review;
        if (mainReview != null) {
            str2 = mainReview.reviewId;
        } else {
            str2 = null;
        }
        Boolean bool = reviewData.isDigged;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        boolean z2 = !z;
        if (z2) {
            c70948Rsu = new C70949Rsv();
        } else {
            c70948Rsu = new C70948Rsu();
        }
        C78946Uyc.LJJIIJ(view, c70948Rsu, new AqS3S1202000_12(reviewData, i, i2, str, this, 1));
        if (str2 != null && (c70699Rot = this.LJLLI) != null) {
            c70699Rot.LLLLZ(i2, str2, z2);
        }
        withState(new AqS116S0300000_12(this, new AqS35S1000000_12(str2, 5), new AqS16S0010000_12(z2, 3), 25));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        if (r6 == null) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Tv0(android.view.View r12, int r13, com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct r14, java.lang.String r15, java.lang.String r16) {
        /*
            r11 = this;
            r7 = r13
            java.lang.String r0 = "view"
            kotlin.jvm.internal.o.LJIIIZ(r12, r0)
            X.Rol r2 = r11.LJLLILLLL
            r4 = r14
            if (r2 == 0) goto L59
            r0 = -1
            if (r4 == 0) goto L10
            if (r7 != r0) goto L6e
        L10:
            int r1 = X.C70691Rol.LJIJJLI
            r0 = 2
            if (r1 != r0) goto L6b
            int r0 = X.C70691Rol.LJIIZILJ
        L17:
            X.Rok r3 = new X.Rok
            if (r4 != 0) goto L66
            r7 = -1
        L1c:
            java.lang.String r6 = "all"
        L1e:
            if (r4 == 0) goto L24
            java.lang.String r10 = r4.filterId
            if (r10 != 0) goto L26
        L24:
            java.lang.String r10 = "-1"
        L26:
            if (r4 == 0) goto L64
            java.lang.Integer r8 = r4.type
        L2a:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            r5 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            X.C70691Rol.LJIJ = r3
            java.util.Set<java.lang.String> r0 = r2.LJ
            r0.clear()
            java.util.Set<java.lang.String> r0 = r2.LJFF
            r0.clear()
            java.util.Set<java.lang.String> r0 = r2.LJII
            r0.clear()
            java.util.Set<java.lang.String> r0 = r2.LJIIIIZZ
            r0.clear()
            X.Rsk r0 = new X.Rsk
            r0.<init>()
            kotlin.jvm.internal.AqS6S2300000_12 r1 = new kotlin.jvm.internal.AqS6S2300000_12
            r7 = 2
            r5 = r15
            r6 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7)
            X.C78946Uyc.LJJIIJ(r12, r0, r1)
        L59:
            kotlin.jvm.internal.AqS178S0100000_12 r1 = new kotlin.jvm.internal.AqS178S0100000_12
            r0 = 613(0x265, float:8.59E-43)
            r1.<init>(r4, r0)
            r11.setState(r1)
            return
        L64:
            r8 = 0
            goto L2a
        L66:
            java.lang.String r6 = r4.nameEng
            if (r6 != 0) goto L1e
            goto L1c
        L6b:
            int r0 = X.C70691Rol.LJIILLIIL
            goto L17
        L6e:
            java.lang.Integer r0 = r4.count
            if (r0 == 0) goto L77
            int r0 = r0.intValue()
            goto L17
        L77:
            r0 = 0
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.review.ProductReviewViewModel.Tv0(android.view.View, int, com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct, java.lang.String, java.lang.String):void");
    }

    public final void Sv0(View view, int i, FragmentManager fm, ReviewItemStruct reviewData, String str, String productId) {
        String str2;
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(reviewData, "reviewData");
        o.LJIIIZ(productId, "productId");
        ReviewItemStruct.MainReview mainReview = reviewData.review;
        if (mainReview != null) {
            str2 = mainReview.reviewId;
        } else {
            str2 = null;
        }
        Context context = view.getContext();
        if (this.LJLLILLLL != null) {
            C78946Uyc.LJJIIJ(view, new C70954Rt0(), new AqS178S0100000_12(reviewData, 624));
        }
        C245319jz c245319jz = new C245319jz();
        c245319jz.LIZLLL(R.string.cg_);
        c245319jz.LIZ.LJLIL = new DialogInterfaceOnCancelListenerC70697Ror(this, view, i, reviewData, str);
        C252669vq LIZIZ = C06530Nl.LIZIZ(R.string.f5a);
        LIZIZ.LJ = new ACListenerS21S0100000_1(new C70574Rms(fm, context, reviewData, str2, this, view, i, str), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
        c245319jz.LJFF(C47261Igj.LJJIJ(LIZIZ));
        c245319jz.LIZJ().show(fm, "review_more");
    }

    public static /* synthetic */ void Uv0(ProductReviewViewModel productReviewViewModel, View view, int i, ReviewFilterStruct reviewFilterStruct, String str, String str2, int i2) {
        if ((i2 & 8) != 0) {
            str = "";
        }
        if ((i2 & 16) != 0) {
            str2 = null;
        }
        productReviewViewModel.Tv0(view, i, reviewFilterStruct, str, str2);
    }
}
