package X;

import android.text.TextUtils;
import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.retrofit2.client.Request;
import com.ss.android.ugc.aweme.experiment.RigPathBystanderSettings;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes7.dex */
public final class EPL implements InterfaceC65104Pgq, AttachUserData {
    public static final EPL LIZ;
    public static final RigPathBystanderSettings.RigPathConfig LIZIZ;
    public static volatile int LIZJ;
    public static final CopyOnWriteArrayList<String> LIZLLL;
    public static volatile int LJ;
    public static final CopyOnWriteArrayList<String> LJFF;
    public static volatile int LJI;
    public static final CopyOnWriteArrayList<String> LJII;

    static {
        EPL epl = new EPL();
        LIZ = epl;
        Npth.setAttachUserData(epl, CrashType.ALL);
        SettingsManager LIZLLL2 = SettingsManager.LIZLLL();
        RigPathBystanderSettings.RigPathConfig rigPathConfig = RigPathBystanderSettings.LIZ;
        RigPathBystanderSettings.RigPathConfig rigPathConfig2 = (RigPathBystanderSettings.RigPathConfig) LIZLLL2.LJIIIIZZ("rig_path_config", RigPathBystanderSettings.RigPathConfig.class, rigPathConfig);
        if (rigPathConfig2 == null) {
            o.LJIIIIZZ(rigPathConfig, "rigPathConfig");
        } else {
            rigPathConfig = rigPathConfig2;
        }
        LIZIZ = rigPathConfig;
        LIZLLL = new CopyOnWriteArrayList<>(Collections.nCopies(rigPathConfig.cacheSizeCustom, ""));
        LJFF = new CopyOnWriteArrayList<>(Collections.nCopies(3, ""));
        LJII = new CopyOnWriteArrayList<>(Collections.nCopies(3, ""));
    }

    @Override // X.InterfaceC65104Pgq
    public final void LIZJ(Request request) {
        o.LJIIIZ(request, "request");
    }

    @Override // X.InterfaceC65104Pgq
    public final void LJFF(C64797Pbt<?> response) {
        o.LJIIIZ(response, "response");
    }

    @Override // X.InterfaceC65104Pgq
    public final void LJII(Request request) {
        o.LJIIIZ(request, "request");
    }

    @Override // com.bytedance.crash.AttachUserData
    public final java.util.Map<? extends String, ? extends String> getUserData(CrashType crashType) {
        return C113554cx.LJJLIIIIJ(new OSZ("paths_in_crash_ext", LIZLLL.toString()), new OSZ("paths_in_crash_feed", LJFF.toString()), new OSZ("paths_in_crash_detail", LJII.toString()));
    }

    @Override // X.InterfaceC65104Pgq
    public final void onException(Throwable throwable) {
        o.LJIIIZ(throwable, "throwable");
    }

    @Override // X.InterfaceC65104Pgq
    public final void LJIIIIZZ(Request request, C64797Pbt<?> c64797Pbt, Throwable th) {
        List<EJ6> list;
        o.LJIIIZ(request, "request");
        String path = request.getPath();
        o.LJIIIIZZ(path, "path");
        List<String> list2 = LIZIZ.pathFilter;
        if (TextUtils.isEmpty(path)) {
            return;
        }
        if (list2 != null) {
            Iterator<String> it = list2.iterator();
            while (it.hasNext()) {
                if (s.LJJJLZIJ(path, it.next(), false)) {
                    return;
                }
            }
        }
        String str = "";
        if (c64797Pbt != null && (list = c64797Pbt.LIZ.LIZLLL) != null) {
            for (EJ6 ej6 : list) {
                if (o.LJ(ej6.LIZ, "x-tt-logid")) {
                    str = ej6.LIZIZ;
                    o.LJIIIIZZ(str, "it.value");
                }
            }
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(request.getHost());
        LIZ2.append('+');
        LIZ2.append(request.getPath());
        LIZ2.append('+');
        LIZ2.append(str);
        String LIZIZ2 = X1D.LIZIZ(LIZ2);
        LIZJ %= LIZIZ.cacheSizeCustom;
        LIZLLL.set(LIZJ, LIZIZ2);
        LIZJ++;
        if (!TextUtils.isEmpty(path) && s.LJJJLZIJ(path, "/aweme/v2/feed", false)) {
            LJ %= 3;
            LJFF.set(LJ, LIZIZ2);
            LJ++;
        }
        if (!TextUtils.isEmpty(path) && s.LJJJLZIJ(path, "/aweme/v1/aweme/detail", false)) {
            LJI %= 3;
            LJII.set(LJI, LIZIZ2);
            LJI++;
        }
    }
}
