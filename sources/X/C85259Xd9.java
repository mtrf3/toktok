package X;

import com.bytedance.bpea.basics.Cert;
import com.ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl$fetchLocation$1$onSuccess$1", f = "LocationServiceImpl.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Xd9, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85259Xd9 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ LocationServiceImpl LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ Cert LJLJJI;
    public final /* synthetic */ Cert LJLJJL;
    public final /* synthetic */ InterfaceC56182M3e LJLJJLL;
    public final /* synthetic */ Long LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85259Xd9(LocationServiceImpl locationServiceImpl, String str, String str2, Cert cert, Cert cert2, InterfaceC56182M3e interfaceC56182M3e, Long l, InterfaceC67352kd<? super C85259Xd9> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = locationServiceImpl;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = cert;
        this.LJLJJL = cert2;
        this.LJLJJLL = interfaceC56182M3e;
        this.LJLJL = l;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C85259Xd9(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        LocationServiceImpl.LJIJJ().LJIILL();
        LocationServiceImpl locationServiceImpl = this.LJLIL;
        String str = this.LJLILLLLZI;
        String str2 = this.LJLJI;
        Cert cert = this.LJLJJI;
        Cert cert2 = this.LJLJJL;
        InterfaceC56182M3e interfaceC56182M3e = this.LJLJJLL;
        Long l = this.LJLJL;
        locationServiceImpl.getClass();
        LocationServiceImpl.LJIJJLI(str, str2, cert, cert2, interfaceC56182M3e, l);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
