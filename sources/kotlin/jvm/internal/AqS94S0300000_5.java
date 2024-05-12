package kotlin.jvm.internal;

import X.AbstractC32415Cnr;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.BAF;
import X.BJM;
import X.BZI;
import X.C03880Dg;
import X.C04330Ez;
import X.C0NB;
import X.C15380j0;
import X.C16880lQ;
import X.C28787BRn;
import X.C29159BcR;
import X.C29166BcY;
import X.C29174Bcg;
import X.C29306Beo;
import X.C29393BgD;
import X.C29689Bkz;
import X.C30799C6x;
import X.C30868C9o;
import X.C31419CUt;
import X.C31421CUv;
import X.C31422CUw;
import X.C31423CUx;
import X.C31424CUy;
import X.C31458CWg;
import X.C31459CWh;
import X.C31463CWl;
import X.C31556Ca0;
import X.C31593Cab;
import X.C32257ClJ;
import X.C32279Clf;
import X.C32280Clg;
import X.C32364Cn2;
import X.C32399Cnb;
import X.C32500CpE;
import X.C32507CpL;
import X.C32785Ctp;
import X.C32801Cu5;
import X.C32802Cu6;
import X.C32804Cu8;
import X.C32813CuH;
import X.C32816CuK;
import X.C32823CuR;
import X.C32825CuT;
import X.C47071t1;
import X.C51029K0z;
import X.C65300Pk0;
import X.C68322mC;
import X.C74740TUy;
import X.C76800UCe;
import X.C76950UHy;
import X.C77800Ug8;
import X.C78857UxB;
import X.C78862UxG;
import X.C79081V1x;
import X.CC4;
import X.CCW;
import X.CN1;
import X.CQQ;
import X.CQW;
import X.CUH;
import X.CV1;
import X.EnumC32408Cnk;
import X.InterfaceC30977CDt;
import X.InterfaceC32497CpB;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.InterfaceC92693kP;
import X.P34;
import X.Q0C;
import X.UI4;
import X.UV2;
import X.UV8;
import X.UVP;
import X.V16;
import X.X1D;
import X.Z8D;
import Y.ACListenerS40S0200000_5;
import Y.IDcS16S0300000_5;
import Y.IDcS93S0200000_5;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.media.projection.MediaProjectionManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.wallet.IWalletException;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.chatroom.api.LiveSubOnlyConfig;
import com.bytedance.android.livesdk.dataChannel.MockGiftPollEvent;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.setting.SubscriptionSettingFragmentNew;
import com.bytedance.android.livesdk.interaction.poll.selectpoll.SelectPollViewModel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSubsPayoutOnboardingUrlSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftPanelBanner;
import com.bytedance.android.livesdk.subscribe.model.GetSubInfoResponse;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.zhiliaoapp.musically.R;
import java.lang.ref.Reference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import tikcast.api.wallet.tiktok.PayoutOnboardingDetailResult;
import webcast.api.sub.TemplateInfo;

