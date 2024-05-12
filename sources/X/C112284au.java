package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.im.sdk.activitystatus.analytics.ActivityStatusDelegate;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4au, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C112284au implements InterfaceC107424Jm {
    public static final C112284au LIZ = new C112284au();
    public static final ConcurrentHashMap<String, Integer> LIZIZ = new ConcurrentHashMap<>();
    public static final java.util.Map<LifecycleOwner, InterfaceC112314ax> LIZJ = new LinkedHashMap();

    @Override // X.InterfaceC107424Jm
    public final int LIZIZ(String str) {
        Integer num = LIZIZ.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // X.InterfaceC107424Jm
    public final void LIZJ(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        InterfaceC112314ax interfaceC112314ax = (InterfaceC112314ax) ((LinkedHashMap) LIZJ).get(owner);
        if (interfaceC112314ax != null) {
            interfaceC112314ax.onDestroy();
        }
    }

    @Override // X.InterfaceC107424Jm
    public final void LJFF(C107724Kq params) {
        String str;
        o.LJIIIZ(params, "params");
        if (C107454Jp.LIZ() && IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusViewModel().getSettings().LJFF()) {
            EnumC112364b2 enumC112364b2 = params.LIZIZ;
            if (enumC112364b2 == EnumC112364b2.INNER_PUSH || enumC112364b2 == EnumC112364b2.DM_INNER_PUSH) {
                C112304aw.LIZ(params);
                C112224ao c112224ao = C112224ao.LIZ;
                EnumC112364b2 enumC112364b22 = params.LIZIZ;
                if (enumC112364b22 != null) {
                    str = enumC112364b22.getValue();
                } else {
                    str = null;
                }
                C100193wV.LIZIZ(c112224ao, str, true, params.LIZJ, params.LJFF, "type_show");
                return;
            }
            LifecycleOwner lifecycleOwner = params.LIZ;
            if (lifecycleOwner == null) {
                return;
            }
            java.util.Map<LifecycleOwner, InterfaceC112314ax> map = LIZJ;
            InterfaceC112314ax interfaceC112314ax = (InterfaceC112314ax) ((LinkedHashMap) map).get(lifecycleOwner);
            if (interfaceC112314ax == null) {
                interfaceC112314ax = new ActivityStatusDelegate(lifecycleOwner);
            }
            map.put(lifecycleOwner, interfaceC112314ax);
            interfaceC112314ax.LIZIZ(new AqS151S0100000_1(lifecycleOwner, 1062));
            interfaceC112314ax.LIZ(params);
            if (o.LJ(params.LJI, Boolean.TRUE)) {
                interfaceC112314ax.LIZJ(params);
            }
        }
    }

    @Override // X.InterfaceC107424Jm
    public final void LJI(EnumC107414Jl from) {
        o.LJIIIZ(from, "from");
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(onEventV3, "onEventV3");
        C1HQ c1hq = new C1HQ();
        c1hq.put("enter_method", from.getValue());
        onEventV3.LIZIZ("activity_status_pop_up_show", c1hq);
    }

    @Override // X.InterfaceC107424Jm
    public final void LIZ(EnumC107414Jl from, boolean z) {
        String str;
        o.LJIIIZ(from, "from");
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(onEventV3, "onEventV3");
        C1HQ c1hq = new C1HQ();
        c1hq.put("enter_method", from.getValue());
        if (z) {
            str = "on";
        } else if (!z) {
            str = "off";
        } else {
            throw new C162476Zf();
        }
        c1hq.put("to_status", str);
        onEventV3.LIZIZ("activity_status_pop_up_close", c1hq);
    }

    @Override // X.InterfaceC107424Jm
    public final void LIZLLL(String sessionId, C4FY status) {
        o.LJIIIZ(sessionId, "sessionId");
        o.LJIIIZ(status, "status");
        LIZIZ.put(sessionId, Integer.valueOf(status.getValue()));
    }

    @Override // X.InterfaceC107424Jm
    public final void LJ(C107724Kq params, boolean z, InterfaceC75532xp onEventV3) {
        String str;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(onEventV3, "onEventV3");
        if (C107454Jp.LIZ() && IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusViewModel().getSettings().LJFF()) {
            if (!z) {
                C112224ao c112224ao = C112224ao.LIZ;
                EnumC112364b2 enumC112364b2 = params.LIZIZ;
                if (enumC112364b2 != null) {
                    str = enumC112364b2.getValue();
                } else {
                    str = null;
                }
                C100193wV.LIZIZ(c112224ao, str, o.LJ(params.LJI, Boolean.TRUE), params.LIZJ, params.LJFF, "type_click");
            }
            if (!o.LJ(params.LJI, Boolean.TRUE)) {
                return;
            }
            InterfaceC112314ax interfaceC112314ax = (InterfaceC112314ax) ((LinkedHashMap) LIZJ).get(params.LIZ);
            if (interfaceC112314ax != null) {
                interfaceC112314ax.LIZLLL(params, C772831o.LIZ());
            } else {
                onEventV3.LIZIZ("activity_status_click", new C112294av(params).LIZ());
            }
        }
    }
}
