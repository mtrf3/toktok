package X;

import android.os.Handler;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* renamed from: X.PJv, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64259PJv extends AbstractRunnableC64261PJx {
    public final void LIZ() {
        String str;
        C64260PJw LIZLLL = PK0.LIZLLL();
        if (!TextUtils.isEmpty(LIZLLL.LIZ) && !CardStruct.IStatusCode.DEFAULT.equals(LIZLLL.LIZ)) {
            return;
        }
        C64257PJt LIZIZ = PK0.LIZIZ();
        LIZIZ.getClass();
        try {
            str = LIZIZ.LIZIZ.getDeviceId();
        } catch (Throwable unused) {
            str = "";
        }
        if (TextUtils.isEmpty(str) || CardStruct.IStatusCode.DEFAULT.equals(str)) {
            long j = this.LJLILLLLZI;
            if (j > 0) {
                this.LJLIL.postDelayed(this, j);
            } else {
                this.LJLIL.post(this);
            }
            C78685UuP.LJJJLL();
            return;
        }
        PK0.LIZLLL().LIZIZ(str);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[DeviceIdTask] did is ");
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        C78685UuP.LJJJLL();
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

    public C64259PJv(Handler handler) {
        super(handler, 5000L);
    }
}
