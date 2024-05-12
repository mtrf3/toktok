package X;

import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.ODh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61541ODh {
    public static final java.util.Map<Class<? extends AbstractC61551ODr<?, ?>>, C61542ODi> LIZ = new HashMap();

    public static OE9 LIZ(Class<? extends AbstractC61551ODr<?, ?>> cls) {
        OE9 oe9;
        java.util.Map<Class<? extends AbstractC61551ODr<?, ?>>, C61542ODi> map = LIZ;
        synchronized (map) {
            oe9 = (OE9) ((HashMap) map).get(cls);
        }
        return oe9;
    }

    public static void LIZIZ(Class<? extends AbstractC61551ODr<?, ?>> cls, OE9 oe9) {
        java.util.Map<Class<? extends AbstractC61551ODr<?, ?>>, C61542ODi> map = LIZ;
        synchronized (map) {
            C61542ODi c61542ODi = (C61542ODi) ((HashMap) map).get(cls);
            if (c61542ODi == null) {
                c61542ODi = new C61542ODi(new OE9[0]);
                ((HashMap) map).put(cls, c61542ODi);
            }
            ((CopyOnWriteArrayList) c61542ODi.LIZ).add(oe9);
        }
    }
}
