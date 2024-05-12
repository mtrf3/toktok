package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.video2sticker.topbar.Video2StickerTopBarComponent", f = "Video2StickerTopBarComponent.kt", l = {147}, m = "nextBeforeCheckStatus")
/* renamed from: X.5lP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C144275lP extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C144245lM LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C144275lP(C144245lM c144245lM, InterfaceC67352kd<? super C144275lP> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c144245lM;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LLILZIL(this);
    }
}
