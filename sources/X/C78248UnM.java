package X;

import Y.ARunnableS0S1200300_13;
import Y.IDLListenerS57S0200000_3;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Handler;
import android.os.Process;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerListUser;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import com.bytedance.ies.safemode.SafeModeActivity;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.keva.Keva;
import com.bytedance.touchpoint.data.request.INetworkApi;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import defpackage.q;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.UnM, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C78248UnM implements FYH, InterfaceC73592SuS, TNX, InterfaceC235629Mo, InterfaceC247459nR {
    public static final C71006Rtq[] LJLIL = new C71006Rtq[0];
    public static final C78248UnM LJLILLLLZI = new C78248UnM();
    public static boolean LJLJI;
    public static Application LJLJJI;

    @Override // X.FYH
    public void LIZJ(FYC state) {
        o.LJIIIZ(state, "state");
    }

    @Override // X.TNX
    public void LIZLLL(Effect effect) {
    }

    @Override // X.FYH
    public void LJII() {
    }

    public static boolean LJIIJ() {
        if (LJLJI) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC247459nR
    public INetworkApi LJFF() {
        String str;
        InterfaceC250809sq resFakerService;
        Keva LIZ;
        LocalTestApi localTestApi = C37090Eh4.LIZ.LIZ;
        if (localTestApi != null && (resFakerService = localTestApi.getResFakerService()) != null && (LIZ = resFakerService.LIZ()) != null) {
            str = LIZ.getString("spce_api_force_use_host", com.ss.android.ugc.aweme.app.api.Api.LIZ);
        } else {
            str = null;
        }
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        o.LJI(str);
        return (INetworkApi) LIZLLL.create(str).create(INetworkApi.class);
    }

    public static final void LJIIIIZZ(TuxTextView tuxTextView) {
        tuxTextView.getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS57S0200000_3(tuxTextView, tuxTextView.getText(), 4));
    }

    public static int LJIIIZ(int i) {
        if (i != 3) {
            if (i != 6) {
                if (i != 8) {
                    return 0;
                }
                return 270;
            }
            return 90;
        }
        return 180;
    }

    public static final void LJIIJJI(SafeModeActivity safeModeActivity) {
        Object LLILL;
        int myPid = Process.myPid();
        try {
            LLILL = C16880lQ.LLILL(safeModeActivity, "activity");
        } catch (Throwable unused) {
        }
        if (LLILL != null) {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) LLILL).getRunningAppProcesses();
            if (runningAppProcesses == null) {
                runningAppProcesses = C61878OQg.INSTANCE;
            }
            String mainProcessName = safeModeActivity.getPackageName();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                String str = runningAppProcessInfo.processName;
                o.LJFF(str, "procInfo.processName");
                o.LJFF(mainProcessName, "mainProcessName");
                if (ujb.o.LJJJLIIL(str, mainProcessName, false) && runningAppProcessInfo.pid != myPid) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Kill: ");
                    LIZ.append(runningAppProcessInfo.processName);
                    LIZ.append(" pid: ");
                    LIZ.append(runningAppProcessInfo.pid);
                    PSY.LJ(X1D.LIZIZ(LIZ));
                    Process.killProcess(runningAppProcessInfo.pid);
                }
            }
            new Handler(C16880lQ.LLJJJJ()).postDelayed(RunnableC39024FTg.LJLIL, 60000L);
            return;
        }
        throw new C37692Eqm("null cannot be cast to non-null type android.app.ActivityManager");
    }

    public static final String LJIILL(LinkLayerListUser linkLayerListUser) {
        String str;
        o.LJIIIZ(linkLayerListUser, "<this>");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[LinkLayerListUser: linkUser=");
        Player player = linkLayerListUser.linkUser;
        if (player != null) {
            str = LJIILLIIL(player);
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(" linkMicId=");
        LIZ.append(linkLayerListUser.linkMicId);
        LIZ.append(" linkedTimeNano=");
        LIZ.append(linkLayerListUser.linkedTimeNano);
        LIZ.append(" appVersion=");
        return q.LIZIZ(LIZ, linkLayerListUser.appVersion, ']', LIZ);
    }

    public static final String LJIILLIIL(Player player) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[Player: roomId=");
        LIZ.append(player.roomId);
        LIZ.append(" uid=");
        return C47135Ieh.LIZIZ(LIZ, player.uid, ']', LIZ);
    }

    @Override // X.InterfaceC235629Mo
    public void LIZ(String content) {
        o.LJIIIZ(content, "content");
        C2U8.LIZ(new C9MU(3, content));
    }

    @Override // X.InterfaceC73592SuS
    public boolean test(Object obj) {
        C81154Vt8 output = (C81154Vt8) obj;
        o.LJIIIZ(output, "output");
        if (output.LIZLLL >= 0) {
            return true;
        }
        return false;
    }

    public static final void LJIILJJIL(C78160Ulw c78160Ulw, String str) {
        if (c78160Ulw != null) {
            if (c78160Ulw.LIZJ) {
                c78160Ulw.LJIILIIL.put(str, Long.valueOf(System.currentTimeMillis()));
            } else {
                c78160Ulw.LJIILIIL.put(str, Long.valueOf(C30725C4b.LIZ()));
            }
        }
    }

    @Override // X.InterfaceC247459nR
    public void LIZIZ(String str, java.util.Map map) {
        FMX.LJIIL(str, map);
    }

    @Override // X.InterfaceC247459nR
    public void LJ(java.util.Map map, boolean z) {
        Object obj;
        if (z) {
            C86550Xxy.LIZIZ.LJI(true, false);
            return;
        }
        if (map != null) {
            obj = ((LinkedHashMap) map).get("isManual");
        } else {
            obj = null;
        }
        C86550Xxy.LIZIZ.LJI(false, o.LJ(obj, "true"));
    }

    public static final void LJIILIIL(long j, long j2, long j3, AssetsModel assetsModel, C78160Ulw c78160Ulw, String str) {
        C65032gt.LIZ(new ARunnableS0S1200300_13(j3, j2, j, assetsModel, c78160Ulw, str, 0));
    }

    @Override // X.InterfaceC247459nR
    public void LJI(String str, String str2, String str3, String str4, AbsDownloadListener absDownloadListener, int i, boolean z) {
        HH1.LIZ(str, "url", str2, "savePath", str3, "name");
        X5R with = DownloadServiceManager.INSTANCE.getDownloadService().with(str);
        with.LJ = str2;
        with.LIZJ = str3;
        with.LJIIJ = str4;
        with.LJII = i;
        with.LJIIL = absDownloadListener;
        if (z) {
            with.LJ(C73040SlY.LJLJLLL);
        } else {
            with.LIZJ();
        }
    }

    public static final void LJIIL(float f, int i, AssetsModel assetsModel, com.bytedance.gift.render.model.Effect effect, C78160Ulw c78160Ulw, Integer num, Long l, Long l2, Long l3, String str, String str2, String str3, String str4, java.util.Map map, JSONObject jSONObject, boolean z) {
        C65032gt.LIZ(new RunnableC78156Uls(f, i, assetsModel, effect, c78160Ulw, num, l3, l, l2, str4, str, str2, str3, map, jSONObject, z));
    }
}
