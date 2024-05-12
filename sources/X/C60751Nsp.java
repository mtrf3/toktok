package X;

import com.lynx.tasm.TemplateData;

/* renamed from: X.Nsp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60751Nsp extends AbstractC60815Ntr {
    public final /* synthetic */ TemplateData LJLILLLLZI;
    public final /* synthetic */ InterfaceC65784Pro<InterfaceC68342mE<TemplateData>> LJLJI;

    @Override // X.AbstractC60815Ntr, X.InterfaceC60819Ntv
    public final void LJIL(InterfaceC60710NsA interfaceC60710NsA) {
        C60606NqU c60606NqU;
        if (!(interfaceC60710NsA instanceof C60606NqU) || (c60606NqU = (C60606NqU) interfaceC60710NsA) == null) {
            return;
        }
        TemplateData templateData = this.LJLILLLLZI;
        if (templateData != null) {
            c60606NqU.LJIIIIZZ = templateData;
        }
        c60606NqU.LJIIJ = this.LJLJI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C60751Nsp(TemplateData templateData, InterfaceC65784Pro<? extends InterfaceC68342mE<TemplateData>> interfaceC65784Pro) {
        this.LJLILLLLZI = templateData;
        this.LJLJI = interfaceC65784Pro;
    }
}
