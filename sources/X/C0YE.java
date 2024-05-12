package X;

import android.os.SystemClock;
import android.view.View;

/* renamed from: X.0YE, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0YE implements View.OnClickListener {
    public final long LJLIL;
    public long LJLILLLLZI;

    public abstract void LIZ(View view);

    public C0YE() {
        this(300L);
    }

    public C0YE(long j) {
        this.LJLIL = j;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - this.LJLILLLLZI >= this.LJLIL) {
            this.LJLILLLLZI = uptimeMillis;
            LIZ(view);
        }
    }
}
