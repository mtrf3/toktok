package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public abstract class MM6 {
    public static final /* synthetic */ MM6[] LJLJI;
    public static final MM6 PRIMARY;
    public static final MM6 REQUESTS;
    public static final MM6 SECONDARY;
    public final int LJLIL;
    public final boolean LJLILLLLZI;

    public MM6() {
        throw null;
    }

    public static MM6 valueOf(String str) {
        return (MM6) V0N.LJJJ(MM6.class, str);
    }

    public static MM6[] values() {
        return (MM6[]) LJLJI.clone();
    }

    public abstract /* synthetic */ String getTitleStr();

    static {
        MM6 mm6 = new MM6() { // from class: X.MM7
            @Override // X.MM6
            public final String getTitleStr() {
                return C56204M4a.LIZIZ(R.string.eat);
            }
        };
        PRIMARY = mm6;
        MM6 mm62 = new MM6() { // from class: X.MM9
            @Override // X.MM6
            public final String getTitleStr() {
                return C56204M4a.LIZIZ(R.string.eau);
            }
        };
        SECONDARY = mm62;
        MM6 mm63 = new MM6() { // from class: X.MM8
            @Override // X.MM6
            public final String getTitleStr() {
                return C56204M4a.LIZIZ(R.string.eav);
            }
        };
        REQUESTS = mm63;
        LJLJI = new MM6[]{mm6, mm62, mm63};
    }

    public final int getIndex() {
        return this.LJLIL;
    }

    public final boolean getShowDot() {
        return this.LJLILLLLZI;
    }

    public MM6(String str, int i, int i2, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this.LJLIL = i2;
        this.LJLILLLLZI = z;
    }
}
