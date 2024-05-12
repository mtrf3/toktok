package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.setdetail.viewmodel.StickerSetDetailViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.setdetail.viewmodel.StickerSetDetailViewModel", f = "StickerSetDetailViewModel.kt", l = {203}, m = "getData")
/* renamed from: X.3av, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86813av extends C3CS {
    public StickerSetDetailViewModel LJLIL;
    public Object LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ StickerSetDetailViewModel LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86813av(StickerSetDetailViewModel stickerSetDetailViewModel, InterfaceC67352kd<? super C86813av> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = stickerSetDetailViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.hv0(null, this);
    }
}
