package Y;

import X.A15;
import X.A3W;
import X.A3X;
import X.A4Y;
import X.A6I;
import X.A6J;
import X.A6L;
import X.A6Q;
import X.A6R;
import X.A6S;
import X.AQB;
import X.ARI;
import X.ActivityC45651qj;
import X.C188727au;
import X.C223338pd;
import X.C240009bQ;
import X.C240149be;
import X.C240159bf;
import X.C240189bi;
import X.C240639cR;
import X.C240719cZ;
import X.C248559pD;
import X.C248629pK;
import X.C254739zB;
import X.C25589A2n;
import X.C25598A2w;
import X.C26045AKb;
import X.C26059AKp;
import X.C26227ARb;
import X.C27233AmT;
import X.C27234AmU;
import X.C27736Aua;
import X.C27739Aud;
import X.C34K;
import X.C40328FsC;
import X.C48841JEv;
import X.C54082LKk;
import X.C64797Pbt;
import X.C68322mC;
import X.C68922R3e;
import X.C73365Sqn;
import X.C73893SzJ;
import X.C78613UtF;
import X.C78983UzD;
import X.C9XA;
import X.C9XC;
import X.DialogC254019y1;
import X.EnumC248719pT;
import X.FMX;
import X.HG3;
import X.IV8;
import X.InterfaceC62969OnV;
import X.InterfaceC64592gB;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.ON8;
import X.ONJ;
import X.OP4;
import X.OSZ;
import X.RBX;
import X.SY4;
import X.TD3;
import X.X1D;
import X.XKX;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.account.popup.SyncNicknameAndUsernamePopTask;
import com.ss.android.ugc.aweme.account.popup.popuphelper.SyncNicknameAndUsernamePopUpHelper;
import com.ss.android.ugc.aweme.compliance.business.filtervideo.model.FilterKeywordResp;
import com.ss.android.ugc.aweme.compliance.business.filtervideo.model.FilteredKeywordsModel;
import com.ss.android.ugc.aweme.detail.panel.PaidContentVideoPanel;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.CouponClaimSuccessEvent;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.DeliveryData;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Balance;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BalanceResponseData;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import com.ss.android.ugc.aweme.feed.prompt.api.PromptTransformResp;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.CreatorCollectionDetailResponse;
import com.ss.android.ugc.aweme.model.Price;
import com.ss.android.ugc.aweme.model.VoucherStatus;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.PinnedMusicList;
import com.ss.android.ugc.aweme.music.search.SearchMusicListViewModel;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import com.ss.android.ugc.aweme.paidcontent.assem.PaidContentCollectionDetailDescriptionAssem;
import com.ss.android.ugc.aweme.paidcontent.fragments.RatingFragment;
import com.ss.android.ugc.aweme.paidcontent.manageseries.viewmodel.ManageSeriesViewModel;
import com.ss.android.ugc.aweme.paidcontent.seriescreation.viewmodel.SeriesDraftViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.ProfileEditFragment;
import com.ss.android.ugc.aweme.profile.widgets.navbar.entrances.mine.MineNavBarSettingAssem;
import com.ss.android.ugc.aweme.profile.widgets.signature.ProfileSignatureTranslationViewModel;
import com.ss.android.ugc.aweme.service.PaidContentPaymentServiceImpl;
import com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity;
import com.ss.android.ugc.aweme.setting.model.DoBStatus;
import com.ss.android.ugc.aweme.setting.ui.beta.BetaEmailRegisterPage;
import com.ss.android.ugc.aweme.setting.ui.vm.VideoAuthorizationViewModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.signature.base.BioTranslationViewModel;
import com.ss.android.ugc.profile.platform.business.navbar.business.NavBarSettingComponent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS108S0300000_4;
import kotlin.jvm.internal.AqS12S0500000_4;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS29S0001000_4;
import kotlin.jvm.internal.AqS47S1200000_4;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import yq4.a;

