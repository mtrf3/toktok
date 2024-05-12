package X;

import com.bytedance.android.live.design.app.LiveDialog;

/* renamed from: X.BHk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28524BHk implements C0K7 {
    public final /* synthetic */ InterfaceC67352kd<Boolean> LJLIL;
    public final /* synthetic */ C28527BHn LJLILLLLZI;
    public final /* synthetic */ C28523BHj LJLJI;
    public final /* synthetic */ BIK LJLJJI;

    public C28524BHk(C84654XKg c84654XKg, C28527BHn c28527BHn, C28523BHj c28523BHj, BIK bik) {
        this.LJLIL = c84654XKg;
        this.LJLILLLLZI = c28527BHn;
        this.LJLJI = c28523BHj;
        this.LJLJJI = bik;
    }

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro;
        liveDialog.dismiss();
        InterfaceC67352kd<Boolean> interfaceC67352kd = this.LJLIL;
        Boolean bool = Boolean.TRUE;
        C3C5.m7constructorimpl(bool);
        interfaceC67352kd.resumeWith(bool);
        C28527BHn c28527BHn = this.LJLILLLLZI;
        if (c28527BHn != null && (interfaceC65784Pro = c28527BHn.LIZLLL) != null) {
            interfaceC65784Pro.invoke();
        }
        this.LJLJI.getClass();
        C28523BHj.LIZJ("hide");
        C78847Ux1.LJJJJJ(this.LJLJJI.LIZIZ, "click_remove");
    }
}
