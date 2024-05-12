package X;

import com.ss.android.ugc.aweme.bnpl.network.model.BNPLEntryData;
import kotlin.jvm.internal.o;

/* renamed from: X.a8B, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92279a8B implements C33Q {
    public final BNPLEntryData LJLIL;
    public final boolean LJLILLLLZI;
    public final boolean LJLJI;
    public final String LJLJJI;

    public C92279a8B() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C92279a8B)) {
            return false;
        }
        C92279a8B c92279a8B = (C92279a8B) obj;
        return o.LJ(this.LJLIL, c92279a8B.LJLIL) && this.LJLILLLLZI == c92279a8B.LJLILLLLZI && this.LJLJI == c92279a8B.LJLJI && o.LJ(this.LJLJJI, c92279a8B.LJLJJI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        BNPLEntryData bNPLEntryData = this.LJLIL;
        int hashCode = (bNPLEntryData == null ? 0 : bNPLEntryData.hashCode()) * 31;
        boolean z = this.LJLILLLLZI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (((hashCode + i) * 31) + (this.LJLJI ? 1 : 0)) * 31;
        String str = this.LJLJJI;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BNPLEntryState(entryData=");
        LIZ.append(this.LJLIL);
        LIZ.append(", isLoading=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", isErrorState=");
        LIZ.append(this.LJLJI);
        LIZ.append(", errorMessage=");
        LIZ.append(this.LJLJJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public /* synthetic */ C92279a8B(int i) {
        this(null, false, false, "");
    }

    public C92279a8B(BNPLEntryData bNPLEntryData, boolean z, boolean z2, String str) {
        this.LJLIL = bNPLEntryData;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
        this.LJLJJI = str;
    }
}
