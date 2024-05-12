package X;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'PERMISSION_REMINDER_POPUP' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.41X, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C41X {
    public static final C41X BLOCK;
    public static final C41X EC_SELLER;
    public static final /* synthetic */ C41X[] LJLJJL;
    public static final C41X MATCHED_FRIEND;
    public static final C41X MEDIA_NUDE_FILTER;
    public static final C41X OUT_PUSH_GUIDE_BOTTOM;
    public static final C41X OUT_PUSH_GUIDE_POPUP;
    public static final C41X PERMISSION_MESSAGE;
    public static final C41X PERMISSION_REMINDER_BANNER;
    public static final C41X PERMISSION_REMINDER_DIALOG;
    public static final C41X PERMISSION_REMINDER_POPUP;
    public static final C41X PUSH_PREVIEW;
    public static final C41X READ_RECEIPT_BOTTOM;
    public static final C41X READ_RECEIPT_TOP;
    public static final C41X SAFE_CONVERSATION;
    public static final C41X SAY_HI;
    public static final C41X STRANGER_CHAT;
    public static final C41X SUGGESTED_STICKERS;
    public static final C41X TCM;
    public static final C41X TOP_TIP_FOLLOW;
    public final int LJLIL;
    public final C45Q LJLILLLLZI;
    public final boolean LJLJI;
    public final boolean LJLJJI;

    public C41X() {
        throw null;
    }

    public static C41X valueOf(String str) {
        return (C41X) V0N.LJJJ(C41X.class, str);
    }

    public static C41X[] values() {
        return (C41X[]) LJLJJL.clone();
    }

    public final boolean isDebugMode() {
        return false;
    }

    static {
        C45Q c45q = C45Q.BOTTOM;
        C41X c41x = new C41X("PERMISSION_REMINDER_POPUP", 0, 1, c45q, false, false, 28);
        PERMISSION_REMINDER_POPUP = c41x;
        C41X c41x2 = new C41X("PERMISSION_REMINDER_DIALOG", 1, 1, c45q, true, false, 24);
        PERMISSION_REMINDER_DIALOG = c41x2;
        C45Q c45q2 = C45Q.TOP;
        C41X c41x3 = new C41X("PERMISSION_REMINDER_BANNER", 2, 1, c45q2, false, false, 28);
        PERMISSION_REMINDER_BANNER = c41x3;
        C41X c41x4 = new C41X("PERMISSION_MESSAGE", 3, 2, c45q2, false, true, 20);
        PERMISSION_MESSAGE = c41x4;
        C41X c41x5 = new C41X("BLOCK", 4, 3, c45q, true, false, 24);
        BLOCK = c41x5;
        C41X c41x6 = new C41X("EC_SELLER", 5, 4, c45q, false, false, 28);
        EC_SELLER = c41x6;
        C41X c41x7 = new C41X("STRANGER_CHAT", 6, 5, c45q, false, false, 28);
        STRANGER_CHAT = c41x7;
        C41X c41x8 = new C41X("SAFE_CONVERSATION", 7, 6, c45q, false, false, 28);
        SAFE_CONVERSATION = c41x8;
        C41X c41x9 = new C41X("MEDIA_NUDE_FILTER", 8, 7, c45q, false, false, 28);
        MEDIA_NUDE_FILTER = c41x9;
        C41X c41x10 = new C41X("READ_RECEIPT_BOTTOM", 9, 7, c45q, false, false, 28);
        READ_RECEIPT_BOTTOM = c41x10;
        C41X c41x11 = new C41X("READ_RECEIPT_TOP", 10, 7, c45q2, false, false, 28);
        READ_RECEIPT_TOP = c41x11;
        C41X c41x12 = new C41X("OUT_PUSH_GUIDE_BOTTOM", 11, 8, c45q, false, false, 28);
        OUT_PUSH_GUIDE_BOTTOM = c41x12;
        C41X c41x13 = new C41X("OUT_PUSH_GUIDE_POPUP", 12, 8, c45q, false, false, 28);
        OUT_PUSH_GUIDE_POPUP = c41x13;
        C41X c41x14 = new C41X("PUSH_PREVIEW", 13, 9, c45q2, false, false, 28);
        PUSH_PREVIEW = c41x14;
        C41X c41x15 = new C41X("SUGGESTED_STICKERS", 14, 10, c45q, false, false, 28);
        SUGGESTED_STICKERS = c41x15;
        C41X c41x16 = new C41X("SAY_HI", 15, 11, c45q, false, false, 28);
        SAY_HI = c41x16;
        C41X c41x17 = new C41X("MATCHED_FRIEND", 16, 12, c45q, false, false, 28);
        MATCHED_FRIEND = c41x17;
        C41X c41x18 = new C41X("TOP_TIP_FOLLOW", 17, 13, c45q2, false, false, 28);
        TOP_TIP_FOLLOW = c41x18;
        C41X c41x19 = new C41X("TCM", 18, 14, c45q2, false, true, 20);
        TCM = c41x19;
        LJLJJL = new C41X[]{c41x, c41x2, c41x3, c41x4, c41x5, c41x6, c41x7, c41x8, c41x9, c41x10, c41x11, c41x12, c41x13, c41x14, c41x15, c41x16, c41x17, c41x18, c41x19};
    }

    public final boolean isConflictedWithActionBar() {
        switch (C1028842a.LIZ[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                return false;
        }
    }

    public final boolean isConflictedWithInputView() {
        int i = C1028842a.LIZ[ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    public final boolean isConflictedWithLongPressPanel() {
        int i = C1028842a.LIZ[ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    public final boolean shouldResetKeyboardPanel() {
        int i = C1028842a.LIZ[ordinal()];
        if (i != 4 && i != 7) {
            return false;
        }
        return true;
    }

    public final boolean getCanBeOverridden() {
        return this.LJLJJI;
    }

    public final boolean getCanOverride() {
        return this.LJLJI;
    }

    public final int getPriority() {
        return this.LJLIL;
    }

    public final C45Q getSceneId() {
        return this.LJLILLLLZI;
    }

    public C41X(String str, int i, int i2, C45Q c45q, boolean z, boolean z2, int i3) {
        z = (i3 & 4) != 0 ? false : z;
        z2 = (i3 & 8) != 0 ? false : z2;
        this.LJLIL = i2;
        this.LJLILLLLZI = c45q;
        this.LJLJI = z;
        this.LJLJJI = z2;
    }
}
