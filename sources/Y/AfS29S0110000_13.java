package Y;

import X.B5G;
import X.C03660Ck;
import X.C04750Gp;
import X.C05630Jz;
import X.C07670Rv;
import X.C08880Wm;
import X.C0NB;
import X.C15490jB;
import X.C276516r;
import X.C30725C4b;
import X.C44432HcC;
import X.C44999HlL;
import X.C47061t0;
import X.C73411SrX;
import X.C75269TgP;
import X.C75377Ti9;
import X.C75545Tkr;
import X.C75642TmQ;
import X.C75883TqJ;
import X.C76129TuH;
import X.C76171Tux;
import X.C76265TwT;
import X.C76271TwZ;
import X.C76272Twa;
import X.C76278Twg;
import X.C76279Twh;
import X.C76280Twi;
import X.C78847Ux1;
import X.CFX;
import X.EnumC75614Tly;
import X.EnumC75640TmO;
import X.EnumC75672Tmu;
import X.EnumC75909Tqj;
import X.InterfaceC30442Bx8;
import X.InterfaceC64592gB;
import X.T16;
import X.TMC;
import X.TQA;
import X.U33;
import X.U35;
import X.U66;
import X.X1D;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.anchor.LiveShowAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.common.LiveShowMaskOrderEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.guest.LiveShowGuestViewModel;
import com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostSettingContract$AbsView;
import com.bytedance.android.live.liveinteract.multilive.model.GetShowContentResponse;
import com.bytedance.android.live.liveinteract.multilive.model.ReportLinkMessageResp;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateShowContentResponse;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestBusinessServerReporterOptSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import webcast.data.multi_guest_play.ShowConfig;
import webcast.data.multi_guest_play.ShowContent;
import webcast.data.multi_guest_play.ShowListUser;

/* loaded from: classes14.dex */
public class AfS29S0110000_13 implements InterfaceC64592gB {
    public final int $t;
    public Object l0;
    public boolean z1;

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
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(AfS29S0110000_13 afS29S0110000_13, Object obj) {
        Long l;
        C0NB.LIZIZ("LiveShowAnchorViewModel", "getShowList successful");
        ShowContent showContent = ((GetShowContentResponse.ResponseData) ((BaseResponse) obj).data).showContent;
        if (showContent != null) {
            LiveShowAnchorViewModel liveShowAnchorViewModel = (LiveShowAnchorViewModel) afS29S0110000_13.l0;
            boolean z = afS29S0110000_13.z1;
            liveShowAnchorViewModel.kv0(showContent.showingAndReadyList, showContent.finishedList, false);
            liveShowAnchorViewModel.lv0(showContent.showConfig);
            if (z) {
                ShowConfig showConfig = showContent.showConfig;
                ShowListUser showListUser = null;
                if (showConfig != null) {
                    l = Long.valueOf(showConfig.durationPerGuest);
                } else {
                    l = null;
                }
                Iterator<ShowListUser> it = showContent.showingAndReadyList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ShowListUser next = it.next();
                    if (next.status == 2) {
                        showListUser = next;
                        break;
                    }
                }
                liveShowAnchorViewModel.mv0(new U33(l, showListUser, showContent.showingAndReadyList, showContent.finishedList));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$1(AfS29S0110000_13 afS29S0110000_13, Object obj) {
        Long l;
        U35 LIZ;
        C0NB.LIZIZ("LiveShowGuestViewModel", "getShowList successful");
        ShowContent showContent = ((GetShowContentResponse.ResponseData) ((BaseResponse) obj).data).showContent;
        if (showContent != null) {
            LiveShowGuestViewModel liveShowGuestViewModel = (LiveShowGuestViewModel) afS29S0110000_13.l0;
            boolean z = afS29S0110000_13.z1;
            boolean z2 = false;
            liveShowGuestViewModel.kv0(showContent.showingAndReadyList, showContent.finishedList, false);
            liveShowGuestViewModel.lv0(showContent.showConfig);
            if (z) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("get Show list, this: ");
                LIZ2.append(showContent);
                C0NB.LIZIZ("remain time test", X1D.LIZIZ(LIZ2));
                ShowConfig showConfig = showContent.showConfig;
                ShowListUser showListUser = null;
                if (showConfig != null) {
                    l = Long.valueOf(showConfig.durationPerGuest);
                } else {
                    l = null;
                }
                Iterator<ShowListUser> it = showContent.showingAndReadyList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ShowListUser next = it.next();
                    if (next.status == 2) {
                        showListUser = next;
                        break;
                    }
                }
                liveShowGuestViewModel.mv0(new U33(l, showListUser, showContent.showingAndReadyList, showContent.finishedList));
                U35 LIZ3 = TQA.LIZ();
                if ((LIZ3 != null && LIZ3.LJII() == 2) || ((LIZ = TQA.LIZ()) != null && LIZ.LJII() == 1)) {
                    z2 = true;
                }
                DataChannel dataChannel = liveShowGuestViewModel.LJLJLJ;
                if (dataChannel != null) {
                    dataChannel.qv0(LiveShowMaskOrderEvent.class, new C75269TgP(z2, liveShowGuestViewModel.LJLILLLLZI.getValue()));
                }
            }
        }
    }

