package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.TZv, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74867TZv implements InterfaceC76728U9k {
    public java.util.Map<String, OnLineMicInfo> LIZ = C113554cx.LJJJLIIL();
    public final /* synthetic */ C74648TRk LIZIZ;

    @Override // X.InterfaceC76728U9k
    public final void LIZ(java.util.Map<String, OnLineMicInfo> liveUsersPositionMap) {
        o.LJIIIZ(liveUsersPositionMap, "liveUsersPositionMap");
    }

    @Override // X.InterfaceC76728U9k
    public final void LIZIZ(java.util.Map<String, OnLineMicInfo> floatPositionMap) {
        o.LJIIIZ(floatPositionMap, "floatPositionMap");
    }

    @Override // X.InterfaceC76728U9k
    public final void LIZLLL(java.util.Map<String, OnLineMicInfo> liveUsersPositionMap) {
        o.LJIIIZ(liveUsersPositionMap, "liveUsersPositionMap");
    }

    public C74867TZv(C74648TRk c74648TRk) {
        this.LIZIZ = c74648TRk;
    }

    @Override // X.InterfaceC76728U9k
    public final void LIZJ(java.util.Map<String, OnLineMicInfo> fixedPositionMap) {
        String str;
        Integer num;
        MicPositionInfo micPositionData;
        MicPositionInfo micPositionData2;
        o.LJIIIZ(fixedPositionMap, "fixedPositionMap");
        C74648TRk c74648TRk = this.LIZIZ;
        AbstractC75001Tc5 abstractC75001Tc5 = c74648TRk.LIZ;
        if ((abstractC75001Tc5 instanceof C74997Tc1) && (str = abstractC75001Tc5.LIZ.LIZJ) != null) {
            OnLineMicInfo onLineMicInfo = this.LIZ.get(str);
            Integer num2 = null;
            if (onLineMicInfo != null && (micPositionData2 = onLineMicInfo.getMicPositionData()) != null) {
                num = Integer.valueOf(micPositionData2.getPosition());
            } else {
                num = null;
            }
            OnLineMicInfo onLineMicInfo2 = fixedPositionMap.get(str);
            if (onLineMicInfo2 != null && (micPositionData = onLineMicInfo2.getMicPositionData()) != null) {
                num2 = Integer.valueOf(micPositionData.getPosition());
            }
            if (!o.LJ(num, num2)) {
                AbstractC75001Tc5 abstractC75001Tc52 = c74648TRk.LIZ;
                abstractC75001Tc52.getClass();
                abstractC75001Tc52.LIZ.LJIIJJI(str);
            }
        }
        this.LIZ = fixedPositionMap;
    }
}
