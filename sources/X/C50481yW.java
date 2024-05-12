package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.LinkedHashMap;

/* renamed from: X.1yW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50481yW extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C50481yW LJLIL = new C50481yW();

    public C50481yW() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        Long l;
        long j = 0;
        if (C32141Ny.LJIIIIZZ != null) {
            java.util.Map<Long, C32111Nv> map = C32141Ny.LJFF;
            LiveEffect liveEffect = C32141Ny.LJIIIIZZ;
            Long l2 = null;
            if (liveEffect != null) {
                l = Long.valueOf(liveEffect.effectId);
            } else {
                l = null;
            }
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            C32111Nv c32111Nv = (C32111Nv) linkedHashMap.get(l);
            if (c32111Nv != null) {
                j = (System.currentTimeMillis() / 1000) - c32111Nv.LJLIL;
            }
            LiveEffect liveEffect2 = C32141Ny.LJIIIIZZ;
            if (liveEffect2 != null) {
                l2 = Long.valueOf(liveEffect2.effectId);
            }
            if (linkedHashMap.get(l2) == null) {
                C31014CFe.LJIJJLI("");
                C31014CFe.LJIL("");
            }
        }
        return Long.valueOf(j);
    }
}
