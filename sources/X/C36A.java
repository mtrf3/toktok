package X;

import android.app.Activity;
import kotlin.jvm.internal.o;

/* renamed from: X.36A, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C36A extends AbstractC65781Prl implements InterfaceC88473Ynt<Activity, AbstractC90763hI, C3L4, AbstractC785136h> {
    public static final C36A LJLIL = new C36A();

    public C36A() {
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
        return new C3TZ(activity2, cm, session);
    }
}
