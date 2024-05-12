package X;

import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import java.util.HashMap;

/* loaded from: classes15.dex */
public final class VNA {
    public final String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;

    public static java.util.Map<String, VNA> LIZ(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < readableArray.size(); i++) {
            ReadableMap map = readableArray.getMap(i);
            String string = map.getString("name");
            VNA vna = (VNA) hashMap.get(string);
            if (vna == null) {
                vna = new VNA(string, map.getString("type"), map.getString("function"), map.getString("lepusType"), map.getString("lepusFunction"));
            } else {
                if (vna.LIZIZ == null && vna.LIZJ == null) {
                    vna.LIZIZ = map.getString("type");
                    vna.LIZJ = map.getString("function");
                }
                if (vna.LIZLLL == null && vna.LJ == null) {
                    vna.LIZLLL = map.getString("lepusType");
                    vna.LJ = map.getString("lepusFunction");
                }
            }
            hashMap.put(vna.LIZ, vna);
        }
        return hashMap;
    }

    public VNA(String str, String str2, String str3, String str4, String str5) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
    }
}
