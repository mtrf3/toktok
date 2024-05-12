package X;

import com.ss.android.ugc.awemepushlib.interaction.PushService;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M5Z extends M61 {
    public M5Z() {
        super(false);
    }

    @Override // X.M61
    public final void LIZIZ(M5X m5x) {
        C56235M5f.LIZJ("PushPreloadCacheNode");
        PushService.createIPushApibyMonsterPlugin(false).preloadPushCacheAsync(m5x.LJLILLLLZI.getLastPathSegment());
    }

    @Override // X.M61
    public final boolean LIZJ(M5X m5x) {
        if (!M5K.LIZJ()) {
            Object obj = m5x.LJLJJL.get("is_from_notification");
            if (!(obj instanceof Boolean)) {
                obj = null;
            }
            if (o.LJ(obj, Boolean.TRUE) && C33710DKw.LIZIZ()) {
                return true;
            }
        }
        return false;
    }
}
