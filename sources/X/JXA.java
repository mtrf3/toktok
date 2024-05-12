package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes9.dex */
public final class JXA implements InterfaceC55284Lmq {
    public static final JXA LIZ = new JXA();
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(JXB.LJLIL);
    public static int LIZJ = -1;

    @Override // X.InterfaceC55284Lmq
    public final boolean LIZ() {
        return !((java.util.Map) LIZIZ.getValue()).isEmpty();
    }

    @Override // X.InterfaceC55284Lmq
    public final void LIZIZ(Aweme aweme, String str) {
        JX9 jx9;
        Iterator it = ((java.util.Map) LIZIZ.getValue()).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (((Reference) entry.getValue()).get() == null) {
                it.remove();
            } else if (((Number) entry.getKey()).intValue() == LIZJ && (jx9 = (JX9) ((Reference) entry.getValue()).get()) != null) {
                jx9.LIZLLL(aweme, str);
            }
        }
    }
}
