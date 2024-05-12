package X;

import android.content.Context;
import android.os.Handler;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.TraceEvent;
import o53.IDdS478S0100000_13;

/* loaded from: classes14.dex */
public class V9H {
    public static final Handler LJJIIZ = new Handler(C16880lQ.LLJJJJ());
    public final Context LIZ;
    public final AbstractC81686W4c LIZIZ;
    public IDdS478S0100000_13 LIZJ;
    public int LJ;
    public int LJFF;
    public boolean LJII;
    public VQQ LJIIIIZZ;
    public boolean LJIIIZ;
    public C81250Vug<V92> LJIIJ;
    public C81250Vug<V92> LJIIJJI;
    public V9K LJIIL;
    public final V9C LJIILIIL;
    public C79266V9a LJIILJJIL;
    public C61828OOi LJIILL;
    public int LJIILLIIL;
    public int LJIIZILJ;
    public int LJIJ;
    public int LJIJI;
    public final boolean LJIJJ;
    public int LJIJJLI;
    public C81392Vwy<?> LJIL;
    public boolean LJJ;
    public final boolean LJJI;
    public boolean LJJIFFI;
    public V8L LJJII;
    public V92 LJJIII;
    public final C79285V9t LJJIIJ;
    public long LJJIIJZLJL;
    public InterfaceC78716Uuu LJI = InterfaceC78716Uuu.LJJJLZIJ;
    public final Object LIZLLL = null;

    public final void LIZJ() {
        this.LJIIIZ = true;
        if (this.LJIIJ != null) {
            this.LJJIIJZLJL = System.currentTimeMillis();
            this.LJIIJ.LJ();
        }
    }

    public final void LIZLLL() {
        this.LJIIIZ = false;
        C81250Vug<V92> c81250Vug = this.LJIIJ;
        if (c81250Vug != null) {
            c81250Vug.LJFF();
        }
        V9K v9k = this.LJIIL;
        if (v9k != null) {
            v9k.LJFF();
        }
        C79285V9t c79285V9t = this.LJJIIJ;
        c79285V9t.LIZJ = 0;
        c79285V9t.LIZLLL = 0;
        c79285V9t.LJJI = null;
        C81392Vwy<?> c81392Vwy = this.LJIL;
        if (c81392Vwy != null) {
            c81392Vwy.close();
            this.LJIL = null;
        }
    }

    public V9H(Context context, C81705W4v c81705W4v, V9C v9c, boolean z) {
        this.LIZ = context;
        this.LIZIZ = c81705W4v;
        this.LJIILIIL = v9c;
        VNU LJJJJI = C78996UzQ.LJJJJI(context);
        if (LJJJJI != null) {
            this.LJJI = LJJJJI.LLIILII;
        }
        this.LJJIFFI = !LynxEnv.LJIIIZ().LJJII;
        C79285V9t c79285V9t = new C79285V9t(context, new V9J(this));
        this.LJJIIJ = c79285V9t;
        this.LJIJJ = z;
        c79285V9t.LJIL = z;
    }

    public final void LIZIZ(int i, int i2, int i3, int i4, int i5, int i6) {
        C81392Vwy<?> c81392Vwy;
        if (this.LJ != i || this.LJFF != i2) {
            this.LJ = i;
            this.LJFF = i2;
            this.LJII = true;
        }
        this.LJIILLIIL = i3;
        this.LJIIZILJ = i5;
        this.LJIJ = i4;
        this.LJIJI = i6;
        if (!this.LJII) {
            return;
        }
        if ((i <= 0 || i2 <= 0) && !this.LJJIIJ.LJI) {
            return;
        }
        C79285V9t c79285V9t = this.LJJIIJ;
        if (c79285V9t.LJIILLIIL == null && c79285V9t.LJIIZILJ == null) {
            return;
        }
        TraceEvent.LIZIZ("LynxImageManager.maybeUpdateView");
        this.LJJIIJ.LJIIL(i, i2);
        if (this.LJJIIJ.LJIIL && (((c81392Vwy = this.LJIL) != null && c81392Vwy.LJIIJ() && this.LJIL.LJI() != null) || this.LJJIIJ.LJIILIIL)) {
            TraceEvent.LJ("LynxImageManager.maybeUpdateView");
        } else {
            LJ(i, i2, i3, i4, i5, i6);
            TraceEvent.LJ("LynxImageManager.maybeUpdateView");
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:(3:79|80|(2:84|(4:86|18|(10:20|(1:22)|23|(1:25)|26|(4:28|(2:30|(2:32|33))|44|33)(1:45)|34|(1:40)|41|42)|47)))|9|10|(1:16)|47) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00bb, code lost:
    
        if (r4 != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0143, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(int r18, int r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V9H.LJ(int, int, int, int, int, int):void");
    }

    public final C79266V9a LIZ(C117434jD c117434jD, int i, int i2, int i3, int i4, int i5, int i6, float[] fArr, InterfaceC78716Uuu interfaceC78716Uuu) {
        return this.LJJIIJ.LIZIZ(c117434jD, i, i2, i3, i4, i5, i6, fArr, interfaceC78716Uuu);
    }
}
