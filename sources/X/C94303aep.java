package X;

import com.ss.android.ugc.aweme.music.model.DspPlatform;

/* renamed from: X.aep, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94303aep implements InterfaceC64672gJ<XGX<C94494ahu>> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ DspPlatform LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    @Override // X.InterfaceC64672gJ
    public final Object emit(XGX<C94494ahu> xgx, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        Object LJI = XKX.LJI(C36636EZk.LIZ, new C94882aoA(xgx, this.LJLIL, this.LJLILLLLZI, this.LJLJI, null), interfaceC67352kd);
        if (LJI == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LJI;
        }
        return C76800UCe.LIZ;
    }

    public C94303aep(String str, DspPlatform dspPlatform, boolean z) {
        this.LJLIL = str;
        this.LJLILLLLZI = dspPlatform;
        this.LJLJI = z;
    }
}
