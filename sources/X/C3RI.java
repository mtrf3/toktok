package X;

import android.os.SystemClock;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.relations.data.core.core.CombinedLoader$loadInternal$1", f = "CombinedLoader.kt", l = {89, 90}, m = "invokeSuspend")
/* renamed from: X.3RI, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3RI extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C3RZ<R> LJLJI;
    public final /* synthetic */ boolean LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3RI(C3RZ<R> c3rz, boolean z, InterfaceC67352kd<? super C3RI> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c3rz;
        this.LJLJJI = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C3RI c3ri = new C3RI(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c3ri.LJLILLLLZI = obj;
        return c3ri;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object LIZ;
        boolean z;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
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
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("start load list, ts: ");
            LIZ2.append(SystemClock.elapsedRealtime());
            C34B.LJI("LOAD_CONTACT_PROCESS", X1D.LIZIZ(LIZ2));
            C3RZ<R> c3rz = this.LJLJI;
            if (this.LJLJJI) {
                z = true;
            } else {
                z = false;
            }
            this.LJLIL = 1;
            obj = C3RZ.LJIIIIZZ(c3rz, z, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        LIZ = (List) obj;
        C3C5.m7constructorimpl(LIZ);
        AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
        C3RH c3rh = new C3RH(this.LJLJI, LIZ, this.LJLJJI, null);
        this.LJLIL = 2;
        if (XKX.LJI(abstractC78621UtN, c3rh, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
