package X;

import Y.ARunnableS5S2100000_13;
import android.text.TextUtils;
import com.lynx.tasm.base.LLog;

/* renamed from: X.V9w, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class RunnableC79288V9w implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ VNU LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ C79285V9t LJLJJLL;

    public final void LIZ() {
        String str;
        String str2;
        try {
            str2 = null;
            if (!TextUtils.isEmpty(this.LJLIL)) {
                str = this.LJLJJLL.LIZJ(this.LJLIL, this.LJLILLLLZI, this.LJLJI);
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(this.LJLJJI)) {
                str2 = this.LJLJJLL.LIZJ(this.LJLJJI, this.LJLJJL, this.LJLJI);
            }
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("async redirect url failed, placeholder: ");
            LIZ.append(this.LJLJJI);
            LIZ.append(", url:");
            LLog.LIZLLL(4, "Lynx-Image", C61328O5c.LIZLLL(LIZ, this.LJLIL, ", msg:", th, LIZ));
            str = this.LJLIL;
            str2 = this.LJLJJI;
        }
        C79411VEp.LIZJ(new ARunnableS5S2100000_13(this, str, str2, 0));
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

    public RunnableC79288V9w(C79285V9t c79285V9t, String str, boolean z, VNU vnu, String str2, boolean z2) {
        this.LJLJJLL = c79285V9t;
        this.LJLIL = str;
        this.LJLILLLLZI = z;
        this.LJLJI = vnu;
        this.LJLJJI = str2;
        this.LJLJJL = z2;
    }
}
