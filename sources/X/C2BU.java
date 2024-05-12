package X;

import fjb.a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "androidx.compose.animation.core.MutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", l = {171, 119}, m = "invokeSuspend")
/* renamed from: X.2BU, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2BU extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<Object>, Object> {
    public InterfaceC75422xe LJLIL;
    public Object LJLILLLLZI;
    public C0Q8 LJLJI;
    public int LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ C0Q6 LJLJJLL;
    public final /* synthetic */ C0Q8 LJLJL;
    public final /* synthetic */ InterfaceC88472Yns<InterfaceC67352kd<Object>, Object> LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2BU(C0Q6 c0q6, C0Q8 c0q8, InterfaceC88472Yns<? super InterfaceC67352kd<Object>, ? extends Object> interfaceC88472Yns, InterfaceC67352kd<? super C2BU> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJLL = c0q6;
        this.LJLJL = c0q8;
        this.LJLJLJ = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C2BU c2bu = new C2BU(this.LJLJJLL, this.LJLJL, this.LJLJLJ, interfaceC67352kd);
        c2bu.LJLJJL = obj;
        return c2bu;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00d4: INVOKE (r5 I:X.2xe), (r3 I:java.lang.Object) INTERFACE call: X.2xe.LIZIZ(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:16777428), block:B:72:0x00d4 */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC75422xe LIZIZ;
        C0Q7 c0q7;
        boolean z;
        C0Q8 c0q8;
        InterfaceC75422xe interfaceC75422xe;
        InterfaceC88472Yns<InterfaceC67352kd<Object>, Object> interfaceC88472Yns;
        boolean z2;
        Object obj2;
        AtomicReference<C0Q7> atomicReference;
        Object obj3;
        AtomicReference<C0Q7> atomicReference2;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLJJI;
        try {
            try {
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            c0q8 = (C0Q8) this.LJLILLLLZI;
                            interfaceC75422xe = this.LJLIL;
                            obj2 = this.LJLJJL;
                            try {
                                C141335gf.LIZJ(obj);
                                obj3 = obj2;
                                atomicReference2 = c0q8.LIZ;
                                while (!atomicReference2.compareAndSet(obj3, null) && atomicReference2.get() == obj3) {
                                }
                                interfaceC75422xe.LIZIZ(null);
                                return obj;
                            } catch (Throwable th) {
                                th = th;
                                atomicReference = c0q8.LIZ;
                                while (!atomicReference.compareAndSet(obj2, null)) {
                                }
                                throw th;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0q8 = this.LJLJI;
                    interfaceC88472Yns = (InterfaceC88472Yns) this.LJLILLLLZI;
                    interfaceC75422xe = this.LJLIL;
                    Object obj4 = this.LJLJJL;
                    C141335gf.LIZJ(obj);
                    obj2 = obj4;
                } else {
                    C141335gf.LIZJ(obj);
                    InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLJJL;
                    C0Q6 c0q6 = this.LJLJJLL;
                    MBD mbd = interfaceC70422pa.getCoroutineContext().get(InterfaceC79150V4o.LJJJJJ);
                    o.LJI(mbd);
                    C0Q7 c0q72 = new C0Q7(c0q6, (InterfaceC79150V4o) mbd);
                    C0Q8 c0q82 = this.LJLJL;
                    do {
                        c0q7 = c0q82.LIZ.get();
                        z = false;
                        if (c0q7 != null) {
                            if (c0q72.LIZ.compareTo(c0q7.LIZ) >= 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!z2) {
                                throw new CancellationException("Current mutation had a higher priority");
                            }
                        }
                        AtomicReference<C0Q7> atomicReference3 = c0q82.LIZ;
                        while (true) {
                            if (atomicReference3.compareAndSet(c0q7, c0q72)) {
                                z = true;
                                break;
                            }
                            if (atomicReference3.get() != c0q7) {
                                break;
                            }
                        }
                    } while (!z);
                    if (c0q7 != null) {
                        c0q7.LIZIZ.LIZIZ(null);
                    }
                    c0q8 = this.LJLJL;
                    interfaceC75422xe = c0q8.LIZIZ;
                    interfaceC88472Yns = this.LJLJLJ;
                    this.LJLJJL = c0q72;
                    this.LJLIL = interfaceC75422xe;
                    this.LJLILLLLZI = interfaceC88472Yns;
                    this.LJLJI = c0q8;
                    this.LJLJJI = 1;
                    obj2 = c0q72;
                    if (interfaceC75422xe.LIZ(null, this) == enumC58928NAu) {
                        return enumC58928NAu;
                    }
                }
                this.LJLJJL = obj2;
                this.LJLIL = interfaceC75422xe;
                this.LJLILLLLZI = c0q8;
                this.LJLJI = null;
                this.LJLJJI = 2;
                obj = interfaceC88472Yns.invoke(this);
                obj3 = obj2;
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
                atomicReference2 = c0q8.LIZ;
                while (!atomicReference2.compareAndSet(obj3, null)) {
                }
                interfaceC75422xe.LIZIZ(null);
                return obj;
            } catch (Throwable th2) {
                th = th2;
                atomicReference = c0q8.LIZ;
                while (!atomicReference.compareAndSet(obj2, null) && atomicReference.get() == obj2) {
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
