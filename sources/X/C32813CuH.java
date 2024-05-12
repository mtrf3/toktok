package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.jvm.internal.AqS94S0300000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.CuH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32813CuH extends AbstractC32132CjI implements UVM {
    public final String LIZLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32813CuH(InterfaceC32124CjA requireRef) {
        super(requireRef);
        o.LJIIIZ(requireRef, "requireRef");
        this.LIZLLL = "SendGiftFailureExceptionHandler";
    }

    @Override // X.UVM
    public final Object LIZJ(C32816CuK c32816CuK, UV8 uv8, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        long j;
        if (!this.LIZJ) {
            C0NB.LJ(this.LIZLLL, "request handleFailure on invalid handler");
            return C76800UCe.LIZ;
        }
        if (uv8.LJLIL != UVH.EXCEPTION) {
            return C76800UCe.LIZ;
        }
        C32804Cu8 LJJII = V16.LJJII(c32816CuK);
        if (LJJII == null) {
            return C76800UCe.LIZ;
        }
        long j2 = LJJII.LIZIZ;
        Room LJIIIIZZ = LJIIIIZZ();
        if (LJIIIIZZ != null) {
            j = LJIIIIZZ.getId();
        } else {
            j = 0;
        }
        if (j2 != j) {
            C0NB.LJ(this.LIZLLL, "request not from this instance");
            return C76800UCe.LIZ;
        }
        Object obj = uv8.LJLILLLLZI;
        if (obj instanceof Throwable) {
            C0NB.LJI(this.LIZLLL, (Throwable) obj);
            Object LJJL = V16.LJJL(new AqS94S0300000_5(this, c32816CuK, uv8, 15), (C3CS) interfaceC67352kd);
            if (LJJL == EnumC58928NAu.COROUTINE_SUSPENDED) {
                return LJJL;
            }
            return C76800UCe.LIZ;
        }
        C0NB.LJ(this.LIZLLL, "no exception");
        return C76800UCe.LIZ;
    }
}
