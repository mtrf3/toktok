package X;

import com.lynx.tasm.TemplateData;

/* renamed from: X.Nys, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61126Nys extends AbstractC60815Ntr {
    public final /* synthetic */ String LJLILLLLZI;

    public C61126Nys(String str) {
        this.LJLILLLLZI = str;
    }

    @Override // X.AbstractC60815Ntr, X.InterfaceC60819Ntv
    public final void LJIL(InterfaceC60710NsA interfaceC60710NsA) {
        C60606NqU c60606NqU;
        C76800UCe c76800UCe = null;
        if (!(interfaceC60710NsA instanceof C60606NqU) || (c60606NqU = (C60606NqU) interfaceC60710NsA) == null) {
            return;
        }
        try {
            TemplateData LJFF = TemplateData.LJFF(this.LJLILLLLZI);
            c60606NqU.LJIIIIZZ = LJFF;
            LJFF.LJI("isFirstTime", Boolean.valueOf(((Boolean) C61123Nyp.LJLJJL.getValue()).booleanValue()));
            TemplateData templateData = c60606NqU.LJIIIIZZ;
            if (templateData != null) {
                templateData.LJI("is_globally_muted", Boolean.valueOf(JYH.LIZIZ.LJIIJ()));
                c76800UCe = C76800UCe.LIZ;
            }
            C3C5.m7constructorimpl(c76800UCe);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        c60606NqU.LJI(new C61128Nyu());
    }
}
