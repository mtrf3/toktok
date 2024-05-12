package X;

import com.bytedance.android.live.design.app.LiveDialog;

/* renamed from: X.BbH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29087BbH implements C0K7 {
    public final /* synthetic */ C29084BbE LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ Integer LJLJI;

    public C29087BbH(C29084BbE c29084BbE, Integer num, boolean z) {
        this.LJLIL = c29084BbE;
        this.LJLILLLLZI = z;
        this.LJLJI = num;
    }

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        int i;
        C29084BbE c29084BbE = this.LJLIL;
        boolean z = this.LJLILLLLZI;
        Integer num = this.LJLJI;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        c29084BbE.LIZIZ(i, z);
        liveDialog.dismiss();
        Integer num2 = this.LJLJI;
        if (num2 != null && num2.intValue() == 4) {
            C7N.LJIIIIZZ().logBoostCardLiveEndClick(0);
        }
        CB0.LIZ();
    }
}
