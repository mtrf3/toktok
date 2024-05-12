package X;

import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.B5o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC28216B5o implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ java.util.Map<String, String> LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;

    public RunnableC28216B5o(String str, String str2, String str3, java.util.Map map) {
        this.LJLIL = str;
        this.LJLILLLLZI = map;
        this.LJLJI = str2;
        this.LJLJJI = str3;
    }

    public final void LIZ() {
        java.util.Set<Map.Entry<String, String>> entrySet;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.LJLJI;
        String str2 = this.LJLJJI;
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("bizType", str);
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("slotId", str2);
        linkedHashMap.put("enter_from_merge", BJM.LJFF());
        linkedHashMap.put("enter_method", BJM.LJIIIIZZ());
        linkedHashMap.put("action_type", BJM.LIZLLL());
        linkedHashMap.put("room_id", String.valueOf(BJM.LJIILJJIL()));
        linkedHashMap.put("anchor_id", String.valueOf(BJM.LJ()));
        JSONObject jSONObject = new JSONObject();
        java.util.Map<String, String> map = this.LJLILLLLZI;
        if (map != null && (entrySet = map.entrySet()) != null) {
            for (Map.Entry<String, String> entry : entrySet) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            jSONObject.put((String) entry2.getKey(), entry2.getValue());
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ttlive_");
        LIZ.append(this.LJLIL);
        C0K2.LJIIJJI(0, X1D.LIZIZ(LIZ), jSONObject);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("livesdk_");
        LIZ2.append(this.LJLIL);
        BZI LIZ3 = C28787BRn.LIZ(X1D.LIZIZ(LIZ2));
        LIZ3.LJJIFFI(this.LJLILLLLZI);
        LIZ3.LJJIFFI(linkedHashMap);
        LIZ3.LJJIIJZLJL();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
