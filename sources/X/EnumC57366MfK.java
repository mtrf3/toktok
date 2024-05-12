package X;

/* renamed from: X.MfK, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC57366MfK {
    CARD("card"),
    POP_UP("pop_up"),
    ITEM("item"),
    SHARE_LINK("share_link"),
    LOGIN("login"),
    PUSH("push"),
    INBOX_NOTICE("inbox_notice"),
    RELATION_LABEL("relation_label"),
    MESSAGE_CARD("message_card"),
    INBOX_INTERACTION_MESSAGE("inbox_interaction_message");

    public final String LJLIL;

    public static EnumC57366MfK valueOf(String str) {
        return (EnumC57366MfK) V0N.LJJJ(EnumC57366MfK.class, str);
    }

    public final String getType() {
        return this.LJLIL;
    }

    EnumC57366MfK(String str) {
        this.LJLIL = str;
    }
}
