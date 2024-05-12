package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.A9e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25762A9e extends AbstractC65781Prl implements InterfaceC88472Yns<View, Boolean> {
    public final /* synthetic */ View LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ C25765A9h LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25762A9e(int i, int i2, View view, C25765A9h c25765A9h, InterfaceC65784Pro interfaceC65784Pro) {
        super(1);
        this.LJLIL = view;
        this.LJLILLLLZI = i;
        this.LJLJI = c25765A9h;
        this.LJLJJI = i2;
        this.LJLJJL = interfaceC65784Pro;
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(View it) {
        o.LJIIIZ(it, "it");
        View view = this.LJLIL;
        return Boolean.valueOf(RunnableC25759A9b.LIZIZ(this.LJLILLLLZI, this.LJLJJI, view, this.LJLJI, this.LJLJJL));
    }
}
