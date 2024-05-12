package X;

import com.lynx.tasm.TemplateData;

/* renamed from: X.JoG, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50276JoG implements InterfaceC60819Ntv {
    public final /* synthetic */ String LJLIL;

    @Override // X.M2J
    public final void release() {
    }

    public C50276JoG(String str) {
        this.LJLIL = str;
    }

    @Override // X.InterfaceC60819Ntv
    public final void LJIL(InterfaceC60710NsA interfaceC60710NsA) {
        C60606NqU c60606NqU;
        if (!(interfaceC60710NsA instanceof C60606NqU) || (c60606NqU = (C60606NqU) interfaceC60710NsA) == null) {
            return;
        }
        c60606NqU.LJIIIIZZ = TemplateData.LJFF(this.LJLIL);
    }
}
