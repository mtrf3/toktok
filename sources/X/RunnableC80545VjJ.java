package X;

import android.content.Context;
import com.zhiliaoapp.musically.R;
import java.text.DateFormat;
import java.util.Date;

/* renamed from: X.VjJ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class RunnableC80545VjJ implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ AbstractC80544VjI LJLILLLLZI;

    public final void LIZ() {
        AbstractC80544VjI abstractC80544VjI = this.LJLILLLLZI;
        C80315Vfb c80315Vfb = abstractC80544VjI.LJLIL;
        DateFormat dateFormat = abstractC80544VjI.LJLILLLLZI;
        Context context = c80315Vfb.getContext();
        c80315Vfb.setError(UPJ.LIZIZ(context.getString(R.string.i_0), "\n", C16880lQ.LLLZ(context.getString(R.string.i_2), new Object[]{this.LJLIL}), "\n", C16880lQ.LLLZ(context.getString(R.string.i_1), new Object[]{dateFormat.format(new Date(C80561VjZ.LJII().getTimeInMillis()))})));
        this.LJLILLLLZI.LIZ();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC80545VjJ(AbstractC80544VjI abstractC80544VjI, String str) {
        this.LJLILLLLZI = abstractC80544VjI;
        this.LJLIL = str;
    }
}
