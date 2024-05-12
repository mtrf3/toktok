package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.5bT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C138115bT {
    public final JSONObject LIZ = new JSONObject();
    public final List<String> LIZIZ = new ArrayList();

    public final void LIZLLL() {
        Iterator it = ((ArrayList) this.LIZIZ).iterator();
        boolean z = true;
        while (it.hasNext()) {
            if (!this.LIZ.has((String) it.next())) {
                z = false;
            }
        }
        if (z) {
            FMX.LJIILJJIL("feature_apply", C78609UtB.LJJIJIIJI(this.LIZ));
            C09900aA.LJIIJJI("feature_apply", 0, C78609UtB.LJJIJIIJI(this.LIZ));
        }
    }

    public final void LJ() {
        this.LIZ.put("feature_name", "");
        LJFF("");
        this.LIZ.put("extra", "");
        this.LIZ.put("total_duration", 0L);
        this.LIZ.put("apply_duration", 0L);
        this.LIZ.put("resource_prepare_duration", 0L);
        this.LIZ.put("use_cache", 0);
        this.LIZ.put("error_msg", "");
        LIZIZ(0);
        this.LIZ.put("effect_id", "");
        LIZ("");
    }

    public final void LIZ(String creationId) {
        o.LJIIIZ(creationId, "creationId");
        this.LIZ.put("creation_id", creationId);
    }

    public final void LIZIZ(int i) {
        this.LIZ.put("error_code", i);
    }

    public final void LIZJ(String str) {
        this.LIZ.put("error_msg", str);
    }

    public final void LJFF(String name) {
        o.LJIIIZ(name, "name");
        this.LIZ.put("scene_name", name);
    }
}
