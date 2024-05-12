package Y;

import X.B83;
import X.BZI;
import X.C06490Nh;
import X.C07250Qf;
import X.C0K2;
import X.C0NB;
import X.C15380j0;
import X.C276516r;
import X.C28415BDf;
import X.C28787BRn;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29401Dk;
import X.C30588BzU;
import X.C30605Bzl;
import X.C30868C9o;
import X.C31086CHy;
import X.C31087CHz;
import X.C31099CIl;
import X.C31319CQx;
import X.C32537Cpp;
import X.C55077LjV;
import X.C73943T0h;
import X.C76800UCe;
import X.C78895Uxn;
import X.CI0;
import X.CI5;
import X.CQO;
import X.CQQ;
import X.CSC;
import X.InterfaceC64592gB;
import X.InterfaceC88472Yns;
import X.OSZ;
import android.app.Activity;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.android.live.publicscreen.impl.api.model.CommentTranslationResult;
import com.bytedance.android.live.room.ChatMessageRemoveEvent;
import com.bytedance.android.livesdk.comp.impl.game.GamePartnershipService;
import com.bytedance.android.livesdk.dataChannel.InitEnvelopeListChannel;
import com.bytedance.android.livesdk.envelope.model.RedEnvelopInfo;
import com.bytedance.android.livesdk.envelope.model.RedEnvelopeListResponse;
import com.bytedance.android.livesdk.impl.revenue.treasurebox.TreasureBoxService;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.live.feedpage.LiveStateResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import defpackage.g0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class AfS0S0300100_5 implements InterfaceC64592gB {
    public final int $t;
    public long j3;
    public Object l0;
    public Object l1;
    public Object l2;

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
            default:
                return;
        }
    }

    public static final void accept$0(AfS0S0300100_5 afS0S0300100_5, Object obj) {
        Long l;
        Long l2;
        C31086CHy c31086CHy = (C31086CHy) afS0S0300100_5.l0;
        CI0 ci0 = (CI0) afS0S0300100_5.l1;
        ChatMessage chatMessage = (ChatMessage) afS0S0300100_5.l2;
        long j = afS0S0300100_5.j3;
        Throwable th = (Throwable) obj;
        c31086CHy.getClass();
        C73943T0h.LIZ().LIZIZ(new C31099CIl(ci0, false));
        T t = c31086CHy.mView;
        if (t == 0 || !(th instanceof Exception)) {
            return;
        }
        ((CI5) t).YI(ci0, (Exception) th);
        c31086CHy.dataChannel.qv0(ChatMessageRemoveEvent.class, chatMessage);
        if (th instanceof C276516r) {
            long uptimeMillis = SystemClock.uptimeMillis() - j;
            int errorCode = ((C276516r) th).getErrorCode();
            if (!LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_chat", 0.2d)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("duration", uptimeMillis);
                jSONObject.put("error_code", errorCode);
                jSONObject.put("user_id", ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
                Room room = C31087CHz.LIZIZ;
                if (room != null) {
                    l = Long.valueOf(room.getId());
                } else {
                    l = null;
                }
                jSONObject.put("room_id", l);
                Room room2 = C31087CHz.LIZIZ;
                if (room2 != null) {
                    l2 = Long.valueOf(room2.getOwnerUserId());
                } else {
                    l2 = null;
                }
                jSONObject.put("anchor_id", l2);
            } catch (JSONException unused) {
            }
            C0K2.LIZLLL("ttlive_chat", new JSONObject(), null, jSONObject);
            return;
        }
        C0K2.LIZ("LiveCommentFailed", th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$1(AfS0S0300100_5 afS0S0300100_5, Object obj) {
        int i;
        boolean z;
        String str;
        Object obj2;
        String str2;
        T t;
        C31319CQx c31319CQx = (C31319CQx) afS0S0300100_5.l0;
        CSC csc = (CSC) afS0S0300100_5.l1;
        CQO cqo = (CQO) afS0S0300100_5.l2;
        long j = afS0S0300100_5.j3;
        BaseResponse baseResponse = (BaseResponse) obj;
        c31319CQx.getClass();
        boolean z2 = false;
        if (baseResponse != null && (t = baseResponse.data) != 0) {
            csc.LJJJJL(((CommentTranslationResult) t).translationText);
            csc.LJJL(((CommentTranslationResult) baseResponse.data).map);
            i = -1;
            z = true;
        } else {
            C30868C9o.LJI(C15380j0.LJIILJJIL(R.string.oqd));
            csc.LJJJJL(null);
            i = -1000;
            z = false;
        }
        csc.LJJIIJ(false);
        csc.LJJIZ(true);
        OSZ LJLL = c31319CQx.LJLL(csc);
        if (!((Boolean) LJLL.getFirst()).booleanValue()) {
            C30868C9o.LJI(C15380j0.LJIILJJIL(R.string.oqe));
            i = -1001;
        } else {
            z2 = z;
        }
        if (c31319CQx.LLIILZL != null) {
            BZI LIZ = C28787BRn.LIZ("livesdk_translate_comment");
            LIZ.LJIILLIIL(c31319CQx.LLIILZL.LJIIIIZZ);
            if (c31319CQx.LLIILZL.LJFF) {
                str = "anchor";
            } else {
                str = "user";
            }
            LIZ.LJIJJ(str, "user_type");
            String str3 = "1";
            if (z2) {
                obj2 = "1";
            } else {
                obj2 = CardStruct.IStatusCode.DEFAULT;
            }
            LIZ.LJIJJ(obj2, "translation_succeed");
            if (csc.LJJIIZI().LIZIZ) {
                str2 = "pin_comment";
            } else {
                str2 = "normal";
            }
            LIZ.LJIJJ(str2, "translate_type");
            if (!((Boolean) LJLL.getSecond()).booleanValue()) {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            LIZ.LJIJJ(str3, "is_top");
            LIZ.LJIJJ(Long.valueOf(cqo.LJIJJLI.getMessageId()), "message_id");
            LIZ.LJIJJ(Long.valueOf(cqo.LJIILLIIL.LIZ), "message_release_id");
            LIZ.LJIJJ(Long.valueOf(j), "to_user_id");
            Activity LJIILJJIL = g0.LJIILJJIL(c31319CQx.LLIILZL.LIZ);
            if (LJIILJJIL != null) {
                LIZ.LJIJJ(C29306Beo.LJJLIL(Integer.valueOf(LJIILJJIL.getRequestedOrientation())), "room_orientation");
            }
            if (!z2) {
                LIZ.LJIJJ(Integer.valueOf(i), "fail_type");
            }
            LIZ.LJJIIJZLJL();
        }
    }

    public static final void accept$2(AfS0S0300100_5 afS0S0300100_5, Object obj) {
        int i;
        String str;
        String str2;
        String str3;
        C31319CQx c31319CQx = (C31319CQx) afS0S0300100_5.l0;
        CSC csc = (CSC) afS0S0300100_5.l1;
        long j = afS0S0300100_5.j3;
        CQO cqo = (CQO) afS0S0300100_5.l2;
        Throwable th = (Throwable) obj;
        c31319CQx.getClass();
        csc.LJJIIJ(false);
        csc.LJJIZ(false);
        c31319CQx.LJLLJ(csc);
        String str4 = "";
        if (th instanceof C29401Dk) {
            C29401Dk c29401Dk = (C29401Dk) th;
            if (!TextUtils.isEmpty(c29401Dk.getPrompt())) {
                str4 = c29401Dk.getPrompt();
                C30868C9o.LJI(c29401Dk.getPrompt());
            } else {
                C30868C9o.LJI(C15380j0.LJIILJJIL(R.string.oqd));
            }
            i = c29401Dk.getErrorCode();
        } else {
            C30868C9o.LJI(C15380j0.LJIILJJIL(R.string.oqd));
            i = -1000;
        }
        CQQ cqq = c31319CQx.LLIILZL;
        if (cqq != null) {
            Activity LJIILJJIL = g0.LJIILJJIL(cqq.LIZ);
            if (LJIILJJIL != null) {
                str = C29306Beo.LJJLIL(Integer.valueOf(LJIILJJIL.getRequestedOrientation()));
            } else {
                str = "portrait";
            }
            BZI LIZ = C28787BRn.LIZ("livesdk_translate_comment");
            LIZ.LJIILLIIL(c31319CQx.LLIILZL.LJIIIIZZ);
            if (c31319CQx.LLIILZL.LJFF) {
                str2 = "anchor";
            } else {
                str2 = "user";
            }
            LIZ.LJIJJ(str2, "user_type");
            LIZ.LJIJJ(Long.valueOf(j), "to_user_id");
            if (csc.LJJIIZI().LIZIZ) {
                str3 = "pin_comment";
            } else {
                str3 = "normal";
            }
            C78895Uxn.LIZIZ(LIZ, str3, "translate_type", i, "fail_type");
            LIZ.LJIJJ(Long.valueOf(cqo.LJIJJLI.getMessageId()), "message_id");
            C07250Qf.LIZJ(cqo.LJIILLIIL.LIZ, LIZ, "message_release_id", str4, "translation_failed_reason");
            C06490Nh.LIZLLL(LIZ, CardStruct.IStatusCode.DEFAULT, "translation_succeed", str, "room_orientation");
        }
    }

    public static final void accept$3(AfS0S0300100_5 afS0S0300100_5, Object obj) {
        Throwable th = (Throwable) obj;
        long currentTimeMillis = System.currentTimeMillis() - afS0S0300100_5.j3;
        ((GamePartnershipService) afS0S0300100_5.l0).LJ(th);
        ((InterfaceC88472Yns) afS0S0300100_5.l1).invoke(C30605Bzl.LJII);
        C30588BzU.LJII(false, null, (DataChannel) afS0S0300100_5.l2, currentTimeMillis, th, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Long, O] */
    public static final void accept$4(AfS0S0300100_5 afS0S0300100_5, Object obj) {
        String str;
        List<RedEnvelopInfo> list;
        BaseResponse baseResponse = (BaseResponse) obj;
        RedEnvelopeListResponse redEnvelopeListResponse = (RedEnvelopeListResponse) baseResponse.data;
        if (redEnvelopeListResponse != null && (list = redEnvelopeListResponse.envelopList) != null) {
            DataChannel dataChannel = (DataChannel) afS0S0300100_5.l2;
            ((C32537Cpp) dataChannel.gv0(C28415BDf.class)).LIZ = Long.valueOf(System.currentTimeMillis());
            dataChannel.rv0(InitEnvelopeListChannel.class, list);
        } else {
            C0NB.LJ("TreasureBoxService", "err info: empty list");
        }
        RequestError requestError = baseResponse.LJ;
        if (requestError == null || (str = requestError.message) == null) {
            str = "";
        }
        TreasureBoxService treasureBoxService = (TreasureBoxService) afS0S0300100_5.l0;
        int i = baseResponse.statusCode;
        long j = afS0S0300100_5.j3;
        List<RedEnvelopInfo> list2 = ((RedEnvelopeListResponse) baseResponse.data).envelopList;
        Boolean bool = (Boolean) afS0S0300100_5.l1;
        treasureBoxService.getClass();
        TreasureBoxService.LIZ(i, str, j, list2, bool);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Long, O] */
    public static final void accept$5(AfS0S0300100_5 afS0S0300100_5, Object obj) {
        String str;
        List<RedEnvelopInfo> list;
        BaseResponse baseResponse = (BaseResponse) obj;
        RedEnvelopeListResponse redEnvelopeListResponse = (RedEnvelopeListResponse) baseResponse.data;
        if (redEnvelopeListResponse != null && (list = redEnvelopeListResponse.envelopList) != null) {
            DataChannel dataChannel = (DataChannel) afS0S0300100_5.l2;
            ((C32537Cpp) dataChannel.gv0(C28415BDf.class)).LIZ = Long.valueOf(System.currentTimeMillis());
            dataChannel.rv0(InitEnvelopeListChannel.class, list);
        } else {
            C0NB.LJ("TreasureBoxService", "err info: empty list");
        }
        RequestError requestError = baseResponse.LJ;
        if (requestError == null || (str = requestError.message) == null) {
            str = "";
        }
        TreasureBoxService treasureBoxService = (TreasureBoxService) afS0S0300100_5.l0;
        int i = baseResponse.statusCode;
        long j = afS0S0300100_5.j3;
        List<RedEnvelopInfo> list2 = ((RedEnvelopeListResponse) baseResponse.data).envelopList;
        Boolean bool = (Boolean) afS0S0300100_5.l1;
        treasureBoxService.getClass();
        TreasureBoxService.LIZ(i, str, j, list2, bool);
    }

    public static final void accept$6(AfS0S0300100_5 afS0S0300100_5, Object obj) {
        C55077LjV c55077LjV = (C55077LjV) afS0S0300100_5.l0;
        InterfaceC64592gB interfaceC64592gB = (InterfaceC64592gB) afS0S0300100_5.l1;
        long j = afS0S0300100_5.j3;
        List<User> list = (List) afS0S0300100_5.l2;
        LiveStateResponse liveStateResponse = (LiveStateResponse) obj;
        c55077LjV.getClass();
        if (liveStateResponse != null && interfaceC64592gB != null) {
            Map<Long, Long> map = liveStateResponse.mapUserIdRoomId.userRoomIdMap;
            if (map == null) {
                map = new HashMap<>(0);
            }
            Long l = map.get(Long.valueOf(j));
            if (l == null) {
                l = 0L;
            }
            if (l.longValue() != 0) {
                ((HashMap) c55077LjV.LIZ).put(Long.valueOf(j), l);
                ((HashMap) c55077LjV.LIZIZ).put(Long.valueOf(j), Long.valueOf(System.currentTimeMillis()));
            }
            c55077LjV.LJ.put(Long.valueOf(j), l);
            ((HashMap) c55077LjV.LIZLLL).put(Long.valueOf(j), Long.valueOf(System.currentTimeMillis()));
            c55077LjV.LIZIZ(list, map);
            interfaceC64592gB.accept(l);
        }
    }

    public AfS0S0300100_5(long j, CSC csc, CQO cqo, C31319CQx c31319CQx, int i) {
        this.$t = i;
        switch (i) {
            case 1:
                this.l0 = c31319CQx;
                this.l1 = csc;
                this.l2 = cqo;
                this.j3 = j;
                return;
            default:
                this.l0 = c31319CQx;
                this.l1 = csc;
                this.j3 = j;
                this.l2 = cqo;
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0003: IPUT (r2 I:long), (r0 I:Y.AfS0S0300100_5) (LINE:83951619) Y.AfS0S0300100_5.j3 long, block:B:1:0x0000 */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0005: IPUT (r4 I:java.lang.Object), (r0 I:Y.AfS0S0300100_5) (LINE:83951621) Y.AfS0S0300100_5.l0 java.lang.Object, block:B:1:0x0000 */
    /* JADX WARN: Type inference failed for: r1v0, types: [Y.AfS0S0300100_5, java.lang.Object] */
    public AfS0S0300100_5(long j, long j2, GamePartnershipService gamePartnershipService, InterfaceC88472Yns<? super C30605Bzl, C76800UCe> interfaceC88472Yns, DataChannel dataChannel) {
        long j3;
        Object obj;
        r1.$t = dataChannel;
        r1.j3 = j3;
        r1.l0 = obj;
        r1.l1 = gamePartnershipService;
        r1.l2 = interfaceC88472Yns;
        ?? obj2 = new Object();
    }
}
