package X;

import android.graphics.Bitmap;
import ij2.a;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y5Z implements Runnable {
    public final /* synthetic */ Y5W LJLIL;
    public final /* synthetic */ Bitmap LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ int LJLJJLL;
    public final /* synthetic */ int LJLJL;
    public final /* synthetic */ int LJLJLJ;
    public final /* synthetic */ C76732zl LJLJLLL;
    public final /* synthetic */ C76732zl LJLL;

    public Y5Z(Y5W y5w, Bitmap bitmap, boolean z, int i, int i2, int i3, int i4, int i5, C76732zl c76732zl, C76732zl c76732zl2) {
        this.LJLIL = y5w;
        this.LJLILLLLZI = bitmap;
        this.LJLJI = z;
        this.LJLJJI = i;
        this.LJLJJL = i2;
        this.LJLJJLL = i3;
        this.LJLJL = i4;
        this.LJLJLJ = i5;
        this.LJLJLLL = c76732zl;
        this.LJLL = c76732zl2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            a aVar = a.LJIJ;
            Bitmap originalImage = this.LJLILLLLZI;
            o.LJIIIIZZ(originalImage, "originalImage");
            Y5Y y5y = new Y5Y(this);
            aVar.getClass();
            a.LJI(originalImage, y5y);
        } finally {
            if (LIZ) {
            }
        }
    }
}
