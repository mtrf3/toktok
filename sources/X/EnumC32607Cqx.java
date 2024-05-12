package X;

/* renamed from: X.Cqx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC32607Cqx {
    NONE(""),
    UNLOCK("gift_unlock"),
    COLOR_GIFT("color_change"),
    EVENT("gift_event"),
    GIFT_GUIDE("gift_guide"),
    RANDOM_GIFT("random_effect_gift"),
    RANDOM_FIREWORKS("fireworks"),
    FANS_CLUB_START_GIFT("creator_user_first_guide"),
    FANS_CLUB_LEVEL_GIFT("level_up_gift_unlock"),
    WEEKLY_RANKING_GIFT("weekly_rank_top99_gift");

    public final String LJLIL;

    public static EnumC32607Cqx valueOf(String str) {
        return (EnumC32607Cqx) V0N.LJJJ(EnumC32607Cqx.class, str);
    }

    public final String getDesc() {
        return this.LJLIL;
    }

    EnumC32607Cqx(String str) {
        this.LJLIL = str;
    }
}
