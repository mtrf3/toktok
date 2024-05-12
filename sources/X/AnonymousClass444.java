package X;

import android.os.SystemClock;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.commercialize.log.IAdLogService;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.444, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass444 {
    public static final java.util.Map<String, java.util.Map<String, Integer>> LJIIIZ = new LinkedHashMap();
    public final C98523to LIZ;
    public final AnonymousClass446 LIZIZ;
    public final String LIZJ;
    public int LIZLLL;
    public Long LJ;
    public C109544Rq LJFF;
    public final C62822Ol8 LJI;
    public final String LJII;
    public final String LJIIIIZZ;

    public final void LIZ() {
        String singleChatFromUserId;
        String adId = this.LIZIZ.getAdId();
        if (adId != null && (singleChatFromUserId = this.LIZ.getSingleChatFromUserId()) != null) {
            long parseLong = CastLongProtector.parseLong(singleChatFromUserId);
            this.LJ = Long.valueOf(SystemClock.elapsedRealtime());
            XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C65972iP(parseLong, adId, null), 3);
            LIZIZ("othershow", "", C51029K0z.LJJIIZI(new OSZ("ctx_session_id", this.LIZ.getConversationId())));
        }
    }

    public final void LIZJ() {
        Object obj;
        Long l = this.LJ;
        if (l != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - l.longValue();
            OSZ[] oszArr = new OSZ[7];
            oszArr[0] = new OSZ("ctx_session_id", this.LIZ.getConversationId());
            C109544Rq c109544Rq = this.LJFF;
            if (c109544Rq != null) {
                obj = Long.valueOf(c109544Rq.getMsgId());
            } else {
                obj = "";
            }
            oszArr[1] = new OSZ("ctx_message_id", obj);
            oszArr[2] = new OSZ("ctx_message_index", Integer.valueOf(this.LIZLLL));
            oszArr[3] = new OSZ("ctx_send_message_user_id", this.LJII);
            oszArr[4] = new OSZ("ctx_receive_message_user_id", this.LJIIIIZZ);
            oszArr[5] = new OSZ("ctx_duration", Long.valueOf(elapsedRealtime));
            oszArr[6] = new OSZ("ad_id", this.LIZIZ.getAdId());
            LIZIZ("otherclick", "exit_button", C113554cx.LJJL(oszArr));
        }
    }

    public final void LIZLLL(C109544Rq message) {
        Long l;
        o.LJIIIZ(message, "message");
        EnumC110124Tw.Companion.getClass();
        BaseContent LIZJ = C110134Tx.LIZJ(message);
        if (LIZJ == null || LIZJ.type != 706) {
            java.util.Map<String, java.util.Map<String, Integer>> map = LJIIIZ;
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            if (linkedHashMap.get(this.LIZJ) == null) {
                map.put(this.LIZJ, new LinkedHashMap());
            }
            java.util.Map map2 = (java.util.Map) linkedHashMap.get(this.LIZJ);
            if (map2 != null) {
                String adId = this.LIZIZ.getAdId();
                o.LJIIIIZZ(adId, "imAdLogData.adId");
                int i = this.LIZLLL + 1;
                this.LIZLLL = i;
                map2.put(adId, Integer.valueOf(i));
            }
            this.LJFF = message;
            OSZ[] oszArr = new OSZ[6];
            oszArr[0] = new OSZ("ctx_session_id", this.LIZ.getConversationId());
            C109544Rq c109544Rq = this.LJFF;
            if (c109544Rq != null) {
                l = Long.valueOf(c109544Rq.getMsgId());
            } else {
                l = null;
            }
            oszArr[1] = new OSZ("ctx_message_id", l);
            oszArr[2] = new OSZ("ctx_message_index", Integer.valueOf(this.LIZLLL));
            oszArr[3] = new OSZ("ctx_send_message_user_id", this.LJII);
            oszArr[4] = new OSZ("ctx_receive_message_user_id", this.LJIIIIZZ);
            oszArr[5] = new OSZ("ad_id", this.LIZIZ.getAdId());
            LIZIZ("otherclick", "button", C113554cx.LJJL(oszArr));
        }
    }

    public AnonymousClass444(C98523to c98523to, AnonymousClass446 anonymousClass446) {
        int i;
        Integer num;
        this.LIZ = c98523to;
        this.LIZIZ = anonymousClass446;
        String reqId = anonymousClass446.getReqId();
        reqId = reqId == null ? "" : reqId;
        this.LIZJ = reqId;
        java.util.Map map = (java.util.Map) ((LinkedHashMap) LJIIIZ).get(reqId);
        if (map != null && (num = (Integer) map.get(anonymousClass446.getAdId())) != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        this.LIZLLL = i;
        this.LJI = C221108m2.LIZIZ(AnonymousClass445.LJLIL);
        this.LJII = ((RBX) HG3.LJIILL()).getCurUserId();
        this.LJIIIIZZ = c98523to.getSingleChatFromUserId();
    }

    public final void LIZIZ(String str, String str2, java.util.Map<String, ? extends Object> map) {
        IAdLogService iAdLogService = (IAdLogService) this.LJI.getValue();
        if (iAdLogService != null) {
            String creativeId = this.LIZIZ.getCreativeId();
            String str3 = "";
            if (creativeId == null) {
                creativeId = "";
            }
            String logExtra = this.LIZIZ.getLogExtra();
            if (logExtra != null) {
                str3 = logExtra;
            }
            iAdLogService.LIZ(str, creativeId, str3, E2C.LIZJ("refer", str2), map);
        }
    }
}
