package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.music.model.DspPlatform;

/* renamed from: X.aei, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94296aei implements InterfaceC64672gJ<XGX<C94476ahc>> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ DspPlatform LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ InterfaceC65784Pro LJLJJI;
    public final /* synthetic */ Activity LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ InterfaceC65784Pro LJLJL;

    @Override // X.InterfaceC64672gJ
    public final Object emit(XGX<C94476ahc> xgx, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        Object LJI = XKX.LJI(C36636EZk.LIZ, new C94860ano(xgx, this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, null), interfaceC67352kd);
        if (LJI == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LJI;
        }
        return C76800UCe.LIZ;
    }

    public C94296aei(long j, DspPlatform dspPlatform, boolean z, InterfaceC65784Pro interfaceC65784Pro, Activity activity, String str, InterfaceC65784Pro interfaceC65784Pro2) {
        this.LJLIL = j;
        this.LJLILLLLZI = dspPlatform;
        this.LJLJI = z;
        this.LJLJJI = interfaceC65784Pro;
        this.LJLJJL = activity;
        this.LJLJJLL = str;
        this.LJLJL = interfaceC65784Pro2;
    }
}
