package kotlinx.coroutines;

import X.AbstractC84652XKe;
import X.C16880lQ;
import X.C37308Eka;
import X.C37655EqB;
import X.C3C9;
import X.C65314PkE;
import X.C74185T9p;
import X.C76800UCe;
import X.C77433UaD;
import X.C78555UsJ;
import X.C79146V4k;
import X.C84629XJh;
import X.C84640XJs;
import X.C84649XKb;
import X.C84650XKc;
import X.C84656XKi;
import X.C84657XKj;
import X.C84659XKl;
import X.C84664XKq;
import X.C84665XKr;
import X.C84666XKs;
import X.C84667XKt;
import X.C84668XKu;
import X.EnumC58928NAu;
import X.InterfaceC1039145z;
import X.InterfaceC48698J9i;
import X.InterfaceC67352kd;
import X.InterfaceC77431UaB;
import X.InterfaceC79150V4o;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.MBA;
import X.MBC;
import X.MBD;
import X.MBE;
import X.T2N;
import X.T2O;
import X.T2P;
import X.V0N;
import X.V87;
import X.X1D;
import X.X9J;
import X.XJU;
import X.XKG;
import X.XKP;
import X.XKS;
import X.XL0;
import X.XL4;
import X.XL5;
import X.XL6;
import X.XL7;
import X.XL8;
import X.XL9;
import X.XLA;
import X.XLB;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class JobSupport implements InterfaceC79150V4o, XL8, XL9 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater LJLIL = AtomicReferenceFieldUpdater.newUpdater(JobSupport.class, Object.class, "_state");
    public volatile /* synthetic */ Object _parentHandle;
    public volatile /* synthetic */ Object _state;

    /* loaded from: classes16.dex */
    public static final class Finishing implements XL7 {
        public volatile /* synthetic */ Object _exceptionsHolder;
        public volatile /* synthetic */ int _isCompleting;
        public volatile /* synthetic */ Object _rootCause;
        public final XL4 list;

        private final ArrayList<Throwable> allocateList() {
            return new ArrayList<>(4);
        }

        public final Throwable getRootCause() {
            return (Throwable) this._rootCause;
        }

        @Override // X.XL7
        public boolean isActive() {
            if (getRootCause() == null) {
                return true;
            }
            return false;
        }

        public final boolean isCancelling() {
            if (getRootCause() != null) {
                return true;
            }
            return false;
        }

        public final boolean isSealed() {
            if (getExceptionsHolder() == C84667XKt.LJ) {
                return true;
            }
            return false;
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Finishing[cancelling=");
            LIZ.append(isCancelling());
            LIZ.append(", completing=");
            LIZ.append(isCompleting());
            LIZ.append(", rootCause=");
            LIZ.append(getRootCause());
            LIZ.append(", exceptions=");
            LIZ.append(getExceptionsHolder());
            LIZ.append(", list=");
            LIZ.append(getList());
            LIZ.append(']');
            return X1D.LIZIZ(LIZ);
        }

        private final Object getExceptionsHolder() {
            return this._exceptionsHolder;
        }

        @Override // X.XL7
        public XL4 getList() {
            return this.list;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
        public final boolean isCompleting() {
            return this._isCompleting;
        }

        private final void setExceptionsHolder(Object obj) {
            this._exceptionsHolder = obj;
        }

        public final void addExceptionLocked(Throwable th) {
            Throwable rootCause = getRootCause();
            if (rootCause == null) {
                setRootCause(th);
                return;
            }
            if (th == rootCause) {
                return;
            }
            Object exceptionsHolder = getExceptionsHolder();
            if (exceptionsHolder == null) {
                setExceptionsHolder(th);
                return;
            }
            if (exceptionsHolder instanceof Throwable) {
                if (th == exceptionsHolder) {
                    return;
                }
                ArrayList<Throwable> allocateList = allocateList();
                allocateList.add(exceptionsHolder);
                allocateList.add(th);
                setExceptionsHolder(allocateList);
                return;
            }
            if (exceptionsHolder instanceof ArrayList) {
                ((ArrayList) exceptionsHolder).add(th);
            } else {
                String LJIILLIIL = o.LJIILLIIL(exceptionsHolder, "State is ");
                LJIILLIIL.toString();
                throw new IllegalStateException(LJIILLIIL);
            }
        }

        public final List<Throwable> sealLocked(Throwable th) {
            ArrayList<Throwable> arrayList;
            Object exceptionsHolder = getExceptionsHolder();
            if (exceptionsHolder == null) {
                arrayList = allocateList();
            } else if (exceptionsHolder instanceof Throwable) {
                arrayList = allocateList();
                arrayList.add(exceptionsHolder);
            } else if (exceptionsHolder instanceof ArrayList) {
                arrayList = (ArrayList) exceptionsHolder;
            } else {
                String LJIILLIIL = o.LJIILLIIL(exceptionsHolder, "State is ");
                LJIILLIIL.toString();
                throw new IllegalStateException(LJIILLIIL);
            }
            Throwable rootCause = getRootCause();
            if (rootCause != null) {
                ListProtector.add(arrayList, 0, rootCause);
            }
            if (th != null && !o.LJ(th, rootCause)) {
                arrayList.add(th);
            }
            setExceptionsHolder(C84667XKt.LJ);
            return arrayList;
        }

        public final void setCompleting(boolean z) {
            this._isCompleting = z ? 1 : 0;
        }

        public final void setRootCause(Throwable th) {
            this._rootCause = th;
        }

        public Finishing(XL4 xl4, boolean z, Throwable th) {
            this.list = xl4;
            this._isCompleting = z ? 1 : 0;
            this._rootCause = th;
        }
    }

    public void LJJII(Object obj) {
    }

    public String LJJJ() {
        return "Job was cancelled";
    }

    public boolean LJJJJLL() {
        return true;
    }

    public boolean LJJJJZ() {
        return this instanceof C84657XKj;
    }

    public boolean LJJJLL(Throwable th) {
        return false;
    }

    public boolean LJJL() {
        return this instanceof XKP;
    }

    public void LJJLIIIJJIZ(Object obj) {
    }

    public void LJJLIIIJL() {
    }

    @Override // X.InterfaceC79150V4o
    public final InterfaceC1039145z<InterfaceC79150V4o> LIZ() {
        return new C37655EqB(new C84649XKb(null, this));
    }

    public final Object LJJJLIIL() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof XJU)) {
                return obj;
            }
            ((XJU) obj).LIZJ(this);
        }
    }

    @Override // X.InterfaceC79150V4o
    public final boolean LJIILL() {
        int LJJLIIJ;
        do {
            LJJLIIJ = LJJLIIJ(LJJJLIIL());
            if (LJJLIIJ == 0) {
                return false;
            }
        } while (LJJLIIJ != 1);
        return true;
    }

    @Override // X.InterfaceC79150V4o
    public final CancellationException LJJIIJ() {
        CancellationException cancellationException;
        CancellationException cancellationException2;
        Object LJJJLIIL = LJJJLIIL();
        if (LJJJLIIL instanceof Finishing) {
            Throwable rootCause = ((Finishing) LJJJLIIL).getRootCause();
            if (rootCause != null) {
                String LJIILLIIL = o.LJIILLIIL(" is cancelling", C16880lQ.LJLLJ(getClass()));
                if (!(rootCause instanceof CancellationException) || (cancellationException2 = (CancellationException) rootCause) == null) {
                    if (LJIILLIIL == null) {
                        LJIILLIIL = LJJJ();
                    }
                    return new C37308Eka(LJIILLIIL, rootCause, this);
                }
                return cancellationException2;
            }
            String LJIILLIIL2 = o.LJIILLIIL(this, "Job is still new or active: ");
            LJIILLIIL2.toString();
            throw new IllegalStateException(LJIILLIIL2);
        }
        if (!(LJJJLIIL instanceof XL7)) {
            if (LJJJLIIL instanceof CompletedExceptionally) {
                Throwable th = ((CompletedExceptionally) LJJJLIIL).cause;
                if ((th instanceof CancellationException) && (cancellationException = (CancellationException) th) != null) {
                    return cancellationException;
                }
                return new C37308Eka(LJJJ(), th, this);
            }
            return new C37308Eka(o.LJIILLIIL(" has completed normally", C16880lQ.LJLLJ(getClass())), null, this);
        }
        String LJIILLIIL3 = o.LJIILLIIL(this, "Job is still new or active: ");
        LJIILLIIL3.toString();
        throw new IllegalStateException(LJIILLIIL3);
    }

    @Override // X.XL9
    public final CancellationException LJJJIL() {
        CancellationException cancellationException;
        Object LJJJLIIL = LJJJLIIL();
        Throwable th = null;
        if (LJJJLIIL instanceof Finishing) {
            th = ((Finishing) LJJJLIIL).getRootCause();
        } else if (LJJJLIIL instanceof CompletedExceptionally) {
            th = ((CompletedExceptionally) LJJJLIIL).cause;
        } else if (LJJJLIIL instanceof XL7) {
            String LJIILLIIL = o.LJIILLIIL(LJJJLIIL, "Cannot be cancelling child in this state: ");
            LJIILLIIL.toString();
            throw new IllegalStateException(LJIILLIIL);
        }
        if (!(th instanceof CancellationException) || (cancellationException = (CancellationException) th) == null) {
            return new C37308Eka(o.LJIILLIIL(LJJLIL(LJJJLIIL), "Parent job is "), th, this);
        }
        return cancellationException;
    }

    public final Object LJJJJL() {
        Object LJJJLIIL = LJJJLIIL();
        if (!(LJJJLIIL instanceof XL7)) {
            if (!(LJJJLIIL instanceof CompletedExceptionally)) {
                return C84667XKt.LIZ(LJJJLIIL);
            }
            throw ((CompletedExceptionally) LJJJLIIL).cause;
        }
        "This job has not completed yet".toString();
        throw new IllegalStateException("This job has not completed yet");
    }

    public String LJJLIIIJ() {
        return C16880lQ.LJLLJ(getClass());
    }

    @Override // X.InterfaceC79150V4o
    public boolean isActive() {
        Object LJJJLIIL = LJJJLIIL();
        if ((LJJJLIIL instanceof XL7) && ((XL7) LJJJLIIL).isActive()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC79150V4o
    public final boolean isCancelled() {
        Object LJJJLIIL = LJJJLIIL();
        if ((LJJJLIIL instanceof CompletedExceptionally) || ((LJJJLIIL instanceof Finishing) && ((Finishing) LJJJLIIL).isCancelling())) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC79150V4o
    public final boolean isCompleted() {
        return !(LJJJLIIL() instanceof XL7);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(LJJLIIIJ());
        LIZ2.append('{');
        LIZ2.append(LJJLIL(LJJJLIIL()));
        LIZ2.append('}');
        LIZ.append(X1D.LIZIZ(LIZ2));
        LIZ.append('@');
        LIZ.append(C65314PkE.LJI(this));
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.MBD
    public final InterfaceC48698J9i<?> getKey() {
        return InterfaceC79150V4o.LJJJJJ;
    }

    public JobSupport(boolean z) {
        C84668XKu c84668XKu;
        if (z) {
            c84668XKu = C84667XKt.LJI;
        } else {
            c84668XKu = C84667XKt.LJFF;
        }
        this._state = c84668XKu;
        this._parentHandle = null;
    }

    public static C84666XKs LJJLIIIJILLIZJL(C84629XJh c84629XJh) {
        while (c84629XJh.LJIJJLI()) {
            c84629XJh = c84629XJh.LJIJ();
        }
        while (true) {
            c84629XJh = c84629XJh.LJIIZILJ();
            if (!c84629XJh.LJIJJLI()) {
                if (c84629XJh instanceof C84666XKs) {
                    return (C84666XKs) c84629XJh;
                }
                if (c84629XJh instanceof XL4) {
                    return null;
                }
            }
        }
    }

    public static String LJJLIL(Object obj) {
        if (obj instanceof Finishing) {
            Finishing finishing = (Finishing) obj;
            if (finishing.isCancelling()) {
                return "Cancelling";
            }
            if (finishing.isCompleting()) {
                return "Completing";
            }
        } else if (obj instanceof XL7) {
            if (!((XL7) obj).isActive()) {
                return "New";
            }
        } else {
            if (obj instanceof CompletedExceptionally) {
                return "Cancelled";
            }
            return "Completed";
        }
        return "Active";
    }

    @Override // X.InterfaceC79150V4o
    public void LIZIZ(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C37308Eka(LJJJ(), null, this);
        }
        LJJIJL(cancellationException);
    }

    @Override // X.XL8
    public final void LJIIJJI(JobSupport jobSupport) {
        LJJIJIIJI(jobSupport);
    }

    @Override // X.InterfaceC79150V4o
    public final T2N LJJIII(InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns) {
        return LJIJI(false, true, interfaceC88472Yns);
    }

    @Override // X.InterfaceC79150V4o
    public final InterfaceC77431UaB LJJIIJZLJL(JobSupport jobSupport) {
        return (InterfaceC77431UaB) V87.LIZ(this, true, new C84666XKs(jobSupport), 2);
    }

    public final Object LJJIJ(InterfaceC67352kd<Object> interfaceC67352kd) {
        Object LJJJLIIL;
        do {
            LJJJLIIL = LJJJLIIL();
            if (!(LJJJLIIL instanceof XL7)) {
                if (!(LJJJLIIL instanceof CompletedExceptionally)) {
                    return C84667XKt.LIZ(LJJJLIIL);
                }
                throw ((CompletedExceptionally) LJJJLIIL).cause;
            }
        } while (LJJLIIJ(LJJJLIIL) < 0);
        C84659XKl c84659XKl = new C84659XKl(C78555UsJ.LJJII(interfaceC67352kd), this);
        c84659XKl.LJIIL();
        c84659XKl.LJIILIIL(new X9J(LJJIII(new C84656XKi(c84659XKl))));
        return c84659XKl.LJIIJJI();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        r1 = X.C84667XKt.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        if (r1 != X.C84667XKt.LIZIZ) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        r1 = LJJLJ(r2, new kotlinx.coroutines.CompletedExceptionally(LJJJJJ(r10), r3, r7, r5 == true ? 1 : 0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
    
        if (r1 == X.C84667XKt.LIZJ) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        if (r1 != X.C84667XKt.LIZ) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003e, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003f, code lost:
    
        r4 = LJJJLIIL();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
    
        if ((r4 instanceof kotlinx.coroutines.JobSupport.Finishing) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004b, code lost:
    
        if ((r4 instanceof X.XL7) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004d, code lost:
    
        if (r6 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004f, code lost:
    
        r6 = LJJJJJ(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
    
        r8 = (X.XL7) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x000a, code lost:
    
        if (LJJJJZ() != false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        if (r8.isActive() == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007d, code lost:
    
        r1 = LJJLJ(r4, new kotlinx.coroutines.CompletedExceptionally(r6, r3, r7, r5 == true ? 1 : 0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
    
        if (r1 == X.C84667XKt.LIZ) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008c, code lost:
    
        if (r1 != X.C84667XKt.LIZJ) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000c, code lost:
    
        r2 = LJJJLIIL();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d1, code lost:
    
        r1 = kotlin.jvm.internal.o.LJIILLIIL(r4, "Cannot happen in ");
        r1.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00df, code lost:
    
        throw new java.lang.IllegalStateException(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x005c, code lost:
    
        r4 = LJJJJZI(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0060, code lost:
    
        if (r4 != null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0063, code lost:
    
        r2 = new kotlinx.coroutines.JobSupport.Finishing(r4, false, r6);
        r1 = kotlinx.coroutines.JobSupport.LJLIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x006e, code lost:
    
        if (r1.compareAndSet(r9, r8, r2) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if ((r2 instanceof X.XL7) == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x007a, code lost:
    
        if (r1.get(r9) == r8) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0070, code lost:
    
        LJJLIIIJJI(r4, r6);
        r1 = X.C84667XKt.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e0, code lost:
    
        r1 = X.C84667XKt.LIZLLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0047, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0096, code lost:
    
        if (((kotlinx.coroutines.JobSupport.Finishing) r4).isSealed() == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0098, code lost:
    
        r1 = X.C84667XKt.LIZLLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00e3, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x009b, code lost:
    
        r2 = ((kotlinx.coroutines.JobSupport.Finishing) r4).isCancelling();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00a2, code lost:
    
        if (r10 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00a4, code lost:
    
        if (r2 != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b2, code lost:
    
        r1 = ((kotlinx.coroutines.JobSupport.Finishing) r4).getRootCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00bb, code lost:
    
        if ((!r2) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if ((r2 instanceof kotlinx.coroutines.JobSupport.Finishing) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00bd, code lost:
    
        r5 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00be, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00bf, code lost:
    
        if (r5 != null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00c1, code lost:
    
        r1 = X.C84667XKt.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c4, code lost:
    
        LJJLIIIJJI(((kotlinx.coroutines.JobSupport.Finishing) r4).getList(), r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00a6, code lost:
    
        if (r6 != null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00a8, code lost:
    
        r6 = LJJJJJ(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00ac, code lost:
    
        ((kotlinx.coroutines.JobSupport.Finishing) r4).addExceptionLocked(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00e6, code lost:
    
        if (r1 != X.C84667XKt.LIZ) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00e8, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00ec, code lost:
    
        if (r1 != X.C84667XKt.LIZIZ) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00f1, code lost:
    
        if (r1 != X.C84667XKt.LIZLLL) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00f4, code lost:
    
        LJJII(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (((kotlinx.coroutines.JobSupport.Finishing) r2).isCompleting() == false) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJIJIIJI(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport.LJJIJIIJI(java.lang.Object):boolean");
    }

    public void LJJIJL(Throwable th) {
        LJJIJIIJI(th);
    }

    public final boolean LJJIJLIJ(Throwable th) {
        if (LJJL()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        InterfaceC77431UaB interfaceC77431UaB = (InterfaceC77431UaB) this._parentHandle;
        if (interfaceC77431UaB == null || interfaceC77431UaB == C77433UaD.LJLIL) {
            return z;
        }
        if (interfaceC77431UaB.LJII(th) || z) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC79150V4o
    public final Object LJJJJ(InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        Object LJJJLIIL;
        do {
            LJJJLIIL = LJJJLIIL();
            if (!(LJJJLIIL instanceof XL7)) {
                C79146V4k.LJJIIJ(interfaceC67352kd.getContext());
                return C76800UCe.LIZ;
            }
        } while (LJJLIIJ(LJJJLIIL) < 0);
        XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
        xks.LJIIL();
        xks.LJIILIIL(new X9J(LJJIII(new T2O(xks))));
        Object LJIIJJI = xks.LJIIJJI();
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        if (LJIIJJI != enumC58928NAu) {
            LJIIJJI = C76800UCe.LIZ;
        }
        if (LJIIJJI == enumC58928NAu) {
            return LJIIJJI;
        }
        return C76800UCe.LIZ;
    }

    public boolean LJJJJI(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        if (LJJIJIIJI(th) && LJJJJLL()) {
            return true;
        }
        return false;
    }

    public final Throwable LJJJJJ(Object obj) {
        if (obj == null || (obj instanceof Throwable)) {
            Throwable th = (Throwable) obj;
            if (th == null) {
                return new C37308Eka(LJJJ(), null, this);
            }
            return th;
        }
        if (obj != null) {
            return ((XL9) obj).LJJJIL();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
    }

    public final XL4 LJJJJZI(XL7 xl7) {
        XL4 list = xl7.getList();
        if (list == null) {
            if (xl7 instanceof C84668XKu) {
                return new XL4();
            }
            if (xl7 instanceof AbstractC84652XKe) {
                LJJLIIIJLJLI((AbstractC84652XKe) xl7);
                return null;
            }
            String LJIILLIIL = o.LJIILLIIL(xl7, "State should have list: ");
            LJIILLIIL.toString();
            throw new IllegalStateException(LJIILLIIL);
        }
        return list;
    }

    public final void LJJJZ(InterfaceC79150V4o interfaceC79150V4o) {
        if (interfaceC79150V4o == null) {
            this._parentHandle = C77433UaD.LJLIL;
            return;
        }
        interfaceC79150V4o.LJIILL();
        InterfaceC77431UaB LJJIIJZLJL = interfaceC79150V4o.LJJIIJZLJL(this);
        this._parentHandle = LJJIIJZLJL;
        if (isCompleted()) {
            LJJIIJZLJL.dispose();
            this._parentHandle = C77433UaD.LJLIL;
        }
    }

    public final boolean LJJLI(Object obj) {
        Object LJJLJ;
        do {
            LJJLJ = LJJLJ(LJJJLIIL(), obj);
            if (LJJLJ == C84667XKt.LIZ) {
                return false;
            }
            if (LJJLJ == C84667XKt.LIZIZ) {
                return true;
            }
        } while (LJJLJ == C84667XKt.LIZJ);
        LJJII(LJJLJ);
        return true;
    }

    public final Object LJJLIIIIJ(Object obj) {
        Object LJJLJ;
        CompletedExceptionally completedExceptionally;
        do {
            LJJLJ = LJJLJ(LJJJLIIL(), obj);
            if (LJJLJ == C84667XKt.LIZ) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Job ");
                LIZ.append(this);
                LIZ.append(" is already complete or completing, but is being completed with ");
                LIZ.append(obj);
                String LIZIZ = X1D.LIZIZ(LIZ);
                Throwable th = null;
                if ((obj instanceof CompletedExceptionally) && (completedExceptionally = (CompletedExceptionally) obj) != null) {
                    th = completedExceptionally.cause;
                }
                throw new IllegalStateException(LIZIZ, th);
            }
        } while (LJJLJ == C84667XKt.LIZJ);
        return LJJLJ;
    }

    public final void LJJLIIIJLJLI(AbstractC84652XKe abstractC84652XKe) {
        XL4 xl4 = new XL4();
        abstractC84652XKe.getClass();
        C84629XJh.LJLILLLLZI.lazySet(xl4, abstractC84652XKe);
        C84629XJh.LJLIL.lazySet(xl4, abstractC84652XKe);
        loop0: while (true) {
            if (abstractC84652XKe.LJIILLIIL() == abstractC84652XKe) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C84629XJh.LJLIL;
                while (!atomicReferenceFieldUpdater.compareAndSet(abstractC84652XKe, abstractC84652XKe, xl4)) {
                    if (atomicReferenceFieldUpdater.get(abstractC84652XKe) != abstractC84652XKe) {
                        break;
                    }
                }
                xl4.LJIILL(abstractC84652XKe);
                break loop0;
            }
            break;
        }
        C84629XJh LJIIZILJ = abstractC84652XKe.LJIIZILJ();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = LJLIL;
        while (!atomicReferenceFieldUpdater2.compareAndSet(this, abstractC84652XKe, LJIIZILJ) && atomicReferenceFieldUpdater2.get(this) == abstractC84652XKe) {
        }
    }

    public final int LJJLIIJ(Object obj) {
        if (obj instanceof C84668XKu) {
            if (((C84668XKu) obj).LJLIL) {
                return 0;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LJLIL;
            C84668XKu c84668XKu = C84667XKt.LJI;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c84668XKu)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            LJJLIIIJL();
            return 1;
        }
        if (!(obj instanceof XL5)) {
            return 0;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = LJLIL;
        XL4 xl4 = ((XL5) obj).LJLIL;
        while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, xl4)) {
            if (atomicReferenceFieldUpdater2.get(this) != obj) {
                return -1;
            }
        }
        LJJLIIIJL();
        return 1;
    }

    @Override // X.MBD, X.MBA
    public final <E extends MBD> E get(InterfaceC48698J9i<E> interfaceC48698J9i) {
        return (E) MBC.LIZ(this, interfaceC48698J9i);
    }

    @Override // X.MBA
    public final MBA minusKey(InterfaceC48698J9i<?> interfaceC48698J9i) {
        return MBC.LIZIZ(this, interfaceC48698J9i);
    }

    @Override // X.MBA
    public final MBA plus(MBA context) {
        o.LJIIIZ(context, "context");
        return MBE.LIZ(this, context);
    }

    public void LJJJLZIJ(XL6 xl6) {
        throw xl6;
    }

    public final void LJJJJIZL(XL7 xl7, Object obj) {
        Throwable th;
        CompletedExceptionally completedExceptionally;
        T2N t2n = (T2N) this._parentHandle;
        if (t2n != null) {
            t2n.dispose();
            this._parentHandle = C77433UaD.LJLIL;
        }
        XL6 xl6 = null;
        if (!(obj instanceof CompletedExceptionally) || (completedExceptionally = (CompletedExceptionally) obj) == null) {
            th = null;
        } else {
            th = completedExceptionally.cause;
        }
        if (xl7 instanceof AbstractC84652XKe) {
            try {
                ((AbstractC84652XKe) xl7).LJJII(th);
                return;
            } catch (Throwable th2) {
                LJJJLZIJ(new XL6("Exception in completion handler " + xl7 + " for " + this, th2));
                return;
            }
        }
        XL4 list = xl7.getList();
        if (list != null) {
            for (C84629XJh c84629XJh = (C84629XJh) list.LJIILLIIL(); !o.LJ(c84629XJh, list); c84629XJh = c84629XJh.LJIIZILJ()) {
                if (c84629XJh instanceof AbstractC84652XKe) {
                    XL0 xl0 = (XL0) c84629XJh;
                    try {
                        xl0.LJJII(th);
                    } catch (Throwable th3) {
                        if (xl6 == null) {
                            xl6 = new XL6("Exception in completion handler " + xl0 + " for " + this, th3);
                        } else {
                            V0N.LJFF(xl6, th3);
                        }
                    }
                }
            }
            if (xl6 != null) {
                LJJJLZIJ(xl6);
            }
        }
    }

    public final Object LJJJJJL(Finishing finishing, Object obj) {
        Throwable th;
        Throwable LJJJJLI;
        Object obj2;
        CompletedExceptionally completedExceptionally;
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (!(obj instanceof CompletedExceptionally) || (completedExceptionally = (CompletedExceptionally) obj) == null) {
            th = null;
        } else {
            th = completedExceptionally.cause;
        }
        synchronized (finishing) {
            finishing.isCancelling();
            List<Throwable> sealLocked = finishing.sealLocked(th);
            LJJJJLI = LJJJJLI(finishing, sealLocked);
            if (LJJJJLI != null && sealLocked.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(sealLocked.size()));
                for (Throwable th2 : sealLocked) {
                    if (th2 != LJJJJLI && th2 != LJJJJLI && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                        V0N.LJFF(LJJJJLI, th2);
                    }
                }
            }
        }
        boolean z = false;
        if (LJJJJLI != null) {
            if (LJJJJLI != th) {
                obj = new CompletedExceptionally(LJJJJLI, z, 2, defaultConstructorMarker);
            }
            if (LJJIJLIJ(LJJJJLI) || LJJJLL(LJJJJLI)) {
                if (obj != null) {
                    ((CompletedExceptionally) obj).makeHandled();
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                }
            }
        }
        LJJLIIIJJIZ(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LJLIL;
        if (obj instanceof XL7) {
            obj2 = new XLB((XL7) obj);
        } else {
            obj2 = obj;
        }
        while (!atomicReferenceFieldUpdater.compareAndSet(this, finishing, obj2) && atomicReferenceFieldUpdater.get(this) == finishing) {
        }
        LJJJJIZL(finishing, obj);
        return obj;
    }

    public final Throwable LJJJJLI(Finishing finishing, List<? extends Throwable> list) {
        Throwable th;
        Throwable th2 = null;
        if (list.isEmpty()) {
            if (!finishing.isCancelling()) {
                return null;
            }
            return new C37308Eka(LJJJ(), null, this);
        }
        Iterator<? extends Throwable> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                th = it.next();
                if (!(th instanceof CancellationException)) {
                    break;
                }
            } else {
                th = null;
                break;
            }
        }
        Throwable th3 = th;
        if (th3 != null) {
            return th3;
        }
        Throwable th4 = (Throwable) ListProtector.get(list, 0);
        if (th4 instanceof C74185T9p) {
            Iterator<? extends Throwable> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Throwable next = it2.next();
                if (next != th4 && (next instanceof C74185T9p)) {
                    th2 = next;
                    break;
                }
            }
            Throwable th5 = th2;
            if (th5 != null) {
                return th5;
            }
        }
        return th4;
    }

    public final void LJJLIIIJJI(XL4 xl4, Throwable th) {
        XL6 xl6 = null;
        for (C84629XJh c84629XJh = (C84629XJh) xl4.LJIILLIIL(); !o.LJ(c84629XJh, xl4); c84629XJh = c84629XJh.LJIIZILJ()) {
            if (c84629XJh instanceof XLA) {
                XL0 xl0 = (XL0) c84629XJh;
                try {
                    xl0.LJJII(th);
                } catch (Throwable th2) {
                    if (xl6 == null) {
                        xl6 = new XL6("Exception in completion handler " + xl0 + " for " + this, th2);
                    } else {
                        V0N.LJFF(xl6, th2);
                    }
                }
            }
        }
        if (xl6 != null) {
            LJJJLZIJ(xl6);
        }
        LJJIJLIJ(th);
    }

    public final void LJJLIIIJLLLLLLLZ(XKG xkg, C3C9 c3c9) {
        Object LJJJLIIL;
        do {
            LJJJLIIL = LJJJLIIL();
            if (xkg.LIZ()) {
                return;
            }
            if (!(LJJJLIIL instanceof XL7)) {
                if (xkg.LJ()) {
                    if (LJJJLIIL instanceof CompletedExceptionally) {
                        xkg.LJFF(((CompletedExceptionally) LJJJLIIL).cause);
                        return;
                    } else {
                        C78555UsJ.LJJJI(c3c9, C84667XKt.LIZ(LJJJLIIL), xkg.LJIIJJI());
                        return;
                    }
                }
                return;
            }
        } while (LJJLIIJ(LJJJLIIL) != 0);
        xkg.LJIIJ(LJJIII(new C84650XKc(xkg, c3c9)));
    }

    public final Object LJJLJ(Object obj, Object obj2) {
        Object obj3;
        boolean z;
        Finishing finishing;
        CompletedExceptionally completedExceptionally;
        C84666XKs c84666XKs;
        if (!(obj instanceof XL7)) {
            return C84667XKt.LIZ;
        }
        boolean z2 = false;
        if (((obj instanceof C84668XKu) || (obj instanceof AbstractC84652XKe)) && !(obj instanceof C84666XKs) && !(obj2 instanceof CompletedExceptionally)) {
            XL7 xl7 = (XL7) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LJLIL;
            if (obj2 instanceof XL7) {
                obj3 = new XLB((XL7) obj2);
            } else {
                obj3 = obj2;
            }
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, xl7, obj3)) {
                    z = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != xl7) {
                    z = false;
                    break;
                }
            }
            if (z) {
                LJJLIIIJJIZ(obj2);
                LJJJJIZL(xl7, obj2);
                z2 = true;
            }
            if (z2) {
                return obj2;
            }
            return C84667XKt.LIZJ;
        }
        XL7 xl72 = (XL7) obj;
        XL4 LJJJJZI = LJJJJZI(xl72);
        if (LJJJJZI == null) {
            return C84667XKt.LIZJ;
        }
        C84666XKs c84666XKs2 = null;
        if (xl72 instanceof Finishing) {
            finishing = (Finishing) xl72;
        } else {
            finishing = null;
        }
        if (finishing == null) {
            finishing = new Finishing(LJJJJZI, false, null);
        }
        synchronized (finishing) {
            if (finishing.isCompleting()) {
                return C84667XKt.LIZ;
            }
            finishing.setCompleting(true);
            if (finishing != xl72) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = LJLIL;
                while (true) {
                    if (!atomicReferenceFieldUpdater2.compareAndSet(this, xl72, finishing)) {
                        if (atomicReferenceFieldUpdater2.get(this) != xl72) {
                            break;
                        }
                    } else {
                        z2 = true;
                        break;
                    }
                }
                if (!z2) {
                    return C84667XKt.LIZJ;
                }
            }
            boolean isCancelling = finishing.isCancelling();
            if (obj2 instanceof CompletedExceptionally) {
                completedExceptionally = (CompletedExceptionally) obj2;
            } else {
                completedExceptionally = null;
            }
            if (completedExceptionally != null) {
                finishing.addExceptionLocked(completedExceptionally.cause);
            }
            Throwable rootCause = finishing.getRootCause();
            if (!(!isCancelling)) {
                rootCause = null;
            }
            if (rootCause != null) {
                LJJLIIIJJI(LJJJJZI, rootCause);
            }
            if (xl72 instanceof C84666XKs) {
                c84666XKs = (C84666XKs) xl72;
            } else {
                c84666XKs = null;
            }
            if (c84666XKs == null) {
                XL4 list = xl72.getList();
                if (list != null) {
                    c84666XKs2 = LJJLIIIJILLIZJL(list);
                }
            } else {
                c84666XKs2 = c84666XKs;
            }
            if (c84666XKs2 != null && LJJLJLI(finishing, c84666XKs2, obj2)) {
                return C84667XKt.LIZIZ;
            }
            return LJJJJJL(finishing, obj2);
        }
    }

    @Override // X.MBA
    public final <R> R fold(R r, InterfaceC88471Ynr<? super R, ? super MBD, ? extends R> operation) {
        o.LJIIIZ(operation, "operation");
        return operation.invoke(r, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.XL5] */
    @Override // X.InterfaceC79150V4o
    public final T2N LJIJI(boolean z, boolean z2, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns) {
        AbstractC84652XKe t2p;
        CompletedExceptionally completedExceptionally;
        T2N t2n;
        int LJJIFFI;
        Throwable rootCause;
        int LJJIFFI2;
        Throwable th = null;
        if (z) {
            if (!(interfaceC88472Yns instanceof XLA) || (t2p = (AbstractC84652XKe) interfaceC88472Yns) == null) {
                t2p = new C84665XKr(interfaceC88472Yns);
            }
        } else if (!(interfaceC88472Yns instanceof AbstractC84652XKe) || (t2p = (AbstractC84652XKe) interfaceC88472Yns) == null) {
            t2p = new T2P(interfaceC88472Yns);
        }
        t2p.LJLJJI = this;
        while (true) {
            Object LJJJLIIL = LJJJLIIL();
            if (LJJJLIIL instanceof C84668XKu) {
                C84668XKu c84668XKu = (C84668XKu) LJJJLIIL;
                if (c84668XKu.LJLIL) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LJLIL;
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, LJJJLIIL, t2p)) {
                        if (atomicReferenceFieldUpdater.get(this) != LJJJLIIL) {
                            break;
                        }
                    }
                    return t2p;
                }
                XL4 xl4 = new XL4();
                if (!c84668XKu.LJLIL) {
                    xl4 = new XL5(xl4);
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = LJLIL;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, c84668XKu, xl4) && atomicReferenceFieldUpdater2.get(this) == c84668XKu) {
                }
            } else if (LJJJLIIL instanceof XL7) {
                XL4 list = ((XL7) LJJJLIIL).getList();
                if (list == null) {
                    if (LJJJLIIL != null) {
                        LJJLIIIJLJLI((AbstractC84652XKe) LJJJLIIL);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    }
                } else {
                    t2n = C77433UaD.LJLIL;
                    if (z && (LJJJLIIL instanceof Finishing)) {
                        synchronized (LJJJLIIL) {
                            rootCause = ((Finishing) LJJJLIIL).getRootCause();
                            if (rootCause != null && (!(interfaceC88472Yns instanceof C84666XKs) || ((Finishing) LJJJLIIL).isCompleting())) {
                                break;
                            }
                            C84640XJs c84640XJs = new C84640XJs(t2p, this, LJJJLIIL);
                            do {
                                LJJIFFI2 = list.LJIJ().LJJIFFI(t2p, list, c84640XJs);
                                if (LJJIFFI2 == 1) {
                                    if (rootCause == null) {
                                        return t2p;
                                    }
                                    t2n = t2p;
                                }
                            } while (LJJIFFI2 != 2);
                        }
                    } else {
                        C84640XJs c84640XJs2 = new C84640XJs(t2p, this, LJJJLIIL);
                        do {
                            LJJIFFI = list.LJIJ().LJJIFFI(t2p, list, c84640XJs2);
                            if (LJJIFFI == 1) {
                                return t2p;
                            }
                        } while (LJJIFFI != 2);
                    }
                }
            } else {
                if (z2) {
                    if ((LJJJLIIL instanceof CompletedExceptionally) && (completedExceptionally = (CompletedExceptionally) LJJJLIIL) != null) {
                        th = completedExceptionally.cause;
                    }
                    interfaceC88472Yns.invoke(th);
                }
                return C77433UaD.LJLIL;
            }
        }
        if (z2) {
            interfaceC88472Yns.invoke(rootCause);
        }
        return t2n;
    }

    public final boolean LJJLJLI(Finishing finishing, C84666XKs c84666XKs, Object obj) {
        while (V87.LIZ(c84666XKs.LJLJJL, false, new C84664XKq(this, finishing, c84666XKs, obj), 1) == C77433UaD.LJLIL) {
            c84666XKs = LJJLIIIJILLIZJL(c84666XKs);
            if (c84666XKs == null) {
                return false;
            }
        }
        return true;
    }
}
