package X;

import java.io.Serializable;
import kotlin.jvm.internal.o;

/* renamed from: X.3wH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C100053wH extends F9E implements Serializable {
    public final long LJLIL;
    public final int LJLILLLLZI;
    public final String LJLJI;
    public final long LJLJJI;

    public static /* synthetic */ C100053wH copy$default(C100053wH c100053wH, long j, int i, String str, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = c100053wH.LJLIL;
        }
        if ((i2 & 2) != 0) {
            i = c100053wH.LJLILLLLZI;
        }
        if ((i2 & 4) != 0) {
            str = c100053wH.LJLJI;
        }
        if ((i2 & 8) != 0) {
            j2 = c100053wH.LJLJJI;
        }
        return c100053wH.copy(j, i, str, j2);
    }

    public final C100053wH copy(long j, int i, String refMessageJsonContent, long j2) {
        o.LJIIIZ(refMessageJsonContent, "refMessageJsonContent");
        return new C100053wH(j, i, refMessageJsonContent, j2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Long.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI), this.LJLJI, Long.valueOf(this.LJLJJI)};
    }

    public final long getRefMessageId() {
        return this.LJLIL;
    }

    public final String getRefMessageJsonContent() {
        return this.LJLJI;
    }

    public final int getRefMessageType() {
        return this.LJLILLLLZI;
    }

    public final long getRefSenderUid() {
        return this.LJLJJI;
    }

    public C100053wH(long j, int i, String refMessageJsonContent, long j2) {
        o.LJIIIZ(refMessageJsonContent, "refMessageJsonContent");
        this.LJLIL = j;
        this.LJLILLLLZI = i;
        this.LJLJI = refMessageJsonContent;
        this.LJLJJI = j2;
    }
}
