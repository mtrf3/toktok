package X;

import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Gza, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43334Gza extends AbstractC43455H3r {
    @Override // X.AbstractC43455H3r
    public final H1T LJIIIZ() {
        return H1T.UPLOAD;
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
            if (next instanceof ERL) {
                if (next != null) {
                    C60903NvH.LJIIJJI().getPublishService().LJJIIJ().getClass();
                    C41777GaT.LIZ();
                    c67996QmO.LJ(new C43335Gzb(((ERL) next).LJLIL, new C43336Gzc(0L, 0L, 0L, 0L, 0L, 63)), true);
                    return;
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.story.AuthKeyResult");
    }
}
