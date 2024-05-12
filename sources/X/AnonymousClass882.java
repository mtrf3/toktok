package X;

import Y.IDfS127S0100000_3;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.favorites.business.playlist.PlaylistCollectionVM$onPrepared$1$invokeSuspend$$inlined$filter$1$2", f = "PlaylistCollectionVM.kt", l = {136}, m = "emit")
/* renamed from: X.882, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass882 extends C3CS {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ IDfS127S0100000_3 LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass882(IDfS127S0100000_3 iDfS127S0100000_3, InterfaceC67352kd interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = iDfS127S0100000_3;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLILLLLZI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.emit(null, this);
    }
}
