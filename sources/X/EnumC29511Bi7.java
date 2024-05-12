package X;

/* renamed from: X.Bi7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC29511Bi7 {
    REQUEST_FROM_SCENE_UNKNOWN(0),
    REQUEST_FROM_SCENE_PERSONAL_CARD(1),
    REQUEST_FROM_SCENE_LIVING_ROOM(2),
    REQUEST_FROM_SCENE_GIFT_PANEL(3);

    public final int LJLIL;

    public static EnumC29511Bi7 valueOf(String str) {
        return (EnumC29511Bi7) V0N.LJJJ(EnumC29511Bi7.class, str);
    }

    public final int getType() {
        return this.LJLIL;
    }

    EnumC29511Bi7(int i) {
        this.LJLIL = i;
    }
}