    public static final void accept$10(AfS29S0110000_13 afS29S0110000_13, Object obj) {
        Throwable th = (Throwable) obj;
        MultiCoHostSettingContract$AbsView multiCoHostSettingContract$AbsView = (MultiCoHostSettingContract$AbsView) ((C76171Tux) afS29S0110000_13.l0).LJLILLLLZI;
        if (multiCoHostSettingContract$AbsView != null) {
            multiCoHostSettingContract$AbsView.wl(!afS29S0110000_13.z1, th, false);
        }
    }

    public static final void accept$11(AfS29S0110000_13 afS29S0110000_13, Object obj) {
        InterfaceC30442Bx8.LLIFFJFJJ.LIZ(Boolean.valueOf(afS29S0110000_13.z1));
        MultiCoHostSettingContract$AbsView multiCoHostSettingContract$AbsView = (MultiCoHostSettingContract$AbsView) ((C76171Tux) afS29S0110000_13.l0).LJLILLLLZI;
        if (multiCoHostSettingContract$AbsView != null) {
            multiCoHostSettingContract$AbsView.xl(!afS29S0110000_13.z1, null, true);
        }
    }

    public static final void accept$12(AfS29S0110000_13 afS29S0110000_13, Object obj) {
        Throwable th = (Throwable) obj;
        MultiCoHostSettingContract$AbsView multiCoHostSettingContract$AbsView = (MultiCoHostSettingContract$AbsView) ((C76171Tux) afS29S0110000_13.l0).LJLILLLLZI;
        if (multiCoHostSettingContract$AbsView != null) {
            multiCoHostSettingContract$AbsView.xl(!afS29S0110000_13.z1, th, false);
        }
    }

    public static final void accept$13(AfS29S0110000_13 afS29S0110000_13, Object obj) {
        InterfaceC30442Bx8.LLI.LIZ(Boolean.valueOf(afS29S0110000_13.z1));
        MultiCoHostSettingContract$AbsView multiCoHostSettingContract$AbsView = (MultiCoHostSettingContract$AbsView) ((C76171Tux) afS29S0110000_13.l0).LJLILLLLZI;
        if (multiCoHostSettingContract$AbsView != null) {
            multiCoHostSettingContract$AbsView.Al(!afS29S0110000_13.z1, null, true);
        }
    }

    public static final void accept$14(AfS29S0110000_13 afS29S0110000_13, Object obj) {
        Throwable th = (Throwable) obj;
        MultiCoHostSettingContract$AbsView multiCoHostSettingContract$AbsView = (MultiCoHostSettingContract$AbsView) ((C76171Tux) afS29S0110000_13.l0).LJLILLLLZI;
        if (multiCoHostSettingContract$AbsView != null) {
            multiCoHostSettingContract$AbsView.Al(!afS29S0110000_13.z1, th, false);
        }
    }

    public static final void accept$15(AfS29S0110000_13 afS29S0110000_13, Object obj) {
        InterfaceC30442Bx8.LLIIII.LIZ(Boolean.valueOf(afS29S0110000_13.z1));
        MultiCoHostSettingContract$AbsView multiCoHostSettingContract$AbsView = (MultiCoHostSettingContract$AbsView) ((C76171Tux) afS29S0110000_13.l0).LJLILLLLZI;
        if (multiCoHostSettingContract$AbsView != null) {
            multiCoHostSettingContract$AbsView.Dl(!afS29S0110000_13.z1, null, true);
        }
    }

