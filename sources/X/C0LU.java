package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveRecommendEffectSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.0LU, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0LU {
    public static LiveEffect LIZ;

    public static boolean LIZIZ() {
        if (LIZ != null && LiveRecommendEffectSetting.INSTANCE.enable()) {
            return true;
        }
        return false;
    }

    public static LiveEffect LIZ(List effectList) {
        o.LJIIIZ(effectList, "effectList");
        Object obj = null;
        if (LIZ == null) {
            Iterator it = effectList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (LIZJ((LiveEffect) next)) {
                    obj = next;
                    break;
                }
            }
            LiveEffect liveEffect = (LiveEffect) obj;
            if (liveEffect != null) {
                liveEffect.setLocalViewType(C6NP.RECOMMEND_STICKER);
            }
            LIZ = liveEffect;
        } else if (C39591gx.LIZIZ(LIZ)) {
            LIZ = null;
        }
        return LIZ;
    }

    public static boolean LIZJ(LiveEffect liveEffect) {
        o.LJIIIZ(liveEffect, "<this>");
        if (liveEffect.recommendPreviewIcon.length() <= 0 || C39591gx.LIZIZ(liveEffect) || InterfaceC30442Bx8.w.LIZJ().contains(liveEffect.getResourceId())) {
            return false;
        }
        long j = 1000;
        if (C30725C4b.LIZ() / j <= liveEffect.recommendStartTime || C30725C4b.LIZ() / j >= liveEffect.recommendEndTime) {
            return false;
        }
        return true;
    }

    public static boolean LIZLLL(LiveEffect liveEffect) {
        C30522ByQ c30522ByQ = LiveEffect.Companion;
        LiveEffect liveEffect2 = LIZ;
        c30522ByQ.getClass();
        if (C30522ByQ.LIZ(liveEffect2, liveEffect) && LIZIZ()) {
            return true;
        }
        return false;
    }

    public static void LJ(List effectList) {
        Object obj;
        o.LJIIIZ(effectList, "effectList");
        Iterator it = effectList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (LIZJ((LiveEffect) obj)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        LiveEffect liveEffect = (LiveEffect) obj;
        if (liveEffect != null) {
            C1KJ c1kj = C1KJ.LIZ;
            if (!c1kj.LIZ(liveEffect)) {
                c1kj.LIZLLL(liveEffect.getEffect(), null);
            }
        }
    }
}
