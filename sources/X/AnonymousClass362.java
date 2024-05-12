package X;

import android.app.Activity;
import kotlin.jvm.internal.o;

/* renamed from: X.362, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass362 extends AbstractC65781Prl implements InterfaceC88473Ynt<Activity, AbstractC90763hI, C3L4, AbstractC785136h> {
    public static final AnonymousClass362 LJLIL = new AnonymousClass362();

    public AnonymousClass362() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final AbstractC785136h invoke(Activity activity, AbstractC90763hI abstractC90763hI, C3L4 c3l4) {
        Activity activity2 = activity;
        AbstractC90763hI cm = abstractC90763hI;
        C3L4 session = c3l4;
        o.LJIIIZ(activity2, "activity");
        o.LJIIIZ(cm, "cm");
        o.LJIIIZ(session, "session");
        return new AnonymousClass361(activity2, cm, session);
    }
}
