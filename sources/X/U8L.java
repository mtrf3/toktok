package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U8L implements InterfaceC76728U9k {
    public final /* synthetic */ U8H LIZ;

    public U8L(U8H u8h) {
        this.LIZ = u8h;
    }

    @Override // X.InterfaceC76728U9k
    public final void LIZ(java.util.Map<String, OnLineMicInfo> liveUsersPositionMap) {
        o.LJIIIZ(liveUsersPositionMap, "liveUsersPositionMap");
        this.LIZ.getClass();
        String LJJJ = U8H.LJJJ(677);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ.LJJIJ());
        LIZ.append(":onLiveUsersFloatPositionChanged size = ");
        LIZ.append(liveUsersPositionMap.size());
        C32014ChO.LJFF(LJJJ, X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC76728U9k
    public final void LIZIZ(java.util.Map<String, OnLineMicInfo> floatPositionMap) {
        o.LJIIIZ(floatPositionMap, "floatPositionMap");
        this.LIZ.getClass();
        String LJJJ = U8H.LJJJ(662);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ.LJJIJ());
        LIZ.append(":onFloatPositionChanged size = ");
        LIZ.append(floatPositionMap.size());
        C32014ChO.LJFF(LJJJ, X1D.LIZIZ(LIZ));
        Layout LIZ2 = this.LIZ.LJJIIJZLJL().LIZ();
        if (LIZ2 != null) {
            U8H u8h = this.LIZ;
            if (!u8h.LJJIJL() && !LIZ2.isFixedType()) {
                for (Map.Entry<String, OnLineMicInfo> entry : floatPositionMap.entrySet()) {
                    if (u8h.LJIJJ().LJI(entry.getKey()) == null) {
                        C76703U8l.LJIILL(u8h.LJIJJ(), new C76701U8j(EnumC75419Tip.StateJoined, null, entry.getKey(), null, null, null, 248));
                    }
                }
                u8h.LJJIJIL();
                U8H.LJJLIIIJJIZ(u8h, LIZ2, true, false, null, 24);
            }
        }
    }

    @Override // X.InterfaceC76728U9k
    public final void LIZJ(java.util.Map<String, OnLineMicInfo> fixedPositionMap) {
        o.LJIIIZ(fixedPositionMap, "fixedPositionMap");
        this.LIZ.getClass();
        String LJJJ = U8H.LJJJ(653);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ.LJJIJ());
        LIZ.append(":onFixedPositionChanged size = ");
        LIZ.append(fixedPositionMap.size());
        C32014ChO.LJFF(LJJJ, X1D.LIZIZ(LIZ));
        Layout LIZ2 = this.LIZ.LJJIIJZLJL().LIZ();
        if (LIZ2 != null) {
            U8H u8h = this.LIZ;
            if (!u8h.LJJIJL() && LIZ2.isFixedType()) {
                u8h.LJJIJIL();
                u8h.LJJJIL(null);
            }
        }
    }

    @Override // X.InterfaceC76728U9k
    public final void LIZLLL(java.util.Map<String, OnLineMicInfo> liveUsersPositionMap) {
        o.LJIIIZ(liveUsersPositionMap, "liveUsersPositionMap");
        this.LIZ.getClass();
        String LJJJ = U8H.LJJJ(673);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ.LJJIJ());
        LIZ.append(":onLiveUsersPositionChanged size = ");
        LIZ.append(liveUsersPositionMap.size());
        C32014ChO.LJFF(LJJJ, X1D.LIZIZ(LIZ));
    }
}
