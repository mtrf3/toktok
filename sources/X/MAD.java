package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public abstract class MAD {
    public static final MAD ARCHIVE_FEED;
    public static final /* synthetic */ MAD[] LJLIL;
    public static final MAD PUBLISH;

    public MAD() {
        throw null;
    }

    public static MAD valueOf(String str) {
        return (MAD) V0N.LJJJ(MAD.class, str);
    }

    public static MAD[] values() {
        return (MAD[]) LJLIL.clone();
    }

    public abstract int getValue();

    static {
        MAD mad = new MAD() { // from class: X.MAG
            @Override // X.MAD
            public final int getValue() {
                return 0;
            }
        };
        ARCHIVE_FEED = mad;
        MAD mad2 = new MAD() { // from class: X.MAF
            public final int LJLILLLLZI = 1;

            @Override // X.MAD
            public final int getValue() {
                return this.LJLILLLLZI;
            }
        };
        PUBLISH = mad2;
        LJLIL = new MAD[]{mad, mad2};
    }

    public MAD(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
    }
}
