package X;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public abstract class NNJ {
    public Context LIZ;
    public NNR LIZIZ;

    public abstract boolean LIZ();

    public abstract boolean LIZIZ();

    public void LJ(boolean z, NNR params) {
        o.LJIIIZ(params, "params");
    }

    public final Context LIZJ() {
        Context context = this.LIZ;
        if (context != null) {
            return context;
        }
        o.LJIJI("context");
        throw null;
    }

    public final NNR LIZLLL() {
        NNR nnr = this.LIZIZ;
        if (nnr != null) {
            return nnr;
        }
        o.LJIJI("params");
        throw null;
    }

    public static boolean LJFF(Context context, Intent intent) {
        NNG nng = NNG.LIZIZ;
        nng.LIZ.LIZLLL("ad_lynx_download_WebUrlHandler_startActivity", "begin", null);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        try {
            nng.LIZ.LIZLLL("ad_lynx_download_WebUrlHandler_startActivity", "try", null);
            C16880lQ.LIZJ(context, intent);
            return true;
        } catch (ActivityNotFoundException unused) {
            NNG.LIZIZ.LIZ.LIZLLL("ad_lynx_download_WebUrlHandler_startActivity", "fail", null);
            return false;
        } catch (SecurityException e) {
            C78983UzD.LJIIZILJ(e);
            NNG.LIZIZ.LIZ.LIZLLL("ad_lynx_download_WebUrlHandler_startActivity", "fail", null);
            return false;
        }
    }
}
