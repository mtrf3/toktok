package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.15N, reason: invalid class name */
/* loaded from: classes.dex */
public final class C15N {
    public CharSequence LIZ;
    public View.OnClickListener LIZIZ;
    public int LIZJ = -1;
    public C15L LIZLLL;

    public final C15N LIZ(int i, Context context) {
        if (context != null) {
            this.LIZ = context.getResources().getString(i);
        }
        return this;
    }
}
