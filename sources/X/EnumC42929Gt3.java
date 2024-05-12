package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Gt3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC42929Gt3 {
    public static final EnumC42929Gt3 CreationPageEntered;
    public static final /* synthetic */ EnumC42929Gt3[] LJLIL;
    public static final EnumC42929Gt3 TitleSeen;
    public static final EnumC42929Gt3 Unknown;

    public EnumC42929Gt3() {
        throw null;
    }

    public static EnumC42929Gt3 valueOf(String str) {
        return (EnumC42929Gt3) V0N.LJJJ(EnumC42929Gt3.class, str);
    }

    public static EnumC42929Gt3[] values() {
        return (EnumC42929Gt3[]) LJLIL.clone();
    }

    public abstract /* synthetic */ int getValue();

    static {
        EnumC42929Gt3 enumC42929Gt3 = new EnumC42929Gt3() { // from class: X.Gt4
            @Override // X.EnumC42929Gt3
            public final int getValue() {
                return 0;
            }
        };
        Unknown = enumC42929Gt3;
        EnumC42929Gt3 enumC42929Gt32 = new EnumC42929Gt3() { // from class: X.Gt6
            @Override // X.EnumC42929Gt3
            public final int getValue() {
                return 1;
            }
        };
        TitleSeen = enumC42929Gt32;
        EnumC42929Gt3 enumC42929Gt33 = new EnumC42929Gt3() { // from class: X.Gt5
            @Override // X.EnumC42929Gt3
            public final int getValue() {
                return 2;
            }
        };
        CreationPageEntered = enumC42929Gt33;
        LJLIL = new EnumC42929Gt3[]{enumC42929Gt3, enumC42929Gt32, enumC42929Gt33};
    }

    public EnumC42929Gt3(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
    }
}
