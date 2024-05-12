package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.ILy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC46478ILy {
    public static final EnumC46478ILy CONTACT_BOOK_SYNCING;
    public static final /* synthetic */ EnumC46478ILy[] LJLILLLLZI;
    public final int LJLIL = 5;

    public static EnumC46478ILy valueOf(String str) {
        return (EnumC46478ILy) V0N.LJJJ(EnumC46478ILy.class, str);
    }

    public static EnumC46478ILy[] values() {
        return (EnumC46478ILy[]) LJLILLLLZI.clone();
    }

    static {
        EnumC46478ILy enumC46478ILy = new EnumC46478ILy();
        CONTACT_BOOK_SYNCING = enumC46478ILy;
        LJLILLLLZI = new EnumC46478ILy[]{enumC46478ILy};
    }

    public final int getValue() {
        return this.LJLIL;
    }
}
