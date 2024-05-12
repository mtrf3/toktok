package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.videoselection.viewmodel.VideoSelectionViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.videoselection.viewmodel.VideoSelectionViewModel", f = "VideoSelectionViewModel.kt", l = {68}, m = "fetchLikedVideoList")
/* renamed from: X.3ax, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86833ax extends C3CS {
    public VideoSelectionViewModel LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ VideoSelectionViewModel LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86833ax(VideoSelectionViewModel videoSelectionViewModel, InterfaceC67352kd<? super C86833ax> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = videoSelectionViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.hv0(0L, 0L, 0L, this);
    }
}
