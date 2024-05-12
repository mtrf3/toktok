package X;

import kotlin.jvm.internal.o;

/* renamed from: X.GhV, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42213GhV {
    public static void LIZ(int i, long j, String stuckScene) {
        o.LJIIIZ(stuckScene, "stuckScene");
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZ(i, "status");
        c145995oB.LIZIZ(j, "stuck_duration");
        c145995oB.LJI("stuck_scene", stuckScene);
        GXR.LIZ("tool_performance_stream_edit_preview_stuck", c145995oB.LIZ);
    }
}
