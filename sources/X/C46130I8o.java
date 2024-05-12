package X;

import android.graphics.drawable.Animatable;

/* renamed from: X.I8o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46130I8o extends W4V<InterfaceC81599W0t> {
    public final /* synthetic */ long LIZIZ;

    public C46130I8o(long j) {
        this.LIZIZ = j;
    }

    @Override // X.W4V, X.W4Z
    public final void LJFF(String str, Object obj, Animatable animatable) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("type", "tool_performance_effect_preview_icon_show_duration");
        c188727au.LJ(System.currentTimeMillis() - this.LIZIZ, "totaltime");
        FMX.LJIIL("tool_performance_operation_cost_time", c188727au.LIZ);
    }
}
