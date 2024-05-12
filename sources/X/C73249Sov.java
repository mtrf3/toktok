package X;

import androidx.lifecycle.Lifecycle;
import com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxyHost;
import java.util.WeakHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Sov, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73249Sov {
    public static C73250Sow LIZ(Lifecycle lifecycle, JediViewHolderProxyHost jediViewHolderProxyHost) {
        o.LJIIJ(lifecycle, "lifecycle");
        C73250Sow c73250Sow = (C73250Sow) ((WeakHashMap) jediViewHolderProxyHost.LJLILLLLZI).get(lifecycle);
        if (c73250Sow != null) {
            return c73250Sow;
        }
        C73250Sow c73250Sow2 = new C73250Sow(lifecycle, jediViewHolderProxyHost);
        ((WeakHashMap) jediViewHolderProxyHost.LJLILLLLZI).put(lifecycle, c73250Sow2);
        return c73250Sow2;
    }
}
