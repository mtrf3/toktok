package X;

import kotlin.jvm.internal.o;

/* renamed from: X.U8i, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class RunnableC76700U8i implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ C76699U8h LJLILLLLZI;
    public final /* synthetic */ C76696U8e LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ C34K LJLJJL;
    public final /* synthetic */ C76737U9t LJLJJLL;
    public final /* synthetic */ U9O LJLJL;

    public RunnableC76700U8i(int i, C76699U8h c76699U8h, C76696U8e c76696U8e, boolean z, C34K c34k, C76737U9t c76737U9t, U9O u9o) {
        this.LJLIL = i;
        this.LJLILLLLZI = c76699U8h;
        this.LJLJI = c76696U8e;
        this.LJLJJI = z;
        this.LJLJJL = c34k;
        this.LJLJJLL = c76737U9t;
        this.LJLJL = u9o;
    }

    public final void LIZ() {
        boolean z;
        boolean z2;
        C75786Tok c75786Tok;
        C76701U8j c76701U8j;
        EnumC75419Tip enumC75419Tip;
        C76737U9t c76737U9t;
        if (this.LJLIL == 0) {
            this.LJLILLLLZI.LJLJLLL = this.LJLJI.getMOffsetY();
        }
        String LJIIIZ = C76696U8e.LJIIIZ(377);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLJI.getTAG());
        LIZ.append(":check update pos = ");
        LIZ.append(this.LJLIL);
        LIZ.append(" needUpdateState=");
        LIZ.append(this.LJLJJI);
        LIZ.append(" maskWindow.micWindow.micInfo.isStateUpdated()=");
        C76701U8j c76701U8j2 = this.LJLILLLLZI.LJLJI.LJLIL;
        EnumC75419Tip enumC75419Tip2 = c76701U8j2.LIZ;
        if (enumC75419Tip2 != null && enumC75419Tip2 != c76701U8j2.LJFF) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(z);
        LIZ.append(" sizeChange=");
        LIZ.append(this.LJLJJL.element);
        LIZ.append(" extraWrapper?.hasChanged == true=");
        C76737U9t c76737U9t2 = this.LJLJJLL;
        if (c76737U9t2 != null && c76737U9t2.LJLIL) {
            z2 = true;
        } else {
            z2 = false;
        }
        LIZ.append(z2);
        C32014ChO.LJFF(LJIIIZ, X1D.LIZIZ(LIZ));
        if (this.LJLJJI || (((enumC75419Tip = (c76701U8j = this.LJLILLLLZI.LJLJI.LJLIL).LIZ) != null && enumC75419Tip != c76701U8j.LJFF) || this.LJLJJL.element || ((c76737U9t = this.LJLJJLL) != null && c76737U9t.LJLIL))) {
            String LJIIIZ2 = C76696U8e.LJIIIZ(377);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(this.LJLJI.getTAG());
            LIZ2.append(":on window state change. pos = ");
            LIZ2.append(this.LJLIL);
            C32014ChO.LJFF(LJIIIZ2, X1D.LIZIZ(LIZ2));
            InterfaceC76112Tu0 interfaceC76112Tu0 = this.LJLJI.LJLJLLL;
            C76699U8h c76699U8h = this.LJLILLLLZI;
            C76701U8j c76701U8j3 = c76699U8h.LJLJI.LJLIL;
            EnumC75419Tip enumC75419Tip3 = c76701U8j3.LJFF;
            EnumC75419Tip enumC75419Tip4 = c76701U8j3.LIZ;
            o.LJI(enumC75419Tip4);
            U9O u9o = this.LJLJL;
            C76737U9t c76737U9t3 = this.LJLJJLL;
            if (c76737U9t3 != null) {
                c75786Tok = c76737U9t3.LJLILLLLZI;
            } else {
                c75786Tok = null;
            }
            interfaceC76112Tu0.LLIIJLIL(c76699U8h, enumC75419Tip3, enumC75419Tip4, u9o, c75786Tok);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
