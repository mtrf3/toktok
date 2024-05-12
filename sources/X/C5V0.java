package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.services.editeffect.EditEffectAnchorManager;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.5V0, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5V0 {
    public final EditEffectAnchorManager LIZ;
    public final int[] LIZIZ;
    public C42278GiY LIZJ;
    public long LIZLLL;
    public boolean LJ;

    public C5V0(EditEffectAnchorManager editEffectAnchorManager) {
        this.LIZ = editEffectAnchorManager;
        int[] LIZ = C170236mB.LIZ();
        o.LJIIIIZZ(LIZ, "getFilterColors()");
        this.LIZIZ = LIZ;
        this.LJ = true;
    }

    public static void LIZ(Activity activity) {
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        String string = activity.getString(R.string.flv);
        o.LJIIIIZZ(string, "lifecycleOwner.getString…effects_serverpopup_busy)");
        creativeToastBuilder.message(string);
        creativeToastBuilder.duration(3000L);
        C78915Uy7.LJJIIZI(activity, 1044, creativeToastBuilder);
    }
}
