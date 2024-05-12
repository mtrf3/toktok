package X;

import java.util.List;
import java.util.UUID;

/* renamed from: X.4Rl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C109494Rl {
    public final C109544Rq msg = newMessage();

    public C109544Rq build() {
        this.msg.uuid = UUID.randomUUID().toString();
        this.msg.sender = C54840Lfg.LJJ().LJJLIL();
        long LJJII = C54840Lfg.LJJ().LJJII();
        if (LJJII < 0) {
            this.msg.createdAt = System.currentTimeMillis();
        } else {
            this.msg.createdAt = LJJII;
        }
        C109544Rq c109544Rq = this.msg;
        c109544Rq.msgStatus = 0;
        c109544Rq.secSender = C54840Lfg.LJJ().LJJLIIIJLJLI();
        return this.msg;
    }

    public C109544Rq newMessage() {
        return new C109544Rq();
    }

    public C109494Rl attachment(List<C117824jq> list) {
        this.msg.attachments = list;
        return this;
    }

    public C109494Rl content(String str) {
        this.msg.content = str;
        return this;
    }

    public C109494Rl contentPB(C64537PUn c64537PUn) {
        this.msg.contentPB = c64537PUn;
        return this;
    }

    public C109494Rl conversation(C63120Opw c63120Opw) {
        this.msg.conversationId = c63120Opw.getConversationId();
        this.msg.conversationShortId = c63120Opw.getConversationShortId();
        this.msg.conversationType = c63120Opw.getConversationType();
        C109544Rq c109544Rq = this.msg;
        InterfaceC109534Rp interfaceC109534Rp = C109504Rm.LIZ;
        if (interfaceC109534Rp == null) {
            interfaceC109534Rp = (C109514Rn) C109504Rm.LIZIZ.getValue();
        }
        c109544Rq.orderIndex = interfaceC109534Rp.LIZIZ(c63120Opw);
        C109544Rq c109544Rq2 = this.msg;
        InterfaceC109534Rp interfaceC109534Rp2 = C109504Rm.LIZ;
        if (interfaceC109534Rp2 == null) {
            interfaceC109534Rp2 = (C109514Rn) C109504Rm.LIZIZ.getValue();
        }
        c109544Rq2.index = interfaceC109534Rp2.LIZ(c63120Opw);
        C109544Rq c109544Rq3 = this.msg;
        c109544Rq3.indexInConversationV2 = -1L;
        c109544Rq3.addLocalExt("s:message_index_is_local", "1");
        return this;
    }

    public C109494Rl localExt(java.util.Map<String, String> map) {
        if (C54840Lfg.LJJ().LJIJJLI()) {
            this.msg.localExt.clear();
            this.msg.localExt.putAll(map);
        } else {
            this.msg.localExt = map;
        }
        return this;
    }

    public C109494Rl msgType(int i) {
        this.msg.msgType = i;
        return this;
    }

    public C109494Rl orderIndex(long j) {
        this.msg.orderIndex = j;
        return this;
    }

    public C109494Rl scene(String str) {
        this.msg.scene = str;
        return this;
    }

    public C109494Rl sender(long j) {
        this.msg.sender = j;
        return this;
    }
}
