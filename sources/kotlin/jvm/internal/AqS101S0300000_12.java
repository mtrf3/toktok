package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C27739Aud;
import X.C29S;
import X.C45243HpH;
import X.C47261Igj;
import X.C69698RXa;
import X.C70677RoX;
import X.C70731RpP;
import X.C70732RpQ;
import X.C70899Rs7;
import X.C72977SkX;
import X.C74355TGd;
import X.C74356TGe;
import X.C74385THh;
import X.C76732zl;
import X.C76800UCe;
import X.C78685UuP;
import X.C78946Uyc;
import X.C78983UzD;
import X.C82622Wbi;
import X.InterfaceC65784Pro;
import X.InterfaceC74330TFe;
import X.InterfaceC74334TFi;
import X.InterfaceC84497XEf;
import X.InterfaceC88471Ynr;
import X.OGH;
import X.TF5;
import X.THD;
import X.TNT;
import X.TNV;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.jedi_vm.viewModel.LifecycleAwareObserver;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpPreviewInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPrice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.ui.PdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.review.ProductReviewViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.review.gallery.GalleryViewerViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.viewholder.ReviewCellViewHolder;
import com.ss.android.ugc.aweme.sticker.panel.info.EffectInfoStickerHandler;
import com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewContainer;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import ujb.s;

