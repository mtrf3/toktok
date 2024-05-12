package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3kc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92823kc implements C33Q {
    public final C792239a LJLIL;
    public final C109544Rq LJLILLLLZI;
    public final boolean LJLJI;
    public final boolean LJLJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C92823kc)) {
            return false;
        }
        C92823kc c92823kc = (C92823kc) obj;
        return o.LJ(this.LJLIL, c92823kc.LJLIL) && o.LJ(this.LJLILLLLZI, c92823kc.LJLILLLLZI) && this.LJLJI == c92823kc.LJLJI && this.LJLJJI == c92823kc.LJLJJI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        C792239a c792239a = this.LJLIL;
        int hashCode = (c792239a == null ? 0 : c792239a.hashCode()) * 31;
        C109544Rq c109544Rq = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (c109544Rq != null ? c109544Rq.hashCode() : 0)) * 31;
        boolean z = this.LJLJI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode2 + i) * 31) + (this.LJLJJI ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MessageDraftVMState(draft=");
        LIZ.append(this.LJLIL);
        LIZ.append(", replyDraft=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", restoredDraft=");
        LIZ.append(this.LJLJI);
        LIZ.append(", draftHasMentionKey=");
        return C48339Iy7.LIZJ(LIZ, this.LJLJJI, ')', LIZ);
    }

    public C92823kc(C792239a c792239a, C109544Rq c109544Rq, boolean z, boolean z2) {
        this.LJLIL = c792239a;
        this.LJLILLLLZI = c109544Rq;
        this.LJLJI = z;
        this.LJLJJI = z2;
    }
}
