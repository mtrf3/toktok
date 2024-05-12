package X;

import kotlin.jvm.internal.o;

/* renamed from: X.6GQ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6GQ extends F9E {
    public final String LJLIL;
    public final boolean LJLILLLLZI;
    public final boolean LJLJI;

    public C6GQ() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI), Boolean.valueOf(this.LJLJI)};
    }

    public /* synthetic */ C6GQ(int i) {
        this("", true, true);
    }

    public C6GQ(String selectVideoTime, boolean z, boolean z2) {
        o.LJIIIZ(selectVideoTime, "selectVideoTime");
        this.LJLIL = selectVideoTime;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
    }

    public static C6GQ L(C6GQ c6gq, String selectVideoTime, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            selectVideoTime = c6gq.LJLIL;
        }
        if ((i & 2) != 0) {
            z = c6gq.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            z2 = c6gq.LJLJI;
        }
        c6gq.getClass();
        o.LJIIIZ(selectVideoTime, "selectVideoTime");
        return new C6GQ(selectVideoTime, z, z2);
    }
}
