package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.notification.viewmodel.VideoStickerNotificationUserViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.notification.viewmodel.VideoStickerNotificationUserViewModel", f = "VideoStickerNotificationUserViewModel.kt", l = {38}, m = "fetchVideoStickerNotificationList")
/* renamed from: X.3bb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87233bb extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ VideoStickerNotificationUserViewModel LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C87233bb(VideoStickerNotificationUserViewModel videoStickerNotificationUserViewModel, InterfaceC67352kd<? super C87233bb> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = videoStickerNotificationUserViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.gv0(0, 0L, 0L, this);
    }
}
