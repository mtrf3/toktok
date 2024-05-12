package X;

/* renamed from: X.Tly, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public enum EnumC75614Tly {
    NONE(0),
    FOLLOW_INVITE(1),
    RECOMMEND_INVITE(2),
    RANDOM_LINK_MIC_INVITE(5),
    ACTIVITY(6),
    RANDOM_LINK_MIC_RECOMMEND(7),
    MIC_ROOM_INVITE(8),
    BEST_TEAMMATE_INVITE(9),
    RESERVED_INVITE(10),
    PAIRING_INVITE(11),
    PAIRING_ON_RESERVE_INVITE(12),
    TOPIC_PAIR(13),
    TOPIC_RECOMMEND(14),
    WEEKLY_RANK_INVITE(20),
    HOURLY_RANK_INVITE(21),
    WEEKLY_RISING_INVITE(23),
    WEEKLY_ROOKIE_INVITE(24),
    DAILY_RANK_INVITE(26),
    DAILY_RANK_HALL_OF_FAME_INVITE(27),
    RESERVATION_BUBBLE_INVITE(28),
    PAIRING_BUBBLE_INVITE(29),
    MAY_KNOW_INVITE(34),
    BANNER_INVITE(35),
    RANK_LEAGUE_PRELIMINARY_INVITE(30),
    RANK_LEAGUE_SEMIFINAL_INVITE(31),
    RANK_LEAGUE_FINAL_INVITE(32),
    DAILY_ROOKIE_RANK(33);

    public static final C75619Tm3 Companion = new C75619Tm3();
    public int LJLIL;

    public static EnumC75614Tly valueOf(String str) {
        return (EnumC75614Tly) V0N.LJJJ(EnumC75614Tly.class, str);
    }

    public final int getType() {
        return this.LJLIL;
    }

    public final void setType(int i) {
        this.LJLIL = i;
    }

    EnumC75614Tly(int i) {
        this.LJLIL = i;
    }
}
