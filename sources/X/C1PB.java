package X;

/* renamed from: X.1PB, reason: invalid class name */
/* loaded from: classes.dex */
public enum C1PB implements InterfaceC09480Yu {
    Active,
    ActiveParent,
    Captured,
    Deactivated,
    DeactivatedParent,
    Inactive;

    public static C1PB valueOf(String str) {
        return (C1PB) V0N.LJJJ(C1PB.class, str);
    }

    public boolean getHasFocus() {
        switch (C09490Yv.LIZ[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 5:
                return true;
            case 4:
            case 6:
                return false;
            default:
                throw new C162476Zf();
        }
    }

    public boolean isCaptured() {
        switch (C09490Yv.LIZ[ordinal()]) {
            case 1:
                return true;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return false;
            default:
                throw new C162476Zf();
        }
    }

    public final boolean isDeactivated() {
        switch (C09490Yv.LIZ[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 6:
                return false;
            case 4:
            case 5:
                return true;
            default:
                throw new C162476Zf();
        }
    }

    @Override // X.InterfaceC09480Yu
    public boolean isFocused() {
        switch (C09490Yv.LIZ[ordinal()]) {
            case 1:
            case 2:
                return true;
            case 3:
            case 4:
            case 5:
            case 6:
                return false;
            default:
                throw new C162476Zf();
        }
    }
}
