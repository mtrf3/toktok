package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C44172HVg;
import X.C51029K0z;
import X.C60903NvH;
import X.C78605Ut7;
import X.C84488XDw;
import X.InterfaceC65784Pro;
import X.InterfaceC84498XEg;
import X.OSZ;
import android.app.Application;
import android.os.Build;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.app.SharePrefCache;

/* loaded from: classes8.dex */
public class AqS23S0010000_7 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public boolean z0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS23S0010000_7 aqS23S0010000_7) {
        boolean z = aqS23S0010000_7.z0;
        int i = 0;
        if (Build.VERSION.SDK_INT >= 29 || C78605Ut7.LJFF("android.permission.WRITE_EXTERNAL_STORAGE")) {
            if (z) {
                i = Keva.getRepo("TOOLS_PUBLISH_REPO_NAME").getInt("photo_mode_save_to_local_config", 0);
            } else {
                Keva repo = Keva.getRepo("TOOLS_PUBLISH_REPO_NAME");
                C44172HVg.LJIIJ.getClass();
                Boolean LIZ = SharePrefCache.inst().getAutoSaveVideo().LIZ();
                o.LJIIIIZZ(LIZ, "SP_SERIVCE.autoSaveVideo().get()");
                i = repo.getInt("save_to_local_config", LIZ.booleanValue() ? 1 : 0);
            }
        }
        return Integer.valueOf(i);
    }

    public static final Object invoke$1(AqS23S0010000_7 aqS23S0010000_7) {
        return Boolean.valueOf(aqS23S0010000_7.z0);
    }

    public static final Object invoke$2(AqS23S0010000_7 aqS23S0010000_7) {
        Application application = C60903NvH.LJ;
        o.LJIIIIZZ(application, "getApplication()");
        InterfaceC84498XEg LIZ = C84488XDw.LIZ(application, null);
        LIZ.LJIIJJI(C51029K0z.LJJIIZI(new OSZ("is_story", Integer.valueOf(aqS23S0010000_7.z0 ? 1 : 0))));
        return LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS23S0010000_7(boolean z, int i) {
        super(0);
        this.$t = i;
        this.z0 = z;
    }
}
