package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import okhttp3.Request;

/* loaded from: classes12.dex */
public final class PW8 implements PXZ {
    public final List<InterfaceC48121Iub> LIZ;
    public final C64583PWh LIZIZ;
    public final PW9 LIZJ;
    public final C64561PVl LIZLLL;
    public final int LJ;
    public final Request LJFF;
    public final InterfaceC48133Iun LJI;
    public final AbstractC64590PWo LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;
    public int LJIIJJI;

    @Override // X.PXZ
    public final int LIZIZ() {
        return this.LJIIIZ;
    }

    @Override // X.PXZ
    public final int LIZJ() {
        return this.LJIIJ;
    }

    @Override // X.PXZ
    public final InterfaceC48133Iun call() {
        return this.LJI;
    }

    @Override // X.PXZ
    public final Request request() {
        return this.LJFF;
    }

    @Override // X.PXZ
    public final C64598PWw LIZ(Request request) {
        return LIZLLL(request, this.LIZIZ, this.LIZJ, this.LIZLLL);
    }

    public final C64598PWw LIZLLL(Request request, C64583PWh c64583PWh, PW9 pw9, C64561PVl c64561PVl) {
        if (this.LJ < this.LIZ.size()) {
            this.LJIIJJI++;
            if (this.LIZJ == null || this.LIZLLL.LJIIJ(request.url())) {
                if (this.LIZJ == null || this.LJIIJJI <= 1) {
                    List<InterfaceC48121Iub> list = this.LIZ;
                    int i = this.LJ;
                    PW8 pw8 = new PW8(list, c64583PWh, pw9, c64561PVl, i + 1, request, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ);
                    InterfaceC48121Iub interfaceC48121Iub = (InterfaceC48121Iub) ListProtector.get(list, i);
                    C64598PWw intercept = interfaceC48121Iub.intercept(pw8);
                    if (pw9 == null || this.LJ + 1 >= this.LIZ.size() || pw8.LJIIJJI == 1) {
                        if (intercept != null) {
                            if (intercept.LJLJL != null) {
                                return intercept;
                            }
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("interceptor ");
                            LIZ.append(interfaceC48121Iub);
                            LIZ.append(" returned a response with no body");
                            throw new IllegalStateException(X1D.LIZIZ(LIZ));
                        }
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("interceptor ");
                        LIZ2.append(interfaceC48121Iub);
                        LIZ2.append(" returned null");
                        throw new NullPointerException(X1D.LIZIZ(LIZ2));
                    }
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("network interceptor ");
                    LIZ3.append(interfaceC48121Iub);
                    LIZ3.append(" must call proceed() exactly once");
                    throw new IllegalStateException(X1D.LIZIZ(LIZ3));
                }
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("network interceptor ");
                LIZ4.append(ListProtector.get(this.LIZ, this.LJ - 1));
                LIZ4.append(" must call proceed() exactly once");
                throw new IllegalStateException(X1D.LIZIZ(LIZ4));
            }
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("network interceptor ");
            LIZ5.append(ListProtector.get(this.LIZ, this.LJ - 1));
            LIZ5.append(" must retain the same host and port");
            throw new IllegalStateException(X1D.LIZIZ(LIZ5));
        }
        throw new AssertionError();
    }

    public PW8(List<InterfaceC48121Iub> list, C64583PWh c64583PWh, PW9 pw9, C64561PVl c64561PVl, int i, Request request, InterfaceC48133Iun interfaceC48133Iun, AbstractC64590PWo abstractC64590PWo, int i2, int i3, int i4) {
        this.LIZ = list;
        this.LIZLLL = c64561PVl;
        this.LIZIZ = c64583PWh;
        this.LIZJ = pw9;
        this.LJ = i;
        this.LJFF = request;
        this.LJI = interfaceC48133Iun;
        this.LJII = abstractC64590PWo;
        this.LJIIIIZZ = i2;
        this.LJIIIZ = i3;
        this.LJIIJ = i4;
    }
}
