package Y;

import X.C16880lQ;
import X.C38057Ewf;
import X.EFK;
import X.X1D;
import android.os.Build;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.bytedance.common.jato.jit.JitCodeCacheGc;
import com.bytedance.common.jato.jit.ProfileInfo;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public class ARunnableS14S0100100_6 implements Runnable {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        try {
            Thread.sleep(LivePlayEnforceIntervalSetting.DEFAULT);
        } catch (InterruptedException e) {
            C16880lQ.LLLLIIL(e);
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < ((ArrayList) this.l0).size(); i++) {
            ListProtector.get((ArrayList) this.l0, i).getClass();
        }
        JitCodeCacheGc.disable();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ListProtector.get(arrayList, i2).getClass();
            ProfileInfo.createProfileForMethod(null, null, null);
        }
        ProfileInfo.forceSaveProfile();
        JitCodeCacheGc.enable();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ListProtector.get(arrayList, i3).getClass();
            ProfileInfo.jitMethod(null);
            long j = this.j1;
            if (j > 0) {
                try {
                    Thread.sleep(j);
                } catch (InterruptedException e2) {
                    C16880lQ.LLLLIIL(e2);
                }
            }
        }
    }

    public static final void run$0(ARunnableS14S0100100_6 aRunnableS14S0100100_6) {
        boolean LIZ;
        try {
            ArrayList arrayList = (ArrayList) aRunnableS14S0100100_6.l0;
            long j = aRunnableS14S0100100_6.j1;
            if (Build.VERSION.SDK_INT >= 29 && ProfileInfo.init()) {
                ProfileInfo.LIZ.execute(new ARunnableS14S0100100_6(j, arrayList, 1));
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS14S0100100_6 aRunnableS14S0100100_6) {
        boolean LIZ;
        try {
            aRunnableS14S0100100_6.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS14S0100100_6 aRunnableS14S0100100_6) {
        C38057Ewf c38057Ewf = (C38057Ewf) aRunnableS14S0100100_6.l0;
        long j = aRunnableS14S0100100_6.j1;
        c38057Ewf.getClass();
        SettingsManager.LIZLLL().getClass();
        boolean z = true;
        boolean LIZ = SettingsManager.LIZ("use_bridge_engine_v2", true);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("workType == WorkType.BOOT_FINISH: ");
        if (c38057Ewf.LJLILLLLZI.LJLIL != EFK.BOOT_FINISH) {
            z = false;
        }
        LIZ2.append(z);
        LIZ2.append("\nenablePermissionCheck: ");
        LIZ2.append(LIZ);
        X1D.LIZIZ(LIZ2);
        if (LIZ) {
            c38057Ewf.LJLILLLLZI.LIZLLL(j);
        }
    }

    public ARunnableS14S0100100_6(long j, Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
        this.j1 = j;
    }
}
