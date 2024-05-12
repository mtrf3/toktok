package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.E6v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35893E6v extends QXX {
    public final List<java.util.Map<String, Object>> LJLIL;

    public final java.util.Map<String, Object> LLLLZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<java.util.Map<String, Object>> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            for (Map.Entry<String, Object> entry : it.next().entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public C35893E6v(java.util.Map<String, ? extends Object> map) {
        this(new ArrayList());
        if (map != null) {
            this.LJLIL.add(map);
        }
    }

    @Override // X.QXX
    public final void LLFFF(JSONObject jSONObject) {
        Iterator<java.util.Map<String, Object>> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            for (Map.Entry<String, Object> entry : it.next().entrySet()) {
                C77123UOp.LJJJLIIL(jSONObject, entry.getKey(), entry.getValue());
            }
        }
    }

    public C35893E6v(List<java.util.Map<String, Object>> list) {
        super((Object) null);
        this.LJLIL = list;
    }
}
