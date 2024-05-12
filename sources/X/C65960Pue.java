package X;

import Y.ACallableS88S0200000_11;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.bytedance.helios.api.consumer.ReportParam;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* renamed from: X.Pue, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65960Pue {
    public static final AtomicBoolean LIZ = new AtomicBoolean(false);
    public static final C65961Puf LIZIZ = new C65961Puf(0);
    public static final C65961Puf LIZJ = new C65961Puf(0);
    public static final C65961Puf LIZLLL = new C65961Puf(0);
    public static final ArrayList<String> LJ = C47261Igj.LJII("com.ss.android.ugc.aweme.roaming.NearbyRegionListFragment");
    public static final C65961Puf LJFF = new C65961Puf(0);
    public static final java.util.Set<String> LJI = Collections.synchronizedSet(new LinkedHashSet());
    public static String LJII;
    public static C65964Pui<String> LJIIIIZZ;
    public static C65964Pui<String> LJIIIZ;

    public static void LJ(Activity activity) {
        com.bytedance.hox.Hox hox;
        if (LIZ.get()) {
            return;
        }
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(activity);
        if (LJJIFFI != null) {
            hox = com.bytedance.hox.Hox.LJLLI.LIZ(LJJIFFI);
        } else {
            hox = null;
        }
        C10K.LIZJ(new ACallableS88S0200000_11(activity, hox, 4));
    }

    public static void LIZ(Activity activity, boolean z) {
        if (z) {
            LJI.add(activity.getClass().getName());
            LJFF.LIZ(activity);
        } else {
            LJI.remove(activity.getClass().getName());
        }
    }

    public static void LIZIZ(Fragment fragment, boolean z, boolean z2) {
        String str;
        if (z2) {
            LIZIZ.LIZ(fragment);
            return;
        }
        ActivityC45651qj mo49getActivity = fragment.mo49getActivity();
        if (mo49getActivity != null) {
            str = mo49getActivity.getClass().getName();
        } else {
            str = null;
        }
        if (!o.LJ(str, "com.ss.android.ugc.aweme.main.MainActivity")) {
            if (z) {
                LIZLLL.LIZ(fragment);
                return;
            }
            C65961Puf c65961Puf = LIZLLL;
            if (c65961Puf.LIZIZ != fragment.hashCode()) {
                return;
            }
            c65961Puf.LIZJ = c65961Puf.LIZ;
            c65961Puf.LIZ = null;
            c65961Puf.LIZIZ = 0;
            return;
        }
        if (!LJ.contains(fragment.getClass().getName())) {
            return;
        }
        if (z) {
            LIZJ.LIZ(fragment);
            return;
        }
        C65961Puf c65961Puf2 = LIZJ;
        if (c65961Puf2.LIZIZ != fragment.hashCode()) {
            return;
        }
        c65961Puf2.LIZJ = c65961Puf2.LIZ;
        c65961Puf2.LIZ = null;
        c65961Puf2.LIZIZ = 0;
    }

    public static ReportParam LIZJ(String str, Object obj, String str2) {
        return new ReportParam(str, obj, str2, true, false);
    }
}
