package X;

import com.bytedance.android.live.effect.music.BGMPlaylistViewModel;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.music.BGMPlaylistViewModel", f = "BGMPlaylistViewModel.kt", l = {177, 178, 180}, m = "loadBottom")
/* renamed from: X.1tZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47411tZ extends C3CS {
    public BGMPlaylistViewModel LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ BGMPlaylistViewModel LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47411tZ(BGMPlaylistViewModel bGMPlaylistViewModel, InterfaceC67352kd<? super C47411tZ> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = bGMPlaylistViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.kv0(this);
    }
}
