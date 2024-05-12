package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.PpV, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65641PpV extends AbstractC65645PpZ<Map.Entry<Object, Object>, Object> {
    public C65641PpV(Iterator it) {
        super(it);
    }

    @Override // X.AbstractC65645PpZ
    public final Object LIZ(Map.Entry<Object, Object> entry) {
        return entry.getKey();
    }
}
