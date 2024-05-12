package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.stickerset.viewmodel.StickerSetContentViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.stickerset.viewmodel.StickerSetContentViewModel", f = "StickerSetContentViewModel.kt", l = {219}, m = "editToBrowseJob")
/* renamed from: X.2sa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72282sa extends C3CS {
    public StickerSetContentViewModel LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ StickerSetContentViewModel LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72282sa(StickerSetContentViewModel stickerSetContentViewModel, InterfaceC67352kd<? super C72282sa> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = stickerSetContentViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.jv0(this);
    }
}
