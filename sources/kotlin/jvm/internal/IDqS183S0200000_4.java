package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.B04;
import X.C16880lQ;
import X.C188727au;
import X.C221018lt;
import X.C240269bq;
import X.C240289bs;
import X.C244699iz;
import X.C26049AKf;
import X.C26338AVi;
import X.C26797AfR;
import X.C26798AfS;
import X.C27162AlK;
import X.C27565Arp;
import X.C27949Ay1;
import X.C28033AzN;
import X.C28064Azs;
import X.C28066Azu;
import X.C34K;
import X.C36636EZk;
import X.C5H3;
import X.C62822Ol8;
import X.C68322mC;
import X.C70117RfV;
import X.C70414RkI;
import X.C70759Rpr;
import X.C70917RsP;
import X.C70921RsT;
import X.C70935Rsh;
import X.C76542zS;
import X.C76800UCe;
import X.C78946Uyc;
import X.C7MY;
import X.C90193gN;
import X.CK3;
import X.EnumC72807Shn;
import X.FMX;
import X.HG3;
import X.InterfaceC88473Ynt;
import X.JBR;
import X.RBX;
import X.W5F;
import X.X1D;
import X.XKX;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Video;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentHalfFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.payment.GooglePayProcess;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.buytogether.BuyTogetherVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpSelectViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.review.PdpReviewImageViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.sku.v1.PdpSkuHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductDetailReview;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpBodyWidget;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewMedia;
import com.ss.android.ugc.aweme.ecommerce.global.osp.module.shop.GlobalMainOrderInfoVH;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.us.logistic.module.USLogisticVH;
import com.ss.android.ugc.aweme.ecommerce.us.osp.module.shop.USMainOrderInfoVH;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.assem.MusicHeaderAssem;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.PinnedMusicList;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.platform.base.data.Legacy;
import com.ss.android.ugc.profile.platform.base.data.ProfileUser;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class IDqS183S0200000_4 extends AbstractC65781Prl implements InterfaceC88473Ynt {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            case 4:
                return invoke$4(this, obj, obj2, obj3);
            case 5:
                return invoke$5(this, obj, obj2, obj3);
            case 6:
                return invoke$6(this, obj, obj2, obj3);
            case 7:
                return invoke$7(this, obj, obj2, obj3);
            case 8:
                return invoke$8(this, obj, obj2, obj3);
            case 9:
                return invoke$9(this, obj, obj2, obj3);
            case 10:
                return invoke$10(this, obj, obj2, obj3);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj, obj2, obj3);
            case 12:
                return invoke$12(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS183S0200000_4(C68322mC c68322mC, C68322mC<List<Music>> c68322mC2, MusicHeaderAssem musicHeaderAssem) {
        super(3);
        this.$t = musicHeaderAssem;
        this.l0 = c68322mC;
        this.l1 = c68322mC2;
    }

    public final void invoke$0(View bindItems, C26798AfS item, int i) {
        Video video;
        Object obj;
        int i2;
        Integer num;
        Integer num2;
        o.LJIIIZ(bindItems, "$this$bindItems");
        o.LJIIIZ(item, "item");
        ReviewMedia reviewMedia = item.LJFF;
        if (reviewMedia == null || (num2 = reviewMedia.mediaType) == null || num2.intValue() != 1) {
            ReviewMedia reviewMedia2 = item.LJFF;
            if (reviewMedia2 != null && (video = reviewMedia2.video) != null) {
                obj = video.postUrl;
            }
            obj = null;
        } else {
            Image image = item.LJFF.image;
            if (image != null) {
                obj = image.toThumbFirstImageUrlModel();
            }
            obj = null;
        }
        ImageView imageView = (ImageView) bindItems.findViewById(R.id.hrq);
        if (imageView != null) {
            ReviewMedia reviewMedia3 = item.LJFF;
            if (reviewMedia3 == null || (num = reviewMedia3.mediaType) == null || num.intValue() != 2 || i == 3) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            imageView.setVisibility(i2);
        }
        W5F LIZLLL = C70759Rpr.LIZLLL(obj);
        LIZLLL.LJIJJ = EnumC72807Shn.CENTER_CROP;
        LIZLLL.LJIILIIL = C7MY.LIZJ(bindItems, "context", R.attr.cj);
        LIZLLL.LJIJJLI = C70759Rpr.LIZIZ;
        LIZLLL.LJJIIJ = (SmartImageView) bindItems.findViewById(R.id.j0u);
        C16880lQ.LLJJJ(LIZLLL);
        C16880lQ.LJIIJ(new C26797AfR((PdpReviewImageViewHolder) this.l1, item, i), bindItems);
        if (i == 3) {
            C26338AVi.LJI(bindItems, null, null, 0, null, false, 27);
            bindItems.findViewById(R.id.jsb).setVisibility(0);
            int size = ((List) this.l0).size() - 4;
            if (size > 0) {
                if (C90193gN.LIZ()) {
                    TextView textView = (TextView) bindItems.findViewById(R.id.jsb);
                    StringBuilder sb = new StringBuilder();
                    sb.append(size);
                    sb.append('+');
                    textView.setText(sb.toString());
                    return;
                }
                ((TextView) bindItems.findViewById(R.id.jsb)).setText("+" + size);
                return;
            }
            bindItems.findViewById(R.id.jsb).setVisibility(8);
            return;
        }
        bindItems.findViewById(R.id.jsb).setVisibility(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS183S0200000_4(C28064Azs c28064Azs, PaymentHalfFragment paymentHalfFragment, int i) {
        super(3);
        this.$t = i;
        this.l0 = c28064Azs;
        this.l1 = paymentHalfFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS183S0200000_4(View view, PdpSelectViewHolder pdpSelectViewHolder, int i) {
        super(3);
        this.$t = i;
        this.l0 = view;
        this.l1 = pdpSelectViewHolder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS183S0200000_4(PaymentHalfFragment paymentHalfFragment, OrderSubmitViewModel orderSubmitViewModel, int i) {
        super(3);
        this.$t = i;
        this.l0 = paymentHalfFragment;
        this.l1 = orderSubmitViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS183S0200000_4(BuyTogetherVH buyTogetherVH, View view, int i) {
        super(3);
        this.$t = i;
        this.l0 = buyTogetherVH;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS183S0200000_4(PdpSkuHolder pdpSkuHolder, C62822Ol8 c62822Ol8, int i) {
        super(3);
        this.$t = i;
        this.l0 = pdpSkuHolder;
        this.l1 = c62822Ol8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS183S0200000_4(PdpBodyWidget pdpBodyWidget, C34K c34k, int i) {
        super(3);
        this.$t = i;
        this.l0 = pdpBodyWidget;
        this.l1 = c34k;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS183S0200000_4(GlobalMainOrderInfoVH globalMainOrderInfoVH, GlobalMainOrderInfoVH globalMainOrderInfoVH2, HashMap<String, Object> hashMap) {
        super(3);
        this.$t = hashMap;
        this.l0 = globalMainOrderInfoVH;
        this.l1 = globalMainOrderInfoVH2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS183S0200000_4(USLogisticVH uSLogisticVH, LogisticDTO logisticDTO, int i) {
        super(3);
        this.$t = i;
        this.l0 = uSLogisticVH;
        this.l1 = logisticDTO;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS183S0200000_4(USMainOrderInfoVH uSMainOrderInfoVH, LogisticDTO logisticDTO, int i) {
        super(3);
        this.$t = i;
        this.l0 = uSMainOrderInfoVH;
        this.l1 = logisticDTO;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS183S0200000_4(USMainOrderInfoVH uSMainOrderInfoVH, USMainOrderInfoVH uSMainOrderInfoVH2, HashMap<String, Object> hashMap) {
        super(3);
        this.$t = hashMap;
        this.l0 = uSMainOrderInfoVH;
        this.l1 = uSMainOrderInfoVH2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS183S0200000_4(ProfilePlatformViewModel profilePlatformViewModel, ProfilePlatformViewModel profilePlatformViewModel2, ArrayList<String> arrayList) {
        super(3);
        this.$t = arrayList;
        this.l0 = profilePlatformViewModel;
        this.l1 = profilePlatformViewModel2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS183S0200000_4(List list, List<C26798AfS> list2, PdpReviewImageViewHolder pdpReviewImageViewHolder) {
        super(3);
        this.$t = pdpReviewImageViewHolder;
        this.l0 = list;
        this.l1 = list2;
    }

    public static final Object invoke$0(IDqS183S0200000_4 iDqS183S0200000_4, Object obj, Object obj2, Object obj3) {
        PaymentInfo paymentInfo = (PaymentInfo) obj;
        Boolean bool = (Boolean) obj2;
        Map<? extends String, ? extends Object> map = (Map) obj3;
        o.LJIIIZ(paymentInfo, "paymentInfo");
        if (paymentInfo.paymentMethodInfo != null) {
            if (!C28033AzN.LIZ() || !GooglePayProcess.LJ(paymentInfo.paymentMethod)) {
                ((C28064Azs) iDqS183S0200000_4.l0).LIZ(paymentInfo, null, bool, new AqS154S0100000_4((PaymentHalfFragment) iDqS183S0200000_4.l1, 8));
            } else {
                if (map != null) {
                    B04.LIZIZ.putAll(map);
                }
                B04.LIZ.put("google_pay", Long.valueOf(SystemClock.elapsedRealtime()));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap<String, Object> linkedHashMap2 = B04.LIZIZ;
                linkedHashMap.putAll(linkedHashMap2);
                linkedHashMap.put("page_name", "google_pay");
                Object obj4 = linkedHashMap2.get("page_name");
                if (obj4 != null) {
                    linkedHashMap.put("previous_page", obj4);
                }
                linkedHashMap.put("is_fullscreen", CardStruct.IStatusCode.DEFAULT);
                C76542zS.LIZ("tiktokec_enter_page", linkedHashMap);
                C28066Azu c28066Azu = new C28066Azu(null);
                C28064Azs c28064Azs = (C28064Azs) iDqS183S0200000_4.l0;
                c28066Azu.LIZ = c28064Azs.LJI;
                c28066Azu.LIZJ = c28064Azs.LJFF;
                GooglePayProcess.LJFF(c28066Azu, new AqS50S0400000_4(c28064Azs, paymentInfo, bool, (PaymentHalfFragment) iDqS183S0200000_4.l1, 3));
            }
        } else {
            ((C28064Azs) iDqS183S0200000_4.l0).LIZIZ(null);
            ((PaymentHalfFragment) iDqS183S0200000_4.l1).dismissAllowingStateLoss();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS183S0200000_4 iDqS183S0200000_4, Object obj, Object obj2, Object obj3) {
        View view;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        String toastMsg = (String) obj2;
        o.LJIIIZ(toastMsg, "toastMsg");
        if (!booleanValue) {
            C26049AKf.LIZ(((PdpSkuHolder) iDqS183S0200000_4.l0).itemView, toastMsg);
        } else {
            PdpViewModel pdpViewModel = (PdpViewModel) ((C5H3) iDqS183S0200000_4.l1).getValue();
            Context context = ((PdpSkuHolder) iDqS183S0200000_4.l0).itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            C27565Arp c27565Arp = ((PdpViewModel) ((C5H3) iDqS183S0200000_4.l1).getValue()).LLJLLL;
            View view2 = null;
            if (c27565Arp != null && (view = c27565Arp.LIZ.LLFZ) != null) {
                view2 = view.findViewById(R.id.wn);
            }
            pdpViewModel.Pv0(context, view2, toastMsg, obj3, LifecycleOwnerKt.getLifecycleScope((PdpSkuHolder) iDqS183S0200000_4.l0));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(IDqS183S0200000_4 iDqS183S0200000_4, Object obj, Object obj2, Object obj3) {
        View view;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        String toastMsg = (String) obj2;
        o.LJIIIZ(toastMsg, "toastMsg");
        if (!booleanValue) {
            C26049AKf.LIZ((View) iDqS183S0200000_4.l0, toastMsg);
        } else {
            PdpViewModel viewModel = ((PdpSelectViewHolder) iDqS183S0200000_4.l1).getViewModel();
            Context context = ((View) iDqS183S0200000_4.l0).getContext();
            o.LJIIIIZZ(context, "it.context");
            C27565Arp c27565Arp = ((PdpSelectViewHolder) iDqS183S0200000_4.l1).getViewModel().LLJLLL;
            View view2 = null;
            if (c27565Arp != null && (view = c27565Arp.LIZ.LLFZ) != null) {
                view2 = view.findViewById(R.id.wn);
            }
            viewModel.Pv0(context, view2, toastMsg, obj3, LifecycleOwnerKt.getLifecycleScope((PdpSelectViewHolder) iDqS183S0200000_4.l1));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(IDqS183S0200000_4 iDqS183S0200000_4, Object obj, Object obj2, Object obj3) {
        ((Boolean) obj).booleanValue();
        long longValue = ((Number) obj2).longValue();
        o.LJIIIZ(obj3, "<anonymous parameter 2>");
        USLogisticVH uSLogisticVH = (USLogisticVH) iDqS183S0200000_4.l0;
        LogisticDTO logisticDTO = (LogisticDTO) iDqS183S0200000_4.l1;
        long elapsedRealtime = SystemClock.elapsedRealtime() - longValue;
        View itemView = uSLogisticVH.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C78946Uyc.LJJIIJ(itemView, new C70935Rsh(0), new AqS29S0100100_4(logisticDTO, elapsedRealtime, 8));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(IDqS183S0200000_4 iDqS183S0200000_4, Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        ProfileUser profileUser = (ProfileUser) obj3;
        if (!booleanValue || profileUser == null) {
            StringBuilder LJI = JBR.LJI("success: ", booleanValue, ", data is null = ");
            if (profileUser == null) {
                z = true;
            } else {
                z = false;
            }
            LJI.append(z);
            String errorMsg = X1D.LIZIZ(LJI);
            o.LJIIIZ(errorMsg, "errorMsg");
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("error_msg", errorMsg);
            FMX.LJIIL("profile_platform_legacy", c188727au.LIZ);
            ProfilePlatformViewModel profilePlatformViewModel = (ProfilePlatformViewModel) iDqS183S0200000_4.l0;
            ArrayList arrayList = (ArrayList) iDqS183S0200000_4.l1;
            profilePlatformViewModel.getClass();
            ProfilePlatformViewModel.tv0("legacy_error", arrayList);
        } else {
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("before adapter getLegacyInfo legacy: ");
                LIZ.append(profileUser.legacy);
                C221018lt.LJFF("ProfilePlatformView", X1D.LIZIZ(LIZ));
                Legacy legacy = profileUser.legacy;
                User curUser = ((RBX) HG3.LJIILL()).getCurUser();
                o.LJIIIIZZ(curUser, "userService().curUser");
                C244699iz.LJJI(legacy, curUser);
                ProfilePlatformViewModel profilePlatformViewModel2 = (ProfilePlatformViewModel) iDqS183S0200000_4.l0;
                ArrayList arrayList2 = (ArrayList) iDqS183S0200000_4.l1;
                profilePlatformViewModel2.getClass();
                ProfilePlatformViewModel.tv0("legacy", arrayList2);
            } catch (Throwable th) {
                ProfilePlatformViewModel profilePlatformViewModel3 = (ProfilePlatformViewModel) iDqS183S0200000_4.l0;
                ArrayList arrayList3 = (ArrayList) iDqS183S0200000_4.l1;
                profilePlatformViewModel3.getClass();
                ProfilePlatformViewModel.tv0("legacy_error", arrayList3);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("getLegacyInfo exception: ");
                LIZ2.append(th.getMessage());
                C221018lt.LIZIZ("ProfilePlatformView", X1D.LIZIZ(LIZ2));
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("getLegacyInfo exception: ");
                LIZ3.append(th.getMessage());
                String errorMsg2 = X1D.LIZIZ(LIZ3);
                o.LJIIIZ(errorMsg2, "errorMsg");
                C188727au c188727au2 = new C188727au();
                c188727au2.LJIIIZ("error_msg", errorMsg2);
                FMX.LJIIL("profile_platform_legacy", c188727au2.LIZ);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS183S0200000_4 iDqS183S0200000_4, Object selectSubscribe, Object obj, Object obj2) {
        View findViewById;
        View findViewById2;
        List<ReviewItemStruct> list;
        View findViewById3;
        int intValue = ((Number) obj).intValue();
        ProductDetailReview productDetailReview = (ProductDetailReview) obj2;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (productDetailReview != null && (list = productDetailReview.reviewItems) != null && (!list.isEmpty())) {
            View view = ((PdpBodyWidget) iDqS183S0200000_4.l0).contentView;
            if (view != null && (findViewById3 = view.findViewById(R.id.le_)) != null) {
                findViewById3.setVisibility(8);
            }
        } else if (intValue < C27162AlK.LIZIZ) {
            View view2 = ((PdpBodyWidget) iDqS183S0200000_4.l0).contentView;
            if (view2 != null && (findViewById2 = view2.findViewById(R.id.le_)) != null) {
                findViewById2.setVisibility(8);
            }
        } else {
            C34K c34k = (C34K) iDqS183S0200000_4.l1;
            if (!c34k.element) {
                c34k.element = true;
                C70414RkI c70414RkI = ((PdpBodyWidget) iDqS183S0200000_4.l0).getViewModel().LLFII;
                if (c70414RkI != null) {
                    c70414RkI.LJJIFFI("to_top", null);
                }
            }
            View view3 = ((PdpBodyWidget) iDqS183S0200000_4.l0).contentView;
            if (view3 != null && (findViewById = view3.findViewById(R.id.le_)) != null) {
                findViewById.setVisibility(0);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(IDqS183S0200000_4 iDqS183S0200000_4, Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        long longValue = ((Number) obj2).longValue();
        String quitType = (String) obj3;
        o.LJIIIZ(quitType, "quitType");
        if (booleanValue) {
            View itemView = ((GlobalMainOrderInfoVH) iDqS183S0200000_4.l0).itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C78946Uyc.LJJIIJ(itemView, new C70917RsP(), new AqS170S0100000_4((HashMap) iDqS183S0200000_4.l1, (HashMap<String, Object>) 346));
        }
        View itemView2 = ((GlobalMainOrderInfoVH) iDqS183S0200000_4.l0).itemView;
        o.LJIIIIZZ(itemView2, "itemView");
        C78946Uyc.LJJIIJ(itemView2, new C70921RsT(), new AqS9S1100100_4(quitType, (String) longValue, (long) iDqS183S0200000_4.l1, (HashMap<String, Object>) 0));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(IDqS183S0200000_4 iDqS183S0200000_4, Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        long longValue = ((Number) obj2).longValue();
        String quitType = (String) obj3;
        o.LJIIIZ(quitType, "quitType");
        if (booleanValue) {
            View itemView = ((USMainOrderInfoVH) iDqS183S0200000_4.l0).itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C78946Uyc.LJJIIJ(itemView, new C70917RsP(), new AqS170S0100000_4((HashMap) iDqS183S0200000_4.l1, (HashMap<String, Object>) 365));
        }
        View itemView2 = ((USMainOrderInfoVH) iDqS183S0200000_4.l0).itemView;
        o.LJIIIIZZ(itemView2, "itemView");
        C78946Uyc.LJJIIJ(itemView2, new C70921RsT(), new AqS9S1100100_4(quitType, (String) longValue, (long) iDqS183S0200000_4.l1, (HashMap<String, Object>) 1));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(IDqS183S0200000_4 iDqS183S0200000_4, Object obj, Object obj2, Object obj3) {
        Serializable pinnedMusicList;
        PinnedMusicList pinnedMusicList2;
        ((Number) obj).intValue();
        Intent intent = (Intent) obj3;
        if (((Number) obj2).intValue() == -1) {
            if (intent == null || (pinnedMusicList = intent.getSerializableExtra("pinned_music_list")) == null) {
                pinnedMusicList = new PinnedMusicList();
            }
            if (!(pinnedMusicList instanceof PinnedMusicList) || (pinnedMusicList2 = (PinnedMusicList) pinnedMusicList) == null) {
                pinnedMusicList2 = new PinnedMusicList();
            }
            if (C240269bq.LIZ() && !o.LJ(((C68322mC) iDqS183S0200000_4.l0).element, pinnedMusicList2.getMusicList())) {
                ((MusicHeaderAssem) iDqS183S0200000_4.l1).H3().refresh();
            } else if (!C240269bq.LIZ()) {
                OriginMusicListViewModel H3 = ((MusicHeaderAssem) iDqS183S0200000_4.l1).H3();
                H3.getClass();
                H3.LJLJI = pinnedMusicList2;
                H3.listSetItems(OriginMusicListViewModel.hv0(H3, null, null, null, null, null, null, 63));
                H3.setState(C240289bs.LJLIL);
            }
        }
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$6(IDqS183S0200000_4 iDqS183S0200000_4, Object obj, Object obj2, Object obj3) {
        iDqS183S0200000_4.invoke$0((View) obj, (C26798AfS) obj2, ((Number) obj3).intValue());
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(IDqS183S0200000_4 iDqS183S0200000_4, Object obj, Object obj2, Object obj3) {
        ((Boolean) obj).booleanValue();
        long longValue = ((Number) obj2).longValue();
        o.LJIIIZ(obj3, "<anonymous parameter 2>");
        USMainOrderInfoVH uSMainOrderInfoVH = (USMainOrderInfoVH) iDqS183S0200000_4.l0;
        LogisticDTO logisticDTO = (LogisticDTO) iDqS183S0200000_4.l1;
        long elapsedRealtime = SystemClock.elapsedRealtime() - longValue;
        View itemView = uSMainOrderInfoVH.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C78946Uyc.LJJIIJ(itemView, new C70935Rsh(0), new AqS29S0100100_4(logisticDTO, elapsedRealtime, 6));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(IDqS183S0200000_4 iDqS183S0200000_4, Object obj, Object obj2, Object obj3) {
        String str;
        String str2;
        PaymentInfo pm = (PaymentInfo) obj;
        o.LJIIIZ(pm, "pm");
        ((PaymentHalfFragment) iDqS183S0200000_4.l0).dismissAllowingStateLoss();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("selected from PaymentHalfFragment, paymentInfo: ");
        PaymentMethod paymentMethod = pm.paymentMethod;
        if (paymentMethod != null) {
            str = paymentMethod.id;
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(", ");
        PaymentMethodInfo paymentMethodInfo = pm.paymentMethodInfo;
        if (paymentMethodInfo != null) {
            str2 = paymentMethodInfo.getId();
        } else {
            str2 = null;
        }
        CK3.LIZIZ(LIZ, str2, LIZ, 4);
        OrderSubmitViewModel.Iv0((OrderSubmitViewModel) iDqS183S0200000_4.l1, pm, false, null, 12);
        C27949Ay1.LJJJJ();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(IDqS183S0200000_4 iDqS183S0200000_4, Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        String toastMsg = (String) obj2;
        o.LJIIIZ(toastMsg, "toastMsg");
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope((BuyTogetherVH) iDqS183S0200000_4.l0), C36636EZk.LIZ, null, new C70117RfV((BuyTogetherVH) iDqS183S0200000_4.l0, obj3, intValue, (View) iDqS183S0200000_4.l1, toastMsg, null), 2);
        return C76800UCe.LIZ;
    }
}
