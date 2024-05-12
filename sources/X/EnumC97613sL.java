package X;

import com.zhiliaoapp.musically.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EmptyTopNoticeView' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.3sL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC97613sL {
    public static final EnumC97613sL DM_TURN_ON_PERMISSION_EVERYONE;
    public static final EnumC97613sL DM_TURN_ON_PERMISSION_EVERYONE_CREATOR;
    public static final EnumC97613sL DM_TURN_ON_PERMISSION_FRIENDS;
    public static final EnumC97613sL DM_TURN_ON_PERMISSION_FRIENDS_V2;
    public static final EnumC97613sL DM_TURN_ON_PERMISSION_MAF;
    public static final EnumC97613sL EmptyTopNoticeView;
    public static final EnumC97613sL FilteredMessageRequestOptIn;
    public static final /* synthetic */ EnumC97613sL[] LJLJI;
    public static final EnumC97613sL PermissionUpdatedNoticeView;
    public static final EnumC97613sL TurnOnMessagePreview;
    public static final EnumC97613sL TurnOnNotificationView;
    public final String LJLIL;
    public final InterfaceC97753sZ LJLILLLLZI;

    public static EnumC97613sL valueOf(String str) {
        return (EnumC97613sL) V0N.LJJJ(EnumC97613sL.class, str);
    }

    public static EnumC97613sL[] values() {
        return (EnumC97613sL[]) LJLJI.clone();
    }

    static {
        C97803se c97803se = C97803se.LIZ;
        EnumC97613sL enumC97613sL = new EnumC97613sL("EmptyTopNoticeView", 0, "empty_item", c97803se);
        EmptyTopNoticeView = enumC97613sL;
        EnumC97613sL enumC97613sL2 = new EnumC97613sL("TurnOnNotificationView", 1, "dm_turn_on_notification_bar", new C97533sD(new C97553sF(R.string.jm), new C97553sF(R.string.jl), new C97553sF(R.string.jk), "dm_push"));
        TurnOnNotificationView = enumC97613sL2;
        EnumC97613sL enumC97613sL3 = new EnumC97613sL("TurnOnMessagePreview", 2, "im_push_preview", new C97533sD(new C97553sF(R.string.g3d), new C97553sF(R.string.g3c), new C97553sF(R.string.g3b), "preview_message"));
        TurnOnMessagePreview = enumC97613sL3;
        EnumC97613sL enumC97613sL4 = new EnumC97613sL("PermissionUpdatedNoticeView", 3, "permission_updated_notice", new C97533sD(new C97553sF(R.string.jgc), new C97553sF(R.string.jgb), C97593sJ.LIZ, "empty"));
        PermissionUpdatedNoticeView = enumC97613sL4;
        EnumC97613sL enumC97613sL5 = new EnumC97613sL("FilteredMessageRequestOptIn", 4, "filtered_request_intro", c97803se);
        FilteredMessageRequestOptIn = enumC97613sL5;
        EnumC97613sL enumC97613sL6 = new EnumC97613sL("DM_TURN_ON_PERMISSION_EVERYONE", 5, "turn_on_permission_everyone", new C97543sE(new C97553sF(R.string.es1), "turn_on_permission_everyone"));
        DM_TURN_ON_PERMISSION_EVERYONE = enumC97613sL6;
        EnumC97613sL enumC97613sL7 = new EnumC97613sL("DM_TURN_ON_PERMISSION_MAF", 6, "turn_on_permission_maf", new C97543sE(new C97553sF(R.string.es1), "turn_on_permission_maf"));
        DM_TURN_ON_PERMISSION_MAF = enumC97613sL7;
        EnumC97613sL enumC97613sL8 = new EnumC97613sL("DM_TURN_ON_PERMISSION_FRIENDS", 7, "turn_on_permission_friends", new C97543sE(new C97553sF(R.string.es1), "turn_on_permission_friends"));
        DM_TURN_ON_PERMISSION_FRIENDS = enumC97613sL8;
        EnumC97613sL enumC97613sL9 = new EnumC97613sL("DM_TURN_ON_PERMISSION_FRIENDS_V2", 8, "turn_on_permission_friends", new C97543sE(new C97553sF(R.string.es5), "turn_on_permission_friends"));
        DM_TURN_ON_PERMISSION_FRIENDS_V2 = enumC97613sL9;
        EnumC97613sL enumC97613sL10 = new EnumC97613sL("DM_TURN_ON_PERMISSION_EVERYONE_CREATOR", 9, "turn_on_permission_creator", new C97543sE(new C97553sF(R.string.ere), "turn_on_permission_friends"));
        DM_TURN_ON_PERMISSION_EVERYONE_CREATOR = enumC97613sL10;
        LJLJI = new EnumC97613sL[]{enumC97613sL, enumC97613sL2, enumC97613sL3, enumC97613sL4, enumC97613sL5, enumC97613sL6, enumC97613sL7, enumC97613sL8, enumC97613sL9, enumC97613sL10};
    }

    public final InterfaceC97753sZ getConfig() {
        return this.LJLILLLLZI;
    }

    public final String getNoticeCode() {
        return this.LJLIL;
    }

    public EnumC97613sL(String str, int i, String str2, InterfaceC97753sZ interfaceC97753sZ) {
        this.LJLIL = str2;
        this.LJLILLLLZI = interfaceC97753sZ;
    }
}
