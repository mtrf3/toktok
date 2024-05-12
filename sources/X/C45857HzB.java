package X;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.ss.android.ugc.aweme.out.AVServiceImpl;
import com.ss.android.ugc.aweme.services.settings.IAVSettingsService;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.o;

/* renamed from: X.HzB, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45857HzB {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C45862HzG.LJLIL);
    public static final C62822Ol8 LIZIZ;
    public static EnumC45860HzE LIZJ;
    public static boolean LIZLLL;
    public static final ConcurrentLinkedQueue<InterfaceC45863HzH> LJ;
    public static final java.util.Map<EnumC45752HxU, FAG<InterfaceC45863HzH>> LJFF;
    public static final HandlerC45859HzD LJI;
    public static final HandlerC45858HzC LJII;
    public static final Boolean LJIIIIZZ;

    static {
        Boolean bool;
        C62822Ol8 LIZIZ2 = C221108m2.LIZIZ(C47068Idc.LJLIL);
        LIZIZ = LIZIZ2;
        LIZJ = EnumC45860HzE.RECORD_ON_NONE;
        LJ = new ConcurrentLinkedQueue<>();
        LJFF = new LinkedHashMap();
        LJI = new HandlerC45859HzD();
        Looper looper = ((HandlerThread) LIZIZ2.getValue()).getLooper();
        o.LJIIIIZZ(looper, "workerThread.looper");
        LJII = new HandlerC45858HzC(looper);
        IAVSettingsService avSettingsService = AVServiceImpl.LIZ().avSettingsService();
        if (avSettingsService != null) {
            bool = Boolean.valueOf(avSettingsService.enableTaskDegradationOpti());
        } else {
            bool = null;
        }
        LJIIIIZZ = bool;
    }

    public static final void LIZ(InterfaceC45863HzH interfaceC45863HzH) {
        if (C45866HzK.LIZIZ()) {
            int i = C45751HxT.LIZ[interfaceC45863HzH.LIZIZ().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                    java.util.Map<EnumC45752HxU, FAG<InterfaceC45863HzH>> map = LJFF;
                    EnumC45752HxU enumC45752HxU = EnumC45752HxU.P2;
                    LinkedHashMap linkedHashMap = (LinkedHashMap) map;
                    Object obj = linkedHashMap.get(enumC45752HxU);
                    if (obj == null) {
                        obj = new FAG();
                        linkedHashMap.put(enumC45752HxU, obj);
                    }
                    ((FAG) obj).offer(interfaceC45863HzH);
                    return;
                }
                java.util.Map<EnumC45752HxU, FAG<InterfaceC45863HzH>> map2 = LJFF;
                EnumC45752HxU enumC45752HxU2 = EnumC45752HxU.P1;
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) map2;
                Object obj2 = linkedHashMap2.get(enumC45752HxU2);
                if (obj2 == null) {
                    obj2 = new FAG();
                    linkedHashMap2.put(enumC45752HxU2, obj2);
                }
                ((FAG) obj2).offer(interfaceC45863HzH);
                return;
            }
            C79057V0z.LJJIZ(interfaceC45863HzH);
            return;
        }
        if (LIZJ.ordinal() == EnumC45860HzE.RECORD_ON_FIRST_FRAME.ordinal() || interfaceC45863HzH.LIZ()) {
            C79057V0z.LJJIZ(interfaceC45863HzH);
        } else {
            LJ.add(interfaceC45863HzH);
        }
    }

    public static final void LIZIZ(EnumC45860HzE status) {
        o.LJIIIZ(status, "status");
        LIZJ = status;
        HandlerC45859HzD handlerC45859HzD = LJI;
        Message obtain = Message.obtain();
        obtain.what = LIZJ.ordinal();
        handlerC45859HzD.sendMessage(obtain);
    }
}
