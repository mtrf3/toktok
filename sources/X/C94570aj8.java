package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.viewmodel.MusicDspSheetViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.music.app.auth.addtodsp.viewmodel.MusicDspSheetViewModel", f = "MusicDspSheetViewModel.kt", l = {189}, m = "requestPlaylists")
/* renamed from: X.aj8, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94570aj8 extends C3CS {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public C68322mC LJLJI;
    public C34K LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ MusicDspSheetViewModel LJLJJLL;
    public int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94570aj8(MusicDspSheetViewModel musicDspSheetViewModel, InterfaceC67352kd<? super C94570aj8> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJLL = musicDspSheetViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJLL.jv0(null, this);
    }
}