    public static final void accept$16(AfS29S0110000_13 afS29S0110000_13, Object obj) {
        Throwable th = (Throwable) obj;
        MultiCoHostSettingContract$AbsView multiCoHostSettingContract$AbsView = (MultiCoHostSettingContract$AbsView) ((C76171Tux) afS29S0110000_13.l0).LJLILLLLZI;
        if (multiCoHostSettingContract$AbsView != null) {
            multiCoHostSettingContract$AbsView.Dl(!afS29S0110000_13.z1, th, false);
        }
    }

    public static final void accept$17(AfS29S0110000_13 afS29S0110000_13, Object obj) {
        InterfaceC30442Bx8.LLII.LIZ(Boolean.valueOf(afS29S0110000_13.z1));
        MultiCoHostSettingContract$AbsView multiCoHostSettingContract$AbsView = (MultiCoHostSettingContract$AbsView) ((C76171Tux) afS29S0110000_13.l0).LJLILLLLZI;
        if (multiCoHostSettingContract$AbsView != null) {
            multiCoHostSettingContract$AbsView.Gl(!afS29S0110000_13.z1, null, true);
        }
    }

    public static final void accept$18(AfS29S0110000_13 afS29S0110000_13, Object obj) {
        Throwable th = (Throwable) obj;
        MultiCoHostSettingContract$AbsView multiCoHostSettingContract$AbsView = (MultiCoHostSettingContract$AbsView) ((C76171Tux) afS29S0110000_13.l0).LJLILLLLZI;
        if (multiCoHostSettingContract$AbsView != null) {
            multiCoHostSettingContract$AbsView.Gl(!afS29S0110000_13.z1, th, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$19(AfS29S0110000_13 afS29S0110000_13, Object obj) {
        Long l;
        long j;
        ReportLinkMessageResp reportLinkMessageResp;
        ReportLinkMessageResp reportLinkMessageResp2;
        ReportLinkMessageResp reportLinkMessageResp3;
        BaseResponse baseResponse = (BaseResponse) obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Anchor report success: interval is ");
        Long l2 = null;
        if (baseResponse != null && (reportLinkMessageResp3 = (ReportLinkMessageResp) baseResponse.data) != null) {
            l = Long.valueOf(reportLinkMessageResp3.interval);
        } else {
            l = null;
        }
        C07670Rv.LJ(LIZ, l, LIZ, "BusinessServerReporter interval");
        if (afS29S0110000_13.z1) {
            C76129TuH.LIZJ();
            if (!MultiGuestBusinessServerReporterOptSetting.INSTANCE.isOpt()) {
                return;
            }
        }
        if (MultiGuestBusinessServerReporterOptSetting.INSTANCE.isOpt()) {
            return;
        }
        if (baseResponse != null && (reportLinkMessageResp2 = (ReportLinkMessageResp) baseResponse.data) != null) {
            j = reportLinkMessageResp2.interval;
        } else {
            j = 0;
        }
        C76129TuH.LIZ = j;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Anchor report success: interval is ");
        if (baseResponse != null && (reportLinkMessageResp = (ReportLinkMessageResp) baseResponse.data) != null) {
            l2 = Long.valueOf(reportLinkMessageResp.interval);
        }
        C07670Rv.LJ(LIZ2, l2, LIZ2, "BusinessServerReporter interval");
        long j2 = C76129TuH.LIZ;
        if (j2 <= 0) {
            return;
        }
        C76129TuH.LIZLLL = (C73411SrX) TMC.LJJI(j2, TimeUnit.SECONDS).LJJJ(T16.LIZ()).LJJJLIIL(new AfS57S0100000_5((U66) afS29S0110000_13.l0, 376), new InterfaceC64592gB() { // from class: X.9Di
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj2) {
            }
        });
    }

    public static final void accept$2(AfS29S0110000_13 afS29S0110000_13, Object obj) {
        Throwable throwable = (Throwable) obj;
        C76278Twg c76278Twg = (C76278Twg) afS29S0110000_13.l0;
        c76278Twg.LJIIIZ = false;
        o.LJIIIIZZ(throwable, "throwable");
        c76278Twg.LJIIIIZZ(throwable);
        C76271TwZ c76271TwZ = C76271TwZ.LIZ;
        boolean z = afS29S0110000_13.z1;
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LIZ(z ? 1 : 0, "invite_type", jSONObject);
        C05630Jz.LJI(jSONObject, "error_detail", throwable.getMessage());
        JSONObject jSONObject2 = new JSONObject();
        C05630Jz.LJFF(jSONObject2, "cost", C30725C4b.LIZ() - C76271TwZ.LIZIZ);
        JSONObject jSONObject3 = new JSONObject();
        if (throwable instanceof C276516r) {
            C05630Jz.LIZ(((C276516r) throwable).getErrorCode(), "error_msg", jSONObject3);
        } else {
            C05630Jz.LIZ(-1, "error_msg", jSONObject3);
        }
        C05630Jz.LJI(jSONObject3, "role_type", "inviter");
        c76271TwZ.LJJZZI("prepare_failed", jSONObject, jSONObject3, jSONObject2, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$20(AfS29S0110000_13 afS29S0110000_13, Object obj) {
        Long l;
        long j;
        ReportLinkMessageResp reportLinkMessageResp;
        ReportLinkMessageResp reportLinkMessageResp2;
        ReportLinkMessageResp reportLinkMessageResp3;
        BaseResponse baseResponse = (BaseResponse) obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Guest report success: interval is ");
        Long l2 = null;
        if (baseResponse != null && (reportLinkMessageResp3 = (ReportLinkMessageResp) baseResponse.data) != null) {
            l = Long.valueOf(reportLinkMessageResp3.interval);
        } else {
            l = null;
        }
        C07670Rv.LJ(LIZ, l, LIZ, "BusinessServerReporter");
        if (afS29S0110000_13.z1) {
            C76129TuH.LIZJ();
            if (!MultiGuestBusinessServerReporterOptSetting.INSTANCE.isOpt()) {
                return;
            }
        }
        if (MultiGuestBusinessServerReporterOptSetting.INSTANCE.isOpt()) {
            return;
        }
        if (baseResponse != null && (reportLinkMessageResp2 = (ReportLinkMessageResp) baseResponse.data) != null) {
            j = reportLinkMessageResp2.interval;
        } else {
            j = 0;
        }
        C76129TuH.LIZ = j;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Guest report success: interval is ");
        if (baseResponse != null && (reportLinkMessageResp = (ReportLinkMessageResp) baseResponse.data) != null) {
            l2 = Long.valueOf(reportLinkMessageResp.interval);
        }
        C07670Rv.LJ(LIZ2, l2, LIZ2, "BusinessServerReporter");
        long j2 = C76129TuH.LIZ;
        if (j2 <= 0) {
            return;
        }
        C76129TuH.LIZLLL = (C73411SrX) TMC.LJJI(j2, TimeUnit.SECONDS).LJJJ(T16.LIZ()).LJJJLIIL(new AfS65S0100000_13((U66) afS29S0110000_13.l0, 251), new InterfaceC64592gB() { // from class: X.9Dj
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj2) {
            }
        });
    }

    public static final void accept$3(AfS29S0110000_13 afS29S0110000_13, Object obj) {
        C76280Twi c76280Twi;
        Throwable throawable = (Throwable) obj;
        ((C76279Twh) afS29S0110000_13.l0).LJIILL = false;
        C76272Twa c76272Twa = C76272Twa.LIZ;
        boolean z = afS29S0110000_13.z1;
        o.LJIIIIZZ(throawable, "throawable");
        JSONObject jSONObject = new JSONObject();
        C76272Twa.LJIJJ(jSONObject, z);
        C76272Twa.LJIJ(jSONObject);
        c76272Twa.LJIIL(throawable, jSONObject);
        if (z) {
            c76280Twi = C76265TwT.LIZIZ;
        } else {
            c76280Twi = C76265TwT.LIZ;
        }
        c76272Twa.LJIILLIIL(jSONObject, c76280Twi);
        C05630Jz.LJI(jSONObject, "invite_type", String.valueOf(z ? 1 : 0));
        C76272Twa.LJJJLIIL(c76272Twa, "prepare_failed", jSONObject, z, null, 56);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$4(AfS29S0110000_13 afS29S0110000_13, Object obj) {
        boolean z;
        Object[] objArr;
        C75642TmQ c75642TmQ = C75642TmQ.LIZ;
        Room currentRoom = (Room) afS29S0110000_13.l0;
        boolean z2 = afS29S0110000_13.z1;
        o.LJIIIZ(currentRoom, "currentRoom");
        if (!z2 || !LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_connection_onemin", LiveLogMonitorSampleSetting.getSAMPLE_10())) {
            return;
        }
        HashMap LIZJ = C03660Ck.LIZJ("connection_type", "anchor");
        Iterator LIZLLL = C08880Wm.LIZLLL();
        while (true) {
            z = true;
            if (!LIZLLL.hasNext()) {
                break;
            }
            C75883TqJ c75883TqJ = (C75883TqJ) LIZLLL.next();
            if (!c75883TqJ.LIZJ() && c75883TqJ.LJFF() && c75883TqJ.LJJI == EnumC75909Tqj.LINKED) {
                break;
            }
        }
        if (!TextUtils.isEmpty(C75642TmQ.LJIJJ)) {
            LIZJ.put("request_id", C75642TmQ.LJIJJ);
        }
        LIZJ.put("channel_id", String.valueOf(B5G.LIZIZ().LJFF));
        EnumC75614Tly enumC75614Tly = B5G.LIZIZ().LJIIJ;
        EnumC75672Tmu enumC75672Tmu = B5G.LIZIZ().LJJJLIIL;
        EnumC75672Tmu enumC75672Tmu2 = EnumC75672Tmu.INVITEE;
        if (enumC75672Tmu == enumC75672Tmu2) {
            z = false;
        }
        C75545Tkr.LIZLLL(LIZJ, enumC75614Tly, z);
        if (enumC75672Tmu != enumC75672Tmu2) {
            LIZJ.put("is_icon_show_anchor", String.valueOf(ujb.o.LJJJJIZL(B5G.LIZIZ().LJJLIIIIJ, String.valueOf(B5G.LIZIZ().LJI), false) ? 1 : 0));
        }
        LIZJ.put("connection_invitee_id", String.valueOf(B5G.LIZIZ().LJJLIIIJLJLI));
        LIZJ.put("connection_inviter_id", String.valueOf(B5G.LIZIZ().LJJLIIIJL));
        String str = B5G.LIZIZ().LJJLI;
        if (str == null) {
            str = "";
        }
        LIZJ.put("log_id", str);
        String str2 = "1";
        if (B5G.LIZIZ().LJIIJ == EnumC75614Tly.RANDOM_LINK_MIC_RECOMMEND) {
            objArr = "1";
        } else {
            objArr = CardStruct.IStatusCode.DEFAULT;
        }
        LIZJ.put("is_quick_recommend", objArr);
        LIZJ.put("user_type", "anchor");
        C75642TmQ.LJIILIIL(LIZJ);
        LIZJ.put("click_time", C44432HcC.LJIIIIZZ().getType());
        if (enumC75672Tmu == enumC75672Tmu2) {
            Integer num = B5G.LIZIZ().LJJLIIIJJI;
            int i = EnumC75640TmO.COHOST_TYPE.value;
            if (num == null || num.intValue() != i) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            LIZJ.put("is_linked_before", str2);
        } else {
            C75642TmQ.LJIILLIIL(LIZJ, B5G.LIZIZ().LJJII, B5G.LIZIZ().LJJIII, B5G.LIZIZ().LJIIJ, B5G.LIZIZ().LJJJLL);
        }
        if (EnumC75672Tmu.INVITER == B5G.LIZIZ().LJJJLIIL) {
            LIZJ.put("is_multi_bubble_guide", CardStruct.IStatusCode.DEFAULT);
        }
        C75642TmQ.LJII(c75642TmQ, LIZJ);
        LIZJ.put("source", C75642TmQ.LJ);
        C75642TmQ.LIZJ(LIZJ);
        C75642TmQ.LIZ(LIZJ);
        C75642TmQ.LJIIL(null, LIZJ);
        C75642TmQ.LJIILL(enumC75614Tly, LIZJ);
        C75642TmQ.LJIIZILJ(c75642TmQ, LIZJ);
        C75545Tkr.LJFF(LIZJ);
        C75642TmQ.LJIJ(LIZJ);
        C75642TmQ.LJIIJJI(LIZJ);
        C75642TmQ.LJJLIIJ("livesdk_connection_onemin", LIZJ);
    }

    public static final void accept$5(AfS29S0110000_13 afS29S0110000_13, Object obj) {
        ImageModel imageModel;
        if (afS29S0110000_13.z1) {
            C15490jB.LJ(((C75377Ti9) afS29S0110000_13.l0).LIZ(R.id.hb1), CFX.LIZ("tiktok_live_link_mic", "tiktok_live_interaction_demand_1"), "ttlive_pause_coffee_icon_land.png");
            return;
        }
        User user = ((C75377Ti9) afS29S0110000_13.l0).LJLIL;
        if (user != null) {
            imageModel = user.getAvatarThumb();
        } else {
            imageModel = null;
        }
        C47061t0 online_player_avatar = (C47061t0) ((C75377Ti9) afS29S0110000_13.l0).LIZ(R.id.hb1);
        o.LJIIIIZZ(online_player_avatar, "online_player_avatar");
        C75377Ti9.LIZIZ(online_player_avatar, imageModel);
    }

    public static final void accept$6(AfS29S0110000_13 afS29S0110000_13, Object obj) {
        String str;
        Bitmap decodeFile = BitmapFactory.decodeFile((String) obj);
        if (afS29S0110000_13.z1) {
            str = "image_4";
        } else {
            str = "image_1";
        }
        C04750Gp c04750Gp = (C04750Gp) ((Map) afS29S0110000_13.l0).get(str);
        if (c04750Gp != null && decodeFile != null) {
            Bitmap roundedBitmap = C44999HlL.LIZ(decodeFile);
            o.LJIIIIZZ(roundedBitmap, "roundedBitmap");
            c04750Gp.LJI = C78847Ux1.LJJL(c04750Gp.LIZ, c04750Gp.LIZIZ, roundedBitmap);
        }
    }

    public static final void accept$7(AfS29S0110000_13 afS29S0110000_13, Object obj) {
        String str;
        Bitmap decodeFile = BitmapFactory.decodeFile((String) obj);
        if (afS29S0110000_13.z1) {
            str = "image_4";
        } else {
            str = "image_1";
        }
        C04750Gp c04750Gp = (C04750Gp) ((Map) afS29S0110000_13.l0).get(str);
        if (c04750Gp != null && decodeFile != null) {
            Bitmap roundedBitmap = C44999HlL.LIZ(decodeFile);
            o.LJIIIIZZ(roundedBitmap, "roundedBitmap");
            c04750Gp.LJI = C78847Ux1.LJJL(c04750Gp.LIZ, c04750Gp.LIZIZ, roundedBitmap);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$8(AfS29S0110000_13 afS29S0110000_13, Object obj) {
        ShowConfig showConfig;
        C0NB.LIZIZ("LiveShowAnchorViewModel", "updateShowList successful");
        MutableLiveData<ShowConfig> mutableLiveData = ((LiveShowAnchorViewModel) afS29S0110000_13.l0).LJLJJI;
        ShowContent showContent = ((UpdateShowContentResponse.ResponseData) ((BaseResponse) obj).data).showContent;
        if (showContent != null) {
            showConfig = showContent.showConfig;
        } else {
            showConfig = null;
        }
        mutableLiveData.setValue(showConfig);
        if (!afS29S0110000_13.z1) {
            ((LiveShowAnchorViewModel) afS29S0110000_13.l0).gv0();
        }
    }

    public static final void accept$9(AfS29S0110000_13 afS29S0110000_13, Object obj) {
        InterfaceC30442Bx8.LLIIIL.LIZ(Boolean.valueOf(afS29S0110000_13.z1));
        MultiCoHostSettingContract$AbsView multiCoHostSettingContract$AbsView = (MultiCoHostSettingContract$AbsView) ((C76171Tux) afS29S0110000_13.l0).LJLILLLLZI;
        if (multiCoHostSettingContract$AbsView != null) {
            multiCoHostSettingContract$AbsView.wl(!afS29S0110000_13.z1, null, true);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS29S0110000_13(X.C76171Tux r2, boolean r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 9: goto Le;
                case 10: goto L5;
                case 11: goto Le;
                case 12: goto L5;
                case 13: goto Le;
                case 14: goto L5;
                case 15: goto Le;
                case 16: goto L5;
                case 17: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r2
            r0.z1 = r3
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.z1 = r3
            r0.l0 = r2
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS29S0110000_13.<init>(X.Tux, boolean, int):void");
    }

    public AfS29S0110000_13(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
