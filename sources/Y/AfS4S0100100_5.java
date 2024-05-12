package Y;

import X.AbstractC32698CsQ;
import X.BLL;
import X.BLR;
import X.BLU;
import X.BLV;
import X.BLW;
import X.BLX;
import X.BMH;
import X.BTJ;
import X.BZI;
import X.C05630Jz;
import X.C0K2;
import X.C0K5;
import X.C0NB;
import X.C0TL;
import X.C15380j0;
import X.C16880lQ;
import X.C1D;
import X.C1EW;
import X.C276516r;
import X.C28619BLb;
import X.C28787BRn;
import X.C29401Dk;
import X.C29746Blu;
import X.C2NU;
import X.C30159BsZ;
import X.C30160Bsa;
import X.C30896CAq;
import X.C31533CZd;
import X.C32138CjO;
import X.C32145CjV;
import X.C32327CmR;
import X.C32444CoK;
import X.C32661Crp;
import X.C32676Cs4;
import X.C32681Cs9;
import X.C55077LjV;
import X.C64698PaI;
import X.C64738Paw;
import X.C64799Pbv;
import X.C65814PsI;
import X.CH1;
import X.CKJ;
import X.CN1;
import X.CS5;
import X.CS6;
import X.CVJ;
import X.CZR;
import X.EnumC30204BtI;
import X.EnumC32734Ct0;
import X.InterfaceC28469BFh;
import X.InterfaceC32326CmQ;
import X.InterfaceC32356Cmu;
import X.InterfaceC64592gB;
import X.O5Y;
import X.RunnableC32211CkZ;
import X.X1D;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.livesdk.api.LiveCaptchaCheckApi;
import com.bytedance.android.livesdk.chatroom.ui.GamePreparationFragment;
import com.bytedance.android.livesdk.dataChannel.CaptchaCheckFailedChannel;
import com.bytedance.android.livesdk.dataChannel.CaptchaLivePauseTimeChannel;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafViewModel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.RiskCtl;
import com.bytedance.android.livesdk.hashtag.HashtagAudienceDialog;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.starcomment.LiveStarCommentMaxConfig;
import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.pack.viewmodel.BagListViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.live.feedpage.LiveStateResponse;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import tikcast.api.anchor.DelHostRelationResponse;

