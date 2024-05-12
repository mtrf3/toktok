package X;

import com.ss.android.ugc.aweme.music.experiment.AddMusicToDspButtonConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.KuQ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53206KuQ {
    public static final C53206KuQ LIZ = new C53206KuQ();
    public static final AddMusicToDspButtonConfig LIZIZ = new AddMusicToDspButtonConfig();
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C53207KuR.LJLIL);

    public static final AddMusicToDspButtonConfig LIZJ() {
        LIZ.getClass();
        AddMusicToDspButtonConfig value = (AddMusicToDspButtonConfig) LIZJ.getValue();
        o.LJIIIIZZ(value, "value");
        return value;
    }

    public static final boolean LIZ(int i) {
        if (LIZJ().addToDspEntranceOverallDisplays < 0) {
            return true;
        }
        int i2 = LIZJ().addToDspEntranceOverallDisplays;
        if (i2 < 0) {
            i2 = 0;
        }
        if (i < i2) {
            return true;
        }
        return false;
    }

    public static final boolean LIZIZ(int i) {
        int i2;
        if (C51937KZx.LIZ() || C53205KuP.LIZ()) {
            if (LIZJ().addToDspEntranceDisplaysPerDayOpt < 0) {
                return true;
            }
        } else if (LIZJ().addToDspEntranceDisplaysPerDay < 0) {
            return true;
        }
        if (C51937KZx.LIZ() || C53205KuP.LIZ()) {
            i2 = LIZJ().addToDspEntranceDisplaysPerDayOpt;
        } else {
            i2 = LIZJ().addToDspEntranceDisplaysPerDay;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i < i2) {
            return true;
        }
        return false;
    }
}
