package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.StickerStoreHelper", f = "StickerStoreHelper.kt", l = {307, 311, 319}, m = "removeFavSticker")
/* renamed from: X.3eG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C88883eG extends C3CS {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C88873eF LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C88883eG(C88873eF c88873eF, InterfaceC67352kd<? super C88883eG> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c88873eF;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LJFF(null, null, null, null, this);
    }
}
