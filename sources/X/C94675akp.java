package X;

import Y.IDfS15S0300000_42;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.music.app.auth.addtodsp.AddToMusicDspAuthUtil$refreshAccessTokenAsync$$inlined$map$1$2", f = "AddToMusicDspAuthUtil.kt", l = {137, 136}, m = "emit")
/* renamed from: X.akp, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94675akp extends C3CS {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;
    public InterfaceC64672gJ LJLJI;
    public final /* synthetic */ IDfS15S0300000_42 LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94675akp(IDfS15S0300000_42 iDfS15S0300000_42, InterfaceC67352kd interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = iDfS15S0300000_42;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLILLLLZI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.emit(null, this);
    }
}
