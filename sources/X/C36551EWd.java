package X;

import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.EWd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36551EWd {
    public static final ConcurrentHashMap<String, WeakReference<C36562EWo>> LIZ = new ConcurrentHashMap<>();

    public static C36562EWo LIZ(String str) {
        C36562EWo c36562EWo;
        if (str == null) {
            return C36552EWe.LIZ;
        }
        WeakReference<C36562EWo> weakReference = LIZ.get(str);
        if (weakReference != null && (c36562EWo = weakReference.get()) != null) {
            return c36562EWo;
        }
        return C36552EWe.LIZ;
    }
}
