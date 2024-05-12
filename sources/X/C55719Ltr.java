package X;

import com.ss.android.ugc.aweme.experiment.AddScenesForAuthPopConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.Ltr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55719Ltr {
    public static final C55719Ltr LIZ = new C55719Ltr();
    public static final AddScenesForAuthPopConfig LIZIZ = new AddScenesForAuthPopConfig(false, false, false, 7, null);

    public static AddScenesForAuthPopConfig LIZ() {
        FFL LJIIIZ = FFL.LJIIIZ();
        AddScenesForAuthPopConfig addScenesForAuthPopConfig = LIZIZ;
        LJIIIZ.getClass();
        AddScenesForAuthPopConfig addScenesForAuthPopConfig2 = (AddScenesForAuthPopConfig) FFL.LJIJ(true, "add_auth_pop_scenes", 31744, AddScenesForAuthPopConfig.class, addScenesForAuthPopConfig);
        if (addScenesForAuthPopConfig2 != null) {
            addScenesForAuthPopConfig = addScenesForAuthPopConfig2;
        }
        o.LJIIIIZZ(addScenesForAuthPopConfig, "ABManager.getInstance()\n….java)\n        ?: DEFAULT");
        return addScenesForAuthPopConfig;
    }
}
