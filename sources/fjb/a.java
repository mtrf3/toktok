package fjb;

import X.C141335gf;
import X.C3C5;
import X.C65849Psr;
import X.C65850Pss;
import X.C72972SkS;
import X.C76800UCe;
import X.EnumC58928NAu;
import X.InterfaceC65848Psq;
import X.InterfaceC67352kd;
import X.MBA;
import X.X1D;
import X.XLE;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public abstract class a implements InterfaceC67352kd<Object>, XLE, Serializable {
    public final InterfaceC67352kd<Object> completion;

    @Override // X.InterfaceC67352kd
    public abstract /* synthetic */ MBA getContext();

    public abstract Object invokeSuspend(Object obj);

    public void releaseIntercepted() {
    }

    public XLE getCallerFrame() {
        InterfaceC67352kd<Object> interfaceC67352kd = this.completion;
        if (interfaceC67352kd instanceof XLE) {
            return (XLE) interfaceC67352kd;
        }
        return null;
    }

    public StackTraceElement getStackTraceElement() {
        int i;
        Object obj;
        Object obj2;
        Object obj3;
        String LIZIZ;
        Integer num;
        int i2;
        InterfaceC65848Psq interfaceC65848Psq = (InterfaceC65848Psq) getClass().getAnnotation(InterfaceC65848Psq.class);
        String str = null;
        if (interfaceC65848Psq == null) {
            return null;
        }
        int v = interfaceC65848Psq.v();
        if (v <= 1) {
            int i3 = -1;
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj4 = declaredField.get(this);
                if (obj4 instanceof Integer) {
                    num = (Integer) obj4;
                } else {
                    num = null;
                }
                if (num != null) {
                    i2 = num.intValue();
                } else {
                    i2 = 0;
                }
                i = i2 - 1;
            } catch (Exception unused) {
                i = -1;
            }
            if (i >= 0) {
                i3 = interfaceC65848Psq.l()[i];
            }
            C65849Psr c65849Psr = C65850Pss.LIZIZ;
            C65849Psr c65849Psr2 = C65850Pss.LIZ;
            if (c65849Psr == null) {
                try {
                    c65849Psr = new C65849Psr(Class.class.getDeclaredMethod("getModule", new Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
                    C65850Pss.LIZIZ = c65849Psr;
                } catch (Exception unused2) {
                    C65850Pss.LIZIZ = c65849Psr2;
                    c65849Psr = c65849Psr2;
                }
            }
            if (c65849Psr != c65849Psr2) {
                Method method = c65849Psr.LIZ;
                if (method != null) {
                    obj = method.invoke(getClass(), new Object[0]);
                } else {
                    obj = null;
                }
                if (obj != null) {
                    Method method2 = c65849Psr.LIZIZ;
                    if (method2 != null) {
                        obj2 = method2.invoke(obj, new Object[0]);
                    } else {
                        obj2 = null;
                    }
                    if (obj2 != null) {
                        Method method3 = c65849Psr.LIZJ;
                        if (method3 != null) {
                            obj3 = method3.invoke(obj2, new Object[0]);
                        } else {
                            obj3 = null;
                        }
                        if (obj3 instanceof String) {
                            str = (String) obj3;
                        }
                    }
                }
            }
            if (str == null) {
                LIZIZ = interfaceC65848Psq.c();
            } else {
                StringBuilder LJFF = C72972SkS.LJFF(str, '/');
                LJFF.append(interfaceC65848Psq.c());
                LIZIZ = X1D.LIZIZ(LJFF);
            }
            return new StackTraceElement(LIZIZ, interfaceC65848Psq.m(), interfaceC65848Psq.f(), i3);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Debug metadata version mismatch. Expected: ");
        LIZ.append(1);
        LIZ.append(", got ");
        LIZ.append(v);
        LIZ.append(". Please update the Kotlin standard library.");
        String LIZIZ2 = X1D.LIZIZ(LIZ);
        LIZIZ2.toString();
        throw new IllegalStateException(LIZIZ2);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        LIZ.append(stackTraceElement);
        return X1D.LIZIZ(LIZ);
    }

    public final InterfaceC67352kd<Object> getCompletion() {
        return this.completion;
    }

    public a(InterfaceC67352kd<Object> interfaceC67352kd) {
        this.completion = interfaceC67352kd;
    }

    public InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC67352kd
    public final void resumeWith(Object obj) {
        InterfaceC67352kd interfaceC67352kd = this;
        while (true) {
            a aVar = (a) interfaceC67352kd;
            InterfaceC67352kd interfaceC67352kd2 = aVar.completion;
            o.LJI(interfaceC67352kd2);
            try {
                obj = aVar.invokeSuspend(obj);
            } catch (Throwable th) {
                obj = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(obj);
            }
            if (obj != EnumC58928NAu.COROUTINE_SUSPENDED) {
                C3C5.m7constructorimpl(obj);
                aVar.releaseIntercepted();
                if (interfaceC67352kd2 instanceof a) {
                    interfaceC67352kd = interfaceC67352kd2;
                } else {
                    interfaceC67352kd2.resumeWith(obj);
                    return;
                }
            } else {
                return;
            }
        }
    }

    public InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
