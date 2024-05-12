package X;

import com.ss.android.ugc.aweme.result.common.core.model.DynamicSearchResponseData;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Dyy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35652Dyy implements C33Q {
    public final JSONObject LJLIL;
    public final AbstractC72932td<DynamicSearchResponseData> LJLILLLLZI;

    public C35652Dyy() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35652Dyy)) {
            return false;
        }
        C35652Dyy c35652Dyy = (C35652Dyy) obj;
        return o.LJ(this.LJLIL, c35652Dyy.LJLIL) && o.LJ(this.LJLILLLLZI, c35652Dyy.LJLILLLLZI);
    }

    public final int hashCode() {
        JSONObject jSONObject = this.LJLIL;
        return this.LJLILLLLZI.hashCode() + ((jSONObject == null ? 0 : jSONObject.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchResultOrderState(searchInitParams=");
        LIZ.append(this.LJLIL);
        LIZ.append(", result=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public /* synthetic */ C35652Dyy(int i) {
        this(null, C33X.LIZ);
    }

    public C35652Dyy(JSONObject jSONObject, AbstractC72932td<DynamicSearchResponseData> result) {
        o.LJIIIZ(result, "result");
        this.LJLIL = jSONObject;
        this.LJLILLLLZI = result;
    }

    public static C35652Dyy LIZ(C35652Dyy c35652Dyy, JSONObject jSONObject, AbstractC72932td result, int i) {
        if ((i & 1) != 0) {
            jSONObject = c35652Dyy.LJLIL;
        }
        if ((i & 2) != 0) {
            result = c35652Dyy.LJLILLLLZI;
        }
        c35652Dyy.getClass();
        o.LJIIIZ(result, "result");
        return new C35652Dyy(jSONObject, result);
    }
}
