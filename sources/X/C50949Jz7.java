package X;

import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.Jz7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50949Jz7 implements InterfaceC63694OzC<C50949Jz7> {
    public final ECSearchEntranceData LJLIL;
    public final String LJLILLLLZI;

    public C50949Jz7() {
        this(null, 3);
    }

    @Override // X.InterfaceC54035LIp
    public final boolean LLD() {
        return true;
    }

    public final int hashCode() {
        int hashCode;
        ECSearchEntranceData eCSearchEntranceData = this.LJLIL;
        if (eCSearchEntranceData == null) {
            hashCode = 0;
        } else {
            hashCode = eCSearchEntranceData.hashCode();
        }
        return this.LJLILLLLZI.hashCode() + (hashCode * 31);
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLJZ() {
        return LLLILZ();
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLILZ() {
        return C113554cx.LJJJLIIL();
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLLIL() {
        return C113554cx.LJJJLIIL();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchEcommerceEntranceState(ecSearchEntranceData=");
        LIZ.append(this.LJLIL);
        LIZ.append(", sourceId=");
        return q.LIZIZ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50949Jz7)) {
            return false;
        }
        C50949Jz7 c50949Jz7 = (C50949Jz7) obj;
        if (o.LJ(this.LJLIL, c50949Jz7.LJLIL) && o.LJ(this.LJLILLLLZI, c50949Jz7.LJLILLLLZI)) {
            return true;
        }
        return false;
    }

    public C50949Jz7(ECSearchEntranceData eCSearchEntranceData, int i) {
        eCSearchEntranceData = (i & 1) != 0 ? null : eCSearchEntranceData;
        String sourceId = (i & 2) != 0 ? AnonymousClass629.LIZ("randomUUID().toString()") : null;
        o.LJIIIZ(sourceId, "sourceId");
        this.LJLIL = eCSearchEntranceData;
        this.LJLILLLLZI = sourceId;
    }
}
