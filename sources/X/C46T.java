package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.suggestedreply.data.SuggestedReply;
import defpackage.q;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.46T, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C46T implements Serializable {
    public final C109544Rq LJLIL;
    public final List<SuggestedReply> LJLILLLLZI;
    public final String LJLJI;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C46T copy$default(C46T c46t, C109544Rq c109544Rq, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            c109544Rq = c46t.LJLIL;
        }
        if ((i & 2) != 0) {
            list = c46t.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            str = c46t.LJLJI;
        }
        return c46t.copy(c109544Rq, list, str);
    }

    public final C46T copy(C109544Rq msg, List<SuggestedReply> list, String str) {
        o.LJIIIZ(msg, "msg");
        return new C46T(msg, list, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46T)) {
            return false;
        }
        C46T c46t = (C46T) obj;
        return o.LJ(this.LJLIL, c46t.LJLIL) && o.LJ(this.LJLILLLLZI, c46t.LJLILLLLZI) && o.LJ(this.LJLJI, c46t.LJLJI);
    }

    public int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        List<SuggestedReply> list = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.LJLJI;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DisplayedSuggestedReplyCache(msg=");
        LIZ.append(this.LJLIL);
        LIZ.append(", replies=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", displayStyle=");
        return q.LIZIZ(LIZ, this.LJLJI, ')', LIZ);
    }

    public final String getDisplayStyle() {
        return this.LJLJI;
    }

    public final C109544Rq getMsg() {
        return this.LJLIL;
    }

    public final List<SuggestedReply> getReplies() {
        return this.LJLILLLLZI;
    }

    public C46T(C109544Rq msg, List<SuggestedReply> list, String str) {
        o.LJIIIZ(msg, "msg");
        this.LJLIL = msg;
        this.LJLILLLLZI = list;
        this.LJLJI = str;
    }

    public /* synthetic */ C46T(C109544Rq c109544Rq, List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c109544Rq, list, (i & 4) != 0 ? null : str);
    }
}
