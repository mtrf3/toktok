package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.1gx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39591gx implements InterfaceC08040Tg {
    public static final C39591gx LIZ = new C39591gx();
    public static final java.util.Set<String> LIZIZ;
    public static final java.util.Set<C17H> LIZJ;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LIZIZ = linkedHashSet;
        LIZJ = new LinkedHashSet();
        java.util.Set<String> LIZJ2 = InterfaceC30442Bx8.S1.LIZJ();
        o.LJIIIIZZ(LIZJ2, "LIVE_EFFECT_REMOVE_LIST.value");
        linkedHashSet.addAll(LIZJ2);
    }

    public static final void LIZ(LiveEffect liveEffect) {
        if (liveEffect == null) {
            return;
        }
        String resourceId = liveEffect.getResourceId();
        if (resourceId != null) {
            java.util.Set<String> set = LIZIZ;
            set.add(resourceId);
            C48459J0d<java.util.Set<String>> c48459J0d = InterfaceC30442Bx8.S1;
            c48459J0d.LIZ(set);
            c48459J0d.LIZLLL();
        }
        Iterator<C17H> it = LIZJ.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ(liveEffect);
        }
    }

    public static boolean LIZIZ(LiveEffect liveEffect) {
        if (liveEffect == null) {
            return false;
        }
        return LIZIZ.contains(liveEffect.getResourceId());
    }
}
