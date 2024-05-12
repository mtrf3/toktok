package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4T8, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4T8 extends F9E implements C33Q {
    public final C4T2 LJLIL;
    public final C4TO LJLILLLLZI;
    public final C4TO LJLJI;
    public final EnumC109754Sl LJLJJI;
    public final List<C97383ry> LJLJJL;
    public final boolean LJLJJLL;

    public C4T8() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, Boolean.valueOf(this.LJLJJLL)};
    }

    public /* synthetic */ C4T8(int i) {
        this(C4T3.LIZ, C4TS.LIZ, C4TR.LIZ, EnumC109754Sl.NONE, new ArrayList(), false);
    }

    public C4T8(C4T2 pageMode, C4TO pageStatus, C4TO footerStatus, EnumC109754Sl currentAction, List<C97383ry> list, boolean z) {
        o.LJIIIZ(pageMode, "pageMode");
        o.LJIIIZ(pageStatus, "pageStatus");
        o.LJIIIZ(footerStatus, "footerStatus");
        o.LJIIIZ(currentAction, "currentAction");
        o.LJIIIZ(list, "list");
        this.LJLIL = pageMode;
        this.LJLILLLLZI = pageStatus;
        this.LJLJI = footerStatus;
        this.LJLJJI = currentAction;
        this.LJLJJL = list;
        this.LJLJJLL = z;
    }

    public static C4T8 L(C4T8 c4t8, C4T2 c4t2, C4TO c4to, C4TO c4to2, EnumC109754Sl enumC109754Sl, List list, boolean z, int i) {
        boolean z2 = z;
        List list2 = list;
        EnumC109754Sl currentAction = enumC109754Sl;
        C4TO footerStatus = c4to2;
        C4T2 pageMode = c4t2;
        C4TO pageStatus = c4to;
        if ((i & 1) != 0) {
            pageMode = c4t8.LJLIL;
        }
        if ((i & 2) != 0) {
            pageStatus = c4t8.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            footerStatus = c4t8.LJLJI;
        }
        if ((i & 8) != 0) {
            currentAction = c4t8.LJLJJI;
        }
        if ((i & 16) != 0) {
            list2 = c4t8.LJLJJL;
        }
        if ((i & 32) != 0) {
            z2 = c4t8.LJLJJLL;
        }
        c4t8.getClass();
        o.LJIIIZ(pageMode, "pageMode");
        o.LJIIIZ(pageStatus, "pageStatus");
        o.LJIIIZ(footerStatus, "footerStatus");
        o.LJIIIZ(currentAction, "currentAction");
        o.LJIIIZ(list2, "list");
        return new C4T8(pageMode, pageStatus, footerStatus, currentAction, list2, z2);
    }
}
