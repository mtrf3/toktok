package X;

import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SQ0 implements EUJ {
    @Override // X.EUJ
    public final void onFailed(Exception e) {
        o.LJIIIZ(e, "e");
    }

    @Override // X.EUJ
    public final void A1(PushSettings settings) {
        o.LJIIIZ(settings, "settings");
        C235779Nd.LIZ.LJIIJJI().LIZLLL(Integer.valueOf(settings.whoCanSeeMyLikeList));
        C2U8.LIZ(new MGO());
    }
}
