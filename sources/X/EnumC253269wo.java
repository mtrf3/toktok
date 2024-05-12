package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9wo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class EnumC253269wo {
    public static final EnumC253269wo ALL;
    public static final EnumC253269wo FOLLOWING;
    public static final /* synthetic */ EnumC253269wo[] LJLILLLLZI;
    public static final EnumC253269wo NOT_REPLIED;
    public static final EnumC253269wo UNREAD;
    public final int LJLIL;

    public EnumC253269wo() {
        throw null;
    }

    public static EnumC253269wo valueOf(String str) {
        return (EnumC253269wo) V0N.LJJJ(EnumC253269wo.class, str);
    }

    public static EnumC253269wo[] values() {
        return (EnumC253269wo[]) LJLILLLLZI.clone();
    }

    public abstract /* synthetic */ String getTitleStr();

    static {
        EnumC253269wo enumC253269wo = new EnumC253269wo() { // from class: X.9ws
            @Override // X.EnumC253269wo
            public final String getTitleStr() {
                return "";
            }
        };
        ALL = enumC253269wo;
        EnumC253269wo enumC253269wo2 = new EnumC253269wo() { // from class: X.9wr
            @Override // X.EnumC253269wo
            public final String getTitleStr() {
                return C56204M4a.LIZIZ(R.string.e_o);
            }
        };
        UNREAD = enumC253269wo2;
        EnumC253269wo enumC253269wo3 = new EnumC253269wo() { // from class: X.9wq
            @Override // X.EnumC253269wo
            public final String getTitleStr() {
                return C56204M4a.LIZIZ(R.string.e_p);
            }
        };
        NOT_REPLIED = enumC253269wo3;
        EnumC253269wo enumC253269wo4 = new EnumC253269wo() { // from class: X.9wp
            @Override // X.EnumC253269wo
            public final String getTitleStr() {
                return C56204M4a.LIZIZ(R.string.e_q);
            }
        };
        FOLLOWING = enumC253269wo4;
        LJLILLLLZI = new EnumC253269wo[]{enumC253269wo, enumC253269wo2, enumC253269wo3, enumC253269wo4};
    }

    public final int getIndex() {
        return this.LJLIL;
    }

    public EnumC253269wo(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this.LJLIL = i2;
    }
}
