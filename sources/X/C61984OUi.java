package X;

import kotlin.jvm.internal.o;

/* renamed from: X.OUi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61984OUi extends F9E implements C33Q {
    public final C43I<Boolean> LJLIL;
    public final C43I<Boolean> LJLILLLLZI;
    public final C43I<Boolean> LJLJI;

    public C61984OUi() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C61984OUi(int r5) {
        /*
            r4 = this;
            X.43I r3 = new X.43I
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r3.<init>(r2)
            X.43I r1 = new X.43I
            r1.<init>(r2)
            X.43I r0 = new X.43I
            r0.<init>(r2)
            r4.<init>(r3, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61984OUi.<init>(int):void");
    }

    public C61984OUi(C43I<Boolean> relationBtnShowEvent, C43I<Boolean> followEventAnimation, C43I<Boolean> followExtendInteraction) {
        o.LJIIIZ(relationBtnShowEvent, "relationBtnShowEvent");
        o.LJIIIZ(followEventAnimation, "followEventAnimation");
        o.LJIIIZ(followExtendInteraction, "followExtendInteraction");
        this.LJLIL = relationBtnShowEvent;
        this.LJLILLLLZI = followEventAnimation;
        this.LJLJI = followExtendInteraction;
    }

    public static C61984OUi L(C61984OUi c61984OUi, C43I relationBtnShowEvent, C43I followEventAnimation, C43I followExtendInteraction, int i) {
        if ((i & 1) != 0) {
            relationBtnShowEvent = c61984OUi.LJLIL;
        }
        if ((i & 2) != 0) {
            followEventAnimation = c61984OUi.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            followExtendInteraction = c61984OUi.LJLJI;
        }
        c61984OUi.getClass();
        o.LJIIIZ(relationBtnShowEvent, "relationBtnShowEvent");
        o.LJIIIZ(followEventAnimation, "followEventAnimation");
        o.LJIIIZ(followExtendInteraction, "followExtendInteraction");
        return new C61984OUi(relationBtnShowEvent, followEventAnimation, followExtendInteraction);
    }
}
