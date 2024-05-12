package X;

/* renamed from: X.MYo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC56998MYo {
    NONE(-1),
    GENERAL(0),
    ACTIVE_STATUS(1),
    STORY_WIDGET(2),
    STORY(3),
    LIVE_SINGLE(4),
    POST(5),
    OTD_SINGLE(6);

    public final int LJLIL;

    public static EnumC56998MYo valueOf(String str) {
        return (EnumC56998MYo) V0N.LJJJ(EnumC56998MYo.class, str);
    }

    public final int getType() {
        return this.LJLIL;
    }

    EnumC56998MYo(int i) {
        this.LJLIL = i;
    }
}
