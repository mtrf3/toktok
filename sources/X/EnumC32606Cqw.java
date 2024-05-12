package X;

/* renamed from: X.Cqw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC32606Cqw {
    UNKNOWN("unknown"),
    GIFT_COLOR("color_change"),
    GIFT_UNLOCK("gift_unlock"),
    GIFT_GUIDE("gift_guide"),
    RANDOM_GIFT("random_gift"),
    RANDOM_FIREWORKS("fireworks"),
    FANS_CLUB_JOIN_GIFT("creator_user_first_guide"),
    FANS_CLUB_LEVEL_GIFT("level_up_gift_unlock"),
    WEEKLY_RANKING_GIFT("weekly_rank_top99_gift"),
    USER_LEVEL_UP("user_level_up"),
    MATCH_ITEM("match_item");

    public final String LJLIL;

    public static EnumC32606Cqw valueOf(String str) {
        return (EnumC32606Cqw) V0N.LJJJ(EnumC32606Cqw.class, str);
    }

    public final String getDesc() {
        return this.LJLIL;
    }

    EnumC32606Cqw(String str) {
        this.LJLIL = str;
    }
}
