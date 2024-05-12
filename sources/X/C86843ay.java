package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.videoselection.viewmodel.VideoSelectionViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.videoselection.viewmodel.VideoSelectionViewModel", f = "VideoSelectionViewModel.kt", l = {105}, m = "fetchPostedVideoList")
/* renamed from: X.3ay, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86843ay extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ VideoSelectionViewModel LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86843ay(VideoSelectionViewModel videoSelectionViewModel, InterfaceC67352kd<? super C86843ay> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = videoSelectionViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.iv0(0L, 0L, this);
    }
}
