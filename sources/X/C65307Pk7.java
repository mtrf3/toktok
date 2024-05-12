package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.walletnew.ui.LocationService$Companion$requestLocationData$1", f = "LocationService.kt", l = {111}, m = "invokeSuspend")
/* renamed from: X.Pk7, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65307Pk7 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ java.net.URL LJLILLLLZI;
    public final /* synthetic */ InterfaceC65309Pk9 LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65307Pk7(java.net.URL url, InterfaceC65309Pk9 interfaceC65309Pk9, InterfaceC67352kd<? super C65307Pk7> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = url;
        this.LJLJI = interfaceC65309Pk9;
    }

    public static C64598PWw LJ(C64587PWl c64587PWl) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400102, "okhttp3/Call", "execute", c64587PWl, new Object[0], "okhttp3.Response", new C65300Pk0(false, "()Lokhttp3/Response;", "-2858152198705165474"));
        return LIZJ.LIZ ? (C64598PWw) LIZJ.LIZIZ : c64587PWl.execute();
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C65307Pk7(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                C64600PWy c64600PWy = new C64600PWy();
                C64618PXq c64618PXq = new C64618PXq();
                java.net.URL url = this.LJLILLLLZI;
                if (url != null) {
                    c64618PXq.LJIIIIZZ(C64626PXy.LJIIIZ(url.toString()));
                    c64618PXq.LIZJ.LIZ("Connection", "Keep-Alive");
                    C64598PWw LJ = LJ(C64587PWl.LIZJ(c64600PWy, c64618PXq.LIZIZ(), false));
                    PVM pvm = LJ.LJLJL;
                    if (pvm != null) {
                        String string = pvm.string();
                        if (string == null) {
                            string = "";
                        }
                        LJ.close();
                        AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
                        C65308Pk8 c65308Pk8 = new C65308Pk8(this.LJLJI, string, null);
                        this.LJLIL = 1;
                        if (XKX.LJI(abstractC78621UtN, c65308Pk8, this) == enumC58928NAu) {
                            return enumC58928NAu;
                        }
                    } else {
                        this.LJLJI.LIZIZ("Internal Error");
                        return C76800UCe.LIZ;
                    }
                } else {
                    throw new NullPointerException("url == null");
                }
            }
            return C76800UCe.LIZ;
        } catch (Error unused) {
            this.LJLJI.LIZIZ("Internet Error");
            return C76800UCe.LIZ;
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
