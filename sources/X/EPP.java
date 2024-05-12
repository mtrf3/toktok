package X;

import defpackage.i0;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class EPP implements InterfaceC66022Pve {
    @Override // X.InterfaceC66022Pve
    public final String LIZ(Object obj) {
        String str = (String) obj;
        if (str != null && str.trim().length() != 0) {
            try {
                if (str.startsWith("{")) {
                    return new JSONObject(str).toString(4);
                }
                if (str.startsWith("[")) {
                    return new JSONArray(str).toString(4);
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("JSON should start with { or [, but found ");
                LIZ.append(str);
                throw new EPQ(X1D.LIZIZ(LIZ));
            } catch (Exception e) {
                throw new EPQ(i0.LJFF("Parse JSON error. JSON string:", str), e);
            }
        }
        throw new EPQ("JSON empty.");
    }
}
