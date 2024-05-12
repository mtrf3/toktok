package X;

import fjb.a;
import java.util.ArrayList;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.feed.landscape.repos.LandscapeFeedRepo$operator$1$getVideoList$2", f = "LandscapeFeedRepo.kt", l = {17, 18}, m = "invokeSuspend")
/* renamed from: X.2gn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64972gn extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC64672gJ<? super C64992gp>, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64972gn(long j, InterfaceC67352kd<? super C64972gn> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = j;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C64972gn c64972gn = new C64972gn(this.LJLJI, interfaceC67352kd);
        c64972gn.LJLILLLLZI = obj;
        return c64972gn;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC64672gJ interfaceC64672gJ;
        List subList;
        C64992gp c64992gp;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        boolean z = true;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC64672gJ = (InterfaceC64672gJ) this.LJLILLLLZI;
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            interfaceC64672gJ = (InterfaceC64672gJ) this.LJLILLLLZI;
            this.LJLILLLLZI = interfaceC64672gJ;
            this.LJLIL = 1;
            if (C1JD.LIZJ(2000L, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        long j = this.LJLJI;
        long j2 = C64982go.LIZ;
        ArrayList arrayList = (ArrayList) C64982go.LIZIZ;
        if (j2 >= arrayList.size()) {
            c64992gp = new C64992gp(new ArrayList(), false);
        } else {
            if (j < arrayList.size()) {
                subList = arrayList.subList((int) C64982go.LIZ, (int) j);
            } else {
                subList = arrayList.subList((int) C64982go.LIZ, arrayList.size());
            }
            if (j >= arrayList.size()) {
                z = false;
            }
            C64982go.LIZ = j;
            c64992gp = new C64992gp(subList, z);
        }
        this.LJLILLLLZI = null;
        this.LJLIL = 2;
        if (interfaceC64672gJ.emit(c64992gp, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC64672gJ<? super C64992gp> interfaceC64672gJ, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC64672gJ, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
