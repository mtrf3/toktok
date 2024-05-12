package com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C20010qT;
import X.C223338pd;
import X.C29S;
import X.C31627Cb9;
import X.C3C5;
import X.C47261Igj;
import X.C76800UCe;
import X.C86393XvR;
import X.C90903hW;
import X.InterfaceC32051Chz;
import X.ORZ;
import X.SY4;
import X.X1Y;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.iap.model.response.iap.IapProductDetail;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.OfferInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.PickYourAdPlanPage;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.ProductInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.personalization.PersonalizationViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class SubscriptionPage extends Fragment {
    public static final List<String> LLIIIJ = C47261Igj.LJJIJIIJI("com.tiktok.iap.ttmonetization.499", "com.tiktok.iap.ttmonetization.799", "com.musically.iap.ttmonetization.499", "com.musically.iap.ttmonetization.799");
    public static InterfaceC32051Chz LLIIIL;
    public PickYourAdPlanPage LJLIL;
    public Integer LJLILLLLZI;
    public Context LJLJI;
    public OfferInfo LJLJJL;
    public OfferInfo LJLJJLL;
    public String LJLJL;
    public SubscriptionVM LJLJLJ;
    public PersonalizationViewModel LJLJLLL;
    public TuxTextView LJLL;
    public TuxTextView LJLLI;
    public ConstraintLayout LJLLILLLL;
    public TuxTextView LJLLJ;
    public TuxTextView LJLLL;
    public TuxTextView LJLLLL;
    public TuxTextView LJLLLLLL;
    public ConstraintLayout LJLZ;
    public TuxTextView LJZ;
    public TuxTextView LJZI;
    public TuxTextView LJZL;
    public TuxTextView LL;
    public TuxTextView LLD;
    public TuxTextView LLF;
    public SY4 LLFF;
    public TuxTextView LLFFF;
    public TuxTextView LLFII;
    public TuxTextView LLFZ;
    public C223338pd LLI;
    public X1Y LLIFFJFJJ;
    public long LLIIII;
    public final Map<Integer, View> LLIIIILZ = new LinkedHashMap();
    public final MutableLiveData<Integer> LJLJJI = new MutableLiveData<>();
    public final MutableLiveData<IapProductDetail> LLII = new MutableLiveData<>();

    public final void LJIJ() {
        C223338pd c223338pd = this.LLI;
        if (c223338pd != null) {
            c223338pd.setVisibility(0);
        }
        C223338pd c223338pd2 = this.LLI;
        if (c223338pd2 != null) {
            c223338pd2.LIZJ();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LLIIIILZ).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        ProductInfo productInfo;
        ProductInfo productInfo2;
        List<OfferInfo> offerInfo;
        OfferInfo offerInfo2;
        String str2;
        ProductInfo productInfo3;
        List<OfferInfo> offerInfo3;
        List<OfferInfo> offerInfo4;
        OfferInfo offerInfo5;
        List<OfferInfo> offerInfo6;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String str3 = null;
        if (arguments != null) {
            this.LJLIL = (PickYourAdPlanPage) arguments.getParcelable("page_data");
            this.LJLILLLLZI = Integer.valueOf(arguments.getInt("enter_from"));
            PickYourAdPlanPage pickYourAdPlanPage = this.LJLIL;
            if (pickYourAdPlanPage != null && (offerInfo4 = pickYourAdPlanPage.getOfferInfo()) != null && ORZ.LJLLLLLL(0, offerInfo4) != null) {
                PickYourAdPlanPage pickYourAdPlanPage2 = this.LJLIL;
                if (pickYourAdPlanPage2 != null && (offerInfo6 = pickYourAdPlanPage2.getOfferInfo()) != null) {
                    offerInfo5 = (OfferInfo) ORZ.LJLLLLLL(0, offerInfo6);
                } else {
                    offerInfo5 = null;
                }
                this.LJLJJL = offerInfo5;
            }
            PickYourAdPlanPage pickYourAdPlanPage3 = this.LJLIL;
            if (pickYourAdPlanPage3 != null && (offerInfo = pickYourAdPlanPage3.getOfferInfo()) != null && ORZ.LJLLLLLL(1, offerInfo) != null) {
                PickYourAdPlanPage pickYourAdPlanPage4 = this.LJLIL;
                if (pickYourAdPlanPage4 != null && (offerInfo3 = pickYourAdPlanPage4.getOfferInfo()) != null) {
                    offerInfo2 = (OfferInfo) ORZ.LJLLLLLL(1, offerInfo3);
                } else {
                    offerInfo2 = null;
                }
                this.LJLJJLL = offerInfo2;
                if (offerInfo2 != null && (productInfo3 = offerInfo2.getProductInfo()) != null) {
                    str2 = productInfo3.getProductId();
                } else {
                    str2 = null;
                }
                this.LJLJL = str2;
            }
        }
        this.LLIFFJFJJ = LiveOuterService.LJJJLL().LJJIJIL();
        OfferInfo offerInfo7 = this.LJLJJLL;
        if (offerInfo7 != null && (productInfo2 = offerInfo7.getProductInfo()) != null) {
            str = productInfo2.getMerchantId();
        } else {
            str = null;
        }
        OfferInfo offerInfo8 = this.LJLJJLL;
        if (offerInfo8 != null && (productInfo = offerInfo8.getProductInfo()) != null) {
            str3 = productInfo.getProductId();
        }
        if (str != null && str3 != null) {
            C20010qT c20010qT = new C20010qT(str, C47261Igj.LJJIJ(str3), "subs");
            X1Y x1y = this.LLIFFJFJJ;
            if (x1y != null) {
                ((C86393XvR) x1y).LJLJI(c20010qT, new C31627Cb9(this, str3));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:233:0x04b5, code lost:
    
        if (r2 == null) goto L192;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r14v1, types: [com.ss.android.ugc.aweme.compliance.api.model.TermsConsentInfo] */
    /* JADX WARN: Type inference failed for: r15v2, types: [com.ss.android.ugc.aweme.compliance.api.model.TermsConsentInfo] */
    /* JADX WARN: Type inference failed for: r16v5, types: [java.util.List, java.lang.Long, kotlin.jvm.internal.DefaultConstructorMarker, com.ss.android.ugc.aweme.compliance.api.model.AgeGateInfo, com.ss.android.ugc.aweme.compliance.api.model.LegalEntityChangeInfo, com.ss.android.ugc.aweme.feed.model.LogPbBean, java.lang.Boolean, java.lang.String, com.ss.android.ugc.aweme.compliance.api.model.PreferenceSettings] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Integer] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r45, android.os.Bundle r46) {
        /*
            Method dump skipped, instructions count: 1736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.SubscriptionPage.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.ahv, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }
}
