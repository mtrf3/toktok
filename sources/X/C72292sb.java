package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.stickerset.viewmodel.StickerSetContentViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.stickerset.viewmodel.StickerSetContentViewModel", f = "StickerSetContentViewModel.kt", l = {361}, m = "fetchStickerSetList")
/* renamed from: X.2sb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72292sb extends C3CS {
    public int LJLIL;
    public boolean LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ StickerSetContentViewModel LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72292sb(StickerSetContentViewModel stickerSetContentViewModel, InterfaceC67352kd<? super C72292sb> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = stickerSetContentViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.kv0(null, 0L, 0L, 0, false, this);
    }
}
