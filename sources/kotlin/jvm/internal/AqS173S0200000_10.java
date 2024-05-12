package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C16880lQ;
import X.C34K;
import X.C58655N0h;
import X.C58704N2e;
import X.C59091NHb;
import X.C59614NaU;
import X.C60327Nlz;
import X.C60334Nm6;
import X.C61595OFj;
import X.C68322mC;
import X.C76800UCe;
import X.C89542ZCg;
import X.EnumC57435MgR;
import X.InterfaceC60949Nw1;
import X.InterfaceC88471Ynr;
import X.NAE;
import X.NAU;
import X.OM7;
import X.ORZ;
import X.Q89;
import android.animation.ValueAnimator;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.ies.ugc.aweme.commercialize.search.core.SearchAdServiceImpl;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.base.ui.bottom.banner.FeedBottomBannerView;
import com.ss.android.ugc.aweme.compliance.business.banappeal.popup.model.PopButton;
import com.ss.android.ugc.aweme.compliance.business.banappeal.popup.viewmodel.AppealDialogViewModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public class AqS173S0200000_10 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88471Ynr
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            default:
                return null;
        }
    }

    public final void invoke$0(View v, C59091NHb info) {
        o.LJIIIZ(v, "v");
        o.LJIIIZ(info, "info");
        ((FeedBottomBannerView) this.l0).getDefaultAnimationDisappear().cancel();
        C16880lQ.LJLJL(((FeedBottomBannerView) this.l0).getDefaultAnimationDisappear());
        ValueAnimator invoke$lambda$1 = ((FeedBottomBannerView) this.l0).getDefaultAnimationDisappear();
        OM7 om7 = (OM7) this.l1;
        FeedBottomBannerView feedBottomBannerView = (FeedBottomBannerView) this.l0;
        o.LJIIIIZZ(invoke$lambda$1, "invoke$lambda$1");
        invoke$lambda$1.addListener(new C61595OFj(om7, info, v, feedBottomBannerView));
        invoke$lambda$1.start();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS173S0200000_10(C34K c34k, StringBuilder sb, int i) {
        super(2);
        this.$t = i;
        this.l0 = c34k;
        this.l1 = sb;
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AqS173S0200000_10 aqS173S0200000_10, Object obj, Object obj2) {
        aqS173S0200000_10.invoke$0((View) obj, (C59091NHb) obj2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS173S0200000_10 aqS173S0200000_10, Object obj, Object obj2) {
        DialogInterface dialog = (DialogInterface) obj;
        ((Number) obj2).intValue();
        o.LJIIIZ(dialog, "dialog");
        ((AppealDialogViewModel) aqS173S0200000_10.l0).hv0(((PopButton) aqS173S0200000_10.l1).getBtnType(), ((PopButton) aqS173S0200000_10.l1).getBtnUrl(), "button", dialog);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS173S0200000_10 aqS173S0200000_10, Object obj, Object targetType) {
        o.LJIIIZ(obj, "<anonymous parameter 0>");
        o.LJIIIZ(targetType, "targetType");
        if (targetType == EnumC57435MgR.FOLLOWED) {
            ((SearchAdServiceImpl) aqS173S0200000_10.l0).LL(true);
            SearchAdServiceImpl searchAdServiceImpl = (SearchAdServiceImpl) aqS173S0200000_10.l0;
            AwemeRawAd awemeRawAd = (AwemeRawAd) aqS173S0200000_10.l1;
            searchAdServiceImpl.getClass();
            C58655N0h LIZLLL = C58704N2e.LIZLLL("result_ad", "follow", awemeRawAd);
            LIZLLL.LIZIZ(1, "is_ci");
            LIZLLL.LIZJ("button", "refer");
            LIZLLL.LJI();
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, android.net.Uri, java.lang.Object] */
    public static final Object invoke$3(AqS173S0200000_10 aqS173S0200000_10, Object obj, Object obj2) {
        String str = (String) obj;
        Map map = (Map) obj2;
        C68322mC c68322mC = (C68322mC) aqS173S0200000_10.l1;
        ?? parse = UriProtector.parse(str);
        o.LJFF(parse, "Uri.parse(finalUrl)");
        c68322mC.element = parse;
        if (map == null || map.isEmpty()) {
            C59614NaU c59614NaU = (C59614NaU) aqS173S0200000_10.l0;
            c59614NaU.getClass();
            C60334Nm6 c60334Nm6 = C60327Nlz.LIZ;
            c60334Nm6.get().LIZ.push(new C89542ZCg[0]);
            c59614NaU.loadUrl(str);
            c60334Nm6.get().LIZ.pop();
        } else {
            C59614NaU c59614NaU2 = (C59614NaU) aqS173S0200000_10.l0;
            c59614NaU2.getClass();
            C60334Nm6 c60334Nm62 = C60327Nlz.LIZ;
            c60334Nm62.get().LIZ.push(new C89542ZCg[0]);
            c59614NaU2.loadUrl(str, map);
            c60334Nm62.get().LIZ.pop();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS173S0200000_10 aqS173S0200000_10, Object obj, Object obj2) {
        String str;
        String headerKey = (String) obj;
        Map map = (Map) obj2;
        o.LJIIJ(headerKey, "headerKey");
        if (map == null || (str = (String) map.get(headerKey)) == null) {
            str = "";
        }
        if (!((C34K) aqS173S0200000_10.l0).element) {
            ((StringBuilder) aqS173S0200000_10.l1).append(",");
        }
        Q89.LIZIZ((StringBuilder) aqS173S0200000_10.l1, headerKey, ':', str);
        ((C34K) aqS173S0200000_10.l0).element = false;
        return str;
    }

    public static final Object invoke$5(AqS173S0200000_10 aqS173S0200000_10, Object obj, Object obj2) {
        InterfaceC60949Nw1 receiver = (InterfaceC60949Nw1) obj;
        SparkPopup popup = (SparkPopup) obj2;
        o.LJIIJ(receiver, "$receiver");
        o.LJIIJ(popup, "popup");
        receiver.LJII(popup, (View) aqS173S0200000_10.l0, (Bundle) aqS173S0200000_10.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS173S0200000_10 aqS173S0200000_10, Object obj, Object obj2) {
        InterfaceC60949Nw1 receiver = (InterfaceC60949Nw1) obj;
        SparkPopup popup = (SparkPopup) obj2;
        o.LJIIJ(receiver, "$receiver");
        o.LJIIJ(popup, "popup");
        receiver.LJIILIIL(popup, (View) aqS173S0200000_10.l0, (Bundle) aqS173S0200000_10.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS173S0200000_10 aqS173S0200000_10, Object obj, Object obj2) {
        MusicModel musicModel;
        int intValue = ((Number) obj).intValue();
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        List list = (List) ((NAE) aqS173S0200000_10.l0).LJFF.getValue();
        if (list != null && (musicModel = (MusicModel) ORZ.LJLLLLLL(intValue, list)) != null && booleanValue) {
            RecyclerView recyclerView = (RecyclerView) aqS173S0200000_10.l1;
            o.LJIIIIZZ(recyclerView, "this");
            new NAU(recyclerView, musicModel, intValue, false).LIZLLL((LifecycleOwner) ((NAE) aqS173S0200000_10.l0).LIZLLL.LIZ(NAE.LJI[2]));
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS173S0200000_10(NAE nae, RecyclerView recyclerView, int i) {
        super(2);
        this.$t = i;
        this.l0 = nae;
        this.l1 = recyclerView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS173S0200000_10(C59614NaU c59614NaU, C68322mC c68322mC, int i) {
        super(2);
        this.$t = i;
        this.l0 = c59614NaU;
        this.l1 = c68322mC;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS173S0200000_10(View view, Bundle bundle, int i) {
        super(2);
        this.$t = i;
        this.l0 = view;
        this.l1 = bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS173S0200000_10(SearchAdServiceImpl searchAdServiceImpl, AwemeRawAd awemeRawAd, int i) {
        super(2);
        this.$t = i;
        this.l0 = searchAdServiceImpl;
        this.l1 = awemeRawAd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS173S0200000_10(FeedBottomBannerView feedBottomBannerView, OM7 om7, int i) {
        super(2);
        this.$t = i;
        this.l0 = feedBottomBannerView;
        this.l1 = om7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS173S0200000_10(AppealDialogViewModel appealDialogViewModel, PopButton popButton, int i) {
        super(2);
        this.$t = i;
        this.l0 = appealDialogViewModel;
        this.l1 = popButton;
    }
}
