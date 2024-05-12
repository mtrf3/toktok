package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Sk5, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72949Sk5 extends F9E implements C33Q {
    public final C72944Sk0 LJLIL;
    public final boolean LJLILLLLZI;
    public final C72954SkA LJLJI;
    public final C72953Sk9 LJLJJI;
    public final AbstractC72932td<C35752E1k> LJLJJL;
    public final AbstractC72932td<C35752E1k> LJLJJLL;

    public C72949Sk5() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI), this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C72949Sk5(int r9) {
        /*
            r8 = this;
            X.Sk0 r2 = new X.Sk0
            X.Sjv r1 = X.EnumC72939Sjv.NONE
            r0 = 0
            r2.<init>(r1, r0)
            r3 = 1
            X.SkA r4 = new X.SkA
            r4.<init>()
            X.Sk9 r5 = new X.Sk9
            r5.<init>()
            X.33X r6 = X.C33X.LIZ
            r1 = r8
            r7 = r6
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72949Sk5.<init>(int):void");
    }

    public C72949Sk5(C72944Sk0 dialogType, boolean z, C72954SkA closePage, C72953Sk9 clickOuterView, AbstractC72932td<C35752E1k> requestStatus, AbstractC72932td<C35752E1k> stateChangeStatus) {
        o.LJIIIZ(dialogType, "dialogType");
        o.LJIIIZ(closePage, "closePage");
        o.LJIIIZ(clickOuterView, "clickOuterView");
        o.LJIIIZ(requestStatus, "requestStatus");
        o.LJIIIZ(stateChangeStatus, "stateChangeStatus");
        this.LJLIL = dialogType;
        this.LJLILLLLZI = z;
        this.LJLJI = closePage;
        this.LJLJJI = clickOuterView;
        this.LJLJJL = requestStatus;
        this.LJLJJLL = stateChangeStatus;
    }

    public static C72949Sk5 L(C72949Sk5 c72949Sk5, C72944Sk0 c72944Sk0, boolean z, C72954SkA c72954SkA, C72953Sk9 c72953Sk9, AbstractC72932td abstractC72932td, AbstractC72932td abstractC72932td2, int i) {
        AbstractC72932td stateChangeStatus = abstractC72932td2;
        AbstractC72932td requestStatus = abstractC72932td;
        C72953Sk9 clickOuterView = c72953Sk9;
        C72954SkA closePage = c72954SkA;
        C72944Sk0 dialogType = c72944Sk0;
        boolean z2 = z;
        if ((i & 1) != 0) {
            dialogType = c72949Sk5.LJLIL;
        }
        if ((i & 2) != 0) {
            z2 = c72949Sk5.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            closePage = c72949Sk5.LJLJI;
        }
        if ((i & 8) != 0) {
            clickOuterView = c72949Sk5.LJLJJI;
        }
        if ((i & 16) != 0) {
            requestStatus = c72949Sk5.LJLJJL;
        }
        if ((i & 32) != 0) {
            stateChangeStatus = c72949Sk5.LJLJJLL;
        }
        c72949Sk5.getClass();
        o.LJIIIZ(dialogType, "dialogType");
        o.LJIIIZ(closePage, "closePage");
        o.LJIIIZ(clickOuterView, "clickOuterView");
        o.LJIIIZ(requestStatus, "requestStatus");
        o.LJIIIZ(stateChangeStatus, "stateChangeStatus");
        return new C72949Sk5(dialogType, z2, closePage, clickOuterView, requestStatus, stateChangeStatus);
    }
}
