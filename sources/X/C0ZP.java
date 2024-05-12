package X;

import X.C1PE;
import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: X.0ZP, reason: invalid class name */
/* loaded from: classes.dex */
public class C0ZP<D> {
    public int LIZ;
    public C0ZO<D> LIZIZ;
    public final Context LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF = true;
    public boolean LJI;
    public boolean LJII;

    public final void LIZ() {
        C1PE c1pe = (C1PE) this;
        if (c1pe.LJIIIZ != null) {
            if (!c1pe.LIZLLL) {
                c1pe.LJI = true;
            }
            if (c1pe.LJIIJ != null) {
                c1pe.LJIIIZ.getClass();
                c1pe.LJIIIZ = null;
                return;
            }
            c1pe.LJIIIZ.getClass();
            C1PE<D>.a aVar = c1pe.LJIIIZ;
            aVar.LJLJJI.set(true);
            if (aVar.LJLILLLLZI.cancel(false)) {
                c1pe.LJIIJ = c1pe.LJIIIZ;
                c1pe.LJIIIIZZ();
            }
            c1pe.LJIIIZ = null;
        }
    }

    public void LIZJ(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        throw null;
    }

    public final void LIZLLL() {
        C1PE c1pe = (C1PE) this;
        c1pe.LIZ();
        c1pe.LJIIIZ = new C1PE.a();
        c1pe.LJIIIZ();
    }

    public void LJFF() {
    }

    public void LJI() {
        throw null;
    }

    public void LJII() {
    }

    public void LJ() {
        if (this.LIZLLL) {
            LIZLLL();
        } else {
            this.LJI = true;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        C17N.LJII(this, sb);
        sb.append(" id=");
        sb.append(this.LIZ);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: X.0ZP$a */
    /* loaded from: classes.dex */
    public final class a extends ContentObserver {
        @Override // android.database.ContentObserver
        public final boolean deliverSelfNotifications() {
            return true;
        }

        public a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z) {
            C0ZP.this.LJ();
        }
    }

    public C0ZP(Context context) {
        this.LIZJ = C16880lQ.LLLLL(context);
    }

    public void LIZIZ(D d) {
        C0ZO<D> c0zo = this.LIZIZ;
        if (c0zo != null) {
            c0zo.onLoadComplete(this, d);
        }
    }
}
