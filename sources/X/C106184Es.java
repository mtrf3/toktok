package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.model.ActionBarConf;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4Es, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106184Es {
    public static final java.util.Map<String, ActionBarConf> LIZ = new LinkedHashMap();
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C106234Ex.LJLIL);

    public static String LIZJ() {
        StringBuilder LJFF = C72972SkS.LJFF("key_action_bar_conf", '_');
        LJFF.append((Object) C80763Ey.LIZ(false));
        return X1D.LIZIZ(LJFF);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ActionBarConf LIZIZ() {
        String LIZJ = LIZJ();
        try {
            java.util.Map<String, ActionBarConf> map = LIZ;
            if (!map.containsKey(LIZJ)) {
                map.put(LIZJ, C62070OXq.LIZ(ActionBarConf.class, C106204Eu.LIZ(LIZJ)));
            }
        } catch (Exception e) {
            C34B.LJ("ActionBarResourceManager", e);
        }
        return (ActionBarConf) ((LinkedHashMap) LIZ).get(LIZJ);
    }

    public static void LIZ(boolean z, XKW mainCoroutineDispatcher, XKW ioCoroutineDispatcher, AqS167S0100000_1 aqS167S0100000_1, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            mainCoroutineDispatcher = C36636EZk.LIZ;
        }
        if ((i & 4) != 0) {
            ioCoroutineDispatcher = C78613UtF.LIZJ;
        }
        if ((i & 8) != 0) {
            aqS167S0100000_1 = null;
        }
        o.LJIIIZ(mainCoroutineDispatcher, "mainCoroutineDispatcher");
        o.LJIIIZ(ioCoroutineDispatcher, "ioCoroutineDispatcher");
        if (C4LS.LIZ()) {
            return;
        }
        C34B.LJI("ActionBarResourceManager", "fetchActionBarResource");
        String LIZJ = LIZJ();
        if (((LinkedHashMap) LIZ).get(LIZJ) != null && !z) {
            return;
        }
        XKX.LIZLLL(C48841JEv.LIZ(((MBA) LIZIZ.getValue()).plus(ioCoroutineDispatcher)), null, null, new C4FA(LIZJ, mainCoroutineDispatcher, aqS167S0100000_1, null), 3);
    }
}
