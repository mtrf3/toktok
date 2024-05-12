package X;

import com.ss.android.ugc.aweme.api.model.AnchorModule;

/* renamed from: X.GqB, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC42751GqB {
    public final InterfaceC42726Gpm LIZ;

    public abstract void LIZ(C31413CUn c31413CUn, InterfaceC42726Gpm interfaceC42726Gpm, String str);

    public final C31413CUn LIZIZ() {
        C31413CUn c31413CUn = new C31413CUn();
        ((C31411CUl) c31413CUn.LJLILLLLZI).LIZJ(AnchorModule.class);
        C31410CUk c31410CUk = new C31410CUk(c31413CUn, AnchorModule.class);
        c31410CUk.LIZJ = new AbstractC31414CUo[]{new C42754GqE(this.LIZ), new C42749Gq9(this.LIZ), new C42750GqA(this.LIZ), new C42745Gq5(this.LIZ), new C42752GqC(this.LIZ)};
        c31410CUk.LIZ(C42748Gq8.LIZ);
        LIZ(c31413CUn, this.LIZ, "enter_page");
        return c31413CUn;
    }

    public AbstractC42751GqB(InterfaceC42726Gpm interfaceC42726Gpm) {
        this.LIZ = interfaceC42726Gpm;
    }
}
