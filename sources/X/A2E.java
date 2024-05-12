package X;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.global.config.settings.pojo.AdFeSettings;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A2E {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(Context context, String str) {
        o.LJIIIZ(context, "context");
        try {
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("enter_method", str);
            FMX.LJIIL("enter_music_usage_confimation", c145995oB.LIZ);
            AdFeSettings adFeSettings = C2YJ.LIZIZ.LIZ.getAdFeSettings();
            if (adFeSettings == null) {
                return;
            }
            String musicLegalPage = adFeSettings.getMusicLegalPage();
            String string = context.getResources().getString(R.string.p71);
            o.LJIIIIZZ(string, "context.resources.getStr…confirmation_music_terms)");
            if (!TextUtils.isEmpty(musicLegalPage)) {
                ((HH2) C44172HVg.LJIIIZ).getClass();
                NO5.LJII(context, musicLegalPage, string);
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
