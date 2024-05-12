package X;

import android.os.Bundle;
import kotlin.jvm.internal.o;

/* renamed from: X.GMz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41409GMz {
    public static void LIZ(Bundle bundle) {
        o.LJIIIZ(bundle, "bundle");
        if (bundle.getBoolean("is_aivatar")) {
            return;
        }
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", bundle.getString("creation_id"));
        c145995oB.LJI("shoot_way", bundle.getString("shoot_way"));
        c145995oB.LJI("from_group_id", C78983UzD.LJJIJL());
        c145995oB.LJI("last_group_id", C78983UzD.LJLJJI);
        c145995oB.LJI("last_gid_from", C78983UzD.LJLJJL);
        c145995oB.LJI("group_id", C78939UyV.LJLILLLLZI);
        c145995oB.LJI("music_id", C78983UzD.LJLJLJ);
        FMX.LJIIL("shoot", c145995oB.LIZ);
    }
}
