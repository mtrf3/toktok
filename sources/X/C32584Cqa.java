package X;

import com.bytedance.android.live.gift.GuideBubbleVisibilityChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.Cqa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32584Cqa implements InterfaceC19890qH {
    public final /* synthetic */ C32603Cqt LJLIL;
    public final /* synthetic */ C32633CrN LJLILLLLZI;
    public final /* synthetic */ C15930jt LJLJI;

    public C32584Cqa(C32603Cqt c32603Cqt, C32633CrN c32633CrN, C15930jt c15930jt) {
        this.LJLIL = c32603Cqt;
        this.LJLILLLLZI = c32633CrN;
        this.LJLJI = c15930jt;
    }

    @Override // X.InterfaceC19890qH
    public final void onShow() {
        Long l;
        C32650Cre.LIZ = true;
        this.LJLIL.LIZLLL(this.LJLILLLLZI);
        C15930jt c15930jt = this.LJLJI;
        if (c15930jt != null) {
            l = c15930jt.LIZ;
        } else {
            l = null;
        }
        C32793Ctx.LIZIZ(l, EnumC32606Cqw.FANS_CLUB_LEVEL_GIFT, 0);
        DataChannel dataChannel = this.LJLIL.LJLIL;
        if (dataChannel != null) {
            dataChannel.rv0(GuideBubbleVisibilityChannel.class, Boolean.TRUE);
        }
    }
}
