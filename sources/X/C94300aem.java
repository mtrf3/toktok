package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.DspPlaylist;
import com.ss.android.ugc.aweme.music.model.DspPlatform;

/* renamed from: X.aem, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94300aem implements InterfaceC64672gJ<XGX<C94492ahs>> {
    public final /* synthetic */ DspPlatform LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ InterfaceC65784Pro LJLJJI;
    public final /* synthetic */ Activity LJLJJL;
    public final /* synthetic */ DspPlaylist LJLJJLL;
    public final /* synthetic */ InterfaceC65784Pro LJLJL;

    @Override // X.InterfaceC64672gJ
    public final Object emit(XGX<C94492ahs> xgx, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        Object LJI = XKX.LJI(C36636EZk.LIZ, new C94868anw(xgx, this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, null), interfaceC67352kd);
        if (LJI == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LJI;
        }
        return C76800UCe.LIZ;
    }

    public C94300aem(DspPlatform dspPlatform, boolean z, long j, InterfaceC65784Pro interfaceC65784Pro, Activity activity, DspPlaylist dspPlaylist, InterfaceC65784Pro interfaceC65784Pro2) {
        this.LJLIL = dspPlatform;
        this.LJLILLLLZI = z;
        this.LJLJI = j;
        this.LJLJJI = interfaceC65784Pro;
        this.LJLJJL = activity;
        this.LJLJJLL = dspPlaylist;
        this.LJLJL = interfaceC65784Pro2;
    }
}
