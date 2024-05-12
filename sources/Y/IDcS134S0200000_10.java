package Y;

import X.C109544Rq;
import X.C114844f2;
import X.C115944go;
import X.C16880lQ;
import X.C32H;
import X.C47922IrO;
import X.C63081OpJ;
import X.C63120Opw;
import X.C63124Oq0;
import X.C63133Oq9;
import X.C63143OqJ;
import X.C63147OqN;
import X.C63148OqO;
import X.C63150OqQ;
import X.C63153OqT;
import X.C63162Oqc;
import X.C63172Oqm;
import X.C63216OrU;
import X.C63219OrX;
import X.C63220OrY;
import X.C63227Orf;
import X.C63229Orh;
import X.C63265OsH;
import X.C63280OsW;
import X.C63286Osc;
import X.C63308Osy;
import X.C63322OtC;
import X.C63323OtD;
import X.C63337OtR;
import X.C63356Otk;
import X.C63451OvH;
import X.C63496Ow0;
import X.C63536Owe;
import X.C63540Owi;
import X.C63577OxJ;
import X.C63582OxO;
import X.C63622Oy2;
import X.C63682Oz0;
import X.C63685Oz3;
import X.C78847Ux1;
import X.C89453Z8v;
import X.EnumC109604Rw;
import X.EnumC63157OqX;
import X.InterfaceC63146OqM;
import X.InterfaceC63352Otg;
import X.X1D;
import android.content.ContentValues;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.GetMessagesResponseBody;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.ModifyMessagePropertyRequestBody;
import com.bytedance.im.core.proto.ModifyPropertyBody;
import com.bytedance.im.core.proto.ModifyPropertyContent;
import com.bytedance.im.core.proto.ParticipantMinIndex;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import defpackage.b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class IDcS134S0200000_10 implements InterfaceC63352Otg {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC63352Otg
    public final Object LIZIZ() {
        switch (this.$t) {
            case 0:
                return LIZIZ$0(this);
            case 1:
                return LIZIZ$1(this);
            case 2:
                return LIZIZ$2(this);
            case 3:
                return LIZIZ$3(this);
            case 4:
                return LIZIZ$4(this);
            case 5:
                return LIZIZ$5(this);
            case 6:
                return LIZIZ$6(this);
            case 7:
                return LIZIZ$7(this);
            case 8:
                return LIZIZ$8(this);
            case 9:
                return LIZIZ$9(this);
            case 10:
                return LIZIZ$10(this);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return LIZIZ$11(this);
            case 12:
                return LIZIZ$12(this);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return LIZIZ$13(this);
            case 14:
                return LIZIZ$14(this);
            case 15:
                return LIZIZ$15(this);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return LIZIZ$16(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZIZ$0(Y.IDcS134S0200000_10 r15) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDcS134S0200000_10.LIZIZ$0(Y.IDcS134S0200000_10):java.lang.Object");
    }

    public static final Object LIZIZ$1(IDcS134S0200000_10 iDcS134S0200000_10) {
        return Boolean.valueOf(C63147OqN.LIZIZ(((C63227Orf) ((IDbS399S0100000_10) iDcS134S0200000_10.l1).l0).LIZ.getConversationId(), (Map) iDcS134S0200000_10.l0));
    }

    public static final Object LIZIZ$10(IDcS134S0200000_10 iDcS134S0200000_10) {
        C63322OtC.LJFF("MessageModel loadNewerMessageListToEnd onRun");
        return ((C63220OrY) iDcS134S0200000_10.l1).LJIIJ(0, (List) iDcS134S0200000_10.l0);
    }

    public static final Object LIZIZ$11(IDcS134S0200000_10 iDcS134S0200000_10) {
        C63582OxO c63582OxO = (C63582OxO) iDcS134S0200000_10.l1;
        c63582OxO.LIZLLL.LJIIJ(c63582OxO.LIZ, c63582OxO.LIZJ, (C114844f2) iDcS134S0200000_10.l0);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00dd A[Catch: Exception -> 0x00e7, TryCatch #0 {Exception -> 0x00e7, blocks: (B:23:0x0048, B:24:0x0058, B:26:0x005e, B:29:0x0067, B:31:0x0073, B:34:0x007c, B:45:0x009f, B:47:0x00a6, B:50:0x00ad, B:51:0x00c8, B:53:0x00ce, B:57:0x00dd, B:58:0x00e3), top: B:22:0x0048 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZIZ$12(Y.IDcS134S0200000_10 r14) {
        /*
            java.lang.String r6 = "IMConversationDao.markAllStrangerConversationRead"
            java.lang.Object r0 = r14.l0
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r8 = r0.iterator()
        La:
            boolean r0 = r8.hasNext()
            r5 = 0
            r3 = 0
            if (r0 == 0) goto L3a
            java.lang.Object r1 = r8.next()
            java.lang.String r1 = (java.lang.String) r1
            X.4fk r0 = X.C115284fk.LJIILIIL()
            X.Opw r7 = r0.LJIIIZ(r1)
            if (r7 != 0) goto L27
            X.Opw r7 = X.C63133Oq9.LJIIIZ(r1, r5)
        L27:
            if (r7 == 0) goto La
            long r1 = r7.getUnreadCount()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L32
            goto La
        L32:
            java.lang.Object r0 = r14.l1
            java.util.List r0 = (java.util.List) r0
            r0.add(r7)
            goto La
        L3a:
            java.lang.Object r1 = r14.l1
            java.util.List r1 = (java.util.List) r1
            r0 = 0
            if (r1 == 0) goto L47
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L48
        L47:
            return r0
        L48:
            X.C78847Ux1.LJJLIIIJJI(r6)     // Catch: java.lang.Exception -> Le7
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Exception -> Le7
            r7.<init>()     // Catch: java.lang.Exception -> Le7
            java.lang.Object r1 = r14.l1     // Catch: java.lang.Exception -> Le7
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Exception -> Le7
            java.util.Iterator r13 = r1.iterator()     // Catch: java.lang.Exception -> Le7
        L58:
            boolean r1 = r13.hasNext()     // Catch: java.lang.Exception -> Le7
            if (r1 == 0) goto L9f
            java.lang.Object r10 = r13.next()     // Catch: java.lang.Exception -> Le7
            X.Opw r10 = (X.C63120Opw) r10     // Catch: java.lang.Exception -> Le7
            if (r10 != 0) goto L67
            goto L58
        L67:
            long r11 = r10.getLastMessageIndex()     // Catch: java.lang.Exception -> Le7
            long r8 = r10.getReadIndex()     // Catch: java.lang.Exception -> Le7
            int r1 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r1 > 0) goto L7c
            long r8 = r10.getUnreadCount()     // Catch: java.lang.Exception -> Le7
            int r1 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r1 != 0) goto L7c
            goto L58
        L7c:
            r10.setUnreadCount(r3)     // Catch: java.lang.Exception -> Le7
            long r1 = r10.getLastMessageIndex()     // Catch: java.lang.Exception -> Le7
            r10.setReadIndex(r1)     // Catch: java.lang.Exception -> Le7
            long r1 = r10.getMaxIndexV2()     // Catch: java.lang.Exception -> Le7
            r10.setReadIndexV2(r1)     // Catch: java.lang.Exception -> Le7
            int r1 = r10.getBadgeCount()     // Catch: java.lang.Exception -> Le7
            r10.setReadBadgeCount(r1)     // Catch: java.lang.Exception -> Le7
            r10.setUnreadSelfMentionedMessages(r0)     // Catch: java.lang.Exception -> Le7
            java.lang.String r1 = r10.getConversationId()     // Catch: java.lang.Exception -> Le7
            r7.add(r1)     // Catch: java.lang.Exception -> Le7
            goto L58
        L9f:
            java.lang.Object r3 = r14.l1     // Catch: java.lang.Exception -> Le7
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Exception -> Le7
            r2 = 1
            if (r3 == 0) goto Lda
            boolean r0 = r3.isEmpty()     // Catch: java.lang.Exception -> Le7
            if (r0 == 0) goto Lad
            goto Lda
        Lad:
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Exception -> Le7
            java.lang.String r0 = "IMConversationDao updateConversation by list:"
            r1.append(r0)     // Catch: java.lang.Exception -> Le7
            int r0 = r3.size()     // Catch: java.lang.Exception -> Le7
            r1.append(r0)     // Catch: java.lang.Exception -> Le7
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Exception -> Le7
            X.C63322OtC.LIZJ(r0)     // Catch: java.lang.Exception -> Le7
            java.util.Iterator r1 = r3.iterator()     // Catch: java.lang.Exception -> Le7
        Lc8:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Exception -> Le7
            if (r0 == 0) goto Ld8
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Exception -> Le7
            X.Opw r0 = (X.C63120Opw) r0     // Catch: java.lang.Exception -> Le7
            X.C63133Oq9.LJIJJLI(r0, r5)     // Catch: java.lang.Exception -> Le7
            goto Lc8
        Ld8:
            r0 = 1
            goto Ldb
        Lda:
            r0 = 0
        Ldb:
            if (r0 == 0) goto Le3
            X.C63134OqA.LIZLLL(r7)     // Catch: java.lang.Exception -> Le7
            X.C63150OqQ.LJIL(r7)     // Catch: java.lang.Exception -> Le7
        Le3:
            X.C78847Ux1.LJIJJLI(r6, r2)     // Catch: java.lang.Exception -> Le7
            goto Lee
        Le7:
            r0 = move-exception
            X.C63322OtC.LJ(r6, r0)
            X.C78847Ux1.LJIJJLI(r6, r5)
        Lee:
            java.lang.Object r0 = r14.l1
            java.util.List r0 = (java.util.List) r0
            goto L47
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDcS134S0200000_10.LIZIZ$12(Y.IDcS134S0200000_10):java.lang.Object");
    }

    public static final Object LIZIZ$13(IDcS134S0200000_10 iDcS134S0200000_10) {
        int intValue;
        List list = (List) iDcS134S0200000_10.l0;
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (ConversationInfoV2 conversationInfoV2 : (List) iDcS134S0200000_10.l0) {
            C63120Opw LJIIIZ = C63133Oq9.LJIIIZ(conversationInfoV2.conversation_id, true);
            if (LJIIIZ == null) {
                String str = conversationInfoV2.conversation_id;
                Integer num = conversationInfoV2.conversation_type;
                if (num == null) {
                    intValue = -1;
                } else {
                    intValue = num.intValue();
                }
                C63124Oq0.LJIIIIZZ(intValue, str, C63081OpJ.LJIILL(conversationInfoV2.conversation_id, conversationInfoV2.first_page_participants.participants));
                LJIIIZ = C63081OpJ.LJIIIIZZ(((C63280OsW) iDcS134S0200000_10.l1).LIZJ, null, conversationInfoV2, 0L, null, null, true);
                C63133Oq9.LJIIZILJ(LJIIIZ);
                Boolean bool = conversationInfoV2.first_page_participants.has_more;
                if (bool != null && bool.booleanValue()) {
                    new C63265OsH(false).LJIILIIL(conversationInfoV2.conversation_id, 0L, null);
                }
            }
            arrayList.add(LJIIIZ);
        }
        return arrayList;
    }

    public static final Object LIZIZ$14(IDcS134S0200000_10 iDcS134S0200000_10) {
        long uptimeMillis = SystemClock.uptimeMillis();
        C63540Owi c63540Owi = ((C63536Owe) iDcS134S0200000_10.l1).LIZJ;
        c63540Owi.LIZIZ = uptimeMillis - c63540Owi.LIZ;
        C47922IrO.LIZ();
        boolean LJJII = C63150OqQ.LJJII(false, (C109544Rq) iDcS134S0200000_10.l0, true);
        C63120Opw LJIIIZ = C63133Oq9.LJIIIZ(((C109544Rq) iDcS134S0200000_10.l0).getConversationId(), false);
        if (LJIIIZ != null && LJIIIZ.getLastMessageIndex() < ((C109544Rq) iDcS134S0200000_10.l0).getIndex()) {
            C63133Oq9.LJJI((C109544Rq) iDcS134S0200000_10.l0);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", SystemClock.uptimeMillis() - uptimeMillis);
            C63337OtR.LIZLLL("im_save_msg_duration", jSONObject);
        } catch (Exception unused) {
        }
        ReferenceInfo referenceInfo = ((C109544Rq) iDcS134S0200000_10.l0).getReferenceInfo();
        if (referenceInfo != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SendMsgHandler insertOrUpdate ref info key ref_");
            LIZ.append(referenceInfo.referenced_message_id);
            C63322OtC.LJFF(X1D.LIZIZ(LIZ));
            C109544Rq LJIILIIL = C63150OqQ.LJIILIIL(referenceInfo.referenced_message_id.longValue());
            if (LJIILIIL != null) {
                if (LJIILIIL.isDeleted()) {
                    C63577OxJ newBuilder2 = referenceInfo.newBuilder2();
                    newBuilder2.LJI = EnumC109604Rw.DELETED;
                    referenceInfo = newBuilder2.build();
                } else if (LJIILIIL.isRecalled()) {
                    C63577OxJ newBuilder22 = referenceInfo.newBuilder2();
                    newBuilder22.LJI = EnumC109604Rw.RECALLED;
                    referenceInfo = newBuilder22.build();
                }
            }
            String uuid = ((C109544Rq) iDcS134S0200000_10.l0).getUuid();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("ref_");
            LIZ2.append(referenceInfo.referenced_message_id);
            C63172Oqm.LIZLLL(uuid, X1D.LIZIZ(LIZ2), GsonProtectorUtils.toJson(C63682Oz0.LIZ, referenceInfo));
            Long l = referenceInfo.root_message_id;
            if (l != null && l.longValue() > 0) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("SendMsgHandler referenceInfo.root_message_id = ");
                LIZ3.append(referenceInfo.root_message_id);
                LIZ3.append("，msg.getContent() = ");
                LIZ3.append(((C109544Rq) iDcS134S0200000_10.l0).getContent());
                LIZ3.append("，msg.getUuid() = ");
                LIZ3.append(((C109544Rq) iDcS134S0200000_10.l0).getUuid());
                LIZ3.append("，msg.getMsgId() = ");
                LIZ3.append(((C109544Rq) iDcS134S0200000_10.l0).getMsgId());
                C63322OtC.LJFF(X1D.LIZIZ(LIZ3));
                String uuid2 = ((C109544Rq) iDcS134S0200000_10.l0).getUuid();
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("ref_root_");
                LIZ4.append(referenceInfo.root_message_id);
                String LIZIZ = X1D.LIZIZ(LIZ4);
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append(((C109544Rq) iDcS134S0200000_10.l0).getMsgId());
                LIZ5.append("");
                C63172Oqm.LIZLLL(uuid2, LIZIZ, X1D.LIZIZ(LIZ5));
            }
        }
        ((C63536Owe) iDcS134S0200000_10.l1).LIZJ.LIZJ = SystemClock.uptimeMillis();
        return Boolean.valueOf(LJJII);
    }

    public static final Object LIZIZ$15(IDcS134S0200000_10 iDcS134S0200000_10) {
        int i;
        String str;
        C109544Rq LJIILJJIL;
        C63216OrU c63216OrU = (C63216OrU) iDcS134S0200000_10.l1;
        C63219OrX c63219OrX = (C63219OrX) iDcS134S0200000_10.l0;
        c63216OrU.getClass();
        List LJIILIIL = C63216OrU.LJIILIIL(c63219OrX);
        if (LJIILIIL == null) {
            return Boolean.FALSE;
        }
        if (C63308Osy.LJI().LIZLLL().LJL && ((C63219OrX) iDcS134S0200000_10.l0).getServerMessageId() == 0) {
            i = 5;
        } else {
            i = 1;
        }
        Iterator it = ((ArrayList) LJIILIIL).iterator();
        while (true) {
            InterfaceC63146OqM interfaceC63146OqM = null;
            if (!it.hasNext()) {
                break;
            }
            C32H c32h = (C32H) it.next();
            if (c32h != null && !TextUtils.isEmpty(c32h.msgUuid)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("IMMsgPropertyDao updateProperty status: ");
                LIZ.append(i);
                C63322OtC.LIZJ(X1D.LIZIZ(LIZ));
                c32h.status = i;
                C78847Ux1.LJJLIIIJJI("IMMsgPropertyDao.updateProperty");
                C32H LJI = C63153OqT.LJI(c32h.msgUuid, c32h.key, c32h.idempotent_id);
                if (LJI == null) {
                    try {
                        try {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("insert or ignore into msg_property_new values(");
                            LIZ2.append(C63143OqJ.LJ(EnumC63157OqX.values().length));
                            LIZ2.append(")");
                            interfaceC63146OqM = C78847Ux1.LJIJ(X1D.LIZIZ(LIZ2));
                            C63153OqT.LIZ(interfaceC63146OqM, c32h);
                            interfaceC63146OqM.LJIILJJIL();
                        } catch (Exception e) {
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("IMMsgPropertyDao updateProperty status: ");
                            LIZ3.append(i);
                            C63322OtC.LJ(X1D.LIZIZ(LIZ3), e);
                            C16880lQ.LLLLIIL(e);
                            C63337OtR.LJFF(e);
                            C78847Ux1.LJIJJLI("IMMsgPropertyDao.updateProperty", false);
                        }
                    } finally {
                        C63143OqJ.LIZIZ(interfaceC63146OqM);
                    }
                } else {
                    int i2 = LJI.status;
                    if (i2 == 1 || i2 == 4) {
                        c32h.status = 4;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(EnumC63157OqX.COLUMN_SENDER.key, c32h.uid);
                    contentValues.put(EnumC63157OqX.COLUMN_SENDER_SEC.key, c32h.sec_uid);
                    contentValues.put(EnumC63157OqX.COLUMN_VALUE.key, c32h.value);
                    contentValues.put(EnumC63157OqX.COLUMN_DELETED.key, Integer.valueOf(c32h.deleted));
                    contentValues.put(EnumC63157OqX.COLUMN_VERSION.key, Long.valueOf(c32h.version));
                    contentValues.put(EnumC63157OqX.COLUMN_STATUS.key, Integer.valueOf(c32h.status));
                    C78847Ux1.LJJLIIIJLJLI("msg_property_new", contentValues, C63153OqT.LJII(), new String[]{c32h.msgUuid, c32h.key, c32h.idempotent_id});
                }
                C78847Ux1.LJIJJLI("IMMsgPropertyDao.updateProperty", true);
            }
            if (c32h.status == 4) {
                ((C63219OrX) iDcS134S0200000_10.l0).removePropertyContent(c32h);
            }
        }
        C63150OqQ.LJJIIJ(((C63219OrX) iDcS134S0200000_10.l0).getClientMessageId());
        if (!((C63219OrX) iDcS134S0200000_10.l0).getMute() && (LJIILJJIL = C63150OqQ.LJIILJJIL(((C63219OrX) iDcS134S0200000_10.l0).getClientMessageId())) != null) {
            LJIILJJIL.addLocalExt("s:modify_msg_property_refresh", "true");
            C63356Otk.LJIIIZ().LJIIJ(new ARunnableS46S0100000_10(LJIILJJIL, 212));
        }
        if (i == 1) {
            C63216OrU c63216OrU2 = (C63216OrU) iDcS134S0200000_10.l1;
            C63219OrX c63219OrX2 = (C63219OrX) iDcS134S0200000_10.l0;
            c63216OrU2.getClass();
            if (c63219OrX2 != null && c63219OrX2.getPropertyContentList() != null && !c63219OrX2.getPropertyContentList().isEmpty()) {
                C63451OvH c63451OvH = new C63451OvH();
                c63451OvH.LIZLLL = c63219OrX2.getConversationId();
                c63451OvH.LJ = Integer.valueOf(c63219OrX2.getConversationType());
                c63451OvH.LJFF = Long.valueOf(c63219OrX2.getConversationShortId());
                c63451OvH.LJI = Long.valueOf(c63219OrX2.getServerMessageId());
                c63451OvH.LJII = c63219OrX2.getClientMessageId();
                List<ModifyPropertyContent> propertyContentList = c63219OrX2.getPropertyContentList();
                C63685Oz3.LIZ(propertyContentList);
                c63451OvH.LJIIIIZZ = propertyContentList;
                ModifyPropertyBody build = c63451OvH.build();
                C63496Ow0 c63496Ow0 = new C63496Ow0();
                c63496Ow0.LIZLLL = build;
                ModifyMessagePropertyRequestBody build2 = c63496Ow0.build();
                C89453Z8v c89453Z8v = new C89453Z8v();
                c89453Z8v.LJJIJIL = build2;
                c63216OrU2.LJIIJJI(c63219OrX2.getInboxType(), c89453Z8v.build(), null, c63219OrX2);
            }
        } else {
            C63323OtD c63323OtD = new C63323OtD();
            c63323OtD.LIZJ("im_send_msg_property");
            c63323OtD.LIZ("skipped", "status");
            if (((C63219OrX) iDcS134S0200000_10.l0).isResend()) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c63323OtD.LIZ(str, "is_resend");
            c63323OtD.LJFF();
        }
        return Boolean.TRUE;
    }

    public static final Object LIZIZ$16(IDcS134S0200000_10 iDcS134S0200000_10) {
        GetMessagesResponseBody getMessagesResponseBody = ((C63622Oy2) iDcS134S0200000_10.l0).LJLJL.body.get_messages_body;
        ArrayList arrayList = new ArrayList();
        List<MessageBody> list = getMessagesResponseBody.messages;
        if (list != null && !list.isEmpty()) {
            for (MessageBody messageBody : getMessagesResponseBody.messages) {
                arrayList.add(C63081OpJ.LJIIL(messageBody.ext.get("s:client_message_id"), null, messageBody));
            }
        }
        ((C63286Osc) iDcS134S0200000_10.l1).LIZLLL(arrayList);
        return arrayList;
    }

    public static final Object LIZIZ$2(IDcS134S0200000_10 iDcS134S0200000_10) {
        Iterator it = ((List) iDcS134S0200000_10.l0).iterator();
        while (it.hasNext()) {
            C109544Rq c109544Rq = (C109544Rq) it.next();
            if (c109544Rq == null || c109544Rq.isSelf() || TextUtils.isEmpty(c109544Rq.getConversationId()) || !c109544Rq.getConversationId().equals(((C63220OrY) iDcS134S0200000_10.l1).LJLIL)) {
                it.remove();
            }
        }
        if (((List) iDcS134S0200000_10.l0).isEmpty()) {
            return null;
        }
        C63220OrY c63220OrY = (C63220OrY) iDcS134S0200000_10.l1;
        boolean LJIIIZ = c63220OrY.LJIIIZ(c63220OrY.LJLIL);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateReadIndexOnGetOtherMsg before update readIndex mReadStatusMap=");
        LIZ.append(GsonProtectorUtils.toJson(C63682Oz0.LIZ, ((C63220OrY) iDcS134S0200000_10.l1).LJLLJ));
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        for (C109544Rq c109544Rq2 : (List) iDcS134S0200000_10.l0) {
            long index = c109544Rq2.getIndex();
            long orderIndex = c109544Rq2.getOrderIndex();
            long sender = c109544Rq2.getSender();
            C63148OqO c63148OqO = ((C63220OrY) iDcS134S0200000_10.l1).LJLLJ.get(Long.valueOf(sender));
            if (c63148OqO != null) {
                long j = c63148OqO.LJLJJL;
                if (j > -1) {
                    if (orderIndex > j) {
                        c63148OqO.LIZJ(index);
                        c63148OqO.LIZLLL(orderIndex);
                        ((C63220OrY) iDcS134S0200000_10.l1).LJLLJ.put(Long.valueOf(sender), c63148OqO);
                        LJIIIZ = true;
                    }
                } else if (index >= c63148OqO.LJLJJI) {
                    c63148OqO.LIZJ(index);
                    c63148OqO.LIZLLL(orderIndex);
                    ((C63220OrY) iDcS134S0200000_10.l1).LJLLJ.put(Long.valueOf(sender), c63148OqO);
                    LJIIIZ = true;
                }
            }
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("updateReadIndexOnGetOtherMsg after update readIndex mReadStatusMap=");
        LIZ2.append(GsonProtectorUtils.toJson(C63682Oz0.LIZ, ((C63220OrY) iDcS134S0200000_10.l1).LJLLJ));
        C63322OtC.LJFF(X1D.LIZIZ(LIZ2));
        return new Pair(Boolean.valueOf(LJIIIZ), ((C63220OrY) iDcS134S0200000_10.l1).LJLLJ);
    }

    public static final Object LIZIZ$3(IDcS134S0200000_10 iDcS134S0200000_10) {
        C63147OqN.LIZIZ(((C63220OrY) ((IDbS399S0100000_10) iDcS134S0200000_10.l1).l0).LJLIL, (Map) ((Pair) iDcS134S0200000_10.l0).second);
        return Boolean.TRUE;
    }

    public static final Object LIZIZ$4(IDcS134S0200000_10 iDcS134S0200000_10) {
        C115944go LIZJ = C115944go.LIZJ();
        String str = ((C63220OrY) iDcS134S0200000_10.l1).LJLIL;
        C63220OrY.LJI((List) iDcS134S0200000_10.l0);
        LIZJ.getClass();
        C115944go.LIZIZ(str);
        long LJIIJJI = C63150OqQ.LJIIJJI(((C63220OrY) iDcS134S0200000_10.l1).LJLIL);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MessageModel requestHistoryMessage onRun, cid:");
        b0.LJ(LIZ, ((C63220OrY) iDcS134S0200000_10.l1).LJLIL, ", loadOlderMinIndex:", Long.MIN_VALUE);
        LIZ.append(", minIndex:");
        LIZ.append(LJIIJJI);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        return Boolean.TRUE;
    }

    public static final Object LIZIZ$5(IDcS134S0200000_10 iDcS134S0200000_10) {
        long j;
        long j2;
        C63229Orh c63229Orh = (C63229Orh) iDcS134S0200000_10.l1;
        C63220OrY c63220OrY = c63229Orh.LIZLLL;
        String str = c63229Orh.LIZ;
        List<ParticipantMinIndex> list = (List) iDcS134S0200000_10.l0;
        c63220OrY.getClass();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        boolean LJIIIZ = c63220OrY.LJIIIZ(str);
        Map<Long, C63148OqO> map = c63220OrY.LJLLJ;
        if (map != null && !map.isEmpty() && list != null) {
            for (ParticipantMinIndex participantMinIndex : list) {
                if (participantMinIndex != null) {
                    Long l = participantMinIndex.user_id;
                    if (l != null) {
                        j = l.longValue();
                    } else {
                        j = 0;
                    }
                    Long l2 = participantMinIndex.index;
                    if (l2 != null) {
                        j2 = l2.longValue();
                    } else {
                        j2 = Long.MIN_VALUE;
                    }
                    C63148OqO c63148OqO = c63220OrY.LJLLJ.get(Long.valueOf(j));
                    if (c63148OqO != null && j2 > c63148OqO.LJLJI) {
                        c63148OqO.LIZIZ(j2);
                        LJIIIZ = true;
                    }
                }
            }
        }
        return new Pair(Boolean.valueOf(LJIIIZ), c63220OrY.LJLLJ);
    }

    public static final Object LIZIZ$6(IDcS134S0200000_10 iDcS134S0200000_10) {
        boolean z;
        C115944go LIZJ = C115944go.LIZJ();
        String str = ((C63220OrY) iDcS134S0200000_10.l1).LJLIL;
        C63220OrY.LJFF((List) iDcS134S0200000_10.l0);
        LIZJ.getClass();
        C115944go.LIZ(str);
        long LJIIIZ = C63150OqQ.LJIIIZ(((C63220OrY) iDcS134S0200000_10.l1).LJLIL);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MessageModel requestNewerMessage onRun, cid:");
        b0.LJ(LIZ, ((C63220OrY) iDcS134S0200000_10.l1).LJLIL, ", loadNewerMaxIndex:", Long.MAX_VALUE);
        LIZ.append(", maxIndex:");
        LIZ.append(LJIIIZ);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        if (LJIIIZ <= Long.MAX_VALUE) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object LIZIZ$7(IDcS134S0200000_10 iDcS134S0200000_10) {
        return Boolean.valueOf(C63147OqN.LIZIZ(((C63229Orh) ((IDbS399S0100000_10) iDcS134S0200000_10.l1).l0).LIZ, (Map) iDcS134S0200000_10.l0));
    }

    public static final Object LIZIZ$8(IDcS134S0200000_10 iDcS134S0200000_10) {
        C63322OtC.LJFF("MessageModel loadNewerMessageList onRun");
        C63220OrY c63220OrY = (C63220OrY) iDcS134S0200000_10.l1;
        return c63220OrY.LJIIJ(c63220OrY.LJLJI + 5, (List) iDcS134S0200000_10.l0);
    }

    public static final Object LIZIZ$9(IDcS134S0200000_10 iDcS134S0200000_10) {
        C109544Rq c109544Rq = (C109544Rq) iDcS134S0200000_10.l0;
        if (c109544Rq == null || !c109544Rq.isSelf() || ((C109544Rq) iDcS134S0200000_10.l0).isDeleted() || !C63162Oqc.LIZJ((C109544Rq) iDcS134S0200000_10.l0) || TextUtils.isEmpty(((C109544Rq) iDcS134S0200000_10.l0).getConversationId()) || !((C109544Rq) iDcS134S0200000_10.l0).getConversationId().equals(((C63220OrY) iDcS134S0200000_10.l1).LJLIL)) {
            return null;
        }
        Map<Long, C63148OqO> map = ((C63220OrY) iDcS134S0200000_10.l1).LJLLJ;
        if (map == null || map.isEmpty()) {
            ((C63220OrY) iDcS134S0200000_10.l1).LJLLJ = C63147OqN.LIZJ(((C109544Rq) iDcS134S0200000_10.l0).getConversationId(), ((C63220OrY) iDcS134S0200000_10.l1).LJLLJ);
        }
        return ((C63220OrY) iDcS134S0200000_10.l1).LJLLJ;
    }

    public IDcS134S0200000_10(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l0 = obj2;
    }
}
