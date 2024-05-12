package X;

import Y.ARunnableS29S0200000_10;
import Y.IDbS169S0200000_10;
import Y.IDcS134S0200000_10;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.bytedance.im.core.proto.RequestBody;
import com.bytedance.im.core.proto.Response;
import com.bytedance.im.core.proto.ResponseBody;
import com.bytedance.im.core.proto.SendMessageRequestBody;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Owe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63536Owe extends AbstractC63515OwJ<C109544Rq> {
    public final C63540Owi LIZJ;
    public int LIZLLL;
    public volatile boolean LJ;
    public volatile C63546Owo LJFF;

    public C63536Owe() {
        super(EnumC63625Oy5.SEND_MESSAGE.getValue());
        this.LIZJ = new C63540Owi();
        this.LJ = false;
    }

    public C63536Owe(InterfaceC86963bA<C109544Rq> interfaceC86963bA) {
        super(EnumC63625Oy5.SEND_MESSAGE.getValue(), interfaceC86963bA);
        this.LIZJ = new C63540Owi();
        this.LJ = false;
    }

    @Override // X.AbstractC63515OwJ
    public final void LJIIIIZZ(C63622Oy2 c63622Oy2) {
        if (!C63308Osy.LJI().LIZLLL().LJJJJLI.enableNetworkTrace) {
            return;
        }
        this.LJFF = new C63546Owo(this.LIZJ);
        C63546Owo c63546Owo = this.LJFF;
        if (!C63308Osy.LJI().LIZLLL().LJJJJLI.enableNetworkTrace) {
            return;
        }
        c63622Oy2.LLD = c63546Owo;
    }

    @Override // X.AbstractC63515OwJ
    public final boolean LJIIIZ(C63622Oy2 c63622Oy2) {
        ResponseBody responseBody = c63622Oy2.LJLJL.body;
        if (responseBody != null && responseBody.send_message_body != null) {
            return true;
        }
        return false;
    }

    public final void LJIILLIIL(C109544Rq c109544Rq) {
        if (c109544Rq == null) {
            LIZIZ(C63622Oy2.LIZJ(-1015));
            return;
        }
        c109544Rq.setMsgStatus(1);
        this.LIZJ.LIZ = SystemClock.uptimeMillis();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SendMsgHandler save with opt:");
        C47922IrO.LIZ();
        LIZ.append(false);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        C47922IrO.LIZ();
        IDcS134S0200000_10 iDcS134S0200000_10 = new IDcS134S0200000_10(this, c109544Rq, 14);
        IDbS169S0200000_10 iDbS169S0200000_10 = new IDbS169S0200000_10(this, c109544Rq, 4);
        if (C63346Ota.LIZ == null) {
            synchronized (C63346Ota.LJ) {
                if (C63346Ota.LIZ == null) {
                    C63346Ota.LIZ = C16880lQ.LLLLZLLLI(C63346Ota.LJIIIIZZ);
                }
            }
        }
        RunnableC63345OtZ.LIZLLL(iDcS134S0200000_10, iDbS169S0200000_10, C63346Ota.LIZ);
    }

    @Override // X.AbstractC63515OwJ
    public final void LJII(C63622Oy2 c63622Oy2, ARunnableS29S0200000_10 aRunnableS29S0200000_10) {
        boolean z;
        if (c63622Oy2.LJIIJ() && LJIIIZ(c63622Oy2)) {
            z = true;
        } else {
            z = false;
        }
        C109544Rq c109544Rq = (C109544Rq) c63622Oy2.LJLJJL[0];
        if (!this.LJ) {
            C115284fk LJIILIIL = C115284fk.LJIILIIL();
            Integer num = c63622Oy2.LJLJL.status_code;
            LJIILIIL.getClass();
            if (C115284fk.LIZJ(num)) {
                C115284fk LJIILIIL2 = C115284fk.LJIILIIL();
                String conversationId = c109544Rq.getConversationId();
                int LJFF = c63622Oy2.LJFF();
                C63445OvB c63445OvB = new C63445OvB(this, c63622Oy2, c109544Rq, z);
                LJIILIIL2.getClass();
                C115284fk.LJIL(LJFF, c63445OvB, conversationId);
                return;
            }
        }
        LJIILL(c63622Oy2, c109544Rq, z);
    }

    public final void LJIILJJIL(C109544Rq c109544Rq, boolean z) {
        long uptimeMillis = SystemClock.uptimeMillis();
        C63540Owi c63540Owi = this.LIZJ;
        c63540Owi.LIZLLL = uptimeMillis - c63540Owi.LIZJ;
        C63540Owi c63540Owi2 = this.LIZJ;
        c63540Owi2.LJ = uptimeMillis - c63540Owi2.LIZ;
        int i = -3001;
        if (z) {
            C63322OtC.LJFF("SendMsgHandler afterSaveMsg saveSuccess");
            C63120Opw LJIIIZ = C115284fk.LJIILIIL().LJIIIZ(c109544Rq.getConversationId());
            if (LJIIIZ != null) {
                C109544Rq lastShowMessage = LJIIIZ.getLastShowMessage();
                if (lastShowMessage != null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("SendMsgHandler afterSaveMsg lastMsg.getIndex() = ");
                    LIZ.append(lastShowMessage.getIndex());
                    LIZ.append(",lastMsg.getOrderIndex() = ");
                    LIZ.append(lastShowMessage.getOrderIndex());
                    C63322OtC.LJFF(X1D.LIZIZ(LIZ));
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("SendMsgHandler afterSaveMsg msg.getIndex() = ");
                LIZ2.append(c109544Rq.getIndex());
                LIZ2.append(",msg.getOrderIndex() = ");
                LIZ2.append(c109544Rq.getOrderIndex());
                LIZ2.append(",msg.getIndex() = ");
                C63322OtC.LJFF(X1D.LIZIZ(LIZ2));
                if (lastShowMessage == null || lastShowMessage.getIndex() < c109544Rq.getIndex()) {
                    LJIIIZ.setLastShowMessage(c109544Rq);
                    LJIIIZ.setLastMessageIndex(c109544Rq.getIndex());
                    if (C63308Osy.LJI().LIZLLL().LJJZ) {
                        SFS.LJJIJIIJI(LJIIIZ, c109544Rq.getCreatedAt(), c109544Rq);
                    }
                    LJIIIZ.setUpdatedTime(c109544Rq.getCreatedAt());
                    C115284fk.LJIILIIL().LJIJI(2, LJIIIZ);
                    this.LIZJ.LJFF = SystemClock.uptimeMillis() - uptimeMillis;
                }
                this.LIZJ.LJIIIIZZ = SystemClock.uptimeMillis();
                C63540Owi c63540Owi3 = this.LIZJ;
                C63308Osy.LJI().getClass();
                c63540Owi3.LJIIIZ = C63308Osy.LJ();
                C63540Owi c63540Owi4 = this.LIZJ;
                c63540Owi4.LJII = c63540Owi4.LJIIIIZZ - this.LIZJ.LIZ;
                C63308Osy.LJI().LIZLLL().getClass();
                C63542Owk c63542Owk = new C63542Owk();
                List<Long> mentionIds = c109544Rq.getMentionIds();
                if (mentionIds != null) {
                    C63685Oz3.LIZ(mentionIds);
                    c63542Owk.LJIIJJI = mentionIds;
                }
                ReferenceInfo referenceInfo = c109544Rq.getReferenceInfo();
                if (referenceInfo != null && referenceInfo.referenced_message_id.longValue() > 0) {
                    C63547Owp c63547Owp = new C63547Owp();
                    c63547Owp.LIZLLL = referenceInfo.referenced_message_id;
                    c63547Owp.LJ = referenceInfo.hint;
                    c63547Owp.LJFF = referenceInfo.root_message_id;
                    c63547Owp.LJI = referenceInfo.root_message_conv_index;
                    c63542Owk.LJIILIIL = c63547Owp.build();
                }
                c63542Owk.LIZLLL = c109544Rq.getConversationId();
                c63542Owk.LJFF = Long.valueOf(LJIIIZ.getConversationShortId());
                c63542Owk.LJ = Integer.valueOf(LJIIIZ.getConversationType());
                c63542Owk.LJI = c109544Rq.getContent();
                c63542Owk.LJIILL = c109544Rq.getContentPB();
                c63542Owk.LJIILLIIL = c109544Rq.getScene();
                java.util.Map<String, String> ext = c109544Rq.getExt();
                C63685Oz3.LIZIZ(ext);
                c63542Owk.LJII = ext;
                c63542Owk.LJIIIIZZ = Integer.valueOf(c109544Rq.getMsgType());
                c63542Owk.LJIIJ = c109544Rq.getUuid();
                SendMessageRequestBody build = c63542Owk.build();
                C89453Z8v c89453Z8v = new C89453Z8v();
                c89453Z8v.LIZLLL = build;
                RequestBody build2 = c89453Z8v.build();
                this.LIZLLL = LJIIIZ.getInboxType();
                C47922IrO.LIZ();
                if (this.LJ) {
                    LJIIL(this.LIZLLL, build2, null, C03660Ck.LIZJ("retry", "refresh_conv"), c109544Rq, Boolean.TRUE);
                } else {
                    LJIIJJI(this.LIZLLL, build2, null, c109544Rq, Boolean.TRUE);
                }
            } else {
                LIZIZ(C63622Oy2.LIZJ(-1017));
            }
        } else {
            c109544Rq.setMsgStatus(3);
            this.LIZJ.LJJIJIIJI = -3001;
            LIZIZ(C63622Oy2.LIZJ(-3001));
        }
        this.LIZJ.LJI = SystemClock.uptimeMillis();
        C63309Osz LIZLLL = C63309Osz.LIZLLL();
        if (z) {
            i = AbstractC63551Owt.LIZ;
        }
        LIZLLL.LJIIIZ(i, c109544Rq, this.LIZJ);
    }

    public static void LJIILIIL(C109544Rq c109544Rq, String str, Object obj) {
        if (obj != null) {
            c109544Rq.addLocalExt(str, String.valueOf(obj));
        } else {
            c109544Rq.clearLocalExt(str);
        }
    }

    public final void LJIILL(C63622Oy2 c63622Oy2, C109544Rq c109544Rq, boolean z) {
        long j;
        long j2;
        Response response = c63622Oy2.LJLJL;
        this.LIZJ.LJIIJ = SystemClock.uptimeMillis();
        C63540Owi c63540Owi = this.LIZJ;
        C63308Osy.LJI().getClass();
        c63540Owi.LJIIJJI = C63308Osy.LJ();
        C63540Owi c63540Owi2 = this.LIZJ;
        c63540Owi2.LJIIL = c63540Owi2.LJIIJ - this.LIZJ.LJIIIIZZ;
        C63540Owi c63540Owi3 = this.LIZJ;
        c63540Owi3.LJJIJIIJIL = c63622Oy2.LJLJI;
        if (response != null) {
            c63540Owi3.LJJIJIL = response.log_id;
            Long l = response.request_arrived_time;
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            c63540Owi3.LJIILIIL = j;
            C63540Owi c63540Owi4 = this.LIZJ;
            Long l2 = response.server_execution_end_time;
            if (l2 != null) {
                j2 = l2.longValue();
            } else {
                j2 = 0;
            }
            c63540Owi4.LJIILJJIL = j2;
        } else {
            c63540Owi3.LJIILIIL = 0L;
            this.LIZJ.LJIILJJIL = 0L;
        }
        C63540Owi c63540Owi5 = this.LIZJ;
        c63540Owi5.LJIILL = (c63540Owi5.LJIIL - (this.LIZJ.LJIILJJIL - this.LIZJ.LJIILIIL)) / 2;
        if (this.LIZJ.LJIILIIL > 0) {
            C63540Owi c63540Owi6 = this.LIZJ;
            c63540Owi6.LJIILLIIL = c63540Owi6.LJIILIIL - this.LIZJ.LJIIIZ;
        }
        if (this.LIZJ.LJIILJJIL > 0) {
            C63540Owi c63540Owi7 = this.LIZJ;
            c63540Owi7.LJIIZILJ = c63540Owi7.LJIIJJI - this.LIZJ.LJIILJJIL;
        }
        String uuid = c109544Rq.getUuid();
        if (!TextUtils.isEmpty(uuid)) {
            ((ConcurrentHashMap) C63269OsL.LJIIL).remove(uuid);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SendMsgHandler handleResponse, seqId:");
        V1I.LIZJ(LIZ, c63622Oy2.LJLIL, ", isSuccess:", z);
        LIZ.append(", msg_uuid:");
        LIZ.append(c109544Rq.getUuid());
        LIZ.append(", push_msg:");
        LIZ.append("");
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        RunnableC63345OtZ.LIZLLL(new C63539Owh(this, c63622Oy2, c109544Rq, z), new C63538Owg(this, c63622Oy2, c109544Rq, z), C63346Ota.LIZJ());
    }
}
