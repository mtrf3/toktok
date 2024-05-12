package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.viewmodel.MusicDspSheetViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.music.app.auth.addtodsp.viewmodel.MusicDspSheetViewModel", f = "MusicDspSheetViewModel.kt", l = {107}, m = "loadPlatformList")
/* renamed from: X.aj6, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94568aj6 extends C3CS {
    public Object LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ MusicDspSheetViewModel LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94568aj6(MusicDspSheetViewModel musicDspSheetViewModel, InterfaceC67352kd<? super C94568aj6> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = musicDspSheetViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.hv0(this);
    }
}
