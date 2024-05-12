package X;

import com.bytedance.android.live.effect.music.BGMSongListViewModel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.music.BGMSongListViewModel", f = "BGMSongListViewModel.kt", l = {111, LiveTryModeCountDownThresholdSetting.DEFAULT}, m = "getFirstTrendingSong")
/* renamed from: X.1th, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47491th extends C3CS {
    public BGMSongListViewModel LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ BGMSongListViewModel LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47491th(BGMSongListViewModel bGMSongListViewModel, InterfaceC67352kd<? super C47491th> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = bGMSongListViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.iv0(this);
    }
}
