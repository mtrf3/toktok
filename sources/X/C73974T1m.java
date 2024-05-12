package X;

import android.content.res.Resources;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.T1m, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C73974T1m implements RTU, InterfaceC65473Pmn, InterfaceC66567QAp, InterfaceC40796Fzk {
    public static final C73974T1m LJLIL = new C73974T1m();

    @Override // X.InterfaceC40796Fzk
    public List LIZ(int i, List oldSteps, List list) {
        o.LJIIIZ(oldSteps, "oldSteps");
        return oldSteps;
    }

    public void LIZJ(List list) {
        throw null;
    }

    public /* synthetic */ C73974T1m() {
    }

    public /* synthetic */ C73974T1m(String str) {
        str.getClass();
    }

    public static final C73306Spq LIZIZ(InterfaceC65784Pro interfaceC65784Pro, boolean z) {
        String string;
        String string2;
        C73306Spq c73306Spq = new C73306Spq();
        c73306Spq.LJII = new AqS178S0100000_12(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 562);
        Resources LIZJ = FKM.LIZJ();
        if (LIZJ != null && (string2 = LIZJ.getString(R.string.f3j)) != null) {
            c73306Spq.LJFF = string2;
        }
        Resources LIZJ2 = FKM.LIZJ();
        if (LIZJ2 != null && (string = LIZJ2.getString(R.string.f3i)) != null) {
            c73306Spq.LJI = string;
        }
        if (z) {
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_large_wifi_slash;
            c2068389v.LJ = Integer.valueOf(R.attr.gp);
            c73306Spq.LIZ(c2068389v);
        }
        return c73306Spq;
    }

    public static final C73306Spq LJ(InterfaceC65784Pro interfaceC65784Pro, boolean z) {
        String string;
        String string2;
        C73306Spq c73306Spq = new C73306Spq();
        c73306Spq.LJII = new AqS178S0100000_12(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 563);
        Resources LIZJ = FKM.LIZJ();
        if (LIZJ != null && (string2 = LIZJ.getString(R.string.f3g)) != null) {
            c73306Spq.LJFF = string2;
        }
        Resources LIZJ2 = FKM.LIZJ();
        if (LIZJ2 != null && (string = LIZJ2.getString(R.string.f3f)) != null) {
            c73306Spq.LJI = string;
        }
        if (z) {
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_large_error_robot;
            c2068389v.LJ = Integer.valueOf(R.attr.gp);
            c73306Spq.LIZ(c2068389v);
        }
        return c73306Spq;
    }

    public static long LJFF(int i, String str) {
        long maxShootingDuration = C60903NvH.LJIIJJI().LJJIII().getMaxDurationResolver().getMaxShootingDuration(i);
        if (!C60903NvH.LJIIJJI().LJJIL().getDurationMode(true)) {
            maxShootingDuration = LivePlayEnforceIntervalSetting.DEFAULT;
        }
        if (!TextUtils.isEmpty(str)) {
            long musicDuration = C78934UyQ.LJLIL.getMusicService().getMusicDuration(str);
            if (musicDuration != -1) {
                return Math.min(maxShootingDuration, musicDuration);
            }
        }
        return maxShootingDuration;
    }

    @Override // X.RTU
    public Object apply(Object obj, Object obj2) {
        return new OSZ(obj, obj2);
    }

    public static final void LIZLLL(C73305Spp c73305Spp, int i, InterfaceC65784Pro interfaceC65784Pro) {
        if (i != -1) {
            if (i != 0) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                    C73306Spq c73306Spq = new C73306Spq();
                    C73312Spw.LJIIJ(c73306Spq, interfaceC65784Pro);
                    c73305Spp.setStatus(c73306Spq);
                    c73305Spp.setVisibility(0);
                    return;
                }
                C73306Spq c73306Spq2 = new C73306Spq();
                C73312Spw.LJI(c73306Spq2, interfaceC65784Pro);
                c73305Spp.setStatus(c73306Spq2);
                c73305Spp.setVisibility(0);
                return;
            }
            c73305Spp.LJFF();
            c73305Spp.setVisibility(0);
            return;
        }
        c73305Spp.setVisibility(8);
    }
}
