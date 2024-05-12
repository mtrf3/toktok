package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.poi.map.GoogleMapFeatureInstaller$tryInstallPoiMap$1", f = "GoogleMapFeatureInstaller.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.8Tb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C211838Tb extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ EnumC217558gJ LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C211838Tb(boolean z, EnumC217558gJ enumC217558gJ, String str, String str2, String str3, InterfaceC67352kd<? super C211838Tb> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = z;
        this.LJLILLLLZI = enumC217558gJ;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = str3;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C211838Tb(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        F6B.LIZIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
