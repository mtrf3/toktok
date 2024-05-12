package X;

/* renamed from: X.TyV, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public enum EnumC76391TyV {
    INVITE_MULTI_CO_HOST_USER_LIST_FRAGMENT,
    MULTI_CO_HOST_MANAGER,
    INVITEE_FRAGMENT,
    INVITEE_APPLIED_MULTI_CO_HOST_FRAGMENT,
    TYPE_PK_INVITE,
    TYPE_PK_BE_INVITED,
    TYPE_MATCH_GIFT_SELECT,
    MULTI_LIVE_ANCHOR_SETTING_FRAGMENT,
    MULTI_CO_HOST_SETTING_FRAGMENT,
    INVITEE_MULTI_CO_HOST_FRAGMENT,
    MULTI_MATCH_INVITE,
    MULTI_MATCH_BE_INVITED,
    MULTI_MATCH_MATE_QUIT_REQUEST,
    BE_APPLIED_CO_HOST_FRAGMENT;

    public static EnumC76391TyV valueOf(String str) {
        return (EnumC76391TyV) V0N.LJJJ(EnumC76391TyV.class, str);
    }

    public final boolean isUserListType() {
        if (this == INVITE_MULTI_CO_HOST_USER_LIST_FRAGMENT) {
            return true;
        }
        return false;
    }
}
