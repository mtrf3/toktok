package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.7Wa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C187127Wa implements IEvent {
    public final boolean LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final boolean LJLJJLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C187127Wa)) {
            return false;
        }
        C187127Wa c187127Wa = (C187127Wa) obj;
        return this.LJLIL == c187127Wa.LJLIL && o.LJ(this.LJLILLLLZI, c187127Wa.LJLILLLLZI) && o.LJ(this.LJLJI, c187127Wa.LJLJI) && o.LJ(this.LJLJJI, c187127Wa.LJLJJI) && o.LJ(this.LJLJJL, c187127Wa.LJLJJL) && this.LJLJJLL == c187127Wa.LJLJJLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    public final int hashCode() {
        boolean z = this.LJLIL;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        String str = this.LJLILLLLZI;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJLJI;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJLJJI;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJLJJL;
        return ((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + (this.LJLJJLL ? 1 : 0);
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent post() {
        C2U8.LIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C2U8.LIZIZ(this);
        return this;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CollectStatusChangeEvent(isCollected=");
        LIZ.append(this.LJLIL);
        LIZ.append(", poiId=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", poiName=");
        LIZ.append(this.LJLJI);
        LIZ.append(", poiAddress=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", collectStatusAssemHashCode=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", isFromList=");
        return C48339Iy7.LIZJ(LIZ, this.LJLJJLL, ')', LIZ);
    }

    public /* synthetic */ C187127Wa(boolean z, String str, String str2, String str3, String str4) {
        this(str, str2, z, str3, false, str4);
    }

    public C187127Wa(String str, String str2, boolean z, String str3, boolean z2, String str4) {
        this.LJLIL = z;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = str3;
        this.LJLJJL = str4;
        this.LJLJJLL = z2;
    }
}
