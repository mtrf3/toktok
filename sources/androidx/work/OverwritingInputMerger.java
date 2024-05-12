package androidx.work;

import X.C0CX;
import X.C0CY;
import X.C0VV;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class OverwritingInputMerger extends C0VV {
    @Override // X.C0VV
    public final C0CY LIZ(List<C0CY> list) {
        C0CX c0cx = new C0CX();
        HashMap hashMap = new HashMap();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            hashMap.putAll(Collections.unmodifiableMap(((C0CY) it.next()).LIZ));
        }
        c0cx.LIZIZ(hashMap);
        return c0cx.LIZ();
    }
}
