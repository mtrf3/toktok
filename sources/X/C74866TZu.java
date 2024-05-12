package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.TZu, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74866TZu implements InterfaceC76728U9k {
    public java.util.Map<String, OnLineMicInfo> LIZ = C113554cx.LJJJLIIL();
    public final /* synthetic */ C74861TZp LIZIZ;

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

    public C74866TZu(C74861TZp c74861TZp) {
        this.LIZIZ = c74861TZp;
    }

    @Override // X.InterfaceC76728U9k
    public final void LIZJ(java.util.Map<String, OnLineMicInfo> fixedPositionMap) {
        Integer num;
        MicPositionInfo micPositionData;
        MicPositionInfo micPositionData2;
        o.LJIIIZ(fixedPositionMap, "fixedPositionMap");
        C74861TZp c74861TZp = this.LIZIZ;
        String str = c74861TZp.LIZ.LIZ.LIZJ;
        if (str != null) {
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
                C74996Tc0 c74996Tc0 = c74861TZp.LIZ;
                c74996Tc0.getClass();
                c74996Tc0.LIZ.LJIIJJI(str);
            }
        }
        this.LIZ = fixedPositionMap;
    }
}
