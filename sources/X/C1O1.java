package X;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import android.provider.Settings;
import com.bytedance.android.livesdk.util.GlobalContext;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.1O1, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1O1 implements C0WP, InterfaceC63353Oth, InterfaceC47077Idl {
    public static final int LJI() {
        try {
            String release = Build.VERSION.RELEASE;
            o.LJIIIIZZ(release, "release");
            Integer LJJIL = C38350F3i.LJJIL((String) ListProtector.get(s.LJLJJL(release, new String[]{"."}, 0, 6), 0));
            if (LJJIL != null) {
                return LJJIL.intValue();
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static final boolean LJIIIIZZ() {
        try {
            if (Build.VERSION.SDK_INT < 28) {
                return false;
            }
            Object LLILL = C16880lQ.LLILL(GlobalContext.getApplicationContext(), "activity");
            o.LJII(LLILL, "null cannot be cast to non-null type android.app.ActivityManager");
            return ((ActivityManager) LLILL).isBackgroundRestricted();
        } catch (Exception unused) {
            return false;
        }
    }

    public static final boolean LJIIIZ() {
        try {
            Context applicationContext = GlobalContext.getApplicationContext();
            String packageName = applicationContext.getPackageName();
            Object LLILL = C16880lQ.LLILL(applicationContext, "power");
            o.LJII(LLILL, "null cannot be cast to non-null type android.os.PowerManager");
            PowerManager powerManager = (PowerManager) LLILL;
            if (Build.VERSION.SDK_INT >= 23) {
                return powerManager.isIgnoringBatteryOptimizations(packageName);
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static final boolean LJIIJ() {
        if (!LJIIIIZZ() || LJIIIZ()) {
            return true;
        }
        return false;
    }

    public static final boolean LJIIJJI() {
        Object LLILL = C16880lQ.LLILL(GlobalContext.getApplicationContext(), "power");
        o.LJII(LLILL, "null cannot be cast to non-null type android.os.PowerManager");
        if (((PowerManager) LLILL).isPowerSaveMode()) {
            return true;
        }
        String str = Build.MANUFACTURER;
        boolean LJJJJIZL = ujb.o.LJJJJIZL(str, "Huawei", true);
        boolean LJJJJIZL2 = ujb.o.LJJJJIZL(str, "Xiaomi", true);
        try {
            if (LJJJJIZL) {
                int i = Settings.System.getInt(C15380j0.LIZLLL().getContentResolver(), "SmartModeStatus");
                if (i == 4) {
                    return true;
                }
                if (i == 1) {
                    Object invoke = Class.forName("android.os.SystemProperties").getMethod("get", C39086FVq.class).invoke(null, "sys.super_power_save");
                    o.LJII(invoke, "null cannot be cast to non-null type kotlin.String");
                    return o.LJ("true", (String) invoke);
                }
            } else if (LJJJJIZL2) {
                try {
                    if (Settings.System.getInt(C15380j0.LIZLLL().getContentResolver(), "POWER_SAVE_MODE_OPEN") == 1) {
                        return true;
                    }
                    return false;
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    @Override // X.InterfaceC47077Idl
    public void LIZ() {
        C47497IkX.LJ().LIZ();
    }

    @Override // X.InterfaceC47077Idl
    public void LIZJ() {
        C47497IkX.LJ().LIZIZ = new C47138Iek();
    }

    @Override // X.InterfaceC47077Idl
    public void calculateSpeed() {
        C47497IkX.LJ().calculateSpeed();
    }

    @Override // X.InterfaceC47077Idl
    public int getAverageSpeedInKBps() {
        return C47497IkX.LIZJ();
    }

    @Override // X.InterfaceC47077Idl
    public int LJ() {
        return C47497IkX.LIZJ;
    }

    public static final ApplicationExitInfo LJII(Context context) {
        Object next;
        Object next2;
        boolean z;
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        try {
            Object LLILL = C16880lQ.LLILL(GlobalContext.getApplicationContext(), "activity");
            o.LJII(LLILL, "null cannot be cast to non-null type android.app.ActivityManager");
            List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) LLILL).getHistoricalProcessExitReasons(context.getPackageName(), 0, 12);
            o.LJIIIIZZ(historicalProcessExitReasons, "am.getHistoricalProcessE…ntext.packageName, 0, 12)");
            Long recentGoLiveStartTime = InterfaceC30442Bx8.LJIILIIL.LIZJ();
            o.LJIIIIZZ(recentGoLiveStartTime, "recentGoLiveStartTime");
            if (recentGoLiveStartTime.longValue() > 0) {
                ArrayList arrayList = new ArrayList();
                for (ApplicationExitInfo applicationExitInfo : historicalProcessExitReasons) {
                    ApplicationExitInfo applicationExitInfo2 = applicationExitInfo;
                    if (applicationExitInfo2.getTimestamp() >= recentGoLiveStartTime.longValue() && o.LJ(applicationExitInfo2.getProcessName(), context.getPackageName())) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        arrayList.add(applicationExitInfo);
                    }
                }
                Iterator it = arrayList.iterator();
                if (!it.hasNext()) {
                    next2 = null;
                } else {
                    next2 = it.next();
                    if (it.hasNext()) {
                        long timestamp = ((ApplicationExitInfo) next2).getTimestamp() - recentGoLiveStartTime.longValue();
                        do {
                            Object next3 = it.next();
                            long timestamp2 = ((ApplicationExitInfo) next3).getTimestamp() - recentGoLiveStartTime.longValue();
                            if (timestamp > timestamp2) {
                                next2 = next3;
                                timestamp = timestamp2;
                            }
                        } while (it.hasNext());
                    }
                }
                return (ApplicationExitInfo) next2;
            }
            ArrayList arrayList2 = new ArrayList();
            for (ApplicationExitInfo applicationExitInfo3 : historicalProcessExitReasons) {
                if (o.LJ(applicationExitInfo3.getProcessName(), context.getPackageName())) {
                    arrayList2.add(applicationExitInfo3);
                }
            }
            Iterator it2 = arrayList2.iterator();
            if (!it2.hasNext()) {
                next = null;
            } else {
                next = it2.next();
                if (it2.hasNext()) {
                    long timestamp3 = ((ApplicationExitInfo) next).getTimestamp();
                    do {
                        Object next4 = it2.next();
                        long timestamp4 = ((ApplicationExitInfo) next4).getTimestamp();
                        if (timestamp3 < timestamp4) {
                            next = next4;
                            timestamp3 = timestamp4;
                        }
                    } while (it2.hasNext());
                }
            }
            return (ApplicationExitInfo) next;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // X.InterfaceC47077Idl
    public void LIZIZ(int i) {
        C47497IkX.LIZJ = i;
    }

    @Override // X.InterfaceC63353Oth
    public void LIZLLL(Object obj) {
        List<C63120Opw> list = (List) obj;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (C63120Opw c63120Opw : list) {
            C63120Opw LJIIIZ = C115284fk.LJIILIIL().LJIIIZ(c63120Opw.getConversationId());
            if (LJIIIZ != null) {
                LJIIIZ.setUnreadCount(c63120Opw.getUnreadCount());
                LJIIIZ.setReadIndex(c63120Opw.getReadIndex());
                LJIIIZ.setReadIndexV2(c63120Opw.getReadIndexV2());
                LJIIIZ.setReadBadgeCount(c63120Opw.getReadBadgeCount());
                if (LJIIIZ.getReadBadgeCount() > 0) {
                    LJIIIZ.getLocalExt().put("s:read_badge_count_update", "1");
                }
                LJIIIZ.setUnreadSelfMentionedMessages(c63120Opw.getUnreadSelfMentionedMessages());
            }
            C115284fk.LJIILIIL().LJIJJ(false, 3, (C63120Opw[]) list.toArray(new C63120Opw[list.size()]));
        }
    }

    @Override // X.C0WP
    public List LJIIZILJ(List effectPanelList) {
        o.LJIIIZ(effectPanelList, "effectPanelList");
        C0TX.LIZ.LIZJ("VoiceEffect");
        C0TX.LIZLLL("perform voice's process.");
        Iterator<Object> it = ORZ.LJLIIIL(effectPanelList).iterator();
        while (it.hasNext()) {
            Iterator<Object> it2 = ((C1QC) it.next()).LJLILLLLZI.iterator();
            while (it2.hasNext()) {
                LiveEffect liveEffect = (LiveEffect) it2.next();
                C1KJ c1kj = C1KJ.LIZ;
                if (!c1kj.LIZ(liveEffect) && C32141Ny.LIZJ(liveEffect)) {
                    c1kj.LIZLLL(liveEffect.getEffect(), null);
                }
            }
        }
        return effectPanelList;
    }

    @Override // X.InterfaceC47077Idl
    public void setSpeedQueueSize(int i) {
        C47497IkX.LJ().setSpeedQueueSize(i);
    }

    public static final InterfaceC35811ar LJFF(C0X9 c0x9, InterfaceC24520xk interfaceC24520xk, int i) {
        o.LJIIIZ(c0x9, "<this>");
        interfaceC24520xk.LJJIIJ(-1692965168);
        interfaceC24520xk.LJJIIJ(-492369756);
        Object LJIILL = interfaceC24520xk.LJIILL();
        InterfaceC24520xk.LIZ.getClass();
        Object obj = C24500xi.LIZIZ;
        if (LJIILL == obj) {
            LJIILL = C78966Uyw.LJJJIL(Boolean.FALSE);
            interfaceC24520xk.LJJIII(LJIILL);
        }
        interfaceC24520xk.LJJIJIIJIL();
        InterfaceC35811ar interfaceC35811ar = (InterfaceC35811ar) LJIILL;
        interfaceC24520xk.LJJIIJ(511388516);
        boolean LJIJJ = interfaceC24520xk.LJIJJ(c0x9) | interfaceC24520xk.LJIJJ(interfaceC35811ar);
        Object LJIILL2 = interfaceC24520xk.LJIILL();
        if (LJIJJ || LJIILL2 == obj) {
            LJIILL2 = new C2DY(c0x9, interfaceC35811ar, null);
            interfaceC24520xk.LJJIII(LJIILL2);
        }
        interfaceC24520xk.LJJIJIIJIL();
        C24610xt.LJ(c0x9, (InterfaceC88471Ynr) LJIILL2, interfaceC24520xk);
        interfaceC24520xk.LJJIJIIJIL();
        return interfaceC35811ar;
    }

    @Override // X.InterfaceC47077Idl
    public void monitorVideoSpeed(double d, double d2, long j) {
        C47497IkX.LJ().monitorVideoSpeed(d, d2, j);
    }
}
