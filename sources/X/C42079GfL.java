package X;

import com.ss.android.ugc.aweme.services.story.forward.QuickForwardPublishLock;
import java.util.Iterator;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.GfL, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42079GfL extends AbstractC43455H3r {
    @Override // X.AbstractC43455H3r
    public final H1T LJIIIZ() {
        return H1T.QUICK_FORWARD_LOCK_CREATE_AWEME;
    }

    @Override // X.AbstractC43455H3r
    public final void LJI(ERR args, C67996QmO c67996QmO) {
        Object obj;
        Object obj2;
        o.LJIIIZ(args, "args");
        Iterator<Object> it = args.LIZ.iterator();
        while (true) {
            obj = null;
            if (it.hasNext()) {
                obj2 = it.next();
                if (obj2 instanceof QuickForwardPublishLock) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        if (obj2 instanceof QuickForwardPublishLock) {
            obj = obj2;
        }
        QuickForwardPublishLock quickForwardPublishLock = (QuickForwardPublishLock) obj;
        if (quickForwardPublishLock != null) {
            c67996QmO.LIZIZ(new C43393H1h("QuickForwardPublishLockTask", "start observer release lock event"), EnumC43531H6p.OUTER);
            C6QQ.LIZ(new AqS154S0200000_7(quickForwardPublishLock, c67996QmO, 123));
        } else {
            c67996QmO.LJ(C76800UCe.LIZ, false);
        }
    }
}
