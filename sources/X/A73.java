package X;

import Y.ARunnableS40S0100000_4;
import android.os.Handler;
import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public abstract class A73 implements InterfaceC31687Cc7 {
    public final long LIZ;
    public boolean LIZIZ;
    public final Handler LIZJ;
    public final ARunnableS40S0100000_4 LIZLLL;

    public abstract void LIZIZ(String str);

    public /* synthetic */ A73() {
        this(300L);
    }

    public A73(long j) {
        this.LIZ = j;
        this.LIZIZ = true;
        this.LIZJ = new Handler(C16880lQ.LLJJJJ());
        this.LIZLLL = new ARunnableS40S0100000_4(this, 16);
    }

    @Override // X.InterfaceC31687Cc7
    public final void LIZ(View v, String str) {
        o.LJIIIZ(v, "v");
        if (this.LIZIZ) {
            this.LIZIZ = false;
            this.LIZJ.postDelayed(this.LIZLLL, this.LIZ);
            LIZIZ(str);
        }
    }
}
