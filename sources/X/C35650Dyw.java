package X;

import com.ss.android.ugc.aweme.result.common.core.ui.fragment.DynamicSearchShopData;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Dyw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35650Dyw implements C33Q {
    public final JSONObject LJLIL;
    public final AbstractC72932td<DynamicSearchShopData> LJLILLLLZI;

    public C35650Dyw() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35650Dyw)) {
            return false;
        }
        C35650Dyw c35650Dyw = (C35650Dyw) obj;
        return o.LJ(this.LJLIL, c35650Dyw.LJLIL) && o.LJ(this.LJLILLLLZI, c35650Dyw.LJLILLLLZI);
    }

    public final int hashCode() {
        JSONObject jSONObject = this.LJLIL;
        return this.LJLILLLLZI.hashCode() + ((jSONObject == null ? 0 : jSONObject.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchResultShopState(searchInitParams=");
        LIZ.append(this.LJLIL);
        LIZ.append(", result=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public /* synthetic */ C35650Dyw(int i) {
        this(null, C33X.LIZ);
    }

    public C35650Dyw(JSONObject jSONObject, AbstractC72932td<DynamicSearchShopData> result) {
        o.LJIIIZ(result, "result");
        this.LJLIL = jSONObject;
        this.LJLILLLLZI = result;
    }

    public static C35650Dyw LIZ(C35650Dyw c35650Dyw, JSONObject jSONObject, AbstractC72932td result, int i) {
        if ((i & 1) != 0) {
            jSONObject = c35650Dyw.LJLIL;
        }
        if ((i & 2) != 0) {
            result = c35650Dyw.LJLILLLLZI;
        }
        c35650Dyw.getClass();
        o.LJIIIZ(result, "result");
        return new C35650Dyw(jSONObject, result);
    }
}
