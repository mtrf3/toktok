package X;

import kotlin.jvm.internal.AqS195S0100000_13;

/* renamed from: X.Ua7, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77427Ua7<T> extends C3CS implements InterfaceC64672gJ<T> {
    public MBA LJLIL;
    public InterfaceC67352kd<? super C76800UCe> LJLILLLLZI;
    public final MBA collectContext;
    public final int collectContextSize;
    public final InterfaceC64672gJ<T> collector;

    @Override // fjb.a
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // fjb.a, X.XLE
    public XLE getCallerFrame() {
        InterfaceC67352kd<? super C76800UCe> interfaceC67352kd = this.LJLILLLLZI;
        if (interfaceC67352kd instanceof XLE) {
            return (XLE) interfaceC67352kd;
        }
        return null;
    }

    @Override // X.C3CS, fjb.a, X.InterfaceC67352kd
    public MBA getContext() {
        MBA context;
        InterfaceC67352kd<? super C76800UCe> interfaceC67352kd = this.LJLILLLLZI;
        if (interfaceC67352kd == null || (context = interfaceC67352kd.getContext()) == null) {
            return MBB.INSTANCE;
        }
        return context;
    }

    @Override // X.C3CS, fjb.a
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }

    @Override // fjb.a
    public Object invokeSuspend(Object obj) {
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(obj);
        if (m10exceptionOrNullimpl != null) {
            this.LJLIL = new MB8(m10exceptionOrNullimpl);
        }
        InterfaceC67352kd<? super C76800UCe> interfaceC67352kd = this.LJLILLLLZI;
        if (interfaceC67352kd != null) {
            interfaceC67352kd.resumeWith(obj);
        }
        return EnumC58928NAu.COROUTINE_SUSPENDED;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C77427Ua7(InterfaceC64672gJ<? super T> interfaceC64672gJ, MBA mba) {
        super(C77428Ua8.LJLIL, MBB.INSTANCE);
        this.collector = interfaceC64672gJ;
        this.collectContext = mba;
        this.collectContextSize = ((Number) mba.fold(0, UX2.LJLIL)).intValue();
    }

    public final Object LJ(InterfaceC67352kd<? super C76800UCe> interfaceC67352kd, T t) {
        MBA context = interfaceC67352kd.getContext();
        C79146V4k.LJJIIJ(context);
        MBA mba = this.LJLIL;
        if (mba != context) {
            if (!(mba instanceof MB8)) {
                if (((Number) context.fold(0, new AqS195S0100000_13(this, (C77427Ua7<?>) 0))).intValue() == this.collectContextSize) {
                    this.LJLIL = context;
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Flow invariant is violated:\n\t\tFlow was collected in ");
                    LIZ.append(this.collectContext);
                    LIZ.append(",\n\t\tbut emission happened in ");
                    LIZ.append(context);
                    LIZ.append(".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead");
                    String LIZIZ = X1D.LIZIZ(LIZ);
                    LIZIZ.toString();
                    throw new IllegalStateException(LIZIZ);
                }
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception ");
                LIZ2.append(((MB8) mba).LJLIL);
                LIZ2.append(", but then emission attempt of value '");
                LIZ2.append(t);
                LIZ2.append("' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
                String LJJIJIIJI = C38346F3e.LJJIJIIJI(X1D.LIZIZ(LIZ2));
                LJJIJIIJI.toString();
                throw new IllegalStateException(LJJIJIIJI);
            }
        }
        this.LJLILLLLZI = interfaceC67352kd;
        return C77429Ua9.LIZ.invoke(this.collector, t, this);
    }

    @Override // X.InterfaceC64672gJ
    public Object emit(T t, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        try {
            Object LJ = LJ(interfaceC67352kd, t);
            if (LJ == EnumC58928NAu.COROUTINE_SUSPENDED) {
                return LJ;
            }
            return C76800UCe.LIZ;
        } catch (Throwable th) {
            this.LJLIL = new MB8(th);
            throw th;
        }
    }
}
