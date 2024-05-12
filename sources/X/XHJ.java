package X;

import fjb.a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.LinkedBlockingQueue;

@InterfaceC65848Psq(c = "com.bytedance.mota.queue.PQSupervisor$PendingQueue$enqueueOp$1", f = "PQSupervisor.kt", l = {223, 235, 148, 153}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class XHJ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC64672gJ<? super XGX<Object>>, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ XGS LJLJJI;
    public final /* synthetic */ XHM LJLJJL;
    public final /* synthetic */ XGZ LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XHJ(XGS xgs, XHM xhm, XGZ xgz, InterfaceC67352kd<? super XHJ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = xgs;
        this.LJLJJL = xhm;
        this.LJLJJLL = xgz;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        XHJ xhj = new XHJ(this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
        xhj.LJLJI = obj;
        return xhj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC64672gJ<? super XGX<Object>> interfaceC64672gJ, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC64672gJ, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC64672gJ interfaceC64672gJ;
        C76800UCe c76800UCe;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        try {
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            if (e instanceof CancellationException) {
                XHM xhm = this.LJLJJL;
                this.LJLJI = null;
                this.LJLIL = null;
                this.LJLILLLLZI = 4;
                if (xhm.LIZIZ(this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            } else {
                throw e;
            }
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    if (i == 4) {
                        C141335gf.LIZJ(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    C141335gf.LIZJ(obj);
                }
                return C76800UCe.LIZ;
            }
            interfaceC64672gJ = (InterfaceC64672gJ) this.LJLJI;
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            interfaceC64672gJ = (InterfaceC64672gJ) this.LJLJI;
            XHM xhm2 = this.LJLJJL;
            XGS xgs = this.LJLJJI;
            XGZ xgz = this.LJLJJLL;
            this.LJLJI = interfaceC64672gJ;
            this.LJLIL = xhm2;
            this.LJLILLLLZI = 1;
            XKS xks = new XKS(1, C78555UsJ.LJJII(this));
            xks.LJIIL();
            LinkedBlockingQueue<XHN> linkedBlockingQueue = xhm2.LIZJ;
            XH5.LIZ.getClass();
            linkedBlockingQueue.put(new XHN(xgs, xks, xgz));
            if (!xhm2.LIZIZ) {
                try {
                    XKS xks2 = xhm2.LIZLLL;
                    if (xks2 != null && (!xks2.isCompleted())) {
                        c76800UCe = C76800UCe.LIZ;
                        C3C5.m7constructorimpl(c76800UCe);
                        xks2.resumeWith(c76800UCe);
                    } else {
                        c76800UCe = null;
                    }
                    C3C5.m7constructorimpl(c76800UCe);
                } catch (Throwable th) {
                    C3C5.m7constructorimpl(C141335gf.LIZ(th));
                }
            }
            obj = xks.LJIIJJI();
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        XHN xhn = (XHN) obj;
        XGY xgy = new XGY(this.LJLJJI);
        if (xhn.LIZLLL == VLM.Running) {
            XGZ xgz2 = this.LJLJJLL;
            XHM xhm3 = this.LJLJJL;
            InterfaceC65462ha LIZ = xgz2.LIZ(xhn.LIZ);
            XHK xhk = new XHK(xhm3, xhn, interfaceC64672gJ, xgy);
            this.LJLJI = interfaceC64672gJ;
            this.LJLIL = xgy;
            this.LJLILLLLZI = 2;
            if (LIZ.collect(xhk, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        } else {
            xgy.LIZJ = new C84554XGk();
            XGX LIZ2 = xgy.LIZ();
            this.LJLJI = xgy;
            this.LJLIL = null;
            this.LJLILLLLZI = 3;
            if (interfaceC64672gJ.emit(LIZ2, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }
}
