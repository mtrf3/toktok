package X;

import com.bytedance.android.live.design.app.LiveDialog;

/* renamed from: X.BIj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28549BIj implements C0K7 {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    public C28549BIj(boolean z, String str) {
        this.LJLIL = z;
        this.LJLILLLLZI = str;
    }

    @Override // X.C0K7
    public final void LJIILLIIL(LiveDialog liveDialog) {
        CLE.LIZ(this.LJLILLLLZI, "dismiss", this.LJLIL);
        liveDialog.dismiss();
    }
}
