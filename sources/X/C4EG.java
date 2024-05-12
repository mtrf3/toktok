package X;

import com.zhiliaoapp.musically.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DEFAULT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.4EG, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4EG {
    public static final C4EG CANCEL_TIP;
    public static final C4EG DEFAULT;
    public static final C4EG DEFAULT_TIP;
    public static final /* synthetic */ C4EG[] LJLJJI;
    public static final C4EG MSG_TOO_SHORT_TIP;
    public static final C4EG UN_RECOGNIZE_TIP;
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final Integer LJLJI;

    public static C4EG valueOf(String str) {
        return (C4EG) V0N.LJJJ(C4EG.class, str);
    }

    public static C4EG[] values() {
        return (C4EG[]) LJLJJI.clone();
    }

    static {
        int i = 0;
        C4EG c4eg = new C4EG("DEFAULT", i, i, i);
        DEFAULT = c4eg;
        C4EG c4eg2 = new C4EG("DEFAULT_TIP", 1, R.string.s3b, R.attr.gx);
        DEFAULT_TIP = c4eg2;
        int i2 = R.string.s3c;
        int i3 = R.attr.e7;
        C4EG c4eg3 = new C4EG("CANCEL_TIP", 2, i2, i3);
        CANCEL_TIP = c4eg3;
        C4EG c4eg4 = new C4EG("UN_RECOGNIZE_TIP", 3, R.string.s3d, R.attr.e7, Integer.valueOf(R.raw.icon_exclamation_mark_triangle_fill));
        UN_RECOGNIZE_TIP = c4eg4;
        C4EG c4eg5 = new C4EG("MSG_TOO_SHORT_TIP", 4, R.string.s3e, i3);
        MSG_TOO_SHORT_TIP = c4eg5;
        LJLJJI = new C4EG[]{c4eg, c4eg2, c4eg3, c4eg4, c4eg5};
    }

    public final int getColorAttrRes() {
        return this.LJLILLLLZI;
    }

    public final Integer getIconRes() {
        return this.LJLJI;
    }

    public final int getTextRes() {
        return this.LJLIL;
    }

    public /* synthetic */ C4EG(String str, int i, int i2, int i3) {
        this(str, i, i2, i3, null);
    }

    public C4EG(String str, int i, int i2, int i3, Integer num) {
        this.LJLIL = i2;
        this.LJLILLLLZI = i3;
        this.LJLJI = num;
    }
}
