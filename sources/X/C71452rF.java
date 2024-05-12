package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.emoji.stickerstore.stickersetdetail.StickerSetDetailManager", f = "StickerSetDetailManager.kt", l = {31}, m = "onRefresh$aweme_emoji_release")
/* renamed from: X.2rF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71452rF extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C71442rE LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71452rF(C71442rE c71442rE, InterfaceC67352kd<? super C71452rF> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c71442rE;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LJIILLIIL(null, this);
    }
}
