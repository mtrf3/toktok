package X;

import android.graphics.Bitmap;
import android.util.Size;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.AqS57S1200000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5Db, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131235Db implements InterfaceC70422pa, C5DX {
    public static final /* synthetic */ int LJLLILLLL = 0;
    public final Size LJLIL;
    public final InterfaceC88472Yns<Boolean, C76800UCe> LJLILLLLZI;
    public final MBA LJLJI;
    public final C5E0 LJLJJI;
    public final List<InterfaceC131385Dq> LJLJJL;
    public final LinkedList<C5D1> LJLJJLL;
    public int LJLJL;
    public final LinkedList<List<C1290754t>> LJLJLJ;
    public int LJLJLLL;
    public final XK4 LJLL;
    public final XK4 LJLLI;

    public final void LIZJ() {
        XKX.LIZLLL(this, C36636EZk.LIZ, null, new C131295Dh(this, null), 2);
    }

    public final void LIZLLL() {
        synchronized (this.LJLJJLL) {
            this.LJLJJLL.clear();
        }
        synchronized (this.LJLJLJ) {
            this.LJLJLJ.clear();
        }
    }

    @Override // X.InterfaceC70422pa
    public final MBA getCoroutineContext() {
        return this.LJLJI;
    }

    public final void LIZIZ(InterfaceC131385Dq request) {
        o.LJIIIZ(request, "request");
        XKX.LIZLLL(this, C78613UtF.LIZ, null, new C131185Cw(this, request, null), 2);
    }

    public final void LJI(boolean z) {
        XKX.LIZLLL(this, C36636EZk.LIZ, null, new C131265De(this, z, null), 2);
    }

    public C131235Db(MBA context, Size size) {
        o.LJIIIZ(context, "context");
        this.LJLIL = size;
        this.LJLILLLLZI = null;
        this.LJLJI = context;
        this.LJLJJI = new C5E0();
        this.LJLJJL = new ArrayList();
        this.LJLJJLL = new LinkedList<>();
        this.LJLJLJ = new LinkedList<>();
        this.LJLL = C78934UyQ.LIZJ(4, null, 6);
        this.LJLLI = C78934UyQ.LIZJ(1, null, 6);
        XIC xic = C78613UtF.LIZ;
        XKX.LIZLLL(C48841JEv.LIZ(xic), null, null, new C131285Dg(this, null), 3);
        XKX.LIZLLL(C48841JEv.LIZ(xic), null, null, new C131275Df(this, null), 3);
    }

    @Override // X.C5DX
    public final void LIZ(C5DY key, Bitmap b) {
        List LLJI;
        o.LJIIIZ(key, "key");
        o.LJIIIZ(b, "b");
        if (!AnonymousClass504.LIZIZ) {
            XKX.LIZLLL(this, C78613UtF.LIZ, null, new C131255Dd(this, key, b, null), 2);
            return;
        }
        this.LJLJJI.LIZLLL(key, b);
        LJII(key, b);
        synchronized (this.LJLJJL) {
            LLJI = ORZ.LLJI(this.LJLJJL);
        }
        C2ND.LIZIZ(new AqS149S0200000_2(LLJI, (List<? extends InterfaceC131385Dq>) key, (C5DY) 90), 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0104 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(boolean r13, X.InterfaceC67352kd<? super X.C76800UCe> r14) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C131235Db.LJ(boolean, X.2kd):java.lang.Object");
    }

    public final Bitmap LJFF(int i, String path) {
        C131475Dz c131475Dz;
        o.LJIIIZ(path, "path");
        C5DY c5dy = new C5DY(path, i, this.LJLJJI.LIZ(path));
        C5E0 c5e0 = this.LJLJJI;
        c5e0.getClass();
        synchronized (c5e0.LIZ) {
            c131475Dz = c5e0.LIZ.get(c5dy);
        }
        C131475Dz c131475Dz2 = c131475Dz;
        if (c131475Dz2 != null) {
            return c131475Dz2.LIZIZ;
        }
        return null;
    }

    public final void LJII(C5DY c5dy, Bitmap bitmap) {
        C5E0 c5e0 = this.LJLJJI;
        String str = c5dy.LIZ;
        int i = c5dy.LIZIZ;
        String str2 = c5dy.LIZJ;
        c5e0.getClass();
        AqS57S1200000_2 aqS57S1200000_2 = new AqS57S1200000_2(C5E0.LIZIZ(i, str, str2), c5dy, bitmap, 4);
        if (!AnonymousClass504.LIZIZ) {
            aqS57S1200000_2.invoke();
        } else {
            XKX.LIZLLL(this, C78613UtF.LIZ, null, new C5D2(aqS57S1200000_2, null), 2);
        }
    }
}
