package X;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.o;

/* renamed from: X.FEh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38635FEh implements InterfaceC38628FEa {
    public AbstractC38635FEh LIZ;
    public volatile View LIZJ;
    public volatile boolean LJ;
    public InterfaceC38638FEk LJFF;
    public AttributeSet LJI;
    public volatile Context LJII;
    public InterfaceC38637FEj LJIIIIZZ;
    public InterfaceC38630FEc LJIIIZ;
    public final LinkedList<InterfaceC38628FEa> LIZIZ = new LinkedList<>();
    public final AtomicReference<EnumC38636FEi> LIZLLL = new AtomicReference<>(EnumC38636FEi.UN_CREATED);

    @Override // X.InterfaceC38628FEa
    public int LJI() {
        return 0;
    }

    public boolean LJIIJJI(Context context) {
        o.LJIIJ(context, "context");
        return true;
    }

    public abstract View LJIILJJIL(Context context, AttributeSet attributeSet);

    @Override // X.InterfaceC38628FEa
    public final List<InterfaceC38628FEa> LIZ() {
        if (this.LIZIZ.isEmpty()) {
            return null;
        }
        return this.LIZIZ;
    }

    public final void LJIIL() {
        InterfaceC38637FEj interfaceC38637FEj = this.LJIIIIZZ;
        if (interfaceC38637FEj != null) {
            interfaceC38637FEj.LJIIIZ();
        }
        AttributeSet attributeSet = this.LJI;
        if (attributeSet != null) {
            try {
                ((XmlResourceParser) attributeSet).close();
            } catch (Throwable unused) {
            }
            this.LJI = null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:29|(3:35|36|(5:13|14|(3:19|21|15)|23|24)(2:11|12))|31|32|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0024 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.AttributeSet LJIILL() {
        /*
            r5 = this;
            android.util.AttributeSet r0 = r5.LJI
            if (r0 == 0) goto L5
            return r0
        L5:
            X.FEk r0 = r5.LJFF
            r4 = 0
            if (r0 == 0) goto L4c
            byte[] r2 = r0.getData()
            if (r2 != 0) goto L14
        L10:
            r3 = r4
        L11:
            if (r3 == 0) goto L44
            goto L24
        L14:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            if (r1 < r0) goto L1f
            android.util.AttributeSet r3 = X.C0M3.LIZIZ(r2)     // Catch: java.lang.Throwable -> L1f
            goto L11
        L1f:
            android.util.AttributeSet r3 = X.C0M3.LIZ(r2)     // Catch: java.lang.Throwable -> L10
            goto L11
        L24:
            r2 = r3
            android.content.res.XmlResourceParser r2 = (android.content.res.XmlResourceParser) r2     // Catch: java.lang.Throwable -> L39
            int r1 = r2.next()     // Catch: java.lang.Throwable -> L39
        L2b:
            r0 = 2
            if (r1 == r0) goto L36
            r0 = 1
            if (r1 == r0) goto L36
            int r1 = r2.next()     // Catch: java.lang.Throwable -> L39
            goto L2b
        L36:
            r5.LJI = r3
            return r3
        L39:
            r2 = move-exception
            r5.LJI = r4
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Invalid AttributeSet"
            r1.<init>(r0, r2)
            throw r1
        L44:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot create AttributeSet."
            r1.<init>(r0)
            throw r1
        L4c:
            java.lang.String r0 = "attributeDataProvider"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC38635FEh.LJIILL():android.util.AttributeSet");
    }

    @Override // X.InterfaceC38628FEa
    public Context getContext() {
        Context context = this.LJII;
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Please call ViewCreator#tryCreateView() first.");
    }

    @Override // X.InterfaceC38628FEa
    public final View LJII() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Please call ViewSizeCounter#waitAllViewCreated() first.");
    }

    @Override // X.InterfaceC38628FEa
    public InterfaceC38628FEa getParent() {
        return this.LIZ;
    }

    @Override // X.InterfaceC38628FEa
    public View getView() {
        return this.LIZJ;
    }

    private final Context LJIILIIL(Context context) {
        Context context2 = this.LJII;
        if (context2 != null) {
            return context2;
        }
        InterfaceC38637FEj interfaceC38637FEj = this.LJIIIIZZ;
        if (interfaceC38637FEj != null) {
            interfaceC38637FEj.LJFF();
        }
        this.LJII = context;
        return context;
    }

    public static boolean LJIILLIIL(Context context) {
        o.LJIIJ(context, "context");
        if (C109434Rf.LIZJ(context) != null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC38628FEa
    public final void LIZJ(Context parentContext) {
        View view;
        o.LJIIJ(parentContext, "parentContext");
        if (this.LIZJ != null) {
            return;
        }
        Context LJIILIIL = LJIILIIL(parentContext);
        if (LJIIJJI(LJIILIIL)) {
            AtomicReference<EnumC38636FEi> atomicReference = this.LIZLLL;
            EnumC38636FEi enumC38636FEi = EnumC38636FEi.UN_CREATED;
            EnumC38636FEi enumC38636FEi2 = EnumC38636FEi.CREATING;
            while (!atomicReference.compareAndSet(enumC38636FEi, enumC38636FEi2)) {
                if (atomicReference.get() != enumC38636FEi) {
                    return;
                }
            }
            View LJIILJJIL = LJIILJJIL(LJIILIIL, LJIILL());
            this.LIZJ = LJIILJJIL;
            this.LIZLLL.set(EnumC38636FEi.CREATED);
            InterfaceC38637FEj interfaceC38637FEj = this.LJIIIIZZ;
            if (interfaceC38637FEj != null) {
                interfaceC38637FEj.LIZIZ(LJIILJJIL);
            }
            AbstractC38635FEh abstractC38635FEh = this.LIZ;
            if (!(abstractC38635FEh instanceof C38632FEe) && abstractC38635FEh != null && (view = abstractC38635FEh.getView()) != null) {
                LJIIIIZZ((ViewGroup) view);
            }
            InterfaceC38630FEc interfaceC38630FEc = this.LJIIIZ;
            if (interfaceC38630FEc != null) {
                interfaceC38630FEc.LIZ();
            } else {
                o.LJIJI("viewSizeCounterProducer");
                throw null;
            }
        }
    }

    @Override // X.InterfaceC38628FEa
    public void LIZLLL(FEZ fez) {
        this.LJIIIZ = fez;
    }

    @Override // X.InterfaceC38628FEa
    public final void LJIIIIZZ(ViewGroup parentView) {
        ViewGroup.LayoutParams LJ;
        o.LJIIJ(parentView, "parentView");
        View view = getView();
        if (view != null && !this.LJ) {
            synchronized (this) {
                if (!this.LJ) {
                    InterfaceC38637FEj interfaceC38637FEj = this.LJIIIIZZ;
                    if (interfaceC38637FEj != null && (LJ = interfaceC38637FEj.LJ(parentView)) != null) {
                        view.setLayoutParams(LJ);
                    } else {
                        view.setLayoutParams(parentView.generateLayoutParams(LJIILL()));
                    }
                    this.LJ = true;
                    LJIIL();
                }
            }
        }
    }

    @Override // X.InterfaceC38628FEa
    public final void LJIIJ(Context parentContext) {
        o.LJIIJ(parentContext, "parentContext");
        this.LJII = null;
        LJIILIIL(parentContext);
        View view = getView();
        if (view != null) {
            C14630hn.LIZIZ(getContext(), view);
        }
    }

    public void LJIIZILJ(AbstractC38635FEh abstractC38635FEh) {
        this.LIZ = abstractC38635FEh;
        abstractC38635FEh.LIZIZ.add(this);
    }
}
