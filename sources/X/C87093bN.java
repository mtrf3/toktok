package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.videosticker.viewmodel.VideoStickerContentViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.videosticker.viewmodel.VideoStickerContentViewModel", f = "VideoStickerContentViewModel.kt", l = {135}, m = "fetchVideoStickerList")
/* renamed from: X.3bN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87093bN extends C3CS {
    public VideoStickerContentViewModel LJLIL;
    public int LJLILLLLZI;
    public boolean LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ VideoStickerContentViewModel LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C87093bN(VideoStickerContentViewModel videoStickerContentViewModel, InterfaceC67352kd<? super C87093bN> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = videoStickerContentViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.hv0(0, 0L, 0L, false, this);
    }
}
