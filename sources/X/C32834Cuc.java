package X;

import com.bytedance.android.livesdk.FastGiftCombEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.Cuc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32834Cuc implements InterfaceC76911UGl {
    public final /* synthetic */ C32805Cu9 LIZ;
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ C32787Ctr LIZJ;

    @Override // X.InterfaceC76911UGl
    public final boolean LIZIZ() {
        boolean LJII = this.LIZJ.LJII(this.LIZ, true);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("showNewConfirmDialog isEnoughBalance: ");
        FT5.LJ(LIZ, !LJII, LIZ, "NewGifter");
        return !LJII;
    }

    @Override // X.InterfaceC76911UGl
    public final void LIZ() {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("showNewConfirmDialog sendGiftWithRetrofit ");
        FT5.LJ(LIZ, this.LIZIZ, LIZ, "NewGifter");
        C32805Cu9 c32805Cu9 = this.LIZ;
        if (this.LIZIZ) {
            str = "first_popup_new";
        } else {
            str = "first_popup";
        }
        c32805Cu9.LJJJJJ = str;
        this.LIZJ.LJI(c32805Cu9);
        DataChannel dataChannel = this.LIZJ.LIZJ;
        if (dataChannel != null) {
            dataChannel.qv0(FastGiftCombEvent.class, Boolean.TRUE);
        }
    }

    public C32834Cuc(C32787Ctr c32787Ctr, C32805Cu9 c32805Cu9, boolean z) {
        this.LIZJ = c32787Ctr;
        this.LIZ = c32805Cu9;
        this.LIZIZ = z;
    }
}
