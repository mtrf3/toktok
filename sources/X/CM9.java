package X;

import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public enum CM9 {
    HOURLY_RANK(0, "hourly_rank"),
    WEEKLY_RANK(1, "weekly_rank"),
    WEEKLY_ROOKIE_RANK(5, "rookie_star_rank"),
    EC_WEEKLY_RANK(6, "sale_rank"),
    DAILY_RANK(8, "daily_rank"),
    WEEKLY_GAME_RANK(10, "weekly_game_rank"),
    DAILY_GAME_RANK(11, "daily_game_rank"),
    DAILY_RANK_HALL_OF_FAME(12, "hall_of_fame_rank"),
    UNKNOWN(-1, "unknown");

    public static final CMA Companion = new CMA();
    public final int LJLIL;
    public final String LJLILLLLZI;

    public static CM9 valueOf(String str) {
        return (CM9) V0N.LJJJ(CM9.class, str);
    }

    public final String getRankName() {
        return this.LJLILLLLZI;
    }

    public final int getType() {
        return this.LJLIL;
    }

    public static final CM9 valueOf(int i) {
        Companion.getClass();
        for (CM9 cm9 : values()) {
            if (i == cm9.getType()) {
                return cm9;
            }
        }
        return UNKNOWN;
    }

    public static final CM9 valueOfName(String str) {
        Companion.getClass();
        for (CM9 cm9 : values()) {
            if (!o.LJ(str, cm9.getRankName())) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(cm9.getRankName());
                LIZ.append("_notice");
                if (o.LJ(str, X1D.LIZIZ(LIZ))) {
                    return cm9;
                }
            } else {
                return cm9;
            }
        }
        return UNKNOWN;
    }

    CM9(int i, String str) {
        this.LJLIL = i;
        this.LJLILLLLZI = str;
    }
}
