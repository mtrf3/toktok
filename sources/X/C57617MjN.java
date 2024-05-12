package X;

import java.util.LinkedHashMap;

/* renamed from: X.MjN, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57617MjN extends AbstractC57637Mjh {
    public static final java.util.Map<String, Boolean> LIZIZ = new LinkedHashMap();

    @Override // X.AbstractC57637Mjh
    public final boolean LIZ() {
        OSZ osz;
        boolean z;
        int friendCount = this.LIZ.getFriendCount();
        if (friendCount <= 5) {
            osz = new OSZ(Integer.valueOf(C57626MjW.LIZ().followFeedConfig.intervalLite), Integer.valueOf(C57626MjW.LIZ().followFeedConfig.showsPerDayLite));
        } else if (friendCount <= 60) {
            osz = new OSZ(Integer.valueOf(C57626MjW.LIZ().followFeedConfig.interval), Integer.valueOf(C57626MjW.LIZ().followFeedConfig.showsPerDay));
        } else {
            osz = new OSZ(Integer.valueOf(C57626MjW.LIZ().followFeedConfig.intervalPlus), Integer.valueOf(C57626MjW.LIZ().followFeedConfig.showsPerDayPlus));
        }
        int intValue = ((Number) osz.getFirst()).intValue();
        int intValue2 = ((Number) osz.getSecond()).intValue();
        if (System.currentTimeMillis() >= K72.LJ(C30581Hy.LJJJI(intValue, K74.DAYS)) + C2P9.LIZ().getLong("timestamp_of_seen", 0L)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C2P9.LIZ().storeLong("count_of_seen", 0L);
        } else if (!C57626MjW.LIZJ() || C2P9.LIZ().getInt("count_of_seen", 0) >= intValue2) {
            C221018lt.LIZ("RecBigCardConditionUtil", "[checkFollowingFeedBigCardFrequency] Exceeding frequency control");
            return false;
        }
        return true;
    }

    @Override // X.AbstractC57637Mjh
    public final boolean LIZIZ() {
        if (C46393IIr.LIZ) {
            C221018lt.LIZ("RecBigCardConditionUtil", "[checkTestModeOpen-following feed] enable");
            return true;
        }
        return false;
    }

    @Override // X.AbstractC57637Mjh
    public final boolean LIZJ() {
        if (C57626MjW.LIZJ()) {
            Boolean bool = (Boolean) ((LinkedHashMap) LIZIZ).get(this.LIZ.getUid());
            if (bool != null && bool.booleanValue()) {
                C221018lt.LIZ("RecBigCardConditionUtil", "[notShownInSameAppSession] has shown in on app session");
                return false;
            }
            return true;
        }
        return true;
    }
}
