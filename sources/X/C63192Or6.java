package X;

import android.content.ContentValues;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.im.core.internal.link.handler.CommandMessage;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.MsgTrace;
import com.bytedance.im.core.proto.NewMessageNotify;
import com.bytedance.im.core.proto.ResponseBody;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Or6, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63192Or6 extends AbstractC63234Orm {
    public C63192Or6() {
        super(EnumC63625Oy5.NEW_MSG_NOTIFY.getValue());
    }

    public static void LJIILL(String str) {
        boolean z;
        C63120Opw LJIIIZ;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IMConversationDao setConversationNoMore, cid:");
        LIZ.append(str);
        C63322OtC.LIZJ(X1D.LIZIZ(LIZ));
        long currentTimeMillis = System.currentTimeMillis();
        try {
            ContentValues contentValues = new ContentValues();
            EnumC63136OqC enumC63136OqC = EnumC63136OqC.COLUMN_HAS_MORE;
            contentValues.put(enumC63136OqC.key, (Integer) 0);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(EnumC63136OqC.COLUMN_ID.key);
            LIZ2.append("=? and ");
            LIZ2.append(enumC63136OqC.key);
            LIZ2.append("=?");
            z = true;
            if (C78847Ux1.LJJLIIIJLJLI("conversation_list", contentValues, X1D.LIZIZ(LIZ2), new String[]{str, "1"}) <= 0) {
                z = false;
            }
            try {
                C63275OsR.LIZIZ().LJI(currentTimeMillis, "setConversationNoMore");
            } catch (Exception e) {
                e = e;
                C63322OtC.LJ("IMConversationDao setConversationNoMore ", e);
                C63337OtR.LJFF(e);
                if (z) {
                    return;
                } else {
                    return;
                }
            }
        } catch (Exception e2) {
            e = e2;
            z = false;
        }
        if (z || (LJIIIZ = C115284fk.LJIILIIL().LJIIIZ(str)) == null) {
            return;
        }
        LJIIIZ.setHasMore(false);
    }

    public static void LJIILLIIL(C63196OrA c63196OrA) {
        C109544Rq c109544Rq = c63196OrA.LJFF;
        boolean z = c63196OrA.LIZLLL;
        C63120Opw LJIIIZ = C115284fk.LJIILIIL().LJIIIZ(c109544Rq.getConversationId());
        ArrayList arrayList = new ArrayList();
        arrayList.add(c109544Rq);
        if (z) {
            C63309Osz.LIZLLL().LJFF(arrayList, 0, new C107074Id());
            C63193Or7 LIZIZ = C63198OrC.LIZIZ(c109544Rq.getMsgId());
            if (LIZIZ != null) {
                C63308Osy.LJI().getClass();
                long LJ = C63308Osy.LJ();
                LIZIZ.LJFF = LJ - LIZIZ.LIZLLL;
                LIZIZ.LJI = LJ - LIZIZ.LIZJ;
            }
            C109544Rq c109544Rq2 = c63196OrA.LJFF;
            C63198OrC.LIZLLL(c109544Rq2);
            C63198OrC.LIZJ(c109544Rq2);
        } else {
            String uuid = c109544Rq.getUuid();
            if (!TextUtils.isEmpty(uuid) && ((CopyOnWriteArraySet) C63269OsL.LJIILIIL).remove(uuid)) {
                C63309Osz LIZLLL = C63309Osz.LIZLLL();
                boolean z2 = c63196OrA.LJ;
                LIZLLL.getClass();
                if (!TextUtils.isEmpty(c109544Rq.getConversationId())) {
                    LIZLLL.LIZJ(c109544Rq.getConversationId(), new C63250Os2(c109544Rq, z2));
                }
            }
            C115944go LIZJ = C115944go.LIZJ();
            String conversationId = c109544Rq.getConversationId();
            LIZJ.getClass();
            if (!TextUtils.isEmpty(conversationId) && !V1B.LJJZZIII(arrayList)) {
                C63291Osh.LIZ().getClass();
            }
            C63309Osz.LIZLLL().LJIIJJI(arrayList);
        }
        C115284fk.LJIILIIL().LJIJI(2, LJIIIZ);
        if (z && !C115284fk.LJIILIIL().LJIILJJIL(c109544Rq.getConversationId()) && !c109544Rq.isSelf()) {
            InterfaceC63292Osi LIZIZ2 = C63308Osy.LJI().LIZIZ();
            Collections.singletonList(c109544Rq);
            LIZIZ2.LJIIZILJ();
        }
    }

    public static EP1 LJIILJJIL(EP1 ep1, MsgTrace msgTrace) {
        if (ep1 == null) {
            return null;
        }
        if (msgTrace == null) {
            return ep1;
        }
        java.util.Map<Integer, Long> map = msgTrace.metrics;
        if (map == null) {
            return ep1;
        }
        for (Map.Entry<Integer, Long> entry : map.entrySet()) {
            ep1.LIZ(entry.getKey().intValue(), entry.getValue().longValue());
        }
        return ep1;
    }

    public final void LJIIZILJ(C63196OrA c63196OrA, NewMessageNotify newMessageNotify) {
        try {
            C63322OtC.LJFF("NewMsgNotifyHandler processNotify, start save");
            long uptimeMillis = SystemClock.uptimeMillis();
            EP1 ep1 = c63196OrA.LJII;
            if (ep1 != null) {
                ep1.LIZ(C63611Oxr.LIZJ, SystemClock.elapsedRealtimeNanos());
            }
            HashMap hashMap = new HashMap();
            C63622Oy2 c63622Oy2 = this.LIZJ;
            if (c63622Oy2 != null) {
                hashMap.put("s:get_msg_log_id", c63622Oy2.LJIIIIZZ());
            }
            C63195Or9 LJIJ = LJIJ(newMessageNotify.message, false, hashMap, 0);
            if (ep1 != null) {
                ep1.LIZ(C63611Oxr.LIZLLL, SystemClock.elapsedRealtimeNanos());
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", SystemClock.uptimeMillis() - uptimeMillis);
                jSONObject.put("msg_count", 1);
                jSONObject.put("msg_source", 0);
                C63337OtR.LIZLLL("im_save_msg_list_duration", jSONObject);
            } catch (Exception unused) {
            }
            if (LJIJ == null || LJIJ.LIZJ) {
                c63196OrA.LIZJ = true;
                if (LJIJ == null) {
                    return;
                }
            }
            if (LJIJ.LIZ != null && LJIJ.LIZJ) {
                new C63357Otl().LJIILIIL(LJIJ.LIZ, this.LIZJ, EnumC63359Otn.MSG_RECEIVE_BY_WS);
                MessageBody messageBody = newMessageNotify.message;
                if (messageBody != null && messageBody.status.intValue() == 0) {
                    C63269OsL.LJIIIIZZ(LJIJ.LIZ);
                }
                c63196OrA.LJFF = LJIJ.LIZ;
                c63196OrA.LIZLLL = LJIJ.LIZIZ;
                c63196OrA.LJ = LJIJ.LIZLLL;
                if (ep1 != null) {
                    ep1.LIZ(C63611Oxr.LJ, SystemClock.elapsedRealtimeNanos());
                }
                C63120Opw LJIIIZ = C63133Oq9.LJIIIZ(LJIJ.LIZ.getConversationId(), true);
                if (LJIIIZ != null && !LJIIIZ.isWaitingInfo() && !LJIIIZ.isTemp()) {
                    LJIJI(LJIIIZ, LJIJ.LIZ, newMessageNotify.badge_count);
                    c63196OrA.LJI = LJIIIZ;
                }
                if (ep1 != null) {
                    ep1.LIZ(C63611Oxr.LJFF, SystemClock.elapsedRealtimeNanos());
                }
            }
        } catch (Exception e) {
            C63322OtC.LJ("NewMsgNotifyHandler ", e);
            C63272OsO.LJIIL(0, e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIJI(X.C63120Opw r18, X.C109544Rq r19, java.lang.Integer r20) {
        /*
            Method dump skipped, instructions count: 824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63192Or6.LJIJI(X.Opw, X.4Rq, java.lang.Integer):void");
    }

    @Override // X.AbstractC63234Orm
    public final void LJIILIIL(int i, ResponseBody responseBody, EP1 ep1) {
        int[] LIZLLL;
        NewMessageNotify newMessageNotify = responseBody.has_new_message_notify;
        if (newMessageNotify.notify_type != P15.PER_USER || (LIZLLL = C63312Ot2.LIZLLL()) == null) {
            return;
        }
        C63193Or7 LIZ = C63198OrC.LIZ(newMessageNotify.message.server_message_id.longValue());
        Long l = this.LIZJ.LJLJL.start_time_stamp;
        if (l != null) {
            LIZ.LIZIZ = l.longValue();
        } else {
            LIZ.LIZIZ = newMessageNotify.message.create_time.longValue();
        }
        C63308Osy.LJI().getClass();
        LIZ.LIZLLL = C63308Osy.LJ();
        LIZ.LIZJ = newMessageNotify.message.create_time.longValue();
        LIZ.LJ = LIZ.LIZLLL - LIZ.LIZIZ;
        LIZ.LJIIIZ = true;
        String LJIIIIZZ = this.LIZJ.LJIIIIZZ();
        o.LJIIIZ(LJIIIIZZ, "<set-?>");
        LIZ.LJIIJ = LJIIIIZZ;
        for (int i2 : LIZLLL) {
            if (i == i2 && !C63309Osz.LIZLLL().LJ(i, newMessageNotify)) {
                if (newMessageNotify.message == null) {
                    C63322OtC.LIZLLL("NewMsgNotifyHandler notifyByUser message null");
                } else if (!C63308Osy.LJI().LIZLLL().LJZI && C63305Osv.LIZIZ().LIZJ() == 1) {
                    if (CommandMessage.LJIIIZ(newMessageNotify.message)) {
                        if (C115394fv.LJIIIIZZ(newMessageNotify.message)) {
                            C115394fv.LJII().LJI(i, newMessageNotify.message);
                            C63356Otk.LJIIIZ().getClass();
                            C63356Otk.LJIIIIZZ(i, 2);
                        } else {
                            RunnableC63345OtZ.LIZLLL(new C63202OrG(i, this, newMessageNotify), new C63203OrH(i), C63346Ota.LIZJ());
                        }
                    } else {
                        RunnableC63345OtZ.LIZLLL(new C63200OrE(this, i, newMessageNotify, ep1), new C63199OrD(i, this, newMessageNotify), C63346Ota.LIZJ());
                    }
                } else if (C115394fv.LJIIIIZZ(newMessageNotify.message)) {
                    C115394fv.LJII().LJI(i, newMessageNotify.message);
                    C63308Osy.LJI().LJIIL(i, 2);
                } else {
                    RunnableC63345OtZ.LIZLLL(new C63201OrF(this, i, newMessageNotify, ep1), new C63197OrB(i, this, newMessageNotify), C63346Ota.LIZJ());
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b8, code lost:
    
        if (r11.version.longValue() > r10.getVersion()) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C63195Or9 LJIJ(com.bytedance.im.core.proto.MessageBody r11, boolean r12, java.util.Map<java.lang.String, java.lang.String> r13, int r14) {
        /*
            Method dump skipped, instructions count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63192Or6.LJIJ(com.bytedance.im.core.proto.MessageBody, boolean, java.util.Map, int):X.Or9");
    }
}
