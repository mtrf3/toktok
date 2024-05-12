package X;

import Y.ACallableS25S1300000_7;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.DiyPropParser;
import kotlin.jvm.internal.AqS170S0200000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class IBP {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Effect effect, String path, String key, IC3 updateType) {
        boolean z;
        o.LJIIIZ(path, "path");
        o.LJIIIZ(key, "key");
        o.LJIIIZ(updateType, "updateType");
        if (path.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            DiyPropParser.LJIILIIL(updateType, effect, new Bitmap[0], null);
            return;
        }
        int[] LJ = DiyPropParser.LJ(effect);
        AqS170S0200000_7 aqS170S0200000_7 = new AqS170S0200000_7(updateType, effect, 3);
        if (TextUtils.isEmpty(path) || !C44687HgJ.LIZIZ(path) || LJ.length < 2) {
            aqS170S0200000_7.invoke(IBJ.ERROR, null);
            return;
        }
        C68322mC c68322mC = new C68322mC();
        aqS170S0200000_7.invoke(IBJ.START, null);
        C10K.LIZJ(new ACallableS25S1300000_7(c68322mC, LJ, path, aqS170S0200000_7, 1));
    }
}
