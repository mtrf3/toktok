package X;

/* renamed from: X.Vy5, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public enum EnumC81461Vy5 {
    InvitationQuestion,
    RecommendQuestion,
    MIX_INVITE_RECOMMEND_QUESTION,
    RecommendComment,
    FavoriteQuestion,
    FavoriteComment,
    AskAQuestion;

    public static EnumC81461Vy5 valueOf(String str) {
        return (EnumC81461Vy5) V0N.LJJJ(EnumC81461Vy5.class, str);
    }

    public final String getNameForMob() {
        int i = C81467VyB.LIZ[ordinal()];
        if (i != 1) {
            if (i != 4) {
                if (i != 5) {
                    return "";
                }
                return "recommendation";
            }
            return "invitation";
        }
        return "favorite";
    }

    public final EnumC81462Vy6 getSource() {
        int i = C81467VyB.LIZ[ordinal()];
        if (i != 1) {
            if (i != 4) {
                if (i != 5) {
                    if (i != 6) {
                        return EnumC81462Vy6.Favorite;
                    }
                    return EnumC81462Vy6.INVITE_RECOMMENDATION_MIX;
                }
                return EnumC81462Vy6.Recommendation;
            }
            return EnumC81462Vy6.Invitation;
        }
        return EnumC81462Vy6.Favorite;
    }

    public final EnumC81464Vy8 getCurrentTabType() {
        if (I1R.LIZLLL()) {
            switch (C81467VyB.LIZ[ordinal()]) {
                case 1:
                case 2:
                    return EnumC81464Vy8.FAVORITE_TAB;
                case 3:
                case 4:
                case 5:
                case 6:
                    return EnumC81464Vy8.SUGGEST_TAB;
                case 7:
                    return EnumC81464Vy8.COMMENTSTAB;
                default:
                    throw new C162476Zf();
            }
        }
        switch (C81467VyB.LIZ[ordinal()]) {
            case 1:
            case 2:
                return EnumC81464Vy8.FAVORITE_TAB;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return EnumC81464Vy8.SUGGEST_TAB;
            default:
                throw new C162476Zf();
        }
    }
}
