package X;

import com.bytedance.android.live.design.app.LiveDialog;

/* renamed from: X.Th1, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75307Th1 implements C0K7 {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    public C75307Th1(int i, String str) {
        this.LJLIL = i;
        this.LJLILLLLZI = str;
    }

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        int i = this.LJLIL;
        C74983Tbn LIZ = C29556Biq.LIZ();
        String str = this.LJLILLLLZI;
        LIZ.getClass();
        C74824TYe.LJJJJJ(i, C74983Tbn.LJIIJ(str) - 1, "guidance", "click", "cancel");
        liveDialog.dismiss();
    }
}
