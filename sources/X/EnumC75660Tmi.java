package X;

/* renamed from: X.Tmi, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public enum EnumC75660Tmi {
    ACTION_PAIR(0),
    ACTION_KEEPALIVE(1),
    ACTION_CANCEL(2);

    public final int LJLIL;

    public static EnumC75660Tmi valueOf(String str) {
        return (EnumC75660Tmi) V0N.LJJJ(EnumC75660Tmi.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EnumC75660Tmi(int i) {
        this.LJLIL = i;
    }
}
