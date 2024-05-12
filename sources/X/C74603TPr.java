package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.TPr, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74603TPr<T> implements InterfaceC64592gB {
    public final /* synthetic */ DataChannel LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    public C74603TPr(int i, DataChannel dataChannel, String str) {
        this.LJLIL = dataChannel;
        this.LJLILLLLZI = str;
        this.LJLJI = i;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        C32014ChO.LIZJ(C74738TUw.LIZJ(118), "guestRankSetting has exception:", ((Throwable) obj).getMessage());
        C74738TUw.LJI(this.LJLIL, true, this.LJLILLLLZI, this.LJLJI);
    }
}
