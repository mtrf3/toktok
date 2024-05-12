package X;

import Y.IDRunnableS6S0101000;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.98T, reason: invalid class name */
/* loaded from: classes5.dex */
public abstract class C98T implements View.OnClickListener {
    public static final /* synthetic */ int LJLJJI = 0;
    public final long LJLIL;
    public boolean LJLILLLLZI;
    public final IDRunnableS6S0101000 LJLJI;

    public abstract void LIZ(View view);

    public /* synthetic */ C98T() {
        this(300L);
    }

    public C98T(long j) {
        this.LJLILLLLZI = true;
        this.LJLJI = new IDRunnableS6S0101000(2, this, 0);
        this.LJLIL = j;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v) {
        o.LJIIIZ(v, "v");
        if (this.LJLILLLLZI) {
            this.LJLILLLLZI = false;
            v.postDelayed(this.LJLJI, this.LJLIL);
            LIZ(v);
        }
    }
}
