package X;

import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import java.util.HashMap;

/* renamed from: X.2Og, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57702Og {
    public final java.util.Map<String, NextLiveData<Object>> LIZ = new HashMap();

    public final void LIZ(String str) {
        ((HashMap) this.LIZ).remove(str);
    }

    public final synchronized NextLiveData LIZIZ(String str) {
        if (!((HashMap) this.LIZ).containsKey(str)) {
            ((HashMap) this.LIZ).put(str, new NextLiveData());
        }
        return (NextLiveData) ((HashMap) this.LIZ).get(str);
    }

    public final NextLiveData<Object> LIZJ(String str) {
        return LIZIZ(str);
    }
}
