package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.jvm.internal.o;

/* renamed from: X.ByQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30522ByQ {
    public static boolean LIZ(LiveEffect liveEffect, LiveEffect liveEffect2) {
        if (liveEffect == null && liveEffect2 == null) {
            return true;
        }
        if (liveEffect == null || liveEffect2 == null) {
            return false;
        }
        if (o.LJ(liveEffect.getResourceId(), liveEffect2.getResourceId()) || liveEffect2.effectId == liveEffect.effectId) {
            return true;
        }
        return false;
    }
}
