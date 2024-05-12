package X;

import android.content.Intent;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: X.FbI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39280FbI {
    public boolean LIZ;
    public android.net.Uri LIZIZ;
    public String LIZJ = "";
    public boolean LIZLLL;
    public C39277FbF LJ;

    public final Intent LIZ() {
        if (this.LIZIZ == null) {
            return null;
        }
        Intent intent = new Intent();
        intent.setData(this.LIZIZ);
        intent.setFlags(268435456);
        if (this.LIZLLL) {
            intent.putExtra("dl_from", "af");
        }
        if (M66.LIZIZ.LIZJ(this.LIZJ)) {
            intent.putExtra("is_from_self", true);
        }
        return intent;
    }

    public final void LIZIZ() {
        if (this.LIZIZ == null) {
            return;
        }
        C16880lQ.LIZJ(EF7.LIZIZ(), LIZ());
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public void onEvent(C39282FbK c39282FbK) {
        if (this.LIZ) {
            LIZIZ();
            this.LIZ = false;
        }
    }
}
