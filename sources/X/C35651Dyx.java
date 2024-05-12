package X;

import com.ss.android.ugc.aweme.result.common.core.model.DynamicSearchResponseData;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Dyx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35651Dyx implements C33Q {
    public final JSONObject LJLIL;
    public final AbstractC72932td<DynamicSearchResponseData> LJLILLLLZI;

    public C35651Dyx() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35651Dyx)) {
            return false;
        }
        C35651Dyx c35651Dyx = (C35651Dyx) obj;
        return o.LJ(this.LJLIL, c35651Dyx.LJLIL) && o.LJ(this.LJLILLLLZI, c35651Dyx.LJLILLLLZI);
    }

    public final int hashCode() {
        JSONObject jSONObject = this.LJLIL;
        return this.LJLILLLLZI.hashCode() + ((jSONObject == null ? 0 : jSONObject.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchResultLiveState(searchInitParams=");
        LIZ.append(this.LJLIL);
        LIZ.append(", result=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public /* synthetic */ C35651Dyx(int i) {
        this(null, C33X.LIZ);
    }

    public C35651Dyx(JSONObject jSONObject, AbstractC72932td<DynamicSearchResponseData> result) {
        o.LJIIIZ(result, "result");
        this.LJLIL = jSONObject;
        this.LJLILLLLZI = result;
    }

    public static C35651Dyx LIZ(C35651Dyx c35651Dyx, JSONObject jSONObject, AbstractC72932td result, int i) {
        if ((i & 1) != 0) {
            jSONObject = c35651Dyx.LJLIL;
        }
        if ((i & 2) != 0) {
            result = c35651Dyx.LJLILLLLZI;
        }
        c35651Dyx.getClass();
        o.LJIIIZ(result, "result");
        return new C35651Dyx(jSONObject, result);
    }
}
