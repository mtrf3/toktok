package X;

import android.view.MotionEvent;
import android.widget.LinearLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.OhX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62599OhX implements InterfaceC62716OjQ {
    public final /* synthetic */ C62594OhS LIZ;

    public C62599OhX(C62594OhS c62594OhS) {
        this.LIZ = c62594OhS;
    }

    @Override // X.InterfaceC62716OjQ
    public final void LJIIIIZZ(MotionEvent event) {
        o.LJIIIZ(event, "event");
        int action = event.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    return;
                }
                this.LIZ.LJLJJLL = true;
                return;
            }
            C62594OhS c62594OhS = this.LIZ;
            c62594OhS.LJLJJLL = false;
            long currentTimeMillis = System.currentTimeMillis();
            C62594OhS c62594OhS2 = this.LIZ;
            long j = c62594OhS2.LJLJJL;
            c62594OhS.LJLJLLL = currentTimeMillis + j;
            c62594OhS2.LJLJL = false;
            LinearLayout linearLayout = c62594OhS2.LJLJJI;
            if (linearLayout == null) {
                return;
            }
            linearLayout.postDelayed(c62594OhS2.LJLLI, j);
            return;
        }
        C62594OhS c62594OhS3 = this.LIZ;
        c62594OhS3.LJLJJLL = true;
        c62594OhS3.LJLJL = true;
    }
}
