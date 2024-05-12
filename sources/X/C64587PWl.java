package X;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import okhttp3.Request;

/* renamed from: X.PWl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64587PWl implements InterfaceC48133Iun {
    public final C64600PWy LJLIL;
    public final C64584PWi LJLILLLLZI;
    public final C64593PWr LJLJI;
    public AbstractC64590PWo LJLJJI;
    public final Request LJLJJL;
    public final boolean LJLJJLL;
    public boolean LJLJL;

    @Override // X.InterfaceC48133Iun
    public final void cancel() {
        LIZ(-1);
    }

    @Override // X.InterfaceC48133Iun
    public final C64598PWw execute() {
        synchronized (this) {
            if (!this.LJLJL) {
                this.LJLJL = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        this.LJLILLLLZI.LIZJ = P9A.LIZ.LJIIIZ();
        this.LJLJI.LJIIIIZZ();
        this.LJLJJI.callStart(this);
        try {
            try {
                this.LJLIL.LJLIL.LIZIZ(this);
                C64598PWw LIZIZ = LIZIZ();
                if (LIZIZ != null) {
                    return LIZIZ;
                }
                throw new IOException("Canceled");
            } catch (IOException e) {
                IOException LIZLLL = LIZLLL(e);
                this.LJLJJI.callFailed(this, LIZLLL);
                throw LIZLLL;
            }
        } finally {
            this.LJLIL.LJLIL.LJ(this);
        }
    }

    public final C64598PWw LIZIZ() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.LJLIL.LJLJJL);
        arrayList.add(this.LJLILLLLZI);
        arrayList.add(new PW0(this.LJLIL.LJLJLLL));
        this.LJLIL.getClass();
        arrayList.add(new C64596PWu());
        arrayList.add(new PWA(this.LJLIL));
        if (!this.LJLJJLL) {
            arrayList.addAll(this.LJLIL.LJLJJLL);
        }
        arrayList.add(new PW7(this.LJLJJLL));
        Request request = this.LJLJJL;
        AbstractC64590PWo abstractC64590PWo = this.LJLJJI;
        C64600PWy c64600PWy = this.LJLIL;
        C64598PWw LIZ = new PW8(arrayList, null, null, null, 0, request, this, abstractC64590PWo, c64600PWy.LLF, c64600PWy.LLFF, c64600PWy.LLFFF).LIZ(request);
        if (!this.LJLILLLLZI.LIZLLL) {
            return LIZ;
        }
        PVA.LJ(LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Canceled#Reason=");
        LIZ2.append(this.LJLILLLLZI.LIZLLL);
        throw new IOException(X1D.LIZIZ(LIZ2));
    }

    public final Object clone() {
        return LIZJ(this.LJLIL, this.LJLJJL, this.LJLJJLL);
    }

    @Override // X.InterfaceC48133Iun
    public final boolean isCanceled() {
        return this.LJLILLLLZI.LIZLLL;
    }

    public final String LJ() {
        String str;
        String str2;
        StringBuilder LIZ = X1D.LIZ();
        if (this.LJLILLLLZI.LIZLLL) {
            str = "canceled ";
        } else {
            str = "";
        }
        LIZ.append(str);
        if (this.LJLJJLL) {
            str2 = "web socket";
        } else {
            str2 = "call";
        }
        LIZ.append(str2);
        LIZ.append(" to ");
        LIZ.append(this.LJLJJL.url().LJIJI());
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC48133Iun
    public final Request request() {
        return this.LJLJJL;
    }

    public final void LIZ(int i) {
        PW9 pw9;
        C64561PVl c64561PVl;
        C64584PWi c64584PWi = this.LJLILLLLZI;
        c64584PWi.LJ = i;
        c64584PWi.LIZLLL = true;
        C64583PWh c64583PWh = c64584PWi.LIZIZ;
        if (c64583PWh != null) {
            synchronized (c64583PWh.LIZLLL) {
                c64583PWh.LJIIL = true;
                c64583PWh.LJIILIIL = i;
                pw9 = c64583PWh.LJIILJJIL;
                c64561PVl = c64583PWh.LJIIIZ;
            }
            if (pw9 != null) {
                pw9.cancel();
            } else {
                if (c64561PVl == null) {
                    return;
                }
                PVA.LJFF(c64561PVl.LIZLLL);
            }
        }
    }

    public final IOException LIZLLL(IOException iOException) {
        if (!this.LJLJI.LJIIIZ()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    @Override // X.InterfaceC48133Iun
    public final void LLIZLLLIL(PX8 px8) {
        synchronized (this) {
            if (!this.LJLJL) {
                this.LJLJL = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        this.LJLILLLLZI.LIZJ = P9A.LIZ.LJIIIZ();
        this.LJLJJI.callStart(this);
        this.LJLIL.LJLIL.LIZ(new C64589PWn(this, px8));
    }

    public C64587PWl(C64600PWy c64600PWy, Request request, boolean z) {
        this.LJLIL = c64600PWy;
        this.LJLJJL = request;
        this.LJLJJLL = z;
        this.LJLILLLLZI = new C64584PWi(c64600PWy);
        C64593PWr c64593PWr = new C64593PWr(this);
        this.LJLJI = c64593PWr;
        c64593PWr.LJI(c64600PWy.LLD, TimeUnit.MILLISECONDS);
    }

    public static C64587PWl LIZJ(C64600PWy c64600PWy, Request request, boolean z) {
        C64587PWl c64587PWl = new C64587PWl(c64600PWy, request, z);
        c64587PWl.LJLJJI = c64600PWy.LJLJL.create(c64587PWl);
        return c64587PWl;
    }
}
