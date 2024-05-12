package kotlin.jvm.internal;

import X.AEC;
import X.AG6;
import X.AbstractC57774Mlu;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.ActivityC86117Xqz;
import X.B4I;
import X.C109824Ss;
import X.C119904nC;
import X.C141335gf;
import X.C15100iY;
import X.C16880lQ;
import X.C221018lt;
import X.C234509Ig;
import X.C235929Ns;
import X.C242869g2;
import X.C268313n;
import X.C268613q;
import X.C30941Ji;
import X.C34K;
import X.C38341F2z;
import X.C3C5;
import X.C40680Fxs;
import X.C46340IGq;
import X.C47325Ihl;
import X.C538229i;
import X.C55333Lnd;
import X.C57184McO;
import X.C57419MgB;
import X.C58242MtS;
import X.C61447O9r;
import X.C68322mC;
import X.C76800UCe;
import X.C78685UuP;
import X.C78963Uyt;
import X.C78966Uyw;
import X.C80796VnM;
import X.C84418XBe;
import X.C84430XBq;
import X.C84432XBs;
import X.C84448XCi;
import X.C84459XCt;
import X.C84460XCu;
import X.C84466XDa;
import X.C84468XDc;
import X.C84469XDd;
import X.C84477XDl;
import X.C84479XDn;
import X.C84485XDt;
import X.C84486XDu;
import X.C84492XEa;
import X.C84763XOl;
import X.C85069Xa5;
import X.C85712XkS;
import X.C86140XrM;
import X.C86144XrQ;
import X.C86229Xsn;
import X.C86236Xsu;
import X.C86343Xud;
import X.C86478Xwo;
import X.C86482Xws;
import X.C86496Xx6;
import X.C86507XxH;
import X.C86581XyT;
import X.C8VZ;
import X.DJA;
import X.EnumC252729vw;
import X.EnumC46497IMr;
import X.H78;
import X.H8F;
import X.HandlerC86501XxB;
import X.InterfaceC55347Lnr;
import X.InterfaceC65784Pro;
import X.InterfaceC84449XCj;
import X.InterfaceC84461XCv;
import X.InterfaceC84498XEg;
import X.InterfaceC85801Xlt;
import X.InterfaceC86486Xww;
import X.InterfaceC86787Y4h;
import X.InterfaceC86816Y5k;
import X.InterfaceC88472Yns;
import X.J9P;
import X.LVY;
import X.X1D;
import X.X5Q;
import X.X5V;
import X.X5W;
import X.X94;
import X.XBH;
import X.XBI;
import X.XCL;
import X.XCM;
import X.XCP;
import X.XCR;
import X.XCV;
import X.XCW;
import X.XDA;
import X.XDF;
import X.XDM;
import X.XDO;
import X.XDP;
import X.XDR;
import X.XDV;
import X.XDW;
import X.XDZ;
import X.XE8;
import X.XIJ;
import X.XIK;
import X.XO9;
import X.XOX;
import X.XS7;
import X.XSB;
import X.XSC;
import X.Y5M;
import X.YAR;
import X.YAS;
import X.YAT;
import Y.ACListenerS49S0200000_15;
import Y.IDgS140S0200000_15;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorEnableInnerBeautyMaxValue;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.other.subscribe_enhance.SubscriptionExpireRemindHourSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.firstscreen.LivePreviewMPDEntranceSetting;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.ugc.aweme.ability.IDubbingAbility;
import com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKAgeGateRegistrationFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BindEmailWithoutVerifyFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputPhoneFragment;
import com.ss.android.ugc.aweme.compliance.business.agegate.view.AgeGateFragment;
import com.ss.android.ugc.aweme.fe.method.upload.PickPhotoUploadFeature;
import com.ss.android.ugc.aweme.feed.adapter.FeedLiveViewHolderNew;
import com.ss.android.ugc.aweme.feed.adapter.FeedLiveViewHolderOpt;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerVM;
import com.ss.android.ugc.aweme.feed.assem.desc.TranslationAbility;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.ui.InnerPushPopupWindow;
import com.ss.android.ugc.aweme.music.ui.reuseaudio.ReuseAudioPlayer;
import com.ss.android.ugc.aweme.music.ui.reuseaudio.ReuseAudioViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSNavButton;
import com.ss.android.ugc.aweme.poi.search.PoiSearchAssem;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.SearchLiveCardViewHolder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.awemepushlib.manager.PushPermissionPopupManager;
import com.ss.ugc.effectplatform.model.CategoryPageModel;
import com.ss.ugc.effectplatform.model.DiffEffect;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.EffectChannelResponse;
import com.ss.ugc.effectplatform.model.PanelInfoModel;
import com.ss.ugc.effectplatform.model.ProviderEffect;
import com.ss.ugc.effectplatform.model.UrlModel;
import com.ss.ugc.effectplatform.model.net.EffectListResponse;
import com.ss.ugc.effectplatform.model.net.GifProviderEffectListResponse;
import com.ss.ugc.effectplatform.task.FetchEffectListCheckedTask;
import com.ss.ugc.effectplatform.task.FetchPanelEffectListTask;
import defpackage.i0;
import java.io.File;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeoutException;

