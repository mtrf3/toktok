package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.favorites.business.playlist.PlaylistCollectionVM;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.favorites.business.playlist.PlaylistCollectionVM", f = "PlaylistCollectionVM.kt", l = {47, LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48}, m = "onLoadMore")
/* renamed from: X.888, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass888 extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ PlaylistCollectionVM LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass888(PlaylistCollectionVM playlistCollectionVM, InterfaceC67352kd<? super AnonymousClass888> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = playlistCollectionVM;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.gv0(0, this);
    }
}
