package X;

import Y.ARunnableS29S0200000_10;
import android.util.Pair;
import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.GetConversationInfoV2ResponseBody;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.ResponseBody;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.OrV, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63217OrV extends AbstractC63515OwJ<C63120Opw> {
    public C63120Opw LIZJ;

    @Override // X.AbstractC63515OwJ
    public final boolean LJFF() {
        return true;
    }

    public C63217OrV() {
        super(EnumC63625Oy5.GET_CONVERSATION_INFO_V2.getValue());
    }

    public C63217OrV(InterfaceC86963bA<C63120Opw> interfaceC86963bA) {
        super(EnumC63625Oy5.GET_CONVERSATION_INFO_V2.getValue(), interfaceC86963bA);
    }

    @Override // X.AbstractC63515OwJ
    public final boolean LJIIIZ(C63622Oy2 c63622Oy2) {
        GetConversationInfoV2ResponseBody getConversationInfoV2ResponseBody;
        ResponseBody responseBody = c63622Oy2.LJLJL.body;
        if (responseBody != null && (getConversationInfoV2ResponseBody = responseBody.get_conversation_info_v2_body) != null && getConversationInfoV2ResponseBody.conversation_info != null) {
            return true;
        }
        return false;
    }

    public static C63120Opw LJIJ(int i, MessageBody messageBody) {
        if (messageBody == null) {
            return null;
        }
        return LJIJJ(messageBody.conversation_id, messageBody.conversation_short_id.longValue(), messageBody.create_time.longValue(), i, messageBody.conversation_type.intValue(), 0);
    }

    @Override // X.AbstractC63515OwJ
    public final void LJII(final C63622Oy2 c63622Oy2, final ARunnableS29S0200000_10 aRunnableS29S0200000_10) {
        final String str = (String) c63622Oy2.LJLJJL[0];
        final int intValue = c63622Oy2.LJLJJLL.inbox_type.intValue();
        ((CopyOnWriteArraySet) C63269OsL.LIZIZ).remove(str);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Get Conversation Info finish: ");
        LIZ.append(str);
        C63322OtC.LJII(X1D.LIZIZ(LIZ));
        if (c63622Oy2.LJIIJ() && LJIIIZ(c63622Oy2)) {
            long longValue = ((Long) c63622Oy2.LJLJJL[3]).longValue();
            ConversationInfoV2 conversationInfoV2 = c63622Oy2.LJLJL.body.get_conversation_info_v2_body.conversation_info;
            RunnableC63345OtZ.LJ(new C63236Oro(conversationInfoV2, intValue, longValue), new C63260OsC(this, conversationInfoV2, intValue, str, c63622Oy2, aRunnableS29S0200000_10), false);
            return;
        }
        C115284fk LJIILIIL = C115284fk.LJIILIIL();
        Integer num = c63622Oy2.LJLJL.status_code;
        LJIILIIL.getClass();
        if (C115284fk.LIZJ(num)) {
            C115284fk LJIILIIL2 = C115284fk.LJIILIIL();
            int LJFF = c63622Oy2.LJFF();
            InterfaceC86963bA<C63120Opw> interfaceC86963bA = new InterfaceC86963bA<C63120Opw>() { // from class: X.4ny
                @Override // X.InterfaceC86963bA
                public final void LIZIZ(C63623Oy3 c63623Oy3) {
                    C63217OrV.this.LJIILLIIL(c63622Oy2, str, aRunnableS29S0200000_10);
                }

                @Override // X.InterfaceC86963bA
                public final void onSuccess(C63120Opw c63120Opw) {
                    C63217OrV.this.LIZLLL(c63120Opw);
                    C63269OsL.LJIIJJI(intValue, str);
                    C115064fO LJII = C63337OtR.LJII(c63622Oy2, true);
                    LJII.LIZJ.put("conversation_id", str);
                    LJII.LIZ();
                }
            };
            LJIILIIL2.getClass();
            C115284fk.LJIL(LJFF, interfaceC86963bA, str);
            return;
        }
        LJIILLIIL(c63622Oy2, str, aRunnableS29S0200000_10);
    }

    public static Pair<C63120Opw, Boolean> LJIIZILJ(int i, long j, ConversationInfoV2 conversationInfoV2) {
        int intValue;
        boolean z;
        boolean LJIJJLI;
        Boolean bool;
        try {
            C78847Ux1.LJJLIIIJJI("saveSingleConversation");
            C63120Opw LJIIIZ = C63133Oq9.LJIIIZ(conversationInfoV2.conversation_id, true);
            if (LJIIIZ != null && !LJIIIZ.isMember() && (bool = conversationInfoV2.is_participant) != null && !bool.booleanValue()) {
                C78847Ux1.LJIJJLI("saveSingleConversation", true);
            } else {
                C63124Oq0.LIZLLL(conversationInfoV2.conversation_id);
                String str = conversationInfoV2.conversation_id;
                Integer num = conversationInfoV2.conversation_type;
                if (num == null) {
                    intValue = -1;
                } else {
                    intValue = num.intValue();
                }
                C63124Oq0.LJII(intValue, str, C63081OpJ.LJIILL(conversationInfoV2.conversation_id, conversationInfoV2.first_page_participants.participants));
                C63120Opw LJIIIIZZ = C63081OpJ.LJIIIIZZ(i, LJIIIZ, conversationInfoV2, j, null, null, true);
                if (LJIIIZ == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (C63133Oq9.LJIIZILJ(LJIIIIZZ)) {
                        LJIJJLI = true;
                    } else {
                        LJIJJLI = false;
                    }
                } else {
                    LJIJJLI = C63133Oq9.LJIJJLI(LJIIIIZZ, true);
                }
                if (LJIIIIZZ.isStranger() && C63308Osy.LJI().LIZLLL().LJLJJL) {
                    C63139OqF.LIZ(C63139OqF.LIZ);
                }
                C78847Ux1.LJIJJLI("saveSingleConversation", true);
                if (LJIJJLI) {
                    return new Pair<>(LJIIIIZZ, Boolean.valueOf(z));
                }
            }
        } catch (Exception e) {
            C63322OtC.LJ("GetConversationInfoHandler saveSingleConversation", e);
            C78847Ux1.LJIJJLI("saveSingleConversation", false);
        }
        return null;
    }

    public final void LJIILJJIL(int i, int i2, C109544Rq c109544Rq) {
        LJIILL(i, c109544Rq.getConversationType(), c109544Rq.getConversationId(), c109544Rq.getConversationShortId(), c109544Rq.getCreatedAt(), false, i2);
    }

    public final void LJIILLIIL(C63622Oy2 c63622Oy2, String str, Runnable runnable) {
        LIZIZ(c63622Oy2);
        runnable.run();
        C115064fO LJII = C63337OtR.LJII(c63622Oy2, false);
        LJII.LIZJ.put("conversation_id", str);
        LJII.LIZ();
        if (c63622Oy2.LJLL <= -1000 && this.LIZJ != null) {
            C115284fk.LJIILIIL().LJIJI(6, this.LIZJ);
        }
    }

    public static C63120Opw LJIJJ(String str, long j, long j2, int i, int i2, int i3) {
        return LJIJI(i, str, j, i2, j2, i3, null);
    }

    public final synchronized void LJIILIIL(int i, int i2, long j, long j2, String str, boolean z) {
        LJIILL(i, i2, str, j, j2, z, 0);
    }

    public static C63120Opw LJIJI(int i, String str, long j, int i2, long j2, int i3, C109544Rq c109544Rq) {
        C63120Opw c63120Opw = null;
        try {
            if (C63133Oq9.LJIILL(str)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("syncBuildLocalConversation: convId=");
                LIZ.append(str);
                LIZ.append(", already has local");
                C63322OtC.LJFF(X1D.LIZIZ(LIZ));
                return null;
            }
            if (C63133Oq9.LJIILLIIL(j)) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("syncBuildLocalConversation: convShortId=");
                LIZ2.append(j);
                LIZ2.append(", already has local");
                C63322OtC.LJFF(X1D.LIZIZ(LIZ2));
                return null;
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("syncBuildLocalConversation: convId=");
            LIZ3.append(str);
            LIZ3.append(", shortId=");
            LIZ3.append(j);
            LIZ3.append(", type=");
            LIZ3.append(i2);
            LIZ3.append(", time=");
            LIZ3.append(j2);
            C63322OtC.LJFF(X1D.LIZIZ(LIZ3));
            C63120Opw c63120Opw2 = new C63120Opw();
            try {
                c63120Opw2.setInboxType(i);
                c63120Opw2.setConversationId(str);
                c63120Opw2.setConversationShortId(j);
                c63120Opw2.setConversationType(i2);
                c63120Opw2.setUpdatedTime(j2);
                if (c63120Opw2.isSingleChat()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(C63308Osy.LJI().LIZIZ().getUid()));
                    arrayList.add(Long.valueOf(C120014nN.LIZLLL(str)));
                    c63120Opw2.setMemberIds(arrayList);
                    c63120Opw2.setMemberCount(2);
                }
                c63120Opw2.setIsMember(true);
                if (c109544Rq != null && C63162Oqc.LJ(c109544Rq)) {
                    c63120Opw2.setLastMessageIndex(c109544Rq.getIndex());
                    c63120Opw2.setLastShowMessage(c109544Rq);
                    c63120Opw2.setMaxIndexV2(c109544Rq.getIndexInConversationV2());
                } else {
                    c63120Opw2.setLastMessageIndex(C63150OqQ.LJIIIZ(str));
                    c63120Opw2.setLastShowMessage(C63150OqQ.LJIIJ(str));
                    c63120Opw2.setMaxIndexV2(C63150OqQ.LJIIL(str));
                }
                c63120Opw2.setBadgeCount(i3);
                C63119Opv.LIZLLL(c63120Opw2, c109544Rq, false);
                HashMap hashMap = new HashMap();
                hashMap.put("s:conv_wait_info", "1");
                c63120Opw2.setLocalExt(hashMap);
                if (!C63133Oq9.LJIIZILJ(c63120Opw2)) {
                    return null;
                }
                if (c63120Opw2.isStranger() && C63308Osy.LJI().LIZLLL().LJLJJL) {
                    C63139OqF.LIZ(C63139OqF.LIZ);
                }
                return c63120Opw2;
            } catch (Exception e) {
                e = e;
                c63120Opw = c63120Opw2;
                C63322OtC.LJ("GetConversationInfoHandler syncBuildLocalConversation", e);
                return c63120Opw;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public final synchronized void LJIILL(int i, int i2, String str, long j, long j2, boolean z, int i3) {
        if (!z) {
            if (((CopyOnWriteArraySet) C63269OsL.LIZIZ).contains(str)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("hasGettingConversation: ");
                LIZ.append(str);
                C63322OtC.LJII(X1D.LIZIZ(LIZ));
                return;
            }
        }
        C63346Ota.LIZIZ().execute(new RunnableC63277OsT(this, i, str, j, i2, j2, i3));
    }
}
