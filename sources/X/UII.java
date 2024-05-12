package X;

import java.util.HashSet;

/* loaded from: classes14.dex */
public final /* synthetic */ class UII {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(int i) {
        HashSet<Integer> hashSet = UIJ.LIZ;
        if (hashSet.isEmpty()) {
            hashSet.add(42031);
            hashSet.add(42032);
            hashSet.add(42030);
            hashSet.add(4005265);
            hashSet.add(4005269);
            hashSet.add(4005268);
            hashSet.add(4005271);
            hashSet.add(4005270);
            hashSet.add(4005266);
            hashSet.add(4005267);
        }
        return hashSet.contains(Integer.valueOf(i));
    }
}