/* loaded from: classes6.dex */
public class AfS4S0100100_5 implements InterfaceC64592gB {
    public final int $t;
    public long j1;
    public Object l0;

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
            default:
                return;
        }
    }

    public static final void accept$0(AfS4S0100100_5 afS4S0100100_5, Object obj) {
        MutableLiveData<LinkedList<AbstractC32698CsQ<? extends C30896CAq>>> mutableLiveData;
        LinkedList<AbstractC32698CsQ<? extends C30896CAq>> value;
        Boolean bool;
        C32138CjO c32138CjO = (C32138CjO) obj;
        if (c32138CjO != null) {
            long j = afS4S0100100_5.j1;
            C32676Cs4 c32676Cs4 = (C32676Cs4) afS4S0100100_5.l0;
            if (c32138CjO.LIZ != j) {
                return;
            }
            RiskCtl riskCtl = c32676Cs4.LLJ;
            c32676Cs4.LLJ = c32138CjO.LIZIZ;
            GiftPanelLeafViewModel LJJIJIL = c32676Cs4.LJJIJIL();
            if (LJJIJIL == null || (mutableLiveData = LJJIJIL.LJLILLLLZI) == null || (value = mutableLiveData.getValue()) == null) {
                return;
            }
            Boolean bool2 = null;
            if (riskCtl != null) {
                bool = Boolean.valueOf(riskCtl.disableSendGift);
            } else {
                bool = null;
            }
            RiskCtl riskCtl2 = c32676Cs4.LLJ;
            if (riskCtl2 != null) {
                bool2 = Boolean.valueOf(riskCtl2.disableSendGift);
            }
            if (o.LJ(bool, bool2)) {
                return;
            }
            Iterator<AbstractC32698CsQ<? extends C30896CAq>> it = value.iterator();
            int i = -1;
            int i2 = 0;
            while (it.hasNext()) {
                int i3 = i2 + 1;
                AbstractC32698CsQ<? extends C30896CAq> next = it.next();
                if (next != null && next.LIZJ() == c32676Cs4.LJJJI()) {
                    i = i2;
                }
                i2 = i3;
            }
            if (i <= -1) {
                return;
            }
            C32681Cs9 c32681Cs9 = c32676Cs4.LJZ;
            if (c32681Cs9 != null) {
                c32681Cs9.notifyItemChanged(i);
            }
            String str = c32676Cs4.LJLLLLLL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("notifyItemChanged pos = ");
            LIZ.append(i);
            LIZ.append(" when risk ctl update");
            C32444CoK.LIZ(str, X1D.LIZIZ(LIZ));
        }
    }

    public static final void accept$1(AfS4S0100100_5 afS4S0100100_5, Object obj) {
        ((C1D) afS4S0100100_5.l0).LIZ(afS4S0100100_5.j1);
    }

    public static final void accept$10(AfS4S0100100_5 afS4S0100100_5, Object obj) {
        Exception exc;
        Throwable th = (Throwable) obj;
        InterfaceC28469BFh interfaceC28469BFh = (InterfaceC28469BFh) ((WeakReference) afS4S0100100_5.l0).get();
        if (interfaceC28469BFh != null) {
            long j = afS4S0100100_5.j1;
            if (th instanceof Exception) {
                exc = (Exception) th;
            } else {
                exc = null;
            }
            interfaceC28469BFh.LIZIZ(j, null, exc);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$11(AfS4S0100100_5 afS4S0100100_5, Object obj) {
        BLU blu = (BLU) obj;
        Pair pair = (Pair) blu.LIZ;
        long currentTimeMillis = System.currentTimeMillis();
        long uptimeMillis = SystemClock.uptimeMillis();
        BLV blv = new BLV();
        blv.LIZ = blu.LJ;
        BLL bll = (BLL) afS4S0100100_5.l0;
        blv.LIZIZ = bll.LL;
        blv.LIZJ = bll.LLD;
        blv.LIZLLL = blu.LIZLLL;
        blv.LJ = "/webcast/feed/";
        blv.LJFF = blu.LJFF;
        BLW LIZ = blv.LIZ();
        C64738Paw c64738Paw = blu.LIZJ;
        BLX.LIZ(afS4S0100100_5.j1, currentTimeMillis, uptimeMillis, LIZ, blu.LIZIZ, c64738Paw);
        BLL bll2 = (BLL) afS4S0100100_5.l0;
        bll2.LLIIL = blu.LIZLLL;
        if (pair == null) {
            bll2.LJLLLL = false;
            return;
        }
        FeedExtra feedExtra = (FeedExtra) pair.second;
        bll2.LJLJLJ = feedExtra;
        bll2.LJJII((List) pair.first, feedExtra, -1);
        if (ujb.o.LJJJLIIL(((BLL) afS4S0100100_5.l0).LJLLJ, "vertical_", false) && ujb.o.LJJJJ(((BLL) afS4S0100100_5.l0).LJLLJ, "_draw", false)) {
            BLL bll3 = (BLL) afS4S0100100_5.l0;
            if (!bll3.LLIIIL) {
                Extra extra = (Extra) pair.second;
                if (!extra.hasMore) {
                    extra.hasMore = true;
                    bll3.LLIIIL = true;
                }
            }
        }
        ((BLL) afS4S0100100_5.l0).LJIIJJI();
        ((BLL) afS4S0100100_5.l0).LJLLLL = false;
    }

    public static final void accept$12(AfS4S0100100_5 afS4S0100100_5, Object obj) {
        C30160Bsa c30160Bsa = (C30160Bsa) afS4S0100100_5.l0;
        long j = afS4S0100100_5.j1;
        if (!c30160Bsa.LJLJJI.LJLJJLL) {
            DataChannelGlobal.LJLJJI.tv0(CaptchaCheckFailedChannel.class, Boolean.TRUE);
            ((IHostUser) CN1.LIZ(IHostUser.class)).dismissCaptcha();
            C30159BsZ c30159BsZ = c30160Bsa.LJLJJI;
            c30159BsZ.LJLJLLL = true;
            c30159BsZ.LJLJJL.rv0(CaptchaLivePauseTimeChannel.class, 0L);
            C65814PsI.LIZ().getClass();
            C1EW.LIZ(((LiveCaptchaCheckApi) C65814PsI.LIZJ(LiveCaptchaCheckApi.class)).getCaptchaCheckResponse(j, c30160Bsa.LJLJJI.LJLJJI.getId(), true)).LJII(BTJ.LIZIZ(c30160Bsa.LJLJJI.LJLIL)).LJJJLIIL(new AfS17S0001000_5(0, 11), new AfS17S0001000_5(0, 12));
            if (!c30160Bsa.LJLJJI.LJLJLJ) {
                BZI LIZ = C28787BRn.LIZ("livesdk_captcha_popup_result");
                LIZ.LJIILLIIL(c30160Bsa.LJLJJI.LJLJJL);
                LIZ.LJIJJ(Long.valueOf((System.currentTimeMillis() / 1000) - c30160Bsa.LJLJJI.LJLJJI.getCreateTime()), "duration_after_live_take");
                LIZ.LJIJJ(Long.valueOf((System.currentTimeMillis() - c30160Bsa.LJLJJI.LJLL.longValue()) / 1000), "duration_after_popup");
                LIZ.LJIJJ("fail", "result");
                LIZ.LJIJJ("no_response", "failure_reason");
                LIZ.LJJIIJZLJL();
                C30159BsZ c30159BsZ2 = c30160Bsa.LJLJJI;
                c30159BsZ2.LJLJLJ = true;
                c30159BsZ2.LJLJL = true;
            }
        }
        c30160Bsa.LJLJJI.LJLJJLL = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$13(Y.AfS4S0100100_5 r13, java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS4S0100100_5.accept$13(Y.AfS4S0100100_5, java.lang.Object):void");
    }

    public static final void accept$14(AfS4S0100100_5 afS4S0100100_5, Object obj) {
        Throwable it = (Throwable) obj;
        DataChannel dataChannel = ((CZR) afS4S0100100_5.l0).LJLILLLLZI;
        if (dataChannel != null) {
            long j = afS4S0100100_5.j1;
            o.LJIIIIZZ(it, "it");
            long elapsedRealtime = SystemClock.elapsedRealtime() - j;
            BZI LIZ = C28787BRn.LIZ("livesdk_star_comment_get_queue_request");
            CVJ.LIZLLL(LIZ, dataChannel);
            CVJ.LJ(LIZ, it);
            LIZ.LJIJJ(0, "is_successful");
            LIZ.LJIJJ(Long.valueOf(elapsedRealtime), "duration");
            LIZ.LJJIIJZLJL();
        }
        CZR czr = (CZR) afS4S0100100_5.l0;
        if (czr.LJLLJ) {
            int i = czr.LJLLL + 1;
            czr.LJLLL = i;
            if (i >= LiveStarCommentMaxConfig.INSTANCE.getSettingValue()) {
                CZR czr2 = (CZR) afS4S0100100_5.l0;
                czr2.LJLLJ = false;
                if (czr2.LJLLLLLL == 3) {
                    czr2.LJFF(0);
                    return;
                }
                return;
            }
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - afS4S0100100_5.j1;
        long j2 = 0;
        if (elapsedRealtime2 < 0) {
            elapsedRealtime2 = 0;
        }
        long j3 = C31533CZd.LIZ - elapsedRealtime2;
        if (j3 >= 0) {
            j2 = j3;
        }
        Handler handler = ((CZR) afS4S0100100_5.l0).LJLLLL;
        handler.sendMessageDelayed(handler.obtainMessage(1), j2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$15(AfS4S0100100_5 afS4S0100100_5, Object obj) {
        long j;
        FeedExtra feedExtra;
        List<FeedItem> list;
        BLU blu = (BLU) obj;
        C28619BLb c28619BLb = (C28619BLb) blu.LIZ;
        long currentTimeMillis = System.currentTimeMillis();
        long uptimeMillis = SystemClock.uptimeMillis();
        BLV blv = new BLV();
        blv.LIZ = blu.LJ;
        blv.LIZLLL = blu.LIZLLL;
        blv.LJ = "/webcast/feed/";
        blv.LJFF = blu.LJFF;
        BLX.LIZ(afS4S0100100_5.j1, currentTimeMillis, uptimeMillis, blv.LIZ(), blu.LIZIZ, blu.LIZJ);
        if (c28619BLb != null && (list = c28619BLb.LIZ) != null) {
            HashtagAudienceDialog hashtagAudienceDialog = (HashtagAudienceDialog) afS4S0100100_5.l0;
            if (list.isEmpty()) {
                BMH bmh = hashtagAudienceDialog.LJLJI;
                if (bmh != null) {
                    bmh.LJLILLLLZI = 3;
                    bmh.notifyDataSetChanged();
                } else {
                    o.LJIJI("mAdapter");
                    throw null;
                }
            } else {
                BMH bmh2 = hashtagAudienceDialog.LJLJI;
                if (bmh2 != null) {
                    bmh2.LJLILLLLZI = 2;
                    ((ArrayList) bmh2.LJLJI).addAll(list);
                    bmh2.notifyDataSetChanged();
                } else {
                    o.LJIJI("mAdapter");
                    throw null;
                }
            }
        }
        HashtagAudienceDialog hashtagAudienceDialog2 = (HashtagAudienceDialog) afS4S0100100_5.l0;
        if (c28619BLb != null && (feedExtra = c28619BLb.LIZIZ) != null) {
            j = feedExtra.maxTime;
        } else {
            j = 0;
        }
        hashtagAudienceDialog2.LJLJJL = j;
    }

    public static final void accept$16(AfS4S0100100_5 afS4S0100100_5, Object obj) {
        long j = afS4S0100100_5.j1;
        if (j <= 0) {
            C29746Blu c29746Blu = (C29746Blu) afS4S0100100_5.l0;
            c29746Blu.LIZIZ(c29746Blu.LJIILIIL);
        } else {
            C29746Blu c29746Blu2 = (C29746Blu) afS4S0100100_5.l0;
            c29746Blu2.LJII = false;
            c29746Blu2.LJIILIIL(j);
        }
    }

    public static final void accept$17(AfS4S0100100_5 afS4S0100100_5, Object obj) {
        C32145CjV c32145CjV = (C32145CjV) obj;
        C32327CmR c32327CmR = (C32327CmR) afS4S0100100_5.l0;
        long j = afS4S0100100_5.j1;
        c32327CmR.getClass();
        if (c32145CjV != null) {
            long j2 = c32145CjV.LIZIZ;
            if (j2 != 0 && j != j2) {
                return;
            }
            Gift findGiftById = GiftManager.inst().findGiftById(c32145CjV.LIZ);
            c32327CmR.LIZJ = findGiftById;
            if (findGiftById == null || c32145CjV.LIZ <= 0) {
                EnumC30204BtI.FAST_GIFT.hide(c32327CmR.LIZIZ);
                return;
            }
            EnumC30204BtI enumC30204BtI = EnumC30204BtI.FAST_GIFT;
            if (!enumC30204BtI.isShowing(c32327CmR.LIZIZ)) {
                enumC30204BtI.show(c32327CmR.LIZIZ);
            }
            InterfaceC32326CmQ interfaceC32326CmQ = c32327CmR.LIZ;
            if (interfaceC32326CmQ == null) {
                return;
            }
            interfaceC32326CmQ.LIZ(c32327CmR.LIZJ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$18(AfS4S0100100_5 afS4S0100100_5, Object obj) {
        BLU response = (BLU) obj;
        o.LJIIIZ(response, "response");
        long currentTimeMillis = System.currentTimeMillis();
        long uptimeMillis = SystemClock.uptimeMillis();
        BLV blv = new BLV();
        blv.LIZ = response.LJ;
        blv.LIZIZ = "live_merge";
        blv.LIZJ = "live_cover";
        blv.LIZLLL = response.LIZLLL;
        blv.LJ = "/webcast/feed/";
        blv.LJFF = response.LJFF;
        BLW LIZ = blv.LIZ();
        C64738Paw c64738Paw = response.LIZJ;
        BLX.LIZ(afS4S0100100_5.j1, currentTimeMillis, uptimeMillis, LIZ, response.LIZIZ, c64738Paw);
        ((BLR) afS4S0100100_5.l0).LIZIZ((C28619BLb) response.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$19(AfS4S0100100_5 afS4S0100100_5, Object obj) {
        BLU response = (BLU) obj;
        o.LJIIIZ(response, "response");
        C28619BLb c28619BLb = (C28619BLb) response.LIZ;
        long currentTimeMillis = System.currentTimeMillis();
        long uptimeMillis = SystemClock.uptimeMillis();
        BLV blv = new BLV();
        blv.LIZ = response.LJ;
        blv.LIZIZ = "referral_task";
        blv.LIZJ = "H5";
        blv.LIZLLL = response.LIZLLL;
        blv.LJ = "/webcast/feed/";
        blv.LJFF = response.LJFF;
        BLW LIZ = blv.LIZ();
        C64738Paw c64738Paw = response.LIZJ;
        BLX.LIZ(afS4S0100100_5.j1, currentTimeMillis, uptimeMillis, LIZ, response.LIZIZ, c64738Paw);
        ((BLR) afS4S0100100_5.l0).LIZIZ(c28619BLb);
    }

    public static final void accept$2(AfS4S0100100_5 afS4S0100100_5, Object obj) {
        int i;
        Throwable th = (Throwable) obj;
        HashMap hashMap = new HashMap();
        hashMap.put("error_msg", th.getMessage());
        if (th instanceof C276516r) {
            i = ((C276516r) th).getErrorCode();
        } else {
            i = -16;
        }
        hashMap.put("error_code", Integer.valueOf(i));
        C0K2.LJIIL(SystemClock.uptimeMillis() - afS4S0100100_5.j1, 1, O5Y.LJJLI("ttlive_charge_current_diamond_status"), hashMap);
        C0K2.LJIIL(SystemClock.uptimeMillis() - afS4S0100100_5.j1, 1, O5Y.LJJL("ttlive_charge_current_diamond_status"), hashMap);
        ((InterfaceC32356Cmu) afS4S0100100_5.l0).LIZIZ(th);
    }

    public static final void accept$20(AfS4S0100100_5 afS4S0100100_5, Object obj) {
        int i;
        Throwable it = (Throwable) obj;
        o.LJIIIIZZ(it, "it");
        int currentTimeMillis = (int) (System.currentTimeMillis() - afS4S0100100_5.j1);
        String roomId = String.valueOf(((Room) afS4S0100100_5.l0).getId());
        o.LJIIIZ(roomId, "roomId");
        BZI LIZ = C28787BRn.LIZ("livesdk_fetch_fans_task_complete");
        LIZ.LJIIZILJ();
        if (it instanceof CH1) {
            LIZ.LJIJJ("custom_api_error", "error_type");
            CH1 ch1 = (CH1) it;
            LIZ.LJIJJ(Integer.valueOf(ch1.getErrorCode()), "errorCode");
            LIZ.LJIJJ(ch1.getErrorMsg(), "error_msg");
            LIZ.LJIJJ(ch1.getxTtLogId(), "log_id");
        } else if (it instanceof C29401Dk) {
            LIZ.LJIJJ("api_error", "error_type");
            C29401Dk c29401Dk = (C29401Dk) it;
            LIZ.LJIJJ(Integer.valueOf(c29401Dk.getErrorCode()), "errorCode");
            LIZ.LJIJJ(c29401Dk.getErrorMsg(), "error_msg");
            LIZ.LJIJJ(c29401Dk.getLogId(), "log_id");
        } else if (it instanceof C0TL) {
            LIZ.LJIJJ("net_error", "error_type");
            LIZ.LJIJJ(Integer.valueOf(((C0TL) it).getCronetError()), "errorCode");
            LIZ.LJIJJ(it.getMessage(), "error_msg");
        } else if (it instanceof C64799Pbv) {
            LIZ.LJIJJ("cronet_io_error", "error_type");
            LIZ.LJIJJ(-2, "errorCode");
            LIZ.LJIJJ(it.getMessage(), "error_msg");
        } else if (it instanceof C64698PaI) {
            LIZ.LJIJJ("net_not_available_error", "error_type");
            C15380j0.LIZLLL();
            if (C2NU.LIZ.LIZIZ()) {
                i = -4;
                LIZ.LJIJJ(Integer.valueOf(i), "errorCode");
                LIZ.LJIJJ(it.getMessage(), "error_msg");
            }
            i = -3;
            LIZ.LJIJJ(Integer.valueOf(i), "errorCode");
            LIZ.LJIJJ(it.getMessage(), "error_msg");
        } else {
            LIZ.LJIJJ(C16880lQ.LJLLILLLL(it.getClass()), "error_type");
            LIZ.LJIJJ(-1, "errorCode");
            LIZ.LJIJJ(it.getMessage(), "error_msg");
        }
        LIZ.LJIJJ(0, "success");
        LIZ.LJIJJ(Integer.valueOf(currentTimeMillis), "duration");
        LIZ.LJIJJ(roomId, "room_id");
        LIZ.LJJIIJZLJL();
    }

    public static final void accept$21(AfS4S0100100_5 afS4S0100100_5, Object obj) {
        CS5.LJFF.remove(afS4S0100100_5.j1);
        CS5 cs5 = CS5.LIZ;
        CS6 cs6 = (CS6) afS4S0100100_5.l0;
        cs6.LIZLLL = false;
        cs5.getClass();
        CS5.LJIIJJI(cs6);
    }

    public static final void accept$22(AfS4S0100100_5 afS4S0100100_5, Object obj) {
        Map map;
        Map map2;
        Map map3;
        RunnableC32211CkZ runnableC32211CkZ = (RunnableC32211CkZ) afS4S0100100_5.l0;
        long j = afS4S0100100_5.j1;
        LiveStateResponse liveStateResponse = (LiveStateResponse) obj;
        runnableC32211CkZ.getClass();
        LiveStateResponse.MapUserIdRoomId mapUserIdRoomId = liveStateResponse.mapUserIdRoomId;
        if (mapUserIdRoomId == null) {
            map = new HashMap(0);
        } else {
            map = mapUserIdRoomId.userRoomIdMap;
            if (map == null) {
                map = new HashMap(0);
            }
        }
        if (!map.isEmpty()) {
            LiveStateResponse.MapUserIdRoomId mapUserIdRoomId2 = liveStateResponse.mapUserIdRoomId;
            if (mapUserIdRoomId2 == null) {
                map2 = new HashMap(0);
            } else {
                map2 = mapUserIdRoomId2.userRoomIdMap;
                if (map2 == null) {
                    map2 = new HashMap(0);
                }
            }
            Set keySet = map2.keySet();
            LiveStateResponse.MapUserIdRoomId mapUserIdRoomId3 = liveStateResponse.mapUserIdRoomId;
            if (mapUserIdRoomId3 == null) {
                map3 = new HashMap(0);
            } else {
                map3 = mapUserIdRoomId3.userRoomIdMap;
                if (map3 == null) {
                    map3 = new HashMap(0);
                }
            }
            for (Object obj2 : keySet) {
                ((HashMap) runnableC32211CkZ.LJLJL.LIZIZ).put(obj2, Long.valueOf(j));
                Object obj3 = map3.get(obj2);
                if (obj3 == null) {
                    obj3 = 0L;
                }
                if (!C55077LjV.LJIIJ.equals(obj3)) {
                    ((HashMap) runnableC32211CkZ.LJLJL.LIZ).put(obj2, obj3);
                } else {
                    ((HashMap) runnableC32211CkZ.LJLJL.LIZ).remove(obj2);
                }
            }
        } else {
            ((HashMap) runnableC32211CkZ.LJLJL.LIZ).put(runnableC32211CkZ.LJLILLLLZI, 0L);
        }
        runnableC32211CkZ.LIZIZ();
    }

    public static final void accept$3(AfS4S0100100_5 afS4S0100100_5, Object obj) {
        ((CKJ) afS4S0100100_5.l0).LJI = false;
        long currentTimeMillis = System.currentTimeMillis() - afS4S0100100_5.j1;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("upload complete duration:");
        LIZ.append(currentTimeMillis);
        C0NB.LIZIZ("CaptureImageUploadController", X1D.LIZIZ(LIZ));
        C0K2.LJIIIZ(0, currentTimeMillis, "ttlive_sticker_upload_image_all");
        ((CKJ) afS4S0100100_5.l0).LJ();
    }

    public static final void accept$4(AfS4S0100100_5 afS4S0100100_5, Object obj) {
        Throwable th = (Throwable) obj;
        ((CKJ) afS4S0100100_5.l0).LJI = false;
        long currentTimeMillis = System.currentTimeMillis() - afS4S0100100_5.j1;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("upload error msg:");
        LIZ.append(th.getMessage());
        LIZ.append(" duration:");
        LIZ.append(currentTimeMillis);
        C0NB.LIZIZ("CaptureImageUploadController", X1D.LIZIZ(LIZ));
        JSONObject jSONObject = new JSONObject();
        if (th instanceof C276516r) {
            C05630Jz.LJFF(jSONObject, "error_code", ((C276516r) th).getErrorCode());
        } else {
            C05630Jz.LIZ(-1, "error_code", jSONObject);
        }
        C05630Jz.LJI(jSONObject, "error_msg", th.getMessage());
        C0K2.LJIIJ(0, currentTimeMillis, "ttlive_sticker_upload_image_error", jSONObject);
        ((CKJ) afS4S0100100_5.l0).LJ();
    }

    public static final void accept$5(AfS4S0100100_5 afS4S0100100_5, Object obj) {
        Long it = (Long) obj;
        GamePreparationFragment gamePreparationFragment = (GamePreparationFragment) afS4S0100100_5.l0;
        long j = afS4S0100100_5.j1;
        o.LJIIIIZZ(it, "it");
        gamePreparationFragment.wl(j - it.longValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$6(AfS4S0100100_5 afS4S0100100_5, Object obj) {
        long j;
        FeedExtra feedExtra;
        List<FeedItem> list;
        String str;
        BLU blu = (BLU) obj;
        C28619BLb c28619BLb = (C28619BLb) blu.LIZ;
        long currentTimeMillis = System.currentTimeMillis();
        long uptimeMillis = SystemClock.uptimeMillis();
        BLV blv = new BLV();
        blv.LIZ = blu.LJ;
        blv.LIZLLL = blu.LIZLLL;
        blv.LJ = "/webcast/feed/";
        blv.LJFF = blu.LJFF;
        BLX.LIZ(afS4S0100100_5.j1, currentTimeMillis, uptimeMillis, blv.LIZ(), blu.LIZIZ, blu.LIZJ);
        if (c28619BLb != null && (list = c28619BLb.LIZ) != null) {
            HashtagAudienceDialog hashtagAudienceDialog = (HashtagAudienceDialog) afS4S0100100_5.l0;
            if (list.isEmpty()) {
                if (hashtagAudienceDialog.LJLJJLL) {
                    ((C0K5) hashtagAudienceDialog._$_findCachedViewById(R.id.e2t)).LIZJ("WithGoLivePerm");
                } else {
                    ((C0K5) hashtagAudienceDialog._$_findCachedViewById(R.id.e2t)).LIZJ("WithoutGoLivePerm");
                }
            } else {
                ((C0K5) hashtagAudienceDialog._$_findCachedViewById(R.id.e2t)).LIZLLL();
                FeedExtra feedExtra2 = c28619BLb.LIZIZ;
                if (feedExtra2 != null && (str = feedExtra2.hashtag_text) != null) {
                    TextView textView = (TextView) hashtagAudienceDialog._$_findCachedViewById(R.id.e2y);
                    textView.setText(str);
                    textView.setVisibility(0);
                }
                BMH bmh = hashtagAudienceDialog.LJLJI;
                if (bmh != null) {
                    ((ArrayList) bmh.LJLJI).addAll(list);
                    bmh.notifyDataSetChanged();
                } else {
                    o.LJIJI("mAdapter");
                    throw null;
                }
            }
        }
        HashtagAudienceDialog hashtagAudienceDialog2 = (HashtagAudienceDialog) afS4S0100100_5.l0;
        if (c28619BLb != null && (feedExtra = c28619BLb.LIZIZ) != null) {
            j = feedExtra.maxTime;
        } else {
            j = 0;
        }
        hashtagAudienceDialog2.LJLJJL = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.97U, O] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.LinkedList] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.LinkedList] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$7(Y.AfS4S0100100_5 r35, java.lang.Object r36) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS4S0100100_5.accept$7(Y.AfS4S0100100_5, java.lang.Object):void");
    }

    public static final void accept$8(AfS4S0100100_5 afS4S0100100_5, Object obj) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cost", elapsedRealtime - afS4S0100100_5.j1);
        C32661Crp.LIZ((Throwable) obj, jSONObject);
        C32661Crp.LJI("match_item_list_failed", jSONObject);
        if (((BagListViewModel) afS4S0100100_5.l0).LJLJJLL.getValue() == EnumC32734Ct0.LOADING) {
            ((BagListViewModel) afS4S0100100_5.l0).LJLJJLL.setValue(EnumC32734Ct0.ERROR);
        }
    }

    public static final void accept$9(AfS4S0100100_5 afS4S0100100_5, Object obj) {
        DelHostRelationResponse delHostRelationResponse = (DelHostRelationResponse) obj;
        InterfaceC28469BFh interfaceC28469BFh = (InterfaceC28469BFh) ((WeakReference) afS4S0100100_5.l0).get();
        if (interfaceC28469BFh != null) {
            interfaceC28469BFh.LIZIZ(afS4S0100100_5.j1, delHostRelationResponse, null);
        }
    }

    public AfS4S0100100_5(long j, Object obj, int i) {
        this.$t = i;
        this.j1 = j;
        this.l0 = obj;
    }
}