/* loaded from: classes6.dex */
public class AqS94S0300000_5 extends AbstractC65781Prl implements InterfaceC65784Pro {
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
                return invoke$0();
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
            default:
                return null;
        }
    }

    public final View invoke$0() {
        ((CUH) this.l0).getClass();
        if (!(r0 instanceof CV1)) {
            View findViewById = ((View) this.l1).findViewById(R.id.bfx);
            C16880lQ.LJIIJ(new ACListenerS40S0200000_5((CQQ) this.l2, (CUH) this.l0, 0), findViewById);
            return findViewById;
        }
        return null;
    }

    public final void invoke$1() {
        Context context = ((Fragment) this.l0).getContext();
        Object obj = null;
        if (context != null) {
            obj = C16880lQ.LLILL(context, "media_projection");
        }
        if (obj instanceof MediaProjectionManager) {
            MediaProjectionManager mediaProjectionManager = (MediaProjectionManager) obj;
            boolean z = false;
            if (mediaProjectionManager != null) {
                C29159BcR c29159BcR = (C29159BcR) this.l1;
                Fragment fragment = (Fragment) this.l0;
                InterfaceC92693kP interfaceC92693kP = (InterfaceC92693kP) this.l2;
                c29159BcR.LIZ = "back_from_screen_share";
                try {
                    P34 p34 = C29174Bcg.LIZ;
                    C78862UxG LJJIIJ = C78857UxB.LJJIIJ(1476411393, "bpea-start_screen_capture_intent");
                    p34.getClass();
                    C16880lQ.LJII(fragment, P34.LIZIZ(mediaProjectionManager, LJJIIJ), 20001);
                    z = true;
                } catch (Q0C e) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("start dialog capture intent exception errorCode: ");
                    LIZ.append(e.getErrorCode());
                    LIZ.append(", msg: ");
                    LIZ.append(e.getMessage());
                    C0NB.LJ("GameStartLiveStrategy", X1D.LIZIZ(LIZ));
                }
                C29159BcR.LJIIIZ("start");
                interfaceC92693kP.dispose();
                if (z) {
                    return;
                }
            }
        }
        C29159BcR c29159BcR2 = (C29159BcR) this.l1;
        DataChannel LJIILIIL = C51029K0z.LJIILIIL((Fragment) this.l0);
        c29159BcR2.getClass();
        C29689Bkz c29689Bkz = C29689Bkz.LIZ;
        c29689Bkz.LJIIL(C29166BcY.LJLIL);
        c29689Bkz.LJIIJ(c29159BcR2.LIZIZ);
        c29159BcR2.LJIIJ(LJIILIIL);
    }

    public static final Object invoke$0(AqS94S0300000_5 aqS94S0300000_5) {
        String str;
        ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(((C32500CpE) aqS94S0300000_5.l1).LJLIL, UriProtector.parse(new C32364Cn2(((GiftPanelBanner) aqS94S0300000_5.l0).schemaUrl).LIZLLL()));
        long j = ((C32507CpL) aqS94S0300000_5.l2).LJFF;
        BZI LIZ = C28787BRn.LIZ("livesdk_gift_detail_page_entrance_click");
        LIZ.LJIIZILJ();
        LIZ.LJIJJ(Long.valueOf(j), "gift_id");
        LIZ.LJIJJ(C32257ClJ.LJ(), "user_id");
        if (C32257ClJ.LJI()) {
            str = "anchor";
        } else {
            str = "user";
        }
        LIZ.LJIJJ(str, "user_type");
        LIZ.LJJIIJZLJL();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS94S0300000_5 aqS94S0300000_5) {
        String str;
        ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveGameEffectHelper().getClass();
        boolean z = false;
        if (C79081V1x.LJJI()) {
            str = "live_goal";
        } else {
            ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveGameEffectHelper().getClass();
            if (C79081V1x.LJJIFFI()) {
                str = "background";
                z = true;
            } else {
                str = "effect";
            }
        }
        BAF.LJIIJJI(C51029K0z.LJIILIIL((Fragment) aqS94S0300000_5.l0), true, str);
        Context context = ((Fragment) aqS94S0300000_5.l0).getContext();
        if (context != null) {
            DataChannel dataChannel = (DataChannel) aqS94S0300000_5.l1;
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aqS94S0300000_5.l2;
            AqS60S1200000_5 aqS60S1200000_5 = new AqS60S1200000_5(interfaceC88472Yns, (InterfaceC88472Yns<? super Boolean, C76800UCe>) dataChannel, (DataChannel) str, (String) 2);
            AqS60S1200000_5 aqS60S1200000_52 = new AqS60S1200000_5(interfaceC88472Yns, (InterfaceC88472Yns<? super Boolean, C76800UCe>) dataChannel, (DataChannel) str, (String) 1);
            if (z) {
                BAF.LJJI(context, dataChannel, R.string.m9w, R.string.m9u, R.string.m9v, aqS60S1200000_5, aqS60S1200000_52);
            } else {
                BAF.LJJI(context, dataChannel, R.string.ks6, R.string.ks5, R.string.ks3, aqS60S1200000_5, aqS60S1200000_52);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(AqS94S0300000_5 aqS94S0300000_5) {
        LifecycleOwner lifecycleOwner;
        C77800Ug8.LJ("livesdk_anchor_pictionary_start_popup_show", (DataChannel) aqS94S0300000_5.l0);
        BAF.LJIIJJI(C51029K0z.LJIILIIL((Fragment) aqS94S0300000_5.l1), true, "QA");
        C47071t1 c47071t1 = new C47071t1(((Fragment) aqS94S0300000_5.l1).getContext());
        c47071t1.LIZIZ = (Fragment) aqS94S0300000_5.l1;
        c47071t1.LJIILL = false;
        c47071t1.LJIILJJIL = false;
        DataChannel dataChannel = (DataChannel) aqS94S0300000_5.l0;
        if (dataChannel != null) {
            lifecycleOwner = dataChannel.LJLJJI;
        } else {
            lifecycleOwner = null;
        }
        c47071t1.LIZIZ = lifecycleOwner;
        c47071t1.LJIILLIIL(R.string.kts);
        c47071t1.LJFF(R.string.kth);
        c47071t1.LJIIIZ(R.string.ktf, new IDcS93S0200000_5((DataChannel) aqS94S0300000_5.l0, (InterfaceC88472Yns) aqS94S0300000_5.l2, 6));
        c47071t1.LJIIL(R.string.kte, new IDcS93S0200000_5((DataChannel) aqS94S0300000_5.l0, (InterfaceC88472Yns) aqS94S0300000_5.l2, 7));
        LiveDialog LIZ = c47071t1.LIZ();
        if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "4115071473085874036")).LIZ) {
            LIZ.show();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(AqS94S0300000_5 aqS94S0300000_5) {
        LifecycleOwner lifecycleOwner;
        if (((IInteractService) aqS94S0300000_5.l0).Yu0() > 4) {
            ((InterfaceC88472Yns) aqS94S0300000_5.l1).invoke(Boolean.FALSE);
            BAF.LJIIJJI(C51029K0z.LJIILIIL((Fragment) aqS94S0300000_5.l2), false, "guest_connection_gird");
            C30868C9o.LIZJ(R.string.kti);
        } else {
            BAF.LJIIJJI(C51029K0z.LJIILIIL((Fragment) aqS94S0300000_5.l2), true, "guest_connection_gird");
            Context context = ((Fragment) aqS94S0300000_5.l2).getContext();
            if (context == null) {
                ((InterfaceC88472Yns) aqS94S0300000_5.l1).invoke(Boolean.FALSE);
            } else {
                C47071t1 c47071t1 = new C47071t1(context);
                c47071t1.LJIILLIIL(R.string.kts);
                c47071t1.LJFF(R.string.ktj);
                DataChannel LJIILIIL = C51029K0z.LJIILIIL((Fragment) aqS94S0300000_5.l2);
                if (LJIILIIL != null) {
                    lifecycleOwner = LJIILIIL.LJLJJI;
                } else {
                    lifecycleOwner = null;
                }
                c47071t1.LIZIZ = lifecycleOwner;
                c47071t1.LJIIIZ(R.string.ktk, new IDcS93S0200000_5((InterfaceC88472Yns) aqS94S0300000_5.l1, (Fragment) aqS94S0300000_5.l2, 5));
                c47071t1.LJIIL(R.string.ktl, new IDcS16S0300000_5((IInteractService) aqS94S0300000_5.l0, (InterfaceC88472Yns) aqS94S0300000_5.l1, (Fragment) aqS94S0300000_5.l2, 0));
                c47071t1.LJIILL = false;
                c47071t1.LJIILJJIL = false;
                LiveDialog LIZ = c47071t1.LIZ();
                if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "4115071473085874036")).LIZ) {
                    LIZ.show();
                }
                BZI LIZ2 = C28787BRn.LIZ("livesdk_multi_pictionary_change_popup_show");
                LIZ2.LJIILLIIL(C51029K0z.LJIILIIL((Fragment) aqS94S0300000_5.l2));
                LIZ2.LJJIIJZLJL();
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$13(AqS94S0300000_5 aqS94S0300000_5) {
        LifecycleOwner lifecycleOwner;
        C77800Ug8.LJ("livesdk_anchor_pictionary_start_popup_show", (DataChannel) aqS94S0300000_5.l0);
        BAF.LJIIJJI((DataChannel) aqS94S0300000_5.l0, true, "poll");
        C47071t1 c47071t1 = new C47071t1(((Fragment) aqS94S0300000_5.l1).getContext());
        c47071t1.LJIILL = false;
        c47071t1.LJIILJJIL = false;
        DataChannel dataChannel = (DataChannel) aqS94S0300000_5.l0;
        if (dataChannel != null) {
            lifecycleOwner = dataChannel.LJLJJI;
        } else {
            lifecycleOwner = null;
        }
        c47071t1.LIZIZ = lifecycleOwner;
        c47071t1.LJIILLIIL(R.string.kts);
        c47071t1.LJFF(R.string.ktg);
        c47071t1.LJIIIZ(R.string.ktf, new IDcS93S0200000_5((DataChannel) aqS94S0300000_5.l0, (InterfaceC88472Yns) aqS94S0300000_5.l2, 8));
        c47071t1.LJIIL(R.string.kte, new IDcS93S0200000_5((DataChannel) aqS94S0300000_5.l0, (InterfaceC88472Yns) aqS94S0300000_5.l2, 9));
        LiveDialog LIZ = c47071t1.LIZ();
        if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "4115071473085874036")).LIZ) {
            LIZ.show();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$14(AqS94S0300000_5 aqS94S0300000_5) {
        long j;
        if (((Room) aqS94S0300000_5.l0) != null) {
            IGiftService iGiftService = (IGiftService) CN1.LIZ(IGiftService.class);
            Gift gift = (Gift) aqS94S0300000_5.l1;
            if (gift != null) {
                j = gift.id;
            } else {
                j = 0;
            }
            long j2 = CC4.LIZIZ;
            Room room = (Room) aqS94S0300000_5.l0;
            SelectPollViewModel selectPollViewModel = (SelectPollViewModel) aqS94S0300000_5.l2;
            iGiftService.sendGiftPoll(j, j2, room, selectPollViewModel.LJLIL, selectPollViewModel.LJLJI);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$15(AqS94S0300000_5 aqS94S0300000_5) {
        C32279Clf c32279Clf;
        DataChannel LJI;
        C32825CuT c32825CuT;
        InterfaceC32497CpB interfaceC32497CpB;
        C32280Clg c32280Clg;
        InterfaceC32497CpB interfaceC32497CpB2;
        C32823CuR c32823CuR;
        InterfaceC32497CpB interfaceC32497CpB3;
        C32813CuH c32813CuH = (C32813CuH) aqS94S0300000_5.l0;
        C32816CuK c32816CuK = (C32816CuK) aqS94S0300000_5.l1;
        Throwable th = (Throwable) ((UV8) aqS94S0300000_5.l2).LJLILLLLZI;
        c32813CuH.getClass();
        C32804Cu8 LJJII = V16.LJJII(c32816CuK);
        if (LJJII instanceof C32823CuR) {
            Iterator<UVP> it = c32816CuK.LIZ.iterator();
            while (it.hasNext()) {
                UV2 uv2 = it.next().LIZ;
                if ((uv2 instanceof C32823CuR) && (c32823CuR = (C32823CuR) uv2) != null && (interfaceC32497CpB3 = c32823CuR.LJJIII) != null) {
                    interfaceC32497CpB3.LIZIZ(th);
                }
            }
        } else if (LJJII instanceof C32280Clg) {
            Iterator<UVP> it2 = c32816CuK.LIZ.iterator();
            while (it2.hasNext()) {
                UV2 uv22 = it2.next().LIZ;
                if ((uv22 instanceof C32280Clg) && (c32280Clg = (C32280Clg) uv22) != null && (interfaceC32497CpB2 = c32280Clg.LJJIII) != null) {
                    interfaceC32497CpB2.LIZIZ(th);
                }
            }
        } else if (LJJII instanceof C32825CuT) {
            Iterator<UVP> it3 = c32816CuK.LIZ.iterator();
            while (it3.hasNext()) {
                UV2 uv23 = it3.next().LIZ;
                if ((uv23 instanceof C32825CuT) && (c32825CuT = (C32825CuT) uv23) != null && (interfaceC32497CpB = c32825CuT.LJJIIJ) != null) {
                    interfaceC32497CpB.LIZIZ(th);
                }
            }
        } else if (LJJII instanceof C32279Clf) {
            Iterator<UVP> it4 = c32816CuK.LIZ.iterator();
            while (it4.hasNext()) {
                UV2 uv24 = it4.next().LIZ;
                if ((uv24 instanceof C32279Clf) && (c32279Clf = (C32279Clf) uv24) != null) {
                    try {
                        Z8D z8d = c32279Clf.LJJIII;
                        if (z8d != null) {
                            z8d.onFailed(th);
                        } else if (GiftManager.inst().isPollGift(c32279Clf.LIZ) && (LJI = c32813CuH.LJI()) != null) {
                            LJI.qv0(MockGiftPollEvent.class, new CCW(true, new Throwable("ignore"), GiftManager.inst().getPollGiftIndex(c32279Clf.LIZ)));
                        }
                    } catch (Exception e) {
                        C32785Ctp c32785Ctp = C32785Ctp.LJIILIIL;
                        String th2 = e.toString();
                        c32785Ctp.getClass();
                        C32785Ctp.LJIJJLI("error_callback_poll", th2);
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$16(AqS94S0300000_5 aqS94S0300000_5) {
        ActivityC45651qj LJFF = ((C32802Cu6) aqS94S0300000_5.l0).LJFF();
        if (LJFF != null) {
            C31593Cab.LIZLLL(LJFF, ((C32802Cu6) aqS94S0300000_5.l0).LJI());
        }
        if (!(((C32804Cu8) aqS94S0300000_5.l1) instanceof C32279Clf)) {
            ((C32802Cu6) aqS94S0300000_5.l0).LJIIIZ((C32816CuK) aqS94S0300000_5.l2, new Exception("BizError GiftBanned"));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$17(AqS94S0300000_5 aqS94S0300000_5) {
        IWalletException walletException = ((IWalletService) CN1.LIZ(IWalletService.class)).walletException();
        ActivityC45651qj LJFF = ((C32801Cu5) aqS94S0300000_5.l0).LJFF();
        Throwable th = (Throwable) aqS94S0300000_5.l1;
        walletException.getClass();
        UI4 LJFF2 = C76950UHy.LJFF(LJFF, th, null, null, 0, 1002, false);
        if (LJFF2.LJLILLLLZI && LJFF2.LJLIL) {
            C32801Cu5.LJIIJJI((C32804Cu8) aqS94S0300000_5.l2);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$18(AqS94S0300000_5 aqS94S0300000_5) {
        TemplateInfo templateInfo = (TemplateInfo) ((C68322mC) aqS94S0300000_5.l0).element;
        if (templateInfo != null) {
            InterfaceC30977CDt interfaceC30977CDt = (InterfaceC30977CDt) aqS94S0300000_5.l1;
            C31556Ca0 c31556Ca0 = (C31556Ca0) aqS94S0300000_5.l2;
            if (interfaceC30977CDt != null) {
                interfaceC30977CDt.se(templateInfo, c31556Ca0);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$19(AqS94S0300000_5 aqS94S0300000_5) {
        InterfaceC88472Yns<? super Map<EmoteModel, ? extends Drawable>, C76800UCe> interfaceC88472Yns = (InterfaceC88472Yns) ((Reference) ((C31424CUy) aqS94S0300000_5.l0).LIZIZ).get();
        if (interfaceC88472Yns != null) {
            C31422CUw c31422CUw = (C31422CUw) aqS94S0300000_5.l1;
            C31424CUy c31424CUy = (C31424CUy) aqS94S0300000_5.l0;
            interfaceC88472Yns.invoke(c31422CUw.LLLLZ((List) c31424CUy.LIZLLL, (CQW) c31424CUy.LIZJ, interfaceC88472Yns, (LifecycleOwner) c31424CUy.LJ, (HashMap) aqS94S0300000_5.l2));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS94S0300000_5 aqS94S0300000_5) {
        Boolean bool;
        int LIZ = C15380j0.LIZ(5.0f);
        Context context = ((View) aqS94S0300000_5.l0).getContext();
        o.LJIIIIZZ(context, "itemView.context");
        C31458CWg c31458CWg = new C31458CWg(context, null, "30s", C04330Ez.LIZIZ(((View) aqS94S0300000_5.l0).getContext(), R.color.bz), LIZ, 0);
        CQQ cqq = (CQQ) aqS94S0300000_5.l1;
        CUH cuh = (CUH) aqS94S0300000_5.l2;
        if (cqq != null) {
            bool = Boolean.valueOf(cqq.LJIIZILJ);
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool)) {
            c31458CWg.LIZIZ().LIZLLL = 7;
            c31458CWg.LIZIZ().LIZJ = cuh.LJLJI;
        }
        return c31458CWg;
    }

    public static final Object invoke$20(AqS94S0300000_5 aqS94S0300000_5) {
        InterfaceC88472Yns<? super List<? extends SpannableStringBuilder>, C76800UCe> interfaceC88472Yns = (InterfaceC88472Yns) ((Reference) ((C31424CUy) aqS94S0300000_5.l0).LIZIZ).get();
        if (interfaceC88472Yns != null) {
            C31421CUv c31421CUv = (C31421CUv) aqS94S0300000_5.l1;
            C31424CUy c31424CUy = (C31424CUy) aqS94S0300000_5.l0;
            interfaceC88472Yns.invoke(c31421CUv.LLLLZ((List) c31424CUy.LIZLLL, (CQW) c31424CUy.LIZJ, null, (LifecycleOwner) c31424CUy.LJ, interfaceC88472Yns, (HashMap) aqS94S0300000_5.l2));
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$21(AqS94S0300000_5 aqS94S0300000_5) {
        InterfaceC88472Yns<? super SpannableStringBuilder, C76800UCe> interfaceC88472Yns = (InterfaceC88472Yns) ((Reference) ((C31423CUx) aqS94S0300000_5.l0).LIZIZ).get();
        if (interfaceC88472Yns != null) {
            C31419CUt c31419CUt = (C31419CUt) aqS94S0300000_5.l1;
            C31423CUx c31423CUx = (C31423CUx) aqS94S0300000_5.l0;
            interfaceC88472Yns.invoke(c31419CUt.LLLLZ((List) c31423CUx.LIZLLL, (CQW) c31423CUx.LIZJ, (String) c31423CUx.LJFF, c31423CUx.LJI.get(), c31423CUx.LJII.get(), interfaceC88472Yns, true, (LifecycleOwner) c31423CUx.LJ, (HashMap) aqS94S0300000_5.l2, true));
        }
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$22(AqS94S0300000_5 aqS94S0300000_5) {
        aqS94S0300000_5.invoke$1();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$23(AqS94S0300000_5 aqS94S0300000_5) {
        String str;
        String str2;
        Long l;
        User owner;
        String str3;
        User owner2;
        LiveSubOnlyConfig liveSubOnlyConfig = (LiveSubOnlyConfig) aqS94S0300000_5.l0;
        Object obj = null;
        if (liveSubOnlyConfig != null) {
            str = liveSubOnlyConfig.disabledReason;
        } else {
            str = null;
        }
        if (o.LJ(str, "violation")) {
            Activity activity = (Activity) aqS94S0300000_5.l1;
            LiveSubOnlyConfig liveSubOnlyConfig2 = (LiveSubOnlyConfig) aqS94S0300000_5.l0;
            if (liveSubOnlyConfig2 != null) {
                str3 = liveSubOnlyConfig2.disabledToast;
            } else {
                str3 = null;
            }
            C30868C9o.LJIIIZ(R.drawable.czc, activity, str3);
            BZI LIZ = C28787BRn.LIZ("livesdk_violation_toast");
            LIZ.LJIIZILJ();
            LIZ.LJIJJ("anchor", "user_type");
            LIZ.LJIJJ("subscription", "scene_type");
            LIZ.LJIJJ("ban", "violation_type");
            Room room = (Room) aqS94S0300000_5.l2;
            if (room != null && (owner2 = room.getOwner()) != null) {
                obj = Long.valueOf(owner2.getId());
            }
            LIZ.LJIJJ(obj, "violation_anchor_id");
            LIZ.LJJIIJZLJL();
        } else {
            LiveSubOnlyConfig liveSubOnlyConfig3 = (LiveSubOnlyConfig) aqS94S0300000_5.l0;
            if (liveSubOnlyConfig3 != null) {
                str2 = liveSubOnlyConfig3.disabledToast;
            } else {
                str2 = null;
            }
            C30868C9o.LJI(str2);
            BZI LIZ2 = C28787BRn.LIZ("livesdk_subscriber_only_live_ban_toast");
            Room room2 = (Room) aqS94S0300000_5.l2;
            if (room2 != null && (owner = room2.getOwner()) != null) {
                l = Long.valueOf(owner.getId());
            } else {
                l = null;
            }
            LIZ2.LJIJJ(l, "anchor_id");
            LiveSubOnlyConfig liveSubOnlyConfig4 = (LiveSubOnlyConfig) aqS94S0300000_5.l0;
            if (liveSubOnlyConfig4 != null) {
                obj = liveSubOnlyConfig4.disabledReason;
            }
            LIZ2.LJIJJ(obj, "toast_type");
            LIZ2.LJJIIJZLJL();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS94S0300000_5 aqS94S0300000_5) {
        Boolean bool;
        Boolean bool2;
        Context context = ((View) aqS94S0300000_5.l0).getContext();
        o.LJIIIIZZ(context, "itemView.context");
        C31459CWh c31459CWh = new C31459CWh(context);
        CUH cuh = (CUH) aqS94S0300000_5.l1;
        CQQ cqq = (CQQ) aqS94S0300000_5.l2;
        C31463CWl LIZIZ = cuh.T().LIZIZ();
        Boolean bool3 = null;
        if (cqq != null) {
            bool = Boolean.valueOf(cqq.LJIIZILJ);
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool)) {
            LIZIZ.LIZLLL = 7;
            LIZIZ.LIZJ = cuh.LJLJI;
        }
        c31459CWh.LJIIIIZZ = LIZIZ;
        C31463CWl LIZIZ2 = cuh.Y().LIZIZ();
        if (cqq != null) {
            bool2 = Boolean.valueOf(cqq.LJIIZILJ);
        } else {
            bool2 = null;
        }
        if (C29306Beo.LJJIFFI(bool2)) {
            LIZIZ2.LIZLLL = 7;
            LIZIZ2.LIZJ = cuh.LJLJI;
        }
        c31459CWh.LJIIIZ = LIZIZ2;
        if (cqq != null) {
            bool3 = Boolean.valueOf(cqq.LJIIZILJ);
        }
        if (C29306Beo.LJJIFFI(bool3)) {
            c31459CWh.LIZIZ().LIZJ = cuh.LJLJI;
        }
        return c31459CWh;
    }

    public static final Object invoke$4(AqS94S0300000_5 aqS94S0300000_5) {
        int LIZ = C15380j0.LIZ(10.0f);
        CQQ cqq = (CQQ) aqS94S0300000_5.l0;
        if (cqq != null && cqq.LJIIZILJ) {
            LIZ = C15380j0.LIZ(11.4f);
        }
        Bitmap decodeBitmap = BitmapUtils.decodeBitmap(((View) aqS94S0300000_5.l1).getContext(), R.drawable.b2n, LIZ, LIZ);
        Context context = ((View) aqS94S0300000_5.l1).getContext();
        o.LJIIIIZZ(context, "itemView.context");
        return new C31458CWg(context, decodeBitmap, ((CUH) aqS94S0300000_5.l2).U(), C04330Ez.LIZIZ(((View) aqS94S0300000_5.l1).getContext(), R.color.bz), LIZ / 2, LIZ);
    }

    public static final Object invoke$5(AqS94S0300000_5 aqS94S0300000_5) {
        if (C74740TUy.LIZLLL().LJ()) {
            String LJIILJJIL = C15380j0.LJIILJJIL(R.string.kny);
            o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_connecting3)");
            C30868C9o.LJI(LJIILJJIL);
        } else {
            C29393BgD c29393BgD = (C29393BgD) aqS94S0300000_5.l0;
            Context LIZ = C29306Beo.LIZ((Context) aqS94S0300000_5.l1);
            if (LIZ == null) {
                LIZ = (Context) aqS94S0300000_5.l1;
            }
            EnterRoomConfig enterRoomConfig = (EnterRoomConfig) aqS94S0300000_5.l2;
            c29393BgD.getClass();
            C29393BgD.LIZLLL(LIZ, enterRoomConfig);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS94S0300000_5 aqS94S0300000_5) {
        C29393BgD c29393BgD = (C29393BgD) aqS94S0300000_5.l0;
        Context LIZ = C29306Beo.LIZ((Context) aqS94S0300000_5.l1);
        if (LIZ == null) {
            LIZ = (Context) aqS94S0300000_5.l1;
        }
        EnterRoomConfig enterRoomConfig = (EnterRoomConfig) aqS94S0300000_5.l2;
        c29393BgD.getClass();
        C29393BgD.LIZLLL(LIZ, enterRoomConfig);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS94S0300000_5 aqS94S0300000_5) {
        Context context = ((SubscriptionSettingFragmentNew) aqS94S0300000_5.l0).getContext();
        String clickEntrance = ((SubscriptionSettingFragmentNew) aqS94S0300000_5.l0).LJLIL;
        String piBindStatus = String.valueOf(((PayoutOnboardingDetailResult.Data) aqS94S0300000_5.l1).piBindStatus);
        String userTaxStatus = String.valueOf(((PayoutOnboardingDetailResult.Data) aqS94S0300000_5.l1).userTaxStatus);
        String confirmed = String.valueOf(((PayoutOnboardingDetailResult.Data) aqS94S0300000_5.l1).confirmed);
        String str = ((PayoutOnboardingDetailResult.Data) aqS94S0300000_5.l1).maskedInstrumentIdentity;
        o.LJIIIIZZ(str, "data.maskedInstrumentIdentity");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_opt_in", C29306Beo.LJJIFFI(Boolean.valueOf(((GetSubInfoResponse) aqS94S0300000_5.l2).qualification)) ? 1 : 0);
        o.LJIIIZ(clickEntrance, "clickEntrance");
        o.LJIIIZ(piBindStatus, "piBindStatus");
        o.LJIIIZ(userTaxStatus, "userTaxStatus");
        o.LJIIIZ(confirmed, "confirmed");
        C32364Cn2 c32364Cn2 = new C32364Cn2(LiveSubsPayoutOnboardingUrlSetting.payoutOnboardingPopup());
        c32364Cn2.LIZJ("enter_from_merge", BJM.LJFF());
        c32364Cn2.LIZJ("enter_method", BJM.LJIIIIZZ());
        c32364Cn2.LIZJ("click_entrance", clickEntrance);
        c32364Cn2.LIZJ("pi_bind_status", piBindStatus);
        c32364Cn2.LIZJ("user_tax_status", userTaxStatus);
        c32364Cn2.LIZJ("masked_instrument_identity", str);
        c32364Cn2.LIZJ("confirmed", confirmed);
        c32364Cn2.LIZJ("source", "6");
        c32364Cn2.LIZJ("track_params", jSONObject.toString());
        Uri parse = UriProtector.parse(c32364Cn2.LIZLLL());
        o.LJIIIIZZ(parse, "parse(builder.build())");
        ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(context, parse);
        SubscriptionSettingFragmentNew subscriptionSettingFragmentNew = (SubscriptionSettingFragmentNew) aqS94S0300000_5.l0;
        subscriptionSettingFragmentNew.LJLLL = true;
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_subscription_payment_info_layer_edit");
        subscriptionSettingFragmentNew.Tl(LIZ);
        LIZ.LJIJJ(((SubscriptionSettingFragmentNew) aqS94S0300000_5.l0).LJLIL, "show_entrance");
        LIZ.LJJIIJZLJL();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS94S0300000_5 aqS94S0300000_5) {
        int i = ((Bundle) aqS94S0300000_5.l0).getInt("open_sub_only_setting");
        if (((Bundle) aqS94S0300000_5.l0).getInt("open_sub_only_setting") == 1) {
            IHostSubscription iHostSubscription = (IHostSubscription) CN1.LIZ(IHostSubscription.class);
            if (iHostSubscription != null) {
                C30799C6x c30799C6x = (C30799C6x) aqS94S0300000_5.l1;
                iHostSubscription.G30(c30799C6x.LIZ, i, c30799C6x.LJI);
            }
        } else {
            C30799C6x c30799C6x2 = (C30799C6x) aqS94S0300000_5.l1;
            c30799C6x2.LIZJ.LIZIZ(c30799C6x2.LIZLLL.getAnchor_go_live_popup(), ((C30799C6x) aqS94S0300000_5.l1).LJI, "live_take_page", "", (Context) aqS94S0300000_5.l2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS94S0300000_5 aqS94S0300000_5) {
        C32399Cnb c32399Cnb = (C32399Cnb) aqS94S0300000_5.l0;
        if (c32399Cnb != null) {
            c32399Cnb.LJII = false;
            c32399Cnb.LJIIL = (Throwable) aqS94S0300000_5.l1;
            c32399Cnb.LIZIZ(EnumC32408Cnk.ERROR);
        }
        AbstractC32415Cnr abstractC32415Cnr = (AbstractC32415Cnr) aqS94S0300000_5.l2;
        if (abstractC32415Cnr != null) {
            abstractC32415Cnr.LIZ((C32399Cnb) aqS94S0300000_5.l0);
        }
        return C76800UCe.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS94S0300000_5(android.view.View r3, X.CQQ r4, X.CUH r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            switch(r6) {
                case 1: goto L23;
                case 2: goto L1a;
                case 3: goto L11;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r1.l2 = r5
            r0 = 0
        Ld:
            r1.<init>(r0)
            return
        L11:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r5
            r1.l2 = r4
            r0 = 0
            goto Ld
        L1a:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r1.l2 = r5
            r0 = 0
            goto Ld
        L23:
            r1 = r2
            r1.l0 = r5
            r1.l1 = r3
            r1.l2 = r4
            r0 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS94S0300000_5.<init>(android.view.View, X.CQQ, X.CUH, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS94S0300000_5(androidx.fragment.app.Fragment r3, androidx.fragment.app.Fragment r4, com.bytedance.ies.sdk.datachannel.DataChannel r5, X.InterfaceC88472Yns<? super java.lang.Boolean, X.C76800UCe> r6) {
        /*
            r2 = this;
            r2.$t = r6
            switch(r6) {
                case 10: goto L11;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r1.l2 = r5
            r0 = 0
        Ld:
            r1.<init>(r0)
            return
        L11:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r1.l2 = r5
            r0 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS94S0300000_5.<init>(androidx.fragment.app.Fragment, com.bytedance.ies.sdk.datachannel.DataChannel, X.Yns, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS94S0300000_5(C68322mC c68322mC, C68322mC<TemplateInfo> c68322mC2, InterfaceC30977CDt interfaceC30977CDt, C31556Ca0 c31556Ca0) {
        super(0);
        this.$t = c31556Ca0;
        this.l0 = c68322mC;
        this.l1 = c68322mC2;
        this.l2 = interfaceC30977CDt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS94S0300000_5(C29393BgD c29393BgD, Context context, EnterRoomConfig enterRoomConfig, int i) {
        super(0);
        this.$t = i;
        this.l0 = c29393BgD;
        this.l1 = context;
        this.l2 = enterRoomConfig;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS94S0300000_5(C31423CUx c31423CUx, C31423CUx<String> c31423CUx2, C31419CUt c31419CUt, HashMap<String, EmoteModel> hashMap) {
        super(0);
        this.$t = hashMap;
        this.l0 = c31423CUx;
        this.l1 = c31423CUx2;
        this.l2 = c31419CUt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS94S0300000_5(C31424CUy c31424CUy, C31424CUy<InterfaceC88472Yns<List<? extends SpannableStringBuilder>, C76800UCe>> c31424CUy2, C31421CUv c31421CUv, HashMap<String, EmoteModel> hashMap) {
        super(0);
        this.$t = hashMap;
        this.l0 = c31424CUy;
        this.l1 = c31424CUy2;
        this.l2 = c31421CUv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS94S0300000_5(C31424CUy c31424CUy, C31424CUy<InterfaceC88472Yns<Map<EmoteModel, ? extends Drawable>, C76800UCe>> c31424CUy2, C31422CUw c31422CUw, HashMap<String, EmoteModel> hashMap) {
        super(0);
        this.$t = hashMap;
        this.l0 = c31424CUy;
        this.l1 = c31424CUy2;
        this.l2 = c31422CUw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS94S0300000_5(C32399Cnb c32399Cnb, Throwable th, AbstractC32415Cnr abstractC32415Cnr, int i) {
        super(0);
        this.$t = i;
        this.l0 = c32399Cnb;
        this.l1 = th;
        this.l2 = abstractC32415Cnr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS94S0300000_5(C32801Cu5 c32801Cu5, Throwable th, C32804Cu8 c32804Cu8, int i) {
        super(0);
        this.$t = i;
        this.l0 = c32801Cu5;
        this.l1 = th;
        this.l2 = c32804Cu8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS94S0300000_5(C32802Cu6 c32802Cu6, C32804Cu8 c32804Cu8, C32816CuK c32816CuK, int i) {
        super(0);
        this.$t = i;
        this.l0 = c32802Cu6;
        this.l1 = c32804Cu8;
        this.l2 = c32816CuK;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS94S0300000_5(C32813CuH c32813CuH, C32816CuK c32816CuK, UV8 uv8, int i) {
        super(0);
        this.$t = i;
        this.l0 = c32813CuH;
        this.l1 = c32816CuK;
        this.l2 = uv8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS94S0300000_5(Bundle bundle, C30799C6x c30799C6x, Context context, int i) {
        super(0);
        this.$t = i;
        this.l0 = bundle;
        this.l1 = c30799C6x;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS94S0300000_5(Fragment fragment, C29159BcR c29159BcR, InterfaceC92693kP interfaceC92693kP, int i) {
        super(0);
        this.$t = i;
        this.l0 = fragment;
        this.l1 = c29159BcR;
        this.l2 = interfaceC92693kP;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS94S0300000_5(IInteractService iInteractService, IInteractService iInteractService2, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns, Fragment fragment) {
        super(0);
        this.$t = fragment;
        this.l0 = iInteractService;
        this.l1 = iInteractService2;
        this.l2 = interfaceC88472Yns;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS94S0300000_5(LiveSubOnlyConfig liveSubOnlyConfig, ActivityC45651qj activityC45651qj, Room room, int i) {
        super(0);
        this.$t = i;
        this.l0 = liveSubOnlyConfig;
        this.l1 = activityC45651qj;
        this.l2 = room;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS94S0300000_5(SubscriptionSettingFragmentNew subscriptionSettingFragmentNew, PayoutOnboardingDetailResult.Data data, GetSubInfoResponse getSubInfoResponse, int i) {
        super(0);
        this.$t = i;
        this.l0 = subscriptionSettingFragmentNew;
        this.l1 = data;
        this.l2 = getSubInfoResponse;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS94S0300000_5(GiftPanelBanner giftPanelBanner, C32500CpE c32500CpE, C32507CpL c32507CpL, int i) {
        super(0);
        this.$t = i;
        this.l0 = giftPanelBanner;
        this.l1 = c32500CpE;
        this.l2 = c32507CpL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS94S0300000_5(Room room, Gift gift, SelectPollViewModel selectPollViewModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = room;
        this.l1 = gift;
        this.l2 = selectPollViewModel;
    }
}
