package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Fu4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40444Fu4 {
    public static boolean LIZ(String scene) {
        o.LJIIIZ(scene, "scene");
        if (o.LJ(scene, "system_launch") || o.LJ(scene, "system_launch_startup_end_to_feed") || o.LJ(scene, "system_launch_feed_to_first_frame") || o.LJ(scene, "system_launch_after_first_frame") || o.LJ(scene, "system_launch_1_minute") || o.LJ(scene, "system_launch_1_minute_feed") || o.LJ(scene, "system_launch_1_to_2_minute") || o.LJ(scene, "system_launch_1_to_2_minute_feed") || o.LJ(scene, "system_launch_isolate_startup_to_first_frame") || o.LJ(scene, "system_launch_isolate_after_first_frame")) {
            return true;
        }
        return false;
    }
}
