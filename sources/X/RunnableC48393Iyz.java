package X;

import android.os.SystemClock;

/* renamed from: X.Iyz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC48393Iyz implements Runnable {
    public final /* synthetic */ IHD<Object> LJLIL;
    public final /* synthetic */ W4W<Object> LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ android.net.Uri LJLJJI;
    public final /* synthetic */ C34K LJLJJL;
    public final /* synthetic */ C34K LJLJJLL;
    public final /* synthetic */ long LJLJL;

    public RunnableC48393Iyz(IHD<Object> ihd, W4W<Object> w4w, String str, android.net.Uri uri, C34K c34k, C34K c34k2, long j) {
        this.LJLIL = ihd;
        this.LJLILLLLZI = w4w;
        this.LJLJI = str;
        this.LJLJJI = uri;
        this.LJLJJL = c34k;
        this.LJLJJLL = c34k2;
        this.LJLJL = j;
    }

    public final void LIZ() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.LJLIL.LIZLLL(this.LJLILLLLZI);
        C76542zS.LIZJ("rd_tiktokec_image_handler_opt", new C40043Fnb(this.LJLJI, String.valueOf(this.LJLJJI), this.LJLJJL.element, this.LJLJJLL.element, elapsedRealtime - this.LJLJL, SystemClock.elapsedRealtime() - elapsedRealtime));
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
}
