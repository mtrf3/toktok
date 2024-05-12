package X;

import android.view.View;
import kotlin.jvm.internal.IDqS422S0100000_31;

/* renamed from: X.aEI, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92658aEI extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ C92158a6E LJLILLLLZI;
    public final /* synthetic */ View LJLJI;
    public final /* synthetic */ InterfaceC65784Pro LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92658aEI(boolean z, C92158a6E c92158a6E, View view, InterfaceC65784Pro interfaceC65784Pro) {
        super(0);
        this.LJLIL = z;
        this.LJLILLLLZI = c92158a6E;
        this.LJLJI = view;
        this.LJLJJI = interfaceC65784Pro;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.LJLIL) {
            this.LJLILLLLZI.LJFF();
            C91874a1e.LIZIZ(this.LJLILLLLZI, this.LJLJI, new IDqS422S0100000_31(this.LJLJJI, 75));
        } else {
            this.LJLJJI.invoke();
        }
    }

    @Override // X.InterfaceC65784Pro
    public /* bridge */ /* synthetic */ C76800UCe invoke() {
        invoke2();
        return C76800UCe.LIZ;
    }
}
