package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.emoji.stickerstore.favsticker.PopularStickerListManager;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.emoji.stickerstore.favsticker.PopularStickerListManager", f = "PopularStickerListManager.kt", l = {104, 115}, m = "fetchOnlineAndUpdateCache")
/* renamed from: X.2rg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71722rg extends C3CS {
    public PopularStickerListManager LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ PopularStickerListManager LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71722rg(PopularStickerListManager popularStickerListManager, InterfaceC67352kd<? super C71722rg> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = popularStickerListManager;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZ(this);
    }
}
