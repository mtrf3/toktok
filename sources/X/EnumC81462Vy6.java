package X;

/* renamed from: X.Vy6, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public enum EnumC81462Vy6 {
    TextToQuestion,
    StickerPanel,
    Recommendation,
    INVITE_RECOMMENDATION_MIX,
    Invitation,
    Favorite,
    ReplyPanel,
    Default;

    public static EnumC81462Vy6 valueOf(String str) {
        return (EnumC81462Vy6) V0N.LJJJ(EnumC81462Vy6.class, str);
    }

    public final String getMobValue() {
        switch (C81466VyA.LIZ[ordinal()]) {
            case 1:
                return "text_to_question";
            case 2:
                return "sticker_panel";
            case 3:
                return "recommendation";
            case 4:
                return "invitation";
            case 5:
                return "invite_recommendation_mix";
            case 6:
                return "favorite";
            case 7:
                return "reply_panel";
            case 8:
                return "default";
            default:
                throw new C162476Zf();
        }
    }
}
