package X;

import android.content.Intent;
import kotlin.jvm.internal.o;

/* renamed from: X.Fyx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40747Fyx extends AbstractC65781Prl implements InterfaceC88472Yns<InterfaceC40749Fyz, C76800UCe> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ Intent LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40747Fyx(int i, int i2, Intent intent) {
        super(1);
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = intent;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(InterfaceC40749Fyz interfaceC40749Fyz) {
        InterfaceC40749Fyz it = interfaceC40749Fyz;
        o.LJIIIZ(it, "it");
        it.onActivityResult(this.LJLIL, this.LJLILLLLZI, this.LJLJI);
        return C76800UCe.LIZ;
    }
}
