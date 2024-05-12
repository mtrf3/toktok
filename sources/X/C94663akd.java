package X;

import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;

/* renamed from: X.akd, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94663akd extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ XJL LJLIL;
    public final /* synthetic */ EnumC93823aX5 LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ Object LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94663akd(XKS xks, EnumC93823aX5 enumC93823aX5, String str, long j, String str2, Object obj) {
        super(0);
        this.LJLIL = xks;
        this.LJLILLLLZI = enumC93823aX5;
        this.LJLJI = str;
        this.LJLJJI = j;
        this.LJLJJL = str2;
        this.LJLJJLL = obj;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        C93829aXB LJI = CKEffectEditorContext.LJI();
        if (LJI == null || !LJI.LJIIIIZZ(this.LJLILLLLZI, this.LJLJI)) {
            XJL xjl = this.LJLIL;
            C94271aeJ c94271aeJ = new C94271aeJ(Long.valueOf(this.LJLJJI), EnumC93820aX2.ASSET_INCOMPATIBLE);
            C3C5.m7constructorimpl(c94271aeJ);
            xjl.resumeWith(c94271aeJ);
        } else {
            C93847aXT.LIZJ(this.LJLJJI, this.LJLJI, this.LJLJJL, this.LJLILLLLZI, this.LJLJJLL);
            XJL xjl2 = this.LJLIL;
            C94271aeJ c94271aeJ2 = new C94271aeJ(Long.valueOf(this.LJLJJI), EnumC93820aX2.SUCCESS);
            C3C5.m7constructorimpl(c94271aeJ2);
            xjl2.resumeWith(c94271aeJ2);
        }
        return C76800UCe.LIZ;
    }
}
