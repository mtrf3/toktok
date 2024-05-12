package X;

import fjb.a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "androidx.compose.foundation.MutatorMutex$mutateWith$2", f = "MutatorMutex.kt", l = {173, 160}, m = "invokeSuspend")
/* renamed from: X.2CI, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2CI extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<Object>, Object> {
    public InterfaceC75422xe LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public C0SJ LJLJJI;
    public int LJLJJL;
    public /* synthetic */ Object LJLJJLL;
    public final /* synthetic */ C0SF LJLJL;
    public final /* synthetic */ C0SJ LJLJLJ;
    public final /* synthetic */ InterfaceC88471Ynr<Object, InterfaceC67352kd<Object>, Object> LJLJLLL;
    public final /* synthetic */ Object LJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2CI(C0SF c0sf, C0SJ c0sj, InterfaceC88471Ynr<Object, ? super InterfaceC67352kd<Object>, ? extends Object> interfaceC88471Ynr, Object obj, InterfaceC67352kd<? super C2CI> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJL = c0sf;
        this.LJLJLJ = c0sj;
        this.LJLJLLL = interfaceC88471Ynr;
        this.LJLL = obj;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C2CI c2ci = new C2CI(this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL, interfaceC67352kd);
        c2ci.LJLJJLL = obj;
        return c2ci;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00db: INVOKE (r5 I:X.2xe), (r3 I:java.lang.Object) INTERFACE call: X.2xe.LIZIZ(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:16777435), block:B:72:0x00db */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC75422xe LIZIZ;
        C0SI c0si;
        boolean z;
        C0SJ c0sj;
        InterfaceC75422xe interfaceC75422xe;
        InterfaceC88471Ynr<Object, InterfaceC67352kd<Object>, Object> interfaceC88471Ynr;
        Object obj2;
        boolean z2;
        Object obj3;
        AtomicReference<C0SI> atomicReference;
        Object obj4;
        AtomicReference<C0SI> atomicReference2;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLJJL;
        try {
            try {
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            c0sj = (C0SJ) this.LJLILLLLZI;
                            interfaceC75422xe = this.LJLIL;
                            obj3 = this.LJLJJLL;
                            try {
                                C141335gf.LIZJ(obj);
                                obj4 = obj3;
                                atomicReference2 = c0sj.LIZ;
                                while (!atomicReference2.compareAndSet(obj4, null) && atomicReference2.get() == obj4) {
                                }
                                interfaceC75422xe.LIZIZ(null);
                                return obj;
                            } catch (Throwable th) {
                                th = th;
                                atomicReference = c0sj.LIZ;
                                while (!atomicReference.compareAndSet(obj3, null)) {
                                }
                                throw th;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0sj = this.LJLJJI;
                    obj2 = this.LJLJI;
                    interfaceC88471Ynr = (InterfaceC88471Ynr) this.LJLILLLLZI;
                    interfaceC75422xe = this.LJLIL;
                    Object obj5 = this.LJLJJLL;
                    C141335gf.LIZJ(obj);
                    obj3 = obj5;
                } else {
                    C141335gf.LIZJ(obj);
                    InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLJJLL;
                    C0SF c0sf = this.LJLJL;
                    MBD mbd = interfaceC70422pa.getCoroutineContext().get(InterfaceC79150V4o.LJJJJJ);
                    o.LJI(mbd);
                    C0SI c0si2 = new C0SI(c0sf, (InterfaceC79150V4o) mbd);
                    C0SJ c0sj2 = this.LJLJLJ;
                    do {
                        c0si = c0sj2.LIZ.get();
                        z = false;
                        if (c0si != null) {
                            if (c0si2.LIZ.compareTo(c0si.LIZ) >= 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!z2) {
                                throw new CancellationException("Current mutation had a higher priority");
                            }
                        }
                        AtomicReference<C0SI> atomicReference3 = c0sj2.LIZ;
                        while (true) {
                            if (atomicReference3.compareAndSet(c0si, c0si2)) {
                                z = true;
                                break;
                            }
                            if (atomicReference3.get() != c0si) {
                                break;
                            }
                        }
                    } while (!z);
                    if (c0si != null) {
                        c0si.LIZIZ.LIZIZ(null);
                    }
                    c0sj = this.LJLJLJ;
                    interfaceC75422xe = c0sj.LIZIZ;
                    interfaceC88471Ynr = this.LJLJLLL;
                    obj2 = this.LJLL;
                    this.LJLJJLL = c0si2;
                    this.LJLIL = interfaceC75422xe;
                    this.LJLILLLLZI = interfaceC88471Ynr;
                    this.LJLJI = obj2;
                    this.LJLJJI = c0sj;
                    this.LJLJJL = 1;
                    obj3 = c0si2;
                    if (interfaceC75422xe.LIZ(null, this) == enumC58928NAu) {
                        return enumC58928NAu;
                    }
                }
                this.LJLJJLL = obj3;
                this.LJLIL = interfaceC75422xe;
                this.LJLILLLLZI = c0sj;
                this.LJLJI = null;
                this.LJLJJI = null;
                this.LJLJJL = 2;
                obj = interfaceC88471Ynr.invoke(obj2, this);
                obj4 = obj3;
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
                atomicReference2 = c0sj.LIZ;
                while (!atomicReference2.compareAndSet(obj4, null)) {
                }
                interfaceC75422xe.LIZIZ(null);
                return obj;
            } catch (Throwable th2) {
                th = th2;
                atomicReference = c0sj.LIZ;
                while (!atomicReference.compareAndSet(obj3, null) && atomicReference.get() == obj3) {
                }
                throw th;
            }
        } catch (Throwable th3) {
            LIZIZ.LIZIZ(null);
            throw th3;
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<Object> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
