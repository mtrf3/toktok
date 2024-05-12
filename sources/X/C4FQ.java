package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.emoji.systembigemoji.StickerResourceManager", f = "StickerResourceManager.kt", l = {316}, m = "fetch$aweme_emoji_release")
/* renamed from: X.4FQ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4FQ extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C4FD LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4FQ(C4FD c4fd, InterfaceC67352kd<? super C4FQ> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c4fd;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LJFF(null, this);
    }
}
