package X;

import android.content.Context;
import com.ss.android.ugc.aweme.dsp.common.utils.ReportQueueManager;
import com.ss.android.ugc.aweme.dsp.experiment.TTMUGAFConfig;
import com.ss.android.ugc.aweme.music.model.TTMStoreLink;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SV6 {
    public static final HashMap<SVA, C53612L2i> LIZ;

    static {
        HashMap<SVA, C53612L2i> hashMap = new HashMap<>();
        LIZ = hashMap;
        hashMap.put(SVA.RESSO, new C53612L2i());
        hashMap.put(SVA.TIKTOK_MUSIC, new C53612L2i());
    }

    public static InterfaceC92693kP LIZ(SV3 data, SVA targetApp) {
        boolean z;
        o.LJIIIZ(targetApp, "targetApp");
        o.LJIIIZ(data, "data");
        C53612L2i c53612L2i = LIZ.get(targetApp);
        if (c53612L2i == null) {
            return EnumC73418Sre.DISPOSED;
        }
        if (!o.LJ(c53612L2i.LIZIZ, data.LIZLLL)) {
            return EnumC73418Sre.DISPOSED;
        }
        if (data.LIZ.getPriority() <= c53612L2i.LIZ) {
            SVA sva = SVA.TIKTOK_MUSIC;
            if (targetApp == sva && ((TTMUGAFConfig) SVD.LIZIZ.getValue()).getMusicDspAfOpt() != 0) {
                ReportQueueManager reportQueueManager = ReportQueueManager.INSTANCE;
                reportQueueManager.setTargetApp(sva);
                SVG eventType = SVG.SHOW;
                reportQueueManager.setEventType(eventType);
                Context context = data.LIZIZ;
                TTMStoreLink tTMStoreLink = data.LIZJ;
                o.LJIIIZ(context, "context");
                o.LJIIIZ(eventType, "eventType");
                SV7 sv7 = SV7.LIZ;
                Context LLLLL = C16880lQ.LLLLL(context);
                o.LJIIIIZZ(LLLLL, "context.applicationContext");
                if (eventType.getActionType() == SVH.DSP_ACTION_CLICK) {
                    z = true;
                } else {
                    z = false;
                }
                sv7.getClass();
                if (!SV7.LJ(targetApp, LLLLL, z)) {
                    return EnumC73418Sre.DISPOSED;
                }
                return AbstractC73672Svk.LJJIJIL(1).LJJIII(new SV8(tTMStoreLink, eventType, targetApp), false).LJJL(T16.LIZ()).LJJJLIIL(new InterfaceC64592gB() { // from class: X.9E9
                    @Override // X.InterfaceC64592gB
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    }
                }, new InterfaceC64592gB() { // from class: X.9EA
                    @Override // X.InterfaceC64592gB
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    }
                });
            }
            return SVF.LJIIL(targetApp, data.LIZIZ, data.LIZJ, null, SVG.SHOW);
        }
        return EnumC73418Sre.DISPOSED;
    }

    public static void LIZIZ(SVA targetApp, String str, EnumC72191SUx anchorType) {
        o.LJIIIZ(targetApp, "targetApp");
        o.LJIIIZ(anchorType, "anchorType");
        C53612L2i c53612L2i = LIZ.get(targetApp);
        if (c53612L2i == null) {
            return;
        }
        if (!o.LJ(c53612L2i.LIZIZ, str)) {
            c53612L2i.LIZIZ = str;
            c53612L2i.LIZ = anchorType.getPriority();
            return;
        }
        int i = c53612L2i.LIZ;
        int priority = anchorType.getPriority();
        if (i > priority) {
            i = priority;
        }
        c53612L2i.LIZ = i;
    }
}
