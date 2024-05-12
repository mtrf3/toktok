package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.g;
import com.google.gson.j;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import defpackage.i0;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: X.Dhr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34591Dhr {
    public static final java.util.Set<String> LIZ = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getStringSet("app_launch_cpu_monitor_list", new HashSet());

    public static void LIZ() {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = (ArrayList) GsonProtectorUtils.fromJson(new Gson(), (j) i0.LJ(true, "app_launch_cpu_monitor_list", 31744, g.class, null), ArrayList.class);
        if (arrayList != null && arrayList.size() > 0) {
            hashSet.addAll(arrayList);
        }
        Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).storeStringSet("app_launch_cpu_monitor_list", hashSet);
    }
}