/* loaded from: classes13.dex */
public class AqS101S0300000_12 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case 9:
                return invoke$9(this);
            case 10:
                return invoke$10(this);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this);
            case 12:
                return invoke$12(this);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS101S0300000_12 aqS101S0300000_12) {
        ((LifecycleAwareObserver) aqS101S0300000_12.l0).onLifecycleEvent((LifecycleOwner) aqS101S0300000_12.l1);
        if (((Lifecycle.Event) aqS101S0300000_12.l2) == Lifecycle.Event.ON_DESTROY) {
            ((LifecycleAwareObserver) aqS101S0300000_12.l0).onDestroy();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS101S0300000_12 aqS101S0300000_12) {
        ProductReviewViewModel Q = ((ReviewCellViewHolder) aqS101S0300000_12.l0).Q();
        View itemView = ((ReviewCellViewHolder) aqS101S0300000_12.l0).itemView;
        o.LJIIIIZZ(itemView, "itemView");
        ReviewCellViewHolder reviewCellViewHolder = (ReviewCellViewHolder) aqS101S0300000_12.l0;
        Q.Ov0(itemView, reviewCellViewHolder.latestItemPositionInternal + 1, (ReviewItemStruct) aqS101S0300000_12.l1, ((C70677RoX) aqS101S0300000_12.l2).LIZJ, reviewCellViewHolder.LJLJLLL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS101S0300000_12 aqS101S0300000_12) {
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) aqS101S0300000_12.l1;
        View view = (View) ((THD) aqS101S0300000_12.l0).LIZ.getValue();
        TF5 tf5 = (TF5) aqS101S0300000_12.l2;
        THD thd = (THD) aqS101S0300000_12.l0;
        return new SearchStickerViewContainer(activityC45651qj, view, tf5, thd.LIZLLL, 1, 1, thd.LJ, thd.LJFF, thd.LJI);
    }

    public static final Object invoke$11(AqS101S0300000_12 aqS101S0300000_12) {
        C29S c29s = (C29S) ((C82622Wbi) aqS101S0300000_12.l0).LJ(C29S.class, null);
        return C74355TGd.LIZ(c29s, (C74385THh) aqS101S0300000_12.l1, (TNV) aqS101S0300000_12.l2, (InterfaceC84497XEf) ((C82622Wbi) aqS101S0300000_12.l0).LJ(InterfaceC84497XEf.class, null), C74356TGe.LIZ(c29s));
    }

    public static final Object invoke$12(AqS101S0300000_12 aqS101S0300000_12) {
        ((TNT) aqS101S0300000_12.l0).LJI.onFail((Effect) aqS101S0300000_12.l1, (ExceptionResult) aqS101S0300000_12.l2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$13(AqS101S0300000_12 aqS101S0300000_12) {
        String str;
        String str2;
        Boolean bool;
        ProductPrice productPrice;
        PdpViewModel Ll = ((PdpFragment) aqS101S0300000_12.l0).Ll();
        PdpFragment node = (PdpFragment) aqS101S0300000_12.l0;
        ProductBase productBase = ((ProductPackStruct) aqS101S0300000_12.l1).baseInfo;
        String str3 = null;
        if (productBase != null && (productPrice = productBase.priceInfo) != null) {
            str = productPrice.realPrice;
        } else {
            str = null;
        }
        HashMap hashMap = (HashMap) aqS101S0300000_12.l2;
        Ll.getClass();
        o.LJIIIZ(node, "node");
        PdpPreviewInfo pdpPreviewInfo = Ll.LLIIL;
        if (pdpPreviewInfo != null) {
            str2 = pdpPreviewInfo.price;
        } else {
            str2 = null;
        }
        C76732zl c76732zl = new C76732zl();
        c76732zl.element = -1;
        if (C78685UuP.LJJJZ(str2) && C78685UuP.LJJJZ(str)) {
            if (str2 != null && str != null) {
                bool = Boolean.valueOf(s.LJJJLZIJ(str, str2, false));
            } else {
                bool = null;
            }
            if (o.LJ(bool, Boolean.TRUE)) {
                c76732zl.element = 0;
            } else {
                c76732zl.element = 1;
                HashMap LIZ = C45243HpH.LIZ("prepage_price", str2, "pdp_price", str);
                if (hashMap != null) {
                    str3 = C27739Aud.LJI(hashMap);
                }
                LIZ.put("trackParams", str3);
                LIZ.put("is_diff", String.valueOf(c76732zl.element));
                C78983UzD.LJIILLIIL("tiktokec_price_difference", LIZ);
            }
        }
        C78946Uyc.LJJII(node, new C70899Rs7(), new OGH(str2, str, hashMap, c76732zl));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS101S0300000_12 aqS101S0300000_12) {
        ProductReviewViewModel Q = ((ReviewCellViewHolder) aqS101S0300000_12.l0).Q();
        View itemView = ((ReviewCellViewHolder) aqS101S0300000_12.l0).itemView;
        o.LJIIIIZZ(itemView, "itemView");
        ReviewCellViewHolder reviewCellViewHolder = (ReviewCellViewHolder) aqS101S0300000_12.l0;
        Q.Ov0(itemView, reviewCellViewHolder.latestItemPositionInternal + 1, (ReviewItemStruct) aqS101S0300000_12.l1, ((C70677RoX) aqS101S0300000_12.l2).LIZJ, reviewCellViewHolder.LJLJLLL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS101S0300000_12 aqS101S0300000_12) {
        String str;
        InterfaceC74330TFe LJ = ((EffectInfoStickerHandler) aqS101S0300000_12.l0).LJ();
        if (LJ != null) {
            Effect effect = (Effect) aqS101S0300000_12.l1;
            InterfaceC74334TFi interfaceC74334TFi = (InterfaceC74334TFi) aqS101S0300000_12.l2;
            String str2 = null;
            if (interfaceC74334TFi != null) {
                str = interfaceC74334TFi.getNickname();
            } else {
                str = null;
            }
            InterfaceC74334TFi interfaceC74334TFi2 = (InterfaceC74334TFi) aqS101S0300000_12.l2;
            if (interfaceC74334TFi2 != null) {
                str2 = interfaceC74334TFi2.getUid();
            }
            LJ.QM(effect, str, str2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS101S0300000_12 aqS101S0300000_12) {
        C29S c29s = (C29S) ((C82622Wbi) aqS101S0300000_12.l0).LJ(C29S.class, null);
        C74385THh c74385THh = (C74385THh) aqS101S0300000_12.l1;
        TNV tnv = (TNV) aqS101S0300000_12.l2;
        InterfaceC84497XEf interfaceC84497XEf = (InterfaceC84497XEf) ((C82622Wbi) aqS101S0300000_12.l0).LJ(InterfaceC84497XEf.class, null);
        String string = ((Context) ((C82622Wbi) aqS101S0300000_12.l0).LJ(C29S.class, null)).getString(R.string.jf);
        o.LJIIIIZZ(string, "context.getString(R.stri…n_preview_pannel_tabname)");
        ArrayList arrayList = new ArrayList();
        for (String str : C47261Igj.LJJIJ(string)) {
            EffectCategoryModel effectCategoryModel = new EffectCategoryModel(null, 1, null);
            effectCategoryModel.setName(str);
            arrayList.add(effectCategoryModel);
        }
        return C74355TGd.LIZ(c29s, c74385THh, tnv, interfaceC84497XEf, arrayList);
    }

    public static final Object invoke$5(AqS101S0300000_12 aqS101S0300000_12) {
        boolean z;
        int i;
        GalleryViewerViewModel galleryViewerViewModel = ((C70732RpQ) aqS101S0300000_12.l0).LJLILLLLZI;
        if (galleryViewerViewModel != null) {
            View view = (View) aqS101S0300000_12.l1;
            String valueOf = String.valueOf(((C69698RXa) aqS101S0300000_12.l2).LIZ);
            Boolean bool = ((C69698RXa) aqS101S0300000_12.l2).LJ;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            Integer num = ((C69698RXa) aqS101S0300000_12.l2).LIZLLL;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            C69698RXa c69698RXa = (C69698RXa) aqS101S0300000_12.l2;
            C70732RpQ c70732RpQ = (C70732RpQ) aqS101S0300000_12.l0;
            galleryViewerViewModel.gv0(view, valueOf, z, i, c69698RXa, c70732RpQ.LJLJI, c70732RpQ);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS101S0300000_12 aqS101S0300000_12) {
        boolean z;
        int i;
        GalleryViewerViewModel galleryViewerViewModel = ((C70732RpQ) aqS101S0300000_12.l0).LJLILLLLZI;
        if (galleryViewerViewModel != null) {
            View view = (View) aqS101S0300000_12.l1;
            String valueOf = String.valueOf(((C69698RXa) aqS101S0300000_12.l2).LIZ);
            Boolean bool = ((C69698RXa) aqS101S0300000_12.l2).LJ;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            Integer num = ((C69698RXa) aqS101S0300000_12.l2).LIZLLL;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            C69698RXa c69698RXa = (C69698RXa) aqS101S0300000_12.l2;
            C70732RpQ c70732RpQ = (C70732RpQ) aqS101S0300000_12.l0;
            galleryViewerViewModel.gv0(view, valueOf, z, i, c69698RXa, c70732RpQ.LJLJI, c70732RpQ);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS101S0300000_12 aqS101S0300000_12) {
        boolean z;
        int i;
        GalleryViewerViewModel galleryViewerViewModel = ((C70731RpP) aqS101S0300000_12.l0).LJLILLLLZI;
        if (galleryViewerViewModel != null) {
            View view = (View) aqS101S0300000_12.l1;
            String valueOf = String.valueOf(((C69698RXa) aqS101S0300000_12.l2).LIZ);
            Boolean bool = ((C69698RXa) aqS101S0300000_12.l2).LJ;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            Integer num = ((C69698RXa) aqS101S0300000_12.l2).LIZLLL;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            C69698RXa c69698RXa = (C69698RXa) aqS101S0300000_12.l2;
            C70731RpP c70731RpP = (C70731RpP) aqS101S0300000_12.l0;
            galleryViewerViewModel.gv0(view, valueOf, z, i, c69698RXa, c70731RpP.LJLJI, c70731RpP);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS101S0300000_12 aqS101S0300000_12) {
        boolean z;
        int i;
        GalleryViewerViewModel galleryViewerViewModel = ((C70731RpP) aqS101S0300000_12.l0).LJLILLLLZI;
        if (galleryViewerViewModel != null) {
            View view = (View) aqS101S0300000_12.l1;
            String valueOf = String.valueOf(((C69698RXa) aqS101S0300000_12.l2).LIZ);
            Boolean bool = ((C69698RXa) aqS101S0300000_12.l2).LJ;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            Integer num = ((C69698RXa) aqS101S0300000_12.l2).LIZLLL;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            C69698RXa c69698RXa = (C69698RXa) aqS101S0300000_12.l2;
            C70731RpP c70731RpP = (C70731RpP) aqS101S0300000_12.l0;
            galleryViewerViewModel.gv0(view, valueOf, z, i, c69698RXa, c70731RpP.LJLJI, c70731RpP);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS101S0300000_12 aqS101S0300000_12) {
        ((C72977SkX) aqS101S0300000_12.l1).LIZIZ(((InterfaceC88471Ynr) aqS101S0300000_12.l0).invoke(((C72977SkX) aqS101S0300000_12.l1).LIZIZ, ((C72977SkX) aqS101S0300000_12.l2).LIZIZ));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS101S0300000_12(C70731RpP c70731RpP, View view, C69698RXa c69698RXa, int i) {
        super(0);
        this.$t = i;
        this.l0 = c70731RpP;
        this.l1 = view;
        this.l2 = c69698RXa;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS101S0300000_12(C70732RpQ c70732RpQ, View view, C69698RXa c69698RXa, int i) {
        super(0);
        this.$t = i;
        this.l0 = c70732RpQ;
        this.l1 = view;
        this.l2 = c69698RXa;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS101S0300000_12(THD thd, ActivityC45651qj activityC45651qj, TF5 tf5, int i) {
        super(0);
        this.$t = i;
        this.l0 = thd;
        this.l1 = activityC45651qj;
        this.l2 = tf5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS101S0300000_12(TNT tnt, Effect effect, ExceptionResult exceptionResult, int i) {
        super(0);
        this.$t = i;
        this.l0 = tnt;
        this.l1 = effect;
        this.l2 = exceptionResult;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS101S0300000_12(C82622Wbi c82622Wbi, C74385THh c74385THh, TNV tnv, int i) {
        super(0);
        this.$t = i;
        this.l0 = c82622Wbi;
        this.l1 = c74385THh;
        this.l2 = tnv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS101S0300000_12(InterfaceC88471Ynr interfaceC88471Ynr, InterfaceC88471Ynr<Object, Object, Object> interfaceC88471Ynr2, C72977SkX<Object> c72977SkX, C72977SkX<Object> c72977SkX2) {
        super(0);
        this.$t = c72977SkX2;
        this.l0 = interfaceC88471Ynr;
        this.l1 = interfaceC88471Ynr2;
        this.l2 = c72977SkX;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS101S0300000_12(LifecycleAwareObserver lifecycleAwareObserver, LifecycleAwareObserver<T> lifecycleAwareObserver2, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super(0);
        this.$t = event;
        this.l0 = lifecycleAwareObserver;
        this.l1 = lifecycleAwareObserver2;
        this.l2 = lifecycleOwner;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS101S0300000_12(PdpFragment pdpFragment, PdpFragment pdpFragment2, ProductPackStruct productPackStruct, HashMap<String, Object> hashMap) {
        super(0);
        this.$t = hashMap;
        this.l0 = pdpFragment;
        this.l1 = pdpFragment2;
        this.l2 = productPackStruct;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS101S0300000_12(ReviewCellViewHolder reviewCellViewHolder, ReviewItemStruct reviewItemStruct, C70677RoX c70677RoX, int i) {
        super(0);
        this.$t = i;
        this.l0 = reviewCellViewHolder;
        this.l1 = reviewItemStruct;
        this.l2 = c70677RoX;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS101S0300000_12(EffectInfoStickerHandler effectInfoStickerHandler, Effect effect, InterfaceC74334TFi interfaceC74334TFi, int i) {
        super(0);
        this.$t = i;
        this.l0 = effectInfoStickerHandler;
        this.l1 = effect;
        this.l2 = interfaceC74334TFi;
    }
}
