package X;

import com.bytedance.android.live.gift.GuideBubbleVisibilityChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.Cqc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32586Cqc implements InterfaceC19890qH {
    public final /* synthetic */ C32603Cqt LJLIL;
    public final /* synthetic */ C32633CrN LJLILLLLZI;
    public final /* synthetic */ C29800Bmm LJLJI;

    public C32586Cqc(C32603Cqt c32603Cqt, C32633CrN c32633CrN, C29800Bmm c29800Bmm) {
        this.LJLIL = c32603Cqt;
        this.LJLILLLLZI = c32633CrN;
        this.LJLJI = c29800Bmm;
    }

    @Override // X.InterfaceC19890qH
    public final void onShow() {
        C32650Cre.LIZ = true;
        this.LJLIL.LIZLLL(this.LJLILLLLZI);
        C32793Ctx.LIZIZ(0L, EnumC32606Cqw.USER_LEVEL_UP, this.LJLJI.LIZ);
        DataChannel dataChannel = this.LJLIL.LJLIL;
        if (dataChannel != null) {
            dataChannel.rv0(GuideBubbleVisibilityChannel.class, Boolean.TRUE);
        }
    }
}
