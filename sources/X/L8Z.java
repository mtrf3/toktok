package X;

import com.ss.android.ugc.aweme.topicfeed.service.TopicFeedServiceImpl;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS159S0100000_9;

/* loaded from: classes10.dex */
public final class L8Z {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 1044));
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C53760L8a.LJLIL);
    public boolean LIZJ;

    public final void LIZIZ() {
        if (this.LIZJ) {
            return;
        }
        for (AbstractC53764L8e abstractC53764L8e : (java.util.Set) this.LIZ.getValue()) {
            if (abstractC53764L8e == null) {
                return;
            }
            abstractC53764L8e.LIZIZ.getValue();
            abstractC53764L8e.LIZ.getValue();
            ((ConcurrentHashMap) this.LIZIZ.getValue()).put(abstractC53764L8e.LIZIZ().getKey(), abstractC53764L8e);
        }
        this.LIZJ = true;
    }

    public static AbstractC53764L8e LIZ(EnumC53808L9w enumC53808L9w) {
        Object L1 = TopicFeedServiceImpl.LIZ().L1(enumC53808L9w);
        if (L1 instanceof AbstractC53764L8e) {
            return (AbstractC53764L8e) L1;
        }
        return null;
    }
}
