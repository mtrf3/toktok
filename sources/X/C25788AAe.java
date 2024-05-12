package X;

import com.ss.android.ugc.aweme.setting.serverpush.model.JoinBetaEntrance;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import kotlin.jvm.internal.o;

/* renamed from: X.AAe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25788AAe implements EUJ {
    public static final C25788AAe LJLIL = new C25788AAe();
    public static JoinBetaEntrance LJLILLLLZI;

    @Override // X.EUJ
    public final void A1(PushSettings settings) {
        o.LJIIIZ(settings, "settings");
        LJLILLLLZI = settings.joinBetaEntrance;
    }

    @Override // X.EUJ
    public final void onFailed(Exception e) {
        o.LJIIIZ(e, "e");
        LJLILLLLZI = null;
    }
}
