package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.videoselection.viewmodel.VideoSelectionViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.videoselection.viewmodel.VideoSelectionViewModel", f = "VideoSelectionViewModel.kt", l = {87}, m = "fetchFavoriteVideoList")
/* renamed from: X.3az, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86853az extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ VideoSelectionViewModel LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86853az(VideoSelectionViewModel videoSelectionViewModel, InterfaceC67352kd<? super C86853az> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = videoSelectionViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.gv0(0L, 0L, this);
    }
}
