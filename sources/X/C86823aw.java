package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.setdetail.viewmodel.StickerSetDetailViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.setdetail.viewmodel.StickerSetDetailViewModel", f = "StickerSetDetailViewModel.kt", l = {58}, m = "onRefresh")
/* renamed from: X.3aw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86823aw extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ StickerSetDetailViewModel LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86823aw(StickerSetDetailViewModel stickerSetDetailViewModel, InterfaceC67352kd<? super C86823aw> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = stickerSetDetailViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.onRefresh(this);
    }
}
