package X;

import defpackage.e1;
import kotlin.jvm.internal.o;

/* renamed from: X.HqJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45307HqJ {
    public static final /* synthetic */ int LIZ = 0;

    public static C0I7 LIZ(C0I7 option) {
        o.LJIIIZ(option, "option");
        if (C45623HvP.LIZ() && option == C0I7.LAZY && e1.LIZ(31744, "creative_tools_component_force_lazy", true, false)) {
            return C0I7.FORCE_LAZY;
        }
        return option;
    }
}
