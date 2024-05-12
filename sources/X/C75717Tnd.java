package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.MultiCoHostFeedbackDialogOpenEvent;
import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.Tnd, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75717Tnd implements InterfaceC75706TnS<OLS> {
    public final /* synthetic */ C75883TqJ LJLIL;
    public final /* synthetic */ C75760ToK LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ long LJLJJI;

    @Override // X.InterfaceC75706TnS
    public final void LJFF(OFV ofv) {
        long j;
        long j2;
        OLS ols = (OLS) ofv;
        B5G.LIZIZ();
        LinkCrossRoomDataHolder LIZIZ = B5G.LIZIZ();
        User LJ = TV3.LJ();
        if (LJ != null) {
            j = LJ.getId();
        } else {
            j = 0;
        }
        LIZIZ.LJJIZ = j;
        LinkCrossRoomDataHolder LIZIZ2 = B5G.LIZIZ();
        C75883TqJ c75883TqJ = this.LJLIL;
        if (c75883TqJ != null) {
            j2 = c75883TqJ.LIZ;
        } else {
            j2 = 0;
        }
        LIZIZ2.LJJLIL = j2;
        if (ols.LJLJI > 0 && C30457BxN.LIZ()) {
            AnonymousClass030.LJFF(InterfaceC30442Bx8.LLILZ);
            DataChannel dataChannel = this.LJLILLLLZI.LJLJJI;
            if (dataChannel != null) {
                dataChannel.qv0(MultiCoHostFeedbackDialogOpenEvent.class, new C35753E1l(this.LJLJI, this.LJLJJI, ols.LJLJI));
            }
        }
    }

    @Override // X.InterfaceC75706TnS
    public final void LIZLLL(C76003TsF c76003TsF, Throwable th) {
        if (th != null) {
            BPP.LJ(C15380j0.LIZLLL(), th);
            C75516TkO.LIZ.LIZIZ(411, "leave multi_cohost link mic failed", th, null);
        }
    }

    public C75717Tnd(C75883TqJ c75883TqJ, C75760ToK c75760ToK, long j, long j2) {
        this.LJLIL = c75883TqJ;
        this.LJLILLLLZI = c75760ToK;
        this.LJLJI = j;
        this.LJLJJI = j2;
    }
}
