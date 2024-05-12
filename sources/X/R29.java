package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class R29 implements R2E {
    public static String LIZIZ(List list) {
        if (list == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C05130Ib c05130Ib = (C05130Ib) it.next();
            sb.append(c05130Ib.getName());
            sb.append(": ");
            sb.append(c05130Ib.getValue());
            sb.append("\n");
        }
        return sb.toString();
    }

    public static final R2A LIZ(String str, String str2) {
        String str3;
        String str4;
        String LIZIZ;
        ArrayList arrayList = new ArrayList();
        String str5 = null;
        String str6 = null;
        JSONObject jSONObject = null;
        try {
            try {
                C65124PhA LIZLLL = C65124PhA.LIZLLL();
                byte[] bytes = str2.getBytes();
                LIZLLL.getClass();
                C65126PhC LIZ = ((C65123Ph9) C65124PhA.LJFF(str, arrayList, "application/json", bytes)).LIZ();
                byte[] bArr = LIZ.LJ;
                if (bArr != null) {
                    str4 = new String(bArr);
                    try {
                        LIZIZ = LIZIZ(LIZ.LIZJ);
                    } catch (JSONException e) {
                        e = e;
                    }
                    try {
                        jSONObject = new JSONObject(str4);
                    } catch (JSONException e2) {
                        e = e2;
                        str6 = LIZIZ;
                        str3 = str6;
                        str5 = str4;
                        R2C r2c = new R2C();
                        r2c.LIZIZ = str5;
                        r2c.LIZJ = str3;
                        r2c.LIZLLL = e;
                        return new R2A(r2c);
                    }
                } else {
                    str4 = null;
                }
                R2C r2c2 = new R2C();
                r2c2.LIZ = jSONObject;
                r2c2.LIZIZ = str4;
                r2c2.LJ = LIZ.LIZIZ;
                return new R2A(r2c2);
            } catch (JSONException e3) {
                e = e3;
                str3 = null;
            }
        } catch (IOException e4) {
            R2C r2c3 = new R2C();
            r2c3.LIZLLL = e4;
            return new R2A(r2c3);
        } catch (Exception e5) {
            R2C r2c4 = new R2C();
            r2c4.LIZLLL = e5;
            return new R2A(r2c4);
        }
    }
}
