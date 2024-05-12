package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.K5b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC51135K5b {
    public static final EnumC51135K5b HIGH;
    public static final /* synthetic */ EnumC51135K5b[] LJLIL;
    public static final EnumC51135K5b LOW;
    public static final EnumC51135K5b MEDIUM;

    public EnumC51135K5b() {
        throw null;
    }

    public static EnumC51135K5b valueOf(String str) {
        return (EnumC51135K5b) V0N.LJJJ(EnumC51135K5b.class, str);
    }

    public static EnumC51135K5b[] values() {
        return (EnumC51135K5b[]) LJLIL.clone();
    }

    public abstract int getSearchBarHeight();

    public abstract int getSearchBarInnerHeight();

    static {
        EnumC51135K5b enumC51135K5b = new EnumC51135K5b() { // from class: X.K5z
            public final int LJLILLLLZI = C7MY.LIZIZ(52);
            public final int LJLJI = C7MY.LIZIZ(36);

            @Override // X.EnumC51135K5b
            public final int getSearchBarHeight() {
                return this.LJLILLLLZI;
            }

            @Override // X.EnumC51135K5b
            public final int getSearchBarInnerHeight() {
                return this.LJLJI;
            }
        };
        HIGH = enumC51135K5b;
        EnumC51135K5b enumC51135K5b2 = new EnumC51135K5b() { // from class: X.K5k
            public final int LJLILLLLZI = C7MY.LIZIZ(50);
            public final int LJLJI = C7MY.LIZIZ(34);

            @Override // X.EnumC51135K5b
            public final int getSearchBarHeight() {
                return this.LJLILLLLZI;
            }

            @Override // X.EnumC51135K5b
            public final int getSearchBarInnerHeight() {
                return this.LJLJI;
            }
        };
        MEDIUM = enumC51135K5b2;
        EnumC51135K5b enumC51135K5b3 = new EnumC51135K5b() { // from class: X.K60
            public final int LJLILLLLZI = C7MY.LIZIZ(48);
            public final int LJLJI = C7MY.LIZIZ(34);

            @Override // X.EnumC51135K5b
            public final int getSearchBarHeight() {
                return this.LJLILLLLZI;
            }

            @Override // X.EnumC51135K5b
            public final int getSearchBarInnerHeight() {
                return this.LJLJI;
            }
        };
        LOW = enumC51135K5b3;
        LJLIL = new EnumC51135K5b[]{enumC51135K5b, enumC51135K5b2, enumC51135K5b3};
    }

    public EnumC51135K5b(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
    }
}
