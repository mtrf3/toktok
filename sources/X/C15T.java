package X;

import com.bytedance.android.livesdk.livesetting.effect.LiveEffectNewEffectReverseSetting;
import com.bytedance.android.livesdk.livesetting.effect.LiveEffectNewEffectReverseTimeSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.15T, reason: invalid class name */
/* loaded from: classes.dex */
public final class C15T {
    public Object LIZ;
    public Object LIZIZ;

    public /* synthetic */ C15T() {
    }

    public static Iterable LIZIZ(Iterable iterable) {
        long j;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) iterable).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            LiveEffect liveEffect = (LiveEffect) next;
            LiveEffectNewEffectReverseSetting liveEffectNewEffectReverseSetting = LiveEffectNewEffectReverseSetting.INSTANCE;
            if (liveEffectNewEffectReverseSetting.enable()) {
                if (liveEffectNewEffectReverseSetting.enable()) {
                    Effect effect = liveEffect.getEffect();
                    if (effect != null) {
                        j = effect.getPtime();
                    } else {
                        j = 0;
                    }
                    if (j < LiveEffectNewEffectReverseTimeSetting.INSTANCE.getValue()) {
                    }
                }
            }
            arrayList.add(next);
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00aa, code lost:
    
        if (r5 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ef, code lost:
    
        if (r6 == null) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1QC LIZ(com.ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse r10) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15T.LIZ(com.ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse):X.1QC");
    }

    public /* synthetic */ C15T(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
