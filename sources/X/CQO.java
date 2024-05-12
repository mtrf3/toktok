package X;

import X.CR6;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import kotlin.jvm.internal.o;
import webcast.data.UserIdentity;

/* loaded from: classes6.dex */
public abstract class CQO<MESSAGE extends CR6> extends CQL {
    public final MESSAGE LJIJJLI;

    @Override // X.CRD
    public UserIdentity LIZ() {
        return null;
    }

    @Override // X.CQL, X.CRD
    public boolean LJIJI() {
        if (this.LJIJJLI.isHistoryMessage) {
            return false;
        }
        return true;
    }

    @Override // X.CQL, X.CRD
    public boolean LJJIII() {
        if (this.LJIJJLI.isHistoryMessage) {
            return false;
        }
        return super.LJJIII();
    }

    @Override // X.CQL, X.CRD
    public final long LJJJZ() {
        CommonMessageData commonMessageData = this.LJIJJLI.baseMessage;
        if (commonMessageData != null) {
            return commonMessageData.createTime;
        }
        return 0L;
    }

    @Override // X.CQL, X.CRD
    public final boolean LJJLIIIJILLIZJL() {
        return this.LJIJJLI.isHistoryMessage;
    }

    @Override // X.CQL
    public Text LJLI() {
        CommonMessageData commonMessageData = this.LJIJJLI.baseMessage;
        if (commonMessageData != null) {
            return commonMessageData.displayText;
        }
        return null;
    }

    @Override // X.CQL
    public boolean LL() {
        return this.LJIJJLI.supportDisplayText();
    }

    public final long getMessageId() {
        CommonMessageData commonMessageData = this.LJIJJLI.baseMessage;
        if (commonMessageData != null) {
            return commonMessageData.messageId;
        }
        return 0L;
    }

    @Override // X.CQL, X.InterfaceC31347CRz
    public boolean LJJZ() {
        if (LLF() == 0) {
            return LJZI();
        }
        if (LLF() == 1) {
            return true;
        }
        return false;
    }

    public final String LLD() {
        UserAttr userAttr;
        if (!LJLIIL().LJFF) {
            User LIZJ = LJLIIL().LIZJ();
            if (LIZJ != null && (userAttr = LIZJ.getUserAttr()) != null && userAttr.isAdmin) {
                return "admin";
            }
            return "viewer";
        }
        return "anchor";
    }

    public final long LLF() {
        Long l;
        if (LJLJJL()) {
            CommonMessageData commonMessageData = this.LJIJJLI.baseMessage;
            if (commonMessageData == null || (l = commonMessageData.anchorFoldType) == null) {
                return 0L;
            }
            return l.longValue();
        }
        CommonMessageData commonMessageData2 = this.LJIJJLI.baseMessage;
        if (commonMessageData2 == null) {
            return 0L;
        }
        return commonMessageData2.foldType;
    }

    public long getPriority() {
        if (LJLJJL()) {
            CommonMessageData commonMessageData = this.LJIJJLI.baseMessage;
            if (commonMessageData == null) {
                return 0L;
            }
            return commonMessageData.anchorPriorityScore;
        }
        CommonMessageData commonMessageData2 = this.LJIJJLI.baseMessage;
        if (commonMessageData2 == null) {
            return 0L;
        }
        return commonMessageData2.priorityScore;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CQO(MESSAGE message) {
        super(message.getMessageId());
        o.LJIIIZ(message, "message");
        this.LJIJJLI = message;
    }

    public void LJJ(long j) {
        if (LJLJJL()) {
            CommonMessageData commonMessageData = this.LJIJJLI.baseMessage;
            if (commonMessageData == null) {
                return;
            }
            commonMessageData.anchorPriorityScore = j;
            return;
        }
        CommonMessageData commonMessageData2 = this.LJIJJLI.baseMessage;
        if (commonMessageData2 == null) {
            return;
        }
        commonMessageData2.priorityScore = j;
    }
}
