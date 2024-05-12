package X;

import android.content.SharedPreferences;
import com.bytedance.common.utility.Logger;
import com.bytedance.ttnet.TTNetInit;
import java.util.LinkedHashMap;

/* renamed from: X.Pax, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64739Pax extends RunnableC39007FSp {
    public C64739Pax() {
        super((Object) null);
    }

    public static void LIZJ() {
        C64734Pas LJIIIZ = C64734Pas.LJIIIZ(TTNetInit.getTTNetDepend().getContext());
        LJIIIZ.getClass();
        try {
            SharedPreferences LIZIZ = F9J.LIZIZ(LJIIIZ.LJLJJL, 0, "ss_app_config");
            SharedPreferences.Editor edit = LIZIZ.edit();
            edit.putInt("chromium_boot_failures", 0);
            Logger.debug();
            WX6.LIZ(edit);
            LJIIIZ.LJLJLJ = LIZIZ.getInt("chromium_boot_failures", 0);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("chromium_boot_failures", Integer.valueOf(LJIIIZ.LJLJLJ));
            TTNetInit.getTTNetDepend().LJ(LJIIIZ.LJLJJL, linkedHashMap);
        } catch (Throwable unused) {
        }
        C64752PbA.LIZLLL = true;
    }

    @Override // X.RunnableC39007FSp, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZJ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
