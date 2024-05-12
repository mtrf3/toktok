package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class Q9R extends AbstractC38521fE {
    public Q9R() {
        super(3);
    }

    @Override // X.AbstractC38521fE
    public final /* synthetic */ Object LJ(JSONObject jSONObject) {
        String string = JSONObjectProtectorUtils.getString(jSONObject, "token_type");
        if ("Bearer".equals(string)) {
            final String string2 = JSONObjectProtectorUtils.getString(jSONObject, "access_token");
            final long j = JSONObjectProtectorUtils.getLong(jSONObject, "expires_in") * 1000;
            final String optString = jSONObject.optString("refresh_token");
            return new Object(string2, j, optString) { // from class: X.2PB
                public final String LIZ;
                public final long LIZIZ;
                public final String LIZJ;

                public final int hashCode() {
                    int i;
                    int hashCode = this.LIZ.hashCode() * 31;
                    long j2 = this.LIZIZ;
                    int i2 = (hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
                    String str = this.LIZJ;
                    if (str != null) {
                        i = str.hashCode();
                    } else {
                        i = 0;
                    }
                    return i2 + i;
                }

                public final String toString() {
                    return "RefreshTokenResult{accessToken='#####', expiresInMillis=" + this.LIZIZ + ", refreshToken='#####'}";
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj != null && C2PB.class == obj.getClass()) {
                        C2PB c2pb = (C2PB) obj;
                        if (this.LIZIZ != c2pb.LIZIZ || !this.LIZ.equals(c2pb.LIZ)) {
                            return false;
                        }
                        String str = this.LIZJ;
                        String str2 = c2pb.LIZJ;
                        if (str != null) {
                            return str.equals(str2);
                        }
                        if (str2 == null) {
                            return true;
                        }
                    }
                    return false;
                }

                {
                    this.LIZ = string2;
                    this.LIZIZ = j;
                    this.LIZJ = optString;
                }
            };
        }
        throw new JSONException("Illegal token type. token_type=" + string);
    }
}
