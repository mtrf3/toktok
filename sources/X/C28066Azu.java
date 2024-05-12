package X;

import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Azu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28066Azu {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public List<String> LIZLLL;

    public C28066Azu() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28066Azu)) {
            return false;
        }
        C28066Azu c28066Azu = (C28066Azu) obj;
        return o.LJ(this.LIZ, c28066Azu.LIZ) && o.LJ(this.LIZIZ, c28066Azu.LIZIZ) && o.LJ(this.LIZJ, c28066Azu.LIZJ) && o.LJ(this.LIZLLL, c28066Azu.LIZLLL);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        return this.LIZLLL.hashCode() + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final JSONObject LIZ() {
        if (this.LIZ != null) {
            if (this.LIZIZ != null) {
                if (this.LIZJ != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("totalPrice", this.LIZ);
                    jSONObject.put("countryCode", this.LIZIZ);
                    jSONObject.put("currencyCode", this.LIZJ);
                    jSONObject.put("totalPriceStatus", "FINAL");
                    return jSONObject;
                }
                throw new IllegalArgumentException("need currencyCode");
            }
            throw new IllegalArgumentException("need countryCode");
        }
        throw new IllegalArgumentException("need totalPrice");
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PaymentContent(totalPrice=");
        LIZ.append((Object) this.LIZ);
        LIZ.append(", countryCode=");
        LIZ.append((Object) this.LIZIZ);
        LIZ.append(", currencyCode=");
        LIZ.append((Object) this.LIZJ);
        LIZ.append(", supportedNetworks=");
        return C1NE.LIZIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C28066Azu(Object obj) {
        C61878OQg supportedNetworks = C61878OQg.INSTANCE;
        o.LJIIIZ(supportedNetworks, "supportedNetworks");
        this.LIZ = null;
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LIZLLL = supportedNetworks;
    }
}
