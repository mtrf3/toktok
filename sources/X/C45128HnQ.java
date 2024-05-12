package X;

import com.ss.android.ugc.aweme.autocut.sdk.data.NLEModelResponse;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.HnQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45128HnQ extends RuntimeException {
    public final NLEModelResponse LJLIL;
    public final String LJLILLLLZI;

    /* JADX WARN: Multi-variable type inference failed */
    public C45128HnQ() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ C45128HnQ copy$default(C45128HnQ c45128HnQ, NLEModelResponse nLEModelResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            nLEModelResponse = c45128HnQ.LJLIL;
        }
        if ((i & 2) != 0) {
            str = c45128HnQ.LJLILLLLZI;
        }
        return c45128HnQ.copy(nLEModelResponse, str);
    }

    public final C45128HnQ copy(NLEModelResponse nLEModelResponse, String str) {
        return new C45128HnQ(nLEModelResponse, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C45128HnQ)) {
            return false;
        }
        C45128HnQ c45128HnQ = (C45128HnQ) obj;
        return o.LJ(this.LJLIL, c45128HnQ.LJLIL) && o.LJ(this.LJLILLLLZI, c45128HnQ.LJLILLLLZI);
    }

    public int hashCode() {
        NLEModelResponse nLEModelResponse = this.LJLIL;
        int hashCode = (nLEModelResponse == null ? 0 : nLEModelResponse.hashCode()) * 31;
        String str = this.LJLILLLLZI;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NLEModelException(response=");
        LIZ.append(this.LJLIL);
        LIZ.append(", nleConfig=");
        return q.LIZIZ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    public final String getNleConfig() {
        return this.LJLILLLLZI;
    }

    public final NLEModelResponse getResponse() {
        return this.LJLIL;
    }

    public C45128HnQ(NLEModelResponse nLEModelResponse, String str) {
        this.LJLIL = nLEModelResponse;
        this.LJLILLLLZI = str;
    }

    public /* synthetic */ C45128HnQ(NLEModelResponse nLEModelResponse, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : nLEModelResponse, (i & 2) != 0 ? null : str);
    }
}