/* loaded from: classes5.dex */
public class AfS53S0200000_4 implements InterfaceC64592gB {
    public final int $t;
    public Object l0;
    public Object l1;

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
            case 9:
                accept$9(this, obj);
                return;
            case 10:
                accept$10(this, obj);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                accept$11(this, obj);
                return;
            case 12:
                accept$12(this, obj);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                accept$13(this, obj);
                return;
            case 14:
                accept$14(this, obj);
                return;
            case 15:
                accept$15(this, obj);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                accept$16(this, obj);
                return;
            case 17:
                accept$17(this, obj);
                return;
            case 18:
                accept$18(this, obj);
                return;
            case 19:
                accept$19(this, obj);
                return;
            case 20:
                accept$20(this, obj);
                return;
            case 21:
                accept$21(this, obj);
                return;
            case 22:
                accept$22(this, obj);
                return;
            case 23:
                accept$23(this, obj);
                return;
            case 24:
                accept$24(this, obj);
                return;
            case 25:
                accept$25(this, obj);
                return;
            case 26:
                accept$26(this, obj);
                return;
            case 27:
                accept$27(this, obj);
                return;
            case 28:
                accept$28(this, obj);
                return;
            case 29:
                accept$29(this, obj);
                return;
            case 30:
                accept$30(this, obj);
                return;
            case 31:
                accept$31(this, obj);
                return;
            case 32:
                accept$32(this, obj);
                return;
            case 33:
                accept$33(this, obj);
                return;
            case 34:
                accept$34(this, obj);
                return;
            case 35:
                accept$35(this, obj);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.util.ArrayList] */
    public static final void accept$0(AfS53S0200000_4 afS53S0200000_4, Object obj) {
        List<Balance> list;
        BalanceResponseData balanceResponseData = (BalanceResponseData) ((Response) obj).data;
        if (balanceResponseData != null) {
            list = balanceResponseData.getBalances();
        } else {
            list = null;
        }
        C34K c34k = new C34K();
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = new ArrayList();
        PaymentViewModel paymentViewModel = (PaymentViewModel) afS53S0200000_4.l0;
        paymentViewModel.withState(new AqS12S0500000_4((List) list, (List<Balance>) c34k, (C34K) c68322mC, (C68322mC<List<Object>>) paymentViewModel, (PaymentViewModel) afS53S0200000_4.l1, (EnterParams) 0));
    }

    public static final void accept$1(AfS53S0200000_4 afS53S0200000_4, Object obj) {
        C68922R3e c68922R3e = (C68922R3e) obj;
        try {
            SyncNicknameAndUsernamePopTask syncNicknameAndUsernamePopTask = (SyncNicknameAndUsernamePopTask) afS53S0200000_4.l0;
            String string = JSONObjectProtectorUtils.getString(c68922R3e.LJIILJJIL, "login_name");
            o.LJIIIIZZ(string, "response.data.getString(…                        )");
            syncNicknameAndUsernamePopTask.updateUsernameOnProfilePage(string);
            SyncNicknameAndUsernamePopUpHelper.LJ().LIZ();
            SyncNicknameAndUsernamePopTask.showSuccessToast$default((SyncNicknameAndUsernamePopTask) afS53S0200000_4.l0, (ActivityC45651qj) afS53S0200000_4.l1, false, 2, null);
        } catch (JSONException unused) {
        }
    }

    public static final void accept$10(AfS53S0200000_4 afS53S0200000_4, Object obj) {
        ((ProfileEditFragment) afS53S0200000_4.l0).Al(false);
        SmartRoute smartRoute = (SmartRoute) afS53S0200000_4.l1;
        smartRoute.withParam("dob_status", (DoBStatus) obj);
        smartRoute.open();
    }

    public static final void accept$11(AfS53S0200000_4 afS53S0200000_4, Object obj) {
        ((ProfileEditFragment) afS53S0200000_4.l0).Al(false);
        ((SmartRoute) afS53S0200000_4.l1).open();
    }

    public static final void accept$12(AfS53S0200000_4 afS53S0200000_4, Object obj) {
        SmartRoute smartRoute = (SmartRoute) afS53S0200000_4.l0;
        smartRoute.withParam("dob_status", (DoBStatus) obj);
        smartRoute.open();
        DialogC254019y1 dialogC254019y1 = (DialogC254019y1) afS53S0200000_4.l1;
        if (dialogC254019y1 != null) {
            dialogC254019y1.dismiss();
        }
    }

    public static final void accept$13(AfS53S0200000_4 afS53S0200000_4, Object obj) {
        ((SmartRoute) afS53S0200000_4.l0).open();
        DialogC254019y1 dialogC254019y1 = (DialogC254019y1) afS53S0200000_4.l1;
        if (dialogC254019y1 != null) {
            dialogC254019y1.dismiss();
        }
    }

    public static final void accept$14(AfS53S0200000_4 afS53S0200000_4, Object obj) {
        String str;
        ((C223338pd) afS53S0200000_4.l0).LIZJ();
        ((BetaEmailRegisterPage) afS53S0200000_4.l1).vl();
        SmartRoute buildRoute = SmartRouter.buildRoute((BetaEmailRegisterPage) afS53S0200000_4.l1, "aweme://webview");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("https://play.google.com/apps/testing/");
        Context context = ((BetaEmailRegisterPage) afS53S0200000_4.l1).getContext();
        if (context != null) {
            str = context.getPackageName();
        } else {
            str = null;
        }
        LIZ.append(str);
        buildRoute.withParam(UriProtector.parse(X1D.LIZIZ(LIZ)));
        buildRoute.open();
    }

    public static final void accept$15(AfS53S0200000_4 afS53S0200000_4, Object obj) {
        Drawable drawable;
        Drawable drawable2;
        GradientDrawable gradientDrawable;
        String str;
        String str2;
        TuxTextView tuxTextView;
        GradientDrawable gradientDrawable2;
        C25598A2w c25598A2w = (C25598A2w) ((OSZ) obj).getFirst();
        int i = c25598A2w.LJLIL;
        int i2 = c25598A2w.LJLILLLLZI;
        ConstraintLayout constraintLayout = ((PaidContentCollectionDetailDescriptionAssem) afS53S0200000_4.l0).LLD;
        String str3 = null;
        if (constraintLayout != null) {
            drawable = constraintLayout.getBackground();
        } else {
            drawable = null;
        }
        if ((drawable instanceof GradientDrawable) && (gradientDrawable2 = (GradientDrawable) drawable) != null) {
            gradientDrawable2.setColor(i);
        }
        TuxTextView tuxTextView2 = ((PaidContentCollectionDetailDescriptionAssem) afS53S0200000_4.l0).LLF;
        if (tuxTextView2 != null) {
            tuxTextView2.setVisibility(0);
        }
        if (((CollectionDetailModel) afS53S0200000_4.l1).getVoucherStatus() == VoucherStatus.CLAIMED) {
            ((PaidContentCollectionDetailDescriptionAssem) afS53S0200000_4.l0).M3();
        } else {
            TuxTextView tuxTextView3 = ((PaidContentCollectionDetailDescriptionAssem) afS53S0200000_4.l0).LLF;
            if (tuxTextView3 != null) {
                drawable2 = tuxTextView3.getBackground();
            } else {
                drawable2 = null;
            }
            if ((drawable2 instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) drawable2) != null) {
                gradientDrawable.setColor(i2);
            }
        }
        CollectionDetailModel model = (CollectionDetailModel) afS53S0200000_4.l1;
        C254739zB LJJZZIII = ((PaidContentCollectionDetailDescriptionAssem) afS53S0200000_4.l0).LJLILLLLZI.LJJZZIII();
        o.LJIIIZ(model, "model");
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId, "userService().curUserId");
        C188727au c188727au = new C188727au();
        c188727au.LJI("page_name", "series_detail_page");
        c188727au.LJ(model.getCollectionId(), "collection_id");
        User collectionCreator = model.getCollectionCreator();
        if (collectionCreator != null) {
            str = collectionCreator.getUid();
        } else {
            str = null;
        }
        c188727au.LJI("author_id", str);
        c188727au.LJI("user_id", curUserId);
        c188727au.LJFF(model.getVoucherId(), "voucher_id");
        if (LJJZZIII != null) {
            str2 = LJJZZIII.LIZJ;
        } else {
            str2 = null;
        }
        c188727au.LJI("collection_price", str2);
        if (LJJZZIII != null) {
            str3 = LJJZZIII.LIZLLL;
        }
        c188727au.LJI("discount_price", str3);
        FMX.LJIIL("claim_voucher_button_show", c188727au.LIZ);
        ((PaidContentCollectionDetailDescriptionAssem) afS53S0200000_4.l0).R3();
        if (c25598A2w.LJLJI && (tuxTextView = ((PaidContentCollectionDetailDescriptionAssem) afS53S0200000_4.l0).LLFFF) != null) {
            tuxTextView.setTextColor(c25598A2w.LJLILLLLZI);
        }
        TuxTextView tuxTextView4 = ((PaidContentCollectionDetailDescriptionAssem) afS53S0200000_4.l0).LLFFF;
        if (tuxTextView4 != null) {
            tuxTextView4.setVisibility(0);
        }
        View _$_findCachedViewById = ((PaidContentCollectionDetailDescriptionAssem) afS53S0200000_4.l0)._$_findCachedViewById(R.id.nef);
        if (_$_findCachedViewById == null) {
            return;
        }
        _$_findCachedViewById.setVisibility(0);
    }

    public static final void accept$16(AfS53S0200000_4 afS53S0200000_4, Object obj) {
        String str;
        Throwable th = (Throwable) obj;
        ((AQB) afS53S0200000_4.l0).getClass();
        AQB.LJIIIIZZ(0, 0, 0);
        ActivityC45651qj LIZJ = ((C54082LKk) afS53S0200000_4.l1).LIZJ();
        if (LIZJ != null) {
            C40328FsC.LIZLLL(LIZJ, R.string.dtf);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("update profile settings fail and fail reason is");
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        IV8.LIZ.dispose();
    }

    public static final void accept$17(AfS53S0200000_4 afS53S0200000_4, Object obj) {
        if (((WalletCenter) ((MineNavBarSettingAssem) afS53S0200000_4.l0).v3().walletCenter()).LJIIIZ()) {
            ((TuxTextView) afS53S0200000_4.l1).setText(((WalletCenter) ((MineNavBarSettingAssem) afS53S0200000_4.l0).v3().walletCenter()).LIZLLL());
        }
    }

    public static final void accept$18(AfS53S0200000_4 afS53S0200000_4, Object obj) {
        String str;
        FilterKeywordResp filterKeywordResp = (FilterKeywordResp) obj;
        if (filterKeywordResp.status_code == 0) {
            OP4.LIZLLL(filterKeywordResp.counts);
            ((InterfaceC65784Pro) afS53S0200000_4.l0).invoke();
            return;
        }
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) afS53S0200000_4.l1;
        int i = filterKeywordResp.error_code;
        if (i == 3008042 || i == 3008043) {
            str = filterKeywordResp.status_msg;
        } else {
            str = "";
        }
        o.LJIIIIZZ(str, "if (it.error_code == ERR…ED) it.status_msg else \"\"");
        interfaceC88472Yns.invoke(str);
    }

    public static final void accept$19(AfS53S0200000_4 afS53S0200000_4, Object obj) {
        FilterKeywordResp filterKeywordResp = (FilterKeywordResp) obj;
        if (filterKeywordResp.status_code == 0) {
            OP4.LIZLLL(filterKeywordResp.counts);
            ((InterfaceC65784Pro) afS53S0200000_4.l0).invoke();
        } else {
            ((InterfaceC65784Pro) afS53S0200000_4.l1).invoke();
        }
    }

    public static final void accept$2(AfS53S0200000_4 afS53S0200000_4, Object obj) {
        SyncNicknameAndUsernamePopTask.showErrorToast$default((SyncNicknameAndUsernamePopTask) afS53S0200000_4.l0, (ActivityC45651qj) afS53S0200000_4.l1, false, 2, null);
    }

    public static final void accept$20(AfS53S0200000_4 afS53S0200000_4, Object obj) {
        FilteredKeywordsModel filteredKeywordsModel = (FilteredKeywordsModel) obj;
        if (filteredKeywordsModel.status_code == 0) {
            OP4.LIZLLL(filteredKeywordsModel.counts);
            ((InterfaceC88472Yns) afS53S0200000_4.l0).invoke(filteredKeywordsModel.list);
        } else {
            ((InterfaceC65784Pro) afS53S0200000_4.l1).invoke();
        }
    }

    public static final void accept$21(AfS53S0200000_4 afS53S0200000_4, Object obj) {
        String str;
        FilterKeywordResp filterKeywordResp = (FilterKeywordResp) obj;
        if (filterKeywordResp.status_code == 0) {
            OP4.LIZLLL(filterKeywordResp.counts);
            ((InterfaceC65784Pro) afS53S0200000_4.l0).invoke();
            return;
        }
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) afS53S0200000_4.l1;
        if (filterKeywordResp.error_code == 3008042) {
            str = filterKeywordResp.status_msg;
        } else {
            str = "";
        }
        o.LJIIIIZZ(str, "if (it.error_code == ERR…ED) it.status_msg else \"\"");
        interfaceC88472Yns.invoke(str);
    }

    public static final void accept$22(AfS53S0200000_4 afS53S0200000_4, Object error) {
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) afS53S0200000_4.l0;
        o.LJIIIIZZ(error, "error");
        interfaceC88472Yns.invoke(error);
        ((BioTranslationViewModel) afS53S0200000_4.l1).setState(C9XC.LJLIL);
    }

    public static final void accept$23(AfS53S0200000_4 afS53S0200000_4, Object obj) {
        Throwable it = (Throwable) obj;
        PaidContentPaymentServiceImpl paidContentPaymentServiceImpl = (PaidContentPaymentServiceImpl) afS53S0200000_4.l0;
        Activity activity = (Activity) afS53S0200000_4.l1;
        paidContentPaymentServiceImpl.getClass();
        C26045AKb c26045AKb = new C26045AKb(activity);
        c26045AKb.LJIIIIZZ(R.string.rjt);
        c26045AKb.LJIIJ();
        C73893SzJ<A6I> c73893SzJ = ((PaidContentPaymentServiceImpl) afS53S0200000_4.l0).LIZLLL;
        o.LJIIIIZZ(it, "it");
        c73893SzJ.onNext(new A6J(new A6L(it)));
    }

    public static final void accept$24(AfS53S0200000_4 afS53S0200000_4, Object error) {
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) afS53S0200000_4.l0;
        o.LJIIIIZZ(error, "error");
        interfaceC88472Yns.invoke(error);
        ((ProfileSignatureTranslationViewModel) afS53S0200000_4.l1).setState(C9XA.LJLIL);
    }

    public static final void accept$25(AfS53S0200000_4 afS53S0200000_4, Object obj) {
        if (!((TD3) afS53S0200000_4.l0).LL.getBoolean("ame_tooltip_seen", false)) {
            XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C27736Aua((TD3) afS53S0200000_4.l0, (C73365Sqn) afS53S0200000_4.l1, null), 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$26(AfS53S0200000_4 afS53S0200000_4, Object obj) {
        Response response = (Response) ((C64797Pbt) obj).LIZIZ;
        InputItemData inputItemData = (InputItemData) response.data;
        if (!response.isCodeOK() || inputItemData == null) {
            ((AddressEditViewModel) afS53S0200000_4.l0).setState(C27233AmT.LJLIL);
            return;
        }
        AddressEditViewModel addressEditViewModel = (AddressEditViewModel) afS53S0200000_4.l0;
        addressEditViewModel.LJLJLJ = (Region) afS53S0200000_4.l1;
        addressEditViewModel.LJLLJ = true;
        addressEditViewModel.setState(C27234AmU.LJLIL);
        AddressEditViewModel addressEditViewModel2 = (AddressEditViewModel) afS53S0200000_4.l0;
        addressEditViewModel2.LJZI = inputItemData;
        AddressEditViewModel.qw0(addressEditViewModel2, inputItemData, null, null, 14);
    }

    public static final void accept$27(AfS53S0200000_4 afS53S0200000_4, Object obj) {
        C78983UzD.LJIJ((Throwable) obj, "before save address, checkAddress error");
        ((AddressEditViewModel) afS53S0200000_4.l0).fw0((Address) afS53S0200000_4.l1);
    }

    public static final void accept$28(AfS53S0200000_4 afS53S0200000_4, Object obj) {
        C26045AKb c26045AKb = new C26045AKb((Activity) afS53S0200000_4.l0);
        c26045AKb.LJIIIZ(((Throwable) obj).getMessage());
        c26045AKb.LJIIJ();
        ((VideoAuthorizationViewModel) afS53S0200000_4.l1).LJLIL.setValue(Boolean.FALSE);
    }

    public static final void accept$29(AfS53S0200000_4 afS53S0200000_4, Object obj) {
        C26045AKb c26045AKb = new C26045AKb((Activity) afS53S0200000_4.l0);
        c26045AKb.LJIIIZ(((Throwable) obj).getMessage());
        c26045AKb.LJIIJ();
        ((VideoAuthorizationViewModel) afS53S0200000_4.l1).LJLIL.setValue(Boolean.FALSE);
    }

    public static final void accept$3(AfS53S0200000_4 afS53S0200000_4, Object obj) {
        String str;
        if (o.LJ(obj, A6S.LIZ)) {
            PaidContentVideoPanel paidContentVideoPanel = (PaidContentVideoPanel) afS53S0200000_4.l0;
            SY4 sy4 = (SY4) afS53S0200000_4.l1;
            paidContentVideoPanel.getClass();
            sy4.setLoading(true);
            sy4.setClickable(false);
            return;
        }
        if (o.LJ(obj, A3X.LIZ) || o.LJ(obj, A6R.LIZ)) {
            return;
        }
        if (o.LJ(obj, A6Q.LIZ)) {
            PaidContentVideoPanel paidContentVideoPanel2 = (PaidContentVideoPanel) afS53S0200000_4.l0;
            String str2 = paidContentVideoPanel2.LLJJJJLIIL;
            Boolean bool = paidContentVideoPanel2.LLJL;
            String str3 = paidContentVideoPanel2.LLJJL;
            Boolean bool2 = paidContentVideoPanel2.LLJLIL;
            if (bool2 != null) {
                if (bool2.booleanValue()) {
                    str = "intro";
                } else {
                    str = "preview";
                }
            } else {
                str = null;
            }
            C25589A2n.LJIIJJI("show_collection_in_app_purchase", str2, null, null, null, bool, null, null, null, null, str, null, str3, null, null, null, null, null, null, null, null, null, null, null, null, 67098556);
            return;
        }
        if (obj instanceof A3W) {
            PaidContentVideoPanel paidContentVideoPanel3 = (PaidContentVideoPanel) afS53S0200000_4.l0;
            SY4 sy42 = (SY4) afS53S0200000_4.l1;
            paidContentVideoPanel3.getClass();
            sy42.setLoading(false);
            sy42.setClickable(true);
            Activity activity = ((PaidContentVideoPanel) afS53S0200000_4.l0).activity;
            if (activity == null) {
                return;
            }
            activity.finish();
            return;
        }
        if (!(obj instanceof A6J)) {
            return;
        }
        PaidContentVideoPanel paidContentVideoPanel4 = (PaidContentVideoPanel) afS53S0200000_4.l0;
        SY4 sy43 = (SY4) afS53S0200000_4.l1;
        paidContentVideoPanel4.getClass();
        sy43.setLoading(false);
        sy43.setClickable(true);
    }

    public static final void accept$30(AfS53S0200000_4 afS53S0200000_4, Object obj) {
        ((OriginMusicListViewModel) afS53S0200000_4.l0).listSetItems(OriginMusicListViewModel.hv0((OriginMusicListViewModel) afS53S0200000_4.l0, null, ((OriginMusicListViewModel) afS53S0200000_4.l0).iv0(((C240719cZ) afS53S0200000_4.l1).LJLIL), null, null, null, null, 61));
        ((OriginMusicListViewModel) afS53S0200000_4.l0).setState(C240009bQ.LJLIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.ACr] */
    public static final void accept$31(AfS53S0200000_4 afS53S0200000_4, Object obj) {
        final I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = (I18nSettingManageMyAccountActivity) afS53S0200000_4.l0;
        DialogC254019y1 dialogC254019y1 = (DialogC254019y1) afS53S0200000_4.l1;
        DoBStatus doBStatus = (DoBStatus) obj;
        i18nSettingManageMyAccountActivity.getClass();
        dialogC254019y1.dismiss();
        if (doBStatus == null || doBStatus.status_code != 0) {
            C26045AKb c26045AKb = new C26045AKb(i18nSettingManageMyAccountActivity);
            c26045AKb.LJIIIIZZ(R.string.rf3);
            c26045AKb.LJIIJ();
            i18nSettingManageMyAccountActivity.LLIIJLIL();
            return;
        }
        i18nSettingManageMyAccountActivity.LJLJJI = doBStatus;
        i18nSettingManageMyAccountActivity.LLIIJLIL();
        if (i18nSettingManageMyAccountActivity.LJLJJI.getType().intValue() == 3 || i18nSettingManageMyAccountActivity.LJLJJI.getType().intValue() == 4 || i18nSettingManageMyAccountActivity.LJLJJI.getType().intValue() == 0 || i18nSettingManageMyAccountActivity.LJLJJI.getType().intValue() == 5) {
            ARI ari = new ARI(i18nSettingManageMyAccountActivity);
            if (i18nSettingManageMyAccountActivity.LJLJJI.getType().intValue() == 4 && !TextUtils.isEmpty(i18nSettingManageMyAccountActivity.LJLJJI.getAppealUrl())) {
                ari.LJI(R.string.bjd, new AObjectS42S0101000_5(6, i18nSettingManageMyAccountActivity, 60));
                ari.LJI(R.string.cg_, null);
            } else {
                ari.LJI(R.string.p2, null);
            }
            C26227ARb c26227ARb = new C26227ARb(i18nSettingManageMyAccountActivity);
            c26227ARb.LJ(R.string.bjb);
            c26227ARb.LIZIZ(i18nSettingManageMyAccountActivity.LJLJJI.getMsg());
            c26227ARb.LJIIL = ari;
            c26227ARb.LJII = false;
            c26227ARb.LJI().LIZLLL();
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "age_edit_page");
            c188727au.LJFF(i18nSettingManageMyAccountActivity.LJLJJI.getType(), "user_age_status");
            FMX.LJIIL("show_age_edit_ineligible_popup", c188727au.LIZ);
            return;
        }
        a.LIZIZ().LJIJJLI(i18nSettingManageMyAccountActivity, new InterfaceC62969OnV() { // from class: X.ACr
            @Override // X.InterfaceC62969OnV
            public final void LIZ(String str, boolean z) {
                I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity2 = I18nSettingManageMyAccountActivity.this;
                i18nSettingManageMyAccountActivity2.getClass();
                if (z) {
                    C26045AKb c26045AKb2 = new C26045AKb(i18nSettingManageMyAccountActivity2);
                    c26045AKb2.LJIIIIZZ(R.string.bja);
                    c26045AKb2.LJFF(R.raw.icon_tick_fill_small);
                    c26045AKb2.LJI(AnonymousClass636.LJIIIIZZ(R.attr.dj, i18nSettingManageMyAccountActivity2));
                    c26045AKb2.LJIIJ();
                    i18nSettingManageMyAccountActivity2.LLD.LJIILIIL(i18nSettingManageMyAccountActivity2.LLIIIILZ(str));
                }
            }
        }, i18nSettingManageMyAccountActivity.LJLJJI.getDefaultDoB(), i18nSettingManageMyAccountActivity.LJLJJI.getType().intValue(), i18nSettingManageMyAccountActivity.LJLJJI.getUpperBoundDate(), i18nSettingManageMyAccountActivity.LJLJJI.getDescType().intValue());
    }

    public static final void accept$32(AfS53S0200000_4 afS53S0200000_4, Object obj) {
        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = (I18nSettingManageMyAccountActivity) afS53S0200000_4.l0;
        DialogC254019y1 dialogC254019y1 = (DialogC254019y1) afS53S0200000_4.l1;
        i18nSettingManageMyAccountActivity.LLIIJLIL();
        C26045AKb c26045AKb = new C26045AKb(i18nSettingManageMyAccountActivity);
        c26045AKb.LJIIIIZZ(R.string.rf3);
        c26045AKb.LJIIJ();
        dialogC254019y1.dismiss();
    }

    public static final void accept$33(AfS53S0200000_4 afS53S0200000_4, Object obj) {
        PromptTransformResp promptTransformResp = (PromptTransformResp) obj;
        ((Option) afS53S0200000_4.l0).setAdditional_content(String.valueOf(promptTransformResp.instructionId));
        ONJ onj = ((ON8) afS53S0200000_4.l1).LLFII;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("instructionId = ");
        LIZ.append(promptTransformResp.instructionId);
        onj.LJIIIIZZ(X1D.LIZIZ(LIZ));
    }

    public static final void accept$34(AfS53S0200000_4 afS53S0200000_4, Object obj) {
        if (((WalletCenter) ((NavBarSettingComponent) afS53S0200000_4.l0).v3().walletCenter()).LJIIIZ()) {
            ((TuxTextView) afS53S0200000_4.l1).setText(((WalletCenter) ((NavBarSettingComponent) afS53S0200000_4.l0).v3().walletCenter()).LIZLLL());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$35(AfS53S0200000_4 afS53S0200000_4, Object obj) {
        Response response = (Response) obj;
        DeliveryData deliveryData = (DeliveryData) response.data;
        if (!response.isCodeOK() || deliveryData == null) {
            DeliveryPanelViewModel deliveryPanelViewModel = (DeliveryPanelViewModel) afS53S0200000_4.l0;
            deliveryPanelViewModel.getClass();
            deliveryPanelViewModel.setState(new AqS29S0001000_4(3, 27));
            return;
        }
        DeliveryPanelViewModel deliveryPanelViewModel2 = (DeliveryPanelViewModel) afS53S0200000_4.l0;
        deliveryPanelViewModel2.LJLJLLL = deliveryData;
        deliveryPanelViewModel2.setState(new AqS170S0100000_4(deliveryData, 1641));
        Voucher voucher = deliveryData.showVoucher;
        if (voucher != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(voucher);
            C26059AKp.LIZ().LIZ("ec_vouchers_claim_success_event", C27739Aud.LJI(new CouponClaimSuccessEvent(C27739Aud.LJI(arrayList))));
        }
        if (deliveryData.exceptionUX != null) {
            ((DeliveryPanelViewModel) afS53S0200000_4.l0).setState(new AqS170S0100000_4(deliveryData, 1642));
        }
        DeliveryPanelViewModel deliveryPanelViewModel3 = (DeliveryPanelViewModel) afS53S0200000_4.l0;
        deliveryPanelViewModel3.setState(new AqS108S0300000_4(deliveryPanelViewModel3, deliveryData, (DeliveryPanelStarter.EnterParamForProductDetailPage) afS53S0200000_4.l1, 50));
    }

    public static final void accept$4(AfS53S0200000_4 afS53S0200000_4, Object obj) {
        PinnedMusicList iv0;
        SearchMusicListViewModel searchMusicListViewModel = (SearchMusicListViewModel) afS53S0200000_4.l0;
        searchMusicListViewModel.LJLJJLL = false;
        C240719cZ c240719cZ = (C240719cZ) afS53S0200000_4.l1;
        PinnedMusicList iv02 = searchMusicListViewModel.iv0();
        if ((iv02 == null || iv02.getMusicList() == null) && (iv0 = searchMusicListViewModel.iv0()) != null) {
            iv0.setMusicList(new ArrayList());
        }
        PinnedMusicList iv03 = searchMusicListViewModel.iv0();
        if (iv03 != null) {
            List<Music> musicList = iv03.getMusicList();
            if (musicList != null) {
                ListProtector.add(musicList, 0, searchMusicListViewModel.gv0(c240719cZ.LJLIL));
            }
            iv03.setAvalibleCapicity(iv03.getAvalibleCapicity() - 1);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) searchMusicListViewModel.LJLJI).iterator();
        while (it.hasNext()) {
            Music music = (Music) it.next();
            MusicModel convertToMusicModel = music.convertToMusicModel();
            o.LJIIIIZZ(convertToMusicModel, "music.convertToMusicModel()");
            arrayList.add(new C240719cZ(convertToMusicModel, new C240639cR(searchMusicListViewModel.hv0(music), false, false, 0, false, false, false, false, false, 510)));
        }
        searchMusicListViewModel.listSetItems(arrayList);
        searchMusicListViewModel.setState(C240189bi.LJLIL);
    }

    public static final void accept$5(AfS53S0200000_4 afS53S0200000_4, Object obj) {
        ((SearchMusicListViewModel) afS53S0200000_4.l0).setState(C240149be.LJLIL);
        SearchMusicListViewModel searchMusicListViewModel = (SearchMusicListViewModel) afS53S0200000_4.l0;
        searchMusicListViewModel.LJLJJLL = false;
        Music gv0 = searchMusicListViewModel.gv0(((C240719cZ) afS53S0200000_4.l1).LJLIL);
        PinnedMusicList iv0 = searchMusicListViewModel.iv0();
        if (iv0 != null) {
            List<Music> musicList = iv0.getMusicList();
            if (musicList != null) {
                musicList.remove(gv0);
            }
            iv0.setAvalibleCapicity(iv0.getAvalibleCapicity() + 1);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) searchMusicListViewModel.LJLJI).iterator();
        while (it.hasNext()) {
            Music music = (Music) it.next();
            MusicModel convertToMusicModel = music.convertToMusicModel();
            o.LJIIIIZZ(convertToMusicModel, "music.convertToMusicModel()");
            arrayList.add(new C240719cZ(convertToMusicModel, new C240639cR(searchMusicListViewModel.hv0(music), false, false, 0, false, false, false, false, false, 510)));
        }
        searchMusicListViewModel.listSetItems(arrayList);
    }

    public static final void accept$6(AfS53S0200000_4 afS53S0200000_4, Object obj) {
        OriginMusicListViewModel originMusicListViewModel = (OriginMusicListViewModel) afS53S0200000_4.l0;
        originMusicListViewModel.LJLJJL = false;
        ((OriginMusicListViewModel) afS53S0200000_4.l0).listSetItems(OriginMusicListViewModel.hv0(originMusicListViewModel, null, null, originMusicListViewModel.iv0(((C240719cZ) afS53S0200000_4.l1).LJLIL), null, null, null, 59));
        ((OriginMusicListViewModel) afS53S0200000_4.l0).setState(C240159bf.LJLIL);
    }

    public static final void accept$7(AfS53S0200000_4 afS53S0200000_4, Object obj) {
        RatingFragment.wl((RatingFragment) afS53S0200000_4.l0, (A4Y) afS53S0200000_4.l1);
    }

    public static final void accept$8(AfS53S0200000_4 afS53S0200000_4, Object obj) {
        ((ManageSeriesViewModel) afS53S0200000_4.l0).setState(new AqS135S0200000_4((Throwable) obj, (A15) afS53S0200000_4.l1, 82));
    }

    public static final void accept$9(AfS53S0200000_4 afS53S0200000_4, Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        CreatorCollectionDetailResponse creatorCollectionDetailResponse = (CreatorCollectionDetailResponse) obj;
        if (creatorCollectionDetailResponse.status_code == 0) {
            String str = creatorCollectionDetailResponse.collectionDetail.collectionId;
            C248629pK state = ((SeriesDraftViewModel) afS53S0200000_4.l0).getState();
            C248559pD c248559pD = state.LJLJL;
            String str2 = null;
            if (c248559pD != null && c248559pD.LIZ != null) {
                z = true;
            } else {
                z = false;
            }
            Price price = state.LJLJJI;
            if (price != null) {
                str2 = price.getPriceInUsd();
            }
            boolean z4 = state.LJLJJLL;
            if (state.LJLILLLLZI != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (state.LJLJI != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            C25589A2n.LJIIJ(str, z, str2, z4, z2, z3, "1", null, state.LL);
            ((SeriesDraftViewModel) afS53S0200000_4.l0).setState(new AqS47S1200000_4(str, creatorCollectionDetailResponse, (EnumC248719pT) afS53S0200000_4.l1, 9));
        }
    }

    public AfS53S0200000_4(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
