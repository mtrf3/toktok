package X;

import java.util.Iterator;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H41 extends AbstractC43455H3r {
    @Override // X.AbstractC43455H3r
    public final H1T LJIIIZ() {
        return H1T.WAIT_CLICK_POST;
    }

    @Override // X.AbstractC43455H3r
    public final void LJI(ERR args, C67996QmO c67996QmO) {
        o.LJIIIZ(args, "args");
        Iterator<Object> it = args.LIZ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next instanceof C43458H3u) {
                if (next != null) {
                    c67996QmO.LIZIZ(new C43393H1h("WaitClickPublishTask", Q7L.LIZJ("is direct execute: ", ((C43458H3u) next).LIZJ(new AqS154S0200000_7(args, c67996QmO, 67)))), EnumC43531H6p.OUTER);
                    return;
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.normal.ClickPublishWaiter");
    }
}
