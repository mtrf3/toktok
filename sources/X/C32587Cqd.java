package X;

import com.bytedance.android.live.gift.GuideBubbleVisibilityChannel;

/* renamed from: X.Cqd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32587Cqd implements InterfaceC19890qH {
    public final /* synthetic */ C32603Cqt LJLIL;
    public final /* synthetic */ C32633CrN LJLILLLLZI;

    public C32587Cqd(C32603Cqt c32603Cqt, C32633CrN c32633CrN) {
        this.LJLIL = c32603Cqt;
        this.LJLILLLLZI = c32633CrN;
    }

    @Override // X.InterfaceC19890qH
    public final void onShow() {
        C32650Cre.LIZ = true;
        this.LJLIL.LIZLLL(this.LJLILLLLZI);
        C32793Ctx.LIZIZ(0L, EnumC32606Cqw.GIFT_GUIDE, 0);
        this.LJLIL.LJLIL.rv0(GuideBubbleVisibilityChannel.class, Boolean.TRUE);
    }
}
