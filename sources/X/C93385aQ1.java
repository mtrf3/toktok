package X;

import kotlin.jvm.internal.AqS175S0100000_9;

/* renamed from: X.aQ1, reason: case insensitive filesystem */
/* loaded from: classes32.dex */
public final class C93385aQ1 implements R0N {
    public final /* synthetic */ InterfaceC88472Yns<EnumC62242cO, C76800UCe> LIZ;

    public C93385aQ1(AqS175S0100000_9 aqS175S0100000_9) {
        this.LIZ = aqS175S0100000_9;
    }

    @Override // X.R0N
    public final void LIZ(int i) {
        EnumC62242cO enumC62242cO;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    enumC62242cO = EnumC62242cO.UNKNOWN;
                } else {
                    enumC62242cO = EnumC62242cO.REASON_DEVELOPER_ANIMATION;
                }
            } else {
                enumC62242cO = EnumC62242cO.REASON_API_ANIMATION;
            }
        } else {
            enumC62242cO = EnumC62242cO.REASON_GESTURE;
        }
        this.LIZ.invoke(enumC62242cO);
    }
}
