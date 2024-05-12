package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.VoucherInfoNew;
import defpackage.b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FEY extends AbstractC38618FDq {
    public volatile List<? extends InterfaceC38628FEa> LIZJ;
    public volatile FEZ LIZLLL;
    public volatile boolean LJ;
    public volatile Context LJFF;
    public volatile Context LJI;
    public boolean LJIIIIZZ;
    public final int LJIIIZ;
    public final InterfaceC38628FEa LJIIJ;
    public final FE3 LJIIL;
    public final String LJIIJJI = "androidx";
    public final ReentrantReadWriteLock LJII = new ReentrantReadWriteLock();

    public final void LIZIZ() {
        if (this.LJIIIIZZ) {
            return;
        }
        synchronized (this) {
            if (this.LJIIIIZZ) {
                return;
            }
            InterfaceC38628FEa interfaceC38628FEa = this.LJIIJ;
            if (interfaceC38628FEa instanceof C38632FEe) {
                List<InterfaceC38628FEa> LIZ = interfaceC38628FEa.LIZ();
                if (LIZ != null) {
                    Iterator<InterfaceC38628FEa> it = LIZ.iterator();
                    while (it.hasNext()) {
                        LIZ(it.next());
                    }
                }
            } else {
                LIZ(interfaceC38628FEa);
            }
            FE8.LJFF(this.LJIIIZ, this);
            this.LJIIIIZZ = true;
        }
    }

    public final FEZ LJI() {
        FEZ fez = this.LIZLLL;
        if (fez != null) {
            return fez;
        }
        "viewSizeCounter is null".toString();
        throw new IllegalArgumentException("viewSizeCounter is null");
    }

    public final void LJII() {
        int size;
        String LIZIZ;
        if (this.LIZJ == null) {
            synchronized (this) {
                if (this.LIZJ == null) {
                    InterfaceC38628FEa toDFSList = this.LJIIJ;
                    o.LJIIJ(toDFSList, "$this$toDFSList");
                    ArrayList arrayList = new ArrayList();
                    C109434Rf.LJIILL(toDFSList, new AqS167S0100000_1(arrayList, (List<VoucherInfoNew>) 522));
                    LJFF(arrayList);
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (next instanceof AbstractC38633FEf) {
                            arrayList2.add(next);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        FE3 fe3 = this.LJIIL;
                        String defaultValue = this.LJIIJJI;
                        o.LJIIJ(defaultValue, "defaultValue");
                        if (fe3 != null && (LIZIZ = fe3.LIZIZ()) != null) {
                            defaultValue = LIZIZ;
                        }
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            AbstractC38633FEf abstractC38633FEf = (AbstractC38633FEf) it2.next();
                            abstractC38633FEf.getClass();
                            abstractC38633FEf.LJIIJ = defaultValue;
                        }
                    }
                    FEZ fez = new FEZ();
                    if (this.LJIIJ instanceof C38632FEe) {
                        size = arrayList.size() - 1;
                    } else {
                        size = arrayList.size();
                    }
                    if (size >= 1) {
                        if (fez.LIZ == -1) {
                            fez.LIZ = size;
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it3 = arrayList.iterator();
                            while (it3.hasNext()) {
                                Object next2 = it3.next();
                                if (!(((InterfaceC38628FEa) next2) instanceof C38632FEe)) {
                                    arrayList3.add(next2);
                                }
                            }
                            Iterator it4 = arrayList3.iterator();
                            while (it4.hasNext()) {
                                ((InterfaceC38628FEa) it4.next()).LIZLLL(fez);
                            }
                            this.LIZLLL = fez;
                            this.LIZJ = arrayList;
                        } else {
                            throw new IllegalStateException("cannot call ViewSizeCounter#updateTotalCount twice.");
                        }
                    } else {
                        throw new IllegalArgumentException("count must be bigger than 0");
                    }
                }
            }
        }
    }

    public static void LIZ(InterfaceC38628FEa interfaceC38628FEa) {
        View LJII = interfaceC38628FEa.LJII();
        List<InterfaceC38628FEa> LIZ = interfaceC38628FEa.LIZ();
        if (LIZ != null) {
            for (InterfaceC38628FEa interfaceC38628FEa2 : LIZ) {
                if (LJII != null) {
                    ViewGroup viewGroup = (ViewGroup) LJII;
                    interfaceC38628FEa2.LJIIIIZZ(viewGroup);
                    viewGroup.addView(interfaceC38628FEa2.LJII());
                    LIZ(interfaceC38628FEa2);
                } else {
                    throw new C37692Eqm("null cannot be cast to non-null type android.view.ViewGroup");
                }
            }
        }
        C14630hn.LIZ(LJII);
    }

    public static void LJFF(List list) {
        Iterator it = ((ArrayList) list).iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                InterfaceC38628FEa interfaceC38628FEa = (InterfaceC38628FEa) next;
                if (interfaceC38628FEa instanceof C38632FEe) {
                    if (i != 0) {
                        throw new IllegalStateException("MergeViewCreator must be the first item in the ViewCreatorList.");
                    }
                } else {
                    InterfaceC38628FEa parent = interfaceC38628FEa.getParent();
                    if (parent != null || i == 0) {
                        if ((parent instanceof C38632FEe) && i == 0) {
                            throw new IllegalStateException("First item in the ViewCreatorList can not have a parent which is MergeViewCreator");
                        }
                    } else {
                        throw new IllegalStateException("Only first item in the ViewCreatorList can have no parent.");
                    }
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }

    @Override // X.InterfaceC38616FDo
    public final void LIZJ(Context context) {
        Object LIZ;
        o.LJIIJ(context, "context");
        try {
            LJII();
            if (this.LJI == null || this.LJFF == null) {
                synchronized (this) {
                    if (this.LJFF == null && C109434Rf.LIZJ(context) != null) {
                        this.LJFF = context;
                        if (this.LJI != null) {
                            this.LJ = true;
                        }
                    }
                    if (this.LJI == null) {
                        this.LJI = context;
                    }
                }
            }
            Context context2 = this.LJFF;
            if (context2 == null && (context2 = this.LJI) == null) {
                throw new IllegalStateException("firstContext is null.");
            }
            LJIIJ(context2);
            Context context3 = this.LJFF;
            if (context3 == null && (context3 = this.LJI) == null) {
                throw new IllegalStateException("firstContext is null.");
            }
            FEZ LJI = LJI();
            LJI.LIZIZ();
            if (LJI.LIZ == LJI.LIZIZ.get()) {
                LIZIZ();
                LJIIIZ(context3);
            }
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            FEZ LJI2 = LJI();
            ReentrantLock reentrantLock = LJI2.LIZJ;
            reentrantLock.lock();
            try {
                LJI2.LJ = m10exceptionOrNullimpl;
                LJI2.LIZLLL.signalAll();
            } finally {
                reentrantLock.unlock();
            }
        }
        C141335gf.LIZJ(LIZ);
    }

    public final void LJIIIZ(Context context) {
        Context baseContext;
        InterfaceC38628FEa interfaceC38628FEa = this.LJIIJ;
        if (interfaceC38628FEa instanceof C38632FEe) {
            List<InterfaceC38628FEa> LIZ = interfaceC38628FEa.LIZ();
            if (LIZ != null) {
                interfaceC38628FEa = (InterfaceC38628FEa) ORZ.LJLLLL(LIZ);
            } else {
                return;
            }
        }
        if (interfaceC38628FEa != null) {
            View LJII = interfaceC38628FEa.LJII();
            if (interfaceC38628FEa.LJI() == 0) {
                baseContext = LJII.getContext();
            } else {
                Context context2 = LJII.getContext();
                if (context2 != null) {
                    baseContext = ((ContextWrapper) context2).getBaseContext();
                } else {
                    throw new C37692Eqm("null cannot be cast to non-null type android.view.ContextThemeWrapper");
                }
            }
            if (!o.LJ(baseContext, context)) {
                LJIIIIZZ(context, EnumC37128Ehg.INFLATE_CONTEXT_NOT_MATCH_PRELOAD_CONTEXT);
            }
        }
    }

    public final void LJIIJ(Context context) {
        Context context2;
        int i;
        FEZ LJI = LJI();
        LJI.LIZIZ();
        if (LJI.LIZ == LJI.LIZIZ.get()) {
            return;
        }
        List<? extends InterfaceC38628FEa> list = this.LIZJ;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                InterfaceC38628FEa interfaceC38628FEa = (InterfaceC38628FEa) it.next();
                if (this.LJ) {
                    ReentrantReadWriteLock reentrantReadWriteLock = this.LJII;
                    ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
                    if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                        i = reentrantReadWriteLock.getReadHoldCount();
                        for (int i2 = 0; i2 < i; i2++) {
                            readLock.unlock();
                        }
                    } else {
                        i = 0;
                    }
                    ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                    writeLock.lock();
                    try {
                        if (this.LJ) {
                            Context context3 = this.LJFF;
                            if (context3 != null) {
                                LJIIIIZZ(context3, EnumC37128Ehg.ACTIVITY_CONTEXT_PHASE);
                                this.LJ = false;
                            } else {
                                throw new IllegalStateException("activityContext cannot be null.");
                            }
                        }
                        int i3 = 0;
                    } finally {
                        for (int i4 = 0; i4 < i; i4++) {
                            readLock.lock();
                        }
                        writeLock.unlock();
                    }
                }
                if (!(interfaceC38628FEa instanceof C38632FEe)) {
                    ReentrantReadWriteLock.ReadLock readLock2 = this.LJII.readLock();
                    readLock2.lock();
                    try {
                        InterfaceC38628FEa parent = interfaceC38628FEa.getParent();
                        if (parent == null || (parent instanceof C38632FEe)) {
                            context2 = context;
                        } else {
                            context2 = parent.getContext();
                        }
                        interfaceC38628FEa.LIZJ(context2);
                    } finally {
                        readLock2.unlock();
                    }
                }
            }
            return;
        }
        throw new IllegalStateException("dfsViewCreatorList is null.");
    }

    public final void LJIIIIZZ(Context context, EnumC37128Ehg enumC37128Ehg) {
        Context context2;
        C38619FDr.LIZLLL.getClass();
        InterfaceC38613FDl LIZ = C38619FDr.LIZ();
        if (LIZ != null) {
            LIZ.LJIIJJI(C38891fp.LJJIIJZLJL(this.LJIIIZ), context, enumC37128Ehg);
        }
        List<? extends InterfaceC38628FEa> list = this.LIZJ;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                InterfaceC38628FEa interfaceC38628FEa = (InterfaceC38628FEa) it.next();
                if (!(interfaceC38628FEa instanceof C38632FEe)) {
                    InterfaceC38628FEa parent = interfaceC38628FEa.getParent();
                    if (parent == null || (parent instanceof C38632FEe)) {
                        context2 = context;
                    } else {
                        context2 = parent.getContext();
                    }
                    interfaceC38628FEa.LJIIJ(context2);
                }
            }
            return;
        }
        throw new IllegalStateException("dfsViewCreatorList is null.");
    }

    public FEY(int i, AbstractC38635FEh abstractC38635FEh, FE3 fe3) {
        this.LJIIIZ = i;
        this.LJIIJ = abstractC38635FEh;
        this.LJIIL = fe3;
    }

    @Override // X.InterfaceC38616FDo
    public final View LIZLLL(Context context, ViewGroup viewGroup, boolean z) {
        o.LJIIJ(context, "context");
        FEZ LJI = LJI();
        if (LJI.LIZ >= 0) {
            LJI.LIZIZ();
            int i = LJI.LIZIZ.get();
            if (i != LJI.LIZ) {
                if (i <= LJI.LIZ) {
                    ReentrantLock reentrantLock = LJI.LIZJ;
                    reentrantLock.lock();
                    try {
                        LJI.LIZIZ();
                        if (LJI.LIZIZ.get() != LJI.LIZ) {
                            LJI.LIZLLL.await();
                        }
                        LJI.LIZIZ();
                    } finally {
                        reentrantLock.unlock();
                    }
                } else {
                    StringBuilder LJ = C7MY.LJ("created view count ", i, " is bigger than total view count ");
                    throw new IllegalStateException(b0.LIZJ(LJ, LJI.LIZ, '.', LJ));
                }
            }
            LIZIZ();
            LJIIIZ(context);
            InterfaceC38628FEa interfaceC38628FEa = this.LJIIJ;
            if (interfaceC38628FEa instanceof C38632FEe) {
                if (viewGroup != null && z) {
                    List<InterfaceC38628FEa> LIZ = interfaceC38628FEa.LIZ();
                    if (LIZ != null) {
                        for (InterfaceC38628FEa interfaceC38628FEa2 : LIZ) {
                            interfaceC38628FEa2.LJIIIIZZ(viewGroup);
                            viewGroup.addView(interfaceC38628FEa2.LJII());
                        }
                        return viewGroup;
                    }
                    return viewGroup;
                }
                throw new IllegalStateException("<merge /> can be used only with a valid ViewGroup root and attachToRoot=true");
            }
            if (viewGroup != null) {
                interfaceC38628FEa.LJIIIIZZ(viewGroup);
                if (z) {
                    viewGroup.addView(interfaceC38628FEa.LJII());
                }
            }
            if (viewGroup != null && z) {
                return viewGroup;
            }
            return this.LJIIJ.LJII();
        }
        throw new IllegalStateException("view count <= 0, please call #ViewSizeCountersetViewCount first.");
    }
}
