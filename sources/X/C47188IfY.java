package X;

import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: X.IfY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47188IfY {
    public String LIZ;
    public String LIZIZ;
    public int LIZJ;
    public int LIZLLL = 1;
    public String LJ;

    public final String LIZ() {
        HashMap hashMap = new HashMap();
        hashMap.put("scene_id", this.LIZ);
        hashMap.put("brief_scene_id", this.LIZIZ);
        hashMap.put("auto_play", Integer.valueOf(this.LIZJ));
        hashMap.put("mute", 0);
        hashMap.put("card_cnt", Integer.valueOf(this.LIZLLL));
        hashMap.put("json", this.LJ);
        return new JSONObject(hashMap).toString();
    }

    public C47188IfY(String str) {
        this.LIZ = str;
    }
}
