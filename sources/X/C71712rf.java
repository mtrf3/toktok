package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.emoji.stickerstore.favsticker.PopularStickerListManager;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.emoji.stickerstore.favsticker.PopularStickerListManager", f = "PopularStickerListManager.kt", l = {65, 70, 74, 78}, m = "loadPopularStickers")
/* renamed from: X.2rf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71712rf extends C3CS {
    public PopularStickerListManager LJLIL;
    public Object LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ PopularStickerListManager LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71712rf(PopularStickerListManager popularStickerListManager, InterfaceC67352kd<? super C71712rf> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = popularStickerListManager;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LIZIZ(null, this);
    }
}
