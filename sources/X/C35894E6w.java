package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.E6w, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35894E6w extends QXX {
    public final List<java.util.Map<String, Object>> LJLIL;

    public C35894E6w(java.util.Map<String, ? extends Object> map) {
        this(new ArrayList());
        if (map != null) {
            this.LJLIL.add(map);
        }
    }

    @Override // X.QXX
    public final void LLFFF(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        Iterator<java.util.Map<String, Object>> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            for (Map.Entry<String, Object> entry : it.next().entrySet()) {
                if (o.LJ(entry.getKey(), "container_id")) {
                    Object value = entry.getValue();
                    if ((value instanceof String) && value != null) {
                        arrayList.add(value);
                    }
                } else {
                    C77123UOp.LJJJLIIL(jSONObject, entry.getKey(), entry.getValue());
                }
            }
        }
        if (!arrayList.isEmpty()) {
            C77123UOp.LJJJLIIL(jSONObject, "container_ids", new JSONArray((Collection) arrayList));
        }
    }

    public C35894E6w(List<java.util.Map<String, Object>> list) {
        super((Object) null);
        this.LJLIL = list;
    }
}
