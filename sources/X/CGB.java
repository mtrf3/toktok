package X;

import android.os.Bundle;
import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* loaded from: classes6.dex */
public final class CGB implements CGR {
    public float LIZ = -1.0f;
    public float LIZIZ = -1.0f;
    public float LIZJ = -1.0f;

    public final void LIZ() {
        InterfaceC09240Xw LIZIZ = C09580Ze.LIZJ().LIZIZ(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).appId());
        C05060Hu c05060Hu = C05060Hu.LIZJ;
        C05060Hu c05060Hu2 = C05060Hu.LIZLLL;
        C05060Hu c05060Hu3 = C05060Hu.LJ;
        Bundle bundle = new Bundle();
        LIZIZ.LJIILIIL(new C05060Hu[]{c05060Hu, c05060Hu2, c05060Hu3}, bundle);
        Object LLJJIII = C16880lQ.LLJJIII(bundle, c05060Hu.LIZ);
        if (LLJJIII instanceof Float) {
            this.LIZ = ((Float) LLJJIII).floatValue();
        }
        Object LLJJIII2 = C16880lQ.LLJJIII(bundle, c05060Hu2.LIZ);
        if (LLJJIII2 instanceof Float) {
            this.LIZIZ = ((Float) LLJJIII2).floatValue();
        }
        Object LLJJIII3 = C16880lQ.LLJJIII(bundle, c05060Hu3.LIZ);
        if (LLJJIII3 instanceof Float) {
            this.LIZJ = ((Float) LLJJIII3).floatValue();
        }
    }
}
