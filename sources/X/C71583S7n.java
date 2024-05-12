package X;

import kotlin.jvm.internal.o;

/* renamed from: X.S7n, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71583S7n extends F9E implements C33Q {
    public final AbstractC72932td<S7Z> LJLIL;
    public final AbstractC72932td<Boolean> LJLILLLLZI;

    public C71583S7n() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C71583S7n(int r2) {
        /*
            r1 = this;
            X.33X r0 = X.C33X.LIZ
            r1.<init>(r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71583S7n.<init>(int):void");
    }

    public C71583S7n(AbstractC72932td<S7Z> saveTemplateStatus, AbstractC72932td<Boolean> displayTemplateStatus) {
        o.LJIIIZ(saveTemplateStatus, "saveTemplateStatus");
        o.LJIIIZ(displayTemplateStatus, "displayTemplateStatus");
        this.LJLIL = saveTemplateStatus;
        this.LJLILLLLZI = displayTemplateStatus;
    }

    public static C71583S7n L(C71583S7n c71583S7n, AbstractC72932td saveTemplateStatus, AbstractC72932td displayTemplateStatus, int i) {
        if ((i & 1) != 0) {
            saveTemplateStatus = c71583S7n.LJLIL;
        }
        if ((i & 2) != 0) {
            displayTemplateStatus = c71583S7n.LJLILLLLZI;
        }
        c71583S7n.getClass();
        o.LJIIIZ(saveTemplateStatus, "saveTemplateStatus");
        o.LJIIIZ(displayTemplateStatus, "displayTemplateStatus");
        return new C71583S7n(saveTemplateStatus, displayTemplateStatus);
    }
}