/* loaded from: classes16.dex */
public class AqS162S0200000_15 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;

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
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$16(this);
            case 17:
                return invoke$17(this);
            case 18:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            case 20:
                return invoke$20(this);
            case 21:
                return invoke$21(this);
            case 22:
                return invoke$22(this);
            case 23:
                return invoke$23(this);
            case 24:
                return invoke$24(this);
            case 25:
                return invoke$25(this);
            case 26:
                return invoke$26(this);
            case 27:
                return invoke$27(this);
            case 28:
                return invoke$28(this);
            case 29:
                return invoke$29(this);
            case 30:
                return invoke$30(this);
            case 31:
                return invoke$31(this);
            case 32:
                return invoke$32(this);
            case 33:
                return invoke$33(this);
            case 34:
                return invoke$34(this);
            case 35:
                return invoke$35(this);
            case 36:
                return invoke$36(this);
            case 37:
                return invoke$37(this);
            case 38:
                return invoke$38(this);
            case 39:
                return invoke$39(this);
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                return invoke$40(this);
            case 41:
                return invoke$41(this);
            case 42:
                return invoke$42(this);
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                return invoke$43(this);
            case 44:
                return invoke$44(this);
            case 45:
                return invoke$45(this);
            case 46:
                return invoke$46(this);
            case 47:
                return invoke$47(this);
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                return invoke$48(this);
            case C61447O9r.LJIIJ:
                return invoke$49(this);
            case 50:
                return invoke$50(this);
            case 51:
                return invoke$51(this);
            case 52:
                return invoke$52(this);
            case 53:
                return invoke$53(this);
            case 54:
                return invoke$54(this);
            case 55:
                return invoke$55(this);
            case 56:
                return invoke$56(this);
            case 57:
                return invoke$57(this);
            case 58:
                return invoke$58(this);
            case 59:
                return invoke$59(this);
            case 60:
                return invoke$60(this);
            case 61:
                return invoke$61(this);
            case BaseNotice.CREATOR /* 62 */:
                return invoke$62(this);
            case 63:
                return invoke$63(this);
            case 64:
                return invoke$64(this);
            case 65:
                return invoke$65(this);
            case 66:
                return invoke$66(this);
            case 67:
                return invoke$67(this);
            case 68:
                return invoke$68(this);
            case 69:
                return invoke$69(this);
            case 70:
                return invoke$70(this);
            case 71:
                return invoke$71(this);
            case SubscriptionExpireRemindHourSetting.DEFAULT /* 72 */:
                return invoke$72(this);
            case 73:
                return invoke$73(this);
            case 74:
                return invoke$74(this);
            case 75:
                return invoke$75(this);
            case 76:
                return invoke$76(this);
            case 77:
                return invoke$77(this);
            case 78:
                return invoke$78(this);
            case 79:
                return invoke$79(this);
            case 80:
                return invoke$80(this);
            case 81:
                return invoke$81(this);
            case 82:
                return invoke$82(this);
            case 83:
                return invoke$83(this);
            case 84:
                return invoke$84(this);
            case LiveAnchorEnableInnerBeautyMaxValue.DEFAULT /* 85 */:
                return invoke$85(this);
            case 86:
                return invoke$86(this);
            case 87:
                return invoke$87(this);
            case 88:
                return invoke$88(this);
            case 89:
                return invoke$89(this);
            case 90:
                return invoke$90(this);
            case 91:
                return invoke$91(this);
            case 92:
                return invoke$92(this);
            case 93:
                return invoke$93(this);
            case 94:
                return invoke$94(this);
            case 95:
                return invoke$95(this);
            case 96:
                return invoke$96(this);
            default:
                return null;
        }
    }

    public final void invoke$0() {
        ((RouteArgExtension.RouteArgLifecycle) this.l1).setCached(null);
    }

    public final void invoke$1() {
        SmartImageView smartImageView = new SmartImageView(((TTKAgeGateRegistrationFragment) this.l0).getContext());
        smartImageView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        smartImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        smartImageView.setImageURI(((PNSNavButton) this.l1).getIconUrl());
        C16880lQ.LJJIJLIJ(smartImageView, new ACListenerS49S0200000_15((TTKAgeGateRegistrationFragment) this.l0, (PNSNavButton) this.l1, 5));
        new C235929Ns();
    }

    public final void invoke$2() {
        SmartImageView smartImageView = new SmartImageView(((AgeGateFragment) this.l0).getContext());
        smartImageView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        smartImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        smartImageView.setImageURI(((PNSNavButton) this.l1).getIconUrl());
        C16880lQ.LJJIJLIJ(smartImageView, new ACListenerS49S0200000_15((AgeGateFragment) this.l0, (PNSNavButton) this.l1, 16));
        new C235929Ns();
    }

    public static final Object invoke$0(AqS162S0200000_15 aqS162S0200000_15) {
        ((X5Q) aqS162S0200000_15.l0).LIZIZ = ((DownloadTask) aqS162S0200000_15.l1).download();
        X5V LIZ = X5W.LIZ();
        if (LIZ != null) {
            X5Q x5q = (X5Q) aqS162S0200000_15.l0;
            LIZ.LIZ.put(x5q.LIZIZ, x5q);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS162S0200000_15 aqS162S0200000_15) {
        C221018lt.LIZ("PushPermissionPopup", "doShowCombinedPushPermissionPopup() callback");
        ((PushPermissionPopupManager) aqS162S0200000_15.l0).getClass();
        if (DJA.LIZ().getInt("nu_push_permission_popup_show_count", 0) > 0) {
            C221018lt.LIZ("PushPermissionPopup", "hasShownPushPermissionPopupThisTime()");
            ((InterfaceC86787Y4h) aqS162S0200000_15.l1).LIZIZ();
        } else {
            ((InterfaceC86787Y4h) aqS162S0200000_15.l1).LIZ();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS162S0200000_15 aqS162S0200000_15) {
        if (!TextUtils.isEmpty(((C85712XkS) aqS162S0200000_15.l0).LJIIL)) {
            C242869g2.LIZ(((BindEmailWithoutVerifyFragment) aqS162S0200000_15.l1).mo49getActivity(), ((BindEmailWithoutVerifyFragment) aqS162S0200000_15.l1).LJJLIIIJJI(), ((BindEmailWithoutVerifyFragment) aqS162S0200000_15.l1).getEnterMethod());
            return C76800UCe.LIZ;
        }
        "please pass pageName".toString();
        throw new IllegalStateException("please pass pageName");
    }

    public static final Object invoke$11(AqS162S0200000_15 aqS162S0200000_15) {
        if (!TextUtils.isEmpty(((C85712XkS) aqS162S0200000_15.l0).LJIIL)) {
            C242869g2.LIZ(((InputPhoneFragment) aqS162S0200000_15.l1).mo49getActivity(), ((InputPhoneFragment) aqS162S0200000_15.l1).LJJLIIIJJI(), ((InputPhoneFragment) aqS162S0200000_15.l1).getEnterMethod());
            return C76800UCe.LIZ;
        }
        "please pass pageName".toString();
        throw new IllegalStateException("please pass pageName");
    }

    public static final Object invoke$12(AqS162S0200000_15 aqS162S0200000_15) {
        ((AgeGateFragment) aqS162S0200000_15.l0).Ll(((PNSNavButton) aqS162S0200000_15.l1).getActionUrl());
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$13(AqS162S0200000_15 aqS162S0200000_15) {
        aqS162S0200000_15.invoke$2();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$14(AqS162S0200000_15 aqS162S0200000_15) {
        C234509Ig c234509Ig = new C234509Ig();
        String content = ((PNSNavButton) aqS162S0200000_15.l0).getContent();
        if (content == null) {
            content = "";
        }
        c234509Ig.LIZJ = content;
        c234509Ig.LJFF = true;
        c234509Ig.LJ = true;
        c234509Ig.LIZ(EnumC252729vw.SECONDARY);
        new C109824Ss(new AqS162S0200000_15((AgeGateFragment) aqS162S0200000_15.l1, (PNSNavButton) aqS162S0200000_15.l0, 15));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$15(AqS162S0200000_15 aqS162S0200000_15) {
        ((AgeGateFragment) aqS162S0200000_15.l0).Ll(((PNSNavButton) aqS162S0200000_15.l1).getActionUrl());
        return C76800UCe.LIZ;
    }

    public static final Object invoke$16(AqS162S0200000_15 aqS162S0200000_15) {
        ((PickPhotoUploadFeature) aqS162S0200000_15.l0).openImageChooseUpload((Activity) aqS162S0200000_15.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$17(AqS162S0200000_15 aqS162S0200000_15) {
        ((PickPhotoUploadFeature) aqS162S0200000_15.l0).openImageChooseUpload((Activity) aqS162S0200000_15.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$18(AqS162S0200000_15 aqS162S0200000_15) {
        FeedLiveViewHolderNew feedLiveViewHolderNew = (FeedLiveViewHolderNew) aqS162S0200000_15.l0;
        C86343Xud c86343Xud = feedLiveViewHolderNew.LJLJJLL;
        if (c86343Xud != null) {
            ArrayList<String> arrayList = (ArrayList) aqS162S0200000_15.l1;
            LivePreviewMPDEntranceSetting livePreviewMPDEntranceSetting = LivePreviewMPDEntranceSetting.INSTANCE;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(C78963Uyt.LJIIL(c86343Xud));
            LIZ.append("-live_cell");
            if (livePreviewMPDEntranceSetting.isContains(X1D.LIZIZ(LIZ))) {
                B4I.LIZ("MPD", "onInstantiateItem#setMPDPreloadCallBack#preloadResource");
                LivePreviewPlayerVM LJZI = feedLiveViewHolderNew.LJZI();
                if (LJZI != null) {
                    LJZI.LJLLLL.LLZLLLL(feedLiveViewHolderNew.LJLJJI);
                }
                LivePreviewPlayerVM LJZI2 = feedLiveViewHolderNew.LJZI();
                if (LJZI2 != null) {
                    LJZI2.LJLLLL.LJ(arrayList);
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$19(AqS162S0200000_15 aqS162S0200000_15) {
        FeedLiveViewHolderOpt feedLiveViewHolderOpt = (FeedLiveViewHolderOpt) aqS162S0200000_15.l0;
        C86343Xud c86343Xud = feedLiveViewHolderOpt.LJLJJLL;
        if (c86343Xud != null) {
            ArrayList<String> arrayList = (ArrayList) aqS162S0200000_15.l1;
            LivePreviewMPDEntranceSetting livePreviewMPDEntranceSetting = LivePreviewMPDEntranceSetting.INSTANCE;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(C78963Uyt.LJIIL(c86343Xud));
            LIZ.append("-live_cell");
            if (livePreviewMPDEntranceSetting.isContains(X1D.LIZIZ(LIZ))) {
                B4I.LIZ("MPD", "onInstantiateItem#setMPDPreloadCallBack#preloadResource");
                LivePreviewPlayerVM LJZI = feedLiveViewHolderOpt.LJZI();
                if (LJZI != null) {
                    LJZI.LJLLLL.LLZLLLL(feedLiveViewHolderOpt.LJLJJI);
                }
                LivePreviewPlayerVM LJZI2 = feedLiveViewHolderOpt.LJZI();
                if (LJZI2 != null) {
                    LJZI2.LJLLLL.LJ(arrayList);
                }
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AqS162S0200000_15 r6) {
        /*
            java.lang.Object r0 = r6.l0
            X.Y5M r0 = (X.Y5M) r0
            com.bytedance.pipo.ocr.ocr.OcrViewModel r0 = r0.LJLIL
            android.app.Application r1 = r0.LJLJJLL
            r5 = 0
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = X.C16880lQ.LLILL(r1, r0)     // Catch: java.lang.Exception -> L1f
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch: java.lang.Exception -> L1f
            android.net.NetworkInfo r0 = X.C16880lQ.LJJLI(r0)     // Catch: java.lang.Exception -> L1f
            if (r0 == 0) goto L1f
            boolean r0 = r0.isConnected()     // Catch: java.lang.Exception -> L1f
            if (r0 == 0) goto L1f
            r0 = 1
            goto L20
        L1f:
            r0 = 0
        L20:
            r1 = 0
            if (r0 != 0) goto L43
            java.lang.Object r0 = r6.l0
            X.Y5M r0 = (X.Y5M) r0
            com.bytedance.pipo.ocr.ocr.OcrViewModel r0 = r0.LJLIL
            androidx.lifecycle.MutableLiveData<X.Y5j> r4 = r0.LJLIL
            X.Y5j r3 = new X.Y5j
            X.Y5c r0 = com.bytedance.pipo.ocr.bean.PipoOcrResult.CREATOR
            r0.getClass()
            com.bytedance.pipo.ocr.bean.PipoOcrResult r2 = X.C86808Y5c.LIZ(r1)
            r1 = 106(0x6a, float:1.49E-43)
            java.lang.String r0 = "Network unavailable!"
            r3.<init>(r5, r1, r0, r2)
            r4.postValue(r3)
        L40:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L43:
            java.lang.Object r0 = r6.l0
            X.Y5M r0 = (X.Y5M) r0
            com.bytedance.pipo.ocr.ocr.OcrViewModel r2 = r0.LJLIL
            long r0 = java.lang.System.currentTimeMillis()
            r2.LJLJJI = r0
            ij2.a r0 = ij2.a.LJIJ
            r0.getClass()
            X.Wh3 r3 = ij2.a.LIZIZ()
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L86
            r4.<init>()     // Catch: java.lang.Throwable -> L86
            java.lang.Object r2 = r6.l1     // Catch: java.lang.Throwable -> L86
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2     // Catch: java.lang.Throwable -> L86
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> L86
            r0 = 80
            boolean r0 = r2.compress(r1, r0, r4)     // Catch: java.lang.Throwable -> L86
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L86
            boolean r0 = r1.booleanValue()     // Catch: java.lang.Throwable -> L86
            if (r0 == 0) goto L7d
            r1.booleanValue()     // Catch: java.lang.Throwable -> L86
            byte[] r0 = r4.toByteArray()     // Catch: java.lang.Throwable -> L86
            if (r0 == 0) goto L7d
            goto L8e
        L7d:
            java.lang.Object r0 = r6.l1     // Catch: java.lang.Throwable -> L86
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch: java.lang.Throwable -> L86
            byte[] r0 = X.C45283Hpv.LIZ(r0)     // Catch: java.lang.Throwable -> L86
            goto L8e
        L86:
            java.lang.Object r0 = r6.l1
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            byte[] r0 = X.C45283Hpv.LIZ(r0)
        L8e:
            java.lang.String r2 = android.util.Base64.encodeToString(r0, r5)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "image64 length: "
            r1.append(r0)
            int r0 = r2.length()
            r1.append(r0)
            X.X1D.LIZIZ(r1)
            r3.LJFF = r2
            java.lang.Object r0 = r6.l0
            X.Y5M r0 = (X.Y5M) r0
            com.bytedance.pipo.ocr.ocr.OcrViewModel r2 = r0.LJLIL
            long r0 = java.lang.System.currentTimeMillis()
            r2.LJLJJL = r0
            X.Wh2 r2 = new X.Wh2
            r2.<init>()
            kotlin.jvm.internal.IDqS439S0100000_15 r1 = new kotlin.jvm.internal.IDqS439S0100000_15
            r0 = 1
            r1.<init>(r6, r0)
            java.lang.String r0 = "photo"
            r2.LIZIZ(r0, r3, r1)
            goto L40
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS162S0200000_15.invoke$2(kotlin.jvm.internal.AqS162S0200000_15):java.lang.Object");
    }

    public static final Object invoke$20(AqS162S0200000_15 aqS162S0200000_15) {
        ((PoiSearchAssem) aqS162S0200000_15.l0).c4();
        ((InterfaceC65784Pro) aqS162S0200000_15.l1).invoke();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$21(AqS162S0200000_15 aqS162S0200000_15) {
        PoiSearchAssem poiSearchAssem = (PoiSearchAssem) aqS162S0200000_15.l0;
        poiSearchAssem.LJLLL = false;
        poiSearchAssem.O3();
        ((C34K) aqS162S0200000_15.l1).element = true;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$22(AqS162S0200000_15 aqS162S0200000_15) {
        C80796VnM c80796VnM;
        InterfaceC55347Lnr controller = (InterfaceC55347Lnr) aqS162S0200000_15.l0;
        o.LJIIIZ(controller, "controller");
        C86144XrQ.LIZ = controller;
        boolean LIZIZ = C86144XrQ.LIZIZ();
        if (C86144XrQ.LJFF != LIZIZ) {
            InterfaceC55347Lnr interfaceC55347Lnr = C86144XrQ.LIZ;
            if (interfaceC55347Lnr != null && (c80796VnM = ((C55333Lnd) interfaceC55347Lnr).LIZ.mViewPager) != null) {
                c80796VnM.setDisableScroll(!LIZIZ);
            }
            C86144XrQ.LJFF = LIZIZ;
        }
        SearchLiveCardViewHolder searchLiveCardViewHolder = (SearchLiveCardViewHolder) aqS162S0200000_15.l1;
        searchLiveCardViewHolder.LJLL = C86144XrQ.LIZLLL(searchLiveCardViewHolder.LJLLI, searchLiveCardViewHolder.LJLLL, searchLiveCardViewHolder.LJLLJ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$23(AqS162S0200000_15 aqS162S0200000_15) {
        C84477XDl c84477XDl = (C84477XDl) aqS162S0200000_15.l0;
        XDR LIZ = c84477XDl.LJI.LJJJ.LIZ(c84477XDl.LJII);
        if (LIZ != null) {
            LIZ.onFail(null, (C84418XBe) aqS162S0200000_15.l1);
        }
        C84477XDl c84477XDl2 = (C84477XDl) aqS162S0200000_15.l0;
        c84477XDl2.LJI.LJJJ.LIZJ(c84477XDl2.LJII);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$24(AqS162S0200000_15 aqS162S0200000_15) {
        XDF xdf = (XDF) aqS162S0200000_15.l0;
        XDR LIZ = xdf.LJIIJ.LIZ(xdf.LJIIJJI);
        if (LIZ != null) {
            LIZ.onFail(null, (C84418XBe) aqS162S0200000_15.l1);
        }
        XDF xdf2 = (XDF) aqS162S0200000_15.l0;
        xdf2.LJIIJ.LIZJ(xdf2.LJIIJJI);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$25(AqS162S0200000_15 aqS162S0200000_15) {
        XDF xdf = (XDF) aqS162S0200000_15.l0;
        XDR LIZ = xdf.LJIIJ.LIZ(xdf.LJIIJJI);
        if (LIZ != null) {
            LIZ.onSuccess(aqS162S0200000_15.l1);
        }
        XDF xdf2 = (XDF) aqS162S0200000_15.l0;
        xdf2.LJIIJ.LIZJ(xdf2.LJIIJJI);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$26(AqS162S0200000_15 aqS162S0200000_15) {
        FetchEffectListCheckedTask fetchEffectListCheckedTask = (FetchEffectListCheckedTask) aqS162S0200000_15.l0;
        XDR LIZ = fetchEffectListCheckedTask.LJIIL.LJJJ.LIZ(fetchEffectListCheckedTask.LJIILL);
        if (LIZ != null) {
            LIZ.onSuccess((EffectChannelResponse) aqS162S0200000_15.l1);
        }
        FetchEffectListCheckedTask fetchEffectListCheckedTask2 = (FetchEffectListCheckedTask) aqS162S0200000_15.l0;
        fetchEffectListCheckedTask2.LJIIL.LJJJ.LIZJ(fetchEffectListCheckedTask2.LJIILL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$27(AqS162S0200000_15 aqS162S0200000_15) {
        FetchEffectListCheckedTask fetchEffectListCheckedTask = (FetchEffectListCheckedTask) aqS162S0200000_15.l0;
        XDR LIZ = fetchEffectListCheckedTask.LJIIL.LJJJ.LIZ(fetchEffectListCheckedTask.LJIILL);
        if (LIZ != null) {
            LIZ.onSuccess((EffectChannelResponse) aqS162S0200000_15.l1);
        }
        FetchEffectListCheckedTask fetchEffectListCheckedTask2 = (FetchEffectListCheckedTask) aqS162S0200000_15.l0;
        fetchEffectListCheckedTask2.LJIIL.LJJJ.LIZJ(fetchEffectListCheckedTask2.LJIILL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$28(AqS162S0200000_15 aqS162S0200000_15) {
        C84468XDc c84468XDc = (C84468XDc) aqS162S0200000_15.l0;
        XDR LIZ = c84468XDc.LJI.LJJJ.LIZ(c84468XDc.LJIIIIZZ);
        if (LIZ != null) {
            LIZ.onFail(null, (C84418XBe) aqS162S0200000_15.l1);
        }
        C84468XDc c84468XDc2 = (C84468XDc) aqS162S0200000_15.l0;
        c84468XDc2.LJI.LJJJ.LIZJ(c84468XDc2.LJIIIIZZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$29(AqS162S0200000_15 aqS162S0200000_15) {
        C84468XDc c84468XDc = (C84468XDc) aqS162S0200000_15.l0;
        XDR LIZ = c84468XDc.LJI.LJJJ.LIZ(c84468XDc.LJIIIIZZ);
        if (LIZ != null) {
            LIZ.onSuccess((CategoryPageModel) aqS162S0200000_15.l1);
        }
        C84468XDc c84468XDc2 = (C84468XDc) aqS162S0200000_15.l0;
        c84468XDc2.LJI.LJJJ.LIZJ(c84468XDc2.LJIIIIZZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS162S0200000_15 aqS162S0200000_15) {
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aqS162S0200000_15.l0;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke((AbstractC57774Mlu) aqS162S0200000_15.l1);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$30(AqS162S0200000_15 aqS162S0200000_15) {
        T t;
        C68322mC c68322mC = (C68322mC) aqS162S0200000_15.l1;
        XBH xbh = (XBH) aqS162S0200000_15.l0;
        DiffEffect diffEffect = xbh.LIZ;
        if (diffEffect != null) {
            String uri = diffEffect.getBase_url().getUri();
            if (uri != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(xbh.LJIIJ.getName());
                LIZ.append("-Base");
                X94.LIZIZ(uri, X1D.LIZIZ(LIZ));
                XBI xbi = new XBI(xbh, uri);
                XDM xdm = XDM.LIZ;
                DiffEffect diffEffect2 = xbh.LIZ;
                if (diffEffect2 != null) {
                    UrlModel base_url = diffEffect2.getBase_url();
                    xdm.getClass();
                    C84432XBs LIZ2 = xbh.LIZ(XDM.LJ(base_url), true, xbi, false, 1);
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(xbh.LJIIJ.getName());
                    LIZ3.append("-Base");
                    X94.LIZ(uri, X1D.LIZIZ(LIZ3));
                    t = LIZ2;
                } else {
                    o.LJIJI("diffEffect");
                    throw null;
                }
            } else {
                C84432XBs c84432XBs = new C84432XBs();
                C84418XBe c84418XBe = new C84418XBe(10023);
                c84418XBe.LIZIZ = "Diff task is illegal";
                c84432XBs.LIZ = c84418XBe;
                t = c84432XBs;
            }
            c68322mC.element = t;
            ((XBH) aqS162S0200000_15.l0).LJFF.LIZ(new AqS165S0100000_15(aqS162S0200000_15, 710));
            return C76800UCe.LIZ;
        }
        o.LJIJI("diffEffect");
        throw null;
    }

    public static final Object invoke$31(AqS162S0200000_15 aqS162S0200000_15) {
        XDW xdw = (XDW) aqS162S0200000_15.l0;
        XDR LIZ = xdw.LJI.LJJJ.LIZ(xdw.LJIIIIZZ);
        if (LIZ != null) {
            LIZ.onFail(null, (C84418XBe) aqS162S0200000_15.l1);
        }
        XDW xdw2 = (XDW) aqS162S0200000_15.l0;
        xdw2.LJI.LJJJ.LIZJ(xdw2.LJIIIIZZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$32(AqS162S0200000_15 aqS162S0200000_15) {
        XDW xdw = (XDW) aqS162S0200000_15.l0;
        XDR LIZ = xdw.LJI.LJJJ.LIZ(xdw.LJIIIIZZ);
        if (LIZ != null) {
            LIZ.onSuccess((EffectChannelResponse) aqS162S0200000_15.l1);
        }
        XDW xdw2 = (XDW) aqS162S0200000_15.l0;
        xdw2.LJI.LJJJ.LIZJ(xdw2.LJIIIIZZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$33(AqS162S0200000_15 aqS162S0200000_15) {
        C84466XDa c84466XDa = (C84466XDa) aqS162S0200000_15.l0;
        XDR LIZ = c84466XDa.LJIIL.LJJJ.LIZ(c84466XDa.LJIILJJIL);
        if (LIZ != null) {
            LIZ.onSuccess((EffectListResponse) aqS162S0200000_15.l1);
        }
        C84466XDa c84466XDa2 = (C84466XDa) aqS162S0200000_15.l0;
        c84466XDa2.LJIIL.LJJJ.LIZJ(c84466XDa2.LJIILJJIL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$34(AqS162S0200000_15 aqS162S0200000_15) {
        XCW xcw = (XCW) aqS162S0200000_15.l0;
        XDR LIZ = xcw.LJIIJJI.LJJJ.LIZ(xcw.LJIILIIL);
        if (LIZ != null) {
            LIZ.onFail(((XCW) aqS162S0200000_15.l0).LJIIL, (C84418XBe) aqS162S0200000_15.l1);
        }
        XCW xcw2 = (XCW) aqS162S0200000_15.l0;
        xcw2.LJIIJJI.LJJJ.LIZJ(xcw2.LJIILIIL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$35(AqS162S0200000_15 aqS162S0200000_15) {
        FetchPanelEffectListTask fetchPanelEffectListTask = (FetchPanelEffectListTask) aqS162S0200000_15.l0;
        XDR LIZ = fetchPanelEffectListTask.LJIIL.LJJJ.LIZ(fetchPanelEffectListTask.LJIILL);
        if (LIZ != null) {
            LIZ.onSuccess((EffectChannelResponse) aqS162S0200000_15.l1);
        }
        FetchPanelEffectListTask fetchPanelEffectListTask2 = (FetchPanelEffectListTask) aqS162S0200000_15.l0;
        fetchPanelEffectListTask2.LJIIL.LJJJ.LIZJ(fetchPanelEffectListTask2.LJIILL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$36(AqS162S0200000_15 aqS162S0200000_15) {
        XCW xcw = (XCW) aqS162S0200000_15.l0;
        XDR LIZ = xcw.LJIIJJI.LJJJ.LIZ(xcw.LJIILIIL);
        if (LIZ != null) {
            LIZ.onSuccess((List) aqS162S0200000_15.l1);
        }
        XCW xcw2 = (XCW) aqS162S0200000_15.l0;
        xcw2.LJIIJJI.LJJJ.LIZJ(xcw2.LJIILIIL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$37(AqS162S0200000_15 aqS162S0200000_15) {
        FetchPanelEffectListTask fetchPanelEffectListTask = (FetchPanelEffectListTask) aqS162S0200000_15.l0;
        XDR LIZ = fetchPanelEffectListTask.LJIIL.LJJJ.LIZ(fetchPanelEffectListTask.LJIILL);
        if (LIZ != null) {
            LIZ.onSuccess((EffectChannelResponse) aqS162S0200000_15.l1);
        }
        FetchPanelEffectListTask fetchPanelEffectListTask2 = (FetchPanelEffectListTask) aqS162S0200000_15.l0;
        fetchPanelEffectListTask2.LJIIL.LJJJ.LIZJ(fetchPanelEffectListTask2.LJIILL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$38(AqS162S0200000_15 aqS162S0200000_15) {
        C84469XDd c84469XDd = (C84469XDd) aqS162S0200000_15.l0;
        XDR LIZ = c84469XDd.LJI.LJJJ.LIZ(c84469XDd.LJIIIIZZ);
        if (LIZ != null) {
            LIZ.onFail(null, (C84418XBe) aqS162S0200000_15.l1);
        }
        C84469XDd c84469XDd2 = (C84469XDd) aqS162S0200000_15.l0;
        c84469XDd2.LJI.LJJJ.LIZJ(c84469XDd2.LJIIIIZZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$39(AqS162S0200000_15 aqS162S0200000_15) {
        C84485XDt c84485XDt = (C84485XDt) aqS162S0200000_15.l0;
        XDR LIZ = c84485XDt.LJI.LJJJ.LIZ(c84485XDt.LJII);
        if (LIZ != null) {
            LIZ.onFail(null, (C84418XBe) aqS162S0200000_15.l1);
        }
        C84485XDt c84485XDt2 = (C84485XDt) aqS162S0200000_15.l0;
        c84485XDt2.LJI.LJJJ.LIZJ(c84485XDt2.LJII);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(AqS162S0200000_15 aqS162S0200000_15) {
        aqS162S0200000_15.invoke$0();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$40(AqS162S0200000_15 aqS162S0200000_15) {
        C84486XDu c84486XDu = (C84486XDu) aqS162S0200000_15.l0;
        XDR LIZ = c84486XDu.LJI.LJJJ.LIZ(c84486XDu.LJIIIIZZ);
        if (LIZ != null) {
            LIZ.onFail(null, (C84418XBe) aqS162S0200000_15.l1);
        }
        C84486XDu c84486XDu2 = (C84486XDu) aqS162S0200000_15.l0;
        c84486XDu2.LJI.LJJJ.LIZJ(c84486XDu2.LJIIIIZZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$41(AqS162S0200000_15 aqS162S0200000_15) {
        C84469XDd c84469XDd = (C84469XDd) aqS162S0200000_15.l0;
        XDR LIZ = c84469XDd.LJI.LJJJ.LIZ(c84469XDd.LJIIIIZZ);
        if (LIZ != null) {
            LIZ.onSuccess((PanelInfoModel) aqS162S0200000_15.l1);
        }
        C84469XDd c84469XDd2 = (C84469XDd) aqS162S0200000_15.l0;
        c84469XDd2.LJI.LJJJ.LIZJ(c84469XDd2.LJIIIIZZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$42(AqS162S0200000_15 aqS162S0200000_15) {
        C84485XDt c84485XDt = (C84485XDt) aqS162S0200000_15.l0;
        XDR LIZ = c84485XDt.LJI.LJJJ.LIZ(c84485XDt.LJII);
        if (LIZ != null) {
            LIZ.onSuccess((HashMap) aqS162S0200000_15.l1);
        }
        C84485XDt c84485XDt2 = (C84485XDt) aqS162S0200000_15.l0;
        c84485XDt2.LJI.LJJJ.LIZJ(c84485XDt2.LJII);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$43(AqS162S0200000_15 aqS162S0200000_15) {
        XCL xcl = ((XCV) aqS162S0200000_15.l0).LIZ;
        XCM xcm = xcl.LJIILIIL.LJJIZ;
        Effect effect = xcl.LJIIL;
        C84418XBe c84418XBe = (C84418XBe) aqS162S0200000_15.l1;
        xcm.getClass();
        XCM.LIZIZ(effect, c84418XBe);
        XCL xcl2 = ((XCV) aqS162S0200000_15.l0).LIZ;
        XDR LIZ = xcl2.LJIILIIL.LJJJ.LIZ(xcl2.LJIILJJIL);
        if ((LIZ instanceof XCP) && LIZ != null) {
            LIZ.onFail(((XCV) aqS162S0200000_15.l0).LIZ.LJIIL, (C84418XBe) aqS162S0200000_15.l1);
        }
        if (((C84418XBe) aqS162S0200000_15.l1).LIZ != 10020) {
            XCL xcl3 = ((XCV) aqS162S0200000_15.l0).LIZ;
            xcl3.LJIILIIL.LJJJ.LIZJ(xcl3.LJIILJJIL);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$44(AqS162S0200000_15 aqS162S0200000_15) {
        C84486XDu c84486XDu = (C84486XDu) aqS162S0200000_15.l0;
        XDR LIZ = c84486XDu.LJI.LJJJ.LIZ(c84486XDu.LJIIIIZZ);
        if (LIZ != null) {
            LIZ.onSuccess((EffectChannelResponse) aqS162S0200000_15.l1);
        }
        C84486XDu c84486XDu2 = (C84486XDu) aqS162S0200000_15.l0;
        c84486XDu2.LJI.LJJJ.LIZJ(c84486XDu2.LJIIIIZZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$45(AqS162S0200000_15 aqS162S0200000_15) {
        XDO xdo = (XDO) aqS162S0200000_15.l0;
        XDR LIZ = xdo.LJI.LJJJ.LIZ(xdo.LJIIIIZZ);
        if (LIZ != null) {
            LIZ.onFail(null, (C84418XBe) aqS162S0200000_15.l1);
        }
        XDO xdo2 = (XDO) aqS162S0200000_15.l0;
        xdo2.LJI.LJJJ.LIZJ(xdo2.LJIIIIZZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$46(AqS162S0200000_15 aqS162S0200000_15) {
        C84479XDn c84479XDn = (C84479XDn) aqS162S0200000_15.l0;
        XDR LIZ = c84479XDn.LJI.LJJJ.LIZ(c84479XDn.LJIIIIZZ);
        if (LIZ != null) {
            LIZ.onSuccess((Effect) aqS162S0200000_15.l1);
        }
        C84479XDn c84479XDn2 = (C84479XDn) aqS162S0200000_15.l0;
        c84479XDn2.LJI.LJJJ.LIZJ(c84479XDn2.LJIIIIZZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$47(AqS162S0200000_15 aqS162S0200000_15) {
        C84479XDn c84479XDn = (C84479XDn) aqS162S0200000_15.l0;
        XDR LIZ = c84479XDn.LJI.LJJJ.LIZ(c84479XDn.LJIIIIZZ);
        if (LIZ != null) {
            LIZ.onFail(((C84479XDn) aqS162S0200000_15.l0).LJII, (C84418XBe) aqS162S0200000_15.l1);
        }
        C84479XDn c84479XDn2 = (C84479XDn) aqS162S0200000_15.l0;
        c84479XDn2.LJI.LJJJ.LIZJ(c84479XDn2.LJIIIIZZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$48(AqS162S0200000_15 aqS162S0200000_15) {
        XDO xdo = (XDO) aqS162S0200000_15.l0;
        XDR LIZ = xdo.LJI.LJJJ.LIZ(xdo.LJIIIIZZ);
        if (LIZ != null) {
            LIZ.onSuccess((PanelInfoModel) aqS162S0200000_15.l1);
        }
        XDO xdo2 = (XDO) aqS162S0200000_15.l0;
        xdo2.LJI.LJJJ.LIZJ(xdo2.LJIIIIZZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$49(AqS162S0200000_15 aqS162S0200000_15) {
        String LJIL;
        XCL xcl = ((XCV) aqS162S0200000_15.l0).LIZ;
        XCM xcm = xcl.LJIILIIL.LJJIZ;
        Effect effect = xcl.LJIIL;
        xcm.getClass();
        if (effect != null && (LJIL = C78966Uyw.LJIL(effect)) != null) {
            C538229i<XCP> c538229i = XCM.LIZIZ.get(LJIL);
            if (c538229i != null) {
                Iterator<XCP> it = c538229i.iterator();
                while (it.hasNext()) {
                    it.next().onSuccess(effect);
                }
            }
            XCM.LIZIZ.remove(LJIL);
            XCM.LIZ.remove(LJIL);
        }
        XCL xcl2 = ((XCV) aqS162S0200000_15.l0).LIZ;
        XDR LIZ = xcl2.LJIILIIL.LJJJ.LIZ(xcl2.LJIILJJIL);
        if (!(LIZ instanceof XCP)) {
            LIZ = null;
        }
        XCP xcp = (XCP) LIZ;
        if (xcp instanceof InterfaceC84449XCj) {
            C84430XBq c84430XBq = (C84430XBq) aqS162S0200000_15.l1;
            Effect effect2 = c84430XBq.LJ;
            C84448XCi c84448XCi = new C84448XCi();
            c84448XCi.LIZIZ = c84430XBq.LIZIZ;
            c84448XCi.LIZ = c84430XBq.LIZ;
            c84448XCi.LIZJ = c84430XBq.LIZJ;
            c84448XCi.LIZLLL = c84430XBq.LIZLLL;
            ((InterfaceC84449XCj) xcp).onSuccess(effect2, c84448XCi);
        } else if (xcp != null) {
            xcp.onSuccess(((C84430XBq) aqS162S0200000_15.l1).LJ);
        }
        XCL xcl3 = ((XCV) aqS162S0200000_15.l0).LIZ;
        xcl3.LJIILIIL.LJJJ.LIZJ(xcl3.LJIILJJIL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS162S0200000_15 aqS162S0200000_15) {
        boolean z;
        TranslationAbility translationAbility;
        IDubbingAbility iDubbingAbility = (IDubbingAbility) aqS162S0200000_15.l0;
        if (iDubbingAbility != null && iDubbingAbility.Pe() && (translationAbility = (TranslationAbility) aqS162S0200000_15.l1) != null && translationAbility.pa0()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$50(AqS162S0200000_15 aqS162S0200000_15) {
        XDA xda = (XDA) aqS162S0200000_15.l1;
        XDR LIZ = xda.LJIIL.LJJJ.LIZ(xda.LJIILJJIL);
        if (LIZ != null) {
            LIZ.onSuccess((Effect) aqS162S0200000_15.l0);
        }
        XDA xda2 = (XDA) aqS162S0200000_15.l1;
        xda2.LJIIL.LJJJ.LIZJ(xda2.LJIILJJIL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$51(AqS162S0200000_15 aqS162S0200000_15) {
        XDZ xdz = (XDZ) aqS162S0200000_15.l0;
        XDR LIZ = xdz.LJIIL.LJJJ.LIZ(xdz.LJIILJJIL);
        if (LIZ != null) {
            LIZ.onFail(null, (C84418XBe) aqS162S0200000_15.l1);
        }
        XDZ xdz2 = (XDZ) aqS162S0200000_15.l0;
        xdz2.LJIIL.LJJJ.LIZJ(xdz2.LJIILJJIL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$52(AqS162S0200000_15 aqS162S0200000_15) {
        XDP xdp = (XDP) aqS162S0200000_15.l0;
        XDR LIZ = xdp.LJII.LJJJ.LIZ(xdp.LJIIIZ);
        if (LIZ != null) {
            LIZ.onFail(null, (C84418XBe) aqS162S0200000_15.l1);
        }
        XDP xdp2 = (XDP) aqS162S0200000_15.l0;
        xdp2.LJII.LJJJ.LIZJ(xdp2.LJIIIZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$53(AqS162S0200000_15 aqS162S0200000_15) {
        C30941Ji c30941Ji = C84459XCt.LJIIIZ;
        c30941Ji.LIZIZ();
        try {
            ArrayList<InterfaceC84461XCv> remove = C84459XCt.LJIIJ.remove(((C84459XCt) aqS162S0200000_15.l0).LJII.getId());
            c30941Ji.LIZLLL();
            C84459XCt c84459XCt = (C84459XCt) aqS162S0200000_15.l0;
            XDR LIZ = c84459XCt.LJI.LJJJ.LIZ(c84459XCt.LJIIIIZZ);
            if (LIZ != null) {
                LIZ.onFail(((C84459XCt) aqS162S0200000_15.l0).LJII, (C84418XBe) aqS162S0200000_15.l1);
            }
            C84459XCt c84459XCt2 = (C84459XCt) aqS162S0200000_15.l0;
            c84459XCt2.LJI.LJJJ.LIZJ(c84459XCt2.LJIIIIZZ);
            if (remove != null) {
                Iterator<InterfaceC84461XCv> it = remove.iterator();
                while (it.hasNext()) {
                    it.next().onFail(((C84459XCt) aqS162S0200000_15.l0).LJII, (C84418XBe) aqS162S0200000_15.l1);
                }
            }
            return C76800UCe.LIZ;
        } catch (Throwable th) {
            c30941Ji.LIZLLL();
            throw th;
        }
    }

    public static final Object invoke$54(AqS162S0200000_15 aqS162S0200000_15) {
        XDZ xdz = (XDZ) aqS162S0200000_15.l0;
        XDR LIZ = xdz.LJIIL.LJJJ.LIZ(xdz.LJIILJJIL);
        if (LIZ != null) {
            LIZ.onSuccess((EffectListResponse) aqS162S0200000_15.l1);
        }
        XDZ xdz2 = (XDZ) aqS162S0200000_15.l0;
        xdz2.LJIIL.LJJJ.LIZJ(xdz2.LJIILJJIL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$55(AqS162S0200000_15 aqS162S0200000_15) {
        XDP xdp = (XDP) aqS162S0200000_15.l0;
        XDR LIZ = xdp.LJII.LJJJ.LIZ(xdp.LJIIIZ);
        if (LIZ != null) {
            LIZ.onSuccess((PanelInfoModel) aqS162S0200000_15.l1);
        }
        XDP xdp2 = (XDP) aqS162S0200000_15.l0;
        xdp2.LJII.LJJJ.LIZJ(xdp2.LJIIIZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$56(AqS162S0200000_15 aqS162S0200000_15) {
        XDZ xdz = ((XE8) aqS162S0200000_15.l0).LIZ;
        XDR LIZ = xdz.LJIIL.LJJJ.LIZ(xdz.LJIILJJIL);
        if (LIZ != null) {
            LIZ.onFail(null, (C84418XBe) aqS162S0200000_15.l1);
        }
        XDZ xdz2 = ((XE8) aqS162S0200000_15.l0).LIZ;
        xdz2.LJIIL.LJJJ.LIZJ(xdz2.LJIILJJIL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$57(AqS162S0200000_15 aqS162S0200000_15) {
        C30941Ji c30941Ji = C84459XCt.LJIIIZ;
        c30941Ji.LIZIZ();
        try {
            ArrayList<InterfaceC84461XCv> remove = C84459XCt.LJIIJ.remove(((C84459XCt) aqS162S0200000_15.l0).LJII.getId());
            c30941Ji.LIZLLL();
            C84459XCt c84459XCt = (C84459XCt) aqS162S0200000_15.l0;
            XDR LIZ = c84459XCt.LJI.LJJJ.LIZ(c84459XCt.LJIIIIZZ);
            if (LIZ != null) {
                LIZ.onSuccess((ProviderEffect) aqS162S0200000_15.l1);
            }
            C84459XCt c84459XCt2 = (C84459XCt) aqS162S0200000_15.l0;
            c84459XCt2.LJI.LJJJ.LIZJ(c84459XCt2.LJIIIIZZ);
            if (remove != null) {
                Iterator<InterfaceC84461XCv> it = remove.iterator();
                while (it.hasNext()) {
                    it.next().onSuccess((ProviderEffect) aqS162S0200000_15.l1);
                }
            }
            return C76800UCe.LIZ;
        } catch (Throwable th) {
            c30941Ji.LIZLLL();
            throw th;
        }
    }

    public static final Object invoke$58(AqS162S0200000_15 aqS162S0200000_15) {
        XDV xdv = (XDV) aqS162S0200000_15.l0;
        XDR LIZ = xdv.LJI.LJJJ.LIZ(xdv.LJIIIIZZ);
        if (LIZ != null) {
            LIZ.onFail(null, (C84418XBe) aqS162S0200000_15.l1);
        }
        XDV xdv2 = (XDV) aqS162S0200000_15.l0;
        xdv2.LJI.LJJJ.LIZJ(xdv2.LJIIIIZZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$59(AqS162S0200000_15 aqS162S0200000_15) {
        ((XDR) aqS162S0200000_15.l0).onSuccess((GifProviderEffectListResponse) aqS162S0200000_15.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS162S0200000_15 aqS162S0200000_15) {
        ((TTKAgeGateRegistrationFragment) aqS162S0200000_15.l0).Ll(((PNSNavButton) aqS162S0200000_15.l1).getActionUrl());
        return C76800UCe.LIZ;
    }

    public static final Object invoke$60(AqS162S0200000_15 aqS162S0200000_15) {
        C84460XCu c84460XCu = (C84460XCu) aqS162S0200000_15.l0;
        XDR LIZ = c84460XCu.LJI.LJJJ.LIZ(c84460XCu.LJIIIIZZ);
        if (LIZ != null) {
            LIZ.onFail(((C84460XCu) aqS162S0200000_15.l0).LJII, (C84418XBe) aqS162S0200000_15.l1);
        }
        C84460XCu c84460XCu2 = (C84460XCu) aqS162S0200000_15.l0;
        c84460XCu2.LJI.LJJJ.LIZJ(c84460XCu2.LJIIIIZZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$61(AqS162S0200000_15 aqS162S0200000_15) {
        XDV xdv = (XDV) aqS162S0200000_15.l0;
        XDR LIZ = xdv.LJI.LJJJ.LIZ(xdv.LJIIIIZZ);
        if (LIZ != null) {
            LIZ.onSuccess((EffectChannelResponse) aqS162S0200000_15.l1);
        }
        XDV xdv2 = (XDV) aqS162S0200000_15.l0;
        xdv2.LJI.LJJJ.LIZJ(xdv2.LJIIIIZZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$62(AqS162S0200000_15 aqS162S0200000_15) {
        C84460XCu c84460XCu = (C84460XCu) aqS162S0200000_15.l0;
        XDR LIZ = c84460XCu.LJI.LJJJ.LIZ(c84460XCu.LJIIIIZZ);
        if (LIZ != null) {
            LIZ.onSuccess((ProviderEffect) aqS162S0200000_15.l1);
        }
        C84460XCu c84460XCu2 = (C84460XCu) aqS162S0200000_15.l0;
        c84460XCu2.LJI.LJJJ.LIZJ(c84460XCu2.LJIIIIZZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$63(AqS162S0200000_15 aqS162S0200000_15) {
        XCR xcr = (XCR) aqS162S0200000_15.l0;
        XDR xdr = xcr.LIZJ;
        if (xdr != null) {
            xdr.onFail(xcr.LIZLLL, new C84418XBe((Exception) aqS162S0200000_15.l1));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$64(AqS162S0200000_15 aqS162S0200000_15) {
        Object LIZ;
        Activity LJIIIIZZ;
        ActivityC45651qj activityC45651qj;
        C119904nC LJ;
        InnerPushPopupWindow innerPushPopupWindow;
        InnerPushMessage innerPushMessage = (InnerPushMessage) aqS162S0200000_15.l0;
        C86507XxH c86507XxH = (C86507XxH) aqS162S0200000_15.l1;
        try {
            LJIIIIZZ = C84763XOl.LJIIIIZZ();
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (!(LJIIIIZZ instanceof ActivityC45651qj) || (activityC45651qj = (ActivityC45651qj) LJIIIIZZ) == null || activityC45651qj.isFinishing() || activityC45651qj.isDestroyed() || C57419MgB.LJ(activityC45651qj) == null) {
            C86478Xwo.LIZIZ("InnerPushWindowManager", "popup but ctx invalid, rollback queue");
            HandlerC86501XxB.LIZIZ(HandlerC86501XxB.LIZ, innerPushMessage, 0L, 2);
            return C76800UCe.LIZ;
        }
        WeakReference<InnerPushPopupWindow> weakReference = c86507XxH.LIZ;
        if (weakReference != null && (innerPushPopupWindow = weakReference.get()) != null) {
            innerPushPopupWindow.dismiss();
        }
        InnerPushPopupWindow innerPushPopupWindow2 = new InnerPushPopupWindow(activityC45651qj);
        C86482Xws c86482Xws = new C86482Xws(innerPushPopupWindow2, activityC45651qj);
        c86482Xws.LIZIZ(innerPushMessage);
        InterfaceC86486Xww LIZ2 = C58242MtS.LIZ(innerPushMessage.getType());
        if (LIZ2 != null && (LJ = LIZ2.LJ(c86507XxH, innerPushMessage)) != null) {
            c86482Xws.LIZ(LJ);
        }
        innerPushPopupWindow2.setOnDismissListener(new C57184McO(innerPushMessage));
        innerPushPopupWindow2.LIZLLL(c86482Xws, innerPushMessage);
        c86507XxH.LIZ = new WeakReference<>(innerPushPopupWindow2);
        LIZ = C76800UCe.LIZ;
        C3C5.m7constructorimpl(LIZ);
        InnerPushMessage innerPushMessage2 = (InnerPushMessage) aqS162S0200000_15.l0;
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            C86496Xx6.LJIIIIZZ(innerPushMessage2, "show_push_message", m10exceptionOrNullimpl.getMessage());
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$65(AqS162S0200000_15 aqS162S0200000_15) {
        int i;
        int i2;
        int i3;
        XS7 xs7 = (XS7) aqS162S0200000_15.l0;
        Throwable it = (Throwable) aqS162S0200000_15.l1;
        o.LJIIIIZZ(it, "it");
        xs7.getClass();
        H78.LJ(it);
        if (it instanceof TimeoutException) {
            VideoPublishEditModel videoPublishEditModel = xs7.LIZ;
            long j = xs7.LJIILLIIL;
            if (xs7.LIZIZ == null) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            H8F.LJIILLIIL(videoPublishEditModel, j, "exceed", i3, xs7.LJIIZILJ);
            xs7.LJIIL(2);
            XSB xsb = xs7.LJII;
            if (xsb != null) {
                xsb.D7();
            }
        } else if (it instanceof XSC) {
            XSC xsc = (XSC) it;
            if (xsc.getStep() == 50 && xsc.getErrorCode() == 2172) {
                XSB xsb2 = xs7.LJII;
                if (xsb2 != null) {
                    xsb2.qb();
                }
            } else {
                XSB xsb3 = xs7.LJII;
                if (xsb3 != null) {
                    xsb3.D7();
                }
            }
            VideoPublishEditModel videoPublishEditModel2 = xs7.LIZ;
            long j2 = xs7.LJIILLIIL;
            if (xs7.LIZIZ == null) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            H8F.LJIILLIIL(videoPublishEditModel2, j2, "error", i2, xs7.LJIIZILJ);
            xs7.LJIIL(1);
        } else {
            VideoPublishEditModel videoPublishEditModel3 = xs7.LIZ;
            long j3 = xs7.LJIILLIIL;
            if (xs7.LIZIZ == null) {
                i = 0;
            } else {
                i = 1;
            }
            H8F.LJIILLIIL(videoPublishEditModel3, j3, "error", i, xs7.LJIIZILJ);
            xs7.LJIIL(1);
            XSB xsb4 = xs7.LJII;
            if (xsb4 != null) {
                xsb4.D7();
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$66(AqS162S0200000_15 aqS162S0200000_15) {
        return new XIJ((ActivityC45651qj) aqS162S0200000_15.l0, ((C34K) aqS162S0200000_15.l1).element, XIK.ACTIVITY);
    }

    public static final Object invoke$67(AqS162S0200000_15 aqS162S0200000_15) {
        return new XIJ((C8VZ) aqS162S0200000_15.l0, ((C34K) aqS162S0200000_15.l1).element, XIK.ASSEMBLE_COMPONENT);
    }

    public static final Object invoke$68(AqS162S0200000_15 aqS162S0200000_15) {
        return new XIJ((Fragment) aqS162S0200000_15.l0, ((C34K) aqS162S0200000_15.l1).element, XIK.FRAGMENT);
    }

    public static final Object invoke$69(AqS162S0200000_15 aqS162S0200000_15) {
        return new XIJ((UIAssem) aqS162S0200000_15.l0, ((C34K) aqS162S0200000_15.l1).element, XIK.UI_ASSEM);
    }

    public static /* bridge */ /* synthetic */ Object invoke$7(AqS162S0200000_15 aqS162S0200000_15) {
        aqS162S0200000_15.invoke$1();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$70(AqS162S0200000_15 aqS162S0200000_15) {
        C86581XyT c86581XyT = (C86581XyT) aqS162S0200000_15.l0;
        List<User> list = (List) aqS162S0200000_15.l1;
        c86581XyT.getClass();
        o.LJIIIZ(list, "<set-?>");
        c86581XyT.LJLIL = list;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$71(AqS162S0200000_15 aqS162S0200000_15) {
        C86581XyT c86581XyT = (C86581XyT) aqS162S0200000_15.l0;
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList((List) aqS162S0200000_15.l1);
        c86581XyT.getClass();
        c86581XyT.LJLIL = copyOnWriteArrayList;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$72(AqS162S0200000_15 aqS162S0200000_15) {
        C86581XyT c86581XyT = (C86581XyT) aqS162S0200000_15.l0;
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        c86581XyT.getClass();
        c86581XyT.LJLIL = copyOnWriteArrayList;
        ((C86581XyT) aqS162S0200000_15.l0).LJLIL.addAll((List) aqS162S0200000_15.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$73(AqS162S0200000_15 aqS162S0200000_15) {
        return new XIJ((ReusedUIAssem) aqS162S0200000_15.l0, ((C34K) aqS162S0200000_15.l1).element, XIK.REUSED_UIASSEM);
    }

    public static final Object invoke$74(AqS162S0200000_15 aqS162S0200000_15) {
        ((C85069Xa5) aqS162S0200000_15.l0).LIZ.LJ((XOX) aqS162S0200000_15.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$75(AqS162S0200000_15 aqS162S0200000_15) {
        Editable text = ((EditText) aqS162S0200000_15.l1).getText();
        if (text != null && text.length() != 0) {
            ((InterfaceC86816Y5k) ((AqS146S0200000_15) aqS162S0200000_15.l0).l0).setClearButton(true);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$76(AqS162S0200000_15 aqS162S0200000_15) {
        Editable text = ((EditText) aqS162S0200000_15.l1).getText();
        if (text != null && text.length() != 0) {
            ((InterfaceC86816Y5k) ((AqS146S0200000_15) aqS162S0200000_15.l0).l0).setClearButton(true);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$77(AqS162S0200000_15 aqS162S0200000_15) {
        Editable text = ((EditText) aqS162S0200000_15.l1).getText();
        if (text != null && text.length() != 0) {
            ((InterfaceC86816Y5k) ((AqS146S0200000_15) aqS162S0200000_15.l0).l0).setClearButton(true);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$78(AqS162S0200000_15 aqS162S0200000_15) {
        ReuseAudioPlayer reuseAudioPlayer = ((ReuseAudioViewModel) aqS162S0200000_15.l0).LJLJL;
        if (reuseAudioPlayer != null) {
            C47325Ihl c47325Ihl = new C47325Ihl();
            c47325Ihl.LIZIZ = ((com.ss.android.ugc.aweme.base.model.UrlModel) aqS162S0200000_15.l1).getUrlList();
            c47325Ihl.LJI = true;
            reuseAudioPlayer.LJLIL.LIZLLL(c47325Ihl);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$79(AqS162S0200000_15 aqS162S0200000_15) {
        if (C84492XEa.LIZIZ == null) {
            String string = Keva.getRepo("FullEpisodeBackgroundUtils").getString("podcast_bg_effect", "");
            if (C78685UuP.LJJJZ(string)) {
                try {
                    com.ss.android.ugc.effectmanager.effect.model.Effect effect = (com.ss.android.ugc.effectmanager.effect.model.Effect) new C38341F2z(com.ss.android.ugc.effectmanager.effect.model.Effect.class).LIZ(string);
                    if (effect != null && ((InterfaceC84498XEg) aqS162S0200000_15.l1).LJJIL(effect)) {
                        C84492XEa.LIZIZ = effect;
                    }
                } catch (Exception unused) {
                }
            }
        }
        ((InterfaceC88472Yns) aqS162S0200000_15.l0).invoke(C84492XEa.LIZIZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS162S0200000_15 aqS162S0200000_15) {
        C234509Ig c234509Ig = new C234509Ig();
        String content = ((PNSNavButton) aqS162S0200000_15.l0).getContent();
        if (content == null) {
            content = "";
        }
        c234509Ig.LIZJ = content;
        c234509Ig.LJFF = true;
        c234509Ig.LJ = true;
        c234509Ig.LIZ(EnumC252729vw.SECONDARY);
        new C109824Ss(new AqS162S0200000_15((TTKAgeGateRegistrationFragment) aqS162S0200000_15.l1, (PNSNavButton) aqS162S0200000_15.l0, 9));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$80(AqS162S0200000_15 aqS162S0200000_15) {
        Uri LIZ;
        C86229Xsn c86229Xsn = (C86229Xsn) aqS162S0200000_15.l0;
        String str = ((C86236Xsu) aqS162S0200000_15.l1).LJIIL;
        Activity activity = c86229Xsn.LIZ.get();
        if (activity == null) {
            c86229Xsn.LIZIZ.LIZ(0, "Activity obtained is null");
        } else {
            Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
            if (o.LJ(str, "front")) {
                intent.putExtra("android.intent.extras.CAMERA_FACING", 1);
                intent.putExtra("android.intent.extras.LENS_FACING_FRONT", 1);
                intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
                intent.putExtra("default_camera", "1");
                intent.putExtra("default_mode", "com.huawei.camera2.mode.photo.PhotoMode");
                intent.putExtra("camerafacing", "front");
                intent.putExtra("previous_mode", "front");
            }
            String LJFF = i0.LJFF("Dou_fsm_", new SimpleDateFormat("yyyy-MMdd_HHmmss", Locale.ENGLISH).format(new Date()));
            if (c86229Xsn.LIZJ) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(LJFF);
                LIZ2.append(".mp4");
                LIZ = C268613q.LJFF(activity, X1D.LIZIZ(LIZ2));
                o.LJIIIIZZ(LIZ, "{\n            BdMediaFil…oFileName.mp4\")\n        }");
            } else {
                File createTempFile = File.createTempFile(LJFF, ".mp4", new C268313n(EnumC46497IMr.CACHE.getToken()));
                c86229Xsn.LIZLLL = createTempFile.getAbsolutePath();
                LIZ = C40680Fxs.LIZ(activity, createTempFile);
                o.LJIIIIZZ(LIZ, "{\n            val storag…rUri(ctx, file)\n        }");
            }
            intent.putExtra("output", LIZ);
            intent.putExtra("pns.sandbox.dataflow_id", 1207965442);
            C16880lQ.LJFF(activity, 800, intent);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$81(AqS162S0200000_15 aqS162S0200000_15) {
        Activity mo49getActivity = ((InterfaceC85801Xlt) aqS162S0200000_15.l0).mo49getActivity();
        J9P.LIZIZ(mo49getActivity, "settings_page", "click_setting", null, new IDgS140S0200000_15(mo49getActivity, (HashSet) aqS162S0200000_15.l1, 2));
        C46340IGq.LIZ("settings_page", "click_setting");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$82(AqS162S0200000_15 aqS162S0200000_15) {
        int i;
        if (Build.VERSION.SDK_INT >= 23) {
            i = 201326592;
        } else {
            i = 134217728;
        }
        Context context = ((XO9) aqS162S0200000_15.l0).LJII;
        Intent intent = new Intent();
        intent.setComponent((ComponentName) aqS162S0200000_15.l1);
        intent.putExtra("command_from_notification", 2);
        return PendingIntent.getBroadcast(context, 2, intent, i);
    }

    public static final Object invoke$83(AqS162S0200000_15 aqS162S0200000_15) {
        int i;
        if (Build.VERSION.SDK_INT >= 23) {
            i = 201326592;
        } else {
            i = 134217728;
        }
        Context context = ((XO9) aqS162S0200000_15.l0).LJII;
        Intent intent = new Intent();
        intent.setComponent((ComponentName) aqS162S0200000_15.l1);
        intent.putExtra("command_from_notification", 1);
        return PendingIntent.getBroadcast(context, 1, intent, i);
    }

    public static final Object invoke$84(AqS162S0200000_15 aqS162S0200000_15) {
        if (Build.VERSION.SDK_INT >= 31) {
            XO9 xo9 = (XO9) aqS162S0200000_15.l0;
            ComponentName componentName = (ComponentName) aqS162S0200000_15.l1;
            Context context = C16880lQ.LLLLL(xo9.LJII);
            o.LJFF(context, "context");
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage != null) {
                PendingIntent activity = PendingIntent.getActivity(context, 3, launchIntentForPackage, 201326592);
                o.LJFF(activity, "PendingIntent.getActivit…ingIntent.FLAG_IMMUTABLE)");
                return activity;
            }
            return xo9.LIZ(componentName);
        }
        return ((XO9) aqS162S0200000_15.l0).LIZ((ComponentName) aqS162S0200000_15.l1);
    }

    public static final Object invoke$85(AqS162S0200000_15 aqS162S0200000_15) {
        return C15100iY.LIZ(((XO9) aqS162S0200000_15.l0).LJII, (ComponentName) aqS162S0200000_15.l1, 512L);
    }

    public static final Object invoke$86(AqS162S0200000_15 aqS162S0200000_15) {
        return C15100iY.LIZ(((XO9) aqS162S0200000_15.l0).LJII, (ComponentName) aqS162S0200000_15.l1, 32L);
    }

    public static final Object invoke$87(AqS162S0200000_15 aqS162S0200000_15) {
        return C15100iY.LIZ(((XO9) aqS162S0200000_15.l0).LJII, (ComponentName) aqS162S0200000_15.l1, 16L);
    }

    public static final Object invoke$88(AqS162S0200000_15 aqS162S0200000_15) {
        ((ActivityC86117Xqz) aqS162S0200000_15.l0).activityRef = new WeakReference<>((ActivityC86117Xqz) aqS162S0200000_15.l0);
        BaseActivityViewModel baseViewModel = ((ActivityC86117Xqz) aqS162S0200000_15.l0).getBaseViewModel();
        if (!baseViewModel.initialized) {
            ((ActivityC86117Xqz) aqS162S0200000_15.l0).buildCommonIntent();
            baseViewModel.init();
        }
        C86140XrM c86140XrM = ActivityC86117Xqz.callback;
        ActivityC86117Xqz activity = (ActivityC86117Xqz) aqS162S0200000_15.l0;
        Bundle bundle = (Bundle) aqS162S0200000_15.l1;
        c86140XrM.getClass();
        o.LJIIIZ(activity, "activity");
        C86140XrM.LIZ(c86140XrM, activity, true, null, new IDqS439S0100000_15(bundle, 14), 4);
        super/*X.KMV*/.onCreate((Bundle) aqS162S0200000_15.l1);
        ActivityC86117Xqz activity2 = (ActivityC86117Xqz) aqS162S0200000_15.l0;
        Bundle bundle2 = (Bundle) aqS162S0200000_15.l1;
        o.LJIIIZ(activity2, "activity");
        C86140XrM.LIZ(c86140XrM, activity2, false, null, new IDqS439S0100000_15(bundle2, 12), 6);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [T, X.YAR] */
    public static final Object invoke$89(AqS162S0200000_15 aqS162S0200000_15) {
        C68322mC c68322mC = (C68322mC) aqS162S0200000_15.l0;
        YAT yat = (YAT) aqS162S0200000_15.l1;
        float f = 2;
        float f2 = (yat.LIZJ / f) + yat.LJI;
        float height = yat.getBounds().height();
        YAT yat2 = (YAT) aqS162S0200000_15.l1;
        float f3 = height - (yat2.LIZJ / f);
        float f4 = yat2.LJI;
        c68322mC.element = new YAR(f2, f3 - f4, f4, 1.5707964f);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS162S0200000_15 aqS162S0200000_15) {
        ((TTKAgeGateRegistrationFragment) aqS162S0200000_15.l0).Ll(((PNSNavButton) aqS162S0200000_15.l1).getActionUrl());
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [T, X.YAS] */
    public static final Object invoke$90(AqS162S0200000_15 aqS162S0200000_15) {
        C68322mC c68322mC = (C68322mC) aqS162S0200000_15.l0;
        YAT yat = (YAT) aqS162S0200000_15.l1;
        float f = 2;
        float f2 = yat.LIZJ / f;
        float height = yat.getBounds().height();
        YAT yat2 = (YAT) aqS162S0200000_15.l1;
        c68322mC.element = new YAS(f2, (height - (yat2.LIZJ / f)) - yat2.LJI);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [T, X.YAR] */
    public static final Object invoke$91(AqS162S0200000_15 aqS162S0200000_15) {
        C68322mC c68322mC = (C68322mC) aqS162S0200000_15.l0;
        YAT yat = (YAT) aqS162S0200000_15.l1;
        float f = yat.LIZJ / 2;
        float f2 = yat.LJ;
        float f3 = f + f2;
        c68322mC.element = new YAR(f3, f3, f2, 3.1415927f);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [T, X.YAS] */
    public static final Object invoke$92(AqS162S0200000_15 aqS162S0200000_15) {
        C68322mC c68322mC = (C68322mC) aqS162S0200000_15.l0;
        YAT yat = (YAT) aqS162S0200000_15.l1;
        float f = yat.LIZJ / 2;
        c68322mC.element = new YAS(yat.LJ + f, f);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [T, X.YAR] */
    public static final Object invoke$93(AqS162S0200000_15 aqS162S0200000_15) {
        C68322mC c68322mC = (C68322mC) aqS162S0200000_15.l0;
        float width = ((YAT) aqS162S0200000_15.l1).getBounds().width();
        YAT yat = (YAT) aqS162S0200000_15.l1;
        float f = yat.LIZJ / 2;
        float f2 = yat.LJFF;
        c68322mC.element = new YAR((width - f) - f2, f + f2, f2, 4.712389f);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [T, X.YAS] */
    public static final Object invoke$94(AqS162S0200000_15 aqS162S0200000_15) {
        C68322mC c68322mC = (C68322mC) aqS162S0200000_15.l0;
        float width = ((YAT) aqS162S0200000_15.l1).getBounds().width();
        YAT yat = (YAT) aqS162S0200000_15.l1;
        float f = yat.LIZJ / 2;
        c68322mC.element = new YAS(width - f, f + yat.LJFF);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [T, X.YAR] */
    public static final Object invoke$95(AqS162S0200000_15 aqS162S0200000_15) {
        C68322mC c68322mC = (C68322mC) aqS162S0200000_15.l0;
        float width = ((YAT) aqS162S0200000_15.l1).getBounds().width();
        YAT yat = (YAT) aqS162S0200000_15.l1;
        float f = 2;
        float f2 = (width - (yat.LIZJ / f)) - yat.LJII;
        float height = yat.getBounds().height();
        YAT yat2 = (YAT) aqS162S0200000_15.l1;
        float f3 = height - (yat2.LIZJ / f);
        float f4 = yat2.LJII;
        c68322mC.element = new YAR(f2, f3 - f4, f4, 0.0f);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [T, X.YAS] */
    public static final Object invoke$96(AqS162S0200000_15 aqS162S0200000_15) {
        C68322mC c68322mC = (C68322mC) aqS162S0200000_15.l0;
        float width = ((YAT) aqS162S0200000_15.l1).getBounds().width();
        YAT yat = (YAT) aqS162S0200000_15.l1;
        float f = 2;
        c68322mC.element = new YAS((width - (yat.LIZJ / f)) - yat.LJII, yat.getBounds().height() - (((YAT) aqS162S0200000_15.l1).LIZJ / f));
        return C76800UCe.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS162S0200000_15(com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKAgeGateRegistrationFragment r3, com.ss.android.ugc.aweme.pns.agegate.data.PNSNavButton r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 6: goto Lf;
                case 7: goto Lf;
                case 8: goto L5;
                case 9: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r0 = 0
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r0 = 0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS162S0200000_15.<init>(com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKAgeGateRegistrationFragment, com.ss.android.ugc.aweme.pns.agegate.data.PNSNavButton, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS162S0200000_15(com.ss.android.ugc.aweme.compliance.business.agegate.view.AgeGateFragment r3, com.ss.android.ugc.aweme.pns.agegate.data.PNSNavButton r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 12: goto Lf;
                case 13: goto Lf;
                case 14: goto L5;
                case 15: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r0 = 0
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r0 = 0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS162S0200000_15.<init>(com.ss.android.ugc.aweme.compliance.business.agegate.view.AgeGateFragment, com.ss.android.ugc.aweme.pns.agegate.data.PNSNavButton, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(ActivityC45651qj activityC45651qj, C34K c34k, int i) {
        super(0);
        this.$t = i;
        this.l0 = activityC45651qj;
        this.l1 = c34k;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS162S0200000_15(C68322mC c68322mC, C68322mC<YAR> c68322mC2, YAT yat) {
        super(0);
        this.$t = yat;
        this.l0 = c68322mC;
        this.l1 = c68322mC2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(C8VZ c8vz, C34K c34k, int i) {
        super(0);
        this.$t = i;
        this.l0 = c8vz;
        this.l1 = c34k;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(InterfaceC55347Lnr interfaceC55347Lnr, SearchLiveCardViewHolder searchLiveCardViewHolder, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC55347Lnr;
        this.l1 = searchLiveCardViewHolder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(X5Q x5q, DownloadTask downloadTask, int i) {
        super(0);
        this.$t = i;
        this.l0 = x5q;
        this.l1 = downloadTask;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(XBH xbh, C68322mC c68322mC, int i) {
        super(0);
        this.$t = i;
        this.l0 = xbh;
        this.l1 = c68322mC;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(XCR xcr, Exception exc, int i) {
        super(0);
        this.$t = i;
        this.l0 = xcr;
        this.l1 = exc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(XCV xcv, C84418XBe c84418XBe, int i) {
        super(0);
        this.$t = i;
        this.l0 = xcv;
        this.l1 = c84418XBe;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(XCV xcv, C84430XBq c84430XBq, int i) {
        super(0);
        this.$t = i;
        this.l0 = xcv;
        this.l1 = c84430XBq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(XCW xcw, C84418XBe c84418XBe, int i) {
        super(0);
        this.$t = i;
        this.l0 = xcw;
        this.l1 = c84418XBe;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(XCW xcw, List list, int i) {
        super(0);
        this.$t = i;
        this.l0 = xcw;
        this.l1 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(C84459XCt c84459XCt, C84418XBe c84418XBe, int i) {
        super(0);
        this.$t = i;
        this.l0 = c84459XCt;
        this.l1 = c84418XBe;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(C84459XCt c84459XCt, ProviderEffect providerEffect, int i) {
        super(0);
        this.$t = i;
        this.l0 = c84459XCt;
        this.l1 = providerEffect;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(C84460XCu c84460XCu, C84418XBe c84418XBe, int i) {
        super(0);
        this.$t = i;
        this.l0 = c84460XCu;
        this.l1 = c84418XBe;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(C84460XCu c84460XCu, ProviderEffect providerEffect, int i) {
        super(0);
        this.$t = i;
        this.l0 = c84460XCu;
        this.l1 = providerEffect;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(XDF xdf, C84418XBe c84418XBe, int i) {
        super(0);
        this.$t = i;
        this.l0 = xdf;
        this.l1 = c84418XBe;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(XDF xdf, Object obj, int i) {
        super(0);
        this.$t = i;
        this.l0 = xdf;
        this.l1 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(XDO xdo, C84418XBe c84418XBe, int i) {
        super(0);
        this.$t = i;
        this.l0 = xdo;
        this.l1 = c84418XBe;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(XDO xdo, PanelInfoModel panelInfoModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = xdo;
        this.l1 = panelInfoModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(XDP xdp, C84418XBe c84418XBe, int i) {
        super(0);
        this.$t = i;
        this.l0 = xdp;
        this.l1 = c84418XBe;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(XDP xdp, PanelInfoModel panelInfoModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = xdp;
        this.l1 = panelInfoModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(XDR xdr, GifProviderEffectListResponse gifProviderEffectListResponse, int i) {
        super(0);
        this.$t = i;
        this.l0 = xdr;
        this.l1 = gifProviderEffectListResponse;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(XDV xdv, C84418XBe c84418XBe, int i) {
        super(0);
        this.$t = i;
        this.l0 = xdv;
        this.l1 = c84418XBe;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(XDV xdv, EffectChannelResponse effectChannelResponse, int i) {
        super(0);
        this.$t = i;
        this.l0 = xdv;
        this.l1 = effectChannelResponse;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(XDW xdw, C84418XBe c84418XBe, int i) {
        super(0);
        this.$t = i;
        this.l0 = xdw;
        this.l1 = c84418XBe;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(XDW xdw, EffectChannelResponse effectChannelResponse, int i) {
        super(0);
        this.$t = i;
        this.l0 = xdw;
        this.l1 = effectChannelResponse;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(XDZ xdz, C84418XBe c84418XBe, int i) {
        super(0);
        this.$t = i;
        this.l0 = xdz;
        this.l1 = c84418XBe;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(XDZ xdz, EffectListResponse effectListResponse, int i) {
        super(0);
        this.$t = i;
        this.l0 = xdz;
        this.l1 = effectListResponse;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(C84466XDa c84466XDa, EffectListResponse effectListResponse, int i) {
        super(0);
        this.$t = i;
        this.l0 = c84466XDa;
        this.l1 = effectListResponse;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(C84468XDc c84468XDc, C84418XBe c84418XBe, int i) {
        super(0);
        this.$t = i;
        this.l0 = c84468XDc;
        this.l1 = c84418XBe;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(C84468XDc c84468XDc, CategoryPageModel categoryPageModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = c84468XDc;
        this.l1 = categoryPageModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(C84469XDd c84469XDd, C84418XBe c84418XBe, int i) {
        super(0);
        this.$t = i;
        this.l0 = c84469XDd;
        this.l1 = c84418XBe;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(C84469XDd c84469XDd, PanelInfoModel panelInfoModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = c84469XDd;
        this.l1 = panelInfoModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(C84477XDl c84477XDl, C84418XBe c84418XBe, int i) {
        super(0);
        this.$t = i;
        this.l0 = c84477XDl;
        this.l1 = c84418XBe;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(C84479XDn c84479XDn, C84418XBe c84418XBe, int i) {
        super(0);
        this.$t = i;
        this.l0 = c84479XDn;
        this.l1 = c84418XBe;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(C84479XDn c84479XDn, Effect effect, int i) {
        super(0);
        this.$t = i;
        this.l0 = c84479XDn;
        this.l1 = effect;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(C84485XDt c84485XDt, C84418XBe c84418XBe, int i) {
        super(0);
        this.$t = i;
        this.l0 = c84485XDt;
        this.l1 = c84418XBe;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(C84485XDt c84485XDt, HashMap hashMap, int i) {
        super(0);
        this.$t = i;
        this.l0 = c84485XDt;
        this.l1 = hashMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(C84486XDu c84486XDu, C84418XBe c84418XBe, int i) {
        super(0);
        this.$t = i;
        this.l0 = c84486XDu;
        this.l1 = c84418XBe;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(C84486XDu c84486XDu, EffectChannelResponse effectChannelResponse, int i) {
        super(0);
        this.$t = i;
        this.l0 = c84486XDu;
        this.l1 = effectChannelResponse;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(XE8 xe8, C84418XBe c84418XBe, int i) {
        super(0);
        this.$t = i;
        this.l0 = xe8;
        this.l1 = c84418XBe;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(InterfaceC84498XEg interfaceC84498XEg, AqS55S1200000_15 aqS55S1200000_15, int i) {
        super(0);
        this.$t = i;
        this.l0 = aqS55S1200000_15;
        this.l1 = interfaceC84498XEg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(XO9 xo9, ComponentName componentName, int i) {
        super(0);
        this.$t = i;
        this.l0 = xo9;
        this.l1 = componentName;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(XS7 xs7, Throwable th, int i) {
        super(0);
        this.$t = i;
        this.l0 = xs7;
        this.l1 = th;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(C85069Xa5 c85069Xa5, XOX xox, int i) {
        super(0);
        this.$t = i;
        this.l0 = c85069Xa5;
        this.l1 = xox;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(C85712XkS c85712XkS, BindEmailWithoutVerifyFragment bindEmailWithoutVerifyFragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = c85712XkS;
        this.l1 = bindEmailWithoutVerifyFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(C85712XkS c85712XkS, InputPhoneFragment inputPhoneFragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = c85712XkS;
        this.l1 = inputPhoneFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS162S0200000_15(InterfaceC85801Xlt interfaceC85801Xlt, InterfaceC85801Xlt interfaceC85801Xlt2, HashSet<AG6<AEC>> hashSet) {
        super(0);
        this.$t = hashSet;
        this.l0 = interfaceC85801Xlt;
        this.l1 = interfaceC85801Xlt2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(ActivityC86117Xqz activityC86117Xqz, Bundle bundle, int i) {
        super(0);
        this.$t = i;
        this.l0 = activityC86117Xqz;
        this.l1 = bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(C86229Xsn c86229Xsn, C86236Xsu c86236Xsu, int i) {
        super(0);
        this.$t = i;
        this.l0 = c86229Xsn;
        this.l1 = c86236Xsu;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS162S0200000_15(C86581XyT c86581XyT, C86581XyT c86581XyT2, List<User> list) {
        super(0);
        this.$t = list;
        this.l0 = c86581XyT;
        this.l1 = c86581XyT2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(Y5M y5m, Bitmap bitmap, int i) {
        super(0);
        this.$t = i;
        this.l0 = y5m;
        this.l1 = bitmap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS162S0200000_15(InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns<? super AbstractC57774Mlu<ITEM>, C76800UCe> interfaceC88472Yns2, AbstractC57774Mlu<ITEM> abstractC57774Mlu) {
        super(0);
        this.$t = abstractC57774Mlu;
        this.l0 = interfaceC88472Yns;
        this.l1 = interfaceC88472Yns2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(Fragment fragment, C34K c34k, int i) {
        super(0);
        this.$t = i;
        this.l0 = fragment;
        this.l1 = c34k;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(UIAssem uIAssem, C34K c34k, int i) {
        super(0);
        this.$t = i;
        this.l0 = uIAssem;
        this.l1 = c34k;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS162S0200000_15(ReusedUIAssem reusedUIAssem, Object obj, C34K c34k) {
        super(0);
        this.$t = c34k;
        this.l0 = reusedUIAssem;
        this.l1 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(RouteArgExtension.RouteArgLifecycle routeArgLifecycle, LifecycleOwner lifecycleOwner, int i) {
        super(0);
        this.$t = i;
        this.l1 = routeArgLifecycle;
        this.l0 = lifecycleOwner;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(IDubbingAbility iDubbingAbility, TranslationAbility translationAbility, int i) {
        super(0);
        this.$t = i;
        this.l0 = iDubbingAbility;
        this.l1 = translationAbility;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(PickPhotoUploadFeature pickPhotoUploadFeature, Activity activity, int i) {
        super(0);
        this.$t = i;
        this.l0 = pickPhotoUploadFeature;
        this.l1 = activity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS162S0200000_15(FeedLiveViewHolderNew feedLiveViewHolderNew, FeedLiveViewHolderNew feedLiveViewHolderNew2, ArrayList<String> arrayList) {
        super(0);
        this.$t = arrayList;
        this.l0 = feedLiveViewHolderNew;
        this.l1 = feedLiveViewHolderNew2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS162S0200000_15(FeedLiveViewHolderOpt feedLiveViewHolderOpt, FeedLiveViewHolderOpt feedLiveViewHolderOpt2, ArrayList<String> arrayList) {
        super(0);
        this.$t = arrayList;
        this.l0 = feedLiveViewHolderOpt;
        this.l1 = feedLiveViewHolderOpt2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(InnerPushMessage innerPushMessage, C86507XxH c86507XxH, int i) {
        super(0);
        this.$t = i;
        this.l0 = innerPushMessage;
        this.l1 = c86507XxH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(ReuseAudioViewModel reuseAudioViewModel, com.ss.android.ugc.aweme.base.model.UrlModel urlModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = reuseAudioViewModel;
        this.l1 = urlModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(PoiSearchAssem poiSearchAssem, C34K c34k, int i) {
        super(0);
        this.$t = i;
        this.l0 = poiSearchAssem;
        this.l1 = c34k;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS162S0200000_15(PoiSearchAssem poiSearchAssem, PoiSearchAssem poiSearchAssem2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(0);
        this.$t = interfaceC65784Pro;
        this.l0 = poiSearchAssem;
        this.l1 = poiSearchAssem2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(PushPermissionPopupManager pushPermissionPopupManager, LVY lvy, int i) {
        super(0);
        this.$t = i;
        this.l0 = pushPermissionPopupManager;
        this.l1 = lvy;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(Effect effect, XDA xda, int i) {
        super(0);
        this.$t = i;
        this.l0 = effect;
        this.l1 = xda;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(FetchEffectListCheckedTask fetchEffectListCheckedTask, EffectChannelResponse effectChannelResponse, int i) {
        super(0);
        this.$t = i;
        this.l0 = fetchEffectListCheckedTask;
        this.l1 = effectChannelResponse;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(FetchPanelEffectListTask fetchPanelEffectListTask, EffectChannelResponse effectChannelResponse, int i) {
        super(0);
        this.$t = i;
        this.l0 = fetchPanelEffectListTask;
        this.l1 = effectChannelResponse;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS162S0200000_15(AqS146S0200000_15 aqS146S0200000_15, EditText editText, int i) {
        super(0);
        this.$t = i;
        this.l0 = aqS146S0200000_15;
        this.l1 = editText;
    }
}
