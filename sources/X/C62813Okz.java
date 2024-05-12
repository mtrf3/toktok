package X;

import android.content.Context;

/* renamed from: X.Okz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62813Okz extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ AbstractC65590Pog<ESM<?>> LJLJJI;
    public final /* synthetic */ int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62813Okz(Context context, String str, boolean z, AbstractC65590Pog<ESM<?>> abstractC65590Pog, int i) {
        super(2);
        this.LJLIL = context;
        this.LJLILLLLZI = str;
        this.LJLJI = z;
        this.LJLJJI = abstractC65590Pog;
        this.LJLJJL = i;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        num.intValue();
        C79164V5c.LIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC24520xk, this.LJLJJL | 1);
        return C76800UCe.LIZ;
    }
}
