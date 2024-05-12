package Y;

import X.A3W;
import X.A6J;
import X.A6K;
import X.AQB;
import X.ASQ;
import X.ASX;
import X.AnonymousClass636;
import X.C188727au;
import X.C198537qj;
import X.C1DJ;
import X.C243939hl;
import X.C25638A4k;
import X.C25639A4l;
import X.C26758Aeo;
import X.C26759Aep;
import X.C27739Aud;
import X.C32I;
import X.FMX;
import X.InterfaceC25640A4m;
import X.InterfaceC36571c5;
import X.InterfaceC64592gB;
import X.ORZ;
import X.V1B;
import X.X1D;
import android.app.Dialog;
import com.bytedance.android.live.wallet.model.BaseIapProductResult;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.auth.MusicAuthorizationActivity;
import com.ss.android.ugc.aweme.auth.MusicAuthorizationApi;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.api.model.InputBoxHintContent;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.event.ZipcodeLocateAddress;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.SearchDistrictsData;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.model.CreatorCollectionDetailResponse;
import com.ss.android.ugc.aweme.model.PaidCollectionRefundResponse;
import com.ss.android.ugc.aweme.music.highlight.HighlightSelectListViewModel;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.paidcontent.fragments.PaidContentRefundFragment;
import com.ss.android.ugc.aweme.paidcontent.viewmodel.SeriesPostViewModel;
import com.ss.android.ugc.aweme.service.PaidContentPaymentServiceImpl;
import defpackage.b1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS29S1000000_4;
import kotlin.jvm.internal.AqS58S1100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class AfS19S1100000_4 implements InterfaceC64592gB {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            case 4:
                accept$4(this, obj);
                return;
            case 5:
                accept$5(this, obj);
                return;
            case 6:
                accept$6(this, obj);
                return;
            case 7:
                accept$7(this, obj);
                return;
            case 8:
                accept$8(this, obj);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(AfS19S1100000_4 afS19S1100000_4, Object obj) {
        List<District> list;
        District district;
        ExceptionUX exceptionUX;
        List<InputBoxHintContent> inputBoxHintContentList;
        InputBoxHintContent inputBoxHintContent;
        String hintMessage;
        Integer inputBoxHintType;
        Response response = (Response) obj;
        SearchDistrictsData searchDistrictsData = (SearchDistrictsData) response.data;
        if (searchDistrictsData != null && (exceptionUX = searchDistrictsData.exceptionUX) != null && (inputBoxHintContentList = exceptionUX.getInputBoxHintContentList()) != null) {
            Iterator<InputBoxHintContent> it = inputBoxHintContentList.iterator();
            while (true) {
                if (it.hasNext()) {
                    inputBoxHintContent = it.next();
                    InputBoxHintContent inputBoxHintContent2 = inputBoxHintContent;
                    if (o.LJ(inputBoxHintContent2.getInputBoxKey(), "zipcode") && (inputBoxHintType = inputBoxHintContent2.getInputBoxHintType()) != null && inputBoxHintType.intValue() == 2) {
                        break;
                    }
                } else {
                    inputBoxHintContent = null;
                    break;
                }
            }
            InputBoxHintContent inputBoxHintContent3 = inputBoxHintContent;
            if (inputBoxHintContent3 != null && (hintMessage = inputBoxHintContent3.getHintMessage()) != null) {
                ((AddressSelectViewModel) afS19S1100000_4.l1).getClass();
                AddressSelectViewModel.Kv0(hintMessage, false);
                return;
            }
        }
        if (response.isCodeOK() && searchDistrictsData != null && (list = searchDistrictsData.districts) != null && (district = (District) ORZ.LJLLLL(list)) != null) {
            AddressSelectViewModel addressSelectViewModel = (AddressSelectViewModel) afS19S1100000_4.l1;
            String str = afS19S1100000_4.s0;
            ArrayList arrayList = new ArrayList();
            List<District> list2 = district.parRegions;
            if (list2 != null) {
                ArrayList arrayList2 = new ArrayList(C32I.LJJL(list2, 10));
                for (District district2 : list2) {
                    arrayList2.add(new Region(district2.name, district2.geoNameId, district2.code, district2.districtKey, null, null, 48, null));
                }
                arrayList.addAll(arrayList2);
            }
            arrayList.add(new Region(district.name, district.geoNameId, district.code, district.districtKey, null, null, 48, null));
            addressSelectViewModel.getClass();
            EventCenter.LJ().LIZ("ec_zipcode_locate_address", C27739Aud.LJI(new ZipcodeLocateAddress(1, null, arrayList, str, null)));
        }
    }

    public static final void accept$1(AfS19S1100000_4 afS19S1100000_4, Object obj) {
        ((SeriesPostViewModel) afS19S1100000_4.l1).setState(new AqS58S1100000_4((CreatorCollectionDetailResponse) obj, afS19S1100000_4.s0, 22));
    }

    public static final void accept$2(AfS19S1100000_4 afS19S1100000_4, Object obj) {
        AQB aqb = (AQB) afS19S1100000_4.l1;
        String str = afS19S1100000_4.s0;
        aqb.getClass();
        AQB.LJIIIZ(1, str);
        AQB aqb2 = (AQB) afS19S1100000_4.l1;
        int i = ((BaseResponse) obj).status_code;
        aqb2.getClass();
        AQB.LJIIIIZZ(1, 1, i);
    }

    public static final void accept$3(AfS19S1100000_4 afS19S1100000_4, Object obj) {
        PaidCollectionRefundResponse response = (PaidCollectionRefundResponse) obj;
        o.LJIIIZ(response, "response");
        PaidContentRefundFragment paidContentRefundFragment = (PaidContentRefundFragment) afS19S1100000_4.l1;
        String str = afS19S1100000_4.s0;
        Dialog dialog = paidContentRefundFragment.LJLJJLL;
        if (dialog != null) {
            V1B.LJLILLLLZI(dialog);
        }
        paidContentRefundFragment.xl(paidContentRefundFragment.vl(str), true);
        ASQ.LJ(paidContentRefundFragment, ASX.LIZ);
        AssemViewModel assemViewModel = (AssemViewModel) paidContentRefundFragment.LJLILLLLZI.getValue();
        String price = response.webPurchasePrice;
        o.LJIIIZ(price, "price");
        assemViewModel.setState(new AqS29S1000000_4(price, 24));
        if (paidContentRefundFragment.mo49getActivity() instanceof InterfaceC25640A4m) {
            InterfaceC36571c5 mo49getActivity = paidContentRefundFragment.mo49getActivity();
            o.LJII(mo49getActivity, "null cannot be cast to non-null type com.ss.android.ugc.aweme.paidcontent.fragments.PaidContentRefundFragment.RefundListener");
            ((InterfaceC25640A4m) mo49getActivity).LIZIZ();
            return;
        }
        ((AssemViewModel) paidContentRefundFragment.LJLILLLLZI.getValue()).setState(C25639A4l.LJLIL);
    }

    public static final void accept$4(AfS19S1100000_4 afS19S1100000_4, Object error) {
        o.LJIIIZ(error, "error");
        PaidContentRefundFragment paidContentRefundFragment = (PaidContentRefundFragment) afS19S1100000_4.l1;
        String str = afS19S1100000_4.s0;
        Dialog dialog = paidContentRefundFragment.LJLJJLL;
        if (dialog != null) {
            V1B.LJLILLLLZI(dialog);
        }
        paidContentRefundFragment.xl(paidContentRefundFragment.vl(str), false);
        ASQ.LIZ(paidContentRefundFragment, ASX.LIZ);
        if (paidContentRefundFragment.mo49getActivity() instanceof InterfaceC25640A4m) {
            InterfaceC36571c5 mo49getActivity = paidContentRefundFragment.mo49getActivity();
            o.LJII(mo49getActivity, "null cannot be cast to non-null type com.ss.android.ugc.aweme.paidcontent.fragments.PaidContentRefundFragment.RefundListener");
            ((InterfaceC25640A4m) mo49getActivity).LIZ();
            return;
        }
        ((AssemViewModel) paidContentRefundFragment.LJLILLLLZI.getValue()).setState(C25638A4k.LJLIL);
    }

    public static final void accept$5(AfS19S1100000_4 afS19S1100000_4, Object obj) {
        BaseIapProductResult baseIapProductResult = (BaseIapProductResult) obj;
        if (baseIapProductResult.code == 1) {
            ((PaidContentPaymentServiceImpl) afS19S1100000_4.l1).LIZLLL.onNext(new A3W(afS19S1100000_4.s0));
        } else {
            ((PaidContentPaymentServiceImpl) afS19S1100000_4.l1).LIZLLL.onNext(new A6J(new A6K(baseIapProductResult.errorCode)));
        }
    }

    public static final void accept$6(AfS19S1100000_4 afS19S1100000_4, Object obj) {
        String str;
        Music music;
        List<? extends Music> list = ((HighlightSelectListViewModel) afS19S1100000_4.l1).LJLJI;
        String str2 = afS19S1100000_4.s0;
        Iterator<? extends Music> it = list.iterator();
        while (true) {
            str = null;
            if (it.hasNext()) {
                music = it.next();
                if (o.LJ(music.getIdStr(), str2)) {
                    break;
                }
            } else {
                music = null;
                break;
            }
        }
        ((HighlightSelectListViewModel) afS19S1100000_4.l1).setState(new AqS135S0200000_4(music, C1DJ.LJIIJJI(afS19S1100000_4.s0, ((HighlightSelectListViewModel) afS19S1100000_4.l1).LJLJJI), 284));
        HighlightSelectListViewModel highlightSelectListViewModel = (HighlightSelectListViewModel) afS19S1100000_4.l1;
        String str3 = afS19S1100000_4.s0;
        C198537qj c198537qj = (C198537qj) highlightSelectListViewModel.LJLJJL.getValue();
        if (c198537qj != null) {
            str = c198537qj.LJLIL;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("music_id", str3);
        c188727au.LJIIIZ("shoot_from", str);
        FMX.LJIIL("highlight_song_done", c188727au.LIZ);
    }

    public static final void accept$7(AfS19S1100000_4 afS19S1100000_4, Object obj) {
        String str;
        MusicAuthorizationActivity musicAuthorizationActivity = (MusicAuthorizationActivity) afS19S1100000_4.l1;
        String str2 = afS19S1100000_4.s0;
        String openid = ((MusicAuthorizationApi.AuthResponse) obj).getOpenid();
        if (!musicAuthorizationActivity.isFinishing() && !musicAuthorizationActivity.isDestroyed() && str2.length() != 0 && openid.length() != 0) {
            if (ujb.o.LJJJLIIL(str2, "aweme://lynxview", false)) {
                if (AnonymousClass636.LJIILJJIL(musicAuthorizationActivity)) {
                    str = "dark";
                } else {
                    str = "light";
                }
                StringBuilder LIZJ = b1.LIZJ(str2, "&open_timestamp=");
                LIZJ.append(System.currentTimeMillis());
                LIZJ.append("&status_font_mode=");
                LIZJ.append(str);
                LIZJ.append("&playlist_author_openid=");
                LIZJ.append(openid);
                str2 = X1D.LIZIZ(LIZJ);
            }
            SmartRouter.buildRoute(musicAuthorizationActivity, str2).open();
            C243939hl.LIZIZ(openid);
        }
        String LIZ = C243939hl.LIZ("music_resso_%s");
        if (LIZ.length() != 0) {
            C243939hl.LIZ.storeBoolean(LIZ, true);
        }
        ((MusicAuthorizationActivity) afS19S1100000_4.l1).finish();
    }

    public static final void accept$8(AfS19S1100000_4 afS19S1100000_4, Object obj) {
        if (!((Response) obj).isCodeOK()) {
            ((AddressListViewModel) afS19S1100000_4.l1).setState(C26758Aeo.LJLIL);
        } else {
            EventCenter.LJ().LIZ("ec_address_change", C27739Aud.LJI(new AddressPageStarter.AddressEvent(afS19S1100000_4.s0, 2, null, 4, null)));
            ((AddressListViewModel) afS19S1100000_4.l1).setState(C26759Aep.LJLIL);
        }
    }

    public AfS19S1100000_4(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
