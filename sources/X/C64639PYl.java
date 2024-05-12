package X;

import java.io.IOException;
import okhttp3.Request;

/* renamed from: X.PYl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64639PYl<T> implements InterfaceC65079PgR<T> {
    public final C64646PYs LJLIL;
    public final Object[] LJLILLLLZI;
    public final InterfaceC48134Iuo LJLJI;
    public final InterfaceC65017PfR<PVM, T> LJLJJI;
    public volatile boolean LJLJJL;
    public InterfaceC48133Iun LJLJJLL;
    public Throwable LJLJL;
    public boolean LJLJLJ;

    @Override // X.InterfaceC65079PgR
    public final void cancel() {
        InterfaceC48133Iun interfaceC48133Iun;
        this.LJLJJL = true;
        synchronized (this) {
            interfaceC48133Iun = this.LJLJJLL;
        }
        if (interfaceC48133Iun != null) {
            interfaceC48133Iun.cancel();
        }
    }

    @Override // X.InterfaceC65079PgR
    public final C64653PYz<T> execute() {
        InterfaceC48133Iun interfaceC48133Iun;
        C64598PWw execute;
        synchronized (this) {
            if (!this.LJLJLJ) {
                this.LJLJLJ = true;
                Throwable th = this.LJLJL;
                if (th != null) {
                    if (!(th instanceof IOException)) {
                        if (th instanceof RuntimeException) {
                            throw ((RuntimeException) th);
                        }
                        throw ((Error) th);
                    }
                    throw ((IOException) th);
                }
                interfaceC48133Iun = this.LJLJJLL;
                if (interfaceC48133Iun == null) {
                    try {
                        interfaceC48133Iun = LIZ();
                        this.LJLJJLL = interfaceC48133Iun;
                    } catch (IOException | Error | RuntimeException e) {
                        C65138PhO.LJIILIIL(e);
                        this.LJLJL = e;
                        throw e;
                    }
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (this.LJLJJL) {
            interfaceC48133Iun.cancel();
        }
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400102, "okhttp3/Call", "execute", interfaceC48133Iun, new Object[0], "okhttp3.Response", new C65300Pk0(false, "()Lokhttp3/Response;", "8514776090779241298"));
        if (LIZJ.LIZ) {
            execute = (C64598PWw) LIZJ.LIZIZ;
        } else {
            execute = interfaceC48133Iun.execute();
        }
        return LIZIZ(execute);
    }

    @Override // X.InterfaceC65079PgR
    public final synchronized Request request() {
        InterfaceC48133Iun interfaceC48133Iun = this.LJLJJLL;
        if (interfaceC48133Iun != null) {
            return interfaceC48133Iun.request();
        }
        Throwable th = this.LJLJL;
        if (th != null) {
            if (!(th instanceof IOException)) {
                if (th instanceof RuntimeException) {
                    throw ((RuntimeException) th);
                }
                throw ((Error) th);
            }
            throw new RuntimeException("Unable to create request.", this.LJLJL);
        }
        try {
            InterfaceC48133Iun LIZ = LIZ();
            this.LJLJJLL = LIZ;
            return LIZ.request();
        } catch (IOException e) {
            this.LJLJL = e;
            throw new RuntimeException("Unable to create request.", e);
        } catch (Error e2) {
            e = e2;
            C65138PhO.LJIILIIL(e);
            this.LJLJL = e;
            throw e;
        } catch (RuntimeException e3) {
            e = e3;
            C65138PhO.LJIILIIL(e);
            this.LJLJL = e;
            throw e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cf, code lost:
    
        if (r8 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC48133Iun LIZ() {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64639PYl.LIZ():X.Iun");
    }

    @Override // X.InterfaceC65079PgR
    /* renamed from: clone */
    public final InterfaceC65079PgR m32clone() {
        return new C64639PYl(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI);
    }

    @Override // X.InterfaceC65079PgR
    public final boolean isCanceled() {
        boolean z = true;
        if (this.LJLJJL) {
            return true;
        }
        synchronized (this) {
            InterfaceC48133Iun interfaceC48133Iun = this.LJLJJLL;
            if (interfaceC48133Iun == null || !interfaceC48133Iun.isCanceled()) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: clone, reason: collision with other method in class */
    public final Object m30clone() {
        return new C64639PYl(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI);
    }

    public final C64653PYz<T> LIZIZ(C64598PWw c64598PWw) {
        PVM pvm = c64598PWw.LJLJL;
        C64597PWv c64597PWv = new C64597PWv(c64598PWw);
        c64597PWv.LJI = new PVL(pvm.contentType(), pvm.contentLength());
        C64598PWw LIZ = c64597PWv.LIZ();
        int i = LIZ.LJLJI;
        if (i >= 200 && i < 300) {
            if (i == 204 || i == 205) {
                pvm.close();
                if (LIZ.LIZIZ()) {
                    return new C64653PYz<>(LIZ, null, null);
                }
                throw new IllegalArgumentException("rawResponse must be successful response");
            }
            PVK pvk = new PVK(pvm);
            try {
                T LIZ2 = this.LJLJJI.LIZ(pvk);
                if (LIZ.LIZIZ()) {
                    return new C64653PYz<>(LIZ, LIZ2, null);
                }
                throw new IllegalArgumentException("rawResponse must be successful response");
            } catch (RuntimeException e) {
                IOException iOException = pvk.LJLJI;
                if (iOException == null) {
                    throw e;
                }
                throw iOException;
            }
        }
        try {
            C64533PUj c64533PUj = new C64533PUj();
            pvm.source().LLJJLIIIJLLLLLLLZ(c64533PUj);
            PVM create = PVM.create(pvm.contentType(), pvm.contentLength(), c64533PUj);
            C65138PhO.LIZ(create, "body == null");
            if (!LIZ.LIZIZ()) {
                return new C64653PYz<>(LIZ, null, create);
            }
            throw new IllegalArgumentException("rawResponse should not be successful response");
        } finally {
            pvm.close();
        }
    }

    @Override // X.InterfaceC65079PgR
    public final void LLLZ(InterfaceC64642PYo<T> interfaceC64642PYo) {
        InterfaceC48133Iun interfaceC48133Iun;
        Throwable th;
        synchronized (this) {
            if (!this.LJLJLJ) {
                this.LJLJLJ = true;
                interfaceC48133Iun = this.LJLJJLL;
                th = this.LJLJL;
                if (interfaceC48133Iun == null && th == null) {
                    try {
                        InterfaceC48133Iun LIZ = LIZ();
                        this.LJLJJLL = LIZ;
                        interfaceC48133Iun = LIZ;
                    } catch (Throwable th2) {
                        th = th2;
                        C65138PhO.LJIILIIL(th);
                        this.LJLJL = th;
                    }
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (th != null) {
            interfaceC64642PYo.onFailure(this, th);
            return;
        }
        if (this.LJLJJL) {
            interfaceC48133Iun.cancel();
        }
        C64640PYm c64640PYm = new C64640PYm(this, interfaceC64642PYo);
        if (new C03880Dg(2).LIZJ(400103, "okhttp3/Call", "enqueue", interfaceC48133Iun, new Object[]{c64640PYm}, "void", new C65300Pk0(false, "(Lokhttp3/Callback;)V", "8514776090779241298")).LIZ) {
            return;
        }
        interfaceC48133Iun.LLIZLLLIL(c64640PYm);
    }

    public C64639PYl(C64646PYs c64646PYs, Object[] objArr, InterfaceC48134Iuo interfaceC48134Iuo, InterfaceC65017PfR<PVM, T> interfaceC65017PfR) {
        this.LJLIL = c64646PYs;
        this.LJLILLLLZI = objArr;
        this.LJLJI = interfaceC48134Iuo;
        this.LJLJJI = interfaceC65017PfR;
    }
}
