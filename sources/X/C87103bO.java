package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.videosticker.viewmodel.VideoStickerContentViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.videosticker.viewmodel.VideoStickerContentViewModel", f = "VideoStickerContentViewModel.kt", l = {202, 212}, m = "fetchVideoStickerListInProfile")
/* renamed from: X.3bO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87103bO extends C3CS {
    public Object LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ VideoStickerContentViewModel LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C87103bO(VideoStickerContentViewModel videoStickerContentViewModel, InterfaceC67352kd<? super C87103bO> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = videoStickerContentViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.jv0(null, 0L, 0L, this);
    }
}
