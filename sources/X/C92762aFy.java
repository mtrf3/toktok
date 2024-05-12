package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.aFy, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92762aFy extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C92145a61 LJLIL;
    public final /* synthetic */ C92158a6E LJLILLLLZI;
    public final /* synthetic */ InterfaceC91773a01 LJLJI;
    public final /* synthetic */ View LJLJJI;
    public final /* synthetic */ InterfaceC70422pa LJLJJL;
    public final /* synthetic */ C92283a8F LJLJJLL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92762aFy(C92145a61 c92145a61, C92158a6E c92158a6E, InterfaceC91773a01 interfaceC91773a01, View view, InterfaceC70422pa interfaceC70422pa, C92283a8F c92283a8F, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(0);
        this.LJLIL = c92145a61;
        this.LJLILLLLZI = c92158a6E;
        this.LJLJI = interfaceC91773a01;
        this.LJLJJI = view;
        this.LJLJJL = interfaceC70422pa;
        this.LJLJJLL = c92283a8F;
        this.LJLJL = interfaceC65784Pro;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        String str;
        C91720ZzA LJFF = this.LJLIL.LJFF();
        if (LJFF == null) {
            str = null;
        } else {
            str = LJFF.LJLJL;
        }
        if (o.LJ(str, "select_pi_without_default")) {
            this.LJLILLLLZI.LJFF();
            C91863a1T.LIZIZ(this.LJLJI, this.LJLILLLLZI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL);
        } else if (!this.LJLIL.LJIILIIL()) {
            this.LJLILLLLZI.LJFF();
            C91863a1T.LIZIZ(this.LJLJI, this.LJLILLLLZI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL);
        }
        return C76800UCe.LIZ;
    }
}
