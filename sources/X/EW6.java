package X;

import com.ss.ttvideoengine.TTVideoEngine;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public final class EW6<T> extends WeakReference<T> {
    public EW6(TTVideoEngine tTVideoEngine) {
        super(tTVideoEngine);
    }

    public final boolean equals(Object obj) {
        T t;
        if (!(obj instanceof EW6) || (t = get()) == null) {
            return false;
        }
        return t.equals(((Reference) obj).get());
    }
}
