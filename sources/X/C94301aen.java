package X;

import com.ss.android.ugc.aweme.music.model.DspPlatform;

/* renamed from: X.aen, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94301aen implements InterfaceC64672gJ<XGX<C94496ahw>> {
    public final /* synthetic */ EnumC93896aYG LJLIL;
    public final /* synthetic */ DspPlatform LJLILLLLZI;
    public final /* synthetic */ InterfaceC65784Pro LJLJI;
    public final /* synthetic */ InterfaceC88472Yns LJLJJI;

    @Override // X.InterfaceC64672gJ
    public final Object emit(XGX<C94496ahw> xgx, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        Object LJI = XKX.LJI(C36636EZk.LIZ, new C94871anz(xgx, this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, null), interfaceC67352kd);
        if (LJI == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LJI;
        }
        return C76800UCe.LIZ;
    }

    public C94301aen(EnumC93896aYG enumC93896aYG, DspPlatform dspPlatform, InterfaceC65784Pro interfaceC65784Pro, InterfaceC88472Yns interfaceC88472Yns) {
        this.LJLIL = enumC93896aYG;
        this.LJLILLLLZI = dspPlatform;
        this.LJLJI = interfaceC65784Pro;
        this.LJLJJI = interfaceC88472Yns;
    }
}
