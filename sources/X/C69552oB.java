package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.storage.sync.StorageSyncer$init$2", f = "StorageSyncer.kt", l = {60}, m = "invokeSuspend")
/* renamed from: X.2oB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69552oB extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69552oB(String str, InterfaceC67352kd<? super C69552oB> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C69552oB(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C79863Bm c79863Bm = C69582oE.LJLJI;
            final String str = this.LJLILLLLZI;
            InterfaceC64672gJ<String> interfaceC64672gJ = new InterfaceC64672gJ<String>() { // from class: X.2oC
                @Override // X.InterfaceC64672gJ
                public final Object emit(String str2, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
                    String str3 = str2;
                    if (!o.LJ(str3, str) && !o.LJ(str3, CardStruct.IStatusCode.DEFAULT)) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("new user login: ");
                        LIZ.append(str3);
                        LIZ.append(", trigger update");
                        C69542oA.LIZIZ("Syncer", X1D.LIZIZ(LIZ));
                        Object LIZIZ = C69622oI.LIZ.LIZIZ(str3, false, interfaceC67352kd);
                        if (LIZIZ == EnumC58928NAu.COROUTINE_SUSPENDED) {
                            return LIZIZ;
                        }
                    }
                    return C76800UCe.LIZ;
                }
            };
            this.LJLIL = 1;
            if (c79863Bm.collect(interfaceC64672gJ, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
