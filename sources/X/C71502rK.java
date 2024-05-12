package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.emoji.stickerstore.favsticker.FavStickerListManager", f = "FavStickerListManager.kt", l = {38}, m = "onRefresh$aweme_emoji_release")
/* renamed from: X.2rK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71502rK extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C71512rL LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71502rK(C71512rL c71512rL, InterfaceC67352kd<? super C71502rK> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c71512rL;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LJIILLIIL(null, this);
    }
}
