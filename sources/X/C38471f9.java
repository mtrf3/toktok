package X;

import android.content.Context;
import android.os.Build;
import java.io.File;

/* renamed from: X.1f9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38471f9 implements InterfaceC262611i {
    @Override // X.InterfaceC262611i
    public final InterfaceC262711j LIZ(C262511h c262511h) {
        final Context context = c262511h.LIZ;
        final String str = c262511h.LIZIZ;
        final AbstractC262311f abstractC262311f = c262511h.LIZJ;
        final boolean z = c262511h.LIZLLL;
        return new InterfaceC262711j(context, str, abstractC262311f, z) { // from class: X.1f8
            public final Context LJLIL;
            public final String LJLILLLLZI;
            public final AbstractC262311f LJLJI;
            public final boolean LJLJJI;
            public final Object LJLJJL = new Object();
            public C268213m LJLJJLL;
            public boolean LJLJL;

            public final C268213m LIZ() {
                C268213m c268213m;
                synchronized (this.LJLJJL) {
                    if (this.LJLJJLL == null) {
                        C38451f7[] c38451f7Arr = new C38451f7[1];
                        if (Build.VERSION.SDK_INT >= 23 && this.LJLILLLLZI != null && this.LJLJJI) {
                            this.LJLJJLL = new C268213m(this.LJLIL, new File(this.LJLIL.getNoBackupFilesDir(), this.LJLILLLLZI).getAbsolutePath(), c38451f7Arr, this.LJLJI);
                        } else {
                            this.LJLJJLL = new C268213m(this.LJLIL, this.LJLILLLLZI, c38451f7Arr, this.LJLJI);
                        }
                        this.LJLJJLL.setWriteAheadLoggingEnabled(this.LJLJL);
                    }
                    c268213m = this.LJLJJLL;
                }
                return c268213m;
            }

            @Override // X.InterfaceC262711j
            public final InterfaceC262211e LJLJLLL() {
                return LIZ().LIZIZ();
            }

            @Override // X.InterfaceC262711j, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                LIZ().close();
            }

            @Override // X.InterfaceC262711j
            public final String getDatabaseName() {
                return this.LJLILLLLZI;
            }

            @Override // X.InterfaceC262711j
            public final void setWriteAheadLoggingEnabled(boolean z2) {
                synchronized (this.LJLJJL) {
                    C268213m c268213m = this.LJLJJLL;
                    if (c268213m != null) {
                        c268213m.setWriteAheadLoggingEnabled(z2);
                    }
                    this.LJLJL = z2;
                }
            }

            {
                this.LJLIL = context;
                this.LJLILLLLZI = str;
                this.LJLJI = abstractC262311f;
                this.LJLJJI = z;
            }
        };
    }
}
