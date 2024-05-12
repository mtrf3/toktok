package X;

import Y.ARunnableS29S0200000_10;
import Y.ARunnableS7S0310000_10;
import Y.IDbS169S0200000_10;
import Y.IDcS407S0100000_10;
import android.text.TextUtils;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.MessagesInConversationRequestBody;
import com.bytedance.im.core.proto.MessagesInConversationResponseBody;
import com.bytedance.im.core.proto.ResponseBody;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* renamed from: X.OsP, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63273OsP extends AbstractC63515OwJ<MessageBody> {
    public String LIZJ;
    public long LIZLLL;
    public int LJ;
    public int LJFF;
    public final int LJI;
    public int LJII;
    public final int LJIIIIZZ;
    public final long LJIIIZ;
    public final long LJIIJ;
    public final long LJIIJJI;
    public final boolean LJIIL;
    public final boolean LJIILIIL;
    public final boolean LJIILJJIL;
    public int LJIILL;
    public List<Long> LJIILLIIL;
    public boolean LJIIZILJ;
    public final int LJIJ;

    @Override // X.AbstractC63515OwJ
    public final boolean LJFF() {
        return true;
    }

    @Override // X.AbstractC63515OwJ
    public final boolean LJIIIZ(C63622Oy2 c63622Oy2) {
        ResponseBody responseBody = c63622Oy2.LJLJL.body;
        if (responseBody != null && responseBody.messages_in_conversation_body != null) {
            return true;
        }
        return false;
    }

    public C63273OsP(int i, C63270OsM c63270OsM) {
        this(false, 0, 0, 0L, 0L, 0L, false, false, c63270OsM);
    }

    @Override // X.AbstractC63515OwJ
    public final void LJII(C63622Oy2 c63622Oy2, ARunnableS29S0200000_10 aRunnableS29S0200000_10) {
        if (c63622Oy2.LJIIJ() && LJIIIZ(c63622Oy2)) {
            MessagesInConversationResponseBody messagesInConversationResponseBody = c63622Oy2.LJLJL.body.messages_in_conversation_body;
            List LJIIZILJ = C73994T2g.LJIIZILJ(messagesInConversationResponseBody, 7, c63622Oy2.LJIIIIZZ(), "PullConversationMsgHandler");
            if (LJIIZILJ.isEmpty()) {
                LIZLLL(null);
                return;
            }
            int i = this.LJII;
            boolean z = true;
            if (i == 0) {
                this.LJIIZILJ = true;
            }
            int size = LJIIZILJ.size() + i;
            this.LJII = size;
            if (size < this.LJI && messagesInConversationResponseBody.has_more.booleanValue()) {
                int i2 = this.LJFF;
                String str = this.LIZJ;
                LJIILIIL(this.LIZLLL, ((MessageBody) ListProtector.get(LJIIZILJ, 0)).index_in_conversation.longValue(), i2, this.LJ, str);
                z = false;
            }
            RunnableC63345OtZ.LJ(new IDcS407S0100000_10(new ARunnableS7S0310000_10(LJIIZILJ, c63622Oy2, z, this, 1), 7), new IDbS169S0200000_10(this, LJIIZILJ, 3), false);
            return;
        }
        LIZIZ(c63622Oy2);
    }

    public final void LJIILIIL(long j, long j2, int i, int i2, String str) {
        if (TextUtils.isEmpty(str)) {
            LIZ(C63623Oy3.LIZ(C63622Oy2.LIZJ(-1015)));
            return;
        }
        if (j2 < 0) {
            j2 = 0;
        }
        this.LIZJ = str;
        this.LIZLLL = j;
        this.LJ = i2;
        this.LJFF = i;
        C63469OvZ c63469OvZ = new C63469OvZ();
        c63469OvZ.LIZLLL = this.LIZJ;
        c63469OvZ.LJFF = Long.valueOf(this.LIZLLL);
        c63469OvZ.LJ = Integer.valueOf(this.LJ);
        c63469OvZ.LJI = EnumC63513OwH.OLDER;
        c63469OvZ.LJII = Long.valueOf(j2);
        MessagesInConversationRequestBody build = c63469OvZ.build();
        C89453Z8v c89453Z8v = new C89453Z8v();
        c89453Z8v.LJIIJ = build;
        LJIIJJI(i, c89453Z8v.build(), null, new Object[0]);
    }

    public C63273OsP(boolean z, int i, int i2, long j, long j2, long j3, boolean z2, boolean z3, C63270OsM c63270OsM) {
        super(EnumC63625Oy5.GET_MESSAGES_BY_CONVERSATION.getValue(), c63270OsM);
        this.LJIIZILJ = false;
        this.LJIJ = -1;
        this.LJIIL = z;
        this.LJI = i;
        this.LJIILJJIL = z2;
        this.LJIIIIZZ = i2;
        this.LJIIIZ = j;
        this.LJIIJ = j2;
        this.LJIIJJI = j3;
        this.LJIILIIL = z3;
    }
}
