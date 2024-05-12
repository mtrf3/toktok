package X;

import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SL0<T> implements InterfaceC64592gB {
    public static final SL0<T> LJLIL = new SL0<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        PushSettings pushSettings = (PushSettings) obj;
        String str = pushSettings.settingsVersion;
        o.LJIIIIZZ(str, "settings.settingsVersion");
        SLF.LIZIZ(str);
        C63024OoO.LIZJ(pushSettings.commentFilterStatus);
        C63024OoO.LIZLLL(pushSettings.commentOffensiveFilter);
        C63024OoO.LJ(pushSettings.commentFilterAll);
        C63025OoP.LIZ(pushSettings);
        C78880UxY.LJJZ(new AqS179S0100000_13(pushSettings, 430));
    }
}
