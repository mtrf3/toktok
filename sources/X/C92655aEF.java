package X;

import android.view.View;
import kotlin.jvm.internal.IDqS422S0100000_31;

/* renamed from: X.aEF, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92655aEF extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C05P LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ C92158a6E LJLJI;
    public final /* synthetic */ View LJLJJI;
    public final /* synthetic */ InterfaceC65784Pro LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92655aEF(C05P c05p, boolean z, C92158a6E c92158a6E, View view, InterfaceC65784Pro interfaceC65784Pro) {
        super(0);
        this.LJLIL = c05p;
        this.LJLILLLLZI = z;
        this.LJLJI = c92158a6E;
        this.LJLJJI = view;
        this.LJLJJL = interfaceC65784Pro;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        C05P c05p = this.LJLIL;
        if (c05p != null) {
            c05p.hide();
        }
        if (this.LJLILLLLZI) {
            this.LJLJI.LJFF();
            C91874a1e.LIZIZ(this.LJLJI, this.LJLJJI, new IDqS422S0100000_31(this.LJLJJL, 83));
        } else {
            this.LJLJJL.invoke();
        }
    }

    @Override // X.InterfaceC65784Pro
    public /* bridge */ /* synthetic */ C76800UCe invoke() {
        invoke2();
        return C76800UCe.LIZ;
    }
}
