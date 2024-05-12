package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.nows.cache.NowCacheDelegate$onDeleteNow$1", f = "NowCacheDelegate.kt", l = {63, 65}, m = "invokeSuspend")
/* renamed from: X.7ky, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C194967ky extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C194967ky(String str, InterfaceC67352kd<? super C194967ky> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C194967ky(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            String str = this.LJLILLLLZI;
            this.LJLIL = 1;
            Object LJI = XKX.LJI(VFJ.LIZIZ, new C195017l3(str, null), this);
            if (LJI != obj2) {
                LJI = C76800UCe.LIZ;
            }
            if (LJI == obj2) {
                return obj2;
            }
        }
        String str2 = this.LJLILLLLZI;
        this.LJLIL = 2;
        Object LJI2 = XKX.LJI(C78613UtF.LIZJ, new C81669W3l(str2, null), this);
        if (LJI2 != obj2) {
            LJI2 = C76800UCe.LIZ;
        }
        if (LJI2 == obj2) {
            return obj2;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
