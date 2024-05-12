package X;

/* renamed from: X.Tqj, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public enum EnumC75909Tqj {
    IDLE,
    INVITING,
    INVITED,
    APPLYING,
    APPLIED,
    INVITING_ME,
    INVITED_ME,
    APPLYING_ME,
    APPLIED_ME,
    CANCELING,
    LINKED,
    LINKED_APPLYING,
    LINKED_APPLYED,
    LINKED_BEAPPLYED;

    public static final C75930Tr4 Companion = new C75930Tr4();

    public static EnumC75909Tqj valueOf(String str) {
        return (EnumC75909Tqj) V0N.LJJJ(EnumC75909Tqj.class, str);
    }

    public final boolean isApplying() {
        if (this == APPLYING || this == APPLIED) {
            return true;
        }
        return false;
    }

    public final boolean isApplyingMe() {
        if (this == APPLYING_ME || this == APPLIED_ME) {
            return true;
        }
        return false;
    }

    public final boolean isInviting() {
        if (this == INVITING || this == INVITED) {
            return true;
        }
        return false;
    }

    public final boolean isInvitingMe() {
        if (this == INVITING_ME || this == INVITED_ME) {
            return true;
        }
        return false;
    }

    public final boolean isLinked() {
        if (this == LINKED) {
            return true;
        }
        return false;
    }
}
