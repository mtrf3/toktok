package com.ss.android.tracker.event;

import X.AbstractC63695OzD;
import X.C113554cx;
import X.C214578bV;
import X.OQY;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public abstract class AdBaseEvent extends AbstractC63695OzD {
    @Override // X.AbstractC63695OzD
    public final Map<String, String> LIZJ() {
        Map LJJLIL = C113554cx.LJJLIL(super.LIZJ());
        this.LIZIZ.getClass();
        Iterator it = OQY.INSTANCE.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            if (((C214578bV) entry.getValue()).LIZJ) {
                LJJLIL.remove(key);
            }
        }
        throw null;
    }

    @Override // X.AbstractC63695OzD
    public final void LIZLLL(Object obj, String key) {
        o.LJIIIZ(key, "key");
        super.LIZLLL(obj, key);
        this.LIZIZ.getClass();
    }
}
