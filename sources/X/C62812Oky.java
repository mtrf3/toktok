package X;

import android.content.Context;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* renamed from: X.Oky, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62812Oky extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ ViewGroup LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ AbstractC65590Pog<ESM<?>> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62812Oky(ViewGroup viewGroup, String str, boolean z, AbstractC65590Pog<ESM<?>> abstractC65590Pog) {
        super(2);
        this.LJLIL = viewGroup;
        this.LJLILLLLZI = str;
        this.LJLJI = z;
        this.LJLJJI = abstractC65590Pog;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        if ((num.intValue() & 11) != 2 || !interfaceC24520xk2.LIZ()) {
            Context context = this.LJLIL.getContext();
            o.LJIIIIZZ(context, "fullScreenView.context");
            C79164V5c.LIZ(context, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC24520xk2, 4104);
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
