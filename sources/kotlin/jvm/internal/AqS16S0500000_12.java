package kotlin.jvm.internal;

import X.AV1;
import X.AbstractC26082ALm;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.B1K;
import X.B20;
import X.B21;
import X.B2I;
import X.C163586bS;
import X.C163596bT;
import X.C16880lQ;
import X.C173936s9;
import X.C17N;
import X.C19K;
import X.C221018lt;
import X.C28112B1o;
import X.C28123B1z;
import X.C32I;
import X.C47261Igj;
import X.C65352Pkq;
import X.C68322mC;
import X.C69684RWm;
import X.C69692RWu;
import X.C71076Ruy;
import X.C71679SBf;
import X.C71681SBh;
import X.C71682SBi;
import X.C71723SCx;
import X.C73140SnA;
import X.C73165SnZ;
import X.C76732zl;
import X.C76800UCe;
import X.C78250UnO;
import X.C78939UyV;
import X.C78996UzQ;
import X.EnumC72807Shn;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.J7H;
import X.ORY;
import X.ORZ;
import X.OSZ;
import X.SC6;
import X.SCQ;
import X.SCS;
import X.SD3;
import X.SD5;
import X.SSZ;
import X.TBW;
import X.W5F;
import X.W5U;
import android.content.res.Resources;
import android.text.Editable;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.OcrStatus;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentState;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.viewholder.CCDCCardNumberElementViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.viewholder.CCDCDateElementViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.viewholder.CCDCNormalElementViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductUnavailableInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpMainState;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardConfig;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardData;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean.FeedEcCardStyle;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.card.container.view.biz.DefaultFeedEcCardBizView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.aigc.ProfileAigcAvatarViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qna.api.TiktokV1ForumProfileBannerResponse;
import com.ss.android.ugc.aweme.qna.assem.QnaHeaderAssem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes13.dex */
public class AqS16S0500000_12 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    public static /* bridge */ /* synthetic */ Object invoke$4(AqS16S0500000_12 aqS16S0500000_12, Object obj) {
        aqS16S0500000_12.invoke$1(obj);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            default:
                return null;
        }
    }

    public final void invoke$0(TiktokV1ForumProfileBannerResponse tiktokV1ForumProfileBannerResponse) {
        int i;
        User user;
        String string;
        View view = (View) this.l0;
        if (!((QnaHeaderAssem) this.l1).LJLILLLLZI) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        if (tiktokV1ForumProfileBannerResponse != null && (user = tiktokV1ForumProfileBannerResponse.profileUser) != null) {
            QnaHeaderAssem qnaHeaderAssem = (QnaHeaderAssem) this.l1;
            TextView textView = (TextView) this.l2;
            TextView textView2 = (TextView) this.l3;
            SmartImageView smartImageView = (SmartImageView) this.l4;
            String LIZ = AV1.LIZ(user, false);
            ActivityC45651qj activityC45651qj = qnaHeaderAssem.LJLIL;
            if (activityC45651qj != null) {
                Resources resources = activityC45651qj.getResources();
                if (qnaHeaderAssem.LJLILLLLZI) {
                    string = resources.getString(R.string.pqa);
                } else {
                    string = resources.getString(R.string.pny, LIZ);
                }
                o.LJIIIIZZ(string, "if (isMyQna) res.getStri…tle_android, displayName)");
                textView.setText(string);
                textView2.setText(string);
                UrlModel avatarThumb = user.getAvatarThumb();
                o.LJIIIIZZ(avatarThumb, "avatarThumb");
                W5F LJII = W5U.LJII(C78939UyV.LJ(avatarThumb));
                LJII.LJIILIIL(J7H.LIZ(100));
                LJII.LJJIJIIJIL = true;
                LJII.LIZIZ("QnaProfile");
                LJII.LJIJJ = EnumC72807Shn.CENTER_CROP;
                LJII.LJJIIJ = smartImageView;
                C16880lQ.LLJJJ(LJII);
                return;
            }
            o.LJIJI("activity");
            throw null;
        }
    }

    public final void invoke$1(C73140SnA c73140SnA) {
        InterfaceC88472Yns interfaceC88472Yns;
        AbstractC26082ALm abstractC26082ALm = (AbstractC26082ALm) c73140SnA.LJLIL;
        if (abstractC26082ALm instanceof C163596bT) {
            InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) this.l2;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
                return;
            }
            return;
        }
        if (abstractC26082ALm instanceof C163586bS) {
            InterfaceC88472Yns interfaceC88472Yns2 = (InterfaceC88472Yns) this.l3;
            if (interfaceC88472Yns2 == null) {
                return;
            }
            interfaceC88472Yns2.invoke(((C163586bS) abstractC26082ALm).LIZ);
            return;
        }
        if (!(abstractC26082ALm instanceof C173936s9) || (interfaceC88472Yns = (InterfaceC88472Yns) this.l4) == null) {
            return;
        }
        interfaceC88472Yns.invoke(((C173936s9) abstractC26082ALm).LIZ);
    }

    public final String invoke$2(List<PaymentElement> it) {
        int i;
        String str;
        boolean z;
        String str2;
        o.LJIIIZ(it, "it");
        String LIZIZ = SCS.LIZIZ((ElementDTO) this.l0, (PaymentMethod) this.l1, it);
        Editable text = ((C19K) ((C71723SCx) this.l2).LIZIZ(R.id.eof)).getText();
        if (text != null) {
            i = text.length();
        } else {
            i = 0;
        }
        CCDCCardNumberElementViewHolder cCDCCardNumberElementViewHolder = (CCDCCardNumberElementViewHolder) this.l3;
        int i2 = i - cCDCCardNumberElementViewHolder.LJLJI;
        cCDCCardNumberElementViewHolder.getViewModel().getClass();
        if (i2 > 0) {
            str = "add";
        } else if (i2 < 0) {
            str = "del";
        } else {
            str = "auto";
            if (!o.LJ("", "auto")) {
                str = "";
            }
        }
        long LIZ = C28112B1o.LIZ(C16880lQ.LJLLJ(((CCDCCardNumberElementViewHolder) this.l3).getClass()));
        boolean z2 = true;
        if (LIZIZ == null) {
            z = true;
        } else {
            z = false;
        }
        C28112B1o.LJIIIIZZ("card_number", LIZ, str, Boolean.valueOf(z));
        String LJIIL = ((PaymentMethod) this.l1).LJIIL();
        if (LIZIZ != null) {
            z2 = false;
        }
        String str3 = ((ElementDTO) this.l0).id;
        String str4 = null;
        if (str3 != null) {
            str2 = ujb.o.LJJJJZ(str3, "eg_ccdc_global_", "", false);
        } else {
            str2 = null;
        }
        SCQ iv0 = ((CCDCCardNumberElementViewHolder) this.l3).getViewModel().iv0();
        PaymentElement paymentElement = (PaymentElement) ORZ.LJLLLL(it);
        if (paymentElement != null) {
            str4 = paymentElement.getParamValue();
        }
        C28112B1o.LJI(iv0.LIZJ(str4), LJIIL, str2, str, z2);
        ((C71682SBi) this.l4).LJLILLLLZI.LIZJ = LIZIZ;
        return LIZIZ;
    }

    public static final Object invoke$0(AqS16S0500000_12 aqS16S0500000_12, Object obj) {
        String it = (String) obj;
        o.LJIIIZ(it, "it");
        C221018lt.LIZ("ProfileAigcAvatarViewModel", "download avatar image explicitly");
        C78250UnO c78250UnO = C78250UnO.LIZ;
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) aqS16S0500000_12.l0;
        SSZ ssz = new SSZ(activityC45651qj, (ProfileAigcAvatarViewModel) aqS16S0500000_12.l1, (List) aqS16S0500000_12.l4, (C76732zl) aqS16S0500000_12.l2, (C76732zl) aqS16S0500000_12.l3);
        c78250UnO.getClass();
        C78250UnO.LIZIZ(it, activityC45651qj, ssz);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS16S0500000_12 aqS16S0500000_12, Object obj) {
        B1K b1k;
        String str;
        PaymentElement paymentElement;
        PaymentElement paymentElement2;
        Object b20;
        String str2;
        String str3;
        String str4;
        PaymentState state = (PaymentState) obj;
        o.LJIIIZ(state, "state");
        List<Object> paymentList = state.getPaymentList();
        SC6 sc6 = (SC6) aqS16S0500000_12.l1;
        PaymentViewModel paymentViewModel = (PaymentViewModel) aqS16S0500000_12.l0;
        PaymentMethod paymentMethod = (PaymentMethod) aqS16S0500000_12.l2;
        OcrStatus ocrStatus = (OcrStatus) aqS16S0500000_12.l3;
        OcrStatus ocrStatus2 = (OcrStatus) aqS16S0500000_12.l4;
        ArrayList arrayList = new ArrayList(C32I.LJJL(paymentList, 10));
        for (Object obj2 : paymentList) {
            String str5 = "";
            if (obj2 instanceof C28123B1z) {
                B2I b2i = (B2I) obj2;
                PaymentElement LIZ = b2i.LIZ.LIZ();
                LIZ.setParamValue(sc6.LIZ);
                PaymentMethod paymentMethod2 = b2i.LIZIZ;
                String str6 = b2i.LIZ.id;
                if (str6 != null) {
                    str5 = str6;
                }
                paymentViewModel.Sv0(paymentMethod2, str5, C47261Igj.LJJIJ(LIZ));
                B1K b1k2 = paymentViewModel.LJLL;
                if (b1k2 != null) {
                    if (paymentMethod != null) {
                        str4 = paymentMethod.LJIIL();
                    } else {
                        str4 = null;
                    }
                    b1k2.LJIIIIZZ(C17N.LJJJLZIJ(ocrStatus2.cardNumber), str4, LIZ.getParamName(), paymentViewModel.LJLLI, o.LJ(ocrStatus.cardNumber, "1"));
                }
                b20 = new C28123B1z(b2i.LIZ, b2i.LIZIZ, SCS.LIZIZ(b2i.LIZ, b2i.LIZIZ, C47261Igj.LJJIJ(LIZ)));
            } else if (obj2 instanceof B20) {
                B2I b2i2 = (B2I) obj2;
                List<PaymentElement> LIZIZ = b2i2.LIZ.LIZIZ();
                Iterator<PaymentElement> it = LIZIZ.iterator();
                while (true) {
                    if (it.hasNext()) {
                        paymentElement = it.next();
                        if (o.LJ(paymentElement.getElement(), "eg_ccdc_global_expiration_month")) {
                            break;
                        }
                    } else {
                        paymentElement = null;
                        break;
                    }
                }
                PaymentElement paymentElement3 = paymentElement;
                Iterator<PaymentElement> it2 = LIZIZ.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        paymentElement2 = it2.next();
                        if (o.LJ(paymentElement2.getElement(), "eg_ccdc_global_expiration_year")) {
                            break;
                        }
                    } else {
                        paymentElement2 = null;
                        break;
                    }
                }
                PaymentElement paymentElement4 = paymentElement2;
                if (paymentElement3 != null) {
                    paymentElement3.setParamValue(sc6.LIZIZ.LIZIZ);
                }
                if (paymentElement4 != null) {
                    paymentElement4.setParamValue(sc6.LIZIZ.LIZ);
                }
                PaymentMethod paymentMethod3 = b2i2.LIZIZ;
                String str7 = b2i2.LIZ.id;
                if (str7 != null) {
                    str5 = str7;
                }
                paymentViewModel.Sv0(paymentMethod3, str5, ORY.LJJIJLIJ(new PaymentElement[]{paymentElement3, paymentElement4}));
                B1K b1k3 = paymentViewModel.LJLL;
                if (b1k3 != null) {
                    if (paymentMethod != null) {
                        str2 = paymentMethod.LJIIL();
                    } else {
                        str2 = null;
                    }
                    boolean LJ = o.LJ(ocrStatus.date, "1");
                    if (paymentViewModel.LJLL != null) {
                        str3 = B1K.LJIJ(b2i2.LIZ.paramName);
                    } else {
                        str3 = null;
                    }
                    b1k3.LJIIIIZZ(C17N.LJJJLZIJ(ocrStatus2.date), str2, str3, paymentViewModel.LJLLI, LJ);
                }
                b20 = new B20(b2i2.LIZ, b2i2.LIZIZ, SCS.LIZIZ(b2i2.LIZ, b2i2.LIZIZ, ORY.LJJIJLIJ(new PaymentElement[]{paymentElement3, paymentElement4})));
            } else {
                if (obj2 instanceof B21) {
                    ElementDTO elementDTO = ((B2I) obj2).LIZ;
                    if (o.LJ(elementDTO.id, "eg_ccdc_global_holder_name") && (b1k = paymentViewModel.LJLL) != null) {
                        if (paymentMethod != null) {
                            str = paymentMethod.LJIIL();
                        } else {
                            str = null;
                        }
                        b1k.LJIIIIZZ(C17N.LJJJLZIJ(ocrStatus2.holder), str, elementDTO.paramName, paymentViewModel.LJLLI, o.LJ(ocrStatus.holder, "1"));
                    }
                }
                arrayList.add(obj2);
            }
            obj2 = b20;
            arrayList.add(obj2);
        }
        ((PaymentViewModel) aqS16S0500000_12.l0).setState(new AqS170S0100000_4(arrayList, (List<? extends Object>) 19));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$2(AqS16S0500000_12 aqS16S0500000_12, Object obj) {
        PdpMainState setState = (PdpMainState) obj;
        o.LJIIIZ(setState, "$this$setState");
        PdpViewModel pdpViewModel = (PdpViewModel) aqS16S0500000_12.l0;
        List Uv0 = PdpViewModel.Uv0(pdpViewModel, pdpViewModel.LJLJLLL, false, 30);
        ProductPackStruct productPackStruct = ((PdpViewModel) aqS16S0500000_12.l0).LJLJLLL;
        C69684RWm c69684RWm = null;
        if (productPackStruct != null) {
            c69684RWm = C78996UzQ.LJJJJJL(productPackStruct, ((C69692RWu) aqS16S0500000_12.l1).LIZJ, (ProductUnavailableInfo) ((C68322mC) aqS16S0500000_12.l2).element, null, ((SkuItem) aqS16S0500000_12.l3).buyButton);
        }
        return PdpMainState.copy$default(setState, false, c69684RWm, null, false, 0, null, Uv0, 0.0f, 0, null, 0, false, null, null, null, null, null, null, null, 0, null, false, null, null, null, null, null, null, null, null, ((PdpViewModel) aqS16S0500000_12.l0).gw0(((C69692RWu) aqS16S0500000_12.l4).LJ), null, -1073741891, null);
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AqS16S0500000_12 aqS16S0500000_12, Object obj) {
        aqS16S0500000_12.invoke$0((TiktokV1ForumProfileBannerResponse) obj);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS16S0500000_12 aqS16S0500000_12, Object obj) {
        OSZ it = (OSZ) obj;
        o.LJIIIZ(it, "it");
        ((DefaultFeedEcCardBizView) aqS16S0500000_12.l0).LIZ((Aweme) aqS16S0500000_12.l1, (FeedEcCardData) aqS16S0500000_12.l2, (FeedEcCardConfig) aqS16S0500000_12.l3, (FeedEcCardStyle) aqS16S0500000_12.l4, (C71076Ruy) it.getFirst(), (List) it.getSecond(), false);
        ((DefaultFeedEcCardBizView) aqS16S0500000_12.l0).LIZLLL(false);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$6(AqS16S0500000_12 aqS16S0500000_12, Object obj) {
        return aqS16S0500000_12.invoke$2((List) obj);
    }

    public static final Object invoke$7(AqS16S0500000_12 aqS16S0500000_12, Object obj) {
        int i;
        String str;
        boolean z;
        boolean z2;
        Object obj2;
        String str2;
        Object obj3;
        List it = (List) obj;
        o.LJIIIZ(it, "it");
        String LIZIZ = SCS.LIZIZ((ElementDTO) aqS16S0500000_12.l0, (PaymentMethod) aqS16S0500000_12.l1, it);
        Editable text = ((C19K) ((SD3) aqS16S0500000_12.l2).LIZIZ(R.id.eof)).getText();
        boolean z3 = false;
        if (text != null) {
            i = text.length();
        } else {
            i = 0;
        }
        CCDCDateElementViewHolder cCDCDateElementViewHolder = (CCDCDateElementViewHolder) aqS16S0500000_12.l3;
        int i2 = i - cCDCDateElementViewHolder.LJLJI;
        cCDCDateElementViewHolder.getViewModel().getClass();
        if (i2 > 0) {
            str = "add";
        } else if (i2 < 0) {
            str = "del";
        } else {
            str = "";
            if (o.LJ("", "auto")) {
                str = "auto";
            }
        }
        String LJIILIIL = C28112B1o.LJIILIIL(((ElementDTO) aqS16S0500000_12.l0).paramName);
        long LIZ = C28112B1o.LIZ(C65352Pkq.LIZ(CCDCDateElementViewHolder.class).LJFF());
        if (LIZIZ == null) {
            z = true;
        } else {
            z = false;
        }
        C28112B1o.LJIIIIZZ(LJIILIIL, LIZ, str, Boolean.valueOf(z));
        String LJIIL = ((PaymentMethod) aqS16S0500000_12.l1).LJIIL();
        if (LIZIZ == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        String LJIILIIL2 = C28112B1o.LJIILIIL(((ElementDTO) aqS16S0500000_12.l0).paramName);
        SCQ iv0 = ((CCDCDateElementViewHolder) aqS16S0500000_12.l3).getViewModel().iv0();
        iv0.getClass();
        SC6 sc6 = iv0.LIZIZ;
        Boolean bool = null;
        String str3 = null;
        bool = null;
        if (sc6 != null && sc6.LIZIZ.LIZ()) {
            Iterator it2 = it.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj2 = it2.next();
                    if (o.LJ(((PaymentElement) obj2).getElement(), "eg_ccdc_global_expiration_month")) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            PaymentElement paymentElement = (PaymentElement) obj2;
            if (paymentElement != null) {
                str2 = paymentElement.getParamValue();
            } else {
                str2 = null;
            }
            Iterator it3 = it.iterator();
            while (true) {
                if (it3.hasNext()) {
                    obj3 = it3.next();
                    if (o.LJ(((PaymentElement) obj3).getElement(), "eg_ccdc_global_expiration_year")) {
                        break;
                    }
                } else {
                    obj3 = null;
                    break;
                }
            }
            PaymentElement paymentElement2 = (PaymentElement) obj3;
            if (paymentElement2 != null) {
                str3 = paymentElement2.getParamValue();
            }
            if (o.LJ(sc6.LIZIZ.LIZ, str3) && o.LJ(sc6.LIZIZ.LIZIZ, str2)) {
                z3 = true;
            }
            bool = Boolean.valueOf(z3);
        }
        C28112B1o.LJI(bool, LJIIL, LJIILIIL2, str, z2);
        ((C71681SBh) aqS16S0500000_12.l4).LJLILLLLZI.LIZJ = LIZIZ;
        return LIZIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        if (r8 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$8(kotlin.jvm.internal.AqS16S0500000_12 r9, java.lang.Object r10) {
        /*
            java.util.List r10 = (java.util.List) r10
            java.lang.String r0 = "paymentElements"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            java.lang.Object r0 = r9.l0
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.viewholder.CCDCNormalElementViewHolder r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.viewholder.CCDCNormalElementViewHolder) r0
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel r1 = r0.getViewModel()
            java.lang.String r0 = "sub_payment_type_element"
            java.util.List r0 = r1.jv0(r0)
            r5 = 0
            java.lang.Object r0 = X.ORZ.LJLLLLLL(r5, r0)
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement) r0
            if (r0 == 0) goto L24
            java.lang.String r2 = r0.getParamValue()
            if (r2 != 0) goto L2a
        L24:
            java.lang.Object r0 = r9.l1
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod) r0
            java.lang.String r2 = r0.id
        L2a:
            java.lang.Object r0 = r9.l1
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod) r0
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod> r0 = r0.subPaymentMethods
            r4 = 0
            if (r0 == 0) goto L50
            java.util.Iterator r1 = r0.iterator()
        L37:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Le4
            java.lang.Object r8 = r1.next()
            r0 = r8
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod) r0
            java.lang.String r0 = r0.id
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r2)
            if (r0 == 0) goto L37
        L4c:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r8 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod) r8
            if (r8 != 0) goto L54
        L50:
            java.lang.Object r8 = r9.l1
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r8 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod) r8
        L54:
            java.lang.Object r0 = r9.l2
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO) r0
            java.lang.String r3 = X.SCS.LIZIZ(r0, r8, r10)
            java.lang.Object r1 = r9.l3
            X.SD5 r1 = (X.SD5) r1
            r0 = 2131368825(0x7f0a1b79, float:1.835761E38)
            android.view.View r0 = r1.LIZIZ(r0)
            X.19K r0 = (X.C19K) r0
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto Le2
            int r6 = r0.length()
        L73:
            java.lang.Object r1 = r9.l0
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.viewholder.CCDCNormalElementViewHolder r1 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.viewholder.CCDCNormalElementViewHolder) r1
            int r0 = r1.LJLJI
            int r6 = r6 - r0
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel r2 = r1.getViewModel()
            java.lang.Object r0 = r9.l4
            X.SBf r0 = (X.C71679SBf) r0
            java.lang.String r1 = r0.LJLJI
            r2.getClass()
            java.lang.String r0 = "initialInputMethod"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            if (r6 <= 0) goto Ld1
            java.lang.String r6 = "add"
        L90:
            java.lang.Object r0 = r9.l2
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO) r0
            java.lang.String r0 = r0.paramName
            java.lang.String r7 = X.C28112B1o.LJIILIIL(r0)
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.viewholder.CCDCNormalElementViewHolder> r0 = com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.viewholder.CCDCNormalElementViewHolder.class
            X.Prg r0 = X.C65352Pkq.LIZ(r0)
            java.lang.String r0 = r0.LJFF()
            long r1 = X.C28112B1o.LIZ(r0)
            if (r3 != 0) goto Lcf
            r0 = 1
        Lab:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.C28112B1o.LJIIIIZZ(r7, r1, r6, r0)
            java.lang.String r1 = r8.LJIIL()
            if (r3 != 0) goto Lb9
            r5 = 1
        Lb9:
            java.lang.Object r0 = r9.l2
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO) r0
            java.lang.String r0 = r0.paramName
            java.lang.String r0 = X.C28112B1o.LJIILIIL(r0)
            X.C28112B1o.LJI(r4, r1, r0, r6, r5)
            java.lang.Object r0 = r9.l4
            X.SBf r0 = (X.C71679SBf) r0
            X.B21 r0 = r0.LJLILLLLZI
            r0.LIZJ = r3
            return r3
        Lcf:
            r0 = 0
            goto Lab
        Ld1:
            if (r6 >= 0) goto Ld6
            java.lang.String r6 = "del"
            goto L90
        Ld6:
            java.lang.String r6 = "auto"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r6)
            if (r0 == 0) goto Ldf
            goto L90
        Ldf:
            java.lang.String r6 = ""
            goto L90
        Le2:
            r6 = 0
            goto L73
        Le4:
            r8 = r4
            goto L4c
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS16S0500000_12.invoke$8(kotlin.jvm.internal.AqS16S0500000_12, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS16S0500000_12(ActivityC45651qj activityC45651qj, ProfileAigcAvatarViewModel profileAigcAvatarViewModel, List list, C76732zl c76732zl, C76732zl c76732zl2, int i) {
        super(1);
        this.$t = i;
        this.l0 = activityC45651qj;
        this.l1 = profileAigcAvatarViewModel;
        this.l2 = c76732zl;
        this.l3 = c76732zl2;
        this.l4 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS16S0500000_12(View view, QnaHeaderAssem qnaHeaderAssem, TextView textView, TextView textView2, SmartImageView smartImageView, int i) {
        super(1);
        this.$t = i;
        this.l0 = view;
        this.l1 = qnaHeaderAssem;
        this.l2 = textView;
        this.l3 = textView2;
        this.l4 = smartImageView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS16S0500000_12(PaymentViewModel paymentViewModel, SC6 sc6, PaymentMethod paymentMethod, OcrStatus ocrStatus, OcrStatus ocrStatus2, int i) {
        super(1);
        this.$t = i;
        this.l0 = paymentViewModel;
        this.l1 = sc6;
        this.l2 = paymentMethod;
        this.l3 = ocrStatus;
        this.l4 = ocrStatus2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS16S0500000_12(CCDCNormalElementViewHolder cCDCNormalElementViewHolder, PaymentMethod paymentMethod, ElementDTO elementDTO, SD5 sd5, C71679SBf c71679SBf, int i) {
        super(1);
        this.$t = i;
        this.l0 = cCDCNormalElementViewHolder;
        this.l1 = paymentMethod;
        this.l2 = elementDTO;
        this.l3 = sd5;
        this.l4 = c71679SBf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS16S0500000_12(ElementDTO elementDTO, PaymentMethod paymentMethod, C71723SCx c71723SCx, CCDCCardNumberElementViewHolder cCDCCardNumberElementViewHolder, C71682SBi c71682SBi, int i) {
        super(1);
        this.$t = i;
        this.l0 = elementDTO;
        this.l1 = paymentMethod;
        this.l2 = c71723SCx;
        this.l3 = cCDCCardNumberElementViewHolder;
        this.l4 = c71682SBi;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS16S0500000_12(ElementDTO elementDTO, PaymentMethod paymentMethod, SD3 sd3, CCDCDateElementViewHolder cCDCDateElementViewHolder, C71681SBh c71681SBh, int i) {
        super(1);
        this.$t = i;
        this.l0 = elementDTO;
        this.l1 = paymentMethod;
        this.l2 = sd3;
        this.l3 = cCDCDateElementViewHolder;
        this.l4 = c71681SBh;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS16S0500000_12(PdpViewModel pdpViewModel, PdpViewModel pdpViewModel2, C69692RWu c69692RWu, C68322mC<ProductUnavailableInfo> c68322mC, SkuItem skuItem, C69692RWu c69692RWu2) {
        super(1);
        this.$t = c69692RWu2;
        this.l0 = pdpViewModel;
        this.l1 = pdpViewModel2;
        this.l2 = c69692RWu;
        this.l3 = c68322mC;
        this.l4 = skuItem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS16S0500000_12(DefaultFeedEcCardBizView defaultFeedEcCardBizView, Aweme aweme, FeedEcCardData feedEcCardData, FeedEcCardConfig feedEcCardConfig, FeedEcCardStyle feedEcCardStyle, int i) {
        super(1);
        this.$t = i;
        this.l0 = defaultFeedEcCardBizView;
        this.l1 = aweme;
        this.l2 = feedEcCardData;
        this.l3 = feedEcCardConfig;
        this.l4 = feedEcCardStyle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS16S0500000_12(C73165SnZ c73165SnZ, JediViewModel jediViewModel, LifecycleOwner lifecycleOwner, TBW tbw, InterfaceC65784Pro interfaceC65784Pro, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2, int i) {
        super(1);
        this.$t = i;
        this.l0 = lifecycleOwner;
        this.l1 = tbw;
        this.l2 = interfaceC65784Pro;
        this.l3 = interfaceC88472Yns;
        this.l4 = interfaceC88472Yns2;
    }
}
